package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e8 implements Runnable {
    private final /* synthetic */ s7 b;
    private final /* synthetic */ w7 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e8(w7 w7Var, s7 s7Var) {
        this.c = w7Var;
        this.b = s7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        long j;
        String str;
        String str2;
        String packageName;
        w3Var = this.c.d;
        if (w3Var == null) {
            this.c.k().t().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.b == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.c.l().getPackageName();
            } else {
                j = this.b.c;
                str = this.b.a;
                str2 = this.b.b;
                packageName = this.c.l().getPackageName();
            }
            w3Var.a(j, str, str2, packageName);
            this.c.J();
        } catch (RemoteException e) {
            this.c.k().t().a("Failed to send current screen to the service", e);
        }
    }
}
