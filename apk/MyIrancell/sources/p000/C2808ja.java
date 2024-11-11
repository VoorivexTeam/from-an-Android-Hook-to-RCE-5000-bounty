package p000;

import java.io.OutputStream;

/* renamed from: ja */
/* loaded from: classes.dex */
public final class C2808ja extends OutputStream {

    /* renamed from: b */
    private final OutputStream f11494b;

    /* renamed from: c */
    private byte[] f11495c;

    /* renamed from: d */
    private InterfaceC0475bc f11496d;

    /* renamed from: e */
    private int f11497e;

    public C2808ja(OutputStream outputStream, InterfaceC0475bc interfaceC0475bc) {
        this(outputStream, interfaceC0475bc, 65536);
    }

    C2808ja(OutputStream outputStream, InterfaceC0475bc interfaceC0475bc, int i) {
        this.f11494b = outputStream;
        this.f11496d = interfaceC0475bc;
        this.f11495c = (byte[]) interfaceC0475bc.mo3379b(i, byte[].class);
    }

    /* renamed from: a */
    private void m13432a() {
        int i = this.f11497e;
        if (i > 0) {
            this.f11494b.write(this.f11495c, 0, i);
            this.f11497e = 0;
        }
    }

    /* renamed from: c */
    private void m13433c() {
        if (this.f11497e == this.f11495c.length) {
            m13432a();
        }
    }

    /* renamed from: d */
    private void m13434d() {
        byte[] bArr = this.f11495c;
        if (bArr != null) {
            this.f11496d.mo3378a((InterfaceC0475bc) bArr);
            this.f11495c = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f11494b.close();
            m13434d();
        } catch (Throwable th) {
            this.f11494b.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        m13432a();
        this.f11494b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.f11495c;
        int i2 = this.f11497e;
        this.f11497e = i2 + 1;
        bArr[i2] = (byte) i;
        m13433c();
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
            if (this.f11497e == 0 && i4 >= this.f11495c.length) {
                this.f11494b.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.f11495c.length - this.f11497e);
            System.arraycopy(bArr, i5, this.f11495c, this.f11497e, min);
            this.f11497e += min;
            i3 += min;
            m13433c();
        } while (i3 < i2);
    }
}
