package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ea0 extends ga0 {

    /* renamed from: c */
    private final Method f9964c;

    /* renamed from: d */
    private final Method f9965d;

    /* renamed from: e */
    private final Method f9966e;

    /* renamed from: f */
    private final Class<?> f9967f;

    /* renamed from: g */
    private final Class<?> f9968g;

    /* renamed from: ea0$a */
    /* loaded from: classes.dex */
    private static class C2424a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f9969a;

        /* renamed from: b */
        boolean f9970b;

        /* renamed from: c */
        String f9971c;

        C2424a(List<String> list) {
            this.f9969a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = o80.f12428b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f9970b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f9969a;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f9971c = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj2 = this.f9969a.get(0);
                    break;
                }
                if (this.f9969a.contains(list.get(i))) {
                    obj2 = list.get(i);
                    break;
                }
                i++;
            }
            String str = (String) obj2;
            this.f9971c = str;
            return str;
        }
    }

    ea0(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f9964c = method;
        this.f9965d = method2;
        this.f9966e = method3;
        this.f9967f = cls;
        this.f9968g = cls2;
    }

    /* renamed from: b */
    public static ga0 m11573b() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new ea0(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // p000.ga0
    /* renamed from: a */
    public void mo11574a(SSLSocket sSLSocket) {
        try {
            this.f9966e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw o80.m14444a("unable to remove alpn", (Exception) e);
        }
    }

    @Override // p000.ga0
    /* renamed from: a */
    public void mo3358a(SSLSocket sSLSocket, String str, List<e80> list) {
        try {
            this.f9964c.invoke(null, sSLSocket, Proxy.newProxyInstance(ga0.class.getClassLoader(), new Class[]{this.f9967f, this.f9968g}, new C2424a(ga0.m11950a(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw o80.m14444a("unable to set alpn", (Exception) e);
        }
    }

    @Override // p000.ga0
    @Nullable
    /* renamed from: b */
    public String mo3359b(SSLSocket sSLSocket) {
        try {
            C2424a c2424a = (C2424a) Proxy.getInvocationHandler(this.f9965d.invoke(null, sSLSocket));
            if (!c2424a.f9970b && c2424a.f9971c == null) {
                ga0.m11953c().mo3355a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (c2424a.f9970b) {
                return null;
            }
            return c2424a.f9971c;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw o80.m14444a("unable to get selected protocol", (Exception) e);
        }
    }
}
