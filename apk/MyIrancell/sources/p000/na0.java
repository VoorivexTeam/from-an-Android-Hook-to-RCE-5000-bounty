package p000;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import p000.a80;

/* loaded from: classes.dex */
public final class na0 implements a80 {

    /* renamed from: d */
    private static final Charset f12296d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final InterfaceC2982b f12297a;

    /* renamed from: b */
    private volatile Set<String> f12298b;

    /* renamed from: c */
    private volatile EnumC2981a f12299c;

    /* renamed from: na0$a */
    /* loaded from: classes.dex */
    public enum EnumC2981a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: na0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2982b {

        /* renamed from: a */
        public static final InterfaceC2982b f12300a = new a();

        /* renamed from: na0$b$a */
        /* loaded from: classes.dex */
        class a implements InterfaceC2982b {
            a() {
            }

            @Override // p000.na0.InterfaceC2982b
            /* renamed from: a */
            public void mo14309a(String str) {
                ga0.m11953c().mo3355a(4, str, (Throwable) null);
            }
        }

        /* renamed from: a */
        void mo14309a(String str);
    }

    public na0() {
        this(InterfaceC2982b.f12300a);
    }

    public na0(InterfaceC2982b interfaceC2982b) {
        this.f12298b = Collections.emptySet();
        this.f12299c = EnumC2981a.NONE;
        this.f12297a = interfaceC2982b;
    }

    /* renamed from: a */
    private void m14305a(y70 y70Var, int i) {
        String m16596b = this.f12298b.contains(y70Var.m16592a(i)) ? "██" : y70Var.m16596b(i);
        this.f12297a.mo14309a(y70Var.m16592a(i) + ": " + m16596b);
    }

