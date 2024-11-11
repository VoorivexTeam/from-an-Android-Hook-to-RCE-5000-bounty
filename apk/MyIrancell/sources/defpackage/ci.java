package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class ci extends FilterInputStream {
    private final long b;
    private int c;

    private ci(InputStream inputStream, long j) {
        super(inputStream);
        this.b = j;
    }

    private int a(int i) {
        if (i >= 0) {
            this.c += i;
        } else if (this.b - this.c > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.b + ", but read: " + this.c);
        }
        return i;
    }

    public static InputStream a(InputStream inputStream, long j) {
        return new ci(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.b - this.c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        a(read);
        return read;
    }
}
