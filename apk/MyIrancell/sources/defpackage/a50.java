package defpackage;

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
import ir.tapsell.sdk.models.requestModels.userExtraInfo.AdInfo;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;
import ir.tapsell.sdk.utils.g;
import ir.tapsell.sdk.utils.j;
import java.util.Locale;

/* loaded from: classes.dex */
public class a50 {
    private static float a(DisplayMetrics displayMetrics) {
        return displayMetrics.density;
    }

    private static int a(Configuration configuration) {
        return configuration.orientation;
    }

    private static Point a(Display display) {
        Point point = new Point();
        display.getSize(point);
        return point;
    }

    private static DisplayMetrics a(Resources resources) {
        return resources.getDisplayMetrics();
    }

    private static Display a(WindowManager windowManager) {
        return windowManager.getDefaultDisplay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return Locale.getDefault().getDisplayLanguage();
    }

    private static String a(Context context) {
        return Settings.Secure.getString(b(context), "android_id");
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    private static String a(Context context, TelephonyManager telephonyManager) {
        return (j.a(context) && c() >= 26) ? telephonyManager.getImei() : "";
    }

    private static String a(TelephonyManager telephonyManager) {
        return telephonyManager.getNetworkOperatorName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, UserExtraInfo userExtraInfo) {
        TelephonyManager c = c(context);
        userExtraInfo.setCarrier(a(c));
        userExtraInfo.setNetworkType(b(c));
        userExtraInfo.setImei(a(context, c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, UserExtraInfo userExtraInfo, boolean z) {
        if (!z) {
            userExtraInfo.setAndroidId(a(context));
        }
        userExtraInfo.setOs("android");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(UserExtraInfo userExtraInfo) {
        userExtraInfo.setDeviceManufacturer(g.b(Build.MANUFACTURER));
        userExtraInfo.setDeviceBrand(g.b(Build.BRAND));
        userExtraInfo.setDeviceModel(g.b(Build.MODEL));
    }

    private static int b(TelephonyManager telephonyManager) {
        return telephonyManager.getNetworkType();
    }

    private static int b(Display display) {
        return display.getRotation();
    }

    private static ContentResolver b(Context context) {
        return context.getContentResolver();
    }

    private static Configuration b(Resources resources) {
        return resources.getConfiguration();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            property = g.b(property);
        }
        return (property == null || property.isEmpty()) ? "Android-Agent" : property;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, UserExtraInfo userExtraInfo) {
        Resources e = e(context);
        Display a = a(d(context));
        userExtraInfo.setScreenDensity(a(a(e)));
        userExtraInfo.setScreenOrientation(a(b(e)));
        userExtraInfo.setScreenRealTimeOrientation(b(a));
        Point a2 = a(a);
        userExtraInfo.setScreenHeight(a2.y);
        userExtraInfo.setScreenWidth(a2.x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(UserExtraInfo userExtraInfo) {
        userExtraInfo.setAdInfo((ir.tapsell.sdk.g.j().e() == null || ir.tapsell.sdk.g.j().e().isEmpty()) ? null : new AdInfo(ir.tapsell.sdk.g.j().e(), Boolean.valueOf(ir.tapsell.sdk.g.j().f())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c() {
        return Build.VERSION.SDK_INT;
    }

    private static TelephonyManager c(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private static WindowManager d(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    private static Resources e(Context context) {
        return context.getResources();
    }
}
