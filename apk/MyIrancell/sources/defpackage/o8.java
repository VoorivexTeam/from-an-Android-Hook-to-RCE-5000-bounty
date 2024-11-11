package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.d;
import defpackage.k9;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class o8 {
    private static j0<WeakReference<Interpolator>> b;
    private static final Interpolator a = new LinearInterpolator();
    static k9.a c = k9.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    o8() {
    }

    private static j0<WeakReference<Interpolator>> a() {
        if (b == null) {
            b = new j0<>();
        }
        return b;
    }

    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> b2;
        synchronized (o8.class) {
            b2 = a().b(i);
        }
        return b2;
    }

    private static <T> v9<T> a(d dVar, k9 k9Var, float f, h9<T> h9Var) {
        Interpolator interpolator;
        k9Var.c();
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (k9Var.h()) {
            switch (k9Var.a(c)) {
                case 0:
                    f2 = (float) k9Var.j();
                    break;
                case 1:
                    t = h9Var.a(k9Var, f);
                    break;
                case 2:
                    t2 = h9Var.a(k9Var, f);
                    break;
                case 3:
                    pointF = n8.d(k9Var, f);
                    break;
                case 4:
                    pointF2 = n8.d(k9Var, f);
                    break;
                case 5:
                    if (k9Var.k() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = n8.d(k9Var, f);
                    break;
                case 7:
                    pointF4 = n8.d(k9Var, f);
                    break;
                default:
                    k9Var.o();
                    break;
            }
        }
        k9Var.e();
        if (z) {
            interpolator = a;
            t2 = t;
        } else if (pointF == null || pointF2 == null) {
            interpolator = a;
        } else {
            float f3 = -f;
            pointF.x = t9.a(pointF.x, f3, f);
            pointF.y = t9.a(pointF.y, -100.0f, 100.0f);
            pointF2.x = t9.a(pointF2.x, f3, f);
            float a2 = t9.a(pointF2.y, -100.0f, 100.0f);
            pointF2.y = a2;
            int a3 = u9.a(pointF.x, pointF.y, pointF2.x, a2);
            WeakReference<Interpolator> a4 = a(a3);
            Interpolator interpolator2 = a4 != null ? a4.get() : null;
            if (a4 == null || interpolator2 == null) {
                interpolator2 = f3.a(pointF.x / f, pointF.y / f, pointF2.x / f, pointF2.y / f);
                try {
                    a(a3, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            interpolator = interpolator2;
        }
        v9<T> v9Var = new v9<>(dVar, t, t2, interpolator, f2, null);
        v9Var.m = pointF3;
        v9Var.n = pointF4;
        return v9Var;
    }

    private static <T> v9<T> a(k9 k9Var, float f, h9<T> h9Var) {
        return new v9<>(h9Var.a(k9Var, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> v9<T> a(k9 k9Var, d dVar, float f, h9<T> h9Var, boolean z) {
        return z ? a(dVar, k9Var, f, h9Var) : a(k9Var, f, h9Var);
    }

    private static void a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (o8.class) {
            b.c(i, weakReference);
        }
    }
}
