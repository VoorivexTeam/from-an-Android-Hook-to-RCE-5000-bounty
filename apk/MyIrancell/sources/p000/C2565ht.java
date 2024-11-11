package p000;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: ht */
/* loaded from: classes.dex */
public class C2565ht {

    /* renamed from: a */
    public static final TimeInterpolator f10509a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f10510b = new C2920m3();

    /* renamed from: c */
    public static final TimeInterpolator f10511c = new C2883l3();

    /* renamed from: d */
    public static final TimeInterpolator f10512d = new C2966n3();

    /* renamed from: e */
    public static final TimeInterpolator f10513e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m12243a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m12244a(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
