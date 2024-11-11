package androidx.transition;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.y */
/* loaded from: classes.dex */
class C0409y {

    /* renamed from: a */
    private static Method f2537a;

    /* renamed from: b */
    private static boolean f2538b;

    /* renamed from: a */
    private static void m3062a() {
        if (f2538b) {
            return;
        }
        try {
            Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
            f2537a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f2538b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3063a(ViewGroup viewGroup, boolean z) {
        m3062a();
        Method method = f2537a;
        if (method != null) {
            try {
                method.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
