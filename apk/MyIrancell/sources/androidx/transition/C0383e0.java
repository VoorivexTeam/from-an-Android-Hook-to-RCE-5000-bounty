package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.e0 */
/* loaded from: classes.dex */
class C0383e0 extends C0381d0 {

    /* renamed from: e */
    private static Method f2431e;

    /* renamed from: f */
    private static boolean f2432f;

    /* renamed from: g */
    private static Method f2433g;

    /* renamed from: h */
    private static boolean f2434h;

    /* renamed from: a */
    private void m2970a() {
        if (f2432f) {
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
            f2431e = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f2432f = true;
    }

    /* renamed from: b */
    private void m2971b() {
        if (f2434h) {
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
            f2433g = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f2434h = true;
    }

    @Override // androidx.transition.C0387g0
    /* renamed from: a */
    public void mo2972a(View view, Matrix matrix) {
        m2970a();
        Method method = f2431e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // androidx.transition.C0387g0
    /* renamed from: b */
    public void mo2973b(View view, Matrix matrix) {
        m2971b();
        Method method = f2433g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
