package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class j0 extends com.google.android.gms.signin.internal.d {
    private final WeakReference<e0> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(e0 e0Var) {
        this.a = new WeakReference<>(e0Var);
    }

    @Override // com.google.android.gms.signin.internal.c
    public final void a(zak zakVar) {
        z0 z0Var;
        e0 e0Var = this.a.get();
        if (e0Var == null) {
            return;
        }
        z0Var = e0Var.a;
        z0Var.a(new m0(this, e0Var, e0Var, zakVar));
    }
}
