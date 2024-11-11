package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.pc;

/* loaded from: classes.dex */
final class d8 implements Runnable {
    private final /* synthetic */ pc b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ AppMeasurementDynamiteService e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d8(AppMeasurementDynamiteService appMeasurementDynamiteService, pc pcVar, String str, String str2) {
        this.e = appMeasurementDynamiteService;
        this.b = pcVar;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.F().a(this.b, this.c, this.d);
    }
}
