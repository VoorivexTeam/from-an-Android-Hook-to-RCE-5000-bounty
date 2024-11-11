package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ci */
/* loaded from: classes.dex */
public final class C0523ci extends FilterInputStream {

    /* renamed from: b */
    private final long f3015b;

    /* renamed from: c */
    private int f3016c;

    private C0523ci(InputStream inputStream, long j) {
        super(inputStream);
        this.f3015b = j;
    }

    /* renamed from: a */
    private int m3680a(int i) {
        if (i >= 0) {
            this.f3016c += i;
        } else if (this.f3015b - this.f3016c > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f3015b + ", but read: " + this.f3016c);
        }
        return i;
    }

    /* renamed from: a */
    public static InputStream m3681a(InputStream inputStream, long j) {
        return new C0523ci(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f3015b - this.f3016c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        m3680a(read >= 0 ? 1 : -1);
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
        m3680a(read);
        return read;
    }
}
