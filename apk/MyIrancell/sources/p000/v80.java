package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class v80 {

    /* renamed from: a */
    private final List<q70> f13626a;

    /* renamed from: b */
    private int f13627b = 0;

    /* renamed from: c */
    private boolean f13628c;

    /* renamed from: d */
    private boolean f13629d;

    public v80(List<q70> list) {
        this.f13626a = list;
    }

    /* renamed from: b */
    private boolean m15970b(SSLSocket sSLSocket) {
        for (int i = this.f13627b; i < this.f13626a.size(); i++) {
            if (this.f13626a.get(i).m14983a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public q70 m15971a(SSLSocket sSLSocket) {
        q70 q70Var;
        int i = this.f13627b;
        int size = this.f13626a.size();
        while (true) {
            if (i >= size) {
                q70Var = null;
                break;
            }
            q70Var = this.f13626a.get(i);
            i++;
            if (q70Var.m14983a(sSLSocket)) {
                this.f13627b = i;
                break;
            }
        }
        if (q70Var != null) {
            this.f13628c = m15970b(sSLSocket);
            m80.f12098a.mo11326a(q70Var, sSLSocket, this.f13629d);
            return q70Var;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f13629d + ", modes=" + this.f13626a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* renamed from: a */
    public boolean m15972a(IOException iOException) {
        this.f13629d = true;
        if (!this.f13628c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
