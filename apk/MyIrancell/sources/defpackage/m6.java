package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class m6 implements u6<PointF, PointF> {
    private final List<v9<PointF>> a;

    public m6(List<v9<PointF>> list) {
        this.a = list;
    }

    @Override // defpackage.u6
    public h5<PointF, PointF> a() {
        return this.a.get(0).g() ? new q5(this.a) : new p5(this.a);
    }

    @Override // defpackage.u6
    public List<v9<PointF>> b() {
        return this.a;
    }

    @Override // defpackage.u6
    public boolean c() {
        return this.a.size() == 1 && this.a.get(0).g();
    }
}
