package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
final class r0 implements f.c {
    private final /* synthetic */ q a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(q0 q0Var, q qVar) {
        this.a = qVar;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(ConnectionResult connectionResult) {
        this.a.a((q) new Status(8));
    }
}
