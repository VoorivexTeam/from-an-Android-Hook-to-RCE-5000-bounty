package ir.metrix.sdk;

import android.content.Context;

/* renamed from: ir.metrix.sdk.ac */
/* loaded from: classes.dex */
public class C2611ac {
    /* renamed from: a */
    public static boolean m12533a(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0;
    }

    /* renamed from: b */
    public static boolean m12534b(Context context) {
        return context.getPackageManager().checkPermission("android.permission.ACCESS_FINE_LOCATION", context.getPackageName()) == 0;
    }

    /* renamed from: c */
    public static boolean m12535c(Context context) {
        return context.getPackageManager().checkPermission("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) == 0;
    }
}
