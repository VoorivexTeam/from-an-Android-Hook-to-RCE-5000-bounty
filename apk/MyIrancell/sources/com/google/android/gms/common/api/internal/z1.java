package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class z1 implements Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.m b;
    private final /* synthetic */ w1 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(w1 w1Var, com.google.android.gms.common.api.m mVar) {
        this.c = w1Var;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        y1 y1Var;
        y1 y1Var2;
        WeakReference weakReference2;
        com.google.android.gms.common.api.p pVar;
        y1 y1Var3;
        y1 y1Var4;
        WeakReference weakReference3;
        try {
            try {
                BasePendingResult.p.set(true);
                pVar = this.c.a;
                com.google.android.gms.common.api.h a = pVar.a((com.google.android.gms.common.api.p) this.b);
                y1Var3 = this.c.g;
                y1Var4 = this.c.g;
                y1Var3.sendMessage(y1Var4.obtainMessage(0, a));
                BasePendingResult.p.set(false);
                w1 w1Var = this.c;
                w1.b(this.b);
                weakReference3 = this.c.f;
                com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) weakReference3.get();
                if (fVar != null) {
                    fVar.a(this.c);
                }
            } catch (RuntimeException e) {
                y1Var = this.c.g;
                y1Var2 = this.c.g;
                y1Var.sendMessage(y1Var2.obtainMessage(1, e));
                BasePendingResult.p.set(false);
                w1 w1Var2 = this.c;
                w1.b(this.b);
                weakReference2 = this.c.f;
                com.google.android.gms.common.api.f fVar2 = (com.google.android.gms.common.api.f) weakReference2.get();
                if (fVar2 != null) {
                    fVar2.a(this.c);
                }
            }
        } catch (Throwable th) {
            BasePendingResult.p.set(false);
            w1 w1Var3 = this.c;
            w1.b(this.b);
            weakReference = this.c.f;
            com.google.android.gms.common.api.f fVar3 = (com.google.android.gms.common.api.f) weakReference.get();
            if (fVar3 != null) {
                fVar3.a(this.c);
            }
            throw th;
        }
    }
}
