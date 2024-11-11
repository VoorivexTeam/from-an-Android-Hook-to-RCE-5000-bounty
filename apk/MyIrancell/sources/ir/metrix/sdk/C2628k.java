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

/* renamed from: ir.metrix.sdk.k */
/* loaded from: classes.dex */
class C2628k {

    /* renamed from: A */
    @SerializedName("screenFormat")
    private String f10733A;

    /* renamed from: a */
    @SerializedName("os")
    private String f10734a;

    /* renamed from: b */
    @SerializedName("osVersion")
    private Integer f10735b;

    /* renamed from: c */
    @SerializedName("osVersionName")
    private String f10736c;

    /* renamed from: d */
    @SerializedName("deviceLanguage")
    private String f10737d;

    /* renamed from: e */
    @SerializedName("jailbroken")
    private Boolean f10738e;

    /* renamed from: f */
    @SerializedName("idfa")
    private String f10739f;

    /* renamed from: g */
    @SerializedName("imei")
    private String f10740g;

    /* renamed from: h */
    @SerializedName("androidId")
    private String f10741h;

    /* renamed from: i */
    @SerializedName("faceBookAttributionId")
    private String f10742i;

    /* renamed from: j */
    @SerializedName("amazonFireAdvertisingId")
    private String f10743j;

    /* renamed from: k */
    @SerializedName("amazonFireLimitAdTracking")
    private Integer f10744k;

    /* renamed from: l */
    @SerializedName("deviceModel")
    private String f10745l;

    /* renamed from: m */
    @SerializedName("deviceBrand")
    private String f10746m;

    /* renamed from: n */
    @SerializedName("deviceBoard")
    private String f10747n;

    /* renamed from: o */
    @SerializedName("deviceProduct")
    private String f10748o;

    /* renamed from: p */
    @SerializedName("deviceDesignName")
    private String f10749p;

    /* renamed from: q */
    @SerializedName("deviceDisplayName")
    private String f10750q;

    /* renamed from: r */
    @SerializedName("deviceManufacturer")
    private String f10751r;

    /* renamed from: s */
    @SerializedName("bootloaderVersion")
    private String f10752s;

    /* renamed from: t */
    @SerializedName("cpuAbi")
    private String f10753t;

    /* renamed from: u */
    @SerializedName("macAddress")
    private String f10754u;

    /* renamed from: v */
    @SerializedName("screenLayoutSize")
    private Integer f10755v;

    /* renamed from: w */
    @SerializedName("screenWidth")
    private Integer f10756w;

    /* renamed from: x */
    @SerializedName("screenHeight")
    private Integer f10757x;

    /* renamed from: y */
    @SerializedName("screenDensity")
    private Integer f10758y;

