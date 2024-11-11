package ir.metrix.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
class ag {

    @SerializedName("imsi")
    private String a;

    @SerializedName("subscriberId")
    private String b;

    @SerializedName("activeSubscriptionInfoMax")
    private Integer c;

    @SerializedName("carrier")
    private String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ag(Context context) {
        a(b(context));
        a(context);
        a(Build.VERSION.SDK_INT >= 22 ? Integer.valueOf(SubscriptionManager.from(context).getActiveSubscriptionInfoCountMax()) : null);
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private void a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            c(telephonyManager.getNetworkOperatorName());
            if (ac.a(context)) {
                b(telephonyManager.getSubscriberId());
            } else {
                b((String) null);
            }
        } catch (Throwable unused) {
            c(null);
            b((String) null);
        }
    }

    private static String b(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class<?> loadClass = classLoader.loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class).invoke(loadClass, (String) classLoader.loadClass("android.telephony.TelephonyProperties").getDeclaredField("PROPERTY_IMSI").get(null));
        } catch (Exception unused) {
            return null;
        }
    }

    void a(Integer num) {
        this.c = num;
    }

    void a(String str) {
        this.a = ai.c(str);
    }

    void b(String str) {
        this.b = ai.c(str);
    }

    void c(String str) {
        this.d = ai.c(str);
    }
}
