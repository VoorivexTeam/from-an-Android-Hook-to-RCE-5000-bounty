package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ir.tapsell.sdk.C2687f;
import ir.tapsell.sdk.models.sdkErrorLogModels.SdkErrorLogModel;
import ir.tapsell.sdk.models.sdkErrorLogModels.SdkErrorTypeEnum;

/* loaded from: classes.dex */
public class f50 {
    /* renamed from: a */
    public static SdkErrorLogModel m11688a(Context context, String str, SdkErrorTypeEnum sdkErrorTypeEnum) {
        SdkErrorLogModel sdkErrorLogModel = new SdkErrorLogModel();
        sdkErrorLogModel.message = str;
        sdkErrorLogModel.errorType = sdkErrorTypeEnum.toString();
        sdkErrorLogModel.manufacturer = Build.MANUFACTURER;
        sdkErrorLogModel.model = Build.MODEL;
        sdkErrorLogModel.brand = Build.BRAND;
        sdkErrorLogModel.fingerPrint = Build.FINGERPRINT;
        sdkErrorLogModel.osSdkVersion = Build.VERSION.SDK_INT;
        sdkErrorLogModel.sdkVersionName = "4.3.5-MTN";
        sdkErrorLogModel.sdkVersionCode = 133;
        sdkErrorLogModel.sdkPluginVersion = C2687f.f11020a;
        sdkErrorLogModel.sdkBuildType = "release";
        sdkErrorLogModel.sdkPlatform = "android";
        if (context != null) {
            sdkErrorLogModel.appPackageName = context.getPackageName();
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    sdkErrorLogModel.appVersionCode = packageInfo.getLongVersionCode();
                } else {
                    sdkErrorLogModel.appVersionCode = packageInfo.versionCode;
                }
                sdkErrorLogModel.appVersion = packageInfo.versionName;
                sdkErrorLogModel.appTargetSdkVersion = packageInfo.applicationInfo.targetSdkVersion;
            } catch (PackageManager.NameNotFoundException e) {
                h50.m12126a(false, e.getMessage());
            }
        }
        return sdkErrorLogModel;
    }
}
