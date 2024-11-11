package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.C1774j5;

/* loaded from: classes.dex */
public class Analytics {

    /* renamed from: a */
    private static volatile Analytics f8264a;

    private Analytics(C1774j5 c1774j5) {
        C1057u.m7286a(c1774j5);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (f8264a == null) {
            synchronized (Analytics.class) {
                if (f8264a == null) {
                    f8264a = new Analytics(C1774j5.m9389a(context, (zzv) null));
                }
            }
        }
        return f8264a;
    }
}
