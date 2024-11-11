package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: xe */
/* loaded from: classes.dex */
public class C3435xe extends FilterInputStream {

    /* renamed from: b */
    private volatile byte[] f14042b;

    /* renamed from: c */
    private int f14043c;

    /* renamed from: d */
    private int f14044d;

    /* renamed from: e */
    private int f14045e;

    /* renamed from: f */
    private int f14046f;

    /* renamed from: g */
    private final InterfaceC0475bc f14047g;

    /* renamed from: xe$a */
    /* loaded from: classes.dex */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public C3435xe(InputStream inputStream, InterfaceC0475bc interfaceC0475bc) {
        this(inputStream, interfaceC0475bc, 65536);
    }

    C3435xe(InputStream inputStream, InterfaceC0475bc interfaceC0475bc, int i) {
        super(inputStream);
        this.f14045e = -1;
        this.f14047g = interfaceC0475bc;
        this.f14042b = (byte[]) interfaceC0475bc.mo3379b(i, byte[].class);
    }

    /* renamed from: a */
    private int m16487a(InputStream inputStream, byte[] bArr) {
        int i = this.f14045e;
        if (i != -1) {
            int i2 = this.f14046f - i;
            int i3 = this.f14044d;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f14043c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f14047g.mo3379b(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f14042b = bArr2;
                    this.f14047g.mo3378a((InterfaceC0475bc) bArr);
                    bArr = bArr2;
                } else {
                    int i4 = this.f14045e;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                int i5 = this.f14046f - this.f14045e;
                this.f14046f = i5;
                this.f14045e = 0;
                this.f14043c = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f14046f;
                if (read > 0) {
                    i6 += read;
                }
                this.f14043c = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f14045e = -1;
            this.f14046f = 0;
            this.f14043c = read2;
        }
        return read2;
    }

    /* renamed from: d */
    private static IOException m16488d() {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void m16489a() {
        this.f14044d = this.f14042b.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f14042b == null || inputStream == null) {
            m16488d();
            throw null;
        }
        return (this.f14043c - this.f14046f) + inputStream.available();
    }

    /* renamed from: c */
    public synchronized void m16490c() {
        if (this.f14042b != null) {
            this.f14047g.mo3378a((InterfaceC0475bc) this.f14042b);
            this.f14042b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14042b != null) {
            this.f14047g.mo3378a((InterfaceC0475bc) this.f14042b);
            this.f14042b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f14044d = Math.max(this.f14044d, i);
        this.f14045e = this.f14046f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f14042b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m16488d();
            throw null;
        }
        if (this.f14046f >= this.f14043c && m16487a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f14042b && (bArr = this.f14042b) == null) {
            m16488d();
            throw null;
        }
        if (this.f14043c - this.f14046f <= 0) {
            return -1;
        }
        int i = this.f14046f;
        this.f14046f = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f14042b;
        if (bArr2 == null) {
            m16488d();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m16488d();
            throw null;
        }
        if (this.f14046f < this.f14043c) {
            int i5 = this.f14043c - this.f14046f >= i2 ? i2 : this.f14043c - this.f14046f;
            System.arraycopy(bArr2, this.f14046f, bArr, i, i5);
            this.f14046f += i5;
            if (i5 == i2 || inputStream.available() == 0) {
                return i5;
            }
            i += i5;
            i3 = i2 - i5;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f14045e == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (m16487a(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.f14042b && (bArr2 = this.f14042b) == null) {
                    m16488d();
                    throw null;
                }
                i4 = this.f14043c - this.f14046f >= i3 ? i3 : this.f14043c - this.f14046f;
                System.arraycopy(bArr2, this.f14046f, bArr, i, i4);
                this.f14046f += i4;
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
        if (this.f14042b == null) {
            throw new IOException("Stream is closed");
        }
        if (-1 == this.f14045e) {
            throw new a("Mark has been invalidated, pos: " + this.f14046f + " markLimit: " + this.f14044d);
        }
        this.f14046f = this.f14045e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f14042b;
        if (bArr == null) {
            m16488d();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m16488d();
            throw null;
        }
        if (this.f14043c - this.f14046f >= j) {
            this.f14046f = (int) (this.f14046f + j);
            return j;
        }
        long j2 = this.f14043c - this.f14046f;
        this.f14046f = this.f14043c;
        if (this.f14045e == -1 || j > this.f14044d) {
            return j2 + inputStream.skip(j - j2);
        }
        if (m16487a(inputStream, bArr) == -1) {
            return j2;
        }
        if (this.f14043c - this.f14046f >= j - j2) {
            this.f14046f = (int) ((this.f14046f + j) - j2);
            return j;
        }
        long j3 = (j2 + this.f14043c) - this.f14046f;
        this.f14046f = this.f14043c;
        return j3;
    }
}
