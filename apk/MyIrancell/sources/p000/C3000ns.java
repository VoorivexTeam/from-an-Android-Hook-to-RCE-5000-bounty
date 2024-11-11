package p000;

import com.google.android.gms.common.internal.C1057u;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ns */
/* loaded from: classes.dex */
public final class C3000ns {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ns$a */
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a */
        private final CountDownLatch f12352a;

        private a() {
            this.f12352a = new CountDownLatch(1);
        }

        /* synthetic */ a(RunnableC2525gt runnableC2525gt) {
            this();
        }

        @Override // p000.InterfaceC2443es
        /* renamed from: a */
        public final void mo3188a() {
            this.f12352a.countDown();
        }

        @Override // p000.InterfaceC2524gs
        /* renamed from: a */
        public final void mo3189a(Exception exc) {
            this.f12352a.countDown();
        }

        @Override // p000.InterfaceC2564hs
        /* renamed from: a */
        public final void mo3190a(Object obj) {
            this.f12352a.countDown();
        }

        /* renamed from: a */
        public final boolean m14389a(long j, TimeUnit timeUnit) {
            return this.f12352a.await(j, timeUnit);
        }

        /* renamed from: b */
        public final void m14390b() {
            this.f12352a.await();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ns$b */
    /* loaded from: classes.dex */
    public interface b extends InterfaceC2443es, InterfaceC2524gs, InterfaceC2564hs<Object> {
    }

    /* renamed from: a */
    public static <TResult> TResult m14383a(AbstractC2871ks<TResult> abstractC2871ks) {
        C1057u.m7289a();
        C1057u.m7287a(abstractC2871ks, "Task must not be null");
        if (abstractC2871ks.mo11824d()) {
            return (TResult) m14388b(abstractC2871ks);
        }
        a aVar = new a(null);
        m14387a((AbstractC2871ks<?>) abstractC2871ks, (b) aVar);
        aVar.m14390b();
        return (TResult) m14388b(abstractC2871ks);
    }

    /* renamed from: a */
    public static <TResult> TResult m14384a(AbstractC2871ks<TResult> abstractC2871ks, long j, TimeUnit timeUnit) {
        C1057u.m7289a();
        C1057u.m7287a(abstractC2871ks, "Task must not be null");
        C1057u.m7287a(timeUnit, "TimeUnit must not be null");
        if (abstractC2871ks.mo11824d()) {
            return (TResult) m14388b(abstractC2871ks);
        }
        a aVar = new a(null);
        m14387a((AbstractC2871ks<?>) abstractC2871ks, (b) aVar);
        if (aVar.m14389a(j, timeUnit)) {
            return (TResult) m14388b(abstractC2871ks);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    public static <TResult> AbstractC2871ks<TResult> m14385a(TResult tresult) {
        C2485ft c2485ft = new C2485ft();
        c2485ft.m11818a((C2485ft) tresult);
        return c2485ft;
    }

    /* renamed from: a */
    public static <TResult> AbstractC2871ks<TResult> m14386a(Executor executor, Callable<TResult> callable) {
        C1057u.m7287a(executor, "Executor must not be null");
        C1057u.m7287a(callable, "Callback must not be null");
        C2485ft c2485ft = new C2485ft();
        executor.execute(new RunnableC2525gt(c2485ft, callable));
        return c2485ft;
    }

    /* renamed from: a */
    private static void m14387a(AbstractC2871ks<?> abstractC2871ks, b bVar) {
        abstractC2871ks.mo11815a(C2954ms.f12178b, (InterfaceC2564hs<? super Object>) bVar);
        abstractC2871ks.mo11814a(C2954ms.f12178b, (InterfaceC2524gs) bVar);
        abstractC2871ks.mo11812a(C2954ms.f12178b, (InterfaceC2443es) bVar);
    }

    /* renamed from: b */
    private static <TResult> TResult m14388b(AbstractC2871ks<TResult> abstractC2871ks) {
        if (abstractC2871ks.mo11825e()) {
            return abstractC2871ks.mo11819b();
        }
        if (abstractC2871ks.mo11823c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC2871ks.mo11802a());
    }
}
