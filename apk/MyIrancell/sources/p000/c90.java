package p000;

import java.net.ProtocolException;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;
import p000.a80;
import p000.i80;

/* loaded from: classes.dex */
public final class c90 implements a80 {

    /* renamed from: a */
    private final boolean f2979a;

    /* renamed from: c90$a */
    /* loaded from: classes.dex */
    static final class C0512a extends ForwardingSink {

        /* renamed from: b */
        long f2980b;

        C0512a(Sink sink) {
            super(sink);
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j) {
            super.write(buffer, j);
            this.f2980b += j;
        }
    }

    public c90(boolean z) {
        this.f2979a = z;
    }

    @Override // p000.a80
    public i80 intercept(a80.InterfaceC0010a interfaceC0010a) {
        i80.C2583a m12394j;
        j80 mo11342a;
        h90 h90Var = (h90) interfaceC0010a;
        d90 m12152h = h90Var.m12152h();
        a90 m12153i = h90Var.m12153i();
        w80 w80Var = (w80) h90Var.mo100e();
        g80 mo99d = h90Var.mo99d();
        long currentTimeMillis = System.currentTimeMillis();
        h90Var.m12151g().m15965d(h90Var.m12150f());
        m12152h.mo11345a(mo99d);
        h90Var.m12151g().m15951a(h90Var.m12150f(), mo99d);
        i80.C2583a c2583a = null;
        if (g90.m11936b(mo99d.m11923e()) && mo99d.m11918a() != null) {
            if ("100-continue".equalsIgnoreCase(mo99d.m11919a("Expect"))) {
                m12152h.mo11346b();
                h90Var.m12151g().m15967f(h90Var.m12150f());
                c2583a = m12152h.mo11341a(true);
            }
            if (c2583a == null) {
                h90Var.m12151g().m15964c(h90Var.m12150f());
                C0512a c0512a = new C0512a(m12152h.mo11343a(mo99d, mo99d.m11918a().mo3610a()));
                BufferedSink buffer = Okio.buffer(c0512a);
                mo99d.m11918a().mo3611a(buffer);
                buffer.close();
                h90Var.m12151g().m15950a(h90Var.m12150f(), c0512a.f2980b);
            } else if (!w80Var.m16171d()) {
                m12153i.m117e();
            }
        }
        m12152h.mo11344a();
        if (c2583a == null) {
            h90Var.m12151g().m15967f(h90Var.m12150f());
            c2583a = m12152h.mo11341a(false);
        }
        c2583a.m12404a(mo99d);
        c2583a.m12409a(m12153i.m115c().m16170c());
        c2583a.m12412b(currentTimeMillis);
        c2583a.m12402a(System.currentTimeMillis());
        i80 m12411a = c2583a.m12411a();
        int m12389d = m12411a.m12389d();
        if (m12389d == 100) {
            i80.C2583a mo11341a = m12152h.mo11341a(false);
            mo11341a.m12404a(mo99d);
            mo11341a.m12409a(m12153i.m115c().m16170c());
            mo11341a.m12412b(currentTimeMillis);
            mo11341a.m12402a(System.currentTimeMillis());
            m12411a = mo11341a.m12411a();
            m12389d = m12411a.m12389d();
        }
        h90Var.m12151g().m15952a(h90Var.m12150f(), m12411a);
        if (this.f2979a && m12389d == 101) {
            m12394j = m12411a.m12394j();
            mo11342a = o80.f12429c;
        } else {
            m12394j = m12411a.m12394j();
            mo11342a = m12152h.mo11342a(m12411a);
        }
        m12394j.m12406a(mo11342a);
        i80 m12411a2 = m12394j.m12411a();
        if ("close".equalsIgnoreCase(m12411a2.m12397m().m11919a("Connection")) || "close".equalsIgnoreCase(m12411a2.m12386a("Connection"))) {
            m12153i.m117e();
        }
        if ((m12389d != 204 && m12389d != 205) || m12411a2.m12385a().mo12416c() <= 0) {
            return m12411a2;
        }
        throw new ProtocolException("HTTP " + m12389d + " had non-zero Content-Length: " + m12411a2.m12385a().mo12416c());
    }
}
