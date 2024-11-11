package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class x5 implements Runnable {
    private final /* synthetic */ zzkq b;
    private final /* synthetic */ zzm c;
    private final /* synthetic */ o5 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x5(o5 o5Var, zzkq zzkqVar, zzm zzmVar) {
        this.d = o5Var;
        this.b = zzkqVar;
        this.c = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o9 o9Var;
        o9 o9Var2;
        o9 o9Var3;
        o9Var = this.d.a;
        o9Var.r();
        if (this.b.zza() == null) {
            o9Var3 = this.d.a;
            o9Var3.b(this.b, this.c);
        } else {
            o9Var2 = this.d.a;
            o9Var2.a(this.b, this.c);
        }
    }
}
