package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s1 implements Runnable {
    private final /* synthetic */ t1 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s1(t1 t1Var) {
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1 u1Var;
        u1Var = this.b.g;
        u1Var.b(new ConnectionResult(4));
    }
}
