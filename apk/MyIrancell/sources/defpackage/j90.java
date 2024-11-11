package defpackage;

import java.net.Proxy;

/* loaded from: classes.dex */
public final class j90 {
    public static String a(g80 g80Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(g80Var.e());
        sb.append(' ');
        boolean b = b(g80Var, type);
        z70 g = g80Var.g();
        if (b) {
            sb.append(g);
        } else {
            sb.append(a(g));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public static String a(z70 z70Var) {
        String c = z70Var.c();
        String e = z70Var.e();
        if (e == null) {
            return c;
        }
        return c + '?' + e;
    }

    private static boolean b(g80 g80Var, Proxy.Type type) {
        return !g80Var.d() && type == Proxy.Type.HTTP;
    }
}
