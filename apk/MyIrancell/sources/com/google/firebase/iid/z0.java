package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import defpackage.ks;
import defpackage.tq;
import defpackage.yq;
import defpackage.zo;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class z0 {

    @GuardedBy("MessengerIpcClient.class")
    private static z0 e;
    private final Context a;
    private final ScheduledExecutorService b;

    @GuardedBy("this")
    private a1 c = new a1(this);

    @GuardedBy("this")
    private int d = 1;

    private z0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    public static synchronized z0 a(Context context) {
        z0 z0Var;
        synchronized (z0.class) {
            if (e == null) {
                e = new z0(context, tq.a().a(1, new zo("MessengerIpcClient"), yq.a));
            }
            z0Var = e;
        }
        return z0Var;
    }

    private final synchronized <T> ks<T> a(j<T> jVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(jVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            sb.toString();
        }
        if (!this.c.a((j<?>) jVar)) {
            a1 a1Var = new a1(this);
            this.c = a1Var;
            a1Var.a((j<?>) jVar);
        }
        return jVar.b.a();
    }

    public final ks<Void> a(int i, Bundle bundle) {
        return a(new g(a(), 2, bundle));
    }

    public final ks<Bundle> b(int i, Bundle bundle) {
        return a(new l(a(), 1, bundle));
    }
}
