package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class ht {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new m3();
    public static final TimeInterpolator c = new l3();
    public static final TimeInterpolator d = new n3();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int a(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
