package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import defpackage.c7;
import defpackage.h5;
import defpackage.q7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n7 implements s4, h5.b, e6 {
    private final String l;
    final f n;
    final q7 o;
    private n5 p;
    private n7 q;
    private n7 r;
    private List<n7> s;
    final v5 u;
    private final Path a = new Path();
    private final Matrix b = new Matrix();
    private final Paint c = new n4(1);
    private final Paint d = new n4(1, PorterDuff.Mode.DST_IN);
    private final Paint e = new n4(1, PorterDuff.Mode.DST_OUT);
    private final Paint f = new n4(1);
    private final Paint g = new n4(PorterDuff.Mode.CLEAR);
    private final RectF h = new RectF();
    private final RectF i = new RectF();
    private final RectF j = new RectF();
    private final RectF k = new RectF();
    final Matrix m = new Matrix();
    private final List<h5<?, ?>> t = new ArrayList();
    private boolean v = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements h5.b {
        final /* synthetic */ j5 a;

        a(j5 j5Var) {
            this.a = j5Var;
        }

        @Override // h5.b
        public void b() {
            n7.this.a(this.a.i() == 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c7.a.values().length];
            b = iArr;
            try {
                iArr[c7.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c7.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c7.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[c7.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[q7.a.values().length];
            a = iArr2;
            try {
                iArr2[q7.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[q7.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[q7.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[q7.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[q7.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[q7.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[q7.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n7(f fVar, q7 q7Var) {
        Paint paint;
        PorterDuffXfermode porterDuffXfermode;
        this.n = fVar;
        this.o = q7Var;
        this.l = q7Var.g() + "#draw";
        if (q7Var.f() == q7.b.INVERT) {
            paint = this.f;
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        } else {
            paint = this.f;
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        }
        paint.setXfermode(porterDuffXfermode);
        v5 a2 = q7Var.u().a();
        this.u = a2;
        a2.a((h5.b) this);
        if (q7Var.e() != null && !q7Var.e().isEmpty()) {
            n5 n5Var = new n5(q7Var.e());
            this.p = n5Var;
            Iterator<h5<h7, Path>> it = n5Var.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (h5<Integer, Integer> h5Var : this.p.c()) {
                a(h5Var);
                h5Var.a(this);
            }
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n7 a(q7 q7Var, f fVar, d dVar) {
        switch (b.a[q7Var.d().ordinal()]) {
            case 1:
                return new s7(fVar, q7Var);
            case 2:
                return new o7(fVar, q7Var, dVar.c(q7Var.k()), dVar);
            case 3:
                return new t7(fVar, q7Var);
            case 4:
                return new p7(fVar, q7Var);
            case 5:
                return new r7(fVar, q7Var);
            case 6:
                return new u7(fVar, q7Var);
            default:
                q9.b("Unknown layer type " + q7Var.d());
                return null;
        }
    }

    private void a(Canvas canvas) {
        c.a("Layer#clearLayer");
        RectF rectF = this.h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.g);
        c.b("Layer#clearLayer");
    }

    private void a(Canvas canvas, Matrix matrix) {
        c.a("Layer#saveLayer");
        u9.a(canvas, this.h, this.d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            canvas.drawColor(0);
        }
        c.b("Layer#saveLayer");
        for (int i = 0; i < this.p.b().size(); i++) {
            c7 c7Var = this.p.b().get(i);
            h5<h7, Path> h5Var = this.p.a().get(i);
            h5<Integer, Integer> h5Var2 = this.p.c().get(i);
            int i2 = b.b[c7Var.a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.c.setColor(-16777216);
                        this.c.setAlpha(255);
                        canvas.drawRect(this.h, this.c);
                    }
                    if (c7Var.d()) {
                        e(canvas, matrix, c7Var, h5Var, h5Var2);
                    } else {
                        f(canvas, matrix, c7Var, h5Var, h5Var2);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (c7Var.d()) {
                            c(canvas, matrix, c7Var, h5Var, h5Var2);
                        } else {
                            a(canvas, matrix, c7Var, h5Var, h5Var2);
                        }
                    }
                } else if (c7Var.d()) {
                    d(canvas, matrix, c7Var, h5Var, h5Var2);
                } else {
                    b(canvas, matrix, c7Var, h5Var, h5Var2);
                }
            } else if (g()) {
                this.c.setAlpha(255);
                canvas.drawRect(this.h, this.c);
            }
        }
        c.a("Layer#restoreLayer");
        canvas.restore();
        c.b("Layer#restoreLayer");
    }

    private void a(Canvas canvas, Matrix matrix, c7 c7Var, h5<h7, Path> h5Var, h5<Integer, Integer> h5Var2) {
        this.a.set(h5Var.f());
        this.a.transform(matrix);
        this.c.setAlpha((int) (h5Var2.f().intValue() * 2.55f));
        canvas.drawPath(this.a, this.c);
    }

    private void a(RectF rectF, Matrix matrix) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (e()) {
            int size = this.p.b().size();
            for (int i = 0; i < size; i++) {
                c7 c7Var = this.p.b().get(i);
                this.a.set(this.p.a().get(i).f());
                this.a.transform(matrix);
                int i2 = b.b[c7Var.a().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return;
                }
                if ((i2 == 3 || i2 == 4) && c7Var.d()) {
                    return;
                }
                this.a.computeBounds(this.k, false);
                RectF rectF2 = this.i;
                if (i == 0) {
                    rectF2.set(this.k);
                } else {
                    rectF2.set(Math.min(rectF2.left, this.k.left), Math.min(this.i.top, this.k.top), Math.max(this.i.right, this.k.right), Math.max(this.i.bottom, this.k.bottom));
                }
            }
            if (rectF.intersect(this.i)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z != this.v) {
            this.v = z;
            i();
        }
    }

    private void b(float f) {
        this.n.e().k().a(this.o.g(), f);
    }

    private void b(Canvas canvas, Matrix matrix, c7 c7Var, h5<h7, Path> h5Var, h5<Integer, Integer> h5Var2) {
        u9.a(canvas, this.h, this.d);
        this.a.set(h5Var.f());
        this.a.transform(matrix);
        this.c.setAlpha((int) (h5Var2.f().intValue() * 2.55f));
        canvas.drawPath(this.a, this.c);
        canvas.restore();
    }

    private void b(RectF rectF, Matrix matrix) {
        if (f() && this.o.f() != q7.b.INVERT) {
            this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.q.a(this.j, matrix, true);
            if (rectF.intersect(this.j)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void c(Canvas canvas, Matrix matrix, c7 c7Var, h5<h7, Path> h5Var, h5<Integer, Integer> h5Var2) {
        u9.a(canvas, this.h, this.c);
        canvas.drawRect(this.h, this.c);
        this.a.set(h5Var.f());
        this.a.transform(matrix);
        this.c.setAlpha((int) (h5Var2.f().intValue() * 2.55f));
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void d(Canvas canvas, Matrix matrix, c7 c7Var, h5<h7, Path> h5Var, h5<Integer, Integer> h5Var2) {
        u9.a(canvas, this.h, this.d);
        canvas.drawRect(this.h, this.c);
        this.e.setAlpha((int) (h5Var2.f().intValue() * 2.55f));
        this.a.set(h5Var.f());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void e(Canvas canvas, Matrix matrix, c7 c7Var, h5<h7, Path> h5Var, h5<Integer, Integer> h5Var2) {
        u9.a(canvas, this.h, this.e);
        canvas.drawRect(this.h, this.c);
        this.e.setAlpha((int) (h5Var2.f().intValue() * 2.55f));
        this.a.set(h5Var.f());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void f(Canvas canvas, Matrix matrix, c7 c7Var, h5<h7, Path> h5Var, h5<Integer, Integer> h5Var2) {
        this.a.set(h5Var.f());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
    }

    private boolean g() {
        if (this.p.a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.p.b().size(); i++) {
            if (this.p.b().get(i).a() != c7.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void h() {
        if (this.s != null) {
            return;
        }
        if (this.r == null) {
            this.s = Collections.emptyList();
            return;
        }
        this.s = new ArrayList();
        for (n7 n7Var = this.r; n7Var != null; n7Var = n7Var.r) {
            this.s.add(n7Var);
        }
    }

    private void i() {
        this.n.invalidateSelf();
    }

    private void j() {
        if (this.o.c().isEmpty()) {
            a(true);
            return;
        }
        j5 j5Var = new j5(this.o.c());
        j5Var.h();
        j5Var.a(new a(j5Var));
        a(j5Var.f().floatValue() == 1.0f);
        a(j5Var);
    }

    @Override // defpackage.q4
    public String a() {
        return this.o.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f) {
        this.u.b(f);
        if (this.p != null) {
            for (int i = 0; i < this.p.a().size(); i++) {
                this.p.a().get(i).a(f);
            }
        }
        if (this.o.t() != 0.0f) {
            f /= this.o.t();
        }
        n7 n7Var = this.q;
        if (n7Var != null) {
            this.q.a(n7Var.o.t() * f);
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            this.t.get(i2).a(f);
        }
    }

    @Override // defpackage.s4
    public void a(Canvas canvas, Matrix matrix, int i) {
        c.a(this.l);
        if (!this.v || this.o.v()) {
            c.b(this.l);
            return;
        }
        h();
        c.a("Layer#parentMatrix");
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.s.size() - 1; size >= 0; size--) {
            this.b.preConcat(this.s.get(size).u.b());
        }
        c.b("Layer#parentMatrix");
        int intValue = (int) ((((i / 255.0f) * (this.u.c() == null ? 100 : this.u.c().f().intValue())) / 100.0f) * 255.0f);
        if (!f() && !e()) {
            this.b.preConcat(this.u.b());
            c.a("Layer#drawLayer");
            b(canvas, this.b, intValue);
            c.b("Layer#drawLayer");
            b(c.b(this.l));
            return;
        }
        c.a("Layer#computeBounds");
        a(this.h, this.b, false);
        b(this.h, matrix);
        this.b.preConcat(this.u.b());
        a(this.h, this.b);
        if (!this.h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
            this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        c.b("Layer#computeBounds");
        if (!this.h.isEmpty()) {
            c.a("Layer#saveLayer");
            this.c.setAlpha(255);
            u9.a(canvas, this.h, this.c);
            c.b("Layer#saveLayer");
            a(canvas);
            c.a("Layer#drawLayer");
            b(canvas, this.b, intValue);
            c.b("Layer#drawLayer");
            if (e()) {
                a(canvas, this.b);
            }
            if (f()) {
                c.a("Layer#drawMatte");
                c.a("Layer#saveLayer");
                u9.a(canvas, this.h, this.f, 19);
                c.b("Layer#saveLayer");
                a(canvas);
                this.q.a(canvas, matrix, intValue);
                c.a("Layer#restoreLayer");
                canvas.restore();
                c.b("Layer#restoreLayer");
                c.b("Layer#drawMatte");
            }
            c.a("Layer#restoreLayer");
            canvas.restore();
            c.b("Layer#restoreLayer");
        }
        b(c.b(this.l));
    }

    @Override // defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        this.m.set(matrix);
        if (z) {
            List<n7> list = this.s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.m.preConcat(this.s.get(size).u.b());
                }
            } else {
                n7 n7Var = this.r;
                if (n7Var != null) {
                    this.m.preConcat(n7Var.u.b());
                }
            }
        }
        this.m.preConcat(this.u.b());
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
                b(d6Var, i + d6Var.b(a(), i), list, d6Var2);
            }
        }
    }

    public void a(h5<?, ?> h5Var) {
        if (h5Var == null) {
            return;
        }
        this.t.add(h5Var);
    }

    @Override // defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        this.u.a(t, x9Var);
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(n7 n7Var) {
        this.q = n7Var;
    }

    @Override // h5.b
    public void b() {
        i();
    }

    abstract void b(Canvas canvas, Matrix matrix, int i);

    void b(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
    }

    public void b(h5<?, ?> h5Var) {
        this.t.remove(h5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(n7 n7Var) {
        this.r = n7Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q7 d() {
        return this.o;
    }

    boolean e() {
        n5 n5Var = this.p;
        return (n5Var == null || n5Var.a().isEmpty()) ? false : true;
    }

    boolean f() {
        return this.q != null;
    }
}
