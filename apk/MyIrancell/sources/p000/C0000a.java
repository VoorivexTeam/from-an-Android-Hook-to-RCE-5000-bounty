package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0175i;
import androidx.core.content.C0237b;
import java.util.WeakHashMap;

/* renamed from: a */
/* loaded from: classes.dex */
public final class C0000a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f0a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<a>> f1b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final ColorStateList f3a;

        /* renamed from: b */
        final Configuration f4b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f3a = colorStateList;
            this.f4b = configuration;
        }
    }

    /* renamed from: a */
    private static ColorStateList m0a(Context context, int i) {
        a aVar;
        synchronized (f2c) {
            SparseArray<a> sparseArray = f1b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                if (aVar.f4b.equals(context.getResources().getConfiguration())) {
                    return aVar.f3a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static TypedValue m1a() {
        TypedValue typedValue = f0a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f0a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m2a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2c) {
            SparseArray<a> sparseArray = f1b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f1b.put(context, sparseArray);
            }
            sparseArray.append(i, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static ColorStateList m3b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList m0a = m0a(context, i);
        if (m0a != null) {
            return m0a;
        }
        ColorStateList m5d = m5d(context, i);
        if (m5d == null) {
            return C0237b.m1463b(context, i);
        }
        m2a(context, i, m5d);
        return m5d;
    }

    /* renamed from: c */
    public static Drawable m4c(Context context, int i) {
        return C0175i.m1020a().m1039a(context, i);
    }

    /* renamed from: d */
    private static ColorStateList m5d(Context context, int i) {
        if (m6e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C2835k0.m13526a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m6e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue m1a = m1a();
        resources.getValue(i, m1a, true);
        int i2 = m1a.type;
        return i2 >= 28 && i2 <= 31;
    }
}
