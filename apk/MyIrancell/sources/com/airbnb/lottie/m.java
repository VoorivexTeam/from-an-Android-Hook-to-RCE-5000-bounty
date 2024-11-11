package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import defpackage.q9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class m<T> {
    public static Executor e = Executors.newCachedThreadPool();
    private final Set<h<T>> a;
    private final Set<h<Throwable>> b;
    private final Handler c;
    private volatile l<T> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m.this.d == null) {
                return;
            }
            l lVar = m.this.d;
            if (lVar.b() != null) {
                m.this.a((m) lVar.b());
            } else {
                m.this.a(lVar.a());
            }
        }
    }

    /* loaded from: classes.dex */
    private class b extends FutureTask<l<T>> {
        b(Callable<l<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                m.this.a((l) get());
            } catch (InterruptedException | ExecutionException e) {
                m.this.a(new l(e));
            }
        }
    }

    public m(Callable<l<T>> callable) {
        this(callable, false);
    }

    m(Callable<l<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (!z) {
            e.execute(new b(callable));
            return;
        }
        try {
            a((l) callable.call());
        } catch (Throwable th) {
            a((l) new l<>(th));
        }
    }

    private void a() {
        this.c.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l<T> lVar) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = lVar;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(T t) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            q9.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(th);
        }
    }

    public synchronized m<T> a(h<Throwable> hVar) {
        if (this.d != null && this.d.a() != null) {
            hVar.a(this.d.a());
        }
        this.b.add(hVar);
        return this;
    }

    public synchronized m<T> b(h<T> hVar) {
        if (this.d != null && this.d.b() != null) {
            hVar.a(this.d.b());
        }
        this.a.add(hVar);
        return this;
    }

    public synchronized m<T> c(h<Throwable> hVar) {
        this.b.remove(hVar);
        return this;
    }

    public synchronized m<T> d(h<T> hVar) {
        this.a.remove(hVar);
        return this;
    }
}
