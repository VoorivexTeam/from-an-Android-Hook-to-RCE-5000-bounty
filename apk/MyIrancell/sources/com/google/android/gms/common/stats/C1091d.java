package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C1113s;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.d */
/* loaded from: classes.dex */
public class C1091d {

    /* renamed from: a */
    private static C1091d f6349a = new C1091d();

    /* renamed from: b */
    private static Boolean f6350b;

    /* renamed from: a */
    public static C1091d m7355a() {
        return f6349a;
    }

    /* renamed from: a */
    private static void m7356a(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(C1089b.f6348a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e) {
            Log.wtf("WakeLockTracker", e);
        }
    }

    /* renamed from: b */
    private static boolean m7357b() {
        if (f6350b == null) {
            f6350b = false;
        }
        return f6350b.booleanValue();
    }

    /* renamed from: a */
    public void m7358a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        m7359a(context, str, i, str2, str3, str4, i2, list, 0L);
    }

    /* renamed from: a */
    public void m7359a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        if (m7357b()) {
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
                m7356a(context, new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, C1090c.m7354a(list), str, SystemClock.elapsedRealtime(), C1113s.m7426a(context), str3, C1090c.m7353a(context.getPackageName()), C1113s.m7427b(context), j, str4, false));
            }
        }
    }
}
