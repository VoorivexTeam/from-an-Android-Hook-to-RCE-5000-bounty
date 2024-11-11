package p000;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class la0 implements HostnameVerifier {

    /* renamed from: a */
    public static final la0 f11833a = new la0();

    private la0() {
    }

    /* renamed from: a */
    public static List<String> m13834a(X509Certificate x509Certificate) {
        List<String> m13835a = m13835a(x509Certificate, 7);
        List<String> m13835a2 = m13835a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(m13835a.size() + m13835a2.size());
        arrayList.addAll(m13835a);
        arrayList.addAll(m13835a2);
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m13835a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    private boolean m13836b(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = m13835a(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (m13838a(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m13837c(String str, X509Certificate x509Certificate) {
        List<String> m13835a = m13835a(x509Certificate, 7);
        int size = m13835a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(m13835a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m13838a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m13839a(String str, X509Certificate x509Certificate) {
        return o80.m14474d(str) ? m13837c(str, x509Certificate) : m13836b(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m13839a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
