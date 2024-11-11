package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class q60 extends ProxySelector {
    private static final List<Proxy> d = Arrays.asList(Proxy.NO_PROXY);
    private final ProxySelector a;
    private final String b;
    private final int c;

    q60(ProxySelector proxySelector, String str, int i) {
        t60.a(proxySelector);
        this.a = proxySelector;
        t60.a(str);
        this.b = str;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, int i) {
        ProxySelector.setDefault(new q60(ProxySelector.getDefault(), str, i));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return this.b.equals(uri.getHost()) && this.c == uri.getPort() ? d : this.a.select(uri);
    }
}
