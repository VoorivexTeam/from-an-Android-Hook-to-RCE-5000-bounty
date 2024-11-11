package defpackage;

import defpackage.a80;
import defpackage.i80;
import java.net.ProtocolException;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

/* loaded from: classes.dex */
public final class c90 implements a80 {
    private final boolean a;

    /* loaded from: classes.dex */
    static final class a extends ForwardingSink {
        long b;

        a(Sink sink) {
            super(sink);
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j) {
            super.write(buffer, j);
            this.b += j;
        }
    }

    public c90(boolean z) {
        this.a = z;
    }

    @Override // defpackage.a80
    public i80 intercept(a80.a aVar) {
        i80.a j;
        j80 a2;
        h90 h90Var = (h90) aVar;
        d90 h = h90Var.h();
        a90 i = h90Var.i();
        w80 w80Var = (w80) h90Var.e();
        g80 d = h90Var.d();
        long currentTimeMillis = System.currentTimeMillis();
        h90Var.g().d(h90Var.f());
        h.a(d);
        h90Var.g().a(h90Var.f(), d);
        i80.a aVar2 = null;
        if (g90.b(d.e()) && d.a() != null) {
            if ("100-continue".equalsIgnoreCase(d.a("Expect"))) {
                h.b();
                h90Var.g().f(h90Var.f());
                aVar2 = h.a(true);
            }
            if (aVar2 == null) {
                h90Var.g().c(h90Var.f());
                a aVar3 = new a(h.a(d, d.a().a()));
                BufferedSink buffer = Okio.buffer(aVar3);
                d.a().a(buffer);
                buffer.close();
                h90Var.g().a(h90Var.f(), aVar3.b);
            } else if (!w80Var.d()) {
                i.e();
            }
        }
        h.a();
        if (aVar2 == null) {
            h90Var.g().f(h90Var.f());
            aVar2 = h.a(false);
        }
        aVar2.a(d);
        aVar2.a(i.c().c());
        aVar2.b(currentTimeMillis);
        aVar2.a(System.currentTimeMillis());
        i80 a3 = aVar2.a();
        int d2 = a3.d();
        if (d2 == 100) {
            i80.a a4 = h.a(false);
            a4.a(d);
            a4.a(i.c().c());
            a4.b(currentTimeMillis);
            a4.a(System.currentTimeMillis());
            a3 = a4.a();
            d2 = a3.d();
        }
        h90Var.g().a(h90Var.f(), a3);
        if (this.a && d2 == 101) {
            j = a3.j();
            a2 = o80.c;
        } else {
            j = a3.j();
            a2 = h.a(a3);
        }
        j.a(a2);
        i80 a5 = j.a();
        if ("close".equalsIgnoreCase(a5.m().a("Connection")) || "close".equalsIgnoreCase(a5.a("Connection"))) {
            i.e();
        }
        if ((d2 != 204 && d2 != 205) || a5.a().c() <= 0) {
            return a5;
        }
        throw new ProtocolException("HTTP " + d2 + " had non-zero Content-Length: " + a5.a().c());
    }
}
