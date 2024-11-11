package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.pc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b8 implements Runnable {
    private final /* synthetic */ zzm b;
    private final /* synthetic */ pc c;
    private final /* synthetic */ w7 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b8(w7 w7Var, zzm zzmVar, pc pcVar) {
        this.d = w7Var;
        this.b = zzmVar;
        this.c = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        String str = null;
        try {
            try {
                w3Var = this.d.d;
                if (w3Var == null) {
                    this.d.k().t().a("Failed to get app instance id");
                } else {
                    str = w3Var.b(this.b);
                    if (str != null) {
                        this.d.p().a(str);
                        this.d.j().l.a(str);
                    }
                    this.d.J();
                }
            } catch (RemoteException e) {
                this.d.k().t().a("Failed to get app instance id", e);
            }
        } finally {
            this.d.i().a(this.c, (String) null);
        }
    }
}