    /* renamed from: z */
    @SerializedName("screenOrientation")
    private Integer f10759z;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"HardwareIds"})
    public C2628k(Context context) {
        m12617a("android");
        m12616a(Integer.valueOf(Build.VERSION.SDK_INT));
        m12619b(Build.VERSION.RELEASE);
        m12621c(Locale.getDefault().getDisplayLanguage());
        m12615a((Boolean) null);
        m12623d((String) null);
        this.f10740g = m12606a(context);
        m12625e(Settings.Secure.getString(context.getContentResolver(), "android_id"));
        m12627f(m12608b(context));
        m12629g(m12609c(context));
        m12618b(m12610d(context));
        m12630h(Build.MODEL);
        m12631i(Build.BRAND);
        m12632j(Build.BOARD);
        m12633k(Build.PRODUCT);
        m12634l(Build.DEVICE);
        m12635m(Build.DISPLAY);
        m12636n(Build.MANUFACTURER);
        m12637o(Build.BOOTLOADER);
        m12638p(m12605a());
        m12639q(m12613g(context));
        m12620c(m12611e(context));
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        try {
            defaultDisplay.getSize(point);
            m12622d(Integer.valueOf(point.x));
            m12624e(Integer.valueOf(point.y));
            m12626f(Integer.valueOf(context.getResources().getDisplayMetrics().densityDpi));
            m12628g(Integer.valueOf(context.getResources().getConfiguration().orientation));
        } catch (Throwable unused) {
            m12626f((Integer) null);
            m12628g((Integer) null);
            m12622d((Integer) null);
            m12624e((Integer) null);
        }
        m12640r(m12612f(context));
    }

    /* renamed from: a */
    private static Object m12603a(String str, String str2) {
        return m12604a(str, str2, null);
    }

    /* renamed from: a */
    private static Object m12604a(String str, String str2, Object obj) {
        Field field;
        Class m12614s = m12614s(str);
        if (m12614s == null || (field = m12614s.getField(str2)) == null) {
            return null;
        }
        return field.get(obj);
    }

    /* renamed from: a */
    private static String m12605a() {
        String[] strArr;
        try {
            strArr = (String[]) m12603a("android.os.Build", "SUPPORTED_ABIS");
        } catch (Throwable unused) {
            strArr = null;
        }
        return (strArr == null || strArr.length == 0) ? m12607b() : strArr[0];
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    /* renamed from: a */
    private String m12606a(Context context) {
        try {
            if (C2611ac.m12533a(context)) {
                return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: b */
    private static String m12607b() {
        try {
            return (String) m12603a("android.os.Build", "CPU_ABI");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m12608b(Context context) {
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

    /* renamed from: c */
    private static String m12609c(Context context) {
        if ("Amazon".equals(Build.MANUFACTURER)) {
            return Settings.Secure.getString(context.getContentResolver(), "advertising_id");
        }
        return null;
    }

    /* renamed from: d */
    private static Integer m12610d(Context context) {
        if ("Amazon".equals(Build.MANUFACTURER)) {
            return Integer.valueOf(Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking", 2));
        }
        return null;
    }

    /* renamed from: e */
    private static Integer m12611e(Context context) {
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

    /* renamed from: f */
    private static String m12612f(Context context) {
        int i = context.getResources().getConfiguration().screenLayout & 48;
        if (i == 16) {
            return "normal";
        }
        if (i != 32) {
            return null;
        }
        return "long";
    }

    /* renamed from: g */
    private String m12613g(Context context) {
        try {
            return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    private static Class m12614s(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    void m12615a(Boolean bool) {
        this.f10738e = bool;
    }

    /* renamed from: a */
    void m12616a(Integer num) {
        this.f10735b = num;
    }

    /* renamed from: a */
    void m12617a(String str) {
        this.f10734a = C2617ai.m12554c(str);
    }

    /* renamed from: b */
    void m12618b(Integer num) {
        this.f10744k = num;
    }

    /* renamed from: b */
    void m12619b(String str) {
        this.f10736c = C2617ai.m12554c(str);
    }

    /* renamed from: c */
    void m12620c(Integer num) {
        this.f10755v = num;
    }

    /* renamed from: c */
    void m12621c(String str) {
        this.f10737d = C2617ai.m12554c(str);
    }

    /* renamed from: d */
    void m12622d(Integer num) {
        this.f10756w = num;
    }

    /* renamed from: d */
    void m12623d(String str) {
        this.f10739f = C2617ai.m12554c(str);
    }

    /* renamed from: e */
    void m12624e(Integer num) {
        this.f10757x = num;
    }

    /* renamed from: e */
    void m12625e(String str) {
        this.f10741h = C2617ai.m12554c(str);
    }

    /* renamed from: f */
    void m12626f(Integer num) {
        this.f10758y = num;
    }

    /* renamed from: f */
    void m12627f(String str) {
        this.f10742i = C2617ai.m12554c(str);
    }

    /* renamed from: g */
    void m12628g(Integer num) {
        this.f10759z = num;
    }

    /* renamed from: g */
    void m12629g(String str) {
        this.f10743j = C2617ai.m12554c(str);
    }

    /* renamed from: h */
    void m12630h(String str) {
        this.f10745l = C2617ai.m12554c(str);
    }

    /* renamed from: i */
    void m12631i(String str) {
        this.f10746m = C2617ai.m12554c(str);
    }

    /* renamed from: j */
    void m12632j(String str) {
        this.f10747n = str;
    }

    /* renamed from: k */
    void m12633k(String str) {
        this.f10748o = C2617ai.m12554c(str);
    }

    /* renamed from: l */
    void m12634l(String str) {
        this.f10749p = C2617ai.m12554c(str);
    }

    /* renamed from: m */
    void m12635m(String str) {
        this.f10750q = C2617ai.m12554c(str);
    }

    /* renamed from: n */
    void m12636n(String str) {
        this.f10751r = C2617ai.m12554c(str);
    }

    /* renamed from: o */
    void m12637o(String str) {
        this.f10752s = C2617ai.m12554c(str);
    }

    /* renamed from: p */
    void m12638p(String str) {
        this.f10753t = C2617ai.m12554c(str);
    }

    /* renamed from: q */
    void m12639q(String str) {
        this.f10754u = C2617ai.m12554c(str);
    }

    /* renamed from: r */
    void m12640r(String str) {
        this.f10733A = C2617ai.m12554c(str);
    }
}
