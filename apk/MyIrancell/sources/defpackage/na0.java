package defpackage;

import defpackage.a80;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;

/* loaded from: classes.dex */
public final class na0 implements a80 {
    private static final Charset d = Charset.forName("UTF-8");
    private final b a;
    private volatile Set<String> b;
    private volatile a c;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* loaded from: classes.dex */
    public interface b {
        public static final b a = new a();

        /* loaded from: classes.dex */
        class a implements b {
            a() {
            }

            @Override // na0.b
            public void a(String str) {
                ga0.c().a(4, str, (Throwable) null);
            }
        }

        void a(String str);
    }

    public na0() {
        this(b.a);
    }

    public na0(b bVar) {
        this.b = Collections.emptySet();
        this.c = a.NONE;
        this.a = bVar;
    }

    private void a(y70 y70Var, int i) {
        String b2 = this.b.contains(y70Var.a(i)) ? "██" : y70Var.b(i);
        this.a.a(y70Var.a(i) + ": " + b2);
    }

    static boolean a(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            for (int i = 0; i < 16; i++) {
                if (buffer2.exhausted()) {
                    return true;
                }
                int readUtf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private static boolean a(y70 y70Var) {
        String a2 = y70Var.a("Content-Encoding");
        return (a2 == null || a2.equalsIgnoreCase("identity") || a2.equalsIgnoreCase("gzip")) ? false : true;
    }

    public na0 a(a aVar) {
        if (aVar == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.c = aVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Long] */
    @Override // defpackage.a80
    public i80 intercept(a80.a aVar) {
        long j;
        char c;
        String sb;
        b bVar;
        String str;
        b bVar2;
        StringBuilder sb2;
        String e;
        String str2;
        StringBuilder sb3;
        a aVar2 = this.c;
        g80 d2 = aVar.d();
        if (aVar2 == a.NONE) {
            return aVar.a(d2);
        }
        boolean z = aVar2 == a.BODY;
        boolean z2 = z || aVar2 == a.HEADERS;
        h80 a2 = d2.a();
        boolean z3 = a2 != null;
        o70 e2 = aVar.e();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("--> ");
        sb4.append(d2.e());
        sb4.append(' ');
        sb4.append(d2.g());
        sb4.append(e2 != null ? " " + e2.a() : "");
        String sb5 = sb4.toString();
        if (!z2 && z3) {
            sb5 = sb5 + " (" + a2.a() + "-byte body)";
        }
        this.a.a(sb5);
        if (z2) {
            if (z3) {
                if (a2.b() != null) {
                    this.a.a("Content-Type: " + a2.b());
                }
                if (a2.a() != -1) {
                    this.a.a("Content-Length: " + a2.a());
                }
            }
            y70 c2 = d2.c();
            int b2 = c2.b();
            for (int i = 0; i < b2; i++) {
                String a3 = c2.a(i);
                if (!"Content-Type".equalsIgnoreCase(a3) && !"Content-Length".equalsIgnoreCase(a3)) {
                    a(c2, i);
                }
            }
            if (!z || !z3) {
                bVar2 = this.a;
                sb2 = new StringBuilder();
                sb2.append("--> END ");
                e = d2.e();
            } else if (a(d2.c())) {
                bVar2 = this.a;
                sb2 = new StringBuilder();
                sb2.append("--> END ");
                sb2.append(d2.e());
                e = " (encoded body omitted)";
            } else {
                Buffer buffer = new Buffer();
                a2.a(buffer);
                Charset charset = d;
                b80 b3 = a2.b();
                if (b3 != null) {
                    charset = b3.a(d);
                }
                this.a.a("");
                if (a(buffer)) {
                    this.a.a(buffer.readString(charset));
                    bVar2 = this.a;
                    sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(d2.e());
                    sb3.append(" (");
                    sb3.append(a2.a());
                    sb3.append("-byte body)");
                } else {
                    bVar2 = this.a;
                    sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(d2.e());
                    sb3.append(" (binary ");
                    sb3.append(a2.a());
                    sb3.append("-byte body omitted)");
                }
                str2 = sb3.toString();
                bVar2.a(str2);
            }
            sb2.append(e);
            str2 = sb2.toString();
            bVar2.a(str2);
        }
        long nanoTime = System.nanoTime();
        try {
            i80 a4 = aVar.a(d2);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            j80 a5 = a4.a();
            long c3 = a5.c();
            String str3 = c3 != -1 ? c3 + "-byte" : "unknown-length";
            b bVar3 = this.a;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("<-- ");
            sb6.append(a4.d());
            if (a4.i().isEmpty()) {
                sb = "";
                j = c3;
                c = ' ';
            } else {
                StringBuilder sb7 = new StringBuilder();
                j = c3;
                c = ' ';
                sb7.append(' ');
                sb7.append(a4.i());
                sb = sb7.toString();
            }
            sb6.append(sb);
            sb6.append(c);
            sb6.append(a4.m().g());
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            sb6.append(z2 ? "" : ", " + str3 + " body");
            sb6.append(')');
            bVar3.a(sb6.toString());
            if (z2) {
                y70 f = a4.f();
                int b4 = f.b();
                for (int i2 = 0; i2 < b4; i2++) {
                    a(f, i2);
                }
                if (!z || !f90.b(a4)) {
                    bVar = this.a;
                    str = "<-- END HTTP";
                } else if (a(a4.f())) {
                    bVar = this.a;
                    str = "<-- END HTTP (encoded body omitted)";
                } else {
                    BufferedSource e3 = a5.e();
                    e3.request(Long.MAX_VALUE);
                    Buffer buffer2 = e3.buffer();
                    GzipSource gzipSource = null;
                    if ("gzip".equalsIgnoreCase(f.a("Content-Encoding"))) {
                        ?? valueOf = Long.valueOf(buffer2.size());
                        try {
                            GzipSource gzipSource2 = new GzipSource(buffer2.clone());
                            try {
                                buffer2 = new Buffer();
                                buffer2.writeAll(gzipSource2);
                                gzipSource2.close();
                                gzipSource = valueOf;
                            } catch (Throwable th) {
                                th = th;
                                gzipSource = gzipSource2;
                                if (gzipSource != null) {
                                    gzipSource.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    Charset charset2 = d;
                    b80 d3 = a5.d();
                    if (d3 != null) {
                        charset2 = d3.a(d);
                    }
                    if (!a(buffer2)) {
                        this.a.a("");
                        this.a.a("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                        return a4;
                    }
                    if (j != 0) {
                        this.a.a("");
                        this.a.a(buffer2.clone().readString(charset2));
                    }
                    this.a.a(gzipSource != null ? "<-- END HTTP (" + buffer2.size() + "-byte, " + gzipSource + "-gzipped-byte body)" : "<-- END HTTP (" + buffer2.size() + "-byte body)");
                }
                bVar.a(str);
            }
            return a4;
        } catch (Exception e4) {
            this.a.a("<-- HTTP FAILED: " + e4);
            throw e4;
        }
    }
}
