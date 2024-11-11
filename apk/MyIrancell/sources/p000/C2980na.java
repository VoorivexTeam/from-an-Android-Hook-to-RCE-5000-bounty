package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: na */
/* loaded from: classes.dex */
public final class C2980na extends FilterInputStream {

    /* renamed from: d */
    private static final byte[] f12291d;

    /* renamed from: e */
    private static final int f12292e;

    /* renamed from: f */
    private static final int f12293f;

    /* renamed from: b */
    private final byte f12294b;

    /* renamed from: c */
    private int f12295c;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f12291d = bArr;
        int length = bArr.length;
        f12292e = length;
        f12293f = length + 2;
    }

    public C2980na(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f12294b = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i;
        int i2 = this.f12295c;
        int read = (i2 < 2 || i2 > (i = f12293f)) ? super.read() : i2 == i ? this.f12294b : f12291d[i2 - 2] & 255;
        if (read != -1) {
            this.f12295c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f12295c;
        int i5 = f12293f;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f12294b;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f12291d, this.f12295c - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f12295c += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f12295c = (int) (this.f12295c + skip);
        }
        return skip;
    }
}
