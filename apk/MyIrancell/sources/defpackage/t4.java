package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import defpackage.h5;
import defpackage.m7;
import java.util.List;

/* loaded from: classes.dex */
public class t4 implements a5, h5.b, y4 {
    private final String b;
    private final f c;
    private final h5<?, PointF> d;
    private final h5<?, PointF> e;
    private final w6 f;
    private boolean h;
    private final Path a = new Path();
    private p4 g = new p4();

    public t4(f fVar, n7 n7Var, w6 w6Var) {
        this.b = w6Var.a();
        this.c = fVar;
        this.d = w6Var.c().a();
        this.e = w6Var.b().a();
        this.f = w6Var;
        n7Var.a(this.d);
        n7Var.a(this.e);
        this.d.a(this);
        this.e.a(this);
    }

    private void d() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.q4
    public String a() {
        return this.b;
    }

    @Override // defpackage.e6
    public void a(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        t9.a(d6Var, i, list, d6Var2, this);
    }

    @Override // defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        h5<?, PointF> h5Var;
        if (t == k.g) {
            h5Var = this.d;
        } else if (t != k.j) {
            return;
        } else {
            h5Var = this.e;
        }
        h5Var.a((x9<PointF>) x9Var);
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        for (int i = 0; i < list.size(); i++) {
            q4 q4Var = list.get(i);
            if (q4Var instanceof g5) {
                g5 g5Var = (g5) q4Var;
                if (g5Var.g() == m7.a.SIMULTANEOUSLY) {
                    this.g.a(g5Var);
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
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (!this.f.d()) {
            PointF f = this.d.f();
            float f2 = f.x / 2.0f;
            float f3 = f.y / 2.0f;
            float f4 = f2 * 0.55228f;
            float f5 = 0.55228f * f3;
            this.a.reset();
            if (this.f.e()) {
                float f6 = -f3;
                this.a.moveTo(0.0f, f6);
                float f7 = 0.0f - f4;
                float f8 = -f2;
                float f9 = 0.0f - f5;
                this.a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
                float f10 = f5 + 0.0f;
                this.a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
                float f11 = f4 + 0.0f;
                this.a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
                this.a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
            } else {
                float f12 = -f3;
                this.a.moveTo(0.0f, f12);
                float f13 = f4 + 0.0f;
                float f14 = 0.0f - f5;
                this.a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
                float f15 = f5 + 0.0f;
                this.a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
                float f16 = 0.0f - f4;
                float f17 = -f2;
                this.a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
                this.a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
            }
            PointF f18 = this.e.f();
            this.a.offset(f18.x, f18.y);
            this.a.close();
            this.g.a(this.a);
        }
        this.h = true;
        return this.a;
    }
}
