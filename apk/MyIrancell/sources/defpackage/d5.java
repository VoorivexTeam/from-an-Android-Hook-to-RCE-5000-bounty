package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import defpackage.h5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class d5 implements s4, a5, x4, h5.b, y4 {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final f c;
    private final n7 d;
    private final String e;
    private final boolean f;
    private final h5<Float, Float> g;
    private final h5<Float, Float> h;
    private final v5 i;
    private r4 j;

    public d5(f fVar, n7 n7Var, g7 g7Var) {
        this.c = fVar;
        this.d = n7Var;
        this.e = g7Var.b();
        this.f = g7Var.e();
        h5<Float, Float> a = g7Var.a().a();
        this.g = a;
        n7Var.a(a);
        this.g.a(this);
        h5<Float, Float> a2 = g7Var.c().a();
        this.h = a2;
        n7Var.a(a2);
        this.h.a(this);
        v5 a3 = g7Var.d().a();
        this.i = a3;
        a3.a(n7Var);
        this.i.a(this);
    }

    @Override // defpackage.q4
    public String a() {
        return this.e;
    }

    @Override // defpackage.s4
    public void a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.g.f().floatValue();
        float floatValue2 = this.h.f().floatValue();
        float floatValue3 = this.i.d().f().floatValue() / 100.0f;
        float floatValue4 = this.i.a().f().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.a(f + floatValue2));
            this.j.a(canvas, this.a, (int) (i * t9.c(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.j.a(rectF, matrix, z);
    }

    @Override // defpackage.e6
    public void a(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        t9.a(d6Var, i, list, d6Var2, this);
    }

    @Override // defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        h5<Float, Float> h5Var;
        if (this.i.a(t, x9Var)) {
            return;
        }
        if (t == k.q) {
            h5Var = this.g;
        } else if (t != k.r) {
            return;
        } else {
            h5Var = this.h;
        }
        h5Var.a((x9<Float>) x9Var);
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        this.j.a(list, list2);
    }

    @Override // defpackage.x4
    public void a(ListIterator<q4> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new r4(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // h5.b
    public void b() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.a5
    public Path c() {
        Path c = this.j.c();
        this.b.reset();
        float floatValue = this.g.f().floatValue();
        float floatValue2 = this.h.f().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.a.set(this.i.a(i + floatValue2));
            this.b.addPath(c, this.a);
        }
        return this.b;
    }
}
