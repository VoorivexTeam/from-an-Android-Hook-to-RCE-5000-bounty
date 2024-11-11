package p000;

import android.os.Process;
import com.bumptech.glide.load.InterfaceC0573g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p000.C3079pb;

/* renamed from: ab */
/* loaded from: classes.dex */
final class C0014ab {

    /* renamed from: a */
    private final boolean f84a;

    /* renamed from: b */
    final Map<InterfaceC0573g, d> f85b;

    /* renamed from: c */
    private final ReferenceQueue<C3079pb<?>> f86c;

    /* renamed from: d */
    private C3079pb.a f87d;

    /* renamed from: e */
    private volatile boolean f88e;

    /* renamed from: f */
    private volatile c f89f;

    /* renamed from: ab$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: ab$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC3548a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Runnable f90b;

            RunnableC3548a(a aVar, Runnable runnable) {
                this.f90b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f90b.run();
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC3548a(this, runnable), "glide-active-resources");
        }
    }

    /* renamed from: ab$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0014ab.this.m124a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ab$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void m130a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ab$d */
    /* loaded from: classes.dex */
    public static final class d extends WeakReference<C3079pb<?>> {

        /* renamed from: a */
        final InterfaceC0573g f92a;

        /* renamed from: b */
        final boolean f93b;

        /* renamed from: c */
        InterfaceC3353vb<?> f94c;

        d(InterfaceC0573g interfaceC0573g, C3079pb<?> c3079pb, ReferenceQueue<? super C3079pb<?>> referenceQueue, boolean z) {
            super(c3079pb, referenceQueue);
            InterfaceC3353vb<?> interfaceC3353vb;
            C2816ji.m13459a(interfaceC0573g);
            this.f92a = interfaceC0573g;
            if (c3079pb.m14747f() && z) {
                InterfaceC3353vb<?> m14746e = c3079pb.m14746e();
                C2816ji.m13459a(m14746e);
                interfaceC3353vb = m14746e;
            } else {
                interfaceC3353vb = null;
            }
            this.f94c = interfaceC3353vb;
            this.f93b = c3079pb.m14747f();
        }

        /* renamed from: a */
        void m131a() {
            this.f94c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0014ab(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    C0014ab(boolean z, Executor executor) {
        this.f85b = new HashMap();
        this.f86c = new ReferenceQueue<>();
        this.f84a = z;
        executor.execute(new b());
    }

    /* renamed from: a */
    void m124a() {
        while (!this.f88e) {
            try {
                m125a((d) this.f86c.remove());
                c cVar = this.f89f;
                if (cVar != null) {
                    cVar.m130a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: a */
    void m125a(d dVar) {
        synchronized (this.f87d) {
            synchronized (this) {
                this.f85b.remove(dVar.f92a);
                if (dVar.f93b && dVar.f94c != null) {
                    C3079pb<?> c3079pb = new C3079pb<>(dVar.f94c, true, false);
                    c3079pb.m14745a(dVar.f92a, this.f87d);
                    this.f87d.mo13666a(dVar.f92a, c3079pb);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m126a(InterfaceC0573g interfaceC0573g) {
        d remove = this.f85b.remove(interfaceC0573g);
        if (remove != null) {
            remove.m131a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m127a(InterfaceC0573g interfaceC0573g, C3079pb<?> c3079pb) {
        d put = this.f85b.put(interfaceC0573g, new d(interfaceC0573g, c3079pb, this.f86c, this.f84a));
        if (put != null) {
            put.m131a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m128a(C3079pb.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f87d = aVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C3079pb<?> m129b(InterfaceC0573g interfaceC0573g) {
        d dVar = this.f85b.get(interfaceC0573g);
        if (dVar == null) {
            return null;
        }
        C3079pb<?> c3079pb = dVar.get();
        if (c3079pb == null) {
            m125a(dVar);
        }
        return c3079pb;
    }
}
