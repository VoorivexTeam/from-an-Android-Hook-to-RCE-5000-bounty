package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import defpackage.q7;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class o7 extends n7 {
    private Paint A;
    private h5<Float, Float> w;
    private final List<n7> x;
    private final RectF y;
    private final RectF z;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q7.b.values().length];
            a = iArr;
            try {
                iArr[q7.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[q7.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o7(f fVar, q7 q7Var, List<q7> list, d dVar) {
        super(fVar, q7Var);
        int i;
        n7 n7Var;
        this.x = new ArrayList();
        this.y = new RectF();
        this.z = new RectF();
        this.A = new Paint();
        j6 s = q7Var.s();
        if (s != null) {
            h5<Float, Float> a2 = s.a();
            this.w = a2;
            a(a2);
            this.w.a(this);
        } else {
            this.w = null;
        }
        f0 f0Var = new f0(dVar.i().size());
        int size = list.size() - 1;
        n7 n7Var2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            q7 q7Var2 = list.get(size);
            n7 a3 = n7.a(q7Var2, fVar, dVar);
            if (a3 != null) {
                f0Var.c(a3.d().b(), a3);
                if (n7Var2 != null) {
                    n7Var2.a(a3);
                    n7Var2 = null;
                } else {
                    this.x.add(0, a3);
                    int i2 = a.a[q7Var2.f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        n7Var2 = a3;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < f0Var.b(); i++) {
            n7 n7Var3 = (n7) f0Var.c(f0Var.a(i));
            if (n7Var3 != null && (n7Var = (n7) f0Var.c(n7Var3.d().h())) != null) {
                n7Var3.b(n7Var);
            }
        }
    }

    @Override // defpackage.n7
    public void a(float f) {
        super.a(f);
        if (this.w != null) {
            f = ((this.w.f().floatValue() * this.o.a().g()) - this.o.a().l()) / (this.n.e().d() + 0.01f);
        }
        if (this.o.t() != 0.0f) {
            f /= this.o.t();
        }
        if (this.w == null) {
            f -= this.o.p();
        }
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).a(f);
        }
    }

    @Override // defpackage.n7, defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.y.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.x.get(size).a(this.y, this.m, true);
            rectF.union(this.y);
        }
    }

    @Override // defpackage.n7, defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        super.a((o7) t, (x9<o7>) x9Var);
        if (t == k.A) {
            if (x9Var == null) {
                this.w = null;
                return;
            }
            w5 w5Var = new w5(x9Var);
            this.w = w5Var;
            a(w5Var);
        }
    }

    @Override // defpackage.n7
    void b(Canvas canvas, Matrix matrix, int i) {
        c.a("CompositionLayer#draw");
        this.z.set(0.0f, 0.0f, this.o.j(), this.o.i());
        matrix.mapRect(this.z);
        boolean z = this.n.r() && this.x.size() > 1 && i != 255;
        if (z) {
            this.A.setAlpha(i);
            u9.a(canvas, this.z, this.A);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.x.size() - 1; size >= 0; size--) {
            if (!this.z.isEmpty() ? canvas.clipRect(this.z) : true) {
                this.x.get(size).a(canvas, matrix, i);
            }
        }
        canvas.restore();
        c.b("CompositionLayer#draw");
    }

    @Override // defpackage.n7
    protected void b(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            this.x.get(i2).a(d6Var, i, list, d6Var2);
        }
    }
}
