package p000;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public class ca0 extends ga0 {
    private ca0() {
    }

    /* renamed from: b */
    public static ca0 m3634b() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new ca0();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private Provider m3635e() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // p000.ga0
    /* renamed from: a */
    public SSLContext mo3353a() {
        try {
            return SSLContext.getInstance("TLSv1.3", m3635e());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m3635e());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // p000.ga0
    /* renamed from: a */
    public void mo3358a(SSLSocket sSLSocket, String str, List<e80> list) {
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo3358a(sSLSocket, str, list);
            return;
        }
        if (str != null) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setHostname(sSLSocket, str);
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ga0.m11950a(list).toArray(new String[0]));
    }

    @Override // p000.ga0
    /* renamed from: a */
    public void mo3636a(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // p000.ga0
    @Nullable
    /* renamed from: b */
    public String mo3359b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo3359b(sSLSocket);
    }
}
