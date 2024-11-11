package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class y5 implements Callable<byte[]> {
    private final /* synthetic */ zzan a;
    private final /* synthetic */ String b;
    private final /* synthetic */ o5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y5(o5 o5Var, zzan zzanVar, String str) {
        this.c = o5Var;
        this.a = zzanVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        o9 o9Var;
        o9 o9Var2;
        o9Var = this.c.a;
        o9Var.r();
        o9Var2 = this.c.a;
        o9Var2.j().a(this.a, this.b);
        throw null;
    }
}
