package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;

/* loaded from: classes.dex */
public class x40 {
    private static PackageInfo a(Context context, PackageManager packageManager) {
        return packageManager.getPackageInfo(context.getPackageName(), 0);
    }

    private static PackageManager a(Context context) {
        return context.getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, UserExtraInfo userExtraInfo) {
        try {
            PackageInfo a = a(context, a(context));
            userExtraInfo.setAppVersionName(a.versionName);
            userExtraInfo.setAppVersionCode(a.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            h50.a("AppDataProvider", e.getMessage(), e);
        }
    }
}
