package ir.metrix.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes.dex */
class k {

    @SerializedName("screenFormat")
    private String A;

    @SerializedName("os")
    private String a;

    @SerializedName("osVersion")
    private Integer b;

    @SerializedName("osVersionName")
    private String c;

    @SerializedName("deviceLanguage")
    private String d;

    @SerializedName("jailbroken")
    private Boolean e;

    @SerializedName("idfa")
    private String f;

    @SerializedName("imei")
    private String g;

    @SerializedName("androidId")
    private String h;

    @SerializedName("faceBookAttributionId")
    private String i;

    @SerializedName("amazonFireAdvertisingId")
    private String j;

    @SerializedName("amazonFireLimitAdTracking")
    private Integer k;

    @SerializedName("deviceModel")
    private String l;

    @SerializedName("deviceBrand")
    private String m;

    @SerializedName("deviceBoard")
    private String n;

    @SerializedName("deviceProduct")
    private String o;

    @SerializedName("deviceDesignName")
    private String p;

    @SerializedName("deviceDisplayName")
    private String q;

    @SerializedName("deviceManufacturer")
    private String r;

    @SerializedName("bootloaderVersion")
    private String s;

    @SerializedName("cpuAbi")
    private String t;

    @SerializedName("macAddress")
    private String u;

    @SerializedName("screenLayoutSize")
    private Integer v;

    @SerializedName("screenWidth")
    private Integer w;

    @SerializedName("screenHeight")
    private Integer x;

    @SerializedName("screenDensity")
    private Integer y;

    @SerializedName("screenOrientation")
    private Integer z;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"HardwareIds"})
    public k(Context context) {
        a("android");
        a(Integer.valueOf(Build.VERSION.SDK_INT));
        b(Build.VERSION.RELEASE);
        c(Locale.getDefault().getDisplayLanguage());
        a((Boolean) null);
        d((String) null);
        this.g = a(context);
        e(Settings.Secure.getString(context.getContentResolver(), "android_id"));
        f(b(context));
        g(c(context));
        b(d(context));
        h(Build.MODEL);
        i(Build.BRAND);
        j(Build.BOARD);
        k(Build.PRODUCT);
        l(Build.DEVICE);
        m(Build.DISPLAY);
        n(Build.MANUFACTURER);
        o(Build.BOOTLOADER);
        p(a());
        q(g(context));
        c(e(context));
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        try {
            defaultDisplay.getSize(point);
            d(Integer.valueOf(point.x));
            e(Integer.valueOf(point.y));
            f(Integer.valueOf(context.getResources().getDisplayMetrics().densityDpi));
            g(Integer.valueOf(context.getResources().getConfiguration().orientation));
        } catch (Throwable unused) {
            f((Integer) null);
            g((Integer) null);
            d((Integer) null);
            e((Integer) null);
        }
        r(f(context));
    }

    private static Object a(String str, String str2) {
        return a(str, str2, null);
    }

    private static Object a(String str, String str2, Object obj) {
        Field field;
        Class s = s(str);
        if (s == null || (field = s.getField(str2)) == null) {
            return null;
        }
        return field.get(obj);
    }

    private static String a() {
        String[] strArr;
        try {
            strArr = (String[]) a("android.os.Build", "SUPPORTED_ABIS");
        } catch (Throwable unused) {
            strArr = null;
        }
        return (strArr == null || strArr.length == 0) ? b() : strArr[0];
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private String a(Context context) {
        try {
            if (ac.a(context)) {
                return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String b() {
        try {
            return (String) a("android.os.Build", "CPU_ABI");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String b(Context context) {
        Cursor cursor;
        Throwable th;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("aid"));
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (Exception unused) {
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return null;
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
        }
    }

    private static String c(Context context) {
        if ("Amazon".equals(Build.MANUFACTURER)) {
            return Settings.Secure.getString(context.getContentResolver(), "advertising_id");
        }
        return null;
    }

    private static Integer d(Context context) {
        if ("Amazon".equals(Build.MANUFACTURER)) {
            return Integer.valueOf(Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking", 2));
        }
        return null;
    }

    private static Integer e(Context context) {
        int i = context.getResources().getConfiguration().screenLayout & 15;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3 && i != 4) {
                    return null;
                }
            }
        }
        return Integer.valueOf(i2);
    }

    private static String f(Context context) {
        int i = context.getResources().getConfiguration().screenLayout & 48;
        if (i == 16) {
            return "normal";
        }
        if (i != 32) {
            return null;
        }
        return "long";
    }

    private String g(Context context) {
        try {
            return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class s(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    void a(Boolean bool) {
        this.e = bool;
    }

    void a(Integer num) {
        this.b = num;
    }

    void a(String str) {
        this.a = ai.c(str);
    }

    void b(Integer num) {
        this.k = num;
    }

    void b(String str) {
        this.c = ai.c(str);
    }

    void c(Integer num) {
        this.v = num;
    }

    void c(String str) {
        this.d = ai.c(str);
    }

    void d(Integer num) {
        this.w = num;
    }

    void d(String str) {
        this.f = ai.c(str);
    }

    void e(Integer num) {
        this.x = num;
    }

    void e(String str) {
        this.h = ai.c(str);
    }

    void f(Integer num) {
        this.y = num;
    }

    void f(String str) {
        this.i = ai.c(str);
    }

    void g(Integer num) {
        this.z = num;
    }

    void g(String str) {
        this.j = ai.c(str);
    }

    void h(String str) {
        this.l = ai.c(str);
    }

    void i(String str) {
        this.m = ai.c(str);
    }

    void j(String str) {
        this.n = str;
    }

    void k(String str) {
        this.o = ai.c(str);
    }

    void l(String str) {
        this.p = ai.c(str);
    }

    void m(String str) {
        this.q = ai.c(str);
    }

    void n(String str) {
        this.r = ai.c(str);
    }

    void o(String str) {
        this.s = ai.c(str);
    }

    void p(String str) {
        this.t = ai.c(str);
    }

    void q(String str) {
        this.u = ai.c(str);
    }

    void r(String str) {
        this.A = ai.c(str);
    }
}
