package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class xe extends FilterInputStream {
    private volatile byte[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final bc g;

    /* loaded from: classes.dex */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public xe(InputStream inputStream, bc bcVar) {
        this(inputStream, bcVar, 65536);
    }

    xe(InputStream inputStream, bc bcVar, int i) {
        super(inputStream);
        this.e = -1;
        this.g = bcVar;
        this.b = (byte[]) bcVar.b(i, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) {
        int i = this.e;
        if (i != -1) {
            int i2 = this.f - i;
            int i3 = this.d;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.g.b(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.b = bArr2;
                    this.g.a((bc) bArr);
                    bArr = bArr2;
                } else {
                    int i4 = this.e;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                int i5 = this.f - this.e;
                this.f = i5;
                this.e = 0;
                this.c = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f;
                if (read > 0) {
                    i6 += read;
                }
                this.c = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.e = -1;
            this.f = 0;
            this.c = read2;
        }
        return read2;
    }

    private static IOException d() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized void a() {
        this.d = this.b.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.b == null || inputStream == null) {
            d();
            throw null;
        }
        return (this.c - this.f) + inputStream.available();
    }

    public synchronized void c() {
        if (this.b != null) {
            this.g.a((bc) this.b);
            this.b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.b != null) {
            this.g.a((bc) this.b);
            this.b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.d = Math.max(this.d, i);
        this.e = this.f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            d();
            throw null;
        }
        if (this.f >= this.c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.b && (bArr = this.b) == null) {
            d();
            throw null;
        }
        if (this.c - this.f <= 0) {
            return -1;
        }
        int i = this.f;
        this.f = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.b;
        if (bArr2 == null) {
            d();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            d();
            throw null;
        }
        if (this.f < this.c) {
            int i5 = this.c - this.f >= i2 ? i2 : this.c - this.f;
            System.arraycopy(bArr2, this.f, bArr, i, i5);
            this.f += i5;
            if (i5 == i2 || inputStream.available() == 0) {
                return i5;
            }
            i += i5;
            i3 = i2 - i5;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.e == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.b && (bArr2 = this.b) == null) {
                    d();
                    throw null;
                }
                i4 = this.c - this.f >= i3 ? i3 : this.c - this.f;
                System.arraycopy(bArr2, this.f, bArr, i, i4);
                this.f += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.b == null) {
            throw new IOException("Stream is closed");
        }
        if (-1 == this.e) {
            throw new a("Mark has been invalidated, pos: " + this.f + " markLimit: " + this.d);
        }
        this.f = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.b;
        if (bArr == null) {
            d();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            d();
            throw null;
        }
        if (this.c - this.f >= j) {
            this.f = (int) (this.f + j);
            return j;
        }
        long j2 = this.c - this.f;
        this.f = this.c;
        if (this.e == -1 || j > this.d) {
            return j2 + inputStream.skip(j - j2);
        }
        if (a(inputStream, bArr) == -1) {
            return j2;
        }
        if (this.c - this.f >= j - j2) {
            this.f = (int) ((this.f + j) - j2);
            return j;
        }
        long j3 = (j2 + this.c) - this.f;
        this.f = this.c;
        return j3;
    }
}
