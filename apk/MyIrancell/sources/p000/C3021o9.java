package p000;

/* renamed from: o9 */
/* loaded from: classes.dex */
public class C3021o9 {
    /* renamed from: a */
    private static float m14476a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: a */
    public static int m14477a(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float m14476a = m14476a(((i >> 16) & 255) / 255.0f);
        float m14476a2 = m14476a(((i >> 8) & 255) / 255.0f);
        float m14476a3 = m14476a((i & 255) / 255.0f);
        float m14476a4 = m14476a(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float m14476a5 = m14476a2 + ((m14476a(((i2 >> 8) & 255) / 255.0f) - m14476a2) * f);
        float m14476a6 = m14476a3 + (f * (m14476a((i2 & 255) / 255.0f) - m14476a3));
        return (Math.round(m14478b(m14476a + ((m14476a4 - m14476a) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(m14478b(m14476a5) * 255.0f) << 8) | Math.round(m14478b(m14476a6) * 255.0f);
    }

    /* renamed from: b */
    private static float m14478b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
