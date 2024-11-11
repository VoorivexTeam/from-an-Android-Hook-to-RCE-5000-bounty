package p000;

import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class f90 {
    static {
        ByteString.encodeUtf8("\"\\");
        ByteString.encodeUtf8("\t ,=");
    }

    /* renamed from: a */
    public static int m11713a(String str, int i) {
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

    /* renamed from: a */
    public static int m11714a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static long m11715a(i80 i80Var) {
        return m11717a(i80Var.m12391f());
    }

    /* renamed from: a */
    private static long m11716a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: a */
    public static long m11717a(y70 y70Var) {
        return m11716a(y70Var.m16593a("Content-Length"));
    }

    /* renamed from: a */
    public static void m11718a(s70 s70Var, z70 z70Var, y70 y70Var) {
        if (s70Var == s70.f13037a) {
            return;
        }
        List<r70> m15215a = r70.m15215a(z70Var, y70Var);
        if (m15215a.isEmpty()) {
            return;
        }
        s70Var.mo15377a(z70Var, m15215a);
    }

    /* renamed from: b */
    public static int m11719b(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m11720b(i80 i80Var) {
        if (i80Var.m12397m().m11923e().equals("HEAD")) {
            return false;
        }
        int m12389d = i80Var.m12389d();
        return (((m12389d >= 100 && m12389d < 200) || m12389d == 204 || m12389d == 304) && m11715a(i80Var) == -1 && !"chunked".equalsIgnoreCase(i80Var.m12386a("Transfer-Encoding"))) ? false : true;
    }
}
