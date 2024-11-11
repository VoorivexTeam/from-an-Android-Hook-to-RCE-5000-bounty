package defpackage;

import ir.tapsell.sdk.g;
import ir.tapsell.sdk.models.SdkPlatformEnum;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;

/* loaded from: classes.dex */
public class e50 {
    private static String a;
    private static String b;
    private static SdkPlatformEnum c;

    public static String a() {
        String str = b;
        return str == null ? "" : str;
    }

    public static void a(SdkPlatformEnum sdkPlatformEnum) {
        c = sdkPlatformEnum;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(UserExtraInfo userExtraInfo) {
        userExtraInfo.setUserId(g.j().c());
    }

    public static void a(String str) {
        b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        String str = a;
        if (str == null || str.isEmpty()) {
            g();
        }
        return a;
    }

    public static void b(String str) {
        a = str;
        c(str);
    }

    public static String c() {
        return "1";
    }

    private static void c(String str) {
        g.j().c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        return "4.3.5-MTN";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e() {
        return "Android";
    }

    public static SdkPlatformEnum f() {
        return c;
    }

    private static void g() {
        a = g.j().d();
    }
}
