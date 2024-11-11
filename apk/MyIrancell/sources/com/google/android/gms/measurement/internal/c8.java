package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.pc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c8 implements Runnable {
    private final /* synthetic */ zzan b;
    private final /* synthetic */ String c;
    private final /* synthetic */ pc d;
    private final /* synthetic */ w7 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c8(w7 w7Var, zzan zzanVar, String str, pc pcVar) {
        this.e = w7Var;
        this.b = zzanVar;
        this.c = str;
        this.d = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        byte[] bArr = null;
        try {
            try {
                w3Var = this.e.d;
                if (w3Var == null) {
                    this.e.k().t().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = w3Var.a(this.b, this.c);
                    this.e.J();
                }
            } catch (RemoteException e) {
                this.e.k().t().a("Failed to send event to the service to bundle", e);
            }
        } finally {
            this.e.i().a(this.d, bArr);
        }
    }
}
