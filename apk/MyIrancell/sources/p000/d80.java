package p000;

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
import p000.i80;
import p000.k70;
import p000.v70;
import p000.y70;

/* loaded from: classes.dex */
public class d80 implements Cloneable, k70.InterfaceC2850a {

    /* renamed from: D */
    static final List<e80> f9717D = o80.m14452a(e80.HTTP_2, e80.HTTP_1_1);

    /* renamed from: E */
    static final List<q70> f9718E = o80.m14452a(q70.f12726g, q70.f12727h);

    /* renamed from: A */
    final int f9719A;

    /* renamed from: B */
    final int f9720B;

    /* renamed from: C */
    final int f9721C;

    /* renamed from: b */
    final t70 f9722b;

    /* renamed from: c */
    @Nullable
    final Proxy f9723c;

    /* renamed from: d */
    final List<e80> f9724d;

    /* renamed from: e */
    final List<q70> f9725e;

    /* renamed from: f */
    final List<a80> f9726f;

    /* renamed from: g */
    final List<a80> f9727g;

    /* renamed from: h */
    final v70.InterfaceC3344c f9728h;

    /* renamed from: i */
    final ProxySelector f9729i;

    /* renamed from: j */
    final s70 f9730j;

    /* renamed from: k */
    @Nullable
    final i70 f9731k;

    /* renamed from: l */
    @Nullable
    final t80 f9732l;

    /* renamed from: m */
    final SocketFactory f9733m;

    /* renamed from: n */
    final SSLSocketFactory f9734n;

    /* renamed from: o */
    final ka0 f9735o;

    /* renamed from: p */
    final HostnameVerifier f9736p;

    /* renamed from: q */
    final m70 f9737q;

    /* renamed from: r */
    final h70 f9738r;

    /* renamed from: s */
    final h70 f9739s;

    /* renamed from: t */
    final p70 f9740t;

    /* renamed from: u */
    final u70 f9741u;

    /* renamed from: v */
    final boolean f9742v;

    /* renamed from: w */
    final boolean f9743w;

    /* renamed from: x */
    final boolean f9744x;

    /* renamed from: y */
    final int f9745y;

    /* renamed from: z */
    final int f9746z;

    /* renamed from: d80$a */
    /* loaded from: classes.dex */
    class C2378a extends m80 {
        C2378a() {
        }

        @Override // p000.m80
        /* renamed from: a */
        public int mo11321a(i80.C2583a c2583a) {
            return c2583a.f10592c;
        }

        @Override // p000.m80
        @Nullable
        /* renamed from: a */
        public IOException mo11322a(k70 k70Var, @Nullable IOException iOException) {
            return ((f80) k70Var).m11702a(iOException);
        }

        @Override // p000.m80
        /* renamed from: a */
        public Socket mo11323a(p70 p70Var, g70 g70Var, a90 a90Var) {
            return p70Var.m14732a(g70Var, a90Var);
        }

        @Override // p000.m80
        /* renamed from: a */
        public w80 mo11324a(p70 p70Var, g70 g70Var, a90 a90Var, k80 k80Var) {
            return p70Var.m14733a(g70Var, a90Var, k80Var);
        }

        @Override // p000.m80
        /* renamed from: a */
        public x80 mo11325a(p70 p70Var) {
            return p70Var.f12573e;
        }

        @Override // p000.m80
        /* renamed from: a */
        public void mo11326a(q70 q70Var, SSLSocket sSLSocket, boolean z) {
            q70Var.m14982a(sSLSocket, z);
        }

        @Override // p000.m80
        /* renamed from: a */
        public void mo11327a(y70.C3476a c3476a, String str) {
            c3476a.m16598a(str);
        }

        @Override // p000.m80
        /* renamed from: a */
        public void mo11328a(y70.C3476a c3476a, String str, String str2) {
            c3476a.m16602b(str, str2);
        }

        @Override // p000.m80
        /* renamed from: a */
        public boolean mo11329a(g70 g70Var, g70 g70Var2) {
            return g70Var.m11907a(g70Var2);
        }

        @Override // p000.m80
        /* renamed from: a */
        public boolean mo11330a(p70 p70Var, w80 w80Var) {
            return p70Var.m14734a(w80Var);
        }

        @Override // p000.m80
        /* renamed from: b */
        public void mo11331b(p70 p70Var, w80 w80Var) {
            p70Var.m14735b(w80Var);
        }
    }

    /* renamed from: d80$b */
    /* loaded from: classes.dex */
    public static final class C2379b {

