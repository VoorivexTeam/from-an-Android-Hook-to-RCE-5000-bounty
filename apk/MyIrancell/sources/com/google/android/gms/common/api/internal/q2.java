package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public final class q2 implements f.b, f.c {
    public final com.google.android.gms.common.api.a<?> a;
    private final boolean b;
    private s2 c;

    public q2(com.google.android.gms.common.api.a<?> aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    private final void a() {
        com.google.android.gms.common.internal.u.a(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void a(int i) {
        a();
        this.c.a(i);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(ConnectionResult connectionResult) {
        a();
        this.c.a(connectionResult, this.a, this.b);
    }

    public final void a(s2 s2Var) {
        this.c = s2Var;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(Bundle bundle) {
        a();
        this.c.b(bundle);
    }
}
