package defpackage;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class ja extends OutputStream {
    private final OutputStream b;
    private byte[] c;
    private bc d;
    private int e;

    public ja(OutputStream outputStream, bc bcVar) {
        this(outputStream, bcVar, 65536);
    }

    ja(OutputStream outputStream, bc bcVar, int i) {
        this.b = outputStream;
        this.d = bcVar;
        this.c = (byte[]) bcVar.b(i, byte[].class);
    }

    private void a() {
        int i = this.e;
        if (i > 0) {
            this.b.write(this.c, 0, i);
            this.e = 0;
        }
    }

    private void c() {
        if (this.e == this.c.length) {
            a();
        }
    }

    private void d() {
        byte[] bArr = this.c;
        if (bArr != null) {
            this.d.a((bc) bArr);
            this.c = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.b.close();
            d();
        } catch (Throwable th) {
            this.b.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.c;
        int i2 = this.e;
        this.e = i2 + 1;
        bArr[i2] = (byte) i;
        c();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.e == 0 && i4 >= this.c.length) {
                this.b.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.c.length - this.e);
            System.arraycopy(bArr, i5, this.c, this.e, min);
            this.e += min;
            i3 += min;
            c();
        } while (i3 < i2);
    }
}
