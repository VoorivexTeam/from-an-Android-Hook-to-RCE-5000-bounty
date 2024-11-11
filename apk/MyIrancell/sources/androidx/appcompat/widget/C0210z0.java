package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.C3107q2;

/* renamed from: androidx.appcompat.widget.z0 */
/* loaded from: classes.dex */
public class C0210z0 {

    /* renamed from: a */
    private static Method f1319a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1319a = declaredMethod;
                if (declaredMethod.isAccessible()) {
                    return;
                }
                f1319a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1243a(View view, Rect rect, Rect rect2) {
        Method method = f1319a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1244a(View view) {
        return C3107q2.m14919k(view) == 1;
    }

    /* renamed from: b */
    public static void m1245b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }
}
