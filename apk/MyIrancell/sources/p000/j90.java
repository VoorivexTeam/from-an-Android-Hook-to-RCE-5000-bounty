package p000;

import java.net.Proxy;

/* loaded from: classes.dex */
public final class j90 {
    /* renamed from: a */
    public static String m13429a(g80 g80Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(g80Var.m11923e());
        sb.append(' ');
        boolean m13431b = m13431b(g80Var, type);
        z70 m11925g = g80Var.m11925g();
        if (m13431b) {
            sb.append(m11925g);
        } else {
            sb.append(m13430a(m11925g));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m13430a(z70 z70Var) {
        String m16808c = z70Var.m16808c();
        String m16810e = z70Var.m16810e();
        if (m16810e == null) {
            return m16808c;
        }
        return m16808c + '?' + m16810e;
    }

    /* renamed from: b */
    private static boolean m13431b(g80 g80Var, Proxy.Type type) {
        return !g80Var.m11922d() && type == Proxy.Type.HTTP;
    }
}
