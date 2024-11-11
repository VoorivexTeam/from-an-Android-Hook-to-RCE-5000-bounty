package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes.dex */
final class o2 extends k1 {
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ m2 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2(m2 m2Var, Dialog dialog) {
        this.b = m2Var;
        this.a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a() {
        this.b.c.g();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
