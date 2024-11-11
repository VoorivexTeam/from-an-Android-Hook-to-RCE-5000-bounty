package defpackage;

import defpackage.i80;
import defpackage.k70;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class za0<T> implements pa0<T> {
    private final eb0 b;
    private final Object[] c;
    private final k70.a d;
    private final ta0<j80, T> e;
    private volatile boolean f;

    @GuardedBy("this")
    @Nullable
    private k70 g;

    @GuardedBy("this")
    @Nullable
    private Throwable h;

    @GuardedBy("this")
    private boolean i;

    /* loaded from: classes.dex */
    class a implements l70 {
        final /* synthetic */ ra0 a;

        a(ra0 ra0Var) {
            this.a = ra0Var;
        }

        private void a(Throwable th) {
            try {
                this.a.onFailure(za0.this, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        @Override // defpackage.l70
        public void a(k70 k70Var, i80 i80Var) {
            try {
                try {
                    this.a.onResponse(za0.this, za0.this.a(i80Var));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                ib0.a(th2);
                a(th2);
            }
        }

        @Override // defpackage.l70
        public void a(k70 k70Var, IOException iOException) {
            a(iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends j80 {
        private final j80 c;

        @Nullable
        IOException d;

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
                    b.this.d = e;
                    throw e;
                }
            }
        }

        b(j80 j80Var) {
            this.c = j80Var;
        }

        @Override // defpackage.j80
        public long c() {
            return this.c.c();
        }

        @Override // defpackage.j80, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.c.close();
        }

        @Override // defpackage.j80
        public b80 d() {
            return this.c.d();
        }

        @Override // defpackage.j80
        public BufferedSource e() {
            return Okio.buffer(new a(this.c.e()));
        }

        void h() {
            IOException iOException = this.d;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends j80 {

        @Nullable
        private final b80 c;
        private final long d;

        c(@Nullable b80 b80Var, long j) {
            this.c = b80Var;
            this.d = j;
        }

        @Override // defpackage.j80
        public long c() {
            return this.d;
        }

        @Override // defpackage.j80
        public b80 d() {
            return this.c;
        }

        @Override // defpackage.j80
        public BufferedSource e() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public za0(eb0 eb0Var, Object[] objArr, k70.a aVar, ta0<j80, T> ta0Var) {
        this.b = eb0Var;
        this.c = objArr;
        this.d = aVar;
        this.e = ta0Var;
    }

    private k70 a() {
        k70 a2 = this.d.a(this.b.a(this.c));
        if (a2 != null) {
            return a2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    fb0<T> a(i80 i80Var) {
        j80 a2 = i80Var.a();
        i80.a j = i80Var.j();
        j.a(new c(a2.d(), a2.c()));
        i80 a3 = j.a();
        int d = a3.d();
        if (d < 200 || d >= 300) {
            try {
                return fb0.a(ib0.a(a2), a3);
            } finally {
                a2.close();
            }
        }
        if (d == 204 || d == 205) {
            a2.close();
            return fb0.a((Object) null, a3);
        }
        b bVar = new b(a2);
        try {
            return fb0.a(this.e.a(bVar), a3);
        } catch (RuntimeException e) {
            bVar.h();
            throw e;
        }
    }

    @Override // defpackage.pa0
    public void a(ra0<T> ra0Var) {
        k70 k70Var;
        Throwable th;
        ib0.a(ra0Var, "callback == null");
        synchronized (this) {
            if (this.i) {
                throw new IllegalStateException("Already executed.");
            }
            this.i = true;
            k70Var = this.g;
            th = this.h;
            if (k70Var == null && th == null) {
                try {
                    k70 a2 = a();
                    this.g = a2;
                    k70Var = a2;
                } catch (Throwable th2) {
                    th = th2;
                    ib0.a(th);
                    this.h = th;
                }
            }
        }
        if (th != null) {
            ra0Var.onFailure(this, th);
            return;
        }
        if (this.f) {
            k70Var.cancel();
        }
        k70Var.a(new a(ra0Var));
    }

    @Override // defpackage.pa0
    public void cancel() {
        k70 k70Var;
        this.f = true;
        synchronized (this) {
            k70Var = this.g;
        }
        if (k70Var != null) {
            k70Var.cancel();
        }
    }

    @Override // defpackage.pa0
    public za0<T> clone() {
        return new za0<>(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.pa0
    public fb0<T> e() {
        k70 k70Var;
        synchronized (this) {
            if (this.i) {
                throw new IllegalStateException("Already executed.");
            }
            this.i = true;
            if (this.h != null) {
                if (this.h instanceof IOException) {
                    throw ((IOException) this.h);
                }
                if (this.h instanceof RuntimeException) {
                    throw ((RuntimeException) this.h);
                }
                throw ((Error) this.h);
            }
            k70Var = this.g;
            if (k70Var == null) {
                try {
                    k70Var = a();
                    this.g = k70Var;
                } catch (IOException | Error | RuntimeException e) {
                    ib0.a(e);
                    this.h = e;
                    throw e;
                }
            }
        }
        if (this.f) {
            k70Var.cancel();
        }
        return a(k70Var.e());
    }

    @Override // defpackage.pa0
    public boolean f() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            if (this.g == null || !this.g.f()) {
                z = false;
            }
        }
        return z;
    }
}
