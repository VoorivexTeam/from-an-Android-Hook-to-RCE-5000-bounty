package defpackage;

import defpackage.z70;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class g70 {
    final z70 a;
    final u70 b;
    final SocketFactory c;
    final h70 d;
    final List<e80> e;
    final List<q70> f;
    final ProxySelector g;

    @Nullable
    final Proxy h;

    @Nullable
    final SSLSocketFactory i;

    @Nullable
    final HostnameVerifier j;

    @Nullable
    final m70 k;

    public g70(String str, int i, u70 u70Var, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable m70 m70Var, h70 h70Var, @Nullable Proxy proxy, List<e80> list, List<q70> list2, ProxySelector proxySelector) {
        z70.a aVar = new z70.a();
        aVar.d(sSLSocketFactory != null ? "https" : "http");
        aVar.b(str);
        aVar.a(i);
        this.a = aVar.a();
        if (u70Var == null) {
            throw new NullPointerException("dns == null");
        }
        this.b = u70Var;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.c = socketFactory;
        if (h70Var == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.d = h70Var;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = o80.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = o80.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = m70Var;
    }

    @Nullable
    public m70 a() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(g70 g70Var) {
        return this.b.equals(g70Var.b) && this.d.equals(g70Var.d) && this.e.equals(g70Var.e) && this.f.equals(g70Var.f) && this.g.equals(g70Var.g) && o80.a(this.h, g70Var.h) && o80.a(this.i, g70Var.i) && o80.a(this.j, g70Var.j) && o80.a(this.k, g70Var.k) && k().k() == g70Var.k().k();
    }

    public List<q70> b() {
        return this.f;
    }

    public u70 c() {
        return this.b;
    }

    @Nullable
    public HostnameVerifier d() {
        return this.j;
    }

    public List<e80> e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof g70) {
            g70 g70Var = (g70) obj;
            if (this.a.equals(g70Var.a) && a(g70Var)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Proxy f() {
        return this.h;
    }

    public h70 g() {
        return this.d;
    }

    public ProxySelector h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        Proxy proxy = this.h;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        m70 m70Var = this.k;
        return hashCode4 + (m70Var != null ? m70Var.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.c;
    }

    @Nullable
    public SSLSocketFactory j() {
        return this.i;
    }

    public z70 k() {
        return this.a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.a.g());
        sb.append(":");
        sb.append(this.a.k());
        if (this.h != null) {
            sb.append(", proxy=");
            obj = this.h;
        } else {
            sb.append(", proxySelector=");
            obj = this.g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
