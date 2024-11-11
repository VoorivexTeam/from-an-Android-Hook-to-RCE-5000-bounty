package defpackage;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class q70 {
    private static final n70[] e = {n70.q, n70.r, n70.s, n70.t, n70.u, n70.k, n70.m, n70.l, n70.n, n70.p, n70.o};
    private static final n70[] f = {n70.q, n70.r, n70.s, n70.t, n70.u, n70.k, n70.m, n70.l, n70.n, n70.p, n70.o, n70.i, n70.j, n70.g, n70.h, n70.e, n70.f, n70.d};
    public static final q70 g;
    public static final q70 h;
    final boolean a;
    final boolean b;

    @Nullable
    final String[] c;

    @Nullable
    final String[] d;

    /* loaded from: classes.dex */
    public static final class a {
        boolean a;

        @Nullable
        String[] b;

        @Nullable
        String[] c;
        boolean d;

        public a(q70 q70Var) {
            this.a = q70Var.a;
            this.b = q70Var.c;
            this.c = q70Var.d;
            this.d = q70Var.b;
        }

        a(boolean z) {
            this.a = z;
        }

        public a a(boolean z) {
            if (!this.a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.d = z;
            return this;
        }

        public a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.b = (String[]) strArr.clone();
            return this;
        }

        public a a(l80... l80VarArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[l80VarArr.length];
            for (int i = 0; i < l80VarArr.length; i++) {
                strArr[i] = l80VarArr[i].javaName;
            }
            b(strArr);
            return this;
        }

        public a a(n70... n70VarArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[n70VarArr.length];
            for (int i = 0; i < n70VarArr.length; i++) {
                strArr[i] = n70VarArr[i].a;
            }
            a(strArr);
            return this;
        }

        public q70 a() {
            return new q70(this);
        }

        public a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.c = (String[]) strArr.clone();
            return this;
        }
    }

    static {
        a aVar = new a(true);
        aVar.a(e);
        aVar.a(l80.TLS_1_3, l80.TLS_1_2);
        aVar.a(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.a(f);
        aVar2.a(l80.TLS_1_3, l80.TLS_1_2, l80.TLS_1_1, l80.TLS_1_0);
        aVar2.a(true);
        g = aVar2.a();
        a aVar3 = new a(true);
        aVar3.a(f);
        aVar3.a(l80.TLS_1_0);
        aVar3.a(true);
        aVar3.a();
        h = new a(false).a();
    }

    q70(a aVar) {
        this.a = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.b = aVar.d;
    }

    private q70 b(SSLSocket sSLSocket, boolean z) {
        String[] a2 = this.c != null ? o80.a(n70.b, sSLSocket.getEnabledCipherSuites(), this.c) : sSLSocket.getEnabledCipherSuites();
        String[] a3 = this.d != null ? o80.a(o80.o, sSLSocket.getEnabledProtocols(), this.d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a4 = o80.a(n70.b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a4 != -1) {
            a2 = o80.a(a2, supportedCipherSuites[a4]);
        }
        a aVar = new a(this);
        aVar.a(a2);
        aVar.b(a3);
        return aVar.a();
    }

    @Nullable
    public List<n70> a() {
        String[] strArr = this.c;
        if (strArr != null) {
            return n70.a(strArr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z) {
        q70 b = b(sSLSocket, z);
        String[] strArr = b.d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b.c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !o80.b(o80.o, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || o80.b(n70.b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Nullable
    public List<l80> d() {
        String[] strArr = this.d;
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
        boolean z = this.a;
        if (z != q70Var.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, q70Var.c) && Arrays.equals(this.d, q70Var.d) && this.b == q70Var.b);
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.c != null ? a().toString() : "[all enabled]") + ", tlsVersions=" + (this.d != null ? d().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.b + ")";
    }
}
