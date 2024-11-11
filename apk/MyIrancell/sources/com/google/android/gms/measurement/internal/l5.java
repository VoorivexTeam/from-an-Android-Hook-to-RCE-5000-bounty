package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l5 implements Runnable {
    private final /* synthetic */ m6 b;
    private final /* synthetic */ j5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l5(j5 j5Var, m6 m6Var) {
        this.c = j5Var;
        this.b = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.b);
        this.c.a();
    }
}
