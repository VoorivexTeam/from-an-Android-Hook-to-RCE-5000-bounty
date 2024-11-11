package com.google.firebase.components;

import defpackage.bv;
import defpackage.cv;
import defpackage.iv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class l extends a {
    private static final iv<Set<Object>> e = k.a();
    private final Map<d<?>, s<?>> a = new HashMap();
    private final Map<Class<?>, s<?>> b = new HashMap();
    private final Map<Class<?>, s<Set<?>>> c = new HashMap();
    private final r d;

    public l(Executor executor, Iterable<h> iterable, d<?>... dVarArr) {
        this.d = new r(executor);
        ArrayList<d<?>> arrayList = new ArrayList();
        arrayList.add(d.a(this.d, r.class, cv.class, bv.class));
        Iterator<h> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getComponents());
        }
        for (d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        m.a(arrayList);
        for (d<?> dVar2 : arrayList) {
            this.a.put(dVar2, new s<>(i.a(this, dVar2)));
        }
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void a() {
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            if (key.g()) {
                s<?> value = entry.getValue();
                Iterator<Class<? super Object>> it = key.c().iterator();
                while (it.hasNext()) {
                    this.b.put(it.next(), value);
                }
            }
        }
        c();
    }

    private void b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.g()) {
                s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.c()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.c.put((Class) entry2.getKey(), new s<>(j.a((Set) entry2.getValue())));
        }
    }

    private void c() {
        for (d<?> dVar : this.a.keySet()) {
            for (n nVar : dVar.a()) {
                if (nVar.c() && !this.b.containsKey(nVar.a())) {
                    throw new t(String.format("Unsatisfied dependency for component %s: %s", dVar, nVar.a()));
                }
            }
        }
    }

    public void a(boolean z) {
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            s<?> value = entry.getValue();
            if (key.e() || (key.f() && z)) {
                value.get();
            }
        }
        this.d.a();
    }

    @Override // com.google.firebase.components.e
    public <T> iv<T> c(Class<T> cls) {
        u.a(cls, "Null interface requested.");
        return this.b.get(cls);
    }

    @Override // com.google.firebase.components.e
    public <T> iv<Set<T>> d(Class<T> cls) {
        s<Set<?>> sVar = this.c.get(cls);
        return sVar != null ? sVar : (iv<Set<T>>) e;
    }
}
