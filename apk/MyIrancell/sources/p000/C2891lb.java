package p000;

import com.bumptech.glide.load.EnumC0567a;
import com.bumptech.glide.load.InterfaceC0573g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C2898li;
import p000.RunnableC2547hb;

/* renamed from: lb */
/* loaded from: classes.dex */
class C2891lb<R> implements RunnableC2547hb.b<R>, C2898li.f {

    /* renamed from: y */
    private static final c f11834y = new c();

    /* renamed from: b */
    final e f11835b;

    /* renamed from: c */
    private final AbstractC2990ni f11836c;

    /* renamed from: d */
    private final InterfaceC3283u1<C2891lb<?>> f11837d;

    /* renamed from: e */
    private final c f11838e;

    /* renamed from: f */
    private final InterfaceC2937mb f11839f;

    /* renamed from: g */
    private final ExecutorServiceC3482yc f11840g;

    /* renamed from: h */
    private final ExecutorServiceC3482yc f11841h;

    /* renamed from: i */
    private final ExecutorServiceC3482yc f11842i;

    /* renamed from: j */
    private final ExecutorServiceC3482yc f11843j;

    /* renamed from: k */
    private final AtomicInteger f11844k;

    /* renamed from: l */
    private InterfaceC0573g f11845l;

    /* renamed from: m */
    private boolean f11846m;

    /* renamed from: n */
    private boolean f11847n;

    /* renamed from: o */
    private boolean f11848o;

    /* renamed from: p */
    private boolean f11849p;

    /* renamed from: q */
    private InterfaceC3353vb<?> f11850q;

    /* renamed from: r */
    EnumC0567a f11851r;

    /* renamed from: s */
    private boolean f11852s;

    /* renamed from: t */
    C3121qb f11853t;

    /* renamed from: u */
    private boolean f11854u;

    /* renamed from: v */
    C3079pb<?> f11855v;

    /* renamed from: w */
    private RunnableC2547hb<R> f11856w;

    /* renamed from: x */
    private volatile boolean f11857x;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lb$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        private final InterfaceC2815jh f11858b;

