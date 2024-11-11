package ir.tapsell.sdk.utils;

import java.io.File;

/* renamed from: ir.tapsell.sdk.utils.f */
/* loaded from: classes.dex */
public class C2764f {

    /* renamed from: a */
    private static final char f11265a;

    /* renamed from: b */
    private static final char f11266b;

    static {
        Character.toString('.');
        f11265a = File.separatorChar;
        f11266b = m13156a() ? '/' : '\\';
    }

    /* renamed from: a */
    public static int m13155a(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    /* renamed from: a */
    static boolean m13156a() {
        return f11265a == '\\';
    }

    /* renamed from: b */
    public static int m13157b(String str) {
        if (str == null) {
            return -1;
        }
        if (m13156a() && str.indexOf(58, m13163h(str)) != -1) {
            throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (m13155a(str) > lastIndexOf) {
            return -1;
        }
        return lastIndexOf;
    }

    /* renamed from: c */
    public static String m13158c(String str) {
        if (str == null) {
            return null;
        }
        m13162g(str);
        return str.substring(m13155a(str) + 1);
    }

    /* renamed from: d */
    public static String m13159d(String str) {
        return m13161f(m13158c(str));
    }

    /* renamed from: e */
    public static String m13160e(String str) {
        if (str == null) {
            return null;
        }
        int m13157b = m13157b(str);
        return m13157b == -1 ? "" : str.substring(m13157b + 1);
    }

    /* renamed from: f */
    public static String m13161f(String str) {
        if (str == null) {
            return null;
        }
        m13162g(str);
        int m13157b = m13157b(str);
        return m13157b == -1 ? str : str.substring(0, m13157b);
    }

    /* renamed from: g */
    private static void m13162g(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 0) {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    /* renamed from: h */
    private static int m13163h(String str) {
        int lastIndexOf = str.lastIndexOf(f11265a);
        int lastIndexOf2 = str.lastIndexOf(f11266b);
        if (lastIndexOf != -1) {
            return lastIndexOf2 == -1 ? lastIndexOf + 1 : Math.max(lastIndexOf, lastIndexOf2) + 1;
        }
        if (lastIndexOf2 == -1) {
            return 0;
        }
        return lastIndexOf2 + 1;
    }
}
