package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import defpackage.h5;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class u4 implements s4, h5.b, y4 {
    private final n7 c;
    private final String d;
    private final boolean e;
    private final h5<Integer, Integer> g;
    private final h5<Integer, Integer> h;
    private h5<ColorFilter, ColorFilter> i;
    private final f j;
    private final Path a = new Path();
    private final Paint b = new n4(1);
    private final List<a5> f = new ArrayList();

    public u4(f fVar, n7 n7Var, i7 i7Var) {
        this.c = n7Var;
        this.d = i7Var.c();
        this.e = i7Var.e();
        this.j = fVar;
        if (i7Var.a() == null || i7Var.d() == null) {
            this.g = null;
            this.h = null;
            return;
        }
        this.a.setFillType(i7Var.b());
        h5<Integer, Integer> a = i7Var.a().a();
        this.g = a;
        a.a(this);
        n7Var.a(this.g);
        h5<Integer, Integer> a2 = i7Var.d().a();
        this.h = a2;
        a2.a(this);
        n7Var.a(this.h);
    }

    @Override // defpackage.q4
    public String a() {
        return this.d;
    }

    @Override // defpackage.s4
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        c.a("FillContent#draw");
        this.b.setColor(((i5) this.g).i());
        this.b.setAlpha(t9.a((int) ((((i / 255.0f) * this.h.f().intValue()) / 100.0f) * 255.0f), 0, 255));
        h5<ColorFilter, ColorFilter> h5Var = this.i;
        if (h5Var != null) {
            this.b.setColorFilter(h5Var.f());
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(this.f.get(i2).c(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        c.b("FillContent#draw");
    }

    @Override // defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(this.f.get(i).c(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.e6
    public void a(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        t9.a(d6Var, i, list, d6Var2, this);
    }

    @Override // defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        h5<Integer, Integer> h5Var;
        if (t == k.a) {
            h5Var = this.g;
        } else {
            if (t != k.d) {
                if (t == k.C) {
                    if (x9Var == null) {
                        this.i = null;
                        return;
                    }
                    w5 w5Var = new w5(x9Var);
                    this.i = w5Var;
                    w5Var.a(this);
                    this.c.a(this.i);
                    return;
                }
                return;
            }
            h5Var = this.h;
        }
        h5Var.a((x9<Integer>) x9Var);
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        for (int i = 0; i < list2.size(); i++) {
            q4 q4Var = list2.get(i);
            if (q4Var instanceof a5) {
                this.f.add((a5) q4Var);
            }
        }
    }

    @Override // h5.b
    public void b() {
        this.j.invalidateSelf();
    }
}
