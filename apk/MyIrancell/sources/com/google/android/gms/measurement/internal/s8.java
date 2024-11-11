package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
final class s8 implements Runnable {
    private final /* synthetic */ o8 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s8(o8 o8Var) {
        this.b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.b.c;
        Context l = this.b.c.l();
        this.b.c.d();
        w7Var.a(new ComponentName(l, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
