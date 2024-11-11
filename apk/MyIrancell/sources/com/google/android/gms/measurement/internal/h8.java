package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h8 implements Runnable {
    private final /* synthetic */ boolean b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ zzv d;
    private final /* synthetic */ zzm e;
    private final /* synthetic */ zzv f;
    private final /* synthetic */ w7 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h8(w7 w7Var, boolean z, boolean z2, zzv zzvVar, zzm zzmVar, zzv zzvVar2) {
        this.g = w7Var;
        this.b = z;
        this.c = z2;
        this.d = zzvVar;
        this.e = zzmVar;
        this.f = zzvVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        w3Var = this.g.d;
        if (w3Var == null) {
            this.g.k().t().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.b) {
            this.g.a(w3Var, this.c ? null : this.d, this.e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f.b)) {
                    w3Var.a(this.d, this.e);
                } else {
                    w3Var.a(this.d);
                }
            } catch (RemoteException e) {
                this.g.k().t().a("Failed to send conditional user property to the service", e);
            }
        }
        this.g.J();
    }
}
