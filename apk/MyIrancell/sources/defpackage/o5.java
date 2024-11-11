package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.d;

/* loaded from: classes.dex */
public class o5 extends v9<PointF> {
    private Path o;
    private final v9<PointF> p;

    public o5(d dVar, v9<PointF> v9Var) {
        super(dVar, v9Var.b, v9Var.c, v9Var.d, v9Var.e, v9Var.f);
        this.p = v9Var;
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h() {
        T t;
        T t2 = this.c;
        boolean z = (t2 == 0 || (t = this.b) == 0 || !((PointF) t).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.c;
        if (t3 == 0 || z) {
            return;
        }
        v9<PointF> v9Var = this.p;
        this.o = u9.a((PointF) this.b, (PointF) t3, v9Var.m, v9Var.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path i() {
        return this.o;
    }
}
