package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;

/* loaded from: classes.dex */
public class w4 extends o4 {
    private final String o;
    private final boolean p;
    private final f0<LinearGradient> q;
    private final f0<RadialGradient> r;
    private final RectF s;
    private final b7 t;
    private final int u;
    private final h5<y6, y6> v;
    private final h5<PointF, PointF> w;
    private final h5<PointF, PointF> x;
    private w5 y;

    public w4(f fVar, n7 n7Var, a7 a7Var) {
        super(fVar, n7Var, a7Var.a().toPaintCap(), a7Var.f().toPaintJoin(), a7Var.h(), a7Var.j(), a7Var.l(), a7Var.g(), a7Var.b());
        this.q = new f0<>();
        this.r = new f0<>();
        this.s = new RectF();
        this.o = a7Var.i();
        this.t = a7Var.e();
        this.p = a7Var.m();
        this.u = (int) (fVar.e().c() / 32.0f);
        h5<y6, y6> a = a7Var.d().a();
        this.v = a;
        a.a(this);
        n7Var.a(this.v);
        h5<PointF, PointF> a2 = a7Var.k().a();
        this.w = a2;
        a2.a(this);
        n7Var.a(this.w);
        h5<PointF, PointF> a3 = a7Var.c().a();
        this.x = a3;
        a3.a(this);
        n7Var.a(this.x);
    }

    private int[] a(int[] iArr) {
        w5 w5Var = this.y;
        if (w5Var != null) {
            Integer[] numArr = (Integer[]) w5Var.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int d() {
        int round = Math.round(this.w.e() * this.u);
        int round2 = Math.round(this.x.e() * this.u);
        int round3 = Math.round(this.v.e() * this.u);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient e() {
        long d = d();
        LinearGradient c = this.q.c(d);
        if (c != null) {
            return c;
        }
        PointF f = this.w.f();
        PointF f2 = this.x.f();
        y6 f3 = this.v.f();
        LinearGradient linearGradient = new LinearGradient(f.x, f.y, f2.x, f2.y, a(f3.a()), f3.b(), Shader.TileMode.CLAMP);
        this.q.c(d, linearGradient);
        return linearGradient;
    }

    private RadialGradient f() {
        long d = d();
        RadialGradient c = this.r.c(d);
        if (c != null) {
            return c;
        }
        PointF f = this.w.f();
        PointF f2 = this.x.f();
        y6 f3 = this.v.f();
        int[] a = a(f3.a());
        float[] b = f3.b();
        RadialGradient radialGradient = new RadialGradient(f.x, f.y, (float) Math.hypot(f2.x - r7, f2.y - r8), a, b, Shader.TileMode.CLAMP);
        this.r.c(d, radialGradient);
        return radialGradient;
    }

    @Override // defpackage.q4
    public String a() {
        return this.o;
    }

    @Override // defpackage.o4, defpackage.s4
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.p) {
            return;
        }
        a(this.s, matrix, false);
        Shader e = this.t == b7.LINEAR ? e() : f();
        e.setLocalMatrix(matrix);
        this.i.setShader(e);
        super.a(canvas, matrix, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o4, defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        super.a((w4) t, (x9<w4>) x9Var);
        if (t == k.D) {
            if (x9Var == null) {
                w5 w5Var = this.y;
                if (w5Var != null) {
                    this.f.b(w5Var);
                }
                this.y = null;
                return;
            }
            w5 w5Var2 = new w5(x9Var);
            this.y = w5Var2;
            w5Var2.a(this);
            this.f.a(this.y);
        }
    }
}
