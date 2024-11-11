package androidx.lifecycle;

import androidx.lifecycle.AbstractC0299e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
class C0295a {

    /* renamed from: c */
    static C0295a f1900c = new C0295a();

    /* renamed from: a */
    private final Map<Class, a> f1901a = new HashMap();

    /* renamed from: b */
    private final Map<Class, Boolean> f1902b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Map<AbstractC0299e.a, List<b>> f1903a = new HashMap();

        /* renamed from: b */
        final Map<b, AbstractC0299e.a> f1904b;

        a(Map<b, AbstractC0299e.a> map) {
            this.f1904b = map;
            for (Map.Entry<b, AbstractC0299e.a> entry : map.entrySet()) {
                AbstractC0299e.a value = entry.getValue();
                List<b> list = this.f1903a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f1903a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        private static void m2025a(List<b> list, InterfaceC0301g interfaceC0301g, AbstractC0299e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m2027a(interfaceC0301g, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m2026a(InterfaceC0301g interfaceC0301g, AbstractC0299e.a aVar, Object obj) {
            m2025a(this.f1903a.get(aVar), interfaceC0301g, aVar, obj);
            m2025a(this.f1903a.get(AbstractC0299e.a.ON_ANY), interfaceC0301g, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final int f1905a;

        /* renamed from: b */
        final Method f1906b;

        b(int i, Method method) {
            this.f1905a = i;
            this.f1906b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m2027a(InterfaceC0301g interfaceC0301g, AbstractC0299e.a aVar, Object obj) {
            try {
                int i = this.f1905a;
                if (i == 0) {
                    this.f1906b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f1906b.invoke(obj, interfaceC0301g);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f1906b.invoke(obj, interfaceC0301g, aVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1905a == bVar.f1905a && this.f1906b.getName().equals(bVar.f1906b.getName());
        }

        public int hashCode() {
            return (this.f1905a * 31) + this.f1906b.getName().hashCode();
        }
    }

    C0295a() {
    }

    /* renamed from: a */
    private a m2020a(Class cls, Method[] methodArr) {
        int i;
        a m2023a;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m2023a = m2023a(superclass)) != null) {
            hashMap.putAll(m2023a.f1904b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0299e.a> entry : m2023a(cls2).f1904b.entrySet()) {
                m2021a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m2022c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0308n interfaceC0308n = (InterfaceC0308n) method.getAnnotation(InterfaceC0308n.class);
            if (interfaceC0308n != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0301g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC0299e.a value = interfaceC0308n.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0299e.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC0299e.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m2021a(hashMap, new b(i, method), value, cls);
                z = true;
            }
        }
        a aVar = new a(hashMap);
        this.f1901a.put(cls, aVar);
        this.f1902b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private void m2021a(Map<b, AbstractC0299e.a> map, b bVar, AbstractC0299e.a aVar, Class cls) {
        AbstractC0299e.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f1906b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* renamed from: c */
    private Method[] m2022c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public a m2023a(Class cls) {
        a aVar = this.f1901a.get(cls);
        return aVar != null ? aVar : m2020a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m2024b(Class cls) {
        if (this.f1902b.containsKey(cls)) {
            return this.f1902b.get(cls).booleanValue();
        }
        Method[] m2022c = m2022c(cls);
        for (Method method : m2022c) {
            if (((InterfaceC0308n) method.getAnnotation(InterfaceC0308n.class)) != null) {
                m2020a(cls, m2022c);
                return true;
            }
        }
        this.f1902b.put(cls, false);
        return false;
    }
}
