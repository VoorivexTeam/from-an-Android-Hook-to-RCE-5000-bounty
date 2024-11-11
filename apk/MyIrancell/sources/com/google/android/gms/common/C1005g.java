package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;

/* renamed from: com.google.android.gms.common.g */
/* loaded from: classes.dex */
public final class C1005g extends C1006h {
    @Deprecated
    /* renamed from: a */
    public static Dialog m6990a(int i, Activity activity, int i2) {
        return m6991a(i, activity, i2, null);
    }

    @Deprecated
    /* renamed from: a */
    public static Dialog m6991a(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (C1006h.m7005d(activity, i)) {
            i = 18;
        }
        return C0993c.m6949a().m6955a(activity, i, i2, onCancelListener);
    }

    /* renamed from: d */
    public static Resources m6992d(Context context) {
        return C1006h.m7004d(context);
    }
}
