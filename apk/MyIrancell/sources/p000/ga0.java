package p000;

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

    /* renamed from: a */
    private static final ga0 f10274a = m11951b();

    /* renamed from: b */
    private static final Logger f10275b = Logger.getLogger(d80.class.getName());

    /* renamed from: a */
    public static List<String> m11950a(List<e80> list) {
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

    /* renamed from: b */
    private static ga0 m11951b() {
        ca0 m3634b;
        ga0 m3349b = ba0.m3349b();
        if (m3349b != null) {
            return m3349b;
        }
        if (m11954d() && (m3634b = ca0.m3634b()) != null) {
            return m3634b;
        }
        da0 m11347b = da0.m11347b();
        if (m11347b != null) {
            return m11347b;
        }
        ga0 m11573b = ea0.m11573b();
        return m11573b != null ? m11573b : new ga0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static byte[] m11952b(List<e80> list) {
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

    /* renamed from: c */
    public static ga0 m11953c() {
        return f10274a;
    }

    /* renamed from: d */
    public static boolean m11954d() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public Object mo3352a(String str) {
        if (f10275b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: a */
    public SSLContext mo3353a() {
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

    /* renamed from: a */
    public ka0 mo3354a(X509TrustManager x509TrustManager) {
        return new ia0(mo3360b(x509TrustManager));
    }

    /* renamed from: a */
    public void mo3355a(int i, String str, @Nullable Throwable th) {
        f10275b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: a */
    public void mo3356a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo3355a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public void mo3357a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public void mo11574a(SSLSocket sSLSocket) {
    }

    /* renamed from: a */
    public void mo3358a(SSLSocket sSLSocket, @Nullable String str, List<e80> list) {
    }

    /* renamed from: a */
    public void mo3636a(SSLSocketFactory sSLSocketFactory) {
    }

    @Nullable
    /* renamed from: b */
    public String mo3359b(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: b */
    public ma0 mo3360b(X509TrustManager x509TrustManager) {
        return new ja0(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: b */
    public boolean mo3361b(String str) {
        return true;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
