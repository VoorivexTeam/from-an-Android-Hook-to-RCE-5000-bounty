package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;

/* loaded from: classes.dex */
public class x40 {
    /* renamed from: a */
    private static PackageInfo m16438a(Context context, PackageManager packageManager) {
        return packageManager.getPackageInfo(context.getPackageName(), 0);
    }

    /* renamed from: a */
    private static PackageManager m16439a(Context context) {
        return context.getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m16440a(Context context, UserExtraInfo userExtraInfo) {
        try {
            PackageInfo m16438a = m16438a(context, m16439a(context));
            userExtraInfo.setAppVersionName(m16438a.versionName);
            userExtraInfo.setAppVersionCode(m16438a.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            h50.m12122a("AppDataProvider", e.getMessage(), e);
        }
    }
}
