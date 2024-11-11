package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class q5 extends m5<PointF> {
    private final PointF i;

    public q5(List<v9<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // defpackage.h5
    public PointF a(v9<PointF> v9Var, float f) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = v9Var.b;
        if (pointF3 == null || (pointF = v9Var.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        x9<A> x9Var = this.e;
        if (x9Var != 0 && (pointF2 = (PointF) x9Var.a(v9Var.e, v9Var.f.floatValue(), pointF4, pointF5, f, d(), e())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.i;
        float f2 = pointF4.x;
        float f3 = f2 + ((pointF5.x - f2) * f);
        float f4 = pointF4.y;
        pointF6.set(f3, f4 + (f * (pointF5.y - f4)));
        return this.i;
    }

    @Override // defpackage.h5
    public /* bridge */ /* synthetic */ Object a(v9 v9Var, float f) {
        return a((v9<PointF>) v9Var, f);
    }
}
