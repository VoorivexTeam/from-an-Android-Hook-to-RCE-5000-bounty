package p000;

import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p000.i80;
import p000.k70;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class za0<T> implements pa0<T> {

    /* renamed from: b */
    private final eb0 f14420b;

    /* renamed from: c */
    private final Object[] f14421c;

    /* renamed from: d */
    private final k70.InterfaceC2850a f14422d;

    /* renamed from: e */
    private final ta0<j80, T> f14423e;

    /* renamed from: f */
    private volatile boolean f14424f;

    /* renamed from: g */
    @GuardedBy("this")
    @Nullable
    private k70 f14425g;

    /* renamed from: h */
    @GuardedBy("this")
    @Nullable
    private Throwable f14426h;

    /* renamed from: i */
    @GuardedBy("this")
    private boolean f14427i;

    /* renamed from: za0$a */
    /* loaded from: classes.dex */
    class C3520a implements l70 {

        /* renamed from: a */
        final /* synthetic */ ra0 f14428a;

        C3520a(ra0 ra0Var) {
            this.f14428a = ra0Var;
        }

        /* renamed from: a */
        private void m16916a(Throwable th) {
            try {
                this.f14428a.onFailure(za0.this, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        @Override // p000.l70
        /* renamed from: a */
        public void mo13829a(k70 k70Var, i80 i80Var) {
            try {
                try {
                    this.f14428a.onResponse(za0.this, za0.this.m16915a(i80Var));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                ib0.m12438a(th2);
                m16916a(th2);
            }
        }

        @Override // p000.l70
        /* renamed from: a */
        public void mo13830a(k70 k70Var, IOException iOException) {
            m16916a(iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: za0$b */
    /* loaded from: classes.dex */
    public static final class C3521b extends j80 {

        /* renamed from: c */
        private final j80 f14430c;

        /* renamed from: d */
        @Nullable
        IOException f14431d;

        /* renamed from: za0$b$a */
        /* loaded from: classes.dex */
        class a extends ForwardingSource {
            a(Source source) {
                super(source);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j) {
                try {
                    return super.read(buffer, j);
                } catch (IOException e) {
                    C3521b.this.f14431d = e;
                    throw e;
                }
            }
        }

        C3521b(j80 j80Var) {
            this.f14430c = j80Var;
        }

        @Override // p000.j80
        /* renamed from: c */
        public long mo12416c() {
            return this.f14430c.mo12416c();
        }

        @Override // p000.j80, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f14430c.close();
        }

        @Override // p000.j80
        /* renamed from: d */
        public b80 mo12417d() {
            return this.f14430c.mo12417d();
        }

        @Override // p000.j80
        /* renamed from: e */
        public BufferedSource mo12418e() {
            return Okio.buffer(new a(this.f14430c.mo12418e()));
        }

        /* renamed from: h */
        void m16917h() {
            IOException iOException = this.f14431d;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: za0$c */
    /* loaded from: classes.dex */
    public static final class C3522c extends j80 {

        /* renamed from: c */
        @Nullable
        private final b80 f14433c;

        /* renamed from: d */
        private final long f14434d;

        C3522c(@Nullable b80 b80Var, long j) {
            this.f14433c = b80Var;
            this.f14434d = j;
        }

        @Override // p000.j80
        /* renamed from: c */
        public long mo12416c() {
            return this.f14434d;
        }

        @Override // p000.j80
        /* renamed from: d */
        public b80 mo12417d() {
            return this.f14433c;
        }

        @Override // p000.j80
        /* renamed from: e */
        public BufferedSource mo12418e() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public za0(eb0 eb0Var, Object[] objArr, k70.InterfaceC2850a interfaceC2850a, ta0<j80, T> ta0Var) {
        this.f14420b = eb0Var;
        this.f14421c = objArr;
        this.f14422d = interfaceC2850a;
        this.f14423e = ta0Var;
    }

    /* renamed from: a */
    private k70 m16914a() {
        k70 mo11299a = this.f14422d.mo11299a(this.f14420b.m11577a(this.f14421c));
        if (mo11299a != null) {
            return mo11299a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: a */
    fb0<T> m16915a(i80 i80Var) {
        j80 m12385a = i80Var.m12385a();
        i80.C2583a m12394j = i80Var.m12394j();
        m12394j.m12406a(new C3522c(m12385a.mo12417d(), m12385a.mo12416c()));
        i80 m12411a = m12394j.m12411a();
        int m12389d = m12411a.m12389d();
        if (m12389d < 200 || m12389d >= 300) {
            try {
                return fb0.m11749a(ib0.m12426a(m12385a), m12411a);
            } finally {
                m12385a.close();
            }
        }
        if (m12389d == 204 || m12389d == 205) {
            m12385a.close();
            return fb0.m11750a((Object) null, m12411a);
        }
        C3521b c3521b = new C3521b(m12385a);
        try {
            return fb0.m11750a(this.f14423e.mo133a(c3521b), m12411a);
        } catch (RuntimeException e) {
            c3521b.m16917h();
            throw e;
        }
    }

    @Override // p000.pa0
    /* renamed from: a */
    public void mo14741a(ra0<T> ra0Var) {
        k70 k70Var;
        Throwable th;
        ib0.m12428a(ra0Var, "callback == null");
        synchronized (this) {
            if (this.f14427i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f14427i = true;
            k70Var = this.f14425g;
            th = this.f14426h;
            if (k70Var == null && th == null) {
                try {
                    k70 m16914a = m16914a();
                    this.f14425g = m16914a;
                    k70Var = m16914a;
                } catch (Throwable th2) {
                    th = th2;
                    ib0.m12438a(th);
                    this.f14426h = th;
                }
            }
        }
        if (th != null) {
            ra0Var.onFailure(this, th);
            return;
        }
        if (this.f14424f) {
            k70Var.cancel();
        }
        k70Var.mo11703a(new C3520a(ra0Var));
    }

    @Override // p000.pa0
    public void cancel() {
        k70 k70Var;
        this.f14424f = true;
        synchronized (this) {
            k70Var = this.f14425g;
        }
        if (k70Var != null) {
            k70Var.cancel();
        }
    }

    @Override // p000.pa0
    public za0<T> clone() {
        return new za0<>(this.f14420b, this.f14421c, this.f14422d, this.f14423e);
    }

    @Override // p000.pa0
    /* renamed from: e */
    public fb0<T> mo14742e() {
        k70 k70Var;
        synchronized (this) {
            if (this.f14427i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f14427i = true;
            if (this.f14426h != null) {
                if (this.f14426h instanceof IOException) {
                    throw ((IOException) this.f14426h);
                }
                if (this.f14426h instanceof RuntimeException) {
                    throw ((RuntimeException) this.f14426h);
                }
                throw ((Error) this.f14426h);
            }
            k70Var = this.f14425g;
            if (k70Var == null) {
                try {
                    k70Var = m16914a();
                    this.f14425g = k70Var;
                } catch (IOException | Error | RuntimeException e) {
                    ib0.m12438a(e);
                    this.f14426h = e;
                    throw e;
                }
            }
        }
        if (this.f14424f) {
            k70Var.cancel();
        }
        return m16915a(k70Var.mo11706e());
    }

    @Override // p000.pa0
    /* renamed from: f */
    public boolean mo14743f() {
        boolean z = true;
        if (this.f14424f) {
            return true;
        }
        synchronized (this) {
            if (this.f14425g == null || !this.f14425g.mo11707f()) {
                z = false;
            }
        }
        return z;
    }
}
