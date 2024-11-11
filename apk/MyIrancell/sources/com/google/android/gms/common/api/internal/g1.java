package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
final class g1 implements Runnable {
    private final /* synthetic */ h1 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(h1 h1Var) {
        this.b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        fVar = this.b.a.b;
        fVar.b();
    }
}
