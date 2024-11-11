package p000;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class q70 {

    /* renamed from: e */
    private static final n70[] f12724e = {n70.f12280q, n70.f12281r, n70.f12282s, n70.f12283t, n70.f12284u, n70.f12274k, n70.f12276m, n70.f12275l, n70.f12277n, n70.f12279p, n70.f12278o};

    /* renamed from: f */
    private static final n70[] f12725f = {n70.f12280q, n70.f12281r, n70.f12282s, n70.f12283t, n70.f12284u, n70.f12274k, n70.f12276m, n70.f12275l, n70.f12277n, n70.f12279p, n70.f12278o, n70.f12272i, n70.f12273j, n70.f12270g, n70.f12271h, n70.f12268e, n70.f12269f, n70.f12267d};

    /* renamed from: g */
    public static final q70 f12726g;

    /* renamed from: h */
    public static final q70 f12727h;

    /* renamed from: a */
    final boolean f12728a;

    /* renamed from: b */
    final boolean f12729b;

    /* renamed from: c */
    @Nullable
    final String[] f12730c;

    /* renamed from: d */
    @Nullable
    final String[] f12731d;

    /* renamed from: q70$a */
    /* loaded from: classes.dex */
    public static final class C3113a {

        /* renamed from: a */
        boolean f12732a;

        /* renamed from: b */
        @Nullable
        String[] f12733b;

        /* renamed from: c */
        @Nullable
        String[] f12734c;

        /* renamed from: d */
        boolean f12735d;

        public C3113a(q70 q70Var) {
            this.f12732a = q70Var.f12728a;
            this.f12733b = q70Var.f12730c;
            this.f12734c = q70Var.f12731d;
            this.f12735d = q70Var.f12729b;
        }

        C3113a(boolean z) {
            this.f12732a = z;
        }

        /* renamed from: a */
        public C3113a m14987a(boolean z) {
            if (!this.f12732a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f12735d = z;
            return this;
        }

        /* renamed from: a */
        public C3113a m14988a(String... strArr) {
            if (!this.f12732a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f12733b = (String[]) strArr.clone();
            return this;
        }

        /* renamed from: a */
        public C3113a m14989a(l80... l80VarArr) {
            if (!this.f12732a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[l80VarArr.length];
            for (int i = 0; i < l80VarArr.length; i++) {
                strArr[i] = l80VarArr[i].javaName;
            }
            m14992b(strArr);
            return this;
        }

        /* renamed from: a */
        public C3113a m14990a(n70... n70VarArr) {
            if (!this.f12732a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[n70VarArr.length];
            for (int i = 0; i < n70VarArr.length; i++) {
                strArr[i] = n70VarArr[i].f12285a;
            }
            m14988a(strArr);
            return this;
        }

        /* renamed from: a */
        public q70 m14991a() {
            return new q70(this);
        }

        /* renamed from: b */
        public C3113a m14992b(String... strArr) {
            if (!this.f12732a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f12734c = (String[]) strArr.clone();
            return this;
        }
    }

    static {
        C3113a c3113a = new C3113a(true);
        c3113a.m14990a(f12724e);
        c3113a.m14989a(l80.TLS_1_3, l80.TLS_1_2);
        c3113a.m14987a(true);
        c3113a.m14991a();
        C3113a c3113a2 = new C3113a(true);
        c3113a2.m14990a(f12725f);
        c3113a2.m14989a(l80.TLS_1_3, l80.TLS_1_2, l80.TLS_1_1, l80.TLS_1_0);
        c3113a2.m14987a(true);
        f12726g = c3113a2.m14991a();
        C3113a c3113a3 = new C3113a(true);
        c3113a3.m14990a(f12725f);
        c3113a3.m14989a(l80.TLS_1_0);
        c3113a3.m14987a(true);
        c3113a3.m14991a();
        f12727h = new C3113a(false).m14991a();
    }

    q70(C3113a c3113a) {
        this.f12728a = c3113a.f12732a;
        this.f12730c = c3113a.f12733b;
        this.f12731d = c3113a.f12734c;
        this.f12729b = c3113a.f12735d;
    }

    /* renamed from: b */
    private q70 m14980b(SSLSocket sSLSocket, boolean z) {
        String[] m14464a = this.f12730c != null ? o80.m14464a(n70.f12265b, sSLSocket.getEnabledCipherSuites(), this.f12730c) : sSLSocket.getEnabledCipherSuites();
        String[] m14464a2 = this.f12731d != null ? o80.m14464a(o80.f12441o, sSLSocket.getEnabledProtocols(), this.f12731d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int m14443a = o80.m14443a(n70.f12265b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && m14443a != -1) {
            m14464a = o80.m14465a(m14464a, supportedCipherSuites[m14443a]);
        }
        C3113a c3113a = new C3113a(this);
        c3113a.m14988a(m14464a);
        c3113a.m14992b(m14464a2);
        return c3113a.m14991a();
    }

    @Nullable
    /* renamed from: a */
    public List<n70> m14981a() {
        String[] strArr = this.f12730c;
        if (strArr != null) {
            return n70.m14288a(strArr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14982a(SSLSocket sSLSocket, boolean z) {
        q70 m14980b = m14980b(sSLSocket, z);
        String[] strArr = m14980b.f12731d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = m14980b.f12730c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: a */
    public boolean m14983a(SSLSocket sSLSocket) {
        if (!this.f12728a) {
            return false;
        }
        String[] strArr = this.f12731d;
        if (strArr != null && !o80.m14469b(o80.f12441o, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f12730c;
        return strArr2 == null || o80.m14469b(n70.f12265b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* renamed from: b */
    public boolean m14984b() {
        return this.f12728a;
    }

    /* renamed from: c */
    public boolean m14985c() {
        return this.f12729b;
    }

    @Nullable
    /* renamed from: d */
    public List<l80> m14986d() {
        String[] strArr = this.f12731d;
        if (strArr != null) {
            return l80.forJavaNames(strArr);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof q70)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        q70 q70Var = (q70) obj;
        boolean z = this.f12728a;
        if (z != q70Var.f12728a) {
            return false;
        }
        return !z || (Arrays.equals(this.f12730c, q70Var.f12730c) && Arrays.equals(this.f12731d, q70Var.f12731d) && this.f12729b == q70Var.f12729b);
    }

    public int hashCode() {
        if (this.f12728a) {
            return ((((527 + Arrays.hashCode(this.f12730c)) * 31) + Arrays.hashCode(this.f12731d)) * 31) + (!this.f12729b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f12728a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f12730c != null ? m14981a().toString() : "[all enabled]") + ", tlsVersions=" + (this.f12731d != null ? m14986d().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f12729b + ")";
    }
}
