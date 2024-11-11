package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class p8 implements Runnable {
    private final /* synthetic */ w3 b;
    private final /* synthetic */ o8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p8(o8 o8Var, w3 w3Var) {
        this.c = o8Var;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            o8.a(this.c, false);
            if (!this.c.c.B()) {
                this.c.c.k().A().a("Connected to remote service");
                this.c.c.a(this.b);
            }
        }
    }
}
