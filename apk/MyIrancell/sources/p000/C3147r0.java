package p000;

import android.graphics.Color;

/* renamed from: r0 */
/* loaded from: classes.dex */
public final class C3147r0 {
    static {
        new ThreadLocal();
    }

    /* renamed from: a */
    private static int m15160a(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: a */
    private static int m15161a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: b */
    public static int m15162b(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int m15160a = m15160a(alpha2, alpha);
        return Color.argb(m15160a, m15161a(Color.red(i), alpha2, Color.red(i2), alpha, m15160a), m15161a(Color.green(i), alpha2, Color.green(i2), alpha, m15160a), m15161a(Color.blue(i), alpha2, Color.blue(i2), alpha, m15160a));
    }

    /* renamed from: c */
    public static int m15163c(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
