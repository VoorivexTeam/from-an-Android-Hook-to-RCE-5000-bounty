package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r9 implements Runnable {
    private final /* synthetic */ u9 b;
    private final /* synthetic */ o9 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r9(o9 o9Var, u9 u9Var) {
        this.c = o9Var;
        this.b = u9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.b);
        this.c.a();
    }
}
