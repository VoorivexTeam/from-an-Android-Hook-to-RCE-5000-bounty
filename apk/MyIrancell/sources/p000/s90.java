package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.ByteString;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import p000.a80;
import p000.i80;
import p000.y70;

/* loaded from: classes.dex */
public final class s90 implements d90 {

    /* renamed from: f */
    private static final List<String> f13054f = o80.m14452a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g */
    private static final List<String> f13055g = o80.m14452a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final a80.InterfaceC0010a f13056a;

    /* renamed from: b */
    final a90 f13057b;

    /* renamed from: c */
    private final t90 f13058c;

    /* renamed from: d */
    private v90 f13059d;

    /* renamed from: e */
    private final e80 f13060e;

    /* renamed from: s90$a */
    /* loaded from: classes.dex */
    class C3200a extends ForwardingSource {

        /* renamed from: b */
        boolean f13061b;

        /* renamed from: c */
        long f13062c;

        C3200a(Source source) {
            super(source);
            this.f13061b = false;
            this.f13062c = 0L;
        }

        /* renamed from: a */
        private void m15389a(IOException iOException) {
            if (this.f13061b) {
                return;
            }
            this.f13061b = true;
            s90 s90Var = s90.this;
            s90Var.f13057b.m113a(false, s90Var, this.f13062c, iOException);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            m15389a(null);
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j) {
            try {
                long read = delegate().read(buffer, j);
                if (read > 0) {
                    this.f13062c += read;
                }
                return read;
            } catch (IOException e) {
                m15389a(e);
                throw e;
            }
        }
    }

    public s90(d80 d80Var, a80.InterfaceC0010a interfaceC0010a, a90 a90Var, t90 t90Var) {
        this.f13056a = interfaceC0010a;
        this.f13057b = a90Var;
        this.f13058c = t90Var;
        this.f13060e = d80Var.m11316v().contains(e80.H2_PRIOR_KNOWLEDGE) ? e80.H2_PRIOR_KNOWLEDGE : e80.HTTP_2;
    }

    /* renamed from: a */
    public static i80.C2583a m15387a(y70 y70Var, e80 e80Var) {
        y70.C3476a c3476a = new y70.C3476a();
        int m16595b = y70Var.m16595b();
        l90 l90Var = null;
        for (int i = 0; i < m16595b; i++) {
            String m16592a = y70Var.m16592a(i);
            String m16596b = y70Var.m16596b(i);
            if (m16592a.equals(":status")) {
                l90Var = l90.m13833a("HTTP/1.1 " + m16596b);
            } else if (!f13055g.contains(m16592a)) {
                m80.f12098a.mo11328a(c3476a, m16592a, m16596b);
            }
        }
        if (l90Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        i80.C2583a c2583a = new i80.C2583a();
        c2583a.m12403a(e80Var);
        c2583a.m12401a(l90Var.f11831b);
        c2583a.m12407a(l90Var.f11832c);
        c2583a.m12410a(c3476a.m16600a());
        return c2583a;
    }

    /* renamed from: b */
    public static List<p90> m15388b(g80 g80Var) {
        y70 m11921c = g80Var.m11921c();
        ArrayList arrayList = new ArrayList(m11921c.m16595b() + 4);
        arrayList.add(new p90(p90.f12580f, g80Var.m11923e()));
        arrayList.add(new p90(p90.f12581g, j90.m13430a(g80Var.m11925g())));
        String m11919a = g80Var.m11919a("Host");
        if (m11919a != null) {
            arrayList.add(new p90(p90.f12583i, m11919a));
        }
        arrayList.add(new p90(p90.f12582h, g80Var.m11925g().m16819n()));
        int m16595b = m11921c.m16595b();
        for (int i = 0; i < m16595b; i++) {
            ByteString encodeUtf8 = ByteString.encodeUtf8(m11921c.m16592a(i).toLowerCase(Locale.US));
            if (!f13054f.contains(encodeUtf8.utf8())) {
                arrayList.add(new p90(encodeUtf8, m11921c.m16596b(i)));
            }
        }
        return arrayList;
    }

    @Override // p000.d90
    /* renamed from: a */
    public i80.C2583a mo11341a(boolean z) {
        i80.C2583a m15387a = m15387a(this.f13059d.m15999j(), this.f13060e);
        if (z && m80.f12098a.mo11321a(m15387a) == 100) {
            return null;
        }
        return m15387a;
    }

    @Override // p000.d90
    /* renamed from: a */
    public j80 mo11342a(i80 i80Var) {
        a90 a90Var = this.f13057b;
        a90Var.f67f.m15966e(a90Var.f66e);
        return new i90(i80Var.m12386a("Content-Type"), f90.m11715a(i80Var), Okio.buffer(new C3200a(this.f13059d.m15994e())));
    }

    @Override // p000.d90
    /* renamed from: a */
    public Sink mo11343a(g80 g80Var, long j) {
        return this.f13059d.m15993d();
    }

    @Override // p000.d90
    /* renamed from: a */
    public void mo11344a() {
        this.f13059d.m15993d().close();
    }

    @Override // p000.d90
    /* renamed from: a */
    public void mo11345a(g80 g80Var) {
        if (this.f13059d != null) {
            return;
        }
        v90 m15590a = this.f13058c.m15590a(m15388b(g80Var), g80Var.m11918a() != null);
        this.f13059d = m15590a;
        m15590a.m15997h().timeout(this.f13056a.mo97b(), TimeUnit.MILLISECONDS);
        this.f13059d.m16001l().timeout(this.f13056a.mo98c(), TimeUnit.MILLISECONDS);
    }

    @Override // p000.d90
    /* renamed from: b */
    public void mo11346b() {
        this.f13058c.flush();
    }

    @Override // p000.d90
    public void cancel() {
        v90 v90Var = this.f13059d;
        if (v90Var != null) {
            v90Var.m15990b(o90.CANCEL);
        }
    }
}
