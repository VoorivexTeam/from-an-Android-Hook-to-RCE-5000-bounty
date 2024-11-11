package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1428pc;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
/* loaded from: classes.dex */
final class RunnableC1704d7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1428pc f7466b;

    /* renamed from: c */
    private final /* synthetic */ AppMeasurementDynamiteService f7467c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1704d7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1428pc interfaceC1428pc) {
        this.f7467c = appMeasurementDynamiteService;
        this.f7466b = interfaceC1428pc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7467c.f7346a.m9401F().m9862a(this.f7466b);
    }
}
