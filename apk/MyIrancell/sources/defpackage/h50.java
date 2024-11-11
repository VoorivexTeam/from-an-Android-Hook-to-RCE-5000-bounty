package defpackage;

import ir.tapsell.sdk.g;

/* loaded from: classes.dex */
public class h50 {
    private static final String a;
    private static final int b;
    private static Boolean c;

    static {
        String str = s40.b() ? "B4A_" : s40.c() ? "ReactNative_" : s40.d() ? "Xamarin_" : s40.e() ? "UnrealEngine_" : "TAP_SDK_";
        a = str;
        b = str.length();
        c = null;
    }

    private static String a(Class cls) {
        return b(cls.getSimpleName());
    }

    private static void a(int i, String str, String str2, Throwable th) {
    }

    public static void a(Class cls, String str, Throwable th) {
        a(false, 6, a(cls), str, th);
    }

    public static void a(String str) {
        a(false, 6, b(), str);
    }

    public static void a(String str, String str2) {
        a(false, 5, b(str), str2);
    }

    public static void a(String str, String str2, Throwable th) {
        a(false, 6, b(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        a(false, 6, b(), str, th);
    }

    private static void a(boolean z, int i, String str, String str2) {
        a(z, i, str, str2, null);
    }

    private static void a(boolean z, int i, String str, String str2, Throwable th) {
        if (a(z, i)) {
            int i2 = 0;
            while (i2 <= str2.length() / 1000) {
                int i3 = i2 * 1000;
                i2++;
                int i4 = i2 * 1000;
                if (i4 > str2.length()) {
                    i4 = str2.length();
                }
                a(i, str, str2.substring(i3, i4), th);
            }
        }
    }

    public static void a(boolean z, String str) {
        a(z, 3, b(), str);
    }

    public static void a(boolean z, String str, String str2) {
        a(z, 3, b(str), str2);
    }

    private static boolean a() {
        if (c == null) {
            c = Boolean.valueOf(g.j().b());
        }
        return c.booleanValue();
    }

    private static boolean a(boolean z, int i) {
        if (i >= 5) {
            return true;
        }
        return a() && !z && 3 <= i;
    }

    private static String b() {
        return b("");
    }

    private static String b(String str) {
        StringBuilder sb;
        if (str.length() > 23 - b) {
            sb = new StringBuilder();
            sb.append(a);
            str = str.substring(0, (23 - b) - 1);
        } else {
            sb = new StringBuilder();
            sb.append(a);
        }
        sb.append(str);
        return sb.toString();
    }

    public static void b(String str, String str2) {
        a(false, 6, b(str), str2);
    }

    public static void b(boolean z, String str) {
        a(z, 4, b(), str);
    }

    public static void b(boolean z, String str, String str2) {
        a(z, 2, b(str), str2);
    }

    public static void c(boolean z, String str, String str2) {
        a(z, 4, b(str), str2);
    }
}
