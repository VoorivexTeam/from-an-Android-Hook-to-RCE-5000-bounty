package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s9 implements Callable<String> {
    private final /* synthetic */ zzm a;
    private final /* synthetic */ o9 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s9(o9 o9Var, zzm zzmVar) {
        this.b = o9Var;
        this.a = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        e5 c = this.b.c(this.a);
        if (c != null) {
            return c.m();
        }
        this.b.k().w().a("App info was null when attempting to get app instance id");
        return null;
    }
}
