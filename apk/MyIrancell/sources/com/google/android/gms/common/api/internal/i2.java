package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.k;
import defpackage.ls;

/* loaded from: classes.dex */
public final class i2 extends f2<Boolean> {
    private final k.a<?> b;

    public i2(k.a<?> aVar, ls<Boolean> lsVar) {
        super(4, lsVar);
        this.b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final /* bridge */ /* synthetic */ void a(a3 a3Var, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final Feature[] b(g.a<?> aVar) {
        p1 p1Var = aVar.i().get(this.b);
        if (p1Var == null) {
            return null;
        }
        return p1Var.a.c();
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final boolean c(g.a<?> aVar) {
        p1 p1Var = aVar.i().get(this.b);
        return p1Var != null && p1Var.a.d();
    }

    @Override // com.google.android.gms.common.api.internal.f2
    public final void d(g.a<?> aVar) {
        p1 remove = aVar.i().remove(this.b);
        if (remove == null) {
            this.a.b((ls<T>) false);
        } else {
            remove.b.a(aVar.f(), this.a);
            remove.a.a();
        }
    }
}