    /* renamed from: a */
    static boolean m14306a(Buffer buffer) {
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

    /* renamed from: a */
    private static boolean m14307a(y70 y70Var) {
        String m16593a = y70Var.m16593a("Content-Encoding");
        return (m16593a == null || m16593a.equalsIgnoreCase("identity") || m16593a.equalsIgnoreCase("gzip")) ? false : true;
    }

    /* renamed from: a */
    public na0 m14308a(EnumC2981a enumC2981a) {
        if (enumC2981a == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.f12299c = enumC2981a;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Long] */
    @Override // p000.a80
    public i80 intercept(a80.InterfaceC0010a interfaceC0010a) {
        long j;
        char c;
        String sb;
        InterfaceC2982b interfaceC2982b;
        String str;
        InterfaceC2982b interfaceC2982b2;
        StringBuilder sb2;
        String m11923e;
        String str2;
        StringBuilder sb3;
        EnumC2981a enumC2981a = this.f12299c;
        g80 mo99d = interfaceC0010a.mo99d();
        if (enumC2981a == EnumC2981a.NONE) {
            return interfaceC0010a.mo96a(mo99d);
        }
        boolean z = enumC2981a == EnumC2981a.BODY;
        boolean z2 = z || enumC2981a == EnumC2981a.HEADERS;
        h80 m11918a = mo99d.m11918a();
        boolean z3 = m11918a != null;
        o70 mo100e = interfaceC0010a.mo100e();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("--> ");
        sb4.append(mo99d.m11923e());
        sb4.append(' ');
        sb4.append(mo99d.m11925g());
        sb4.append(mo100e != null ? " " + mo100e.mo14432a() : "");
        String sb5 = sb4.toString();
        if (!z2 && z3) {
            sb5 = sb5 + " (" + m11918a.mo3610a() + "-byte body)";
        }
        this.f12297a.mo14309a(sb5);
        if (z2) {
            if (z3) {
                if (m11918a.mo3612b() != null) {
                    this.f12297a.mo14309a("Content-Type: " + m11918a.mo3612b());
                }
                if (m11918a.mo3610a() != -1) {
                    this.f12297a.mo14309a("Content-Length: " + m11918a.mo3610a());
                }
            }
            y70 m11921c = mo99d.m11921c();
            int m16595b = m11921c.m16595b();
            for (int i = 0; i < m16595b; i++) {
                String m16592a = m11921c.m16592a(i);
                if (!"Content-Type".equalsIgnoreCase(m16592a) && !"Content-Length".equalsIgnoreCase(m16592a)) {
                    m14305a(m11921c, i);
                }
            }
            if (!z || !z3) {
                interfaceC2982b2 = this.f12297a;
                sb2 = new StringBuilder();
                sb2.append("--> END ");
                m11923e = mo99d.m11923e();
            } else if (m14307a(mo99d.m11921c())) {
                interfaceC2982b2 = this.f12297a;
                sb2 = new StringBuilder();
                sb2.append("--> END ");
                sb2.append(mo99d.m11923e());
                m11923e = " (encoded body omitted)";
            } else {
                Buffer buffer = new Buffer();
                m11918a.mo3611a(buffer);
                Charset charset = f12296d;
                b80 mo3612b = m11918a.mo3612b();
                if (mo3612b != null) {
                    charset = mo3612b.m3343a(f12296d);
                }
                this.f12297a.mo14309a("");
                if (m14306a(buffer)) {
                    this.f12297a.mo14309a(buffer.readString(charset));
                    interfaceC2982b2 = this.f12297a;
                    sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(mo99d.m11923e());
                    sb3.append(" (");
                    sb3.append(m11918a.mo3610a());
                    sb3.append("-byte body)");
                } else {
                    interfaceC2982b2 = this.f12297a;
                    sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(mo99d.m11923e());
                    sb3.append(" (binary ");
                    sb3.append(m11918a.mo3610a());
                    sb3.append("-byte body omitted)");
                }
                str2 = sb3.toString();
                interfaceC2982b2.mo14309a(str2);
            }
            sb2.append(m11923e);
            str2 = sb2.toString();
            interfaceC2982b2.mo14309a(str2);
        }
        long nanoTime = System.nanoTime();
        try {
            i80 mo96a = interfaceC0010a.mo96a(mo99d);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            j80 m12385a = mo96a.m12385a();
            long mo12416c = m12385a.mo12416c();
            String str3 = mo12416c != -1 ? mo12416c + "-byte" : "unknown-length";
            InterfaceC2982b interfaceC2982b3 = this.f12297a;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("<-- ");
            sb6.append(mo96a.m12389d());
            if (mo96a.m12393i().isEmpty()) {
                sb = "";
                j = mo12416c;
                c = ' ';
            } else {
                StringBuilder sb7 = new StringBuilder();
                j = mo12416c;
                c = ' ';
                sb7.append(' ');
                sb7.append(mo96a.m12393i());
                sb = sb7.toString();
            }
            sb6.append(sb);
            sb6.append(c);
            sb6.append(mo96a.m12397m().m11925g());
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            sb6.append(z2 ? "" : ", " + str3 + " body");
            sb6.append(')');
            interfaceC2982b3.mo14309a(sb6.toString());
            if (z2) {
                y70 m12391f = mo96a.m12391f();
                int m16595b2 = m12391f.m16595b();
                for (int i2 = 0; i2 < m16595b2; i2++) {
                    m14305a(m12391f, i2);
                }
                if (!z || !f90.m11720b(mo96a)) {
                    interfaceC2982b = this.f12297a;
                    str = "<-- END HTTP";
                } else if (m14307a(mo96a.m12391f())) {
                    interfaceC2982b = this.f12297a;
                    str = "<-- END HTTP (encoded body omitted)";
                } else {
                    BufferedSource mo12418e = m12385a.mo12418e();
                    mo12418e.request(Long.MAX_VALUE);
                    Buffer buffer2 = mo12418e.buffer();
                    GzipSource gzipSource = null;
                    if ("gzip".equalsIgnoreCase(m12391f.m16593a("Content-Encoding"))) {
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
                    Charset charset2 = f12296d;
                    b80 mo12417d = m12385a.mo12417d();
                    if (mo12417d != null) {
                        charset2 = mo12417d.m3343a(f12296d);
                    }
                    if (!m14306a(buffer2)) {
                        this.f12297a.mo14309a("");
                        this.f12297a.mo14309a("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                        return mo96a;
                    }
                    if (j != 0) {
                        this.f12297a.mo14309a("");
                        this.f12297a.mo14309a(buffer2.clone().readString(charset2));
                    }
                    this.f12297a.mo14309a(gzipSource != null ? "<-- END HTTP (" + buffer2.size() + "-byte, " + gzipSource + "-gzipped-byte body)" : "<-- END HTTP (" + buffer2.size() + "-byte body)");
                }
                interfaceC2982b.mo14309a(str);
            }
            return mo96a;
        } catch (Exception e) {
            this.f12297a.mo14309a("<-- HTTP FAILED: " + e);
            throw e;
        }
    }
}
