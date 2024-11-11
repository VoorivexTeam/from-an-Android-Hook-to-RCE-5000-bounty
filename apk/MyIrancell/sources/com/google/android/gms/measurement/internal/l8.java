package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.pc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l8 implements Runnable {
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ zzm e;
    private final /* synthetic */ pc f;
    private final /* synthetic */ w7 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l8(w7 w7Var, String str, String str2, boolean z, zzm zzmVar, pc pcVar) {
        this.g = w7Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = zzmVar;
        this.f = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        Bundle bundle = new Bundle();
        try {
            try {
                w3Var = this.g.d;
                if (w3Var == null) {
                    this.g.k().t().a("Failed to get user properties; not connected to service", this.b, this.c);
                } else {
                    bundle = z9.a(w3Var.a(this.b, this.c, this.d, this.e));
                    this.g.J();
                }
            } catch (RemoteException e) {
                this.g.k().t().a("Failed to get user properties; remote exception", this.b, e);
            }
        } finally {
            this.g.i().a(this.f, bundle);
        }
    }
}
