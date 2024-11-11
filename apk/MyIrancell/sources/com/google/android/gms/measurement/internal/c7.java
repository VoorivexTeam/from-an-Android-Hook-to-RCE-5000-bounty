package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c7 implements Runnable {
    private final /* synthetic */ boolean b;
    private final /* synthetic */ p6 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c7(p6 p6Var, boolean z) {
        this.c = p6Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.b);
    }
}
