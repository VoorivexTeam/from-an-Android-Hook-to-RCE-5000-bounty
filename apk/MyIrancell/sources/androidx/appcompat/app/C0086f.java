package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.f */
/* loaded from: classes.dex */
class C0086f {

    /* renamed from: a */
    private static Field f420a;

    /* renamed from: b */
    private static boolean f421b;

    /* renamed from: c */
    private static Class f422c;

    /* renamed from: d */
    private static boolean f423d;

    /* renamed from: e */
    private static Field f424e;

    /* renamed from: f */
    private static boolean f425f;

    /* renamed from: g */
    private static Field f426g;

    /* renamed from: h */
    private static boolean f427h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m503a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m507d(resources);
        } else if (i >= 23) {
            m506c(resources);
        } else if (i >= 21) {
            m505b(resources);
        }
    }

    /* renamed from: a */
    private static void m504a(Object obj) {
        if (!f423d) {
            try {
                f422c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f423d = true;
        }
        Class cls = f422c;
        if (cls == null) {
            return;
        }
        if (!f425f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f424e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f425f = true;
        }
        Field field = f424e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* renamed from: b */
    private static void m505b(Resources resources) {
        if (!f421b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f420a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f421b = true;
        }
        Field field = f420a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m506c(Resources resources) {
        if (!f421b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f420a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f421b = true;
        }
        Object obj = null;
        Field field = f420a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
        }
        if (obj == null) {
            return;
        }
        m504a(obj);
    }

    /* renamed from: d */
    private static void m507d(Resources resources) {
        Object obj;
        if (!f427h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f426g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f427h = true;
        }
        Field field = f426g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f421b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f420a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f421b = true;
        }
        Field field2 = f420a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            m504a(obj2);
        }
    }
}
