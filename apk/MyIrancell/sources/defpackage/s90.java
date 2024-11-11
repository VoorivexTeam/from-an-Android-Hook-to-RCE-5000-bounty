package defpackage;

import defpackage.a80;
import defpackage.i80;
import defpackage.y70;
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

/* loaded from: classes.dex */
public final class s90 implements d90 {
    private static final List<String> f = o80.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> g = o80.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final a80.a a;
    final a90 b;
    private final t90 c;
    private v90 d;
    private final e80 e;

    /* loaded from: classes.dex */
    class a extends ForwardingSource {
        boolean b;
        long c;

        a(Source source) {
            super(source);
            this.b = false;
            this.c = 0L;
        }

        private void a(IOException iOException) {
            if (this.b) {
                return;
            }
            this.b = true;
            s90 s90Var = s90.this;
            s90Var.b.a(false, s90Var, this.c, iOException);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            a(null);
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j) {
            try {
                long read = delegate().read(buffer, j);
                if (read > 0) {
                    this.c += read;
                }
                return read;
            } catch (IOException e) {
                a(e);
                throw e;
            }
        }
    }

    public s90(d80 d80Var, a80.a aVar, a90 a90Var, t90 t90Var) {
        this.a = aVar;
        this.b = a90Var;
        this.c = t90Var;
        this.e = d80Var.v().contains(e80.H2_PRIOR_KNOWLEDGE) ? e80.H2_PRIOR_KNOWLEDGE : e80.HTTP_2;
    }

    public static i80.a a(y70 y70Var, e80 e80Var) {
        y70.a aVar = new y70.a();
        int b = y70Var.b();
        l90 l90Var = null;
        for (int i = 0; i < b; i++) {
            String a2 = y70Var.a(i);
            String b2 = y70Var.b(i);
            if (a2.equals(":status")) {
                l90Var = l90.a("HTTP/1.1 " + b2);
            } else if (!g.contains(a2)) {
                m80.a.a(aVar, a2, b2);
            }
        }
        if (l90Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        i80.a aVar2 = new i80.a();
        aVar2.a(e80Var);
        aVar2.a(l90Var.b);
        aVar2.a(l90Var.c);
        aVar2.a(aVar.a());
        return aVar2;
    }

    public static List<p90> b(g80 g80Var) {
        y70 c = g80Var.c();
        ArrayList arrayList = new ArrayList(c.b() + 4);
        arrayList.add(new p90(p90.f, g80Var.e()));
        arrayList.add(new p90(p90.g, j90.a(g80Var.g())));
        String a2 = g80Var.a("Host");
        if (a2 != null) {
            arrayList.add(new p90(p90.i, a2));
        }
        arrayList.add(new p90(p90.h, g80Var.g().n()));
        int b = c.b();
        for (int i = 0; i < b; i++) {
            ByteString encodeUtf8 = ByteString.encodeUtf8(c.a(i).toLowerCase(Locale.US));
            if (!f.contains(encodeUtf8.utf8())) {
                arrayList.add(new p90(encodeUtf8, c.b(i)));
            }
        }
        return arrayList;
    }

    @Override // defpackage.d90
    public i80.a a(boolean z) {
        i80.a a2 = a(this.d.j(), this.e);
        if (z && m80.a.a(a2) == 100) {
            return null;
        }
        return a2;
    }

    @Override // defpackage.d90
    public j80 a(i80 i80Var) {
        a90 a90Var = this.b;
        a90Var.f.e(a90Var.e);
        return new i90(i80Var.a("Content-Type"), f90.a(i80Var), Okio.buffer(new a(this.d.e())));
    }

    @Override // defpackage.d90
    public Sink a(g80 g80Var, long j) {
        return this.d.d();
    }

    @Override // defpackage.d90
    public void a() {
        this.d.d().close();
    }

    @Override // defpackage.d90
    public void a(g80 g80Var) {
        if (this.d != null) {
            return;
        }
        v90 a2 = this.c.a(b(g80Var), g80Var.a() != null);
        this.d = a2;
        a2.h().timeout(this.a.b(), TimeUnit.MILLISECONDS);
        this.d.l().timeout(this.a.c(), TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.d90
    public void b() {
        this.c.flush();
    }

    @Override // defpackage.d90
    public void cancel() {
        v90 v90Var = this.d;
        if (v90Var != null) {
            v90Var.b(o90.CANCEL);
        }
    }
}
