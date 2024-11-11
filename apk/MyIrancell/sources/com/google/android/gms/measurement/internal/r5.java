package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class r5 implements Callable<List<zzv>> {
    private final /* synthetic */ zzm a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ o5 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r5(o5 o5Var, zzm zzmVar, String str, String str2) {
        this.d = o5Var;
        this.a = zzmVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzv> call() {
        o9 o9Var;
        o9 o9Var2;
        o9Var = this.d.a;
        o9Var.r();
        o9Var2 = this.d.a;
        return o9Var2.f().b(this.a.b, this.b, this.c);
    }
}
