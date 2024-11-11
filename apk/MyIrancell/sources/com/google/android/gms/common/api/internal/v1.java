package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;

/* loaded from: classes.dex */
final class v1 implements Runnable {
    private final /* synthetic */ zak b;
    private final /* synthetic */ t1 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(t1 t1Var, zak zakVar) {
        this.c = t1Var;
        this.b = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.b);
    }
}
