package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z7 implements Runnable {
    private final /* synthetic */ zzm b;
    private final /* synthetic */ w7 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z7(w7 w7Var, zzm zzmVar) {
        this.c = w7Var;
        this.b = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        w3Var = this.c.d;
        if (w3Var == null) {
            this.c.k().t().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            w3Var.c(this.b);
        } catch (RemoteException e) {
            this.c.k().t().a("Failed to reset data on the service: remote exception", e);
        }
        this.c.J();
    }
}
