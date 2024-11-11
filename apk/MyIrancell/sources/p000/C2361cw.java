package p000;

/* renamed from: cw */
/* loaded from: classes.dex */
public final class C2361cw extends AbstractC3501yv {

    /* renamed from: c */
    private final byte[] f9597c;

    /* renamed from: d */
    private final int f9598d;

    /* renamed from: e */
    private final int f9599e;

    /* renamed from: f */
    private final int f9600f;

    /* renamed from: g */
    private final int f9601g;

    public C2361cw(int i, int i2, int[] iArr) {
        super(i, i2);
        this.f9598d = i;
        this.f9599e = i2;
        this.f9600f = 0;
        this.f9601g = 0;
        this.f9597c = new byte[i * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * i;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i4 + i5;
                int i7 = iArr[i6];
                int i8 = (i7 >> 16) & 255;
                int i9 = (i7 >> 8) & 255;
                int i10 = i7 & 255;
                if (i8 == i9 && i9 == i10) {
                    this.f9597c[i6] = (byte) i8;
                } else {
                    this.f9597c[i6] = (byte) (((i8 + (i9 * 2)) + i10) / 4);
                }
            }
        }
    }

    @Override // p000.AbstractC3501yv
    /* renamed from: a */
    public byte[] mo3447a(int i, byte[] bArr) {
        if (i < 0 || i >= m16665a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        int m16666c = m16666c();
        if (bArr == null || bArr.length < m16666c) {
            bArr = new byte[m16666c];
        }
        System.arraycopy(this.f9597c, ((i + this.f9601g) * this.f9598d) + this.f9600f, bArr, 0, m16666c);
        return bArr;
    }

    @Override // p000.AbstractC3501yv
    /* renamed from: b */
    public byte[] mo3448b() {
        int m16666c = m16666c();
        int m16665a = m16665a();
        if (m16666c == this.f9598d && m16665a == this.f9599e) {
            return this.f9597c;
        }
        int i = m16666c * m16665a;
        byte[] bArr = new byte[i];
        int i2 = this.f9601g;
        int i3 = this.f9598d;
        int i4 = (i2 * i3) + this.f9600f;
        if (m16666c == i3) {
            System.arraycopy(this.f9597c, i4, bArr, 0, i);
            return bArr;
        }
        byte[] bArr2 = this.f9597c;
        for (int i5 = 0; i5 < m16665a; i5++) {
            System.arraycopy(bArr2, i4, bArr, i5 * m16666c, m16666c);
            i4 += this.f9598d;
        }
        return bArr;
    }
}
