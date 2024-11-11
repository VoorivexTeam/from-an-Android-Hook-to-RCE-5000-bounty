package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.m;

/* loaded from: classes.dex */
public abstract class d<R extends com.google.android.gms.common.api.m, A extends a.b> extends BasePendingResult<R> implements e<R> {
    private final a.c<A> q;
    private final com.google.android.gms.common.api.a<?> r;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.google.android.gms.common.api.a<?> aVar, com.google.android.gms.common.api.f fVar) {
        super(fVar);
        com.google.android.gms.common.internal.u.a(fVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.u.a(aVar, "Api must not be null");
        this.q = (a.c<A>) aVar.a();
        this.r = aVar;
    }

    private void a(RemoteException remoteException) {
        c(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void a(A a);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.e
    public /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((d<R, A>) obj);
    }

    public final void b(A a) {
        if (a instanceof com.google.android.gms.common.internal.v) {
            a = ((com.google.android.gms.common.internal.v) a).F();
        }
        try {
            a((d<R, A>) a);
        } catch (DeadObjectException e) {
            a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    protected void b(R r) {
    }

    public final void c(Status status) {
        com.google.android.gms.common.internal.u.a(!status.m(), "Failed result must not be success");
        R a = a(status);
        a((d<R, A>) a);
        b((d<R, A>) a);
    }

    public final com.google.android.gms.common.api.a<?> g() {
        return this.r;
    }

    public final a.c<A> h() {
        return this.q;
    }
}
