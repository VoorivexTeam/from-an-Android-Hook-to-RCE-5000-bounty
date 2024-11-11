package p000;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ba0 extends ga0 {

    /* renamed from: c */
    private final fa0<Socket> f2753c;

    /* renamed from: d */
    private final fa0<Socket> f2754d;

    /* renamed from: e */
    private final fa0<Socket> f2755e;

    /* renamed from: f */
    private final fa0<Socket> f2756f;

    /* renamed from: g */
    private final C0458c f2757g = C0458c.m3364a();

    /* renamed from: ba0$a */
    /* loaded from: classes.dex */
    static final class C0456a extends ka0 {

        /* renamed from: a */
        private final Object f2758a;

        /* renamed from: b */
        private final Method f2759b;

        C0456a(Object obj, Method method) {
            this.f2758a = obj;
            this.f2759b = method;
        }

        @Override // p000.ka0
        /* renamed from: a */
        public List<Certificate> mo3362a(List<Certificate> list, String str) {
            try {
                return (List) this.f2759b.invoke(this.f2758a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0456a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: ba0$b */
    /* loaded from: classes.dex */
    static final class C0457b implements ma0 {

        /* renamed from: a */
        private final X509TrustManager f2760a;

        /* renamed from: b */
        private final Method f2761b;

        C0457b(X509TrustManager x509TrustManager, Method method) {
            this.f2761b = method;
            this.f2760a = x509TrustManager;
        }

        @Override // p000.ma0
        /* renamed from: a */
        public X509Certificate mo3363a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f2761b.invoke(this.f2760a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw o80.m14444a("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0457b)) {
                return false;
            }
            C0457b c0457b = (C0457b) obj;
            return this.f2760a.equals(c0457b.f2760a) && this.f2761b.equals(c0457b.f2761b);
        }

        public int hashCode() {
            return this.f2760a.hashCode() + (this.f2761b.hashCode() * 31);
        }
    }

    /* renamed from: ba0$c */
    /* loaded from: classes.dex */
    static final class C0458c {

        /* renamed from: a */
        private final Method f2762a;

        /* renamed from: b */
        private final Method f2763b;

        /* renamed from: c */
        private final Method f2764c;

        C0458c(Method method, Method method2, Method method3) {
            this.f2762a = method;
            this.f2763b = method2;
            this.f2764c = method3;
        }

        /* renamed from: a */
        static C0458c m3364a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new C0458c(method3, method2, method);
        }

        /* renamed from: a */
        Object m3365a(String str) {
            Method method = this.f2762a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f2763b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* renamed from: a */
        boolean m3366a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f2764c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    ba0(Class<?> cls, fa0<Socket> fa0Var, fa0<Socket> fa0Var2, fa0<Socket> fa0Var3, fa0<Socket> fa0Var4) {
        this.f2753c = fa0Var;
        this.f2754d = fa0Var2;
        this.f2755e = fa0Var3;
        this.f2756f = fa0Var4;
    }

    /* renamed from: a */
    private boolean m3348a(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo3361b(str);
        }
    }

    /* renamed from: b */
    public static ga0 m3349b() {
        Class<?> cls;
        fa0 fa0Var;
        fa0 fa0Var2;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            fa0 fa0Var3 = new fa0(null, "setUseSessionTickets", Boolean.TYPE);
            fa0 fa0Var4 = new fa0(null, "setHostname", String.class);
            if (m3351e()) {
                fa0 fa0Var5 = new fa0(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                fa0Var2 = new fa0(null, "setAlpnProtocols", byte[].class);
                fa0Var = fa0Var5;
            } else {
                fa0Var = null;
                fa0Var2 = null;
            }
            return new ba0(cls2, fa0Var3, fa0Var4, fa0Var, fa0Var2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    private boolean m3350b(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m3348a(str, cls, obj);
        }
    }

    /* renamed from: e */
    private static boolean m3351e() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // p000.ga0
    /* renamed from: a */
    public Object mo3352a(String str) {
        return this.f2757g.m3365a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 22) goto L11;
     */
    @Override // p000.ga0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public javax.net.ssl.SSLContext mo3353a() {
        /*
            r3 = this;
            r0 = 1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L10
            r2 = 16
            if (r1 < r2) goto Le
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L10
            r2 = 22
            if (r1 >= r2) goto Le
            goto L11
        Le:
            r0 = 0
            goto L11
        L10:
        L11:
            if (r0 == 0) goto L1a
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L1a
            return r0
        L1a:
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L21
            return r0
        L21:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ba0.mo3353a():javax.net.ssl.SSLContext");
    }

    @Override // p000.ga0
    /* renamed from: a */
    public ka0 mo3354a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0456a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo3354a(x509TrustManager);
        }
    }

    @Override // p000.ga0
    /* renamed from: a */
    public void mo3355a(int i, String str, @Nullable Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i3 = min;
                }
            }
            i3 = min + 1;
        }
    }

    @Override // p000.ga0
    /* renamed from: a */
    public void mo3356a(String str, Object obj) {
        if (this.f2757g.m3366a(obj)) {
            return;
        }
        mo3355a(5, str, (Throwable) null);
    }

    @Override // p000.ga0
    /* renamed from: a */
    public void mo3357a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!o80.m14460a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // p000.ga0
    /* renamed from: a */
    public void mo3358a(SSLSocket sSLSocket, String str, List<e80> list) {
        if (str != null) {
            this.f2753c.m11744c(sSLSocket, true);
            this.f2754d.m11744c(sSLSocket, str);
        }
        fa0<Socket> fa0Var = this.f2756f;
        if (fa0Var == null || !fa0Var.m11742a((fa0<Socket>) sSLSocket)) {
            return;
        }
        this.f2756f.m11745d(sSLSocket, ga0.m11952b(list));
    }

    @Override // p000.ga0
    @Nullable
    /* renamed from: b */
    public String mo3359b(SSLSocket sSLSocket) {
        byte[] bArr;
        fa0<Socket> fa0Var = this.f2755e;
        if (fa0Var == null || !fa0Var.m11742a((fa0<Socket>) sSLSocket) || (bArr = (byte[]) this.f2755e.m11745d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, o80.f12435i);
    }

    @Override // p000.ga0
    /* renamed from: b */
    public ma0 mo3360b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C0457b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo3360b(x509TrustManager);
        }
    }

    @Override // p000.ga0
    /* renamed from: b */
    public boolean mo3361b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m3350b(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo3361b(str);
        } catch (IllegalAccessException e) {
            e = e;
            throw o80.m14444a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw o80.m14444a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw o80.m14444a("unable to determine cleartext support", e);
        }
    }
}
