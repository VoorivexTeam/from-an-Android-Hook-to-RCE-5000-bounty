package p000;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w3 */
/* loaded from: classes.dex */
abstract class AbstractC3383w3<Params, Progress, Result> {

    /* renamed from: g */
    private static final ThreadFactory f13739g = new a();

    /* renamed from: h */
    private static final BlockingQueue<Runnable> f13740h = new LinkedBlockingQueue(10);

    /* renamed from: i */
    public static final Executor f13741i = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f13740h, f13739g);

    /* renamed from: j */
    private static f f13742j;

    /* renamed from: d */
    private volatile g f13745d = g.PENDING;

    /* renamed from: e */
    final AtomicBoolean f13746e = new AtomicBoolean();

    /* renamed from: f */
    final AtomicBoolean f13747f = new AtomicBoolean();

    /* renamed from: b */
    private final h<Params, Result> f13743b = new b();

    /* renamed from: c */
    private final FutureTask<Result> f13744c = new c(this.f13743b);

    /* renamed from: w3$a */
    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f13748a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f13748a.getAndIncrement());
        }
    }

    /* renamed from: w3$b */
    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            AbstractC3383w3.this.f13747f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC3383w3.this.mo15507a((Object[]) this.f13754a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: w3$c */
    /* loaded from: classes.dex */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC3383w3.this.m16128e(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                AbstractC3383w3.this.m16128e(null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: w3$d */
    /* loaded from: classes.dex */
    static /* synthetic */ class d {

        /* renamed from: a */
        static final /* synthetic */ int[] f13751a;

        static {
            int[] iArr = new int[g.values().length];
            f13751a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13751a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w3$e */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a */
        final AbstractC3383w3 f13752a;

        /* renamed from: b */
        final Data[] f13753b;

        e(AbstractC3383w3 abstractC3383w3, Data... dataArr) {
            this.f13752a = abstractC3383w3;
            this.f13753b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w3$f */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f13752a.m16121a((AbstractC3383w3) eVar.f13753b[0]);
            } else {
                if (i != 2) {
                    return;
                }
                eVar.f13752a.m16125b((Object[]) eVar.f13753b);
            }
        }
    }

    /* renamed from: w3$g */
    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: w3$h */
    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f13754a;

        h() {
        }
    }

    /* renamed from: d */
    private static Handler m16119d() {
        f fVar;
        synchronized (AbstractC3383w3.class) {
            if (f13742j == null) {
                f13742j = new f();
            }
            fVar = f13742j;
        }
        return fVar;
    }

    /* renamed from: a */
    protected abstract Result mo15507a(Params... paramsArr);

    /* renamed from: a */
    public final AbstractC3383w3<Params, Progress, Result> m16120a(Executor executor, Params... paramsArr) {
        if (this.f13745d == g.PENDING) {
            this.f13745d = g.RUNNING;
            m16126c();
            this.f13743b.f13754a = paramsArr;
            executor.execute(this.f13744c);
            return this;
        }
        int i = d.f13751a[this.f13745d.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    /* renamed from: a */
    void m16121a(Result result) {
        if (m16122a()) {
            mo15508b((AbstractC3383w3<Params, Progress, Result>) result);
        } else {
            mo15509c(result);
        }
        this.f13745d = g.FINISHED;
    }

    /* renamed from: a */
    public final boolean m16122a() {
        return this.f13746e.get();
    }

    /* renamed from: a */
    public final boolean m16123a(boolean z) {
        this.f13746e.set(true);
        return this.f13744c.cancel(z);
    }

    /* renamed from: b */
    protected void m16124b() {
    }

    /* renamed from: b */
    protected void mo15508b(Result result) {
        m16124b();
    }

    /* renamed from: b */
    protected void m16125b(Progress... progressArr) {
    }

    /* renamed from: c */
    protected void m16126c() {
    }

    /* renamed from: c */
    protected void mo15509c(Result result) {
    }

    /* renamed from: d */
    Result m16127d(Result result) {
        m16119d().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: e */
    void m16128e(Result result) {
        if (this.f13747f.get()) {
            return;
        }
        m16127d(result);
    }
}
