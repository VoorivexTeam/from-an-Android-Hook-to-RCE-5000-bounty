package ir.metrix.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.gson.annotations.SerializedName;

/* renamed from: ir.metrix.sdk.ag */
/* loaded from: classes.dex */
class C2615ag {

    /* renamed from: a */
    @SerializedName("imsi")
    private String f10691a;

    /* renamed from: b */
    @SerializedName("subscriberId")
    private String f10692b;

    /* renamed from: c */
    @SerializedName("activeSubscriptionInfoMax")
    private Integer f10693c;

    /* renamed from: d */
    @SerializedName("carrier")
    private String f10694d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2615ag(Context context) {
        m12544a(m12542b(context));
        m12541a(context);
        m12543a(Build.VERSION.SDK_INT >= 22 ? Integer.valueOf(SubscriptionManager.from(context).getActiveSubscriptionInfoCountMax()) : null);
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    /* renamed from: a */
    private void m12541a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            m12546c(telephonyManager.getNetworkOperatorName());
            if (C2611ac.m12533a(context)) {
                m12545b(telephonyManager.getSubscriberId());
            } else {
                m12545b((String) null);
            }
        } catch (Throwable unused) {
            m12546c(null);
            m12545b((String) null);
        }
    }

    /* renamed from: b */
    private static String m12542b(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class<?> loadClass = classLoader.loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class).invoke(loadClass, (String) classLoader.loadClass("android.telephony.TelephonyProperties").getDeclaredField("PROPERTY_IMSI").get(null));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    void m12543a(Integer num) {
        this.f10693c = num;
    }

    /* renamed from: a */
    void m12544a(String str) {
        this.f10691a = C2617ai.m12554c(str);
    }

    /* renamed from: b */
    void m12545b(String str) {
        this.f10692b = C2617ai.m12554c(str);
    }

    /* renamed from: c */
    void m12546c(String str) {
        this.f10694d = C2617ai.m12554c(str);
    }
}
