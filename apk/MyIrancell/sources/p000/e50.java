package p000;

import ir.tapsell.sdk.C2688g;
import ir.tapsell.sdk.models.SdkPlatformEnum;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;

/* loaded from: classes.dex */
public class e50 {

    /* renamed from: a */
    private static String f9933a;

    /* renamed from: b */
    private static String f9934b;

    /* renamed from: c */
    private static SdkPlatformEnum f9935c;

    /* renamed from: a */
    public static String m11542a() {
        String str = f9934b;
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static void m11543a(SdkPlatformEnum sdkPlatformEnum) {
        f9935c = sdkPlatformEnum;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11544a(UserExtraInfo userExtraInfo) {
        userExtraInfo.setUserId(C2688g.m12913j().m12922c());
    }

    /* renamed from: a */
    public static void m11545a(String str) {
        f9934b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m11546b() {
        String str = f9933a;
        if (str == null || str.isEmpty()) {
            m11553g();
        }
        return f9933a;
    }

    /* renamed from: b */
    public static void m11547b(String str) {
        f9933a = str;
        m11549c(str);
    }

    /* renamed from: c */
    public static String m11548c() {
        return "1";
    }

    /* renamed from: c */
    private static void m11549c(String str) {
        C2688g.m12913j().m12923c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m11550d() {
        return "4.3.5-MTN";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m11551e() {
        return "Android";
    }

    /* renamed from: f */
    public static SdkPlatformEnum m11552f() {
        return f9935c;
    }

    /* renamed from: g */
    private static void m11553g() {
        f9933a = C2688g.m12913j().m12925d();
    }
}
