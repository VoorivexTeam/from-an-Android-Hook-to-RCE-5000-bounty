package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.y9 */
/* loaded from: classes.dex */
final class C1948y9 extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f8198a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1948y9() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C1948y9(SSLSocketFactory sSLSocketFactory) {
        this.f8198a = sSLSocketFactory;
    }

    /* renamed from: a */
    private final SSLSocket m9891a(SSLSocket sSLSocket) {
        return new C1671aa(this, sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return m9891a((SSLSocket) this.f8198a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return m9891a((SSLSocket) this.f8198a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m9891a((SSLSocket) this.f8198a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m9891a((SSLSocket) this.f8198a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m9891a((SSLSocket) this.f8198a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m9891a((SSLSocket) this.f8198a.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f8198a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f8198a.getSupportedCipherSuites();
    }
}
