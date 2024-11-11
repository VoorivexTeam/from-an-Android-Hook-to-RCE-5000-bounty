package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public class C0304j {

    /* renamed from: a */
    private static Map<Class, Integer> f1918a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends InterfaceC0297c>>> f1919b = new HashMap();

    /* renamed from: a */
    private static InterfaceC0297c m2053a(Constructor<? extends InterfaceC0297c> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC0298d m2054a(Object obj) {
        if (obj instanceof InterfaceC0296b) {
            return new FullLifecycleObserverAdapter((InterfaceC0296b) obj);
        }
        if (obj instanceof InterfaceC0298d) {
            return (InterfaceC0298d) obj;
        }
        Class<?> cls = obj.getClass();
        if (m2057b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends InterfaceC0297c>> list = f1919b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m2053a(list.get(0), obj));
        }
        InterfaceC0297c[] interfaceC0297cArr = new InterfaceC0297c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            interfaceC0297cArr[i] = m2053a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0297cArr);
    }

    /* renamed from: a */
    public static String m2055a(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: a */
    private static Constructor<? extends InterfaceC0297c> m2056a(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String m2055a = m2055a(canonicalName);
            if (!name.isEmpty()) {
                m2055a = name + "." + m2055a;
            }
            Constructor declaredConstructor = Class.forName(m2055a).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m2057b(Class<?> cls) {
        if (f1918a.containsKey(cls)) {
            return f1918a.get(cls).intValue();
        }
        int m2059d = m2059d(cls);
        f1918a.put(cls, Integer.valueOf(m2059d));
        return m2059d;
    }

    /* renamed from: c */
    private static boolean m2058c(Class<?> cls) {
        return cls != null && InterfaceC0300f.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m2059d(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0297c> m2056a = m2056a(cls);
        if (m2056a != null) {
            f1919b.put(cls, Collections.singletonList(m2056a));
            return 2;
        }
        if (C0295a.f1900c.m2024b(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (m2058c(superclass)) {
            if (m2057b(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f1919b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (m2058c(cls2)) {
                if (m2057b(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f1919b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f1919b.put(cls, arrayList);
        return 2;
    }
}
