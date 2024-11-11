package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.f0 */
/* loaded from: classes.dex */
class C0385f0 extends C0383e0 {

    /* renamed from: i */
    private static Method f2435i;

    /* renamed from: j */
    private static boolean f2436j;

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m2975a() {
        if (f2436j) {
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            f2435i = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f2436j = true;
    }

    @Override // androidx.transition.C0387g0
    /* renamed from: a */
    public void mo2976a(View view, int i, int i2, int i3, int i4) {
        m2975a();
        Method method = f2435i;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
