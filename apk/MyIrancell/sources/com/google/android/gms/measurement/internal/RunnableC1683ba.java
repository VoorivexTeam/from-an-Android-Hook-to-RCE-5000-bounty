package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1428pc;

/* renamed from: com.google.android.gms.measurement.internal.ba */
/* loaded from: classes.dex */
final class RunnableC1683ba implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1428pc f7408b;

    /* renamed from: c */
    private final /* synthetic */ AppMeasurementDynamiteService f7409c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1683ba(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1428pc interfaceC1428pc) {
        this.f7409c = appMeasurementDynamiteService;
        this.f7408b = interfaceC1428pc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7409c.f7346a.m9426w().m9947a(this.f7408b, this.f7409c.f7346a.m9410b());
    }
}
