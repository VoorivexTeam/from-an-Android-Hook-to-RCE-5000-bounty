package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.c */
/* loaded from: classes.dex */
public final class C0225c {

    /* renamed from: androidx.core.app.c$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private static Method f1376a;

        /* renamed from: b */
        private static boolean f1377b;

        /* renamed from: a */
        public static IBinder m1370a(Bundle bundle, String str) {
            if (!f1377b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f1376a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f1377b = true;
            }
            Method method2 = f1376a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f1376a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static IBinder m1369a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : a.m1370a(bundle, str);
    }
}
