package p000;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: yc */
/* loaded from: classes.dex */
public final class ExecutorServiceC3482yc implements ExecutorService {

    /* renamed from: b */
    private static final long f14124b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    private static volatile int f14125c;

    /* renamed from: a */
    private final ExecutorService f14126a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yc$a */
    /* loaded from: classes.dex */
    public static final class a implements ThreadFactory {

        /* renamed from: a */
        private final String f14127a;

        /* renamed from: b */
        final b f14128b;

        /* renamed from: c */
        final boolean f14129c;

        /* renamed from: d */
        private int f14130d;

        /* renamed from: yc$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C3580a extends Thread {
            C3580a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (a.this.f14129c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    a.this.f14128b.mo16625a(th);
                }
            }
        }

        a(String str, b bVar, boolean z) {
            this.f14127a = str;
            this.f14128b = bVar;
            this.f14129c = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C3580a c3580a;
            c3580a = new C3580a(runnable, "glide-" + this.f14127a + "-thread-" + this.f14130d);
            this.f14130d = this.f14130d + 1;
            return c3580a;
        }
    }

    /* renamed from: yc$b */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a */
        public static final b f14132a;

        /* renamed from: b */
        public static final b f14133b;

        /* renamed from: yc$b$a */
        /* loaded from: classes.dex */
        class a implements b {
            a() {
            }

            @Override // p000.ExecutorServiceC3482yc.b
            /* renamed from: a */
            public void mo16625a(Throwable th) {
            }
        }

        /* renamed from: yc$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C3581b implements b {
            C3581b() {
            }

            @Override // p000.ExecutorServiceC3482yc.b
            /* renamed from: a */
            public void mo16625a(Throwable th) {
                if (th != null) {
                    Log.isLoggable("GlideExecutor", 6);
                }
            }
        }

        /* renamed from: yc$b$c */
        /* loaded from: classes.dex */
        class c implements b {
            c() {
            }

            @Override // p000.ExecutorServiceC3482yc.b
            /* renamed from: a */
            public void mo16625a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            new a();
            f14132a = new C3581b();
            new c();
            f14133b = f14132a;
        }

        /* renamed from: a */
        void mo16625a(Throwable th);
    }

    ExecutorServiceC3482yc(ExecutorService executorService) {
        this.f14126a = executorService;
    }

    /* renamed from: a */
    public static int m16617a() {
        if (f14125c == 0) {
            f14125c = Math.min(4, C3524zc.m16920a());
        }
        return f14125c;
    }

    /* renamed from: a */
    public static ExecutorServiceC3482yc m16618a(int i, String str, b bVar) {
        return new ExecutorServiceC3482yc(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a(str, bVar, true)));
    }

    /* renamed from: a */
    public static ExecutorServiceC3482yc m16619a(int i, b bVar) {
        return new ExecutorServiceC3482yc(new ThreadPoolExecutor(0, i, f14124b, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a("animation", bVar, true)));
    }

    /* renamed from: b */
    public static ExecutorServiceC3482yc m16620b() {
        return m16619a(m16617a() >= 4 ? 2 : 1, b.f14133b);
    }

    /* renamed from: b */
    public static ExecutorServiceC3482yc m16621b(int i, String str, b bVar) {
        return new ExecutorServiceC3482yc(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a(str, bVar, false)));
    }

    /* renamed from: c */
    public static ExecutorServiceC3482yc m16622c() {
        return m16618a(1, "disk-cache", b.f14133b);
    }

    /* renamed from: d */
    public static ExecutorServiceC3482yc m16623d() {
        return m16621b(m16617a(), "source", b.f14133b);
    }

    /* renamed from: e */
    public static ExecutorServiceC3482yc m16624e() {
        return new ExecutorServiceC3482yc(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f14124b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a("source-unlimited", b.f14133b, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f14126a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f14126a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f14126a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f14126a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f14126a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.f14126a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f14126a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f14126a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f14126a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f14126a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f14126a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f14126a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f14126a.submit(callable);
    }

    public String toString() {
        return this.f14126a.toString();
    }
}
