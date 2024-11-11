package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C1007i;
import p000.C2440ep;

/* renamed from: com.google.android.gms.common.util.q */
/* loaded from: classes.dex */
public final class C1111q {
    /* renamed from: a */
    public static boolean m7410a(Context context, int i) {
        if (!m7411a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1007i.m7008a(context).m7013a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m7411a(Context context, int i, String str) {
        return C2440ep.m11628a(context).m11478a(i, str);
    }
}
