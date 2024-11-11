package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class s5 implements Callable<List<w9>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ o5 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s5(o5 o5Var, String str, String str2, String str3) {
        this.d = o5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<w9> call() {
        o9 o9Var;
        o9 o9Var2;
        o9Var = this.d.a;
        o9Var.r();
        o9Var2 = this.d.a;
        return o9Var2.f().a(this.a, this.b, this.c);
    }
}
