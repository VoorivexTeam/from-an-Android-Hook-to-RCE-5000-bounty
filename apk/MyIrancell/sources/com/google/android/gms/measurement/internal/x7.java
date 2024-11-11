package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x7 implements Runnable {
    private final /* synthetic */ boolean b;
    private final /* synthetic */ zzkq c;
    private final /* synthetic */ zzm d;
    private final /* synthetic */ w7 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x7(w7 w7Var, boolean z, zzkq zzkqVar, zzm zzmVar) {
        this.e = w7Var;
        this.b = z;
        this.c = zzkqVar;
        this.d = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var;
        w3Var = this.e.d;
        if (w3Var == null) {
            this.e.k().t().a("Discarding data. Failed to set user property");
        } else {
            this.e.a(w3Var, this.b ? null : this.c, this.d);
            this.e.J();
        }
    }
}
