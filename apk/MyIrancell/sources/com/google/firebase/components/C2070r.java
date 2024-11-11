package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p000.C3542zu;
import p000.InterfaceC0437av;
import p000.InterfaceC0494bv;
import p000.InterfaceC2360cv;

/* renamed from: com.google.firebase.components.r */
/* loaded from: classes.dex */
class C2070r implements InterfaceC2360cv, InterfaceC0494bv {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<InterfaceC0437av<Object>, Executor>> f8842a = new HashMap();

    /* renamed from: b */
    private Queue<C3542zu<?>> f8843b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f8844c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2070r(Executor executor) {
        this.f8844c = executor;
    }

    /* renamed from: b */
    private synchronized Set<Map.Entry<InterfaceC0437av<Object>, Executor>> m10579b(C3542zu<?> c3542zu) {
        ConcurrentHashMap<InterfaceC0437av<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f8842a.get(c3542zu.m16956b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10580a() {
        Queue<C3542zu<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.f8843b != null) {
                Queue<C3542zu<?>> queue2 = this.f8843b;
                this.f8843b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            Iterator<C3542zu<?>> it = queue.iterator();
            while (it.hasNext()) {
                m10583a(it.next());
            }
        }
    }

    @Override // p000.InterfaceC2360cv
    /* renamed from: a */
    public <T> void mo10581a(Class<T> cls, InterfaceC0437av<? super T> interfaceC0437av) {
        mo10582a(cls, this.f8844c, interfaceC0437av);
    }

    @Override // p000.InterfaceC2360cv
    /* renamed from: a */
    public synchronized <T> void mo10582a(Class<T> cls, Executor executor, InterfaceC0437av<? super T> interfaceC0437av) {
        C2073u.m10584a(cls);
        C2073u.m10584a(interfaceC0437av);
        C2073u.m10584a(executor);
        if (!this.f8842a.containsKey(cls)) {
            this.f8842a.put(cls, new ConcurrentHashMap<>());
        }
        this.f8842a.get(cls).put(interfaceC0437av, executor);
    }

    /* renamed from: a */
    public void m10583a(C3542zu<?> c3542zu) {
        C2073u.m10584a(c3542zu);
        synchronized (this) {
            if (this.f8843b != null) {
                this.f8843b.add(c3542zu);
                return;
            }
            for (Map.Entry<InterfaceC0437av<Object>, Executor> entry : m10579b(c3542zu)) {
                entry.getValue().execute(RunnableC2069q.m10577a(entry, c3542zu));
            }
        }
    }
}
