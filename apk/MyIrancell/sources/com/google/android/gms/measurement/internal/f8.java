package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f8 implements Runnable {
    private final /* synthetic */ zzm b;
    private final /* synthetic */ w7 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f8(w7 w7Var, zzm zzmVar) {
        this.c = w7Var;
        this.b = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        w3Var = this.c.d;
        if (w3Var == null) {
            this.c.k().t().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            w3Var.a(this.b);
            this.c.J();
        } catch (RemoteException e) {
            this.c.k().t().a("Failed to send measurementEnabled to the service", e);
        }
    }
}
