package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p000.C0434as;

/* renamed from: com.google.firebase.iid.y */
/* loaded from: classes.dex */
public final class C2131y {

    /* renamed from: a */
    private static final long f8982a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f8983b = new Object();

    /* renamed from: c */
    @GuardedBy("WakeLockHolder.syncObject")
    private static C0434as f8984c;

    /* renamed from: a */
    public static ComponentName m10723a(Context context, Intent intent) {
        synchronized (f8983b) {
            if (f8984c == null) {
                C0434as c0434as = new C0434as(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f8984c = c0434as;
                c0434as.m3186a(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            m10725a(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                f8984c.m3185a(f8982a);
            }
            return startService;
        }
    }

    /* renamed from: a */
    public static void m10724a(Intent intent) {
        synchronized (f8983b) {
            if (f8984c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                m10725a(intent, false);
                f8984c.m3184a();
            }
        }
    }

    /* renamed from: a */
    private static void m10725a(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }
}
