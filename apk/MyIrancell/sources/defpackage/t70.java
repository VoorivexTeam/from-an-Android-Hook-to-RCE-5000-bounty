package defpackage;

import defpackage.f80;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class t70 {

    @Nullable
    private Runnable c;

    @Nullable
    private ExecutorService d;
    private int a = 64;
    private int b = 5;
    private final Deque<f80.b> e = new ArrayDeque();
    private final Deque<f80.b> f = new ArrayDeque();
    private final Deque<f80> g = new ArrayDeque();

    private <T> void a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.c;
        }
        if (c() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private int c(f80.b bVar) {
        int i = 0;
        for (f80.b bVar2 : this.f) {
            if (!bVar2.c().g && bVar2.d().equals(bVar.d())) {
                i++;
            }
        }
        return i;
    }

    private boolean c() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<f80.b> it = this.e.iterator();
            while (it.hasNext()) {
                f80.b next = it.next();
                if (this.f.size() >= this.a) {
                    break;
                }
                if (c(next) < this.b) {
                    it.remove();
                    arrayList.add(next);
                    this.f.add(next);
                }
            }
            z = b() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((f80.b) arrayList.get(i)).a(a());
        }
        return z;
    }

    public synchronized ExecutorService a() {
        if (this.d == null) {
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), o80.a("OkHttp Dispatcher", false));
        }
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f80.b bVar) {
        synchronized (this) {
            this.e.add(bVar);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(f80 f80Var) {
        this.g.add(f80Var);
    }

    public synchronized int b() {
        return this.f.size() + this.g.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(f80.b bVar) {
        a(this.f, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(f80 f80Var) {
        a(this.g, f80Var);
    }
}
