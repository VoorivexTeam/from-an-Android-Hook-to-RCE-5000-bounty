package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n0 implements w0 {
    private final z0 a;

    public n0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void a() {
        Iterator<a.f> it = this.a.f.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.a.n.q = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void a(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T b(T t) {
        this.a.n.i.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void c() {
        this.a.h();
    }
}
