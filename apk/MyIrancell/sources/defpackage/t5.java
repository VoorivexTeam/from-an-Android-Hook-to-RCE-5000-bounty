package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public class t5 extends h5<PointF, PointF> {
    private final PointF i;
    private final h5<Float, Float> j;
    private final h5<Float, Float> k;

    public t5(h5<Float, Float> h5Var, h5<Float, Float> h5Var2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = h5Var;
        this.k = h5Var2;
        a(e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.h5
    public PointF a(v9<PointF> v9Var, float f) {
        return this.i;
    }

    @Override // defpackage.h5
    public void a(float f) {
        this.j.a(f);
        this.k.a(f);
        this.i.set(this.j.f().floatValue(), this.k.f().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).b();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.h5
    public PointF f() {
        return a((v9<PointF>) null, 0.0f);
    }
}
