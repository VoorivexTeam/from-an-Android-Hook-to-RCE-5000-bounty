package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;

/* loaded from: classes.dex */
public final class m70 {

    /* renamed from: c */
    public static final m70 f12089c = new C2925a().m14069a();

    /* renamed from: a */
    private final Set<C2926b> f12090a;

    /* renamed from: b */
    @Nullable
    private final ka0 f12091b;

    /* renamed from: m70$a */
    /* loaded from: classes.dex */
    public static final class C2925a {

        /* renamed from: a */
        private final List<C2926b> f12092a = new ArrayList();

        /* renamed from: a */
        public C2925a m14068a(String str, String... strArr) {
            if (str == null) {
                throw new NullPointerException("pattern == null");
            }
            for (String str2 : strArr) {
                this.f12092a.add(new C2926b(str, str2));
            }
            return this;
        }

        /* renamed from: a */
        public m70 m14069a() {
            return new m70(new LinkedHashSet(this.f12092a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m70$b */
    /* loaded from: classes.dex */
    public static final class C2926b {

        /* renamed from: a */
        final String f12093a;

        /* renamed from: b */
        final String f12094b;

        /* renamed from: c */
        final String f12095c;

        /* renamed from: d */
        final ByteString f12096d;

        C2926b(String str, String str2) {
            StringBuilder sb;
            int i;
            this.f12093a = str;
            if (str.startsWith("*.")) {
                sb = new StringBuilder();
                sb.append("http://");
                str = str.substring(2);
            } else {
                sb = new StringBuilder();
                sb.append("http://");
            }
            sb.append(str);
            this.f12094b = z70.m16802d(sb.toString()).m16812g();
            if (str2.startsWith("sha1/")) {
                this.f12095c = "sha1/";
                i = 5;
            } else {
                if (!str2.startsWith("sha256/")) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                }
                this.f12095c = "sha256/";
                i = 7;
            }
            this.f12096d = ByteString.decodeBase64(str2.substring(i));
            if (this.f12096d != null) {
                return;
            }
            throw new IllegalArgumentException("pins must be base64: " + str2);
        }

        /* renamed from: a */
        boolean m14070a(String str) {
            if (!this.f12093a.startsWith("*.")) {
                return str.equals(this.f12094b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f12094b.length()) {
                String str2 = this.f12094b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2926b) {
                C2926b c2926b = (C2926b) obj;
                if (this.f12093a.equals(c2926b.f12093a) && this.f12095c.equals(c2926b.f12095c) && this.f12096d.equals(c2926b.f12096d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f12093a.hashCode()) * 31) + this.f12095c.hashCode()) * 31) + this.f12096d.hashCode();
        }

        public String toString() {
            return this.f12095c + this.f12096d.base64();
        }
    }

    m70(Set<C2926b> set, @Nullable ka0 ka0Var) {
        this.f12090a = set;
        this.f12091b = ka0Var;
    }

    /* renamed from: a */
    public static String m14062a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + m14064b((X509Certificate) certificate).base64();
    }

    /* renamed from: a */
    static ByteString m14063a(X509Certificate x509Certificate) {
        return ByteString.m14632of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    /* renamed from: b */
    static ByteString m14064b(X509Certificate x509Certificate) {
        return ByteString.m14632of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    /* renamed from: a */
    List<C2926b> m14065a(String str) {
        List<C2926b> emptyList = Collections.emptyList();
        for (C2926b c2926b : this.f12090a) {
            if (c2926b.m14070a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(c2926b);
            }
        }
        return emptyList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public m70 m14066a(@Nullable ka0 ka0Var) {
        return o80.m14461a(this.f12091b, ka0Var) ? this : new m70(this.f12090a, ka0Var);
    }

    /* renamed from: a */
    public void m14067a(String str, List<Certificate> list) {
        List<C2926b> m14065a = m14065a(str);
        if (m14065a.isEmpty()) {
            return;
        }
        ka0 ka0Var = this.f12091b;
        if (ka0Var != null) {
            list = ka0Var.mo3362a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = m14065a.size();
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                C2926b c2926b = m14065a.get(i2);
                if (c2926b.f12095c.equals("sha256/")) {
                    if (byteString == null) {
                        byteString = m14064b(x509Certificate);
                    }
                    if (c2926b.f12096d.equals(byteString)) {
                        return;
                    }
                } else {
                    if (!c2926b.f12095c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + c2926b.f12095c);
                    }
                    if (byteString2 == null) {
                        byteString2 = m14063a(x509Certificate);
                    }
                    if (c2926b.f12096d.equals(byteString2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(m14062a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = m14065a.size();
        for (int i4 = 0; i4 < size4; i4++) {
            C2926b c2926b2 = m14065a.get(i4);
            sb.append("\n    ");
            sb.append(c2926b2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m70) {
            m70 m70Var = (m70) obj;
            if (o80.m14461a(this.f12091b, m70Var.f12091b) && this.f12090a.equals(m70Var.f12090a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ka0 ka0Var = this.f12091b;
        return ((ka0Var != null ? ka0Var.hashCode() : 0) * 31) + this.f12090a.hashCode();
    }
}
