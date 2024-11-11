package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class r8 implements Runnable {
    private final /* synthetic */ o8 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r8(o8 o8Var) {
        this.b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7.a(this.b.c, (w3) null);
        this.b.c.L();
    }
}
