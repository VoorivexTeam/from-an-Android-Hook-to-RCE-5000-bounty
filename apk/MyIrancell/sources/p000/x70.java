package p000;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class x70 {

    /* renamed from: a */
    private final l80 f13998a;

    /* renamed from: b */
    private final n70 f13999b;

    /* renamed from: c */
    private final List<Certificate> f14000c;

    /* renamed from: d */
    private final List<Certificate> f14001d;

    private x70(l80 l80Var, n70 n70Var, List<Certificate> list, List<Certificate> list2) {
        this.f13998a = l80Var;
        this.f13999b = n70Var;
        this.f14000c = list;
        this.f14001d = list2;
    }

    /* renamed from: a */
    public static x70 m16459a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        n70 m14289a = n70.m14289a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        l80 forJavaName = l80.forJavaName(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List m14452a = certificateArr != null ? o80.m14452a(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new x70(forJavaName, m14289a, m14452a, localCertificates != null ? o80.m14452a(localCertificates) : Collections.emptyList());
    }

    /* renamed from: a */
    public n70 m16460a() {
        return this.f13999b;
    }

    /* renamed from: b */
    public List<Certificate> m16461b() {
        return this.f14000c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof x70)) {
            return false;
        }
        x70 x70Var = (x70) obj;
        return this.f13998a.equals(x70Var.f13998a) && this.f13999b.equals(x70Var.f13999b) && this.f14000c.equals(x70Var.f14000c) && this.f14001d.equals(x70Var.f14001d);
    }

    public int hashCode() {
        return ((((((527 + this.f13998a.hashCode()) * 31) + this.f13999b.hashCode()) * 31) + this.f14000c.hashCode()) * 31) + this.f14001d.hashCode();
    }
}
