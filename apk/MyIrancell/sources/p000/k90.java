package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p000.a80;
import p000.g80;
import p000.i80;

/* loaded from: classes.dex */
public final class k90 implements a80 {

    /* renamed from: a */
    private final d80 f11674a;

    /* renamed from: b */
    private volatile a90 f11675b;

    /* renamed from: c */
    private Object f11676c;

    /* renamed from: d */
    private volatile boolean f11677d;

    public k90(d80 d80Var, boolean z) {
        this.f11674a = d80Var;
    }

    /* renamed from: a */
    private int m13651a(i80 i80Var, int i) {
        String m12386a = i80Var.m12386a("Retry-After");
        if (m12386a == null) {
            return i;
        }
        if (m12386a.matches("\\d+")) {
            return Integer.valueOf(m12386a).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    private g70 m13652a(z70 z70Var) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        m70 m70Var;
        if (z70Var.m16813h()) {
            SSLSocketFactory m11296C = this.f11674a.m11296C();
            hostnameVerifier = this.f11674a.m11311q();
            sSLSocketFactory = m11296C;
            m70Var = this.f11674a.m11301c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            m70Var = null;
        }
        return new g70(z70Var.m16812g(), z70Var.m16816k(), this.f11674a.m11307m(), this.f11674a.m11295B(), sSLSocketFactory, hostnameVerifier, m70Var, this.f11674a.m11318x(), this.f11674a.m11317w(), this.f11674a.m11316v(), this.f11674a.m11304j(), this.f11674a.m11319y());
    }

    /* renamed from: a */
    private g80 m13653a(i80 i80Var, k80 k80Var) {
        String m12386a;
        z70 m16807b;
        if (i80Var == null) {
            throw new IllegalStateException();
        }
        int m12389d = i80Var.m12389d();
        String m11923e = i80Var.m12397m().m11923e();
        if (m12389d == 307 || m12389d == 308) {
            if (!m11923e.equals("GET") && !m11923e.equals("HEAD")) {
                return null;
            }
        } else {
            if (m12389d == 401) {
                return this.f11674a.m11298a().mo12143a(k80Var, i80Var);
            }
            if (m12389d == 503) {
                if ((i80Var.m12395k() == null || i80Var.m12395k().m12389d() != 503) && m13651a(i80Var, Integer.MAX_VALUE) == 0) {
                    return i80Var.m12397m();
                }
                return null;
            }
            if (m12389d == 407) {
                if ((k80Var != null ? k80Var.m13628b() : this.f11674a.m11317w()).type() == Proxy.Type.HTTP) {
                    return this.f11674a.m11318x().mo12143a(k80Var, i80Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (m12389d == 408) {
                if (!this.f11674a.m11294A()) {
                    return null;
                }
                i80Var.m12397m().m11918a();
                if ((i80Var.m12395k() == null || i80Var.m12395k().m12389d() != 408) && m13651a(i80Var, 0) <= 0) {
                    return i80Var.m12397m();
                }
                return null;
            }
            switch (m12389d) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f11674a.m11309o() || (m12386a = i80Var.m12386a("Location")) == null || (m16807b = i80Var.m12397m().m11925g().m16807b(m12386a)) == null) {
            return null;
        }
        if (!m16807b.m16819n().equals(i80Var.m12397m().m11925g().m16819n()) && !this.f11674a.m11310p()) {
            return null;
        }
        g80.C2502a m11924f = i80Var.m12397m().m11924f();
        if (g90.m11936b(m11923e)) {
            boolean m11938d = g90.m11938d(m11923e);
            if (g90.m11937c(m11923e)) {
                m11924f.m11928a("GET", (h80) null);
            } else {
                m11924f.m11928a(m11923e, m11938d ? i80Var.m12397m().m11918a() : null);
            }
            if (!m11938d) {
                m11924f.m11927a("Transfer-Encoding");
                m11924f.m11927a("Content-Length");
                m11924f.m11927a("Content-Type");
            }
        }
        if (!m13654a(i80Var, m16807b)) {
            m11924f.m11927a("Authorization");
        }
        m11924f.m11931a(m16807b);
        return m11924f.m11932a();
    }

    /* renamed from: a */
    private boolean m13654a(i80 i80Var, z70 z70Var) {
        z70 m11925g = i80Var.m12397m().m11925g();
        return m11925g.m16812g().equals(z70Var.m16812g()) && m11925g.m16816k() == z70Var.m16816k() && m11925g.m16819n().equals(z70Var.m16819n());
    }

    /* renamed from: a */
    private boolean m13655a(IOException iOException, a90 a90Var, boolean z, g80 g80Var) {
        a90Var.m111a(iOException);
        if (!this.f11674a.m11294A()) {
            return false;
        }
        if (z) {
            g80Var.m11918a();
        }
        return m13656a(iOException, z) && a90Var.m116d();
    }

    /* renamed from: a */
    private boolean m13656a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: a */
    public void m13657a() {
        this.f11677d = true;
        a90 a90Var = this.f11675b;
        if (a90Var != null) {
            a90Var.m110a();
        }
    }

    /* renamed from: a */
    public void m13658a(Object obj) {
        this.f11676c = obj;
    }

    /* renamed from: b */
    public boolean m13659b() {
        return this.f11677d;
    }

    @Override // p000.a80
    public i80 intercept(a80.InterfaceC0010a interfaceC0010a) {
        i80 m12149a;
        g80 m13653a;
        g80 mo99d = interfaceC0010a.mo99d();
        h90 h90Var = (h90) interfaceC0010a;
        k70 m12150f = h90Var.m12150f();
        v70 m12151g = h90Var.m12151g();
        a90 a90Var = new a90(this.f11674a.m11303h(), m13652a(mo99d.m11925g()), m12150f, m12151g, this.f11676c);
        this.f11675b = a90Var;
        i80 i80Var = null;
        int i = 0;
        while (!this.f11677d) {
            try {
                try {
                    m12149a = h90Var.m12149a(mo99d, a90Var, null, null);
                    if (i80Var != null) {
                        i80.C2583a m12394j = m12149a.m12394j();
                        i80.C2583a m12394j2 = i80Var.m12394j();
                        m12394j2.m12406a((j80) null);
                        m12394j.m12415c(m12394j2.m12411a());
                        m12149a = m12394j.m12411a();
                    }
                    try {
                        m13653a = m13653a(m12149a, a90Var.m119g());
                    } catch (IOException e) {
                        a90Var.m118f();
                        throw e;
                    }
                } catch (Throwable th) {
                    a90Var.m111a((IOException) null);
                    a90Var.m118f();
                    throw th;
                }
            } catch (IOException e2) {
                if (!m13655a(e2, a90Var, !(e2 instanceof n90), mo99d)) {
                    throw e2;
                }
            } catch (y80 e3) {
                if (!m13655a(e3.m16607b(), a90Var, false, mo99d)) {
                    throw e3.m16605a();
                }
            }
            if (m13653a == null) {
                a90Var.m118f();
                return m12149a;
            }
            o80.m14457a(m12149a.m12385a());
            int i2 = i + 1;
            if (i2 > 20) {
                a90Var.m118f();
                throw new ProtocolException("Too many follow-up requests: " + i2);
            }
            m13653a.m11918a();
            if (!m13654a(m12149a, m13653a.m11925g())) {
                a90Var.m118f();
                a90Var = new a90(this.f11674a.m11303h(), m13652a(m13653a.m11925g()), m12150f, m12151g, this.f11676c);
                this.f11675b = a90Var;
            } else if (a90Var.m114b() != null) {
                throw new IllegalStateException("Closing the body of " + m12149a + " didn't close its backing stream. Bad interceptor?");
            }
            i80Var = m12149a;
            mo99d = m13653a;
            i = i2;
        }
        a90Var.m118f();
        throw new IOException("Canceled");
    }
}
