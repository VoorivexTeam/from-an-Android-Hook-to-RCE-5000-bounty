package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.pc;

/* loaded from: classes.dex */
final class ba implements Runnable {
    private final /* synthetic */ pc b;
    private final /* synthetic */ AppMeasurementDynamiteService c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ba(AppMeasurementDynamiteService appMeasurementDynamiteService, pc pcVar) {
        this.c = appMeasurementDynamiteService;
        this.b = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.w().a(this.b, this.c.a.b());
    }
}
