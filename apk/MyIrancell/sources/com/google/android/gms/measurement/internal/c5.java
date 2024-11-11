package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class c5 implements Runnable {
    private final /* synthetic */ j5 b;
    private final /* synthetic */ f4 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c5(z4 z4Var, j5 j5Var, f4 f4Var) {
        this.b = j5Var;
        this.c = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.t() == null) {
            this.c.t().a("Install Referrer Reporter is null");
        } else {
            this.b.t().a();
        }
    }
}
