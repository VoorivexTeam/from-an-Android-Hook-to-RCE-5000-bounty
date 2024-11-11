package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import defpackage.h5;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class v4 implements s4, h5.b, y4 {
    private final String a;
    private final boolean b;
    private final n7 c;
    private final f0<LinearGradient> d = new f0<>();
    private final f0<RadialGradient> e = new f0<>();
    private final Path f = new Path();
    private final Paint g = new n4(1);
    private final RectF h = new RectF();
    private final List<a5> i = new ArrayList();
    private final b7 j;
    private final h5<y6, y6> k;
    private final h5<Integer, Integer> l;
    private final h5<PointF, PointF> m;
    private final h5<PointF, PointF> n;
    private h5<ColorFilter, ColorFilter> o;
    private w5 p;
    private final f q;
    private final int r;

    public v4(f fVar, n7 n7Var, z6 z6Var) {
        this.c = n7Var;
        this.a = z6Var.e();
        this.b = z6Var.h();
        this.q = fVar;
        this.j = z6Var.d();
        this.f.setFillType(z6Var.b());
        this.r = (int) (fVar.e().c() / 32.0f);
        h5<y6, y6> a = z6Var.c().a();
        this.k = a;
        a.a(this);
        n7Var.a(this.k);
        h5<Integer, Integer> a2 = z6Var.f().a();
        this.l = a2;
        a2.a(this);
        n7Var.a(this.l);
        h5<PointF, PointF> a3 = z6Var.g().a();
        this.m = a3;
        a3.a(this);
        n7Var.a(this.m);
        h5<PointF, PointF> a4 = z6Var.a().a();
        this.n = a4;
        a4.a(this);
        n7Var.a(this.n);
    }

    private int[] a(int[] iArr) {
        w5 w5Var = this.p;
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
        int round = Math.round(this.m.e() * this.r);
        int round2 = Math.round(this.n.e() * this.r);
        int round3 = Math.round(this.k.e() * this.r);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient e() {
        long d = d();
        LinearGradient c = this.d.c(d);
        if (c != null) {
            return c;
        }
        PointF f = this.m.f();
        PointF f2 = this.n.f();
        y6 f3 = this.k.f();
        LinearGradient linearGradient = new LinearGradient(f.x, f.y, f2.x, f2.y, a(f3.a()), f3.b(), Shader.TileMode.CLAMP);
        this.d.c(d, linearGradient);
        return linearGradient;
    }

    private RadialGradient f() {
        long d = d();
        RadialGradient c = this.e.c(d);
        if (c != null) {
            return c;
        }
        PointF f = this.m.f();
        PointF f2 = this.n.f();
        y6 f3 = this.k.f();
        int[] a = a(f3.a());
        float[] b = f3.b();
        float f4 = f.x;
        float f5 = f.y;
        float hypot = (float) Math.hypot(f2.x - f4, f2.y - f5);
        RadialGradient radialGradient = new RadialGradient(f4, f5, hypot <= 0.0f ? 0.001f : hypot, a, b, Shader.TileMode.CLAMP);
        this.e.c(d, radialGradient);
        return radialGradient;
    }

    @Override // defpackage.q4
    public String a() {
        return this.a;
    }

    @Override // defpackage.s4
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.b) {
            return;
        }
        c.a("GradientFillContent#draw");
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(this.i.get(i2).c(), matrix);
        }
        this.f.computeBounds(this.h, false);
        Shader e = this.j == b7.LINEAR ? e() : f();
        e.setLocalMatrix(matrix);
        this.g.setShader(e);
        h5<ColorFilter, ColorFilter> h5Var = this.o;
        if (h5Var != null) {
            this.g.setColorFilter(h5Var.f());
        }
        this.g.setAlpha(t9.a((int) ((((i / 255.0f) * this.l.f().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        c.b("GradientFillContent#draw");
    }

    @Override // defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(this.i.get(i).c(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.e6
    public void a(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        t9.a(d6Var, i, list, d6Var2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        n7 n7Var;
        h5<?, ?> h5Var;
        if (t == k.d) {
            this.l.a((x9<Integer>) x9Var);
            return;
        }
        if (t == k.C) {
            if (x9Var == null) {
                this.o = null;
                return;
            }
            w5 w5Var = new w5(x9Var);
            this.o = w5Var;
            w5Var.a(this);
            n7Var = this.c;
            h5Var = this.o;
        } else {
            if (t != k.D) {
                return;
            }
            if (x9Var == null) {
                w5 w5Var2 = this.p;
                if (w5Var2 != null) {
                    this.c.b(w5Var2);
                }
                this.p = null;
                return;
            }
            w5 w5Var3 = new w5(x9Var);
            this.p = w5Var3;
            w5Var3.a(this);
            n7Var = this.c;
            h5Var = this.p;
        }
        n7Var.a(h5Var);
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        for (int i = 0; i < list2.size(); i++) {
            q4 q4Var = list2.get(i);
            if (q4Var instanceof a5) {
                this.i.add((a5) q4Var);
            }
        }
    }

    @Override // h5.b
    public void b() {
        this.q.invalidateSelf();
    }
}
