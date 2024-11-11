package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: hi */
/* loaded from: classes.dex */
public class C2554hi extends FilterInputStream {

    /* renamed from: b */
    private int f10487b;

    public C2554hi(InputStream inputStream) {
        super(inputStream);
        this.f10487b = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    private long m12221a(long j) {
        int i = this.f10487b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* renamed from: b */
    private void m12222b(long j) {
        int i = this.f10487b;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f10487b = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i = this.f10487b;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f10487b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (m12221a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m12222b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int m12221a = (int) m12221a(i2);
        if (m12221a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, m12221a);
        m12222b(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f10487b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long m12221a = m12221a(j);
        if (m12221a == -1) {
            return 0L;
        }
        long skip = super.skip(m12221a);
        m12222b(skip);
        return skip;
    }
}
