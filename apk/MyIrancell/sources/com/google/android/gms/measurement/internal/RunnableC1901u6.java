package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u6 */
/* loaded from: classes.dex */
public final class RunnableC1901u6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ Bundle f8097b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f8098c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1901u6(C1846p6 c1846p6, Bundle bundle) {
        this.f8098c = c1846p6;
        this.f8097b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8098c.m9712c(this.f8097b);
    }
}
