package com.google.android.gms.common.util;

import android.content.Context;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.common.util.g */
/* loaded from: classes.dex */
public final class C1101g {
    /* renamed from: a */
    public static boolean m7383a(Context context, Throwable th) {
        return m7384a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m7384a(Context context, Throwable th, int i) {
        try {
            C1057u.m7286a(context);
            C1057u.m7286a(th);
        } catch (Exception unused) {
        }
        return false;
    }
}
