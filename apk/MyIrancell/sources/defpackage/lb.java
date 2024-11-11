package defpackage;

import com.bumptech.glide.load.g;
import defpackage.hb;
import defpackage.li;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class lb<R> implements hb.b<R>, li.f {
    private static final c y = new c();
    final e b;
    private final ni c;
    private final u1<lb<?>> d;
    private final c e;
    private final mb f;
    private final yc g;
    private final yc h;
    private final yc i;
    private final yc j;
    private final AtomicInteger k;
    private g l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private vb<?> q;
    com.bumptech.glide.load.a r;
    private boolean s;
    qb t;
    private boolean u;
    pb<?> v;
    private hb<R> w;
    private volatile boolean x;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        private final jh b;

        a(jh jhVar) {
            this.b = jhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (lb.this) {
                if (lb.this.b.a(this.b)) {
                    lb.this.a(this.b);
                }
                lb.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        private final jh b;

        b(jh jhVar) {
            this.b = jhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (lb.this) {
                if (lb.this.b.a(this.b)) {
                    lb.this.v.a();
                    lb.this.b(this.b);
                    lb.this.c(this.b);
                }
                lb.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        public <R> pb<R> a(vb<R> vbVar, boolean z) {
            return new pb<>(vbVar, z, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d {
        final jh a;
        final Executor b;

        d(jh jhVar, Executor executor) {
            this.a = jhVar;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {
        private final List<d> b;

        e() {
            this(new ArrayList(2));
        }

        e(List<d> list) {
            this.b = list;
        }

        private static d c(jh jhVar) {
            return new d(jhVar, ei.a());
        }

        void a(jh jhVar, Executor executor) {
            this.b.add(new d(jhVar, executor));
        }

        boolean a(jh jhVar) {
            return this.b.contains(c(jhVar));
        }

        e b() {
            return new e(new ArrayList(this.b));
        }

        void b(jh jhVar) {
            this.b.remove(c(jhVar));
        }

        void clear() {
            this.b.clear();
        }

        boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.b.iterator();
        }

        int size() {
            return this.b.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public lb(yc ycVar, yc ycVar2, yc ycVar3, yc ycVar4, mb mbVar, u1<lb<?>> u1Var) {
        this(ycVar, ycVar2, ycVar3, ycVar4, mbVar, u1Var, y);
    }

    lb(yc ycVar, yc ycVar2, yc ycVar3, yc ycVar4, mb mbVar, u1<lb<?>> u1Var, c cVar) {
        this.b = new e();
        this.c = ni.b();
        this.k = new AtomicInteger();
        this.g = ycVar;
        this.h = ycVar2;
        this.i = ycVar3;
        this.j = ycVar4;
        this.f = mbVar;
        this.d = u1Var;
        this.e = cVar;
    }

    private yc g() {
        return this.n ? this.i : this.o ? this.j : this.h;
    }

    private boolean h() {
        return this.u || this.s || this.x;
    }

    private synchronized void i() {
        if (this.l == null) {
            throw new IllegalArgumentException();
        }
        this.b.clear();
        this.l = null;
        this.v = null;
        this.q = null;
        this.u = false;
        this.x = false;
        this.s = false;
        this.w.a(false);
        this.w = null;
        this.t = null;
        this.r = null;
        this.d.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized lb<R> a(g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.l = gVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        return this;
    }

    void a() {
        if (h()) {
            return;
        }
        this.x = true;
        this.w.f();
        this.f.a(this, this.l);
    }

    synchronized void a(int i) {
        ji.a(h(), "Not yet complete!");
        if (this.k.getAndAdd(i) == 0 && this.v != null) {
            this.v.a();
        }
    }

    @Override // hb.b
    public void a(hb<?> hbVar) {
        g().execute(hbVar);
    }

    synchronized void a(jh jhVar) {
        try {
            jhVar.a(this.t);
        } catch (Throwable th) {
            throw new bb(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(jh jhVar, Executor executor) {
        Runnable aVar;
        this.c.a();
        this.b.a(jhVar, executor);
        boolean z = true;
        if (this.s) {
            a(1);
            aVar = new b(jhVar);
        } else if (this.u) {
            a(1);
            aVar = new a(jhVar);
        } else {
            if (this.x) {
                z = false;
            }
            ji.a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    @Override // hb.b
    public void a(qb qbVar) {
        synchronized (this) {
            this.t = qbVar;
        }
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hb.b
    public void a(vb<R> vbVar, com.bumptech.glide.load.a aVar) {
        synchronized (this) {
            this.q = vbVar;
            this.r = aVar;
        }
        d();
    }

    synchronized void b() {
        this.c.a();
        ji.a(h(), "Not yet complete!");
        int decrementAndGet = this.k.decrementAndGet();
        ji.a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            if (this.v != null) {
                this.v.g();
            }
            i();
        }
    }

    public synchronized void b(hb<R> hbVar) {
        this.w = hbVar;
        (hbVar.g() ? this.g : g()).execute(hbVar);
    }

    synchronized void b(jh jhVar) {
        try {
            jhVar.a(this.v, this.r);
        } catch (Throwable th) {
            throw new bb(th);
        }
    }

    void c() {
        synchronized (this) {
            this.c.a();
            if (this.x) {
                i();
                return;
            }
            if (this.b.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.u) {
                throw new IllegalStateException("Already failed once");
            }
            this.u = true;
            g gVar = this.l;
            e b2 = this.b.b();
            a(b2.size() + 1);
            this.f.a(this, gVar, null);
            Iterator<d> it = b2.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.b.execute(new a(next.a));
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c(jh jhVar) {
        boolean z;
        this.c.a();
        this.b.b(jhVar);
        if (this.b.isEmpty()) {
            a();
            if (!this.s && !this.u) {
                z = false;
                if (z && this.k.get() == 0) {
                    i();
                }
            }
            z = true;
            if (z) {
                i();
            }
        }
    }

    void d() {
        synchronized (this) {
            this.c.a();
            if (this.x) {
                this.q.b();
                i();
                return;
            }
            if (this.b.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.s) {
                throw new IllegalStateException("Already have resource");
            }
            this.v = this.e.a(this.q, this.m);
            this.s = true;
            e b2 = this.b.b();
            a(b2.size() + 1);
            this.f.a(this, this.l, this.v);
            Iterator<d> it = b2.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.b.execute(new b(next.a));
            }
            b();
        }
    }

    @Override // li.f
    public ni e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.p;
    }
}
