package com.google.firebase.components;

import defpackage.bv;
import defpackage.iv;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v extends com.google.firebase.components.a {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final e f;

    /* loaded from: classes.dex */
    private static class a implements bv {
        public a(Set<Class<?>> set, bv bvVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n nVar : dVar.a()) {
            if (nVar.b()) {
                boolean d = nVar.d();
                Class<?> a2 = nVar.a();
                if (d) {
                    hashSet3.add(a2);
                } else {
                    hashSet.add(a2);
                }
            } else {
                boolean d2 = nVar.d();
                Class<?> a3 = nVar.a();
                if (d2) {
                    hashSet4.add(a3);
                } else {
                    hashSet2.add(a3);
                }
            }
        }
        if (!dVar.d().isEmpty()) {
            hashSet.add(bv.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = dVar.d();
        this.f = eVar;
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public <T> T a(Class<T> cls) {
        if (!this.a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f.a(cls);
        return !cls.equals(bv.class) ? t : (T) new a(this.e, (bv) t);
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public <T> Set<T> b(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.e
    public <T> iv<T> c(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.e
    public <T> iv<Set<T>> d(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
