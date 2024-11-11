package ir.metrix.sdk;

/* loaded from: classes.dex */
public class ab {
    private static final int a = 7;
    private static int b = 4;
    private static Boolean c = true;

    public static void a(int i) {
        b = i;
    }

    private static void a(int i, String str, String str2, Throwable th) {
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
        a(false, 5, b(), str, th);
    }

    public static void a(boolean z) {
        c = Boolean.valueOf(z);
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
        a(z, 4, b(), str);
    }

    public static void a(boolean z, String str, String str2) {
        a(z, 3, b(str), str2);
    }

    private static boolean a() {
        return c.booleanValue();
    }

    private static boolean a(boolean z, int i) {
        if (i >= 5) {
            return true;
        }
        return a() && !z && b <= i;
    }

    private static String b() {
        return b("");
    }

    private static String b(String str) {
        StringBuilder sb;
        if (str.length() > 23 - a) {
            sb = new StringBuilder();
            sb.append("MX_SDK_");
            str = str.substring(0, (23 - a) - 1);
        } else {
            sb = new StringBuilder();
            sb.append("MX_SDK_");
        }
        sb.append(str);
        return sb.toString();
    }

    public static void b(String str, String str2) {
        a(false, 6, b(str), str2);
    }

    public static void b(String str, Throwable th) {
        a(false, 6, b(), str, th);
    }

    public static void b(boolean z, String str, String str2) {
        a(z, 2, b(str), str2);
    }

    public static void c(boolean z, String str, String str2) {
        a(z, 4, b(str), str2);
    }
}
