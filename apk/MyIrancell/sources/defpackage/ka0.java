package defpackage;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public abstract class ka0 {
    public static ka0 a(X509TrustManager x509TrustManager) {
        return ga0.c().a(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str);
}
