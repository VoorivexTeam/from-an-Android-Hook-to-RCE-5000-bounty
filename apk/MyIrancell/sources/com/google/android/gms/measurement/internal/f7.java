package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f7 implements Runnable {
    private final /* synthetic */ long b;
    private final /* synthetic */ p6 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f7(p6 p6Var, long j) {
        this.c = p6Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.j().p.a(this.b);
        this.c.k().A().a("Minimum session duration set", Long.valueOf(this.b));
    }
}
