package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class da0 extends ga0 {

    /* renamed from: c */
    final Method f9787c;

    /* renamed from: d */
    final Method f9788d;

    da0(Method method, Method method2) {
        this.f9787c = method;
        this.f9788d = method2;
    }

    /* renamed from: b */
    public static da0 m11347b() {
        try {
            return new da0(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // p000.ga0
    /* renamed from: a */
    public void mo3358a(SSLSocket sSLSocket, String str, List<e80> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> m11950a = ga0.m11950a(list);
            this.f9787c.invoke(sSLParameters, m11950a.toArray(new String[m11950a.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw o80.m14444a("unable to set ssl parameters", (Exception) e);
        }
    }

    @Override // p000.ga0
    @Nullable
    /* renamed from: b */
    public String mo3359b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f9788d.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw o80.m14444a("unable to get selected protocols", (Exception) e);
        }
    }
}
