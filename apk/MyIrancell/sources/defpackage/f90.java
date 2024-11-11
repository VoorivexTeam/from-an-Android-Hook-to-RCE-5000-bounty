package defpackage;

import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class f90 {
    static {
        ByteString.encodeUtf8("\"\\");
        ByteString.encodeUtf8("\t ,=");
    }

    public static int a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static long a(i80 i80Var) {
        return a(i80Var.f());
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static long a(y70 y70Var) {
        return a(y70Var.a("Content-Length"));
    }

    public static void a(s70 s70Var, z70 z70Var, y70 y70Var) {
        if (s70Var == s70.a) {
            return;
        }
        List<r70> a = r70.a(z70Var, y70Var);
        if (a.isEmpty()) {
            return;
        }
        s70Var.a(z70Var, a);
    }

    public static int b(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static boolean b(i80 i80Var) {
        if (i80Var.m().e().equals("HEAD")) {
            return false;
        }
        int d = i80Var.d();
        return (((d >= 100 && d < 200) || d == 204 || d == 304) && a(i80Var) == -1 && !"chunked".equalsIgnoreCase(i80Var.a("Transfer-Encoding"))) ? false : true;
    }
}
