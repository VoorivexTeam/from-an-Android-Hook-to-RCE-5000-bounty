package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class z8 implements Runnable {
    private final /* synthetic */ long b;
    private final /* synthetic */ x8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z8(x8 x8Var, long j) {
        this.c = x8Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.b);
    }
}
