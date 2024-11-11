package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import defpackage.h5;
import defpackage.m7;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o4 implements h5.b, y4, s4 {
    private final f e;
    protected final n7 f;
    private final float[] h;
    final Paint i;
    private final h5<?, Float> j;
    private final h5<?, Integer> k;
    private final List<h5<?, Float>> l;
    private final h5<?, Float> m;
    private h5<ColorFilter, ColorFilter> n;
    private final PathMeasure a = new PathMeasure();
    private final Path b = new Path();
    private final Path c = new Path();
    private final RectF d = new RectF();
    private final List<b> g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        private final List<a5> a;
        private final g5 b;

        private b(g5 g5Var) {
            this.a = new ArrayList();
            this.b = g5Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o4(f fVar, n7 n7Var, Paint.Cap cap, Paint.Join join, float f, l6 l6Var, j6 j6Var, List<j6> list, j6 j6Var2) {
        n4 n4Var = new n4(1);
        this.i = n4Var;
        this.e = fVar;
        this.f = n7Var;
        n4Var.setStyle(Paint.Style.STROKE);
        this.i.setStrokeCap(cap);
        this.i.setStrokeJoin(join);
        this.i.setStrokeMiter(f);
        this.k = l6Var.a();
        this.j = j6Var.a();
        this.m = j6Var2 == null ? null : j6Var2.a();
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        n7Var.a(this.k);
        n7Var.a(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            n7Var.a(this.l.get(i2));
        }
        h5<?, Float> h5Var = this.m;
        if (h5Var != null) {
            n7Var.a(h5Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        h5<?, Float> h5Var2 = this.m;
        if (h5Var2 != null) {
            h5Var2.a(this);
        }
    }

    private void a(Canvas canvas, b bVar, Matrix matrix) {
        float f;
        c.a("StrokeContent#applyTrimPath");
        if (bVar.b == null) {
            c.b("StrokeContent#applyTrimPath");
            return;
        }
        this.b.reset();
        for (int size = bVar.a.size() - 1; size >= 0; size--) {
            this.b.addPath(((a5) bVar.a.get(size)).c(), matrix);
        }
        this.a.setPath(this.b, false);
        float length = this.a.getLength();
        while (this.a.nextContour()) {
            length += this.a.getLength();
        }
        float floatValue = (bVar.b.e().f().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.b.f().f().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.b.d().f().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = bVar.a.size() - 1; size2 >= 0; size2--) {
            this.c.set(((a5) bVar.a.get(size2)).c());
            this.c.transform(matrix);
            this.a.setPath(this.c, false);
            float length2 = this.a.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    f = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f3 = Math.min(f4 / length2, 1.0f);
                    u9.a(this.c, f, f3, 0.0f);
                    canvas.drawPath(this.c, this.i);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 > floatValue3 || floatValue2 >= f2) {
                    f = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                    }
                    u9.a(this.c, f, f3, 0.0f);
                }
                canvas.drawPath(this.c, this.i);
            }
            f2 += length2;
        }
        c.b("StrokeContent#applyTrimPath");
    }

    private void a(Matrix matrix) {
        c.a("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            c.b("StrokeContent#applyDashPattern");
            return;
        }
        float a2 = u9.a(matrix);
        for (int i = 0; i < this.l.size(); i++) {
            this.h[i] = this.l.get(i).f().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.h;
            fArr3[i] = fArr3[i] * a2;
        }
        h5<?, Float> h5Var = this.m;
        this.i.setPathEffect(new DashPathEffect(this.h, h5Var == null ? 0.0f : a2 * h5Var.f().floatValue()));
        c.b("StrokeContent#applyDashPattern");
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        c.a("StrokeContent#draw");
        if (u9.b(matrix)) {
            c.b("StrokeContent#draw");
            return;
        }
        this.i.setAlpha(t9.a((int) ((((i / 255.0f) * ((l5) this.k).i()) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(((j5) this.j).i() * u9.a(matrix));
        if (this.i.getStrokeWidth() <= 0.0f) {
            c.b("StrokeContent#draw");
            return;
        }
        a(matrix);
        h5<ColorFilter, ColorFilter> h5Var = this.n;
        if (h5Var != null) {
            this.i.setColorFilter(h5Var.f());
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (bVar.b != null) {
                a(canvas, bVar, matrix);
            } else {
                c.a("StrokeContent#buildPath");
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((a5) bVar.a.get(size)).c(), matrix);
                }
                c.b("StrokeContent#buildPath");
                c.a("StrokeContent#drawPath");
                canvas.drawPath(this.b, this.i);
                c.b("StrokeContent#drawPath");
            }
        }
        c.b("StrokeContent#draw");
    }

    @Override // defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        c.a("StrokeContent#getBounds");
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = this.g.get(i);
            for (int i2 = 0; i2 < bVar.a.size(); i2++) {
                this.b.addPath(((a5) bVar.a.get(i2)).c(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        float i3 = ((j5) this.j).i();
        RectF rectF2 = this.d;
        float f = i3 / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        c.b("StrokeContent#getBounds");
    }

    @Override // defpackage.e6
    public void a(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        t9.a(d6Var, i, list, d6Var2, this);
    }

    public <T> void a(T t, x9<T> x9Var) {
        h5 h5Var;
        if (t == k.d) {
            h5Var = this.k;
        } else {
            if (t != k.o) {
                if (t == k.C) {
                    if (x9Var == null) {
                        this.n = null;
                        return;
                    }
                    w5 w5Var = new w5(x9Var);
                    this.n = w5Var;
                    w5Var.a(this);
                    this.f.a(this.n);
                    return;
                }
                return;
            }
            h5Var = this.j;
        }
        h5Var.a(x9Var);
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        g5 g5Var = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            q4 q4Var = list.get(size);
            if (q4Var instanceof g5) {
                g5 g5Var2 = (g5) q4Var;
                if (g5Var2.g() == m7.a.INDIVIDUALLY) {
                    g5Var = g5Var2;
                }
            }
        }
        if (g5Var != null) {
            g5Var.a(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            q4 q4Var2 = list2.get(size2);
            if (q4Var2 instanceof g5) {
                g5 g5Var3 = (g5) q4Var2;
                if (g5Var3.g() == m7.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.g.add(bVar);
                    }
                    bVar = new b(g5Var3);
                    g5Var3.a(this);
                }
            }
            if (q4Var2 instanceof a5) {
                if (bVar == null) {
                    bVar = new b(g5Var);
                }
                bVar.a.add((a5) q4Var2);
            }
        }
        if (bVar != null) {
            this.g.add(bVar);
        }
    }

    @Override // h5.b
    public void b() {
        this.e.invalidateSelf();
    }
}
