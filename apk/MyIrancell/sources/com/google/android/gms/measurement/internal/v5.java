package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class v5 implements Runnable {
    private final /* synthetic */ zzan b;
    private final /* synthetic */ String c;
    private final /* synthetic */ o5 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v5(o5 o5Var, zzan zzanVar, String str) {
        this.d = o5Var;
        this.b = zzanVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o9 o9Var;
        o9 o9Var2;
        o9Var = this.d.a;
        o9Var.r();
        o9Var2 = this.d.a;
        o9Var2.a(this.b, this.c);
    }
}
