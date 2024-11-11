package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.as;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class y {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private static final Object b = new Object();

    @GuardedBy("WakeLockHolder.syncObject")
    private static as c;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (b) {
            if (c == null) {
                as asVar = new as(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                c = asVar;
                asVar.a(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            a(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                c.a(a);
            }
            return startService;
        }
    }

    public static void a(Intent intent) {
        synchronized (b) {
            if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                a(intent, false);
                c.a();
            }
        }
    }

    private static void a(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }
}
