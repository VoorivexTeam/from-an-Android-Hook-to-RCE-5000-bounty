package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p000.InterfaceC0494bv;
import p000.InterfaceC2360cv;
import p000.InterfaceC2789iv;

/* renamed from: com.google.firebase.components.l */
/* loaded from: classes.dex */
public class C2064l extends AbstractC2053a {

    /* renamed from: e */
    private static final InterfaceC2789iv<Set<Object>> f8827e = C2063k.m10552a();

    /* renamed from: a */
    private final Map<C2056d<?>, C2071s<?>> f8828a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, C2071s<?>> f8829b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C2071s<Set<?>>> f8830c = new HashMap();

    /* renamed from: d */
    private final C2070r f8831d;

    public C2064l(Executor executor, Iterable<InterfaceC2060h> iterable, C2056d<?>... c2056dArr) {
        this.f8831d = new C2070r(executor);
        ArrayList<C2056d<?>> arrayList = new ArrayList();
        arrayList.add(C2056d.m10523a(this.f8831d, C2070r.class, InterfaceC2360cv.class, InterfaceC0494bv.class));
        Iterator<InterfaceC2060h> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getComponents());
        }
        for (C2056d<?> c2056d : c2056dArr) {
            if (c2056d != null) {
                arrayList.add(c2056d);
            }
        }
        C2065m.m10560a(arrayList);
        for (C2056d<?> c2056d2 : arrayList) {
            this.f8828a.put(c2056d2, new C2071s<>(C2061i.m10550a(this, c2056d2)));
        }
        m10555a();
        m10556b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Set m10554a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((C2071s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    private void m10555a() {
        for (Map.Entry<C2056d<?>, C2071s<?>> entry : this.f8828a.entrySet()) {
            C2056d<?> key = entry.getKey();
            if (key.m10533g()) {
                C2071s<?> value = entry.getValue();
                Iterator<Class<? super Object>> it = key.m10529c().iterator();
                while (it.hasNext()) {
                    this.f8829b.put(it.next(), value);
                }
            }
        }
        m10557c();
    }

    /* renamed from: b */
    private void m10556b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<C2056d<?>, C2071s<?>> entry : this.f8828a.entrySet()) {
            C2056d<?> key = entry.getKey();
            if (!key.m10533g()) {
                C2071s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.m10529c()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f8830c.put((Class) entry2.getKey(), new C2071s<>(C2062j.m10551a((Set) entry2.getValue())));
        }
    }

    /* renamed from: c */
    private void m10557c() {
        for (C2056d<?> c2056d : this.f8828a.keySet()) {
            for (C2066n c2066n : c2056d.m10527a()) {
                if (c2066n.m10575c() && !this.f8829b.containsKey(c2066n.m10573a())) {
                    throw new C2072t(String.format("Unsatisfied dependency for component %s: %s", c2056d, c2066n.m10573a()));
                }
            }
        }
    }

    /* renamed from: a */
    public void m10558a(boolean z) {
        for (Map.Entry<C2056d<?>, C2071s<?>> entry : this.f8828a.entrySet()) {
            C2056d<?> key = entry.getKey();
            C2071s<?> value = entry.getValue();
            if (key.m10531e() || (key.m10532f() && z)) {
                value.get();
            }
        }
        this.f8831d.m10580a();
    }

    @Override // com.google.firebase.components.InterfaceC2057e
    /* renamed from: c */
    public <T> InterfaceC2789iv<T> mo10543c(Class<T> cls) {
        C2073u.m10585a(cls, "Null interface requested.");
        return this.f8829b.get(cls);
    }

    @Override // com.google.firebase.components.InterfaceC2057e
    /* renamed from: d */
    public <T> InterfaceC2789iv<Set<T>> mo10544d(Class<T> cls) {
        C2071s<Set<?>> c2071s = this.f8830c.get(cls);
        return c2071s != null ? c2071s : (InterfaceC2789iv<Set<T>>) f8827e;
    }
}
