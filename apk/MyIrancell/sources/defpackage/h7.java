package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h7 {
    private final List<z5> a;
    private PointF b;
    private boolean c;

    public h7() {
        this.a = new ArrayList();
    }

    public h7(PointF pointF, boolean z, List<z5> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    private void a(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public List<z5> a() {
        return this.a;
    }

    public void a(h7 h7Var, h7 h7Var2, float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = h7Var.c() || h7Var2.c();
        if (h7Var.a().size() != h7Var2.a().size()) {
            q9.b("Curves must have the same number of control points. Shape 1: " + h7Var.a().size() + "\tShape 2: " + h7Var2.a().size());
        }
        int min = Math.min(h7Var.a().size(), h7Var2.a().size());
        if (this.a.size() < min) {
            for (int size = this.a.size(); size < min; size++) {
                this.a.add(new z5());
            }
        } else if (this.a.size() > min) {
            for (int size2 = this.a.size() - 1; size2 >= min; size2--) {
                List<z5> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = h7Var.b();
        PointF b2 = h7Var2.b();
        a(t9.c(b.x, b2.x, f), t9.c(b.y, b2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            z5 z5Var = h7Var.a().get(size3);
            z5 z5Var2 = h7Var2.a().get(size3);
            PointF a = z5Var.a();
            PointF b3 = z5Var.b();
            PointF c = z5Var.c();
            PointF a2 = z5Var2.a();
            PointF b4 = z5Var2.b();
            PointF c2 = z5Var2.c();
            this.a.get(size3).a(t9.c(a.x, a2.x, f), t9.c(a.y, a2.y, f));
            this.a.get(size3).b(t9.c(b3.x, b4.x, f), t9.c(b3.y, b4.y, f));
            this.a.get(size3).c(t9.c(c.x, c2.x, f), t9.c(c.y, c2.y, f));
        }
    }

    public PointF b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }
}
