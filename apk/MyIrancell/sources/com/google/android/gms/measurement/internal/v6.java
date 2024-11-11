package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class v6 implements Runnable {
    private final /* synthetic */ k6 b;
    private final /* synthetic */ p6 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v6(p6 p6Var, k6 k6Var) {
        this.c = p6Var;
        this.b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.b);
    }
}
