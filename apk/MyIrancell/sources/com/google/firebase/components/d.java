package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d<T> {
    private final Set<Class<? super T>> a;
    private final Set<n> b;
    private final int c;
    private final int d;
    private final g<T> e;
    private final Set<Class<?>> f;

    /* loaded from: classes.dex */
    public static class b<T> {
        private final Set<Class<? super T>> a;
        private final Set<n> b;
        private int c;
        private int d;
        private g<T> e;
        private Set<Class<?>> f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.a = new HashSet();
            this.b = new HashSet();
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            u.a(cls, "Null interface");
            this.a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                u.a(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        private b<T> a(int i) {
            u.b(this.c == 0, "Instantiation type has already been set.");
            this.c = i;
            return this;
        }

        static /* synthetic */ b a(b bVar) {
            bVar.d();
            return bVar;
        }

        private void a(Class<?> cls) {
            u.a(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        private b<T> d() {
            this.d = 1;
            return this;
        }

        public b<T> a() {
            a(1);
            return this;
        }

        public b<T> a(g<T> gVar) {
            u.a(gVar, "Null factory");
            this.e = gVar;
            return this;
        }

        public b<T> a(n nVar) {
            u.a(nVar, "Null dependency");
            a(nVar.a());
            this.b.add(nVar);
            return this;
        }

        public d<T> b() {
            u.b(this.e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f);
        }

        public b<T> c() {
            a(2);
            return this;
        }
    }

    private d(Set<Class<? super T>> set, Set<n> set2, int i, int i2, g<T> gVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.d = i2;
        this.e = gVar;
        this.f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> a(T t, Class<T> cls) {
        b b2 = b(cls);
        b2.a(c.a(t));
        return b2.b();
    }

    @SafeVarargs
    public static <T> d<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        b a2 = a(cls, clsArr);
        a2.a(com.google.firebase.components.b.a(t));
        return a2.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(Object obj, e eVar) {
        return obj;
    }

    public static <T> b<T> b(Class<T> cls) {
        b<T> a2 = a(cls);
        b.a(a2);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object b(Object obj, e eVar) {
        return obj;
    }

    public Set<n> a() {
        return this.b;
    }

    public g<T> b() {
        return this.e;
    }

    public Set<Class<? super T>> c() {
        return this.a;
    }

    public Set<Class<?>> d() {
        return this.f;
    }

    public boolean e() {
        return this.c == 1;
    }

    public boolean f() {
        return this.c == 2;
    }

    public boolean g() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
