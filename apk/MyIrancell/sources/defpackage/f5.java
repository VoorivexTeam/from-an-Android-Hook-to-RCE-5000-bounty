package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;

/* loaded from: classes.dex */
public class f5 extends o4 {
    private final n7 o;
    private final String p;
    private final boolean q;
    private final h5<Integer, Integer> r;
    private h5<ColorFilter, ColorFilter> s;

    public f5(f fVar, n7 n7Var, l7 l7Var) {
        super(fVar, n7Var, l7Var.a().toPaintCap(), l7Var.d().toPaintJoin(), l7Var.f(), l7Var.h(), l7Var.i(), l7Var.e(), l7Var.c());
        this.o = n7Var;
        this.p = l7Var.g();
        this.q = l7Var.j();
        h5<Integer, Integer> a = l7Var.b().a();
        this.r = a;
        a.a(this);
        n7Var.a(this.r);
    }

    @Override // defpackage.q4
    public String a() {
        return this.p;
    }

    @Override // defpackage.o4, defpackage.s4
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.q) {
            return;
        }
        this.i.setColor(((i5) this.r).i());
        h5<ColorFilter, ColorFilter> h5Var = this.s;
        if (h5Var != null) {
            this.i.setColorFilter(h5Var.f());
        }
        super.a(canvas, matrix, i);
    }

    @Override // defpackage.o4, defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        super.a((f5) t, (x9<f5>) x9Var);
        if (t == k.b) {
            this.r.a((x9<Integer>) x9Var);
            return;
        }
        if (t == k.C) {
            if (x9Var == null) {
                this.s = null;
                return;
            }
            w5 w5Var = new w5(x9Var);
            this.s = w5Var;
            w5Var.a(this);
            this.o.a(this.r);
        }
    }
}
