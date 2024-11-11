package defpackage;

import defpackage.a80;
import defpackage.i80;
import defpackage.s80;
import defpackage.y70;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* loaded from: classes.dex */
public final class q80 implements a80 {
    final t80 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Source {
        boolean b;
        final /* synthetic */ BufferedSource c;
        final /* synthetic */ r80 d;
        final /* synthetic */ BufferedSink e;

        a(q80 q80Var, BufferedSource bufferedSource, r80 r80Var, BufferedSink bufferedSink) {
            this.c = bufferedSource;
            this.d = r80Var;
            this.e = bufferedSink;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.b && !o80.a(this, 100, TimeUnit.MILLISECONDS)) {
                this.b = true;
                this.d.b();
            }
            this.c.close();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            try {
                long read = this.c.read(buffer, j);
                if (read != -1) {
                    buffer.copyTo(this.e.buffer(), buffer.size() - read, read);
                    this.e.emitCompleteSegments();
                    return read;
                }
                if (!this.b) {
                    this.b = true;
                    this.e.close();
                }
                return -1L;
            } catch (IOException e) {
                if (!this.b) {
                    this.b = true;
                    this.d.b();
                }
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.c.timeout();
        }
    }

    public q80(t80 t80Var) {
        this.a = t80Var;
    }

    private static i80 a(i80 i80Var) {
        if (i80Var == null || i80Var.a() == null) {
            return i80Var;
        }
        i80.a j = i80Var.j();
        j.a((j80) null);
        return j.a();
    }

    private i80 a(r80 r80Var, i80 i80Var) {
        Sink a2;
        if (r80Var == null || (a2 = r80Var.a()) == null) {
            return i80Var;
        }
        a aVar = new a(this, i80Var.a().e(), r80Var, Okio.buffer(a2));
        String a3 = i80Var.a("Content-Type");
        long c = i80Var.a().c();
        i80.a j = i80Var.j();
        j.a(new i90(a3, c, Okio.buffer(aVar)));
        return j.a();
    }

    private static y70 a(y70 y70Var, y70 y70Var2) {
        y70.a aVar = new y70.a();
        int b = y70Var.b();
        for (int i = 0; i < b; i++) {
            String a2 = y70Var.a(i);
            String b2 = y70Var.b(i);
            if ((!"Warning".equalsIgnoreCase(a2) || !b2.startsWith("1")) && (a(a2) || !b(a2) || y70Var2.a(a2) == null)) {
                m80.a.a(aVar, a2, b2);
            }
        }
        int b3 = y70Var2.b();
        for (int i2 = 0; i2 < b3; i2++) {
            String a3 = y70Var2.a(i2);
            if (!a(a3) && b(a3)) {
                m80.a.a(aVar, a3, y70Var2.b(i2));
            }
        }
        return aVar.a();
    }

    static boolean a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // defpackage.a80
    public i80 intercept(a80.a aVar) {
        t80 t80Var = this.a;
        i80 a2 = t80Var != null ? t80Var.a(aVar.d()) : null;
        s80 a3 = new s80.a(System.currentTimeMillis(), aVar.d(), a2).a();
        g80 g80Var = a3.a;
        i80 i80Var = a3.b;
        t80 t80Var2 = this.a;
        if (t80Var2 != null) {
            t80Var2.a(a3);
        }
        if (a2 != null && i80Var == null) {
            o80.a(a2.a());
        }
        if (g80Var == null && i80Var == null) {
            i80.a aVar2 = new i80.a();
            aVar2.a(aVar.d());
            aVar2.a(e80.HTTP_1_1);
            aVar2.a(504);
            aVar2.a("Unsatisfiable Request (only-if-cached)");
            aVar2.a(o80.c);
            aVar2.b(-1L);
            aVar2.a(System.currentTimeMillis());
            return aVar2.a();
        }
        if (g80Var == null) {
            i80.a j = i80Var.j();
            j.a(a(i80Var));
            return j.a();
        }
        try {
            i80 a4 = aVar.a(g80Var);
            if (a4 == null && a2 != null) {
            }
            if (i80Var != null) {
                if (a4.d() == 304) {
                    i80.a j2 = i80Var.j();
                    j2.a(a(i80Var.f(), a4.f()));
                    j2.b(a4.n());
                    j2.a(a4.l());
                    j2.a(a(i80Var));
                    j2.b(a(a4));
                    i80 a5 = j2.a();
                    a4.a().close();
                    this.a.a();
                    this.a.a(i80Var, a5);
                    return a5;
                }
                o80.a(i80Var.a());
            }
            i80.a j3 = a4.j();
            j3.a(a(i80Var));
            j3.b(a(a4));
            i80 a6 = j3.a();
            if (this.a != null) {
                if (f90.b(a6) && s80.a(a6, g80Var)) {
                    return a(this.a.a(a6), a6);
                }
                if (g90.a(g80Var.e())) {
                    try {
                        this.a.b(g80Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return a6;
        } finally {
            if (a2 != null) {
                o80.a(a2.a());
            }
        }
    }
}
