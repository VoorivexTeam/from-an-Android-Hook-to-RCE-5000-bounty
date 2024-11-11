package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i8 implements Runnable {
    private final /* synthetic */ boolean b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ zzan d;
    private final /* synthetic */ zzm e;
    private final /* synthetic */ String f;
    private final /* synthetic */ w7 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i8(w7 w7Var, boolean z, boolean z2, zzan zzanVar, zzm zzmVar, String str) {
        this.g = w7Var;
        this.b = z;
        this.c = z2;
        this.d = zzanVar;
        this.e = zzmVar;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        w3Var = this.g.d;
        if (w3Var == null) {
            this.g.k().t().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.b) {
            this.g.a(w3Var, this.c ? null : this.d, this.e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f)) {
                    w3Var.a(this.d, this.e);
                } else {
                    w3Var.a(this.d, this.f, this.g.k().C());
                }
            } catch (RemoteException e) {
                this.g.k().t().a("Failed to send event to the service", e);
            }
        }
        this.g.J();
    }
}
