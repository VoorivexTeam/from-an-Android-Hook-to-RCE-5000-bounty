package ir.metrix.sdk;

/* renamed from: ir.metrix.sdk.ab */
/* loaded from: classes.dex */
public class C2610ab {

    /* renamed from: a */
    private static final int f10678a = 7;

    /* renamed from: b */
    private static int f10679b = 4;

    /* renamed from: c */
    private static Boolean f10680c = true;

    /* renamed from: a */
    public static void m12514a(int i) {
        f10679b = i;
    }

    /* renamed from: a */
    private static void m12515a(int i, String str, String str2, Throwable th) {
    }

    /* renamed from: a */
    public static void m12516a(String str) {
        m12521a(false, 6, m12527b(), str);
    }

    /* renamed from: a */
    public static void m12517a(String str, String str2) {
        m12521a(false, 5, m12528b(str), str2);
    }

    /* renamed from: a */
    public static void m12518a(String str, String str2, Throwable th) {
        m12522a(false, 6, m12528b(str), str2, th);
    }

    /* renamed from: a */
    public static void m12519a(String str, Throwable th) {
        m12522a(false, 5, m12527b(), str, th);
    }

    /* renamed from: a */
    public static void m12520a(boolean z) {
        f10680c = Boolean.valueOf(z);
    }

    /* renamed from: a */
    private static void m12521a(boolean z, int i, String str, String str2) {
        m12522a(z, i, str, str2, null);
    }

    /* renamed from: a */
    private static void m12522a(boolean z, int i, String str, String str2, Throwable th) {
        if (m12526a(z, i)) {
            int i2 = 0;
            while (i2 <= str2.length() / 1000) {
                int i3 = i2 * 1000;
                i2++;
                int i4 = i2 * 1000;
                if (i4 > str2.length()) {
                    i4 = str2.length();
                }
                m12515a(i, str, str2.substring(i3, i4), th);
            }
        }
    }

    /* renamed from: a */
    public static void m12523a(boolean z, String str) {
        m12521a(z, 4, m12527b(), str);
    }

    /* renamed from: a */
    public static void m12524a(boolean z, String str, String str2) {
        m12521a(z, 3, m12528b(str), str2);
    }

    /* renamed from: a */
    private static boolean m12525a() {
        return f10680c.booleanValue();
    }

    /* renamed from: a */
    private static boolean m12526a(boolean z, int i) {
        if (i >= 5) {
            return true;
        }
        return m12525a() && !z && f10679b <= i;
    }

    /* renamed from: b */
    private static String m12527b() {
        return m12528b("");
    }

    /* renamed from: b */
    private static String m12528b(String str) {
        StringBuilder sb;
        if (str.length() > 23 - f10678a) {
            sb = new StringBuilder();
            sb.append("MX_SDK_");
            str = str.substring(0, (23 - f10678a) - 1);
        } else {
            sb = new StringBuilder();
            sb.append("MX_SDK_");
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m12529b(String str, String str2) {
        m12521a(false, 6, m12528b(str), str2);
    }

    /* renamed from: b */
    public static void m12530b(String str, Throwable th) {
        m12522a(false, 6, m12527b(), str, th);
    }

    /* renamed from: b */
    public static void m12531b(boolean z, String str, String str2) {
        m12521a(z, 2, m12528b(str), str2);
    }

    /* renamed from: c */
    public static void m12532c(boolean z, String str, String str2) {
        m12521a(z, 4, m12528b(str), str2);
    }
}
