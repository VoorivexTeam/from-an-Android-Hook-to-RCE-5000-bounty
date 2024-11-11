package defpackage;

import defpackage.a80;
import defpackage.g80;
import defpackage.i80;
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

/* loaded from: classes.dex */
public final class k90 implements a80 {
    private final d80 a;
    private volatile a90 b;
    private Object c;
    private volatile boolean d;

    public k90(d80 d80Var, boolean z) {
        this.a = d80Var;
    }

    private int a(i80 i80Var, int i) {
        String a = i80Var.a("Retry-After");
        if (a == null) {
            return i;
        }
        if (a.matches("\\d+")) {
            return Integer.valueOf(a).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private g70 a(z70 z70Var) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        m70 m70Var;
        if (z70Var.h()) {
            SSLSocketFactory C = this.a.C();
            hostnameVerifier = this.a.q();
            sSLSocketFactory = C;
            m70Var = this.a.c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            m70Var = null;
        }
        return new g70(z70Var.g(), z70Var.k(), this.a.m(), this.a.B(), sSLSocketFactory, hostnameVerifier, m70Var, this.a.x(), this.a.w(), this.a.v(), this.a.j(), this.a.y());
    }

    private g80 a(i80 i80Var, k80 k80Var) {
        String a;
        z70 b;
        if (i80Var == null) {
            throw new IllegalStateException();
        }
        int d = i80Var.d();
        String e = i80Var.m().e();
        if (d == 307 || d == 308) {
            if (!e.equals("GET") && !e.equals("HEAD")) {
                return null;
            }
        } else {
            if (d == 401) {
                return this.a.a().a(k80Var, i80Var);
            }
            if (d == 503) {
                if ((i80Var.k() == null || i80Var.k().d() != 503) && a(i80Var, Integer.MAX_VALUE) == 0) {
                    return i80Var.m();
                }
                return null;
            }
            if (d == 407) {
                if ((k80Var != null ? k80Var.b() : this.a.w()).type() == Proxy.Type.HTTP) {
                    return this.a.x().a(k80Var, i80Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (d == 408) {
                if (!this.a.A()) {
                    return null;
                }
                i80Var.m().a();
                if ((i80Var.k() == null || i80Var.k().d() != 408) && a(i80Var, 0) <= 0) {
                    return i80Var.m();
                }
                return null;
            }
            switch (d) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.a.o() || (a = i80Var.a("Location")) == null || (b = i80Var.m().g().b(a)) == null) {
            return null;
        }
        if (!b.n().equals(i80Var.m().g().n()) && !this.a.p()) {
            return null;
        }
        g80.a f = i80Var.m().f();
        if (g90.b(e)) {
            boolean d2 = g90.d(e);
            if (g90.c(e)) {
                f.a("GET", (h80) null);
            } else {
                f.a(e, d2 ? i80Var.m().a() : null);
            }
            if (!d2) {
                f.a("Transfer-Encoding");
                f.a("Content-Length");
                f.a("Content-Type");
            }
        }
        if (!a(i80Var, b)) {
            f.a("Authorization");
        }
        f.a(b);
        return f.a();
    }

    private boolean a(i80 i80Var, z70 z70Var) {
        z70 g = i80Var.m().g();
        return g.g().equals(z70Var.g()) && g.k() == z70Var.k() && g.n().equals(z70Var.n());
    }

    private boolean a(IOException iOException, a90 a90Var, boolean z, g80 g80Var) {
        a90Var.a(iOException);
        if (!this.a.A()) {
            return false;
        }
        if (z) {
            g80Var.a();
        }
        return a(iOException, z) && a90Var.d();
    }

    private boolean a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public void a() {
        this.d = true;
        a90 a90Var = this.b;
        if (a90Var != null) {
            a90Var.a();
        }
    }

    public void a(Object obj) {
        this.c = obj;
    }

    public boolean b() {
        return this.d;
    }

    @Override // defpackage.a80
    public i80 intercept(a80.a aVar) {
        i80 a;
        g80 a2;
        g80 d = aVar.d();
        h90 h90Var = (h90) aVar;
        k70 f = h90Var.f();
        v70 g = h90Var.g();
        a90 a90Var = new a90(this.a.h(), a(d.g()), f, g, this.c);
        this.b = a90Var;
        i80 i80Var = null;
        int i = 0;
        while (!this.d) {
            try {
                try {
                    a = h90Var.a(d, a90Var, null, null);
                    if (i80Var != null) {
                        i80.a j = a.j();
                        i80.a j2 = i80Var.j();
                        j2.a((j80) null);
                        j.c(j2.a());
                        a = j.a();
                    }
                    try {
                        a2 = a(a, a90Var.g());
                    } catch (IOException e) {
                        a90Var.f();
                        throw e;
                    }
                } catch (Throwable th) {
                    a90Var.a((IOException) null);
                    a90Var.f();
                    throw th;
                }
            } catch (IOException e2) {
                if (!a(e2, a90Var, !(e2 instanceof n90), d)) {
                    throw e2;
                }
            } catch (y80 e3) {
                if (!a(e3.b(), a90Var, false, d)) {
                    throw e3.a();
                }
            }
            if (a2 == null) {
                a90Var.f();
                return a;
            }
            o80.a(a.a());
            int i2 = i + 1;
            if (i2 > 20) {
                a90Var.f();
                throw new ProtocolException("Too many follow-up requests: " + i2);
            }
            a2.a();
            if (!a(a, a2.g())) {
                a90Var.f();
                a90Var = new a90(this.a.h(), a(a2.g()), f, g, this.c);
                this.b = a90Var;
            } else if (a90Var.b() != null) {
                throw new IllegalStateException("Closing the body of " + a + " didn't close its backing stream. Bad interceptor?");
            }
            i80Var = a;
            d = a2;
            i = i2;
        }
        a90Var.f();
        throw new IOException("Canceled");
    }
}
