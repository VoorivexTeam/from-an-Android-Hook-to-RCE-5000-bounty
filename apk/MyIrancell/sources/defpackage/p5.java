package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class p5 extends m5<PointF> {
    private final PointF i;
    private final float[] j;
    private o5 k;
    private PathMeasure l;

    public p5(List<? extends v9<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h5
    public PointF a(v9<PointF> v9Var, float f) {
        PointF pointF;
        o5 o5Var = (o5) v9Var;
        Path i = o5Var.i();
        if (i == null) {
            return v9Var.b;
        }
        x9<A> x9Var = this.e;
        if (x9Var != 0 && (pointF = (PointF) x9Var.a(o5Var.e, o5Var.f.floatValue(), o5Var.b, o5Var.c, d(), f, e())) != null) {
            return pointF;
        }
        if (this.k != o5Var) {
            this.l.setPath(i, false);
            this.k = o5Var;
        }
        PathMeasure pathMeasure = this.l;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.j, null);
        PointF pointF2 = this.i;
        float[] fArr = this.j;
        pointF2.set(fArr[0], fArr[1]);
        return this.i;
    }

    @Override // defpackage.h5
    public /* bridge */ /* synthetic */ Object a(v9 v9Var, float f) {
        return a((v9<PointF>) v9Var, f);
    }
}
