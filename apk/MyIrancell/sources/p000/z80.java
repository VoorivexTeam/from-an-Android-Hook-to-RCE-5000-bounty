package p000;

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

    /* renamed from: a */
    private final g70 f14373a;

    /* renamed from: b */
    private final x80 f14374b;

    /* renamed from: c */
    private final k70 f14375c;

    /* renamed from: d */
    private final v70 f14376d;

    /* renamed from: f */
    private int f14378f;

    /* renamed from: e */
    private List<Proxy> f14377e = Collections.emptyList();

    /* renamed from: g */
    private List<InetSocketAddress> f14379g = Collections.emptyList();

    /* renamed from: h */
    private final List<k80> f14380h = new ArrayList();

    /* renamed from: z80$a */
    /* loaded from: classes.dex */
    public static final class C3517a {

        /* renamed from: a */
        private final List<k80> f14381a;

        /* renamed from: b */
        private int f14382b = 0;

        C3517a(List<k80> list) {
            this.f14381a = list;
        }

        /* renamed from: a */
        public List<k80> m16852a() {
            return new ArrayList(this.f14381a);
        }

        /* renamed from: b */
        public boolean m16853b() {
            return this.f14382b < this.f14381a.size();
        }

        /* renamed from: c */
        public k80 m16854c() {
            if (!m16853b()) {
                throw new NoSuchElementException();
            }
            List<k80> list = this.f14381a;
            int i = this.f14382b;
            this.f14382b = i + 1;
            return list.get(i);
        }
    }

    public z80(g70 g70Var, x80 x80Var, k70 k70Var, v70 v70Var) {
        this.f14373a = g70Var;
        this.f14374b = x80Var;
        this.f14375c = k70Var;
        this.f14376d = v70Var;
        m16846a(g70Var.m11917k(), g70Var.m11912f());
    }

    /* renamed from: a */
    static String m16844a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* renamed from: a */
    private void m16845a(Proxy proxy) {
        String m16812g;
        int m16816k;
        this.f14379g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            m16812g = this.f14373a.m11917k().m16812g();
            m16816k = this.f14373a.m11917k().m16816k();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            m16812g = m16844a(inetSocketAddress);
            m16816k = inetSocketAddress.getPort();
        }
        if (m16816k < 1 || m16816k > 65535) {
            throw new SocketException("No route to " + m16812g + ":" + m16816k + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f14379g.add(InetSocketAddress.createUnresolved(m16812g, m16816k));
            return;
        }
        this.f14376d.m15954a(this.f14375c, m16812g);
        List<InetAddress> mo15751a = this.f14373a.m11909c().mo15751a(m16812g);
        if (mo15751a.isEmpty()) {
            throw new UnknownHostException(this.f14373a.m11909c() + " returned no addresses for " + m16812g);
        }
        this.f14376d.m15955a(this.f14375c, m16812g, mo15751a);
        int size = mo15751a.size();
        for (int i = 0; i < size; i++) {
            this.f14379g.add(new InetSocketAddress(mo15751a.get(i), m16816k));
        }
    }

    /* renamed from: a */
    private void m16846a(z70 z70Var, Proxy proxy) {
        List<Proxy> m14452a;
        if (proxy != null) {
            m14452a = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f14373a.m11914h().select(z70Var.m16820o());
            m14452a = (select == null || select.isEmpty()) ? o80.m14452a(Proxy.NO_PROXY) : o80.m14451a(select);
        }
        this.f14377e = m14452a;
        this.f14378f = 0;
    }

    /* renamed from: c */
    private boolean m16847c() {
        return this.f14378f < this.f14377e.size();
    }

    /* renamed from: d */
    private Proxy m16848d() {
        if (m16847c()) {
            List<Proxy> list = this.f14377e;
            int i = this.f14378f;
            this.f14378f = i + 1;
            Proxy proxy = list.get(i);
            m16845a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f14373a.m11917k().m16812g() + "; exhausted proxy configurations: " + this.f14377e);
    }

    /* renamed from: a */
    public void m16849a(k80 k80Var, IOException iOException) {
        if (k80Var.m13628b().type() != Proxy.Type.DIRECT && this.f14373a.m11914h() != null) {
            this.f14373a.m11914h().connectFailed(this.f14373a.m11917k().m16820o(), k80Var.m13628b().address(), iOException);
        }
        this.f14374b.m16464b(k80Var);
    }

    /* renamed from: a */
    public boolean m16850a() {
        return m16847c() || !this.f14380h.isEmpty();
    }

    /* renamed from: b */
    public C3517a m16851b() {
        if (!m16850a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m16847c()) {
            Proxy m16848d = m16848d();
            int size = this.f14379g.size();
            for (int i = 0; i < size; i++) {
                k80 k80Var = new k80(this.f14373a, m16848d, this.f14379g.get(i));
                if (this.f14374b.m16465c(k80Var)) {
                    this.f14380h.add(k80Var);
                } else {
                    arrayList.add(k80Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f14380h);
            this.f14380h.clear();
        }
        return new C3517a(arrayList);
    }
}