        /* renamed from: A */
        int f9747A;

        /* renamed from: B */
        int f9748B;

        /* renamed from: b */
        @Nullable
        Proxy f9750b;

        /* renamed from: h */
        ProxySelector f9756h;

        /* renamed from: i */
        s70 f9757i;

        /* renamed from: j */
        @Nullable
        i70 f9758j;

        /* renamed from: k */
        @Nullable
        t80 f9759k;

        /* renamed from: l */
        SocketFactory f9760l;

        /* renamed from: m */
        @Nullable
        SSLSocketFactory f9761m;

        /* renamed from: n */
        @Nullable
        ka0 f9762n;

        /* renamed from: o */
        HostnameVerifier f9763o;

        /* renamed from: p */
        m70 f9764p;

        /* renamed from: q */
        h70 f9765q;

        /* renamed from: r */
        h70 f9766r;

        /* renamed from: s */
        p70 f9767s;

        /* renamed from: t */
        u70 f9768t;

        /* renamed from: u */
        boolean f9769u;

        /* renamed from: v */
        boolean f9770v;

        /* renamed from: w */
        boolean f9771w;

        /* renamed from: x */
        int f9772x;

        /* renamed from: y */
        int f9773y;

        /* renamed from: z */
        int f9774z;

        /* renamed from: e */
        final List<a80> f9753e = new ArrayList();

        /* renamed from: f */
        final List<a80> f9754f = new ArrayList();

        /* renamed from: a */
        t70 f9749a = new t70();

        /* renamed from: c */
        List<e80> f9751c = d80.f9717D;

        /* renamed from: d */
        List<q70> f9752d = d80.f9718E;

        /* renamed from: g */
        v70.InterfaceC3344c f9755g = v70.m15948a(v70.f13623a);

        public C2379b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f9756h = proxySelector;
            if (proxySelector == null) {
                this.f9756h = new ha0();
            }
            this.f9757i = s70.f13037a;
            this.f9760l = SocketFactory.getDefault();
            this.f9763o = la0.f11833a;
            this.f9764p = m70.f12089c;
            h70 h70Var = h70.f10403a;
            this.f9765q = h70Var;
            this.f9766r = h70Var;
            this.f9767s = new p70();
            this.f9768t = u70.f13435a;
            this.f9769u = true;
            this.f9770v = true;
            this.f9771w = true;
            this.f9772x = 0;
            this.f9773y = 10000;
            this.f9774z = 10000;
            this.f9747A = 10000;
            this.f9748B = 0;
        }

