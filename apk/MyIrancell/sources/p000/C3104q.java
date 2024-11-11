package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: q */
/* loaded from: classes.dex */
public class C3104q extends AbstractC3146r {

    /* renamed from: a */
    private final Object f12649a = new Object();

    /* renamed from: b */
    private final ExecutorService f12650b = Executors.newFixedThreadPool(2, new a(this));

    /* renamed from: c */
    private volatile Handler f12651c;

    /* renamed from: q$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f12652a = new AtomicInteger(0);

        a(C3104q c3104q) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f12652a.getAndIncrement())));
            return thread;
        }
    }

    @Override // p000.AbstractC3146r
    /* renamed from: a */
    public void mo14671a(Runnable runnable) {
        this.f12650b.execute(runnable);
    }

    @Override // p000.AbstractC3146r
    /* renamed from: a */
    public boolean mo14672a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p000.AbstractC3146r
    /* renamed from: b */
    public void mo14673b(Runnable runnable) {
        if (this.f12651c == null) {
            synchronized (this.f12649a) {
                if (this.f12651c == null) {
                    this.f12651c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f12651c.post(runnable);
    }
}
