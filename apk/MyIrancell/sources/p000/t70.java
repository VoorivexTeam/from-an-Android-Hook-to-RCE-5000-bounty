package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p000.f80;

/* loaded from: classes.dex */
public final class t70 {

    /* renamed from: c */
    @Nullable
    private Runnable f13228c;

    /* renamed from: d */
    @Nullable
    private ExecutorService f13229d;

    /* renamed from: a */
    private int f13226a = 64;

    /* renamed from: b */
    private int f13227b = 5;

    /* renamed from: e */
    private final Deque<f80.C2464b> f13230e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<f80.C2464b> f13231f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<f80> f13232g = new ArrayDeque();

    /* renamed from: a */
    private <T> void m15554a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f13228c;
        }
        if (m15556c() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: c */
    private int m15555c(f80.C2464b c2464b) {
        int i = 0;
        for (f80.C2464b c2464b2 : this.f13231f) {
            if (!c2464b2.m11710c().f10101g && c2464b2.m11711d().equals(c2464b.m11711d())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    private boolean m15556c() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<f80.C2464b> it = this.f13230e.iterator();
            while (it.hasNext()) {
                f80.C2464b next = it.next();
                if (this.f13231f.size() >= this.f13226a) {
                    break;
                }
                if (m15555c(next) < this.f13227b) {
                    it.remove();
                    arrayList.add(next);
                    this.f13231f.add(next);
                }
            }
            z = m15560b() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((f80.C2464b) arrayList.get(i)).m11708a(m15557a());
        }
        return z;
    }

    /* renamed from: a */
    public synchronized ExecutorService m15557a() {
        if (this.f13229d == null) {
            this.f13229d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), o80.m14454a("OkHttp Dispatcher", false));
        }
        return this.f13229d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15558a(f80.C2464b c2464b) {
        synchronized (this) {
            this.f13230e.add(c2464b);
        }
        m15556c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m15559a(f80 f80Var) {
        this.f13232g.add(f80Var);
    }

    /* renamed from: b */
    public synchronized int m15560b() {
        return this.f13231f.size() + this.f13232g.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15561b(f80.C2464b c2464b) {
        m15554a(this.f13231f, c2464b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15562b(f80 f80Var) {
        m15554a(this.f13232g, f80Var);
    }
}
