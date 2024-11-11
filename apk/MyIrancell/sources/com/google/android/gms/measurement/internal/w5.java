package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class w5 implements Runnable {
    private final /* synthetic */ zzan b;
    private final /* synthetic */ zzm c;
    private final /* synthetic */ o5 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w5(o5 o5Var, zzan zzanVar, zzm zzmVar) {
        this.d = o5Var;
        this.b = zzanVar;
        this.c = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o9 o9Var;
        o9 o9Var2;
        zzan b = this.d.b(this.b, this.c);
        o9Var = this.d.a;
        o9Var.r();
        o9Var2 = this.d.a;
        o9Var2.a(b, this.c);
    }
}
