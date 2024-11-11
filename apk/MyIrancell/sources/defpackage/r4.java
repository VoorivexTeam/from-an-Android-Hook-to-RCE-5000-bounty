package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import defpackage.h5;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r4 implements s4, a5, h5.b, e6 {
    private Paint a;
    private RectF b;
    private final Matrix c;
    private final Path d;
    private final RectF e;
    private final String f;
    private final boolean g;
    private final List<q4> h;
    private final f i;
    private List<a5> j;
    private v5 k;

    public r4(f fVar, n7 n7Var, j7 j7Var) {
        this(fVar, n7Var, j7Var.b(), j7Var.c(), a(fVar, n7Var, j7Var.a()), a(j7Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r4(f fVar, n7 n7Var, String str, boolean z, List<q4> list, t6 t6Var) {
        this.a = new n4();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = fVar;
        this.g = z;
        this.h = list;
        if (t6Var != null) {
            v5 a = t6Var.a();
            this.k = a;
            a.a(n7Var);
            this.k.a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            q4 q4Var = list.get(size);
            if (q4Var instanceof x4) {
                arrayList.add((x4) q4Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((x4) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }

    private static List<q4> a(f fVar, n7 n7Var, List<x6> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            q4 a = list.get(i).a(fVar, n7Var);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    static t6 a(List<x6> list) {
        for (int i = 0; i < list.size(); i++) {
            x6 x6Var = list.get(i);
            if (x6Var instanceof t6) {
                return (t6) x6Var;
            }
        }
        return null;
    }

    private boolean f() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof s4) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.q4
    public String a() {
        return this.f;
    }

    @Override // defpackage.s4
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        v5 v5Var = this.k;
        if (v5Var != null) {
            this.c.preConcat(v5Var.b());
            i = (int) (((((this.k.c() == null ? 100 : this.k.c().f().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.r() && f() && i != 255;
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.b, this.c, true);
            this.a.setAlpha(i);
            u9.a(canvas, this.b, this.a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            q4 q4Var = this.h.get(size);
            if (q4Var instanceof s4) {
                ((s4) q4Var).a(canvas, this.c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        v5 v5Var = this.k;
        if (v5Var != null) {
            this.c.preConcat(v5Var.b());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            q4 q4Var = this.h.get(size);
            if (q4Var instanceof s4) {
                ((s4) q4Var).a(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override // defpackage.e6
    public void a(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        if (d6Var.c(a(), i)) {
            if (!"__container".equals(a())) {
                d6Var2 = d6Var2.a(a());
                if (d6Var.a(a(), i)) {
                    list.add(d6Var2.a(this));
                }
            }
            if (d6Var.d(a(), i)) {
                int b = i + d6Var.b(a(), i);
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    q4 q4Var = this.h.get(i2);
                    if (q4Var instanceof e6) {
                        ((e6) q4Var).a(d6Var, b, list, d6Var2);
                    }
                }
            }
        }
    }

    @Override // defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        v5 v5Var = this.k;
        if (v5Var != null) {
            v5Var.a(t, x9Var);
        }
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            q4 q4Var = this.h.get(size);
            q4Var.a(arrayList, this.h.subList(0, size));
            arrayList.add(q4Var);
        }
    }

    @Override // h5.b
    public void b() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.a5
    public Path c() {
        this.c.reset();
        v5 v5Var = this.k;
        if (v5Var != null) {
            this.c.set(v5Var.b());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            q4 q4Var = this.h.get(size);
            if (q4Var instanceof a5) {
                this.d.addPath(((a5) q4Var).c(), this.c);
            }
        }
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<a5> d() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                q4 q4Var = this.h.get(i);
                if (q4Var instanceof a5) {
                    this.j.add((a5) q4Var);
                }
            }
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix e() {
        v5 v5Var = this.k;
        if (v5Var != null) {
            return v5Var.b();
        }
        this.c.reset();
        return this.c;
    }
}
