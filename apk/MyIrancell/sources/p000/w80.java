package p000;

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
import p000.a80;
import p000.g80;
import p000.i80;
import p000.t90;

/* loaded from: classes.dex */
public final class w80 extends t90.AbstractC3251h implements o70 {

    /* renamed from: b */
    private final p70 f13784b;

    /* renamed from: c */
    private final k80 f13785c;

    /* renamed from: d */
    private Socket f13786d;

    /* renamed from: e */
    private Socket f13787e;

    /* renamed from: f */
    private x70 f13788f;

    /* renamed from: g */
    private e80 f13789g;

    /* renamed from: h */
    private t90 f13790h;

    /* renamed from: i */
    private BufferedSource f13791i;

    /* renamed from: j */
    private BufferedSink f13792j;

    /* renamed from: k */
    public boolean f13793k;

    /* renamed from: l */
    public int f13794l;

    /* renamed from: m */
    public int f13795m = 1;

    /* renamed from: n */
    public final List<Reference<a90>> f13796n = new ArrayList();

    /* renamed from: o */
    public long f13797o = Long.MAX_VALUE;

    public w80(p70 p70Var, k80 k80Var) {
        this.f13784b = p70Var;
        this.f13785c = k80Var;
    }

    /* renamed from: a */
    private g80 m16157a(int i, int i2, g80 g80Var, z70 z70Var) {
        String str = "CONNECT " + o80.m14447a(z70Var, true) + " HTTP/1.1";
        while (true) {
            m90 m90Var = new m90(null, null, this.f13791i, this.f13792j);
            this.f13791i.timeout().timeout(i, TimeUnit.MILLISECONDS);
            this.f13792j.timeout().timeout(i2, TimeUnit.MILLISECONDS);
            m90Var.m14089a(g80Var.m11921c(), str);
            m90Var.mo11344a();
            i80.C2583a mo11341a = m90Var.mo11341a(false);
            mo11341a.m12404a(g80Var);
            i80 m12411a = mo11341a.m12411a();
            long m11715a = f90.m11715a(m12411a);
            if (m11715a == -1) {
                m11715a = 0;
            }
            Source m14090b = m90Var.m14090b(m11715a);
            o80.m14470b(m14090b, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            m14090b.close();
            int m12389d = m12411a.m12389d();
            if (m12389d == 200) {
                if (this.f13791i.buffer().exhausted() && this.f13792j.buffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (m12389d != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + m12411a.m12389d());
            }
            g80 mo12143a = this.f13785c.m13627a().m11913g().mo12143a(this.f13785c, m12411a);
            if (mo12143a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(m12411a.m12386a("Connection"))) {
                return mo12143a;
            }
            g80Var = mo12143a;
        }
    }

    /* renamed from: a */
    private void m16158a(int i) {
        this.f13787e.setSoTimeout(0);
        t90.C3250g c3250g = new t90.C3250g(true);
        c3250g.m15610a(this.f13787e, this.f13785c.m13627a().m11917k().m16812g(), this.f13791i, this.f13792j);
        c3250g.m15611a(this);
        c3250g.m15609a(i);
        t90 m15612a = c3250g.m15612a();
        this.f13790h = m15612a;
        m15612a.m15608d();
    }

    /* renamed from: a */
    private void m16159a(int i, int i2, int i3, k70 k70Var, v70 v70Var) {
        g80 m16163g = m16163g();
        z70 m11925g = m16163g.m11925g();
        for (int i4 = 0; i4 < 21; i4++) {
            m16160a(i, i2, k70Var, v70Var);
            m16163g = m16157a(i2, i3, m16163g, m11925g);
            if (m16163g == null) {
                return;
            }
            o80.m14459a(this.f13786d);
            this.f13786d = null;
            this.f13792j = null;
            this.f13791i = null;
            v70Var.m15957a(k70Var, this.f13785c.m13630d(), this.f13785c.m13628b(), null);
        }
    }

    /* renamed from: a */
    private void m16160a(int i, int i2, k70 k70Var, v70 v70Var) {
        Proxy m13628b = this.f13785c.m13628b();
        this.f13786d = (m13628b.type() == Proxy.Type.DIRECT || m13628b.type() == Proxy.Type.HTTP) ? this.f13785c.m13627a().m11915i().createSocket() : new Socket(m13628b);
        v70Var.m15956a(k70Var, this.f13785c.m13630d(), m13628b);
        this.f13786d.setSoTimeout(i2);
        try {
            ga0.m11953c().mo3357a(this.f13786d, this.f13785c.m13630d(), i);
            try {
                this.f13791i = Okio.buffer(Okio.source(this.f13786d));
                this.f13792j = Okio.buffer(Okio.sink(this.f13786d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f13785c.m13630d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: a */
    private void m16161a(v80 v80Var) {
        SSLSocket sSLSocket;
        g70 m13627a = this.f13785c.m13627a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) m13627a.m11916j().createSocket(this.f13786d, m13627a.m11917k().m16812g(), m13627a.m11917k().m16816k(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            q70 m15971a = v80Var.m15971a(sSLSocket);
            if (m15971a.m14985c()) {
                ga0.m11953c().mo3358a(sSLSocket, m13627a.m11917k().m16812g(), m13627a.m11911e());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            x70 m16459a = x70.m16459a(session);
            if (m13627a.m11910d().verify(m13627a.m11917k().m16812g(), session)) {
                m13627a.m11906a().m14067a(m13627a.m11917k().m16812g(), m16459a.m16461b());
                String mo3359b = m15971a.m14985c() ? ga0.m11953c().mo3359b(sSLSocket) : null;
                this.f13787e = sSLSocket;
                this.f13791i = Okio.buffer(Okio.source(sSLSocket));
                this.f13792j = Okio.buffer(Okio.sink(this.f13787e));
                this.f13788f = m16459a;
                this.f13789g = mo3359b != null ? e80.get(mo3359b) : e80.HTTP_1_1;
                if (sSLSocket != null) {
                    ga0.m11953c().mo11574a(sSLSocket);
                    return;
                }
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) m16459a.m16461b().get(0);
            throw new SSLPeerUnverifiedException("Hostname " + m13627a.m11917k().m16812g() + " not verified:\n    certificate: " + m70.m14062a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + la0.m13834a(x509Certificate));
        } catch (AssertionError e2) {
            e = e2;
            if (!o80.m14460a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                ga0.m11953c().mo11574a(sSLSocket2);
            }
            o80.m14459a((Socket) sSLSocket2);
            throw th;
        }
    }

    /* renamed from: a */
    private void m16162a(v80 v80Var, int i, k70 k70Var, v70 v70Var) {
        if (this.f13785c.m13627a().m11916j() != null) {
            v70Var.m15968g(k70Var);
            m16161a(v80Var);
            v70Var.m15960a(k70Var, this.f13788f);
            if (this.f13789g == e80.HTTP_2) {
                m16158a(i);
                return;
            }
            return;
        }
        if (!this.f13785c.m13627a().m11911e().contains(e80.H2_PRIOR_KNOWLEDGE)) {
            this.f13787e = this.f13786d;
            this.f13789g = e80.HTTP_1_1;
        } else {
            this.f13787e = this.f13786d;
            this.f13789g = e80.H2_PRIOR_KNOWLEDGE;
            m16158a(i);
        }
    }

    /* renamed from: g */
    private g80 m16163g() {
        g80.C2502a c2502a = new g80.C2502a();
        c2502a.m11931a(this.f13785c.m13627a().m11917k());
        c2502a.m11928a("CONNECT", (h80) null);
        c2502a.m11933b("Host", o80.m14447a(this.f13785c.m13627a().m11917k(), true));
        c2502a.m11933b("Proxy-Connection", "Keep-Alive");
        c2502a.m11933b("User-Agent", p80.m14738a());
        g80 m11932a = c2502a.m11932a();
        i80.C2583a c2583a = new i80.C2583a();
        c2583a.m12404a(m11932a);
        c2583a.m12403a(e80.HTTP_1_1);
        c2583a.m12401a(407);
        c2583a.m12407a("Preemptive Authenticate");
        c2583a.m12406a(o80.f12429c);
        c2583a.m12412b(-1L);
        c2583a.m12402a(-1L);
        c2583a.m12414b("Proxy-Authenticate", "OkHttp-Preemptive");
        g80 mo12143a = this.f13785c.m13627a().m11913g().mo12143a(this.f13785c, c2583a.m12411a());
        return mo12143a != null ? mo12143a : m11932a;
    }

    /* renamed from: a */
    public d90 m16164a(d80 d80Var, a80.InterfaceC0010a interfaceC0010a, a90 a90Var) {
        if (this.f13790h != null) {
            return new s90(d80Var, interfaceC0010a, a90Var, this.f13790h);
        }
        this.f13787e.setSoTimeout(interfaceC0010a.mo97b());
        this.f13791i.timeout().timeout(interfaceC0010a.mo97b(), TimeUnit.MILLISECONDS);
        this.f13792j.timeout().timeout(interfaceC0010a.mo98c(), TimeUnit.MILLISECONDS);
        return new m90(d80Var, a90Var, this.f13791i, this.f13792j);
    }

    @Override // p000.o70
    /* renamed from: a */
    public e80 mo14432a() {
        return this.f13789g;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m16165a(int r17, int r18, int r19, int r20, boolean r21, p000.k70 r22, p000.v70 r23) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w80.m16165a(int, int, int, int, boolean, k70, v70):void");
    }

    @Override // p000.t90.AbstractC3251h
    /* renamed from: a */
    public void mo15613a(t90 t90Var) {
        synchronized (this.f13784b) {
            this.f13795m = t90Var.m15605c();
        }
    }

    @Override // p000.t90.AbstractC3251h
    /* renamed from: a */
    public void mo15614a(v90 v90Var) {
        v90Var.m15987a(o90.REFUSED_STREAM);
    }

    /* renamed from: a */
    public boolean m16166a(g70 g70Var, @Nullable k80 k80Var) {
        if (this.f13796n.size() >= this.f13795m || this.f13793k || !m80.f12098a.mo11329a(this.f13785c.m13627a(), g70Var)) {
            return false;
        }
        if (g70Var.m11917k().m16812g().equals(m16172e().m13627a().m11917k().m16812g())) {
            return true;
        }
        if (this.f13790h == null || k80Var == null || k80Var.m13628b().type() != Proxy.Type.DIRECT || this.f13785c.m13628b().type() != Proxy.Type.DIRECT || !this.f13785c.m13630d().equals(k80Var.m13630d()) || k80Var.m13627a().m11910d() != la0.f11833a || !m16167a(g70Var.m11917k())) {
            return false;
        }
        try {
            g70Var.m11906a().m14067a(g70Var.m11917k().m16812g(), m16170c().m16461b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m16167a(z70 z70Var) {
        if (z70Var.m16816k() != this.f13785c.m13627a().m11917k().m16816k()) {
            return false;
        }
        if (z70Var.m16812g().equals(this.f13785c.m13627a().m11917k().m16812g())) {
            return true;
        }
        return this.f13788f != null && la0.f11833a.m13839a(z70Var.m16812g(), (X509Certificate) this.f13788f.m16461b().get(0));
    }

    /* renamed from: a */
    public boolean m16168a(boolean z) {
        if (this.f13787e.isClosed() || this.f13787e.isInputShutdown() || this.f13787e.isOutputShutdown()) {
            return false;
        }
        if (this.f13790h != null) {
            return !r0.m15602a();
        }
        if (z) {
            try {
                int soTimeout = this.f13787e.getSoTimeout();
                try {
                    this.f13787e.setSoTimeout(1);
                    return !this.f13791i.exhausted();
                } finally {
                    this.f13787e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public void m16169b() {
        o80.m14459a(this.f13786d);
    }

    /* renamed from: c */
    public x70 m16170c() {
        return this.f13788f;
    }

    /* renamed from: d */
    public boolean m16171d() {
        return this.f13790h != null;
    }

    /* renamed from: e */
    public k80 m16172e() {
        return this.f13785c;
    }

    /* renamed from: f */
    public Socket m16173f() {
        return this.f13787e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f13785c.m13627a().m11917k().m16812g());
        sb.append(":");
        sb.append(this.f13785c.m13627a().m11917k().m16816k());
        sb.append(", proxy=");
        sb.append(this.f13785c.m13628b());
        sb.append(" hostAddress=");
        sb.append(this.f13785c.m13630d());
        sb.append(" cipherSuite=");
        x70 x70Var = this.f13788f;
        sb.append(x70Var != null ? x70Var.m16460a() : "none");
        sb.append(" protocol=");
        sb.append(this.f13789g);
        sb.append('}');
        return sb.toString();
    }
}
