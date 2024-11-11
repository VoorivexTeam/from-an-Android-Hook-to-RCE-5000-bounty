package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import ir.tapsell.sdk.C2687f;
import ir.tapsell.sdk.models.sentry.AppModel;
import ir.tapsell.sdk.models.sentry.ContextModel;
import ir.tapsell.sdk.models.sentry.DeviceModel;
import ir.tapsell.sdk.models.sentry.ExeptionModel;
import ir.tapsell.sdk.models.sentry.FrameModel;
import ir.tapsell.sdk.models.sentry.OSModel;
import ir.tapsell.sdk.models.sentry.SdkModel;
import ir.tapsell.sdk.models.sentry.SentryCrashModel;
import ir.tapsell.sdk.models.sentry.StackTraceModel;
import ir.tapsell.sdk.models.sentry.TagsModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class y40 {
    /* renamed from: a */
    public static ExeptionModel m16563a(Throwable th) {
        ExeptionModel exeptionModel = new ExeptionModel();
        if (th.getCause() == null) {
            exeptionModel.type = th.getClass().getCanonicalName();
            exeptionModel.value = th.getMessage();
        } else {
            exeptionModel.type = th.getCause().getClass().getCanonicalName();
            exeptionModel.value = th.getCause().getMessage();
            th = th.getCause();
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        StackTraceModel stackTraceModel = new StackTraceModel();
        stackTraceModel.frames = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            FrameModel frameModel = new FrameModel();
            frameModel.filename = stackTraceElement.getFileName();
            frameModel.function = stackTraceElement.getMethodName();
            frameModel.lineno = stackTraceElement.getLineNumber();
            frameModel.module = stackTraceElement.getClassName();
            frameModel.in_app = stackTraceElement.isNativeMethod();
            stackTraceModel.frames.add(frameModel);
        }
        exeptionModel.stacktrace = stackTraceModel;
        return exeptionModel;
    }

    /* renamed from: a */
    public static SentryCrashModel m16564a(Context context, Throwable th) {
        SentryCrashModel sentryCrashModel = new SentryCrashModel();
        sentryCrashModel.message = th.getCause() == null ? th.getMessage() : th.getCause().getMessage();
        sentryCrashModel.timestamp = m16565a();
        sentryCrashModel.platform = "java";
        ContextModel contextModel = new ContextModel();
        AppModel appModel = new AppModel();
        m16567a(context, appModel);
        contextModel.app = appModel;
        DeviceModel deviceModel = new DeviceModel();
        deviceModel.orientation = m16566a(context);
        deviceModel.simulator = m16570b().booleanValue();
        deviceModel.model_id = Build.ID;
        deviceModel.manufacturer = Build.MANUFACTURER;
        deviceModel.online = m16571c(context);
        deviceModel.model = Build.MODEL;
        deviceModel.brand = Build.BRAND;
        deviceModel.version = Build.VERSION.RELEASE;
        deviceModel.finger_print = Build.FINGERPRINT;
        deviceModel.device_id = m16572d(context);
        m16568a(context, deviceModel);
        contextModel.device = deviceModel;
        SdkModel sdkModel = new SdkModel();
        sdkModel.sdk_version_name = "4.3.5-MTN";
        sdkModel.sdk_version_code = 133;
        sdkModel.sdk_plugin_version = C2687f.f11020a;
        sdkModel.sdk_build_type = "release";
        sdkModel.sdk_platform = "android";
        contextModel.tapsell_sdk = sdkModel;
        OSModel oSModel = new OSModel();
        oSModel.build = Build.DISPLAY;
        oSModel.version = Build.VERSION.RELEASE;
        oSModel.sdk_version = Build.VERSION.SDK_INT;
        oSModel.name = "Android";
        contextModel.f11059os = oSModel;
        sentryCrashModel.contexts = contextModel;
        TagsModel tagsModel = new TagsModel();
        tagsModel.app_id = appModel.app_id;
        tagsModel.app_target = appModel.app_target_sdk_version;
        tagsModel.brand = deviceModel.brand;
        tagsModel.sdk_platform = sdkModel.sdk_platform;
        tagsModel.sdk_version = sdkModel.sdk_version_name;
        sentryCrashModel.tags = tagsModel;
        sentryCrashModel.crashElement = m16563a(th);
        return sentryCrashModel;
    }

    /* renamed from: a */
    private static String m16565a() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH).format(new Date());
    }

    /* renamed from: a */
    private static String m16566a(Context context) {
        try {
            int i = context.getResources().getConfiguration().orientation;
            if (i == 1) {
                return "portrait";
            }
            if (i != 2) {
                return null;
            }
            return "landscape";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static void m16567a(Context context, AppModel appModel) {
        CharSequence charSequence = context.getApplicationInfo().nonLocalizedLabel;
        if (charSequence != null) {
            appModel.app_name = charSequence.toString();
        }
        appModel.app_package_name = context.getClass().getPackage().getName();
        appModel.app_id = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                appModel.app_version_code = packageInfo.getLongVersionCode();
            } else {
                appModel.app_version_code = packageInfo.versionCode;
            }
            appModel.app_version = packageInfo.versionName;
            appModel.app_target_sdk_version = packageInfo.applicationInfo.targetSdkVersion;
            if (Build.VERSION.SDK_INT >= 24) {
                appModel.app_min_sdk_version = packageInfo.applicationInfo.minSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    private static void m16568a(Context context, DeviceModel deviceModel) {
        ActivityManager.MemoryInfo m16569b = m16569b(context);
        if (m16569b != null) {
            deviceModel.free_memory = m16569b.availMem;
            if (Build.VERSION.SDK_INT >= 16) {
                deviceModel.memory_size = m16569b.totalMem;
            }
            deviceModel.low_memory = m16569b.lowMemory;
        }
    }

    /* renamed from: b */
    private static ActivityManager.MemoryInfo m16569b(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Boolean m16570b() {
        boolean z;
        try {
            if (!Build.FINGERPRINT.startsWith("generic") && !Build.FINGERPRINT.startsWith("unknown") && !Build.MODEL.contains("google_sdk") && !Build.MODEL.contains("Emulator") && !Build.MODEL.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                z = false;
                return Boolean.valueOf(z);
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m16571c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: d */
    private static String m16572d(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
