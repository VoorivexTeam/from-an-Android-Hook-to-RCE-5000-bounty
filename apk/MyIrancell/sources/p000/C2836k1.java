package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: k1 */
/* loaded from: classes.dex */
public class C2836k1 {

    /* renamed from: b */
    private HandlerThread f11562b;

    /* renamed from: c */
    private Handler f11563c;

    /* renamed from: f */
    private final int f11566f;

    /* renamed from: g */
    private final int f11567g;

    /* renamed from: h */
    private final String f11568h;

    /* renamed from: a */
    private final Object f11561a = new Object();

    /* renamed from: e */
    private Handler.Callback f11565e = new a();

    /* renamed from: d */
    private int f11564d = 0;

    /* renamed from: k1$a */
    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C2836k1.this.m13534a();
                return true;
            }
            if (i != 1) {
                return true;
            }
            C2836k1.this.m13535a((Runnable) message.obj);
            return true;
        }
    }

    /* renamed from: k1$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Callable f11570b;

        /* renamed from: c */
        final /* synthetic */ Handler f11571c;

        /* renamed from: d */
        final /* synthetic */ d f11572d;

        /* renamed from: k1$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Object f11573b;

            a(Object obj) {
                this.f11573b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f11572d.mo13303a(this.f11573b);
            }
        }

        b(C2836k1 c2836k1, Callable callable, Handler handler, d dVar) {
            this.f11570b = callable;
            this.f11571c = handler;
            this.f11572d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f11570b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f11571c.post(new a(obj));
        }
    }

    /* renamed from: k1$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AtomicReference f11575b;

        /* renamed from: c */
        final /* synthetic */ Callable f11576c;

        /* renamed from: d */
        final /* synthetic */ ReentrantLock f11577d;

        /* renamed from: e */
        final /* synthetic */ AtomicBoolean f11578e;

        /* renamed from: f */
        final /* synthetic */ Condition f11579f;

        c(C2836k1 c2836k1, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f11575b = atomicReference;
            this.f11576c = callable;
            this.f11577d = reentrantLock;
            this.f11578e = atomicBoolean;
            this.f11579f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11575b.set(this.f11576c.call());
            } catch (Exception unused) {
            }
            this.f11577d.lock();
            try {
                this.f11578e.set(false);
                this.f11579f.signal();
            } finally {
                this.f11577d.unlock();
            }
        }
    }

    /* renamed from: k1$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        /* renamed from: a */
        void mo13303a(T t);
    }

    public C2836k1(String str, int i, int i2) {
        this.f11568h = str;
        this.f11567g = i;
        this.f11566f = i2;
    }

    /* renamed from: b */
    private void m13532b(Runnable runnable) {
        synchronized (this.f11561a) {
            if (this.f11562b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f11568h, this.f11567g);
                this.f11562b = handlerThread;
                handlerThread.start();
                this.f11563c = new Handler(this.f11562b.getLooper(), this.f11565e);
                this.f11564d++;
            }
            this.f11563c.removeMessages(0);
            this.f11563c.sendMessage(this.f11563c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> T m13533a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m13532b(new c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    void m13534a() {
        synchronized (this.f11561a) {
            if (this.f11563c.hasMessages(1)) {
                return;
            }
            this.f11562b.quit();
            this.f11562b = null;
            this.f11563c = null;
        }
    }

    /* renamed from: a */
    void m13535a(Runnable runnable) {
        runnable.run();
        synchronized (this.f11561a) {
            this.f11563c.removeMessages(0);
            this.f11563c.sendMessageDelayed(this.f11563c.obtainMessage(0), this.f11566f);
        }
    }

    /* renamed from: a */
    public <T> void m13536a(Callable<T> callable, d<T> dVar) {
        m13532b(new b(this, callable, new Handler(), dVar));
    }
}
