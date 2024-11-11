package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.s8 */
/* loaded from: classes.dex */
final class RunnableC1881s8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ ServiceConnectionC1837o8 f8058b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1881s8(ServiceConnectionC1837o8 serviceConnectionC1837o8) {
        this.f8058b = serviceConnectionC1837o8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1924w7 c1924w7 = this.f8058b.f7923c;
        Context l = this.f8058b.f7923c.mo9325l();
        this.f8058b.f7923c.mo9317d();
        c1924w7.m9848a(new ComponentName(l, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
