package defpackage;

import ir.tapsell.sdk.networkcacheutils.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b50 {
    public static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("device-model", z40.K().q());
        hashMap.put("device-os", z40.K().r());
        hashMap.put("t-network-type", z40.K().l());
        hashMap.put("app-package-name", z40.K().j());
        hashMap.put("device-os-version", String.valueOf(z40.K().v()));
        hashMap.put("t-network-cache-capacity", z40.K().m());
        hashMap.put("device-client-date", String.valueOf(System.currentTimeMillis()));
        hashMap.put("sdk-version", "4.3.5-MTN");
        hashMap.put("dev-platform", "Android");
        hashMap.put("device-imei", z40.K().k());
        hashMap.put("User-Agent", z40.K().h());
        hashMap.put("developer-key", z40.K().o());
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        hashMap.put("sdk-platform", z40.K().p());
        if (c() != null) {
            hashMap.put("authorization", c());
        }
        if (z40.K().d() != null) {
            hashMap.put("t-user-id", z40.K().d());
        }
        if (z40.K().e() != null) {
            hashMap.put("customer-user-id", z40.K().e());
        }
        hashMap.put("t-network-bandwidth", String.valueOf(b.c().a()));
        return hashMap;
    }

    public static Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("device-model", z40.K().q());
        hashMap.put("device-os", z40.K().r());
        hashMap.put("t-network-type", z40.K().l());
        hashMap.put("app-package-name", z40.K().j());
        hashMap.put("device-os-version", String.valueOf(z40.K().v()));
        hashMap.put("t-network-cache-capacity", z40.K().m());
        hashMap.put("device-client-date", String.valueOf(System.currentTimeMillis()));
        hashMap.put("sdk-version", "4.3.5-MTN");
        hashMap.put("dev-platform", "Android");
        hashMap.put("device-imei", z40.K().k());
        hashMap.put("developer-key", z40.K().o());
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        hashMap.put("sdk-platform", z40.K().p());
        if (c() != null) {
            hashMap.put("authorization", c());
        }
        if (z40.K().d() != null) {
            hashMap.put("t-user-id", z40.K().d());
        }
        if (z40.K().e() != null) {
            hashMap.put("customer-user-id", z40.K().e());
        }
        hashMap.put("t-network-bandwidth", String.valueOf(b.c().a()));
        return hashMap;
    }

    public static String c() {
        String f = z40.K().f();
        if (f == null) {
            return "";
        }
        return "bearer " + f;
    }
}
