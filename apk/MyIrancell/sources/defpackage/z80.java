package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class z80 {
    private final g70 a;
    private final x80 b;
    private final k70 c;
    private final v70 d;
    private int f;
    private List<Proxy> e = Collections.emptyList();
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<k80> h = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a {
        private final List<k80> a;
        private int b = 0;

        a(List<k80> list) {
            this.a = list;
        }

        public List<k80> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            return this.b < this.a.size();
        }

        public k80 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<k80> list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }
    }

    public z80(g70 g70Var, x80 x80Var, k70 k70Var, v70 v70Var) {
        this.a = g70Var;
        this.b = x80Var;
        this.c = k70Var;
        this.d = v70Var;
        a(g70Var.k(), g70Var.f());
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private void a(Proxy proxy) {
        String g;
        int k;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            g = this.a.k().g();
            k = this.a.k().k();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            g = a(inetSocketAddress);
            k = inetSocketAddress.getPort();
        }
        if (k < 1 || k > 65535) {
            throw new SocketException("No route to " + g + ":" + k + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(g, k));
            return;
        }
        this.d.a(this.c, g);
        List<InetAddress> a2 = this.a.c().a(g);
        if (a2.isEmpty()) {
            throw new UnknownHostException(this.a.c() + " returned no addresses for " + g);
        }
        this.d.a(this.c, g, a2);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            this.g.add(new InetSocketAddress(a2.get(i), k));
        }
    }

    private void a(z70 z70Var, Proxy proxy) {
        List<Proxy> a2;
        if (proxy != null) {
            a2 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.a.h().select(z70Var.o());
            a2 = (select == null || select.isEmpty()) ? o80.a(Proxy.NO_PROXY) : o80.a(select);
        }
        this.e = a2;
        this.f = 0;
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    private Proxy d() {
        if (c()) {
            List<Proxy> list = this.e;
            int i = this.f;
            this.f = i + 1;
            Proxy proxy = list.get(i);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.k().g() + "; exhausted proxy configurations: " + this.e);
    }

    public void a(k80 k80Var, IOException iOException) {
        if (k80Var.b().type() != Proxy.Type.DIRECT && this.a.h() != null) {
            this.a.h().connectFailed(this.a.k().o(), k80Var.b().address(), iOException);
        }
        this.b.b(k80Var);
    }

    public boolean a() {
        return c() || !this.h.isEmpty();
    }

    public a b() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            Proxy d = d();
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                k80 k80Var = new k80(this.a, d, this.g.get(i));
                if (this.b.c(k80Var)) {
                    this.h.add(k80Var);
                } else {
                    arrayList.add(k80Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.h);
            this.h.clear();
        }
        return new a(arrayList);
    }
}
