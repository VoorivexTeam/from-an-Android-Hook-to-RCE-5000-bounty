package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class z5 implements Runnable {
    private final /* synthetic */ zzm b;
    private final /* synthetic */ o5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z5(o5 o5Var, zzm zzmVar) {
        this.c = o5Var;
        this.b = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o9 o9Var;
        o9 o9Var2;
        o9Var = this.c.a;
        o9Var.r();
        o9Var2 = this.c.a;
        o9Var2.b(this.b);
    }
}
