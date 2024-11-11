package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g5 extends d6 {
    private static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    private k5 c;
    private k5 d;
    private final PriorityBlockingQueue<h5<?>> e;
    private final BlockingQueue<h5<?>> f;
    private final Thread.UncaughtExceptionHandler g;
    private final Thread.UncaughtExceptionHandler h;
    private final Object i;
    private final Semaphore j;
    private volatile boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g5(j5 j5Var) {
        super(j5Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue<>();
        this.f = new LinkedBlockingQueue();
        this.g = new i5(this, "Thread death: Uncaught exception on worker thread");
        this.h = new i5(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ k5 a(g5 g5Var, k5 k5Var) {
        g5Var.c = null;
        return null;
    }

    private final void a(h5<?> h5Var) {
        synchronized (this.i) {
            this.e.add(h5Var);
            if (this.c == null) {
                k5 k5Var = new k5(this, "Measurement Worker", this.e);
                this.c = k5Var;
                k5Var.setUncaughtExceptionHandler(this.g);
                this.c.start();
            } else {
                this.c.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ k5 b(g5 g5Var, k5 k5Var) {
        g5Var.d = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> T a(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            g().a(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                h4 w = k().w();
                String valueOf = String.valueOf(str);
                w.a(valueOf.length() != 0 ? "Interrupted waiting for ".concat(valueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            h4 w2 = k().w();
            String valueOf2 = String.valueOf(str);
            w2.a(valueOf2.length() != 0 ? "Timed out waiting for ".concat(valueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final <V> Future<V> a(Callable<V> callable) {
        o();
        com.google.android.gms.common.internal.u.a(callable);
        h5<?> h5Var = new h5<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                k().w().a("Callable skipped the worker queue.");
            }
            h5Var.run();
        } else {
            a(h5Var);
        }
        return h5Var;
    }

    public final void a(Runnable runnable) {
        o();
        com.google.android.gms.common.internal.u.a(runnable);
        a(new h5<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final <V> Future<V> b(Callable<V> callable) {
        o();
        com.google.android.gms.common.internal.u.a(callable);
        h5<?> h5Var = new h5<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            h5Var.run();
        } else {
            a(h5Var);
        }
        return h5Var;
    }

    @Override // com.google.android.gms.measurement.internal.f6
    public final void b() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void b(Runnable runnable) {
        o();
        com.google.android.gms.common.internal.u.a(runnable);
        h5<?> h5Var = new h5<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            this.f.add(h5Var);
            if (this.d == null) {
                k5 k5Var = new k5(this, "Measurement Network", this.f);
                this.d = k5Var;
                k5Var.setUncaughtExceptionHandler(this.h);
                this.d.start();
            } else {
                this.d.a();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.f6
    public final void c() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.d6
    protected final boolean r() {
        return false;
    }

    public final boolean t() {
        return Thread.currentThread() == this.c;
    }
}
