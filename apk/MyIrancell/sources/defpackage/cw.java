package defpackage;

/* loaded from: classes.dex */
public final class cw extends yv {
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public cw(int i, int i2, int[] iArr) {
        super(i, i2);
        this.d = i;
        this.e = i2;
        this.f = 0;
        this.g = 0;
        this.c = new byte[i * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * i;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i4 + i5;
                int i7 = iArr[i6];
                int i8 = (i7 >> 16) & 255;
                int i9 = (i7 >> 8) & 255;
                int i10 = i7 & 255;
                if (i8 == i9 && i9 == i10) {
                    this.c[i6] = (byte) i8;
                } else {
                    this.c[i6] = (byte) (((i8 + (i9 * 2)) + i10) / 4);
                }
            }
        }
    }

    @Override // defpackage.yv
    public byte[] a(int i, byte[] bArr) {
        if (i < 0 || i >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        int c = c();
        if (bArr == null || bArr.length < c) {
            bArr = new byte[c];
        }
        System.arraycopy(this.c, ((i + this.g) * this.d) + this.f, bArr, 0, c);
        return bArr;
    }

    @Override // defpackage.yv
    public byte[] b() {
        int c = c();
        int a = a();
        if (c == this.d && a == this.e) {
            return this.c;
        }
        int i = c * a;
        byte[] bArr = new byte[i];
        int i2 = this.g;
        int i3 = this.d;
        int i4 = (i2 * i3) + this.f;
        if (c == i3) {
            System.arraycopy(this.c, i4, bArr, 0, i);
            return bArr;
        }
        byte[] bArr2 = this.c;
        for (int i5 = 0; i5 < a; i5++) {
            System.arraycopy(bArr2, i4, bArr, i5 * c, c);
            i4 += this.d;
        }
        return bArr;
    }
}
