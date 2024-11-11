package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g7 implements Runnable {
    private final /* synthetic */ boolean b;
    private final /* synthetic */ p6 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g7(p6 p6Var, boolean z) {
        this.c = p6Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean c = this.c.a.c();
        boolean b = this.c.a.b();
        this.c.a.a(this.b);
        if (b == this.b) {
            this.c.a.k().B().a("Default data collection state already set to", Boolean.valueOf(this.b));
        }
        if (this.c.a.c() == c || this.c.a.c() != this.c.a.b()) {
            this.c.a.k().y().a("Default data collection is different than actual status", Boolean.valueOf(this.b), Boolean.valueOf(c));
        }
        this.c.M();
    }
}
