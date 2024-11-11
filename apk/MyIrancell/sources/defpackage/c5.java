package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import defpackage.h5;
import defpackage.m7;
import java.util.List;

/* loaded from: classes.dex */
public class c5 implements h5.b, y4, a5 {
    private final String c;
    private final boolean d;
    private final f e;
    private final h5<?, PointF> f;
    private final h5<?, PointF> g;
    private final h5<?, Float> h;
    private boolean j;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private p4 i = new p4();

    public c5(f fVar, n7 n7Var, f7 f7Var) {
        this.c = f7Var.b();
        this.d = f7Var.e();
        this.e = fVar;
        this.f = f7Var.c().a();
        this.g = f7Var.d().a();
        this.h = f7Var.a().a();
        n7Var.a(this.f);
        n7Var.a(this.g);
        n7Var.a(this.h);
        this.f.a(this);
        this.g.a(this);
        this.h.a(this);
    }

    private void d() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.q4
    public String a() {
        return this.c;
    }

    @Override // defpackage.e6
    public void a(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        t9.a(d6Var, i, list, d6Var2, this);
    }

    @Override // defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        h5 h5Var;
        if (t == k.h) {
            h5Var = this.g;
        } else if (t == k.j) {
            h5Var = this.f;
        } else if (t != k.i) {
            return;
        } else {
            h5Var = this.h;
        }
        h5Var.a(x9Var);
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        for (int i = 0; i < list.size(); i++) {
            q4 q4Var = list.get(i);
            if (q4Var instanceof g5) {
                g5 g5Var = (g5) q4Var;
                if (g5Var.g() == m7.a.SIMULTANEOUSLY) {
                    this.i.a(g5Var);
                    g5Var.a(this);
                }
            }
        }
    }

    @Override // h5.b
    public void b() {
        d();
    }

    @Override // defpackage.a5
    public Path c() {
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (!this.d) {
            PointF f = this.g.f();
            float f2 = f.x / 2.0f;
            float f3 = f.y / 2.0f;
            h5<?, Float> h5Var = this.h;
            float i = h5Var == null ? 0.0f : ((j5) h5Var).i();
            float min = Math.min(f2, f3);
            if (i > min) {
                i = min;
            }
            PointF f4 = this.f.f();
            this.a.moveTo(f4.x + f2, (f4.y - f3) + i);
            this.a.lineTo(f4.x + f2, (f4.y + f3) - i);
            if (i > 0.0f) {
                RectF rectF = this.b;
                float f5 = f4.x;
                float f6 = i * 2.0f;
                float f7 = f4.y;
                rectF.set((f5 + f2) - f6, (f7 + f3) - f6, f5 + f2, f7 + f3);
                this.a.arcTo(this.b, 0.0f, 90.0f, false);
            }
            this.a.lineTo((f4.x - f2) + i, f4.y + f3);
            if (i > 0.0f) {
                RectF rectF2 = this.b;
                float f8 = f4.x;
                float f9 = f4.y;
                float f10 = i * 2.0f;
                rectF2.set(f8 - f2, (f9 + f3) - f10, (f8 - f2) + f10, f9 + f3);
                this.a.arcTo(this.b, 90.0f, 90.0f, false);
            }
            this.a.lineTo(f4.x - f2, (f4.y - f3) + i);
            if (i > 0.0f) {
                RectF rectF3 = this.b;
                float f11 = f4.x;
                float f12 = f4.y;
                float f13 = i * 2.0f;
                rectF3.set(f11 - f2, f12 - f3, (f11 - f2) + f13, (f12 - f3) + f13);
                this.a.arcTo(this.b, 180.0f, 90.0f, false);
            }
            this.a.lineTo((f4.x + f2) - i, f4.y - f3);
            if (i > 0.0f) {
                RectF rectF4 = this.b;
                float f14 = f4.x;
                float f15 = i * 2.0f;
                float f16 = f4.y;
                rectF4.set((f14 + f2) - f15, f16 - f3, f14 + f2, (f16 - f3) + f15);
                this.a.arcTo(this.b, 270.0f, 90.0f, false);
            }
            this.a.close();
            this.i.a(this.a);
        }
        this.j = true;
        return this.a;
    }
}
