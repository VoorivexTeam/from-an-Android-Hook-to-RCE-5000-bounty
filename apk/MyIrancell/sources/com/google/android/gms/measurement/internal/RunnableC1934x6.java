package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x6 */
/* loaded from: classes.dex */
public final class RunnableC1934x6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ Bundle f8171b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f8172c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1934x6(C1846p6 c1846p6, Bundle bundle) {
        this.f8172c = c1846p6;
        this.f8171b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8172c.m9714d(this.f8171b);
    }
}
