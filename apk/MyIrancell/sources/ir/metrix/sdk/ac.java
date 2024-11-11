package ir.metrix.sdk;

import android.content.Context;

/* loaded from: classes.dex */
public class ac {
    public static boolean a(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0;
    }

    public static boolean b(Context context) {
        return context.getPackageManager().checkPermission("android.permission.ACCESS_FINE_LOCATION", context.getPackageName()) == 0;
    }

    public static boolean c(Context context) {
        return context.getPackageManager().checkPermission("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) == 0;
    }
}
