package p000;

import ir.tapsell.sdk.networkcacheutils.C2748b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d50 {
    /* renamed from: a */
    public static Map<String, String> m11278a(int i, int i2) {
        HashMap hashMap = new HashMap();
        z40 m16734K = z40.m16734K();
        hashMap.put("secretKey", m16734K.m16758o());
        hashMap.put("targetPlatform", m16734K.m16762s());
        hashMap.put("dev-platform", m16734K.m16763t());
        hashMap.put("app-package-name", m16734K.m16753j());
        hashMap.put("vastVersion", String.valueOf(i));
        hashMap.put("device-imei", m16734K.m16754k());
        hashMap.put("osAdvertisingId", m16734K.m16764u());
        hashMap.put("device-model", m16734K.m16760q());
        hashMap.put("osVersion", String.valueOf(m16734K.m16765v()));
        hashMap.put("deviceManufacturer", m16734K.m16766w());
        hashMap.put("networkType", m16734K.m16755l());
        hashMap.put("carrier", m16734K.m16767x());
        hashMap.put("sdkVersion", m16734K.m16768y());
        hashMap.put("osId", m16734K.m16769z());
        if (m16734K.m16736A() != null) {
            hashMap.put("limitAdTrackingEnabled", String.valueOf(m16734K.m16736A()));
        }
        hashMap.put("appVersionCode", String.valueOf(m16734K.m16737B()));
        hashMap.put("appVersionName", m16734K.m16738C());
        hashMap.put("dataAvailability", String.valueOf(m16734K.m16739D()));
        hashMap.put("deviceBrand", m16734K.m16740E());
        hashMap.put("deviceLanguage", m16734K.m16741F());
        hashMap.put("screenDensity", String.valueOf(m16734K.m16742G()));
        hashMap.put("screenHeight", String.valueOf(m16734K.m16743a()));
        hashMap.put("screenOrientation", String.valueOf(m16734K.m16745b()));
        hashMap.put("screenWidth", String.valueOf(m16734K.m16746c()));
        if (i2 != -1) {
            hashMap.put("prerollType", String.valueOf(i2));
        }
        hashMap.put("t-user-id", m16734K.m16747d());
        hashMap.put("customer-user-id", m16734K.m16748e());
        hashMap.put("device-os", m16734K.m16761r());
        hashMap.put("device-client-date", String.valueOf(System.currentTimeMillis()));
        hashMap.put("t-network-bandwidth", String.valueOf(C2748b.m13089c().m13090a()));
        hashMap.put("t-network-cache-capacity", String.valueOf(z40.m16734K().m16756m()));
        hashMap.put("npa", String.valueOf(z40.m16734K().m16757n().getNpa()));
        return hashMap;
    }
}
