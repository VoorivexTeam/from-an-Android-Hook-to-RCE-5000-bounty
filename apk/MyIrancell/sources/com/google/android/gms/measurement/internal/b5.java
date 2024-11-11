package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
final class b5 implements Runnable {
    private final /* synthetic */ j5 b;
    private final /* synthetic */ long c;
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ Context e;
    private final /* synthetic */ f4 f;
    private final /* synthetic */ BroadcastReceiver.PendingResult g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b5(z4 z4Var, j5 j5Var, long j, Bundle bundle, Context context, f4 f4Var, BroadcastReceiver.PendingResult pendingResult) {
        this.b = j5Var;
        this.c = j;
        this.d = bundle;
        this.e = context;
        this.f = f4Var;
        this.g = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long a = this.b.q().j.a();
        long j = this.c;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.d.putLong("click_timestamp", j);
        }
        this.d.putString("_cis", "referrer broadcast");
        j5.a(this.e, (com.google.android.gms.internal.measurement.zzv) null).v().a("auto", "_cmp", this.d);
        this.f.B().a("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.g;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
