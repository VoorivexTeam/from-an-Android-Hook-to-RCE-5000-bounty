package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class q5 implements Runnable {
    private final /* synthetic */ zzv b;
    private final /* synthetic */ o5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q5(o5 o5Var, zzv zzvVar) {
        this.c = o5Var;
        this.b = zzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o9 o9Var;
        o9 o9Var2;
        o9 o9Var3;
        o9Var = this.c.a;
        o9Var.r();
        if (this.b.d.zza() == null) {
            o9Var3 = this.c.a;
            o9Var3.b(this.b);
        } else {
            o9Var2 = this.c.a;
            o9Var2.a(this.b);
        }
    }
}
