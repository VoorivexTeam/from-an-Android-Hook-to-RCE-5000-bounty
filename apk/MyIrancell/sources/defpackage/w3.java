package defpackage;

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

/* loaded from: classes.dex */
abstract class w3<Params, Progress, Result> {
    private static final ThreadFactory g = new a();
    private static final BlockingQueue<Runnable> h = new LinkedBlockingQueue(10);
    public static final Executor i = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, h, g);
    private static f j;
    private volatile g d = g.PENDING;
    final AtomicBoolean e = new AtomicBoolean();
    final AtomicBoolean f = new AtomicBoolean();
    private final h<Params, Result> b = new b();
    private final FutureTask<Result> c = new c(this.b);

    /* loaded from: classes.dex */
    static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            w3.this.f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) w3.this.a((Object[]) this.a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                w3.this.e(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                w3.this.e(null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e<Data> {
        final w3 a;
        final Data[] b;

        e(w3 w3Var, Data... dataArr) {
            this.a = w3Var;
            this.b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
                eVar.a.a((w3) eVar.b[0]);
            } else {
                if (i != 2) {
                    return;
                }
                eVar.a.b((Object[]) eVar.b);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {
        Params[] a;

        h() {
        }
    }

    private static Handler d() {
        f fVar;
        synchronized (w3.class) {
            if (j == null) {
                j = new f();
            }
            fVar = j;
        }
        return fVar;
    }

    protected abstract Result a(Params... paramsArr);

    public final w3<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.d == g.PENDING) {
            this.d = g.RUNNING;
            c();
            this.b.a = paramsArr;
            executor.execute(this.c);
            return this;
        }
        int i2 = d.a[this.d.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void a(Result result) {
        if (a()) {
            b((w3<Params, Progress, Result>) result);
        } else {
            c(result);
        }
        this.d = g.FINISHED;
    }

    public final boolean a() {
        return this.e.get();
    }

    public final boolean a(boolean z) {
        this.e.set(true);
        return this.c.cancel(z);
    }

    protected void b() {
    }

    protected void b(Result result) {
        b();
    }

    protected void b(Progress... progressArr) {
    }

    protected void c() {
    }

    protected void c(Result result) {
    }

    Result d(Result result) {
        d().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void e(Result result) {
        if (this.f.get()) {
            return;
        }
        d(result);
    }
}
