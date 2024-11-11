package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class a6 implements Callable<List<w9>> {
    private final /* synthetic */ zzm a;
    private final /* synthetic */ o5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a6(o5 o5Var, zzm zzmVar) {
        this.b = o5Var;
        this.a = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<w9> call() {
        o9 o9Var;
        o9 o9Var2;
        o9Var = this.b.a;
        o9Var.r();
        o9Var2 = this.b.a;
        return o9Var2.f().a(this.a.b);
    }
}
