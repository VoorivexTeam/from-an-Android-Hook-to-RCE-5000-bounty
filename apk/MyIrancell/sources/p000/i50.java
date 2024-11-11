package p000;

import ir.tapsell.sdk.C2688g;

@Deprecated
/* loaded from: classes.dex */
public class i50 {

    /* renamed from: a */
    private static final String f10567a;

    /* renamed from: b */
    private static Boolean f10568b;

    static {
        f10567a = s40.m15355b() ? "B4A" : s40.m15356c() ? "ReactNative" : s40.m15357d() ? "Xamarin" : s40.m15358e() ? "UnrealEngine" : "Tapsell";
        f10568b = null;
    }

    /* renamed from: a */
    public static void m12368a(String str) {
        m12369a(f10567a, str);
    }

    /* renamed from: a */
    public static void m12369a(String str, String str2) {
        if (m12371a()) {
            int i = 0;
            while (i <= str2.length() / 1000) {
                int i2 = i * 1000;
                i++;
                int i3 = i * 1000;
                if (i3 > str2.length()) {
                    i3 = str2.length();
                }
                str2.substring(i2, i3);
            }
        }
    }

    /* renamed from: a */
    public static void m12370a(boolean z) {
        f10568b = Boolean.valueOf(z);
    }

    /* renamed from: a */
    private static boolean m12371a() {
        if (f10568b == null) {
            f10568b = Boolean.valueOf(C2688g.m12913j().m12921b());
        }
        return f10568b.booleanValue();
    }

    /* renamed from: b */
    public static void m12372b(String str) {
        m12373b(f10567a, str);
    }

    /* renamed from: b */
    public static void m12373b(String str, String str2) {
        m12371a();
    }

    /* renamed from: c */
    public static void m12374c(String str) {
        m12375c(f10567a, str);
    }

    /* renamed from: c */
    public static void m12375c(String str, String str2) {
        m12371a();
    }

    /* renamed from: d */
    public static void m12376d(String str) {
        m12377d(f10567a, str);
    }

    /* renamed from: d */
    public static void m12377d(String str, String str2) {
        m12371a();
    }
}
