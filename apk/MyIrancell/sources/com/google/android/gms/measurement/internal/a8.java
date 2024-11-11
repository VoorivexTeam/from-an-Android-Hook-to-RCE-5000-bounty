package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a8 implements Runnable {
    private final /* synthetic */ zzm b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ w7 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a8(w7 w7Var, zzm zzmVar, boolean z) {
        this.d = w7Var;
        this.b = zzmVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        w3Var = this.d.d;
        if (w3Var == null) {
            this.d.k().t().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            w3Var.d(this.b);
            if (this.c) {
                this.d.t().D();
            }
            this.d.a(w3Var, (AbstractSafeParcelable) null, this.b);
            this.d.J();
        } catch (RemoteException e) {
            this.d.k().t().a("Failed to send app launch to the service", e);
        }
    }
}
