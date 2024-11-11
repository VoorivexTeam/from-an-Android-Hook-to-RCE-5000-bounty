package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.d */
/* loaded from: classes.dex */
public final class C2056d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f8808a;

    /* renamed from: b */
    private final Set<C2066n> f8809b;

    /* renamed from: c */
    private final int f8810c;

    /* renamed from: d */
    private final int f8811d;

    /* renamed from: e */
    private final InterfaceC2059g<T> f8812e;

    /* renamed from: f */
    private final Set<Class<?>> f8813f;

    /* renamed from: com.google.firebase.components.d$b */
    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f8814a;

        /* renamed from: b */
        private final Set<C2066n> f8815b;

        /* renamed from: c */
        private int f8816c;

        /* renamed from: d */
        private int f8817d;

        /* renamed from: e */
        private InterfaceC2059g<T> f8818e;

        /* renamed from: f */
        private Set<Class<?>> f8819f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f8814a = new HashSet();
            this.f8815b = new HashSet();
            this.f8816c = 0;
            this.f8817d = 0;
            this.f8819f = new HashSet();
            C2073u.m10585a(cls, "Null interface");
            this.f8814a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C2073u.m10585a(cls2, "Null interface");
            }
            Collections.addAll(this.f8814a, clsArr);
        }

        /* renamed from: a */
        private b<T> m10534a(int i) {
            C2073u.m10587b(this.f8816c == 0, "Instantiation type has already been set.");
            this.f8816c = i;
            return this;
        }

        /* renamed from: a */
        static /* synthetic */ b m10535a(b bVar) {
            bVar.m10537d();
            return bVar;
        }

        /* renamed from: a */
        private void m10536a(Class<?> cls) {
            C2073u.m10586a(!this.f8814a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: d */
        private b<T> m10537d() {
            this.f8817d = 1;
            return this;
        }

        /* renamed from: a */
        public b<T> m10538a() {
            m10534a(1);
            return this;
        }

        /* renamed from: a */
        public b<T> m10539a(InterfaceC2059g<T> interfaceC2059g) {
            C2073u.m10585a(interfaceC2059g, "Null factory");
            this.f8818e = interfaceC2059g;
            return this;
        }

        /* renamed from: a */
        public b<T> m10540a(C2066n c2066n) {
            C2073u.m10585a(c2066n, "Null dependency");
            m10536a(c2066n.m10573a());
            this.f8815b.add(c2066n);
            return this;
        }

        /* renamed from: b */
        public C2056d<T> m10541b() {
            C2073u.m10587b(this.f8818e != null, "Missing required property: factory.");
            return new C2056d<>(new HashSet(this.f8814a), new HashSet(this.f8815b), this.f8816c, this.f8817d, this.f8818e, this.f8819f);
        }

        /* renamed from: c */
        public b<T> m10542c() {
            m10534a(2);
            return this;
        }
    }

    private C2056d(Set<Class<? super T>> set, Set<C2066n> set2, int i, int i2, InterfaceC2059g<T> interfaceC2059g, Set<Class<?>> set3) {
        this.f8808a = Collections.unmodifiableSet(set);
        this.f8809b = Collections.unmodifiableSet(set2);
        this.f8810c = i;
        this.f8811d = i2;
        this.f8812e = interfaceC2059g;
        this.f8813f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> b<T> m10520a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> b<T> m10521a(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    /* renamed from: a */
    public static <T> C2056d<T> m10522a(T t, Class<T> cls) {
        b m10525b = m10525b(cls);
        m10525b.m10539a(C2055c.m10519a(t));
        return m10525b.m10541b();
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C2056d<T> m10523a(T t, Class<T> cls, Class<? super T>... clsArr) {
        b m10521a = m10521a(cls, clsArr);
        m10521a.m10539a(C2054b.m10518a(t));
        return m10521a.m10541b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m10524a(Object obj, InterfaceC2057e interfaceC2057e) {
        return obj;
    }

    /* renamed from: b */
    public static <T> b<T> m10525b(Class<T> cls) {
        b<T> m10520a = m10520a(cls);
        b.m10535a(m10520a);
        return m10520a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ Object m10526b(Object obj, InterfaceC2057e interfaceC2057e) {
        return obj;
    }

    /* renamed from: a */
    public Set<C2066n> m10527a() {
        return this.f8809b;
    }

    /* renamed from: b */
    public InterfaceC2059g<T> m10528b() {
        return this.f8812e;
    }

    /* renamed from: c */
    public Set<Class<? super T>> m10529c() {
        return this.f8808a;
    }

    /* renamed from: d */
    public Set<Class<?>> m10530d() {
        return this.f8813f;
    }

    /* renamed from: e */
    public boolean m10531e() {
        return this.f8810c == 1;
    }

    /* renamed from: f */
    public boolean m10532f() {
        return this.f8810c == 2;
    }

    /* renamed from: g */
    public boolean m10533g() {
        return this.f8811d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f8808a.toArray()) + ">{" + this.f8810c + ", type=" + this.f8811d + ", deps=" + Arrays.toString(this.f8809b.toArray()) + "}";
    }
}
