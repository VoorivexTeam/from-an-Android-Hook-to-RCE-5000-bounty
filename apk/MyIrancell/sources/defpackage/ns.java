package defpackage;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class ns {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements b {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        /* synthetic */ a(gt gtVar) {
            this();
        }

        @Override // defpackage.es
        public final void a() {
            this.a.countDown();
        }

        @Override // defpackage.gs
        public final void a(Exception exc) {
            this.a.countDown();
        }

        @Override // defpackage.hs
        public final void a(Object obj) {
            this.a.countDown();
        }

        public final boolean a(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }

        public final void b() {
            this.a.await();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b extends es, gs, hs<Object> {
    }

    public static <TResult> TResult a(ks<TResult> ksVar) {
        u.a();
        u.a(ksVar, "Task must not be null");
        if (ksVar.d()) {
            return (TResult) b(ksVar);
        }
        a aVar = new a(null);
        a((ks<?>) ksVar, (b) aVar);
        aVar.b();
        return (TResult) b(ksVar);
    }

    public static <TResult> TResult a(ks<TResult> ksVar, long j, TimeUnit timeUnit) {
        u.a();
        u.a(ksVar, "Task must not be null");
        u.a(timeUnit, "TimeUnit must not be null");
        if (ksVar.d()) {
            return (TResult) b(ksVar);
        }
        a aVar = new a(null);
        a((ks<?>) ksVar, (b) aVar);
        if (aVar.a(j, timeUnit)) {
            return (TResult) b(ksVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> ks<TResult> a(TResult tresult) {
        ft ftVar = new ft();
        ftVar.a((ft) tresult);
        return ftVar;
    }

    public static <TResult> ks<TResult> a(Executor executor, Callable<TResult> callable) {
        u.a(executor, "Executor must not be null");
        u.a(callable, "Callback must not be null");
        ft ftVar = new ft();
        executor.execute(new gt(ftVar, callable));
        return ftVar;
    }

    private static void a(ks<?> ksVar, b bVar) {
        ksVar.a(ms.b, (hs<? super Object>) bVar);
        ksVar.a(ms.b, (gs) bVar);
        ksVar.a(ms.b, (es) bVar);
    }

    private static <TResult> TResult b(ks<TResult> ksVar) {
        if (ksVar.e()) {
            return ksVar.b();
        }
        if (ksVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(ksVar.a());
    }
}
