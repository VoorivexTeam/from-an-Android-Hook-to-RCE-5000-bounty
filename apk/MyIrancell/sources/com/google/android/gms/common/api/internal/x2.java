package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.g;
import defpackage.vr;
import defpackage.yr;

/* loaded from: classes.dex */
public final class x2<O extends a.d> extends com.google.android.gms.common.api.e<O> {
    private final a.f j;
    private final q2 k;
    private final com.google.android.gms.common.internal.e l;
    private final a.AbstractC0041a<? extends yr, vr> m;

    public x2(Context context, com.google.android.gms.common.api.a<O> aVar, Looper looper, a.f fVar, q2 q2Var, com.google.android.gms.common.internal.e eVar, a.AbstractC0041a<? extends yr, vr> abstractC0041a) {
        super(context, aVar, looper);
        this.j = fVar;
        this.k = q2Var;
        this.l = eVar;
        this.m = abstractC0041a;
        this.i.a(this);
    }

    @Override // com.google.android.gms.common.api.e
    public final a.f a(Looper looper, g.a<O> aVar) {
        this.k.a(aVar);
        return this.j;
    }

    @Override // com.google.android.gms.common.api.e
    public final t1 a(Context context, Handler handler) {
        return new t1(context, handler, this.l, this.m);
    }

    public final a.f h() {
        return this.j;
    }
}