        a(InterfaceC2815jh interfaceC2815jh) {
            this.f11858b = interfaceC2815jh;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C2891lb.this) {
                if (C2891lb.this.f11835b.m13858a(this.f11858b)) {
                    C2891lb.this.m13846a(this.f11858b);
                }
                C2891lb.this.m13848b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lb$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b */
        private final InterfaceC2815jh f11860b;

        b(InterfaceC2815jh interfaceC2815jh) {
            this.f11860b = interfaceC2815jh;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C2891lb.this) {
                if (C2891lb.this.f11835b.m13858a(this.f11860b)) {
                    C2891lb.this.f11855v.m14744a();
                    C2891lb.this.m13850b(this.f11860b);
                    C2891lb.this.m13852c(this.f11860b);
                }
                C2891lb.this.m13848b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lb$c */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        /* renamed from: a */
        public <R> C3079pb<R> m13855a(InterfaceC3353vb<R> interfaceC3353vb, boolean z) {
            return new C3079pb<>(interfaceC3353vb, z, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lb$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        final InterfaceC2815jh f11862a;

        /* renamed from: b */
        final Executor f11863b;

        d(InterfaceC2815jh interfaceC2815jh, Executor executor) {
            this.f11862a = interfaceC2815jh;
            this.f11863b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f11862a.equals(((d) obj).f11862a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11862a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lb$e */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: b */
        private final List<d> f11864b;

        e() {
            this(new ArrayList(2));
        }

        e(List<d> list) {
            this.f11864b = list;
        }

        /* renamed from: c */
        private static d m13856c(InterfaceC2815jh interfaceC2815jh) {
            return new d(interfaceC2815jh, C2433ei.m11612a());
        }

        /* renamed from: a */
        void m13857a(InterfaceC2815jh interfaceC2815jh, Executor executor) {
            this.f11864b.add(new d(interfaceC2815jh, executor));
        }

        /* renamed from: a */
        boolean m13858a(InterfaceC2815jh interfaceC2815jh) {
            return this.f11864b.contains(m13856c(interfaceC2815jh));
        }

        /* renamed from: b */
        e m13859b() {
            return new e(new ArrayList(this.f11864b));
        }

        /* renamed from: b */
        void m13860b(InterfaceC2815jh interfaceC2815jh) {
            this.f11864b.remove(m13856c(interfaceC2815jh));
        }

        void clear() {
            this.f11864b.clear();
        }

        boolean isEmpty() {
            return this.f11864b.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f11864b.iterator();
        }

        int size() {
            return this.f11864b.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2891lb(ExecutorServiceC3482yc executorServiceC3482yc, ExecutorServiceC3482yc executorServiceC3482yc2, ExecutorServiceC3482yc executorServiceC3482yc3, ExecutorServiceC3482yc executorServiceC3482yc4, InterfaceC2937mb interfaceC2937mb, InterfaceC3283u1<C2891lb<?>> interfaceC3283u1) {
        this(executorServiceC3482yc, executorServiceC3482yc2, executorServiceC3482yc3, executorServiceC3482yc4, interfaceC2937mb, interfaceC3283u1, f11834y);
    }

    C2891lb(ExecutorServiceC3482yc executorServiceC3482yc, ExecutorServiceC3482yc executorServiceC3482yc2, ExecutorServiceC3482yc executorServiceC3482yc3, ExecutorServiceC3482yc executorServiceC3482yc4, InterfaceC2937mb interfaceC2937mb, InterfaceC3283u1<C2891lb<?>> interfaceC3283u1, c cVar) {
        this.f11835b = new e();
        this.f11836c = AbstractC2990ni.m14334b();
        this.f11844k = new AtomicInteger();
        this.f11840g = executorServiceC3482yc;
        this.f11841h = executorServiceC3482yc2;
        this.f11842i = executorServiceC3482yc3;
        this.f11843j = executorServiceC3482yc4;
        this.f11839f = interfaceC2937mb;
        this.f11837d = interfaceC3283u1;
        this.f11838e = cVar;
    }

    /* renamed from: g */
    private ExecutorServiceC3482yc m13840g() {
        return this.f11847n ? this.f11842i : this.f11848o ? this.f11843j : this.f11841h;
    }

    /* renamed from: h */
    private boolean m13841h() {
        return this.f11854u || this.f11852s || this.f11857x;
    }

    /* renamed from: i */
    private synchronized void m13842i() {
        if (this.f11845l == null) {
            throw new IllegalArgumentException();
        }
        this.f11835b.clear();
        this.f11845l = null;
        this.f11855v = null;
        this.f11850q = null;
        this.f11854u = false;
        this.f11857x = false;
        this.f11852s = false;
        this.f11856w.m12178a(false);
        this.f11856w = null;
        this.f11853t = null;
        this.f11851r = null;
        this.f11837d.mo13875a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C2891lb<R> m13843a(InterfaceC0573g interfaceC0573g, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f11845l = interfaceC0573g;
        this.f11846m = z;
        this.f11847n = z2;
        this.f11848o = z3;
        this.f11849p = z4;
        return this;
    }

    /* renamed from: a */
    void m13844a() {
        if (m13841h()) {
            return;
        }
        this.f11857x = true;
        this.f11856w.m12180f();
        this.f11839f.mo13667a(this, this.f11845l);
    }

    /* renamed from: a */
    synchronized void m13845a(int i) {
        C2816ji.m13463a(m13841h(), "Not yet complete!");
        if (this.f11844k.getAndAdd(i) == 0 && this.f11855v != null) {
            this.f11855v.m14744a();
        }
    }

    @Override // p000.RunnableC2547hb.b
    /* renamed from: a */
    public void mo12182a(RunnableC2547hb<?> runnableC2547hb) {
        m13840g().execute(runnableC2547hb);
    }

    /* renamed from: a */
    synchronized void m13846a(InterfaceC2815jh interfaceC2815jh) {
        try {
            interfaceC2815jh.mo13457a(this.f11853t);
        } catch (Throwable th) {
            throw new C0459bb(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m13847a(InterfaceC2815jh interfaceC2815jh, Executor executor) {
        Runnable aVar;
        this.f11836c.mo14335a();
        this.f11835b.m13857a(interfaceC2815jh, executor);
        boolean z = true;
        if (this.f11852s) {
            m13845a(1);
            aVar = new b(interfaceC2815jh);
        } else if (this.f11854u) {
            m13845a(1);
            aVar = new a(interfaceC2815jh);
        } else {
            if (this.f11857x) {
                z = false;
            }
            C2816ji.m13463a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    @Override // p000.RunnableC2547hb.b
    /* renamed from: a */
    public void mo12183a(C3121qb c3121qb) {
        synchronized (this) {
            this.f11853t = c3121qb;
        }
        m13851c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.RunnableC2547hb.b
    /* renamed from: a */
    public void mo12184a(InterfaceC3353vb<R> interfaceC3353vb, EnumC0567a enumC0567a) {
        synchronized (this) {
            this.f11850q = interfaceC3353vb;
            this.f11851r = enumC0567a;
        }
        m13853d();
    }

    /* renamed from: b */
    synchronized void m13848b() {
        this.f11836c.mo14335a();
        C2816ji.m13463a(m13841h(), "Not yet complete!");
        int decrementAndGet = this.f11844k.decrementAndGet();
        C2816ji.m13463a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            if (this.f11855v != null) {
                this.f11855v.m14748g();
            }
            m13842i();
        }
    }

    /* renamed from: b */
    public synchronized void m13849b(RunnableC2547hb<R> runnableC2547hb) {
        this.f11856w = runnableC2547hb;
        (runnableC2547hb.m12181g() ? this.f11840g : m13840g()).execute(runnableC2547hb);
    }

    /* renamed from: b */
    synchronized void m13850b(InterfaceC2815jh interfaceC2815jh) {
        try {
            interfaceC2815jh.mo13458a(this.f11855v, this.f11851r);
        } catch (Throwable th) {
            throw new C0459bb(th);
        }
    }

    /* renamed from: c */
    void m13851c() {
        synchronized (this) {
            this.f11836c.mo14335a();
            if (this.f11857x) {
                m13842i();
                return;
            }
            if (this.f11835b.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f11854u) {
                throw new IllegalStateException("Already failed once");
            }
            this.f11854u = true;
            InterfaceC0573g interfaceC0573g = this.f11845l;
            e m13859b = this.f11835b.m13859b();
            m13845a(m13859b.size() + 1);
            this.f11839f.mo13668a(this, interfaceC0573g, null);
            Iterator<d> it = m13859b.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f11863b.execute(new a(next.f11862a));
            }
            m13848b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m13852c(InterfaceC2815jh interfaceC2815jh) {
        boolean z;
        this.f11836c.mo14335a();
        this.f11835b.m13860b(interfaceC2815jh);
        if (this.f11835b.isEmpty()) {
            m13844a();
            if (!this.f11852s && !this.f11854u) {
                z = false;
                if (z && this.f11844k.get() == 0) {
                    m13842i();
                }
            }
            z = true;
            if (z) {
                m13842i();
            }
        }
    }

    /* renamed from: d */
    void m13853d() {
        synchronized (this) {
            this.f11836c.mo14335a();
            if (this.f11857x) {
                this.f11850q.mo3383b();
                m13842i();
                return;
            }
            if (this.f11835b.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f11852s) {
                throw new IllegalStateException("Already have resource");
            }
            this.f11855v = this.f11838e.m13855a(this.f11850q, this.f11846m);
            this.f11852s = true;
            e m13859b = this.f11835b.m13859b();
            m13845a(m13859b.size() + 1);
            this.f11839f.mo13668a(this, this.f11845l, this.f11855v);
            Iterator<d> it = m13859b.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f11863b.execute(new b(next.f11862a));
            }
            m13848b();
        }
    }

    @Override // p000.C2898li.f
    /* renamed from: e */
    public AbstractC2990ni mo12179e() {
        return this.f11836c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m13854f() {
        return this.f11849p;
    }
}
