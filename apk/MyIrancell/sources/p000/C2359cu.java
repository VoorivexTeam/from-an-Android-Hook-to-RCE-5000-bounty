package p000;

/* renamed from: cu */
/* loaded from: classes.dex */
public final class C2359cu {
    /* renamed from: a */
    public static float m11211a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: a */
    public static float m11212a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: a */
    public static float m11213a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m11214b(m11212a(f, f2, f3, f4), m11212a(f, f2, f5, f4), m11212a(f, f2, f5, f6), m11212a(f, f2, f3, f6));
    }

    /* renamed from: b */
    private static float m11214b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
