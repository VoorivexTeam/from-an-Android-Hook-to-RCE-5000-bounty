package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class p4 implements Runnable {
    private final /* synthetic */ boolean b;
    private final /* synthetic */ q4 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p4(q4 q4Var, boolean z) {
        this.c = q4Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o9 o9Var;
        o9Var = this.c.a;
        o9Var.a(this.b);
    }
}
