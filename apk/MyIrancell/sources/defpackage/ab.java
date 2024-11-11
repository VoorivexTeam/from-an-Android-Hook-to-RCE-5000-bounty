package defpackage;

import android.os.Process;
import com.bumptech.glide.load.g;
import defpackage.pb;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class ab {
    private final boolean a;
    final Map<g, d> b;
    private final ReferenceQueue<pb<?>> c;
    private pb.a d;
    private volatile boolean e;
    private volatile c f;

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: ab$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0001a implements Runnable {
            final /* synthetic */ Runnable b;

            RunnableC0001a(a aVar, Runnable runnable) {
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.b.run();
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0001a(this, runnable), "glide-active-resources");
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ab.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends WeakReference<pb<?>> {
        final g a;
        final boolean b;
        vb<?> c;

        d(g gVar, pb<?> pbVar, ReferenceQueue<? super pb<?>> referenceQueue, boolean z) {
            super(pbVar, referenceQueue);
            vb<?> vbVar;
            ji.a(gVar);
            this.a = gVar;
            if (pbVar.f() && z) {
                vb<?> e = pbVar.e();
                ji.a(e);
                vbVar = e;
            } else {
                vbVar = null;
            }
            this.c = vbVar;
            this.b = pbVar.f();
        }

        void a() {
            this.c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    ab(boolean z, Executor executor) {
        this.b = new HashMap();
        this.c = new ReferenceQueue<>();
        this.a = z;
        executor.execute(new b());
    }

    void a() {
        while (!this.e) {
            try {
                a((d) this.c.remove());
                c cVar = this.f;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void a(d dVar) {
        synchronized (this.d) {
            synchronized (this) {
                this.b.remove(dVar.a);
                if (dVar.b && dVar.c != null) {
                    pb<?> pbVar = new pb<>(dVar.c, true, false);
                    pbVar.a(dVar.a, this.d);
                    this.d.a(dVar.a, pbVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(g gVar) {
        d remove = this.b.remove(gVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(g gVar, pb<?> pbVar) {
        d put = this.b.put(gVar, new d(gVar, pbVar, this.c, this.a));
        if (put != null) {
            put.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(pb.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.d = aVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized pb<?> b(g gVar) {
        d dVar = this.b.get(gVar);
        if (dVar == null) {
            return null;
        }
        pb<?> pbVar = dVar.get();
        if (pbVar == null) {
            a(dVar);
        }
        return pbVar;
    }
}
