package defpackage;

import android.graphics.Rect;

/* loaded from: classes.dex */
public class fu extends d {
    static final double c = Math.cos(Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = f;
        double d2 = 1.0d - c;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    public static float b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = f3;
        double d2 = 1.0d - c;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    public final void a(float f) {
        throw null;
    }

    public void a(float f, float f2) {
        throw null;
    }

    public float b() {
        throw null;
    }

    public void b(float f) {
        throw null;
    }

    @Override // defpackage.d, android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        throw null;
    }
}
