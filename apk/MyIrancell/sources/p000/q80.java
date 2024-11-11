package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p000.a80;
import p000.i80;
import p000.s80;
import p000.y70;

/* loaded from: classes.dex */
public final class q80 implements a80 {

    /* renamed from: a */
    final t80 f12739a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q80$a */
    /* loaded from: classes.dex */
    public class C3115a implements Source {

        /* renamed from: b */
        boolean f12740b;

        /* renamed from: c */
        final /* synthetic */ BufferedSource f12741c;

        /* renamed from: d */
        final /* synthetic */ r80 f12742d;

        /* renamed from: e */
        final /* synthetic */ BufferedSink f12743e;

        C3115a(q80 q80Var, BufferedSource bufferedSource, r80 r80Var, BufferedSink bufferedSink) {
            this.f12741c = bufferedSource;
            this.f12742d = r80Var;
            this.f12743e = bufferedSink;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f12740b && !o80.m14463a(this, 100, TimeUnit.MILLISECONDS)) {
                this.f12740b = true;
                this.f12742d.m15230b();
            }
            this.f12741c.close();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            try {
                long read = this.f12741c.read(buffer, j);
                if (read != -1) {
                    buffer.copyTo(this.f12743e.buffer(), buffer.size() - read, read);
                    this.f12743e.emitCompleteSegments();
                    return read;
                }
                if (!this.f12740b) {
                    this.f12740b = true;
                    this.f12743e.close();
                }
                return -1L;
            } catch (IOException e) {
                if (!this.f12740b) {
                    this.f12740b = true;
                    this.f12742d.m15230b();
                }
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f12741c.timeout();
        }
    }

    public q80(t80 t80Var) {
        this.f12739a = t80Var;
    }

    /* renamed from: a */
    private static i80 m14995a(i80 i80Var) {
        if (i80Var == null || i80Var.m12385a() == null) {
            return i80Var;
        }
        i80.C2583a m12394j = i80Var.m12394j();
        m12394j.m12406a((j80) null);
        return m12394j.m12411a();
    }

    /* renamed from: a */
    private i80 m14996a(r80 r80Var, i80 i80Var) {
        Sink m15229a;
        if (r80Var == null || (m15229a = r80Var.m15229a()) == null) {
            return i80Var;
        }
        C3115a c3115a = new C3115a(this, i80Var.m12385a().mo12418e(), r80Var, Okio.buffer(m15229a));
        String m12386a = i80Var.m12386a("Content-Type");
        long mo12416c = i80Var.m12385a().mo12416c();
        i80.C2583a m12394j = i80Var.m12394j();
        m12394j.m12406a(new i90(m12386a, mo12416c, Okio.buffer(c3115a)));
        return m12394j.m12411a();
    }

    /* renamed from: a */
    private static y70 m14997a(y70 y70Var, y70 y70Var2) {
        y70.C3476a c3476a = new y70.C3476a();
        int m16595b = y70Var.m16595b();
        for (int i = 0; i < m16595b; i++) {
            String m16592a = y70Var.m16592a(i);
            String m16596b = y70Var.m16596b(i);
            if ((!"Warning".equalsIgnoreCase(m16592a) || !m16596b.startsWith("1")) && (m14998a(m16592a) || !m14999b(m16592a) || y70Var2.m16593a(m16592a) == null)) {
                m80.f12098a.mo11328a(c3476a, m16592a, m16596b);
            }
        }
        int m16595b2 = y70Var2.m16595b();
        for (int i2 = 0; i2 < m16595b2; i2++) {
            String m16592a2 = y70Var2.m16592a(i2);
            if (!m14998a(m16592a2) && m14999b(m16592a2)) {
                m80.f12098a.mo11328a(c3476a, m16592a2, y70Var2.m16596b(i2));
            }
        }
        return c3476a.m16600a();
    }

    /* renamed from: a */
    static boolean m14998a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: b */
    static boolean m14999b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // p000.a80
    public i80 intercept(a80.InterfaceC0010a interfaceC0010a) {
        t80 t80Var = this.f12739a;
        i80 m15564a = t80Var != null ? t80Var.m15564a(interfaceC0010a.mo99d()) : null;
        s80 m15385a = new s80.C3198a(System.currentTimeMillis(), interfaceC0010a.mo99d(), m15564a).m15385a();
        g80 g80Var = m15385a.f13038a;
        i80 i80Var = m15385a.f13039b;
        t80 t80Var2 = this.f12739a;
        if (t80Var2 != null) {
            t80Var2.m15568a(m15385a);
        }
        if (m15564a != null && i80Var == null) {
            o80.m14457a(m15564a.m12385a());
        }
        if (g80Var == null && i80Var == null) {
            i80.C2583a c2583a = new i80.C2583a();
            c2583a.m12404a(interfaceC0010a.mo99d());
            c2583a.m12403a(e80.HTTP_1_1);
            c2583a.m12401a(504);
            c2583a.m12407a("Unsatisfiable Request (only-if-cached)");
            c2583a.m12406a(o80.f12429c);
            c2583a.m12412b(-1L);
            c2583a.m12402a(System.currentTimeMillis());
            return c2583a.m12411a();
        }
        if (g80Var == null) {
            i80.C2583a m12394j = i80Var.m12394j();
            m12394j.m12405a(m14995a(i80Var));
            return m12394j.m12411a();
        }
        try {
            i80 mo96a = interfaceC0010a.mo96a(g80Var);
            if (mo96a == null && m15564a != null) {
            }
            if (i80Var != null) {
                if (mo96a.m12389d() == 304) {
                    i80.C2583a m12394j2 = i80Var.m12394j();
                    m12394j2.m12410a(m14997a(i80Var.m12391f(), mo96a.m12391f()));
                    m12394j2.m12412b(mo96a.m12398n());
                    m12394j2.m12402a(mo96a.m12396l());
                    m12394j2.m12405a(m14995a(i80Var));
                    m12394j2.m12413b(m14995a(mo96a));
                    i80 m12411a = m12394j2.m12411a();
                    mo96a.m12385a().close();
                    this.f12739a.m15566a();
                    this.f12739a.m15567a(i80Var, m12411a);
                    return m12411a;
                }
                o80.m14457a(i80Var.m12385a());
            }
            i80.C2583a m12394j3 = mo96a.m12394j();
            m12394j3.m12405a(m14995a(i80Var));
            m12394j3.m12413b(m14995a(mo96a));
            i80 m12411a2 = m12394j3.m12411a();
            if (this.f12739a != null) {
                if (f90.m11720b(m12411a2) && s80.m15379a(m12411a2, g80Var)) {
                    return m14996a(this.f12739a.m15565a(m12411a2), m12411a2);
                }
                if (g90.m11935a(g80Var.m11923e())) {
                    try {
                        this.f12739a.m15569b(g80Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return m12411a2;
        } finally {
            if (m15564a != null) {
                o80.m14457a(m15564a.m12385a());
            }
        }
    }
}
