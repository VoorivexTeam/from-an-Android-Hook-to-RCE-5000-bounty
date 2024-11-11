package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.pc;

/* loaded from: classes.dex */
final class d7 implements Runnable {
    private final /* synthetic */ pc b;
    private final /* synthetic */ AppMeasurementDynamiteService c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d7(AppMeasurementDynamiteService appMeasurementDynamiteService, pc pcVar) {
        this.c = appMeasurementDynamiteService;
        this.b = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.F().a(this.b);
    }
}
