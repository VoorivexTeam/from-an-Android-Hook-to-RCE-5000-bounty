package p000;

/* renamed from: bw */
/* loaded from: classes.dex */
public final class C0495bw extends AbstractC3501yv {

    /* renamed from: c */
    private final byte[] f2823c;

    /* renamed from: d */
    private final int f2824d;

    /* renamed from: e */
    private final int f2825e;

    /* renamed from: f */
    private final int f2826f;

    /* renamed from: g */
    private final int f2827g;

    public C0495bw(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f2823c = bArr;
        this.f2824d = i;
        this.f2825e = i2;
        this.f2826f = i3;
        this.f2827g = i4;
        if (z) {
            m3446a(i5, i6);
        }
    }

    /* renamed from: a */
    private void m3446a(int i, int i2) {
        byte[] bArr = this.f2823c;
        int i3 = (this.f2827g * this.f2824d) + this.f2826f;
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
            i3 += this.f2824d;
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
        System.arraycopy(this.f2823c, ((i + this.f2827g) * this.f2824d) + this.f2826f, bArr, 0, m16666c);
        return bArr;
    }

    @Override // p000.AbstractC3501yv
    /* renamed from: b */
    public byte[] mo3448b() {
        int m16666c = m16666c();
        int m16665a = m16665a();
        if (m16666c == this.f2824d && m16665a == this.f2825e) {
            return this.f2823c;
        }
        int i = m16666c * m16665a;
        byte[] bArr = new byte[i];
        int i2 = this.f2827g;
        int i3 = this.f2824d;
        int i4 = (i2 * i3) + this.f2826f;
        if (m16666c == i3) {
            System.arraycopy(this.f2823c, i4, bArr, 0, i);
            return bArr;
        }
        byte[] bArr2 = this.f2823c;
        for (int i5 = 0; i5 < m16665a; i5++) {
            System.arraycopy(bArr2, i4, bArr, i5 * m16666c, m16666c);
            i4 += this.f2824d;
        }
        return bArr;
    }

    /* renamed from: f */
    public int m3449f() {
        return m16665a() / 2;
    }

    /* renamed from: g */
    public int m3450g() {
        return m16666c() / 2;
    }

    /* renamed from: h */
    public int[] m3451h() {
        int m16666c = m16666c() / 2;
        int m16665a = m16665a() / 2;
        int[] iArr = new int[m16666c * m16665a];
        byte[] bArr = this.f2823c;
        int i = (this.f2827g * this.f2824d) + this.f2826f;
        for (int i2 = 0; i2 < m16665a; i2++) {
            int i3 = i2 * m16666c;
            for (int i4 = 0; i4 < m16666c; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 * 2) + i] & 255) * 65793) | (-16777216);
            }
            i += this.f2824d * 2;
        }
        return iArr;
    }
}
