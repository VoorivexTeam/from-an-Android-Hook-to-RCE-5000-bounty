package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* loaded from: classes.dex */
public final class i1<O extends a.d> extends a0 {
    private final com.google.android.gms.common.api.e<O> c;

    public i1(com.google.android.gms.common.api.e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.c = eVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T a(T t) {
        this.c.a((com.google.android.gms.common.api.e<O>) t);
        return t;
    }

    @Override // com.google.android.gms.common.api.f
    public final void a(w1 w1Var) {
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T b(T t) {
        this.c.b(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.f
    public final Context e() {
        return this.c.e();
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper f() {
        return this.c.g();
    }
}
