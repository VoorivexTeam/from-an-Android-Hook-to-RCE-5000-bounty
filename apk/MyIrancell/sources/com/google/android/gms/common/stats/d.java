package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.s;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    private static d a = new d();
    private static Boolean b;

    public static d a() {
        return a;
    }

    private static void a(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(b.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e) {
            Log.wtf("WakeLockTracker", e);
        }
    }

    private static boolean b() {
        if (b == null) {
            b = false;
        }
        return b.booleanValue();
    }

    public void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        a(context, str, i, str2, str3, str4, i2, list, 0L);
    }

    public void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        if (b()) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "missing wakeLock key. ".concat(valueOf);
                    return;
                } else {
                    new String("missing wakeLock key. ");
                    return;
                }
            }
            if (7 == i || 8 == i || 10 == i || 11 == i) {
                a(context, new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, c.a(list), str, SystemClock.elapsedRealtime(), s.a(context), str3, c.a(context.getPackageName()), s.b(context), j, str4, false));
            }
        }
    }
}
