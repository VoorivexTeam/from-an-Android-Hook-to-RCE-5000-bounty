package com.google.android.gms.common.util;

import android.content.Context;

/* loaded from: classes.dex */
public final class g {
    public static boolean a(Context context, Throwable th) {
        return a(context, th, 536870912);
    }

    private static boolean a(Context context, Throwable th, int i) {
        try {
            com.google.android.gms.common.internal.u.a(context);
            com.google.android.gms.common.internal.u.a(th);
        } catch (Exception unused) {
        }
        return false;
    }
}
