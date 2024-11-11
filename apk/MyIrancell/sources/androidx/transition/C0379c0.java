package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;
import p000.C3107q2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.transition.c0 */
/* loaded from: classes.dex */
public class C0379c0 {

    /* renamed from: a */
    private static final C0387g0 f2409a;

    /* renamed from: b */
    private static Field f2410b;

    /* renamed from: c */
    private static boolean f2411c;

    /* renamed from: d */
    static final Property<View, Float> f2412d;

    /* renamed from: androidx.transition.c0$a */
    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C0379c0.m2951c(view));
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            C0379c0.m2945a(view, f.floatValue());
        }
    }

    /* renamed from: androidx.transition.c0$b */
    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C3107q2.m14909e(view);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C3107q2.m14890a(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f2409a = i >= 22 ? new C0385f0() : i >= 21 ? new C0383e0() : i >= 19 ? new C0381d0() : new C0387g0();
        f2412d = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    private static void m2943a() {
        if (f2411c) {
            return;
        }
        try {
            Field declaredField = View.class.getDeclaredField("mViewFlags");
            f2410b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f2411c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2944a(View view) {
        f2409a.mo2964a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2945a(View view, float f) {
        f2409a.mo2965a(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2946a(View view, int i) {
        m2943a();
        Field field = f2410b;
        if (field != null) {
            try {
                f2410b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2947a(View view, int i, int i2, int i3, int i4) {
        f2409a.mo2976a(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2948a(View view, Matrix matrix) {
        f2409a.mo2972a(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC0377b0 m2949b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C0375a0(view) : C0410z.m3064c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m2950b(View view, Matrix matrix) {
        f2409a.mo2973b(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m2951c(View view) {
        return f2409a.mo2966b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static InterfaceC0395k0 m2952d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C0393j0(view) : new C0391i0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m2953e(View view) {
        f2409a.mo2967c(view);
    }
}
