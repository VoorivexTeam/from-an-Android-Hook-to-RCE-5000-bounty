package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x0 extends k1 {
    private WeakReference<q0> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(q0 q0Var) {
        this.a = new WeakReference<>(q0Var);
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a() {
        q0 q0Var = this.a.get();
        if (q0Var == null) {
            return;
        }
        q0Var.o();
    }
}
