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

/* renamed from: ir.metrix.sdk.network.c */
/* loaded from: classes.dex */
public class C2634c {
    /* renamed from: a */
    public static ExceptionModel m12659a(Throwable th) {
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

    /* renamed from: a */
    public static SentryCrashModel m12660a(Application application, Throwable th) {
        SentryCrashModel sentryCrashModel = new SentryCrashModel();
        sentryCrashModel.message = th.getCause() == null ? th.getMessage() : th.getCause().getMessage();
        sentryCrashModel.timestamp = m12661a();
        sentryCrashModel.platform = "java";
        ContextModel contextModel = new ContextModel();
        AppModel appModel = new AppModel();
        m12663a(application, appModel);
        contextModel.app = appModel;
        DeviceModel deviceModel = new DeviceModel();
        deviceModel.orientation = m12662a(application);
        deviceModel.simulator = m12666b().booleanValue();
        deviceModel.modelId = Build.ID;
        deviceModel.manufacturer = Build.MANUFACTURER;
        deviceModel.online = m12668c(application);
        deviceModel.model = Build.MODEL;
        deviceModel.brand = Build.BRAND;
        deviceModel.version = Build.VERSION.RELEASE;
        deviceModel.fingerPrint = Build.FINGERPRINT;
        deviceModel.deviceId = m12669d(application);
        m12664a(application, deviceModel);
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
        oSModel.rooted = m12667c().booleanValue();
        oSModel.version = Build.VERSION.RELEASE;
        oSModel.sdkVersion = Build.VERSION.SDK_INT;
        oSModel.name = "Android";
        contextModel.f10799os = oSModel;
        sentryCrashModel.contexts = contextModel;
        TagsModel tagsModel = new TagsModel();
        tagsModel.appId = appModel.appId;
        tagsModel.appTarget = appModel.appTargetSdkVersion;
        tagsModel.brand = deviceModel.brand;
        tagsModel.sdkPlatform = sdkModel.sdkPlatform;
        tagsModel.sdkVersion = sdkModel.sdkVersionName;
        sentryCrashModel.tags = tagsModel;
        sentryCrashModel.crashElement = m12659a(th);
        return sentryCrashModel;
    }

    /* renamed from: a */
    private static String m12661a() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH).format(new Date());
    }

    /* renamed from: a */
    private static String m12662a(Context context) {
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
    private static void m12663a(Application application, AppModel appModel) {
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

    /* renamed from: a */
    private static void m12664a(Context context, DeviceModel deviceModel) {
        ActivityManager.MemoryInfo m12665b = m12665b(context);
        if (m12665b != null) {
            deviceModel.freeMemory = m12665b.availMem;
            if (Build.VERSION.SDK_INT >= 16) {
                deviceModel.memorySize = m12665b.totalMem;
            }
            deviceModel.lowMemory = m12665b.lowMemory;
        }
    }

    /* renamed from: b */
    private static ActivityManager.MemoryInfo m12665b(Context context) {
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
    private static Boolean m12666b() {
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
    private static Boolean m12667c() {
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

    /* renamed from: c */
    private static boolean m12668c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: d */
    private static String m12669d(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
