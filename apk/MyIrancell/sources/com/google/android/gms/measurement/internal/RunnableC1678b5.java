package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* loaded from: classes.dex */
final class RunnableC1678b5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1774j5 f7393b;

    /* renamed from: c */
    private final /* synthetic */ long f7394c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f7395d;

    /* renamed from: e */
    private final /* synthetic */ Context f7396e;

    /* renamed from: f */
    private final /* synthetic */ C1725f4 f7397f;

    /* renamed from: g */
    private final /* synthetic */ BroadcastReceiver.PendingResult f7398g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1678b5(C1954z4 c1954z4, C1774j5 c1774j5, long j, Bundle bundle, Context context, C1725f4 c1725f4, BroadcastReceiver.PendingResult pendingResult) {
        this.f7393b = c1774j5;
        this.f7394c = j;
        this.f7395d = bundle;
        this.f7396e = context;
        this.f7397f = c1725f4;
        this.f7398g = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long m9792a = this.f7393b.m9420q().f8028j.m9792a();
        long j = this.f7394c;
        if (m9792a > 0 && (j >= m9792a || j <= 0)) {
            j = m9792a - 1;
        }
        if (j > 0) {
            this.f7395d.putLong("click_timestamp", j);
        }
        this.f7395d.putString("_cis", "referrer broadcast");
        C1774j5.m9389a(this.f7396e, (com.google.android.gms.internal.measurement.zzv) null).m9425v().m9738a("auto", "_cmp", this.f7395d);
        this.f7397f.m9304B().m9365a("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.f7398g;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
