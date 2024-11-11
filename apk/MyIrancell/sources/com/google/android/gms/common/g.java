package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class g extends h {
    @Deprecated
    public static Dialog a(int i, Activity activity, int i2) {
        return a(i, activity, i2, null);
    }

    @Deprecated
    public static Dialog a(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (h.d(activity, i)) {
            i = 18;
        }
        return c.a().a(activity, i, i2, onCancelListener);
    }

    public static Resources d(Context context) {
        return h.d(context);
    }
}
