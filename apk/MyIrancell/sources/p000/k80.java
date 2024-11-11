package p000;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class k80 {

    /* renamed from: a */
    final g70 f11662a;

    /* renamed from: b */
    final Proxy f11663b;

    /* renamed from: c */
    final InetSocketAddress f11664c;

    public k80(g70 g70Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (g70Var == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f11662a = g70Var;
        this.f11663b = proxy;
        this.f11664c = inetSocketAddress;
    }

    /* renamed from: a */
    public g70 m13627a() {
        return this.f11662a;
    }

    /* renamed from: b */
    public Proxy m13628b() {
        return this.f11663b;
    }

    /* renamed from: c */
    public boolean m13629c() {
        return this.f11662a.f10237i != null && this.f11663b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress m13630d() {
        return this.f11664c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof k80) {
            k80 k80Var = (k80) obj;
            if (k80Var.f11662a.equals(this.f11662a) && k80Var.f11663b.equals(this.f11663b) && k80Var.f11664c.equals(this.f11664c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f11662a.hashCode()) * 31) + this.f11663b.hashCode()) * 31) + this.f11664c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f11664c + "}";
    }
}
