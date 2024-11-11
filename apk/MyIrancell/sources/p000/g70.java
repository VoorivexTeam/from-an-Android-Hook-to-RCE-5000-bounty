package p000;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p000.z70;

/* loaded from: classes.dex */
public final class g70 {

    /* renamed from: a */
    final z70 f10229a;

    /* renamed from: b */
    final u70 f10230b;

    /* renamed from: c */
    final SocketFactory f10231c;

    /* renamed from: d */
    final h70 f10232d;

    /* renamed from: e */
    final List<e80> f10233e;

    /* renamed from: f */
    final List<q70> f10234f;

    /* renamed from: g */
    final ProxySelector f10235g;

    /* renamed from: h */
    @Nullable
    final Proxy f10236h;

    /* renamed from: i */
    @Nullable
    final SSLSocketFactory f10237i;

    /* renamed from: j */
    @Nullable
    final HostnameVerifier f10238j;

    /* renamed from: k */
    @Nullable
    final m70 f10239k;

    public g70(String str, int i, u70 u70Var, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable m70 m70Var, h70 h70Var, @Nullable Proxy proxy, List<e80> list, List<q70> list2, ProxySelector proxySelector) {
        z70.C3515a c3515a = new z70.C3515a();
        c3515a.m16841d(sSLSocketFactory != null ? "https" : "http");
        c3515a.m16837b(str);
        c3515a.m16831a(i);
        this.f10229a = c3515a.m16835a();
        if (u70Var == null) {
            throw new NullPointerException("dns == null");
        }
        this.f10230b = u70Var;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f10231c = socketFactory;
        if (h70Var == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f10232d = h70Var;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f10233e = o80.m14451a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f10234f = o80.m14451a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f10235g = proxySelector;
        this.f10236h = proxy;
        this.f10237i = sSLSocketFactory;
        this.f10238j = hostnameVerifier;
        this.f10239k = m70Var;
    }

    @Nullable
    /* renamed from: a */
    public m70 m11906a() {
        return this.f10239k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m11907a(g70 g70Var) {
        return this.f10230b.equals(g70Var.f10230b) && this.f10232d.equals(g70Var.f10232d) && this.f10233e.equals(g70Var.f10233e) && this.f10234f.equals(g70Var.f10234f) && this.f10235g.equals(g70Var.f10235g) && o80.m14461a(this.f10236h, g70Var.f10236h) && o80.m14461a(this.f10237i, g70Var.f10237i) && o80.m14461a(this.f10238j, g70Var.f10238j) && o80.m14461a(this.f10239k, g70Var.f10239k) && m11917k().m16816k() == g70Var.m11917k().m16816k();
    }

    /* renamed from: b */
    public List<q70> m11908b() {
        return this.f10234f;
    }

    /* renamed from: c */
    public u70 m11909c() {
        return this.f10230b;
    }

    @Nullable
    /* renamed from: d */
    public HostnameVerifier m11910d() {
        return this.f10238j;
    }

    /* renamed from: e */
    public List<e80> m11911e() {
        return this.f10233e;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof g70) {
            g70 g70Var = (g70) obj;
            if (this.f10229a.equals(g70Var.f10229a) && m11907a(g70Var)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public Proxy m11912f() {
        return this.f10236h;
    }

    /* renamed from: g */
    public h70 m11913g() {
        return this.f10232d;
    }

    /* renamed from: h */
    public ProxySelector m11914h() {
        return this.f10235g;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f10229a.hashCode()) * 31) + this.f10230b.hashCode()) * 31) + this.f10232d.hashCode()) * 31) + this.f10233e.hashCode()) * 31) + this.f10234f.hashCode()) * 31) + this.f10235g.hashCode()) * 31;
        Proxy proxy = this.f10236h;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f10237i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f10238j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        m70 m70Var = this.f10239k;
        return hashCode4 + (m70Var != null ? m70Var.hashCode() : 0);
    }

    /* renamed from: i */
    public SocketFactory m11915i() {
        return this.f10231c;
    }

    @Nullable
    /* renamed from: j */
    public SSLSocketFactory m11916j() {
        return this.f10237i;
    }

    /* renamed from: k */
    public z70 m11917k() {
        return this.f10229a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f10229a.m16812g());
        sb.append(":");
        sb.append(this.f10229a.m16816k());
        if (this.f10236h != null) {
            sb.append(", proxy=");
            obj = this.f10236h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f10235g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
