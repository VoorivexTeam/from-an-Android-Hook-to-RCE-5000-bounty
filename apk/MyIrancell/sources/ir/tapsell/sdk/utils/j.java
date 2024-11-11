package ir.tapsell.sdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public class j {
    public static boolean a(Context context) {
        return a(context, "android.permission.READ_PHONE_STATE") && context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }

    public static boolean a(Context context, String str) {
        if (str != null && context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissions.length > 0) {
                    for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                        if (str.equalsIgnoreCase(packageInfo.requestedPermissions[i])) {
                            return true;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
