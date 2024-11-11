package ir.tapsell.sdk.utils;

import java.io.File;

/* loaded from: classes.dex */
public class f {
    private static final char a;
    private static final char b;

    static {
        Character.toString('.');
        a = File.separatorChar;
        b = a() ? '/' : '\\';
    }

    public static int a(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    static boolean a() {
        return a == '\\';
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        if (a() && str.indexOf(58, h(str)) != -1) {
            throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (a(str) > lastIndexOf) {
            return -1;
        }
        return lastIndexOf;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        g(str);
        return str.substring(a(str) + 1);
    }

    public static String d(String str) {
        return f(c(str));
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        int b2 = b(str);
        return b2 == -1 ? "" : str.substring(b2 + 1);
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        g(str);
        int b2 = b(str);
        return b2 == -1 ? str : str.substring(0, b2);
    }

    private static void g(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 0) {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    private static int h(String str) {
        int lastIndexOf = str.lastIndexOf(a);
        int lastIndexOf2 = str.lastIndexOf(b);
        if (lastIndexOf != -1) {
            return lastIndexOf2 == -1 ? lastIndexOf + 1 : Math.max(lastIndexOf, lastIndexOf2) + 1;
        }
        if (lastIndexOf2 == -1) {
            return 0;
        }
        return lastIndexOf2 + 1;
    }
}
