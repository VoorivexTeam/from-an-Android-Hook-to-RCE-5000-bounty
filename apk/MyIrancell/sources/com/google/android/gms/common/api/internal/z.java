package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements w0 {
    private final z0 a;
    private boolean b = false;

    public z(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T a(T t) {
        try {
            this.a.n.y.a(t);
            q0 q0Var = this.a.n;
            a.f fVar = q0Var.p.get(t.h());
            com.google.android.gms.common.internal.u.a(fVar, "Appropriate Api was not requested.");
            if (fVar.a() || !this.a.g.containsKey(t.h())) {
                boolean z = fVar instanceof com.google.android.gms.common.internal.v;
                A a = fVar;
                if (z) {
                    a = ((com.google.android.gms.common.internal.v) fVar).F();
                }
                t.b(a);
            } else {
                t.c(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.a.a(new c0(this, this));
        }
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void a(int i) {
        this.a.a((ConnectionResult) null);
        this.a.o.a(i, this.b);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T b(T t) {
        a((z) t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean b() {
        if (this.b) {
            return false;
        }
        if (!this.a.n.m()) {
            this.a.a((ConnectionResult) null);
            return true;
        }
        this.b = true;
        Iterator<w1> it = this.a.n.x.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void c() {
        if (this.b) {
            this.b = false;
            this.a.a(new b0(this, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.b) {
            this.b = false;
            this.a.n.y.a();
            b();
        }
    }
}
