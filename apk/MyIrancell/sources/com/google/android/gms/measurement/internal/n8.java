package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class n8 implements Runnable {
    private final /* synthetic */ w3 b;
    private final /* synthetic */ o8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n8(o8 o8Var, w3 w3Var) {
        this.c = o8Var;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            o8.a(this.c, false);
            if (!this.c.c.B()) {
                this.c.c.k().B().a("Connected to service");
                this.c.c.a(this.b);
            }
        }
    }
}
