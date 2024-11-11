package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
final class m2 implements Runnable {
    private final n2 b;
    final /* synthetic */ l2 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2(l2 l2Var, n2 n2Var) {
        this.c = l2Var;
        this.b = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.c) {
            ConnectionResult a = this.b.a();
            if (a.m()) {
                l2 l2Var = this.c;
                l2Var.b.startActivityForResult(GoogleApiActivity.a(l2Var.a(), a.l(), this.b.b(), false), 1);
            } else if (this.c.f.c(a.j())) {
                l2 l2Var2 = this.c;
                l2Var2.f.a(l2Var2.a(), this.c.b, a.j(), 2, this.c);
            } else {
                if (a.j() != 18) {
                    this.c.a(a, this.b.b());
                    return;
                }
                Dialog a2 = com.google.android.gms.common.c.a(this.c.a(), this.c);
                l2 l2Var3 = this.c;
                l2Var3.f.a(l2Var3.a().getApplicationContext(), new o2(this, a2));
            }
        }
    }
}
