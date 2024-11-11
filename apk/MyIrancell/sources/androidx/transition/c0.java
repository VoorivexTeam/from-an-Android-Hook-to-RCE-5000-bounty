package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import defpackage.q2;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0 {
    private static final g0 a;
    private static Field b;
    private static boolean c;
    static final Property<View, Float> d;

    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            c0.a(view, f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return q2.e(view);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            q2.a(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 22 ? new f0() : i >= 21 ? new e0() : i >= 19 ? new d0() : new g0();
        d = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    private static void a() {
        if (c) {
            return;
        }
        try {
            Field declaredField = View.class.getDeclaredField("mViewFlags");
            b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, float f) {
        a.a(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i) {
        a();
        Field field = b;
        if (field != null) {
            try {
                b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, Matrix matrix) {
        a.a(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new a0(view) : z.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Matrix matrix) {
        a.b(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return a.b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new j0(view) : new i0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        a.c(view);
    }
}
