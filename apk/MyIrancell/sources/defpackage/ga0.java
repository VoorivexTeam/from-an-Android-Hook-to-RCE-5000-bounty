package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okio.Buffer;

/* loaded from: classes.dex */
public class ga0 {
    private static final ga0 a = b();
    private static final Logger b = Logger.getLogger(d80.class.getName());

    public static List<String> a(List<e80> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            e80 e80Var = list.get(i);
            if (e80Var != e80.HTTP_1_0) {
                arrayList.add(e80Var.toString());
            }
        }
        return arrayList;
    }

    private static ga0 b() {
        ca0 b2;
        ga0 b3 = ba0.b();
        if (b3 != null) {
            return b3;
        }
        if (d() && (b2 = ca0.b()) != null) {
            return b2;
        }
        da0 b4 = da0.b();
        if (b4 != null) {
            return b4;
        }
        ga0 b5 = ea0.b();
        return b5 != null ? b5 : new ga0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(List<e80> list) {
        Buffer buffer = new Buffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            e80 e80Var = list.get(i);
            if (e80Var != e80.HTTP_1_0) {
                buffer.writeByte(e80Var.toString().length());
                buffer.writeUtf8(e80Var.toString());
            }
        }
        return buffer.readByteArray();
    }

    public static ga0 c() {
        return a;
    }

    public static boolean d() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public Object a(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public SSLContext a() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public ka0 a(X509TrustManager x509TrustManager) {
        return new ia0(b(x509TrustManager));
    }

    public void a(int i, String str, @Nullable Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        a(5, str, (Throwable) obj);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, @Nullable String str, List<e80> list) {
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
    }

    @Nullable
    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public ma0 b(X509TrustManager x509TrustManager) {
        return new ja0(x509TrustManager.getAcceptedIssuers());
    }

    public boolean b(String str) {
        return true;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
