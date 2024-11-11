package com.google.firebase.components;

import defpackage.av;
import defpackage.bv;
import defpackage.cv;
import defpackage.zu;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class r implements cv, bv {
    private final Map<Class<?>, ConcurrentHashMap<av<Object>, Executor>> a = new HashMap();
    private Queue<zu<?>> b = new ArrayDeque();
    private final Executor c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Map.Entry<av<Object>, Executor>> b(zu<?> zuVar) {
        ConcurrentHashMap<av<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.a.get(zuVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Queue<zu<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.b != null) {
                Queue<zu<?>> queue2 = this.b;
                this.b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            Iterator<zu<?>> it = queue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    @Override // defpackage.cv
    public <T> void a(Class<T> cls, av<? super T> avVar) {
        a(cls, this.c, avVar);
    }

    @Override // defpackage.cv
    public synchronized <T> void a(Class<T> cls, Executor executor, av<? super T> avVar) {
        u.a(cls);
        u.a(avVar);
        u.a(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(avVar, executor);
    }

    public void a(zu<?> zuVar) {
        u.a(zuVar);
        synchronized (this) {
            if (this.b != null) {
                this.b.add(zuVar);
                return;
            }
            for (Map.Entry<av<Object>, Executor> entry : b(zuVar)) {
                entry.getValue().execute(q.a(entry, zuVar));
            }
        }
    }
}
