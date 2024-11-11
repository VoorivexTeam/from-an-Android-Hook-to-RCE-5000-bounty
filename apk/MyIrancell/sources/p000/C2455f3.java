package p000;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: f3 */
/* loaded from: classes.dex */
public final class C2455f3 {
    /* renamed from: a */
    public static Interpolator m11672a(float f, float f2, float f3, float f4) {
        return Build.VERSION.SDK_INT >= 21 ? new PathInterpolator(f, f2, f3, f4) : new InterpolatorC2415e3(f, f2, f3, f4);
    }
}
