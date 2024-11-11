package androidx.transition;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.d0 */
/* loaded from: classes.dex */
class C0381d0 extends C0387g0 {

    /* renamed from: a */
    private static Method f2416a;

    /* renamed from: b */
    private static boolean f2417b;

    /* renamed from: c */
    private static Method f2418c;

    /* renamed from: d */
    private static boolean f2419d;

    /* renamed from: a */
    private void m2962a() {
        if (f2419d) {
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
            f2418c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f2419d = true;
    }

    /* renamed from: b */
    private void m2963b() {
        if (f2417b) {
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
            f2416a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f2417b = true;
    }

    @Override // androidx.transition.C0387g0
    /* renamed from: a */
    public void mo2964a(View view) {
    }

    @Override // androidx.transition.C0387g0
    /* renamed from: a */
    public void mo2965a(View view, float f) {
        m2963b();
        Method method = f2416a;
        if (method == null) {
            view.setAlpha(f);
            return;
        }
        try {
            method.invoke(view, Float.valueOf(f));
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    @Override // androidx.transition.C0387g0
    /* renamed from: b */
    public float mo2966b(View view) {
        m2962a();
        Method method = f2418c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo2966b(view);
    }

    @Override // androidx.transition.C0387g0
    /* renamed from: c */
    public void mo2967c(View view) {
    }
}
