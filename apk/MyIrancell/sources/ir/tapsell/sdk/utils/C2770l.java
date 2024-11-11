package ir.tapsell.sdk.utils;

import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: ir.tapsell.sdk.utils.l */
/* loaded from: classes.dex */
public class C2770l {
    /* renamed from: a */
    public static float m13173a(Resources resources, float f) {
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    public static float m13174b(Resources resources, float f) {
        return f * resources.getDisplayMetrics().scaledDensity;
    }

    /* renamed from: c */
    public static float m13175c(Resources resources, float f) {
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
