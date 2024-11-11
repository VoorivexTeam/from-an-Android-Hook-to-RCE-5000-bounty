package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class s {
    private static long b;
    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static float c = Float.NaN;

    @TargetApi(20)
    public static int a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, a);
        int i = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & (n.d() ? 7 : 3)) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return (n.g() ? powerManager.isInteractive() : powerManager.isScreenOn() ? 2 : 0) | i;
    }

    public static synchronized float b(Context context) {
        synchronized (s.class) {
            if (SystemClock.elapsedRealtime() - b < 60000 && !Float.isNaN(c)) {
                return c;
            }
            if (context.getApplicationContext().registerReceiver(null, a) != null) {
                c = r6.getIntExtra("level", -1) / r6.getIntExtra("scale", -1);
            }
            b = SystemClock.elapsedRealtime();
            return c;
        }
    }
}
