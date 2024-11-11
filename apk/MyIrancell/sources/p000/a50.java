package p000;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import ir.tapsell.sdk.C2688g;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.AdInfo;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;
import ir.tapsell.sdk.utils.C2765g;
import ir.tapsell.sdk.utils.C2768j;
import java.util.Locale;

/* loaded from: classes.dex */
public class a50 {
    /* renamed from: a */
    private static float m50a(DisplayMetrics displayMetrics) {
        return displayMetrics.density;
    }

    /* renamed from: a */
    private static int m51a(Configuration configuration) {
        return configuration.orientation;
    }

    /* renamed from: a */
    private static Point m52a(Display display) {
        Point point = new Point();
        display.getSize(point);
        return point;
    }

    /* renamed from: a */
    private static DisplayMetrics m53a(Resources resources) {
        return resources.getDisplayMetrics();
    }

    /* renamed from: a */
    private static Display m54a(WindowManager windowManager) {
        return windowManager.getDefaultDisplay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m55a() {
        return Locale.getDefault().getDisplayLanguage();
    }

    /* renamed from: a */
    private static String m56a(Context context) {
        return Settings.Secure.getString(m64b(context), "android_id");
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    /* renamed from: a */
    private static String m57a(Context context, TelephonyManager telephonyManager) {
        return (C2768j.m13169a(context) && m69c() >= 26) ? telephonyManager.getImei() : "";
    }

    /* renamed from: a */
    private static String m58a(TelephonyManager telephonyManager) {
        return telephonyManager.getNetworkOperatorName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m59a(Context context, UserExtraInfo userExtraInfo) {
        TelephonyManager m70c = m70c(context);
        userExtraInfo.setCarrier(m58a(m70c));
        userExtraInfo.setNetworkType(m62b(m70c));
        userExtraInfo.setImei(m57a(context, m70c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m60a(Context context, UserExtraInfo userExtraInfo, boolean z) {
        if (!z) {
            userExtraInfo.setAndroidId(m56a(context));
        }
        userExtraInfo.setOs("android");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m61a(UserExtraInfo userExtraInfo) {
        userExtraInfo.setDeviceManufacturer(C2765g.m13165b(Build.MANUFACTURER));
        userExtraInfo.setDeviceBrand(C2765g.m13165b(Build.BRAND));
        userExtraInfo.setDeviceModel(C2765g.m13165b(Build.MODEL));
    }

    /* renamed from: b */
    private static int m62b(TelephonyManager telephonyManager) {
        return telephonyManager.getNetworkType();
    }

    /* renamed from: b */
    private static int m63b(Display display) {
        return display.getRotation();
    }

    /* renamed from: b */
    private static ContentResolver m64b(Context context) {
        return context.getContentResolver();
    }

    /* renamed from: b */
    private static Configuration m65b(Resources resources) {
        return resources.getConfiguration();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m66b() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            property = C2765g.m13165b(property);
        }
        return (property == null || property.isEmpty()) ? "Android-Agent" : property;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m67b(Context context, UserExtraInfo userExtraInfo) {
        Resources m72e = m72e(context);
        Display m54a = m54a(m71d(context));
        userExtraInfo.setScreenDensity(m50a(m53a(m72e)));
        userExtraInfo.setScreenOrientation(m51a(m65b(m72e)));
        userExtraInfo.setScreenRealTimeOrientation(m63b(m54a));
        Point m52a = m52a(m54a);
        userExtraInfo.setScreenHeight(m52a.y);
        userExtraInfo.setScreenWidth(m52a.x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m68b(UserExtraInfo userExtraInfo) {
        userExtraInfo.setAdInfo((C2688g.m12913j().m12927e() == null || C2688g.m12913j().m12927e().isEmpty()) ? null : new AdInfo(C2688g.m12913j().m12927e(), Boolean.valueOf(C2688g.m12913j().m12930f())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m69c() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: c */
    private static TelephonyManager m70c(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: d */
    private static WindowManager m71d(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    /* renamed from: e */
    private static Resources m72e(Context context) {
        return context.getResources();
    }
}
