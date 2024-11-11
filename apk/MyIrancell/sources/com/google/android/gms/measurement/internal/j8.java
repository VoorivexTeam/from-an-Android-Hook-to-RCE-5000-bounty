package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.pc;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j8 implements Runnable {
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ zzm d;
    private final /* synthetic */ pc e;
    private final /* synthetic */ w7 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j8(w7 w7Var, String str, String str2, zzm zzmVar, pc pcVar) {
        this.f = w7Var;
        this.b = str;
        this.c = str2;
        this.d = zzmVar;
        this.e = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                w3Var = this.f.d;
                if (w3Var == null) {
                    this.f.k().t().a("Failed to get conditional properties; not connected to service", this.b, this.c);
                } else {
                    arrayList = z9.b(w3Var.a(this.b, this.c, this.d));
                    this.f.J();
                }
            } catch (RemoteException e) {
                this.f.k().t().a("Failed to get conditional properties; remote exception", this.b, this.c, e);
            }
        } finally {
            this.f.i().a(this.e, arrayList);
        }
    }
}
