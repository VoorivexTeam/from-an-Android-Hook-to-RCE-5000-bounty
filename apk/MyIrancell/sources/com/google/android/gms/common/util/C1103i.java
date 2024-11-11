package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.i */
/* loaded from: classes.dex */
public final class C1103i {

    /* renamed from: a */
    private static Boolean f6353a;

    /* renamed from: b */
    private static Boolean f6354b;

    /* renamed from: c */
    private static Boolean f6355c;

    /* renamed from: a */
    public static boolean m7386a() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: a */
    public static boolean m7387a(Context context) {
        if (f6353a == null) {
            f6353a = Boolean.valueOf(C1108n.m7401g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f6353a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: b */
    public static boolean m7388b(Context context) {
        if (!m7387a(context)) {
            return false;
        }
        if (C1108n.m7403i()) {
            return m7389c(context) && !C1108n.m7404j();
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: c */
    private static boolean m7389c(Context context) {
        if (f6354b == null) {
            f6354b = Boolean.valueOf(C1108n.m7402h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f6354b.booleanValue();
    }

    /* renamed from: d */
    public static boolean m7390d(Context context) {
        if (f6355c == null) {
            f6355c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f6355c.booleanValue();
    }
}
