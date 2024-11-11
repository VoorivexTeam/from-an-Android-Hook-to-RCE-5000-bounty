package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class q6 implements u6<PointF, PointF> {
    private final j6 a;
    private final j6 b;

    public q6(j6 j6Var, j6 j6Var2) {
        this.a = j6Var;
        this.b = j6Var2;
    }

    @Override // defpackage.u6
    public h5<PointF, PointF> a() {
        return new t5(this.a.a(), this.b.a());
    }

    @Override // defpackage.u6
    public List<v9<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.u6
    public boolean c() {
        return this.a.c() && this.b.c();
    }
}
