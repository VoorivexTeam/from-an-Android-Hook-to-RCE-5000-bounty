package ir.tapsell.sdk.utils;

import android.content.res.Resources;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class l {
    public static float a(Resources resources, float f) {
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }

    public static float b(Resources resources, float f) {
        return f * resources.getDisplayMetrics().scaledDensity;
    }

    public static float c(Resources resources, float f) {
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
