package p000;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: l1 */
/* loaded from: classes.dex */
public final class C2881l1 {

    /* renamed from: a */
    private static Method f11794a;

    /* renamed from: b */
    private static Method f11795b;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                f11795b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                return;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f11794a = cls.getMethod("getScript", String.class);
                f11795b = cls.getMethod("addLikelySubtags", String.class);
            }
        } catch (Exception unused) {
            f11794a = null;
            f11795b = null;
        }
    }

    /* renamed from: a */
    private static String m13782a(String str) {
        try {
            if (f11794a != null) {
                return (String) f11794a.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static String m13783a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f11795b != null) {
                return (String) f11795b.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    /* renamed from: b */
    public static String m13784b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f11795b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        }
        String m13783a = m13783a(locale);
        if (m13783a != null) {
            return m13782a(m13783a);
        }
        return null;
    }
}
