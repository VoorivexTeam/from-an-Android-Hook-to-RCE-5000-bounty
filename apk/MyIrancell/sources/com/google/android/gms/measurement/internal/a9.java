package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a9 implements Runnable {
    private final /* synthetic */ long b;
    private final /* synthetic */ x8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a9(x8 x8Var, long j) {
        this.c = x8Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.b);
    }
}
