package p000;

/* renamed from: lz */
/* loaded from: classes.dex */
public final class C2915lz extends AbstractC3064oz {
    @Override // p000.AbstractC3064oz
    /* renamed from: a */
    public C2571hz mo13945a(C2571hz c2571hz, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return mo13946a(c2571hz, i, i2, C3145qz.m15155a(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // p000.AbstractC3064oz
    /* renamed from: a */
    public C2571hz mo13946a(C2571hz c2571hz, int i, int i2, C3145qz c3145qz) {
        if (i <= 0 || i2 <= 0) {
            throw C0438aw.m3194a();
        }
        C2571hz c2571hz2 = new C2571hz(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            c3145qz.m15159a(fArr);
            AbstractC3064oz.m14669a(c2571hz, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (c2571hz.m12295b((int) fArr[i6], (int) fArr[i6 + 1])) {
                        c2571hz2.m12298c(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C0438aw.m3194a();
                }
            }
        }
        return c2571hz2;
    }
}
