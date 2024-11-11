package p000;

/* renamed from: sz */
/* loaded from: classes.dex */
public final class C3228sz {
    /* renamed from: a */
    public static float m15459a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    /* renamed from: a */
    public static float m15460a(int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        return (float) Math.sqrt((i5 * i5) + (i6 * i6));
    }

    /* renamed from: a */
    public static int m15461a(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }
}
