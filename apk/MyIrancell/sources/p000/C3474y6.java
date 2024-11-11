package p000;

/* renamed from: y6 */
/* loaded from: classes.dex */
public class C3474y6 {

    /* renamed from: a */
    private final float[] f14106a;

    /* renamed from: b */
    private final int[] f14107b;

    public C3474y6(float[] fArr, int[] iArr) {
        this.f14106a = fArr;
        this.f14107b = iArr;
    }

    /* renamed from: a */
    public void m16582a(C3474y6 c3474y6, C3474y6 c3474y62, float f) {
        if (c3474y6.f14107b.length == c3474y62.f14107b.length) {
            for (int i = 0; i < c3474y6.f14107b.length; i++) {
                this.f14106a[i] = C3243t9.m15581c(c3474y6.f14106a[i], c3474y62.f14106a[i], f);
                this.f14107b[i] = C3021o9.m14477a(f, c3474y6.f14107b[i], c3474y62.f14107b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c3474y6.f14107b.length + " vs " + c3474y62.f14107b.length + ")");
    }

    /* renamed from: a */
    public int[] m16583a() {
        return this.f14107b;
    }

    /* renamed from: b */
    public float[] m16584b() {
        return this.f14106a;
    }

    /* renamed from: c */
    public int m16585c() {
        return this.f14107b.length;
    }
}
