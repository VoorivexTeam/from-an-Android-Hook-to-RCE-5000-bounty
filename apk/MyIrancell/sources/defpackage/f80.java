package defpackage;

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
    final d80 b;
    final k90 c;
    final AsyncTimeout d;

    @Nullable
    private v70 e;
    final g80 f;
    final boolean g;
    private boolean h;

    /* loaded from: classes.dex */
    class a extends AsyncTimeout {
        a() {
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
            f80.this.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b extends n80 {
        private final l70 c;

        b(l70 l70Var) {
            super("OkHttp %s", f80.this.b());
            this.c = l70Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    f80.this.e.a(f80.this, interruptedIOException);
                    this.c.a(f80.this, interruptedIOException);
                    f80.this.b.l().b(this);
                }
            } catch (Throwable th) {
                f80.this.b.l().b(this);
                throw th;
            }
        }

        @Override // defpackage.n80
        protected void b() {
            IOException e;
            i80 a;
            f80.this.d.enter();
            boolean z = true;
            try {
                try {
                    a = f80.this.a();
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                }
                try {
                    if (f80.this.c.b()) {
                        this.c.a(f80.this, new IOException("Canceled"));
                    } else {
                        this.c.a(f80.this, a);
                    }
                } catch (IOException e3) {
                    e = e3;
                    IOException a2 = f80.this.a(e);
                    if (z) {
                        ga0.c().a(4, "Callback failure for " + f80.this.c(), a2);
                    } else {
                        f80.this.e.a(f80.this, a2);
                        this.c.a(f80.this, a2);
                    }
                }
            } finally {
                f80.this.b.l().b(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f80 c() {
            return f80.this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String d() {
            return f80.this.f.g().g();
        }
    }

    private f80(d80 d80Var, g80 g80Var, boolean z) {
        this.b = d80Var;
        this.f = g80Var;
        this.g = z;
        this.c = new k90(d80Var, z);
        a aVar = new a();
        this.d = aVar;
        aVar.timeout(d80Var.b(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f80 a(d80 d80Var, g80 g80Var, boolean z) {
        f80 f80Var = new f80(d80Var, g80Var, z);
        f80Var.e = d80Var.n().a(f80Var);
        return f80Var;
    }

    private void g() {
        this.c.a(ga0.c().a("response.body().close()"));
    }

    i80 a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.r());
        arrayList.add(this.c);
        arrayList.add(new b90(this.b.k()));
        arrayList.add(new q80(this.b.s()));
        arrayList.add(new u80(this.b));
        if (!this.g) {
            arrayList.addAll(this.b.t());
        }
        arrayList.add(new c90(this.g));
        return new h90(arrayList, null, null, null, 0, this.f, this, this.e, this.b.g(), this.b.z(), this.b.D()).a(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public IOException a(@Nullable IOException iOException) {
        if (!this.d.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // defpackage.k70
    public void a(l70 l70Var) {
        synchronized (this) {
            if (this.h) {
                throw new IllegalStateException("Already Executed");
            }
            this.h = true;
        }
        g();
        this.e.b(this);
        this.b.l().a(new b(l70Var));
    }

    String b() {
        return this.f.g().m();
    }

    String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(f() ? "canceled " : "");
        sb.append(this.g ? "web socket" : "call");
        sb.append(" to ");
        sb.append(b());
        return sb.toString();
    }

    @Override // defpackage.k70
    public void cancel() {
        this.c.a();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f80 m5clone() {
        return a(this.b, this.f, this.g);
    }

    @Override // defpackage.k70
    public i80 e() {
        synchronized (this) {
            if (this.h) {
                throw new IllegalStateException("Already Executed");
            }
            this.h = true;
        }
        g();
        this.d.enter();
        this.e.b(this);
        try {
            try {
                this.b.l().a(this);
                i80 a2 = a();
                if (a2 != null) {
                    return a2;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException a3 = a(e);
                this.e.a(this, a3);
                throw a3;
            }
        } finally {
            this.b.l().b(this);
        }
    }

    @Override // defpackage.k70
    public boolean f() {
        return this.c.b();
    }
}
