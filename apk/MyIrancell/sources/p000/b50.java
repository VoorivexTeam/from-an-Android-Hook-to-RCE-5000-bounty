package p000;

import ir.tapsell.sdk.networkcacheutils.C2748b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b50 {
    /* renamed from: a */
    public static Map<String, String> m3323a() {
        HashMap hashMap = new HashMap();
        hashMap.put("device-model", z40.m16734K().m16760q());
        hashMap.put("device-os", z40.m16734K().m16761r());
        hashMap.put("t-network-type", z40.m16734K().m16755l());
        hashMap.put("app-package-name", z40.m16734K().m16753j());
        hashMap.put("device-os-version", String.valueOf(z40.m16734K().m16765v()));
        hashMap.put("t-network-cache-capacity", z40.m16734K().m16756m());
        hashMap.put("device-client-date", String.valueOf(System.currentTimeMillis()));
        hashMap.put("sdk-version", "4.3.5-MTN");
        hashMap.put("dev-platform", "Android");
        hashMap.put("device-imei", z40.m16734K().m16754k());
        hashMap.put("User-Agent", z40.m16734K().m16751h());
        hashMap.put("developer-key", z40.m16734K().m16758o());
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        hashMap.put("sdk-platform", z40.m16734K().m16759p());
        if (m3325c() != null) {
            hashMap.put("authorization", m3325c());
        }
        if (z40.m16734K().m16747d() != null) {
            hashMap.put("t-user-id", z40.m16734K().m16747d());
        }
        if (z40.m16734K().m16748e() != null) {
            hashMap.put("customer-user-id", z40.m16734K().m16748e());
        }
        hashMap.put("t-network-bandwidth", String.valueOf(C2748b.m13089c().m13090a()));
        return hashMap;
    }

    /* renamed from: b */
    public static Map<String, String> m3324b() {
        HashMap hashMap = new HashMap();
        hashMap.put("device-model", z40.m16734K().m16760q());
        hashMap.put("device-os", z40.m16734K().m16761r());
        hashMap.put("t-network-type", z40.m16734K().m16755l());
        hashMap.put("app-package-name", z40.m16734K().m16753j());
        hashMap.put("device-os-version", String.valueOf(z40.m16734K().m16765v()));
        hashMap.put("t-network-cache-capacity", z40.m16734K().m16756m());
        hashMap.put("device-client-date", String.valueOf(System.currentTimeMillis()));
        hashMap.put("sdk-version", "4.3.5-MTN");
        hashMap.put("dev-platform", "Android");
        hashMap.put("device-imei", z40.m16734K().m16754k());
        hashMap.put("developer-key", z40.m16734K().m16758o());
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        hashMap.put("sdk-platform", z40.m16734K().m16759p());
        if (m3325c() != null) {
            hashMap.put("authorization", m3325c());
        }
        if (z40.m16734K().m16747d() != null) {
            hashMap.put("t-user-id", z40.m16734K().m16747d());
        }
        if (z40.m16734K().m16748e() != null) {
            hashMap.put("customer-user-id", z40.m16734K().m16748e());
        }
        hashMap.put("t-network-bandwidth", String.valueOf(C2748b.m13089c().m13090a()));
        return hashMap;
    }

    /* renamed from: c */
    public static String m3325c() {
        String m16749f = z40.m16734K().m16749f();
        if (m16749f == null) {
            return "";
        }
        return "bearer " + m16749f;
    }
}
