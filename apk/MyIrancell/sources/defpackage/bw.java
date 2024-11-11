package defpackage;

/* loaded from: classes.dex */
public final class bw extends yv {
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public bw(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        if (z) {
            a(i5, i6);
        }
    }

    private void a(int i, int i2) {
        byte[] bArr = this.c;
        int i3 = (this.g * this.d) + this.f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.d;
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

    public int f() {
        return a() / 2;
    }

    public int g() {
        return c() / 2;
    }

    public int[] h() {
        int c = c() / 2;
        int a = a() / 2;
        int[] iArr = new int[c * a];
        byte[] bArr = this.c;
        int i = (this.g * this.d) + this.f;
        for (int i2 = 0; i2 < a; i2++) {
            int i3 = i2 * c;
            for (int i4 = 0; i4 < c; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 * 2) + i] & 255) * 65793) | (-16777216);
            }
            i += this.d * 2;
        }
        return iArr;
    }
}
