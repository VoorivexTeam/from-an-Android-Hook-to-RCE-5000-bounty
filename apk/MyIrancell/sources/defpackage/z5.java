package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class z5 {
    private final PointF a;
    private final PointF b;
    private final PointF c;

    public z5() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public z5(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }

    public PointF a() {
        return this.a;
    }

    public void a(float f, float f2) {
        this.a.set(f, f2);
    }

    public PointF b() {
        return this.b;
    }

    public void b(float f, float f2) {
        this.b.set(f, f2);
    }

    public PointF c() {
        return this.c;
    }

    public void c(float f, float f2) {
        this.c.set(f, f2);
    }
}
