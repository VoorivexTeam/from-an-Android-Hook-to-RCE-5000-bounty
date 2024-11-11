package p000;

import ir.tapsell.sdk.C2688g;

/* loaded from: classes.dex */
public class h50 {

    /* renamed from: a */
    private static final String f10395a;

    /* renamed from: b */
    private static final int f10396b;

    /* renamed from: c */
    private static Boolean f10397c;

    static {
        String str = s40.m15355b() ? "B4A_" : s40.m15356c() ? "ReactNative_" : s40.m15357d() ? "Xamarin_" : s40.m15358e() ? "UnrealEngine_" : "TAP_SDK_";
        f10395a = str;
        f10396b = str.length();
        f10397c = null;
    }

    /* renamed from: a */
    private static String m12117a(Class cls) {
        return m12131b(cls.getSimpleName());
    }

    /* renamed from: a */
    private static void m12118a(int i, String str, String str2, Throwable th) {
    }

    /* renamed from: a */
    public static void m12119a(Class cls, String str, Throwable th) {
        m12125a(false, 6, m12117a(cls), str, th);
    }

    /* renamed from: a */
    public static void m12120a(String str) {
        m12124a(false, 6, m12130b(), str);
    }

    /* renamed from: a */
    public static void m12121a(String str, String str2) {
        m12124a(false, 5, m12131b(str), str2);
    }

    /* renamed from: a */
    public static void m12122a(String str, String str2, Throwable th) {
        m12125a(false, 6, m12131b(str), str2, th);
    }

    /* renamed from: a */
    public static void m12123a(String str, Throwable th) {
        m12125a(false, 6, m12130b(), str, th);
    }

    /* renamed from: a */
    private static void m12124a(boolean z, int i, String str, String str2) {
        m12125a(z, i, str, str2, null);
    }

    /* renamed from: a */
    private static void m12125a(boolean z, int i, String str, String str2, Throwable th) {
        if (m12129a(z, i)) {
            int i2 = 0;
            while (i2 <= str2.length() / 1000) {
                int i3 = i2 * 1000;
                i2++;
                int i4 = i2 * 1000;
                if (i4 > str2.length()) {
                    i4 = str2.length();
                }
                m12118a(i, str, str2.substring(i3, i4), th);
            }
        }
    }

    /* renamed from: a */
    public static void m12126a(boolean z, String str) {
        m12124a(z, 3, m12130b(), str);
    }

    /* renamed from: a */
    public static void m12127a(boolean z, String str, String str2) {
        m12124a(z, 3, m12131b(str), str2);
    }

    /* renamed from: a */
    private static boolean m12128a() {
        if (f10397c == null) {
            f10397c = Boolean.valueOf(C2688g.m12913j().m12921b());
        }
        return f10397c.booleanValue();
    }

    /* renamed from: a */
    private static boolean m12129a(boolean z, int i) {
        if (i >= 5) {
            return true;
        }
        return m12128a() && !z && 3 <= i;
    }

    /* renamed from: b */
    private static String m12130b() {
        return m12131b("");
    }

    /* renamed from: b */
    private static String m12131b(String str) {
        StringBuilder sb;
        if (str.length() > 23 - f10396b) {
            sb = new StringBuilder();
            sb.append(f10395a);
            str = str.substring(0, (23 - f10396b) - 1);
        } else {
            sb = new StringBuilder();
            sb.append(f10395a);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m12132b(String str, String str2) {
        m12124a(false, 6, m12131b(str), str2);
    }

    /* renamed from: b */
    public static void m12133b(boolean z, String str) {
        m12124a(z, 4, m12130b(), str);
    }

    /* renamed from: b */
    public static void m12134b(boolean z, String str, String str2) {
        m12124a(z, 2, m12131b(str), str2);
    }

    /* renamed from: c */
    public static void m12135c(boolean z, String str, String str2) {
        m12124a(z, 4, m12131b(str), str2);
    }
}
