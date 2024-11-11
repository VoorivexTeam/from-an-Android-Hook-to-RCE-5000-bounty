package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v0 implements com.google.android.gms.common.api.n<Status> {
    private final /* synthetic */ q a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ com.google.android.gms.common.api.f c;
    private final /* synthetic */ q0 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(q0 q0Var, q qVar, boolean z, com.google.android.gms.common.api.f fVar) {
        this.d = q0Var;
        this.a = qVar;
        this.b = z;
        this.c = fVar;
    }

    @Override // com.google.android.gms.common.api.n
    public final /* synthetic */ void a(Status status) {
        Context context;
        Status status2 = status;
        context = this.d.g;
        com.google.android.gms.auth.api.signin.internal.b.a(context).e();
        if (status2.m() && this.d.j()) {
            this.d.k();
        }
        this.a.a((q) status2);
        if (this.b) {
            this.c.d();
        }
    }
}
