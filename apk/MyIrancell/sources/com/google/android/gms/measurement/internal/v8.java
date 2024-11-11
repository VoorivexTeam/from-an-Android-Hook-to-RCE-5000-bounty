package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v8 implements Runnable {
    private final /* synthetic */ o9 b;
    private final /* synthetic */ Runnable c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v8(u8 u8Var, o9 o9Var, Runnable runnable) {
        this.b = o9Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.r();
        this.b.a(this.c);
        this.b.q();
    }
}
