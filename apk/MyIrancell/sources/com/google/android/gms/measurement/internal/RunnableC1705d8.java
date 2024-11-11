package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1428pc;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
/* loaded from: classes.dex */
final class RunnableC1705d8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1428pc f7468b;

    /* renamed from: c */
    private final /* synthetic */ String f7469c;

    /* renamed from: d */
    private final /* synthetic */ String f7470d;

    /* renamed from: e */
    private final /* synthetic */ AppMeasurementDynamiteService f7471e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1705d8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1428pc interfaceC1428pc, String str, String str2) {
        this.f7471e = appMeasurementDynamiteService;
        this.f7468b = interfaceC1428pc;
        this.f7469c = str;
        this.f7470d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7471e.f7346a.m9401F().m9864a(this.f7468b, this.f7469c, this.f7470d);
    }
}
