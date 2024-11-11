package defpackage;

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
    private final List<q70> a;
    private int b = 0;
    private boolean c;
    private boolean d;

    public v80(List<q70> list) {
        this.a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.b; i < this.a.size(); i++) {
            if (this.a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public q70 a(SSLSocket sSLSocket) {
        q70 q70Var;
        int i = this.b;
        int size = this.a.size();
        while (true) {
            if (i >= size) {
                q70Var = null;
                break;
            }
            q70Var = this.a.get(i);
            i++;
            if (q70Var.a(sSLSocket)) {
                this.b = i;
                break;
            }
        }
        if (q70Var != null) {
            this.c = b(sSLSocket);
            m80.a.a(q70Var, sSLSocket, this.d);
            return q70Var;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + this.a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        this.d = true;
        if (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
