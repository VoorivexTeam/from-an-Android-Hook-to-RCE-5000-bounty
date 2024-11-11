package ir.metrix.sdk.network;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import ir.metrix.sdk.network.model.sentry.AppModel;
import ir.metrix.sdk.network.model.sentry.ContextModel;
import ir.metrix.sdk.network.model.sentry.DeviceModel;
import ir.metrix.sdk.network.model.sentry.ExceptionModel;
import ir.metrix.sdk.network.model.sentry.FrameModel;
import ir.metrix.sdk.network.model.sentry.OSModel;
import ir.metrix.sdk.network.model.sentry.SdkModel;
import ir.metrix.sdk.network.model.sentry.SentryCrashModel;
import ir.metrix.sdk.network.model.sentry.StackTraceModel;
import ir.metrix.sdk.network.model.sentry.TagsModel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class c {
    public static ExceptionModel a(Throwable th) {
        ExceptionModel exceptionModel = new ExceptionModel();
        if (th.getCause() == null) {
            exceptionModel.type = th.getClass().getCanonicalName();
            exceptionModel.value = th.getMessage();
        } else {
            exceptionModel.type = th.getCause().getClass().getCanonicalName();
            exceptionModel.value = th.getCause().getMessage();
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
            frameModel.inApp = stackTraceElement.isNativeMethod();
            stackTraceModel.frames.add(frameModel);
        }
        exceptionModel.stacktrace = stackTraceModel;
        return exceptionModel;
    }

    public static SentryCrashModel a(Application application, Throwable th) {
        SentryCrashModel sentryCrashModel = new SentryCrashModel();
        sentryCrashModel.message = th.getCause() == null ? th.getMessage() : th.getCause().getMessage();
        sentryCrashModel.timestamp = a();
        sentryCrashModel.platform = "java";
        ContextModel contextModel = new ContextModel();
        AppModel appModel = new AppModel();
        a(application, appModel);
        contextModel.app = appModel;
        DeviceModel deviceModel = new DeviceModel();
        deviceModel.orientation = a(application);
        deviceModel.simulator = b().booleanValue();
        deviceModel.modelId = Build.ID;
        deviceModel.manufacturer = Build.MANUFACTURER;
        deviceModel.online = c(application);
        deviceModel.model = Build.MODEL;
        deviceModel.brand = Build.BRAND;
        deviceModel.version = Build.VERSION.RELEASE;
        deviceModel.fingerPrint = Build.FINGERPRINT;
        deviceModel.deviceId = d(application);
        a(application, deviceModel);
        contextModel.device = deviceModel;
        SdkModel sdkModel = new SdkModel();
        sdkModel.sdkVersionName = "0.11.0";
        sdkModel.sdkVersionCode = 22;
        sdkModel.sdkPluginVersion = "";
        sdkModel.sdkBuildType = "release";
        sdkModel.sdkPlatform = "android";
        contextModel.metrixSdk = sdkModel;
        OSModel oSModel = new OSModel();
        oSModel.build = Build.DISPLAY;
        oSModel.rooted = c().booleanValue();
        oSModel.version = Build.VERSION.RELEASE;
        oSModel.sdkVersion = Build.VERSION.SDK_INT;
        oSModel.name = "Android";
        contextModel.os = oSModel;
        sentryCrashModel.contexts = contextModel;
        TagsModel tagsModel = new TagsModel();
        tagsModel.appId = appModel.appId;
        tagsModel.appTarget = appModel.appTargetSdkVersion;
        tagsModel.brand = deviceModel.brand;
        tagsModel.sdkPlatform = sdkModel.sdkPlatform;
        tagsModel.sdkVersion = sdkModel.sdkVersionName;
        sentryCrashModel.tags = tagsModel;
        sentryCrashModel.crashElement = a(th);
        return sentryCrashModel;
    }

    private static String a() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH).format(new Date());
    }

    private static String a(Context context) {
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

    private static void a(Application application, AppModel appModel) {
        CharSequence charSequence = application.getApplicationInfo().nonLocalizedLabel;
        if (charSequence != null) {
            appModel.appName = charSequence.toString();
        }
        appModel.appPackageName = application.getClass().getPackage().getName();
        appModel.appId = application.getPackageName();
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                appModel.appVersionCode = packageInfo.getLongVersionCode();
            } else {
                appModel.appVersionCode = packageInfo.versionCode;
            }
            appModel.appVersion = packageInfo.versionName;
            appModel.appTargetSdkVersion = packageInfo.applicationInfo.targetSdkVersion;
            if (Build.VERSION.SDK_INT >= 24) {
                appModel.appMinSdkVersion = packageInfo.applicationInfo.minSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private static void a(Context context, DeviceModel deviceModel) {
        ActivityManager.MemoryInfo b = b(context);
        if (b != null) {
            deviceModel.freeMemory = b.availMem;
            if (Build.VERSION.SDK_INT >= 16) {
                deviceModel.memorySize = b.totalMem;
            }
            deviceModel.lowMemory = b.lowMemory;
        }
    }

    private static ActivityManager.MemoryInfo b(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    private static Boolean b() {
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

    private static Boolean c() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String[] strArr = {"/data/local/bin/su", "/data/local/su", "/data/local/xbin/su", "/sbin/su", "/su/bin", "/su/bin/su", "/system/app/SuperSU", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/Superuser.apk", "/system/bin/failsafe/su", "/system/bin/su", "/system/sd/xbin/su", "/system/xbin/daemonsu", "/system/xbin/su"};
        for (int i = 0; i < 15; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"HardwareIds"})
    private static String d(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
