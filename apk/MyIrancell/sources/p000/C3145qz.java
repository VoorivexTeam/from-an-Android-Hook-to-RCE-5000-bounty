package p000;

/* renamed from: qz */
/* loaded from: classes.dex */
public final class C3145qz {

    /* renamed from: a */
    private final float f12848a;

    /* renamed from: b */
    private final float f12849b;

    /* renamed from: c */
    private final float f12850c;

    /* renamed from: d */
    private final float f12851d;

    /* renamed from: e */
    private final float f12852e;

    /* renamed from: f */
    private final float f12853f;

    /* renamed from: g */
    private final float f12854g;

    /* renamed from: h */
    private final float f12855h;

    /* renamed from: i */
    private final float f12856i;

    private C3145qz(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f12848a = f;
        this.f12849b = f4;
        this.f12850c = f7;
        this.f12851d = f2;
        this.f12852e = f5;
        this.f12853f = f8;
        this.f12854g = f3;
        this.f12855h = f6;
        this.f12856i = f9;
    }

    /* renamed from: a */
    public static C3145qz m15154a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m15156b(f, f2, f3, f4, f5, f6, f7, f8).m15157a();
    }

    /* renamed from: a */
    public static C3145qz m15155a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m15156b(f9, f10, f11, f12, f13, f14, f15, f16).m15158a(m15154a(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: b */
    public static C3145qz m15156b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C3145qz(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C3145qz((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    C3145qz m15157a() {
        float f = this.f12852e;
        float f2 = this.f12856i;
        float f3 = this.f12853f;
        float f4 = this.f12855h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f12854g;
        float f7 = this.f12851d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f12850c;
        float f11 = this.f12849b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f12848a;
        return new C3145qz(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* renamed from: a */
    C3145qz m15158a(C3145qz c3145qz) {
        float f = this.f12848a;
        float f2 = c3145qz.f12848a;
        float f3 = this.f12851d;
        float f4 = c3145qz.f12849b;
        float f5 = this.f12854g;
        float f6 = c3145qz.f12850c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = c3145qz.f12851d;
        float f9 = c3145qz.f12852e;
        float f10 = c3145qz.f12853f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = c3145qz.f12854g;
        float f13 = c3145qz.f12855h;
        float f14 = c3145qz.f12856i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f12849b;
        float f17 = this.f12852e;
        float f18 = this.f12855h;
        float f19 = (f16 * f2) + (f17 * f4) + (f18 * f6);
        float f20 = (f16 * f8) + (f17 * f9) + (f18 * f10);
        float f21 = (f18 * f14) + (f16 * f12) + (f17 * f13);
        float f22 = this.f12850c;
        float f23 = this.f12853f;
        float f24 = (f2 * f22) + (f4 * f23);
        float f25 = this.f12856i;
        return new C3145qz(f7, f11, f15, f19, f20, f21, (f6 * f25) + f24, (f8 * f22) + (f9 * f23) + (f10 * f25), (f22 * f12) + (f23 * f13) + (f25 * f14));
    }

    /* renamed from: a */
    public void m15159a(float[] fArr) {
        int length = fArr.length;
        float f = this.f12848a;
        float f2 = this.f12849b;
        float f3 = this.f12850c;
        float f4 = this.f12851d;
        float f5 = this.f12852e;
        float f6 = this.f12853f;
        float f7 = this.f12854g;
        float f8 = this.f12855h;
        float f9 = this.f12856i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
