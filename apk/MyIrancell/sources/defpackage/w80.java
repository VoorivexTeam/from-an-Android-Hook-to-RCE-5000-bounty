package defpackage;

import defpackage.a80;
import defpackage.g80;
import defpackage.i80;
import defpackage.t90;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* loaded from: classes.dex */
public final class w80 extends t90.h implements o70 {
    private final p70 b;
    private final k80 c;
    private Socket d;
    private Socket e;
    private x70 f;
    private e80 g;
    private t90 h;
    private BufferedSource i;
    private BufferedSink j;
    public boolean k;
    public int l;
    public int m = 1;
    public final List<Reference<a90>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public w80(p70 p70Var, k80 k80Var) {
        this.b = p70Var;
        this.c = k80Var;
    }

    private g80 a(int i, int i2, g80 g80Var, z70 z70Var) {
        String str = "CONNECT " + o80.a(z70Var, true) + " HTTP/1.1";
        while (true) {
            m90 m90Var = new m90(null, null, this.i, this.j);
            this.i.timeout().timeout(i, TimeUnit.MILLISECONDS);
            this.j.timeout().timeout(i2, TimeUnit.MILLISECONDS);
            m90Var.a(g80Var.c(), str);
            m90Var.a();
            i80.a a = m90Var.a(false);
            a.a(g80Var);
            i80 a2 = a.a();
            long a3 = f90.a(a2);
            if (a3 == -1) {
                a3 = 0;
            }
            Source b = m90Var.b(a3);
            o80.b(b, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            b.close();
            int d = a2.d();
            if (d == 200) {
                if (this.i.buffer().exhausted() && this.j.buffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (d != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + a2.d());
            }
            g80 a4 = this.c.a().g().a(this.c, a2);
            if (a4 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(a2.a("Connection"))) {
                return a4;
            }
            g80Var = a4;
        }
    }

    private void a(int i) {
        this.e.setSoTimeout(0);
        t90.g gVar = new t90.g(true);
        gVar.a(this.e, this.c.a().k().g(), this.i, this.j);
        gVar.a(this);
        gVar.a(i);
        t90 a = gVar.a();
        this.h = a;
        a.d();
    }

    private void a(int i, int i2, int i3, k70 k70Var, v70 v70Var) {
        g80 g = g();
        z70 g2 = g.g();
        for (int i4 = 0; i4 < 21; i4++) {
            a(i, i2, k70Var, v70Var);
            g = a(i2, i3, g, g2);
            if (g == null) {
                return;
            }
            o80.a(this.d);
            this.d = null;
            this.j = null;
            this.i = null;
            v70Var.a(k70Var, this.c.d(), this.c.b(), null);
        }
    }

    private void a(int i, int i2, k70 k70Var, v70 v70Var) {
        Proxy b = this.c.b();
        this.d = (b.type() == Proxy.Type.DIRECT || b.type() == Proxy.Type.HTTP) ? this.c.a().i().createSocket() : new Socket(b);
        v70Var.a(k70Var, this.c.d(), b);
        this.d.setSoTimeout(i2);
        try {
            ga0.c().a(this.d, this.c.d(), i);
            try {
                this.i = Okio.buffer(Okio.source(this.d));
                this.j = Okio.buffer(Okio.sink(this.d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.c.d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void a(v80 v80Var) {
        SSLSocket sSLSocket;
        g70 a = this.c.a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) a.j().createSocket(this.d, a.k().g(), a.k().k(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            q70 a2 = v80Var.a(sSLSocket);
            if (a2.c()) {
                ga0.c().a(sSLSocket, a.k().g(), a.e());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            x70 a3 = x70.a(session);
            if (a.d().verify(a.k().g(), session)) {
                a.a().a(a.k().g(), a3.b());
                String b = a2.c() ? ga0.c().b(sSLSocket) : null;
                this.e = sSLSocket;
                this.i = Okio.buffer(Okio.source(sSLSocket));
                this.j = Okio.buffer(Okio.sink(this.e));
                this.f = a3;
                this.g = b != null ? e80.get(b) : e80.HTTP_1_1;
                if (sSLSocket != null) {
                    ga0.c().a(sSLSocket);
                    return;
                }
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) a3.b().get(0);
            throw new SSLPeerUnverifiedException("Hostname " + a.k().g() + " not verified:\n    certificate: " + m70.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + la0.a(x509Certificate));
        } catch (AssertionError e2) {
            e = e2;
            if (!o80.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                ga0.c().a(sSLSocket2);
            }
            o80.a((Socket) sSLSocket2);
            throw th;
        }
    }

    private void a(v80 v80Var, int i, k70 k70Var, v70 v70Var) {
        if (this.c.a().j() != null) {
            v70Var.g(k70Var);
            a(v80Var);
            v70Var.a(k70Var, this.f);
            if (this.g == e80.HTTP_2) {
                a(i);
                return;
            }
            return;
        }
        if (!this.c.a().e().contains(e80.H2_PRIOR_KNOWLEDGE)) {
            this.e = this.d;
            this.g = e80.HTTP_1_1;
        } else {
            this.e = this.d;
            this.g = e80.H2_PRIOR_KNOWLEDGE;
            a(i);
        }
    }

    private g80 g() {
        g80.a aVar = new g80.a();
        aVar.a(this.c.a().k());
        aVar.a("CONNECT", (h80) null);
        aVar.b("Host", o80.a(this.c.a().k(), true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", p80.a());
        g80 a = aVar.a();
        i80.a aVar2 = new i80.a();
        aVar2.a(a);
        aVar2.a(e80.HTTP_1_1);
        aVar2.a(407);
        aVar2.a("Preemptive Authenticate");
        aVar2.a(o80.c);
        aVar2.b(-1L);
        aVar2.a(-1L);
        aVar2.b("Proxy-Authenticate", "OkHttp-Preemptive");
        g80 a2 = this.c.a().g().a(this.c, aVar2.a());
        return a2 != null ? a2 : a;
    }

    public d90 a(d80 d80Var, a80.a aVar, a90 a90Var) {
        if (this.h != null) {
            return new s90(d80Var, aVar, a90Var, this.h);
        }
        this.e.setSoTimeout(aVar.b());
        this.i.timeout().timeout(aVar.b(), TimeUnit.MILLISECONDS);
        this.j.timeout().timeout(aVar.c(), TimeUnit.MILLISECONDS);
        return new m90(d80Var, a90Var, this.i, this.j);
    }

    @Override // defpackage.o70
    public e80 a() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r17, int r18, int r19, int r20, boolean r21, defpackage.k70 r22, defpackage.v70 r23) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w80.a(int, int, int, int, boolean, k70, v70):void");
    }

    @Override // t90.h
    public void a(t90 t90Var) {
        synchronized (this.b) {
            this.m = t90Var.c();
        }
    }

    @Override // t90.h
    public void a(v90 v90Var) {
        v90Var.a(o90.REFUSED_STREAM);
    }

    public boolean a(g70 g70Var, @Nullable k80 k80Var) {
        if (this.n.size() >= this.m || this.k || !m80.a.a(this.c.a(), g70Var)) {
            return false;
        }
        if (g70Var.k().g().equals(e().a().k().g())) {
            return true;
        }
        if (this.h == null || k80Var == null || k80Var.b().type() != Proxy.Type.DIRECT || this.c.b().type() != Proxy.Type.DIRECT || !this.c.d().equals(k80Var.d()) || k80Var.a().d() != la0.a || !a(g70Var.k())) {
            return false;
        }
        try {
            g70Var.a().a(g70Var.k().g(), c().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(z70 z70Var) {
        if (z70Var.k() != this.c.a().k().k()) {
            return false;
        }
        if (z70Var.g().equals(this.c.a().k().g())) {
            return true;
        }
        return this.f != null && la0.a.a(z70Var.g(), (X509Certificate) this.f.b().get(0));
    }

    public boolean a(boolean z) {
        if (this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        if (this.h != null) {
            return !r0.a();
        }
        if (z) {
            try {
                int soTimeout = this.e.getSoTimeout();
                try {
                    this.e.setSoTimeout(1);
                    return !this.i.exhausted();
                } finally {
                    this.e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public void b() {
        o80.a(this.d);
    }

    public x70 c() {
        return this.f;
    }

    public boolean d() {
        return this.h != null;
    }

    public k80 e() {
        return this.c;
    }

    public Socket f() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.c.a().k().g());
        sb.append(":");
        sb.append(this.c.a().k().k());
        sb.append(", proxy=");
        sb.append(this.c.b());
        sb.append(" hostAddress=");
        sb.append(this.c.d());
        sb.append(" cipherSuite=");
        x70 x70Var = this.f;
        sb.append(x70Var != null ? x70Var.a() : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
