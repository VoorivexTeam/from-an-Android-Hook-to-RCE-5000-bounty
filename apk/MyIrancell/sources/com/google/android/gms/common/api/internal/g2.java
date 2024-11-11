package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.g;
import defpackage.ls;

/* loaded from: classes.dex */
public final class g2<ResultT> extends u0 {
    private final r<a.b, ResultT> a;
    private final ls<ResultT> b;
    private final p c;

    public g2(int i, r<a.b, ResultT> rVar, ls<ResultT> lsVar, p pVar) {
        super(i);
        this.b = lsVar;
        this.a = rVar;
        this.c = pVar;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(Status status) {
        this.b.b(this.c.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(a3 a3Var, boolean z) {
        a3Var.a(this.b, z);
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(g.a<?> aVar) {
        Status a;
        try {
            this.a.a(aVar.f(), this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a = q1.a(e2);
            a(a);
        } catch (RuntimeException e3) {
            a(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(RuntimeException runtimeException) {
        this.b.b(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final Feature[] b(g.a<?> aVar) {
        return this.a.b();
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final boolean c(g.a<?> aVar) {
        return this.a.a();
    }
}
