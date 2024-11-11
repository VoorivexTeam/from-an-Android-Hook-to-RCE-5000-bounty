package p000;

import android.os.Build;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: d2 */
/* loaded from: classes.dex */
public final class C2371d2 {

    /* renamed from: a */
    private static Field f9641a;

    /* renamed from: b */
    private static boolean f9642b;

    /* renamed from: a */
    private static void m11248a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f9642b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f9641a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                String str = "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.";
            }
            f9642b = true;
        }
        Field field = f9641a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                String str2 = "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.";
            }
        }
    }

    /* renamed from: b */
    public static void m11249b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m11248a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m11248a(layoutInflater, factory2);
            }
        }
    }
}
