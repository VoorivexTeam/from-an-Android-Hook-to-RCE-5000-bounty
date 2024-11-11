package com.google.android.gms.common.api.internal;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d0 implements Runnable {
    private final /* synthetic */ e0 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.d dVar;
        Context context;
        dVar = this.b.d;
        context = this.b.c;
        dVar.a(context);
    }
}
