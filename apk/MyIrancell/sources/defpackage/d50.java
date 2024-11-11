package defpackage;

import ir.tapsell.sdk.networkcacheutils.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d50 {
    public static Map<String, String> a(int i, int i2) {
        HashMap hashMap = new HashMap();
        z40 K = z40.K();
        hashMap.put("secretKey", K.o());
        hashMap.put("targetPlatform", K.s());
        hashMap.put("dev-platform", K.t());
        hashMap.put("app-package-name", K.j());
        hashMap.put("vastVersion", String.valueOf(i));
        hashMap.put("device-imei", K.k());
        hashMap.put("osAdvertisingId", K.u());
        hashMap.put("device-model", K.q());
        hashMap.put("osVersion", String.valueOf(K.v()));
        hashMap.put("deviceManufacturer", K.w());
        hashMap.put("networkType", K.l());
        hashMap.put("carrier", K.x());
        hashMap.put("sdkVersion", K.y());
        hashMap.put("osId", K.z());
        if (K.A() != null) {
            hashMap.put("limitAdTrackingEnabled", String.valueOf(K.A()));
        }
        hashMap.put("appVersionCode", String.valueOf(K.B()));
        hashMap.put("appVersionName", K.C());
        hashMap.put("dataAvailability", String.valueOf(K.D()));
        hashMap.put("deviceBrand", K.E());
        hashMap.put("deviceLanguage", K.F());
        hashMap.put("screenDensity", String.valueOf(K.G()));
        hashMap.put("screenHeight", String.valueOf(K.a()));
        hashMap.put("screenOrientation", String.valueOf(K.b()));
        hashMap.put("screenWidth", String.valueOf(K.c()));
        if (i2 != -1) {
            hashMap.put("prerollType", String.valueOf(i2));
        }
        hashMap.put("t-user-id", K.d());
        hashMap.put("customer-user-id", K.e());
        hashMap.put("device-os", K.r());
        hashMap.put("device-client-date", String.valueOf(System.currentTimeMillis()));
        hashMap.put("t-network-bandwidth", String.valueOf(b.c().a()));
        hashMap.put("t-network-cache-capacity", String.valueOf(z40.K().m()));
        hashMap.put("npa", String.valueOf(z40.K().n().getNpa()));
        return hashMap;
    }
}
