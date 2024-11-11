package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.g;
import defpackage.ls;

/* loaded from: classes.dex */
public final class h2 extends f2<Void> {
    private final n<a.b, ?> b;
    private final t<a.b, ?> c;

    public h2(p1 p1Var, ls<Void> lsVar) {
        super(3, lsVar);
        this.b = p1Var.a;
        this.c = p1Var.b;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final /* bridge */ /* synthetic */ void a(a3 a3Var, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final Feature[] b(g.a<?> aVar) {
        return this.b.c();
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final boolean c(g.a<?> aVar) {
        return this.b.d();
    }

    @Override // com.google.android.gms.common.api.internal.f2
    public final void d(g.a<?> aVar) {
        this.b.a(aVar.f(), this.a);
        if (this.b.b() != null) {
            aVar.i().put(this.b.b(), new p1(this.b, this.c));
        }
    }
}
