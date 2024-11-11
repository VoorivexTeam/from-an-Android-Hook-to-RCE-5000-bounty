package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class k80 {
    final g70 a;
    final Proxy b;
    final InetSocketAddress c;

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
        this.a = g70Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public g70 a() {
        return this.a;
    }

    public Proxy b() {
        return this.b;
    }

    public boolean c() {
        return this.a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof k80) {
            k80 k80Var = (k80) obj;
            if (k80Var.a.equals(this.a) && k80Var.b.equals(this.b) && k80Var.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Route{" + this.c + "}";
    }
}
