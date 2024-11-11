package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class i {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;

    public static boolean a() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean a(Context context) {
        if (a == null) {
            a = Boolean.valueOf(n.g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean b(Context context) {
        if (!a(context)) {
            return false;
        }
        if (n.i()) {
            return c(context) && !n.j();
        }
        return true;
    }

    @TargetApi(21)
    private static boolean c(Context context) {
        if (b == null) {
            b = Boolean.valueOf(n.h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue();
    }

    public static boolean d(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return c.booleanValue();
    }
}
