package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t7 implements Runnable {
    private final /* synthetic */ s7 b;
    private final /* synthetic */ long c;
    private final /* synthetic */ r7 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t7(r7 r7Var, s7 s7Var, long j) {
        this.d = r7Var;
        this.b = s7Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.b, false, this.c);
        r7 r7Var = this.d;
        r7Var.c = null;
        r7Var.r().a((s7) null);
    }
}
