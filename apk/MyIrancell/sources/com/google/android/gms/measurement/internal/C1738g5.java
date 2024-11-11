package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
/* loaded from: classes.dex */
public final class C1738g5 extends AbstractC1703d6 {

    /* renamed from: l */
    private static final AtomicLong f7566l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    private C1786k5 f7567c;

    /* renamed from: d */
    private C1786k5 f7568d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C1750h5<?>> f7569e;

    /* renamed from: f */
    private final BlockingQueue<C1750h5<?>> f7570f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f7571g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f7572h;

    /* renamed from: i */
    private final Object f7573i;

    /* renamed from: j */
    private final Semaphore f7574j;

    /* renamed from: k */
    private volatile boolean f7575k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1738g5(C1774j5 c1774j5) {
        super(c1774j5);
        this.f7573i = new Object();
        this.f7574j = new Semaphore(2);
        this.f7569e = new PriorityBlockingQueue<>();
        this.f7570f = new LinkedBlockingQueue();
        this.f7571g = new C1762i5(this, "Thread death: Uncaught exception on worker thread");
        this.f7572h = new C1762i5(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ C1786k5 m9333a(C1738g5 c1738g5, C1786k5 c1786k5) {
        c1738g5.f7567c = null;
        return null;
    }

    /* renamed from: a */
    private final void m9335a(C1750h5<?> c1750h5) {
        synchronized (this.f7573i) {
            this.f7569e.add(c1750h5);
            if (this.f7567c == null) {
                C1786k5 c1786k5 = new C1786k5(this, "Measurement Worker", this.f7569e);
                this.f7567c = c1786k5;
                c1786k5.setUncaughtExceptionHandler(this.f7571g);
                this.f7567c.start();
            } else {
                this.f7567c.m9457a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ C1786k5 m9336b(C1738g5 c1738g5, C1786k5 c1786k5) {
        c1738g5.f7568d = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> T m9342a(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            mo9320g().m9344a(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                C1749h4 m9312w = mo9324k().m9312w();
                String valueOf = String.valueOf(str);
                m9312w.m9365a(valueOf.length() != 0 ? "Interrupted waiting for ".concat(valueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            C1749h4 m9312w2 = mo9324k().m9312w();
            String valueOf2 = String.valueOf(str);
            m9312w2.m9365a(valueOf2.length() != 0 ? "Timed out waiting for ".concat(valueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    /* renamed from: a */
    public final <V> Future<V> m9343a(Callable<V> callable) {
        m9220o();
        C1057u.m7286a(callable);
        C1750h5<?> c1750h5 = new C1750h5<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7567c) {
            if (!this.f7569e.isEmpty()) {
                mo9324k().m9312w().m9365a("Callable skipped the worker queue.");
            }
            c1750h5.run();
        } else {
            m9335a(c1750h5);
        }
        return c1750h5;
    }

    /* renamed from: a */
    public final void m9344a(Runnable runnable) {
        m9220o();
        C1057u.m7286a(runnable);
        m9335a(new C1750h5<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: b */
    public final <V> Future<V> m9345b(Callable<V> callable) {
        m9220o();
        C1057u.m7286a(callable);
        C1750h5<?> c1750h5 = new C1750h5<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7567c) {
            c1750h5.run();
        } else {
            m9335a(c1750h5);
        }
        return c1750h5;
    }

    @Override // com.google.android.gms.measurement.internal.C1727f6
    /* renamed from: b */
    public final void mo9316b() {
        if (Thread.currentThread() != this.f7568d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: b */
    public final void m9346b(Runnable runnable) {
        m9220o();
        C1057u.m7286a(runnable);
        C1750h5<?> c1750h5 = new C1750h5<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f7573i) {
            this.f7570f.add(c1750h5);
            if (this.f7568d == null) {
                C1786k5 c1786k5 = new C1786k5(this, "Measurement Network", this.f7570f);
                this.f7568d = c1786k5;
                c1786k5.setUncaughtExceptionHandler(this.f7572h);
                this.f7568d.start();
            } else {
                this.f7568d.m9457a();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.C1727f6
    /* renamed from: c */
    public final void mo9194c() {
        if (Thread.currentThread() != this.f7567c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1703d6
    /* renamed from: r */
    protected final boolean mo9123r() {
        return false;
    }

    /* renamed from: t */
    public final boolean m9347t() {
        return Thread.currentThread() == this.f7567c;
    }
}
