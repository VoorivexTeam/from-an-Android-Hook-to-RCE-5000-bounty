package p000;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class q60 extends ProxySelector {

    /* renamed from: d */
    private static final List<Proxy> f12698d = Arrays.asList(Proxy.NO_PROXY);

    /* renamed from: a */
    private final ProxySelector f12699a;

    /* renamed from: b */
    private final String f12700b;

    /* renamed from: c */
    private final int f12701c;

    q60(ProxySelector proxySelector, String str, int i) {
        t60.m15549a(proxySelector);
        this.f12699a = proxySelector;
        t60.m15549a(str);
        this.f12700b = str;
        this.f12701c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m14956a(String str, int i) {
        ProxySelector.setDefault(new q60(ProxySelector.getDefault(), str, i));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f12699a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return this.f12700b.equals(uri.getHost()) && this.f12701c == uri.getPort() ? f12698d : this.f12699a.select(uri);
    }
}