        /* renamed from: a */
        public C2379b m11332a(long j, TimeUnit timeUnit) {
            this.f9773y = o80.m14442a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public C2379b m11333a(a80 a80Var) {
            if (a80Var == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f9753e.add(a80Var);
            return this;
        }

        /* renamed from: a */
        public C2379b m11334a(h70 h70Var) {
            if (h70Var == null) {
                throw new NullPointerException("authenticator == null");
            }
            this.f9766r = h70Var;
            return this;
        }

        /* renamed from: a */
        public C2379b m11335a(m70 m70Var) {
            if (m70Var == null) {
                throw new NullPointerException("certificatePinner == null");
            }
            this.f9764p = m70Var;
            return this;
        }

        /* renamed from: a */
        public d80 m11336a() {
            return new d80(this);
        }

        /* renamed from: b */
        public C2379b m11337b(long j, TimeUnit timeUnit) {
            this.f9774z = o80.m14442a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public C2379b m11338b(a80 a80Var) {
            if (a80Var == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f9754f.add(a80Var);
            return this;
        }

        /* renamed from: b */
        public List<a80> m11339b() {
            return this.f9753e;
        }
    }

    static {
        m80.f12098a = new C2378a();
    }

    public d80() {
        this(new C2379b());
    }

    d80(C2379b c2379b) {
        boolean z;
        ka0 ka0Var;
        this.f9722b = c2379b.f9749a;
        this.f9723c = c2379b.f9750b;
        this.f9724d = c2379b.f9751c;
        this.f9725e = c2379b.f9752d;
        this.f9726f = o80.m14451a(c2379b.f9753e);
        this.f9727g = o80.m14451a(c2379b.f9754f);
        this.f9728h = c2379b.f9755g;
        this.f9729i = c2379b.f9756h;
        this.f9730j = c2379b.f9757i;
        this.f9731k = c2379b.f9758j;
        this.f9732l = c2379b.f9759k;
        this.f9733m = c2379b.f9760l;
        Iterator<q70> it = this.f9725e.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().m14984b();
            }
        }
        if (c2379b.f9761m == null && z) {
            X509TrustManager m14455a = o80.m14455a();
            this.f9734n = m11293a(m14455a);
            ka0Var = ka0.m13660a(m14455a);
        } else {
            this.f9734n = c2379b.f9761m;
            ka0Var = c2379b.f9762n;
        }
        this.f9735o = ka0Var;
        if (this.f9734n != null) {
            ga0.m11953c().mo3636a(this.f9734n);
        }
        this.f9736p = c2379b.f9763o;
        this.f9737q = c2379b.f9764p.m14066a(this.f9735o);
        this.f9738r = c2379b.f9765q;
        this.f9739s = c2379b.f9766r;
        this.f9740t = c2379b.f9767s;
        this.f9741u = c2379b.f9768t;
        this.f9742v = c2379b.f9769u;
        this.f9743w = c2379b.f9770v;
        this.f9744x = c2379b.f9771w;
        this.f9745y = c2379b.f9772x;
        this.f9746z = c2379b.f9773y;
        this.f9719A = c2379b.f9774z;
        this.f9720B = c2379b.f9747A;
        this.f9721C = c2379b.f9748B;
        if (this.f9726f.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f9726f);
        }
        if (this.f9727g.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f9727g);
        }
    }

    /* renamed from: a */
    private static SSLSocketFactory m11293a(X509TrustManager x509TrustManager) {
        try {
            SSLContext mo3353a = ga0.m11953c().mo3353a();
            mo3353a.init(null, new TrustManager[]{x509TrustManager}, null);
            return mo3353a.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw o80.m14444a("No System TLS", (Exception) e);
        }
    }

    /* renamed from: A */
    public boolean m11294A() {
        return this.f9744x;
    }

    /* renamed from: B */
    public SocketFactory m11295B() {
        return this.f9733m;
    }

    /* renamed from: C */
    public SSLSocketFactory m11296C() {
        return this.f9734n;
    }

    /* renamed from: D */
    public int m11297D() {
        return this.f9720B;
    }

    /* renamed from: a */
    public h70 m11298a() {
        return this.f9739s;
    }

    @Override // p000.k70.InterfaceC2850a
    /* renamed from: a */
    public k70 mo11299a(g80 g80Var) {
        return f80.m11698a(this, g80Var, false);
    }

    /* renamed from: b */
    public int m11300b() {
        return this.f9745y;
    }

    /* renamed from: c */
    public m70 m11301c() {
        return this.f9737q;
    }

    /* renamed from: g */
    public int m11302g() {
        return this.f9746z;
    }

    /* renamed from: h */
    public p70 m11303h() {
        return this.f9740t;
    }

    /* renamed from: j */
    public List<q70> m11304j() {
        return this.f9725e;
    }

    /* renamed from: k */
    public s70 m11305k() {
        return this.f9730j;
    }

    /* renamed from: l */
    public t70 m11306l() {
        return this.f9722b;
    }

    /* renamed from: m */
    public u70 m11307m() {
        return this.f9741u;
    }

    /* renamed from: n */
    public v70.InterfaceC3344c m11308n() {
        return this.f9728h;
    }

    /* renamed from: o */
    public boolean m11309o() {
        return this.f9743w;
    }

    /* renamed from: p */
    public boolean m11310p() {
        return this.f9742v;
    }

    /* renamed from: q */
    public HostnameVerifier m11311q() {
        return this.f9736p;
    }

    /* renamed from: r */
    public List<a80> m11312r() {
        return this.f9726f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public t80 m11313s() {
        i70 i70Var = this.f9731k;
        return i70Var != null ? i70Var.f10575b : this.f9732l;
    }

    /* renamed from: t */
    public List<a80> m11314t() {
        return this.f9727g;
    }

    /* renamed from: u */
    public int m11315u() {
        return this.f9721C;
    }

    /* renamed from: v */
    public List<e80> m11316v() {
        return this.f9724d;
    }

    @Nullable
    /* renamed from: w */
    public Proxy m11317w() {
        return this.f9723c;
    }

    /* renamed from: x */
    public h70 m11318x() {
        return this.f9738r;
    }

    /* renamed from: y */
    public ProxySelector m11319y() {
        return this.f9729i;
    }

    /* renamed from: z */
    public int m11320z() {
        return this.f9719A;
    }
}
