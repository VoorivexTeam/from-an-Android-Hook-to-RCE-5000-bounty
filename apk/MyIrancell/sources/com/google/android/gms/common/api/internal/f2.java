package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import defpackage.ls;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f2<T> extends u0 {
    protected final ls<T> a;

    public f2(int i, ls<T> lsVar) {
        super(i);
        this.a = lsVar;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public void a(Status status) {
        this.a.b(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(g.a<?> aVar) {
        Status a;
        Status a2;
        try {
            d(aVar);
        } catch (DeadObjectException e) {
            a2 = q1.a(e);
            a(a2);
            throw e;
        } catch (RemoteException e2) {
            a = q1.a(e2);
            a(a);
        } catch (RuntimeException e3) {
            a(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public void a(RuntimeException runtimeException) {
        this.a.b(runtimeException);
    }

    protected abstract void d(g.a<?> aVar);
}
