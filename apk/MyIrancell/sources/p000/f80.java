package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okio.AsyncTimeout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f80 implements k70 {

    /* renamed from: b */
    final d80 f10096b;

    /* renamed from: c */
    final k90 f10097c;

    /* renamed from: d */
    final AsyncTimeout f10098d;

    /* renamed from: e */
    @Nullable
    private v70 f10099e;

    /* renamed from: f */
    final g80 f10100f;

    /* renamed from: g */
    final boolean f10101g;

    /* renamed from: h */
    private boolean f10102h;

    /* renamed from: f80$a */
    /* loaded from: classes.dex */
    class C2463a extends AsyncTimeout {
        C2463a() {
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
            f80.this.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f80$b */
    /* loaded from: classes.dex */
    public final class C2464b extends n80 {

        /* renamed from: c */
        private final l70 f10104c;

        C2464b(l70 l70Var) {
            super("OkHttp %s", f80.this.m11704b());
            this.f10104c = l70Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m11708a(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    f80.this.f10099e.m15953a(f80.this, interruptedIOException);
                    this.f10104c.mo13830a(f80.this, interruptedIOException);
                    f80.this.f10096b.m11306l().m15561b(this);
                }
            } catch (Throwable th) {
                f80.this.f10096b.m11306l().m15561b(this);
                throw th;
            }
        }

        @Override // p000.n80
        /* renamed from: b */
        protected void mo11709b() {
            IOException e;
            i80 m11701a;
            f80.this.f10098d.enter();
            boolean z = true;
            try {
                try {
                    m11701a = f80.this.m11701a();
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                }
                try {
                    if (f80.this.f10097c.m13659b()) {
                        this.f10104c.mo13830a(f80.this, new IOException("Canceled"));
                    } else {
                        this.f10104c.mo13829a(f80.this, m11701a);
                    }
                } catch (IOException e3) {
                    e = e3;
                    IOException m11702a = f80.this.m11702a(e);
                    if (z) {
                        ga0.m11953c().mo3355a(4, "Callback failure for " + f80.this.m11705c(), m11702a);
                    } else {
                        f80.this.f10099e.m15953a(f80.this, m11702a);
                        this.f10104c.mo13830a(f80.this, m11702a);
                    }
                }
            } finally {
                f80.this.f10096b.m11306l().m15561b(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public f80 m11710c() {
            return f80.this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public String m11711d() {
            return f80.this.f10100f.m11925g().m16812g();
        }
    }

    private f80(d80 d80Var, g80 g80Var, boolean z) {
        this.f10096b = d80Var;
        this.f10100f = g80Var;
        this.f10101g = z;
        this.f10097c = new k90(d80Var, z);
        C2463a c2463a = new C2463a();
        this.f10098d = c2463a;
        c2463a.timeout(d80Var.m11300b(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static f80 m11698a(d80 d80Var, g80 g80Var, boolean z) {
        f80 f80Var = new f80(d80Var, g80Var, z);
        f80Var.f10099e = d80Var.m11308n().mo15969a(f80Var);
        return f80Var;
    }

    /* renamed from: g */
    private void m11700g() {
        this.f10097c.m13658a(ga0.m11953c().mo3352a("response.body().close()"));
    }

    /* renamed from: a */
    i80 m11701a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f10096b.m11312r());
        arrayList.add(this.f10097c);
        arrayList.add(new b90(this.f10096b.m11305k()));
        arrayList.add(new q80(this.f10096b.m11313s()));
        arrayList.add(new u80(this.f10096b));
        if (!this.f10101g) {
            arrayList.addAll(this.f10096b.m11314t());
        }
        arrayList.add(new c90(this.f10101g));
        return new h90(arrayList, null, null, null, 0, this.f10100f, this, this.f10099e, this.f10096b.m11302g(), this.f10096b.m11320z(), this.f10096b.m11297D()).mo96a(this.f10100f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public IOException m11702a(@Nullable IOException iOException) {
        if (!this.f10098d.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // p000.k70
    /* renamed from: a */
    public void mo11703a(l70 l70Var) {
        synchronized (this) {
            if (this.f10102h) {
                throw new IllegalStateException("Already Executed");
            }
            this.f10102h = true;
        }
        m11700g();
        this.f10099e.m15961b(this);
        this.f10096b.m11306l().m15558a(new C2464b(l70Var));
    }

    /* renamed from: b */
    String m11704b() {
        return this.f10100f.m11925g().m16818m();
    }

    /* renamed from: c */
    String m11705c() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo11707f() ? "canceled " : "");
        sb.append(this.f10101g ? "web socket" : "call");
        sb.append(" to ");
        sb.append(m11704b());
        return sb.toString();
    }

    @Override // p000.k70
    public void cancel() {
        this.f10097c.m13657a();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f80 m16983clone() {
        return m11698a(this.f10096b, this.f10100f, this.f10101g);
    }

    @Override // p000.k70
    /* renamed from: e */
    public i80 mo11706e() {
        synchronized (this) {
            if (this.f10102h) {
                throw new IllegalStateException("Already Executed");
            }
            this.f10102h = true;
        }
        m11700g();
        this.f10098d.enter();
        this.f10099e.m15961b(this);
        try {
            try {
                this.f10096b.m11306l().m15559a(this);
                i80 m11701a = m11701a();
                if (m11701a != null) {
                    return m11701a;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException m11702a = m11702a(e);
                this.f10099e.m15953a(this, m11702a);
                throw m11702a;
            }
        } finally {
            this.f10096b.m11306l().m15562b(this);
        }
    }

    @Override // p000.k70
    /* renamed from: f */
    public boolean mo11707f() {
        return this.f10097c.m13659b();
    }
}
