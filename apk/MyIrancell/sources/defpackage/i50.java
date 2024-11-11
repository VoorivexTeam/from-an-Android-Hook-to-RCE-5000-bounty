package defpackage;

import ir.tapsell.sdk.g;

@Deprecated
/* loaded from: classes.dex */
public class i50 {
    private static final String a;
    private static Boolean b;

    static {
        a = s40.b() ? "B4A" : s40.c() ? "ReactNative" : s40.d() ? "Xamarin" : s40.e() ? "UnrealEngine" : "Tapsell";
        b = null;
    }

    public static void a(String str) {
        a(a, str);
    }

    public static void a(String str, String str2) {
        if (a()) {
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

    public static void a(boolean z) {
        b = Boolean.valueOf(z);
    }

    private static boolean a() {
        if (b == null) {
            b = Boolean.valueOf(g.j().b());
        }
        return b.booleanValue();
    }

    public static void b(String str) {
        b(a, str);
    }

    public static void b(String str, String str2) {
        a();
    }

    public static void c(String str) {
        c(a, str);
    }

    public static void c(String str, String str2) {
        a();
    }

    public static void d(String str) {
        d(a, str);
    }

    public static void d(String str, String str2) {
        a();
    }
}
