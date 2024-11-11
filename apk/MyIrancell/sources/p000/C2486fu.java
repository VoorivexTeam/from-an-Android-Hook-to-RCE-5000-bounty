package p000;

import android.graphics.Rect;

/* renamed from: fu */
/* loaded from: classes.dex */
public class C2486fu extends C2365d {

    /* renamed from: c */
    static final double f10151c = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m11829a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = f;
        double d2 = 1.0d - f10151c;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* renamed from: b */
    public static float m11830b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = f3;
        double d2 = 1.0d - f10151c;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* renamed from: a */
    public final void m11831a(float f) {
        throw null;
    }

    /* renamed from: a */
    public void m11832a(float f, float f2) {
        throw null;
    }

    /* renamed from: b */
    public float m11833b() {
        throw null;
    }

    /* renamed from: b */
    public void m11834b(float f) {
        throw null;
    }

    @Override // p000.C2365d, android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        throw null;
    }
}
