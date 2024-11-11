package defpackage;

import defpackage.i80;
import defpackage.k70;
import defpackage.v70;
import defpackage.y70;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class d80 implements Cloneable, k70.a {
    static final List<e80> D = o80.a(e80.HTTP_2, e80.HTTP_1_1);
    static final List<q70> E = o80.a(q70.g, q70.h);
    final int A;
    final int B;
    final int C;
    final t70 b;

    @Nullable
    final Proxy c;
    final List<e80> d;
    final List<q70> e;
    final List<a80> f;
    final List<a80> g;
    final v70.c h;
    final ProxySelector i;
    final s70 j;

    @Nullable
    final i70 k;

    @Nullable
    final t80 l;
    final SocketFactory m;
    final SSLSocketFactory n;
    final ka0 o;
    final HostnameVerifier p;
    final m70 q;
    final h70 r;
    final h70 s;
    final p70 t;
    final u70 u;
    final boolean v;
    final boolean w;
    final boolean x;
    final int y;
    final int z;

    /* loaded from: classes.dex */
    class a extends m80 {
        a() {
        }

        @Override // defpackage.m80
        public int a(i80.a aVar) {
            return aVar.c;
        }

        @Override // defpackage.m80
        @Nullable
        public IOException a(k70 k70Var, @Nullable IOException iOException) {
            return ((f80) k70Var).a(iOException);
        }

        @Override // defpackage.m80
        public Socket a(p70 p70Var, g70 g70Var, a90 a90Var) {
            return p70Var.a(g70Var, a90Var);
        }

        @Override // defpackage.m80
        public w80 a(p70 p70Var, g70 g70Var, a90 a90Var, k80 k80Var) {
            return p70Var.a(g70Var, a90Var, k80Var);
        }

        @Override // defpackage.m80
        public x80 a(p70 p70Var) {
            return p70Var.e;
        }

        @Override // defpackage.m80
        public void a(q70 q70Var, SSLSocket sSLSocket, boolean z) {
            q70Var.a(sSLSocket, z);
        }

        @Override // defpackage.m80
        public void a(y70.a aVar, String str) {
            aVar.a(str);
        }

        @Override // defpackage.m80
        public void a(y70.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // defpackage.m80
        public boolean a(g70 g70Var, g70 g70Var2) {
            return g70Var.a(g70Var2);
        }

        @Override // defpackage.m80
        public boolean a(p70 p70Var, w80 w80Var) {
            return p70Var.a(w80Var);
        }

        @Override // defpackage.m80
        public void b(p70 p70Var, w80 w80Var) {
            p70Var.b(w80Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        int A;
        int B;

        @Nullable
        Proxy b;
        ProxySelector h;
        s70 i;

        @Nullable
        i70 j;

        @Nullable
        t80 k;
        SocketFactory l;

        @Nullable
        SSLSocketFactory m;

        @Nullable
        ka0 n;
        HostnameVerifier o;
        m70 p;
        h70 q;
        h70 r;
        p70 s;
        u70 t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;
        final List<a80> e = new ArrayList();
        final List<a80> f = new ArrayList();
        t70 a = new t70();
        List<e80> c = d80.D;
        List<q70> d = d80.E;
        v70.c g = v70.a(v70.a);

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new ha0();
            }
            this.i = s70.a;
            this.l = SocketFactory.getDefault();
            this.o = la0.a;
            this.p = m70.c;
            h70 h70Var = h70.a;
            this.q = h70Var;
            this.r = h70Var;
            this.s = new p70();
            this.t = u70.a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        public b a(long j, TimeUnit timeUnit) {
            this.y = o80.a("timeout", j, timeUnit);
            return this;
        }

        public b a(a80 a80Var) {
            if (a80Var == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.e.add(a80Var);
            return this;
        }

        public b a(h70 h70Var) {
            if (h70Var == null) {
                throw new NullPointerException("authenticator == null");
            }
            this.r = h70Var;
            return this;
        }

        public b a(m70 m70Var) {
            if (m70Var == null) {
                throw new NullPointerException("certificatePinner == null");
            }
            this.p = m70Var;
            return this;
        }

        public d80 a() {
            return new d80(this);
        }

        public b b(long j, TimeUnit timeUnit) {
            this.z = o80.a("timeout", j, timeUnit);
            return this;
        }

        public b b(a80 a80Var) {
            if (a80Var == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f.add(a80Var);
            return this;
        }

        public List<a80> b() {
            return this.e;
        }
    }

    static {
        m80.a = new a();
    }

    public d80() {
        this(new b());
    }

    d80(b bVar) {
        boolean z;
        ka0 ka0Var;
        this.b = bVar.a;
        this.c = bVar.b;
        this.d = bVar.c;
        this.e = bVar.d;
        this.f = o80.a(bVar.e);
        this.g = o80.a(bVar.f);
        this.h = bVar.g;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
        Iterator<q70> it = this.e.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().b();
            }
        }
        if (bVar.m == null && z) {
            X509TrustManager a2 = o80.a();
            this.n = a(a2);
            ka0Var = ka0.a(a2);
        } else {
            this.n = bVar.m;
            ka0Var = bVar.n;
        }
        this.o = ka0Var;
        if (this.n != null) {
            ga0.c().a(this.n);
        }
        this.p = bVar.o;
        this.q = bVar.p.a(this.o);
        this.r = bVar.q;
        this.s = bVar.r;
        this.t = bVar.s;
        this.u = bVar.t;
        this.v = bVar.u;
        this.w = bVar.v;
        this.x = bVar.w;
        this.y = bVar.x;
        this.z = bVar.y;
        this.A = bVar.z;
        this.B = bVar.A;
        this.C = bVar.B;
        if (this.f.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f);
        }
        if (this.g.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.g);
        }
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext a2 = ga0.c().a();
            a2.init(null, new TrustManager[]{x509TrustManager}, null);
            return a2.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw o80.a("No System TLS", (Exception) e);
        }
    }

    public boolean A() {
        return this.x;
    }

    public SocketFactory B() {
        return this.m;
    }

    public SSLSocketFactory C() {
        return this.n;
    }

    public int D() {
        return this.B;
    }

    public h70 a() {
        return this.s;
    }

    @Override // k70.a
    public k70 a(g80 g80Var) {
        return f80.a(this, g80Var, false);
    }

    public int b() {
        return this.y;
    }

    public m70 c() {
        return this.q;
    }

    public int g() {
        return this.z;
    }

    public p70 h() {
        return this.t;
    }

    public List<q70> j() {
        return this.e;
    }

    public s70 k() {
        return this.j;
    }

    public t70 l() {
        return this.b;
    }

    public u70 m() {
        return this.u;
    }

    public v70.c n() {
        return this.h;
    }

    public boolean o() {
        return this.w;
    }

    public boolean p() {
        return this.v;
    }

    public HostnameVerifier q() {
        return this.p;
    }

    public List<a80> r() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t80 s() {
        i70 i70Var = this.k;
        return i70Var != null ? i70Var.b : this.l;
    }

    public List<a80> t() {
        return this.g;
    }

    public int u() {
        return this.C;
    }

    public List<e80> v() {
        return this.d;
    }

    @Nullable
    public Proxy w() {
        return this.c;
    }

    public h70 x() {
        return this.r;
    }

    public ProxySelector y() {
        return this.i;
    }

    public int z() {
        return this.A;
    }
}
