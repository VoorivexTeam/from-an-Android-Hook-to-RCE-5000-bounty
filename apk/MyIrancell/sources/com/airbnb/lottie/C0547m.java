package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p000.C3116q9;

/* renamed from: com.airbnb.lottie.m */
/* loaded from: classes.dex */
public class C0547m<T> {

    /* renamed from: e */
    public static Executor f3183e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<InterfaceC0542h<T>> f3184a;

    /* renamed from: b */
    private final Set<InterfaceC0542h<Throwable>> f3185b;

    /* renamed from: c */
    private final Handler f3186c;

    /* renamed from: d */
    private volatile C0546l<T> f3187d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.m$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0547m.this.f3187d == null) {
                return;
            }
            C0546l c0546l = C0547m.this.f3187d;
            if (c0546l.m3840b() != null) {
                C0547m.this.m3847a((C0547m) c0546l.m3840b());
            } else {
                C0547m.this.m3848a(c0546l.m3839a());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.m$b */
    /* loaded from: classes.dex */
    private class b extends FutureTask<C0546l<T>> {
        b(Callable<C0546l<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                C0547m.this.m3843a((C0546l) get());
            } catch (InterruptedException | ExecutionException e) {
                C0547m.this.m3843a(new C0546l(e));
            }
        }
    }

    public C0547m(Callable<C0546l<T>> callable) {
        this(callable, false);
    }

    C0547m(Callable<C0546l<T>> callable, boolean z) {
        this.f3184a = new LinkedHashSet(1);
        this.f3185b = new LinkedHashSet(1);
        this.f3186c = new Handler(Looper.getMainLooper());
        this.f3187d = null;
        if (!z) {
            f3183e.execute(new b(callable));
            return;
        }
        try {
            m3843a((C0546l) callable.call());
        } catch (Throwable th) {
            m3843a((C0546l) new C0546l<>(th));
        }
    }

    /* renamed from: a */
    private void m3842a() {
        this.f3186c.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3843a(C0546l<T> c0546l) {
        if (this.f3187d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f3187d = c0546l;
        m3842a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m3847a(T t) {
        Iterator it = new ArrayList(this.f3184a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0542h) it.next()).mo3717a(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m3848a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f3185b);
        if (arrayList.isEmpty()) {
            C3116q9.m15003b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0542h) it.next()).mo3717a(th);
        }
    }

    /* renamed from: a */
    public synchronized C0547m<T> m3849a(InterfaceC0542h<Throwable> interfaceC0542h) {
        if (this.f3187d != null && this.f3187d.m3839a() != null) {
            interfaceC0542h.mo3717a(this.f3187d.m3839a());
        }
        this.f3185b.add(interfaceC0542h);
        return this;
    }

    /* renamed from: b */
    public synchronized C0547m<T> m3850b(InterfaceC0542h<T> interfaceC0542h) {
        if (this.f3187d != null && this.f3187d.m3840b() != null) {
            interfaceC0542h.mo3717a(this.f3187d.m3840b());
        }
        this.f3184a.add(interfaceC0542h);
        return this;
    }

    /* renamed from: c */
    public synchronized C0547m<T> m3851c(InterfaceC0542h<Throwable> interfaceC0542h) {
        this.f3185b.remove(interfaceC0542h);
        return this;
    }

    /* renamed from: d */
    public synchronized C0547m<T> m3852d(InterfaceC0542h<T> interfaceC0542h) {
        this.f3184a.remove(interfaceC0542h);
        return this;
    }
}
