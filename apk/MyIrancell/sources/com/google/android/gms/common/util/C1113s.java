package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.s */
/* loaded from: classes.dex */
public final class C1113s {

    /* renamed from: b */
    private static long f6365b;

    /* renamed from: a */
    private static final IntentFilter f6364a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: c */
    private static float f6366c = Float.NaN;

    @TargetApi(20)
    /* renamed from: a */
    public static int m7426a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f6364a);
        int i = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & (C1108n.m7398d() ? 7 : 3)) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return (C1108n.m7401g() ? powerManager.isInteractive() : powerManager.isScreenOn() ? 2 : 0) | i;
    }

    /* renamed from: b */
    public static synchronized float m7427b(Context context) {
        synchronized (C1113s.class) {
            if (SystemClock.elapsedRealtime() - f6365b < 60000 && !Float.isNaN(f6366c)) {
                return f6366c;
            }
            if (context.getApplicationContext().registerReceiver(null, f6364a) != null) {
                f6366c = r6.getIntExtra("level", -1) / r6.getIntExtra("scale", -1);
            }
            f6365b = SystemClock.elapsedRealtime();
            return f6366c;
        }
    }
}
