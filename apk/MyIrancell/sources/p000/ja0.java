package p000;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class ja0 implements ma0 {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f11498a = new LinkedHashMap();

    public ja0(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set = this.f11498a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.f11498a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // p000.ma0
    /* renamed from: a */
    public X509Certificate mo3363a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f11498a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ja0) && ((ja0) obj).f11498a.equals(this.f11498a);
    }

    public int hashCode() {
        return this.f11498a.hashCode();
    }
}
