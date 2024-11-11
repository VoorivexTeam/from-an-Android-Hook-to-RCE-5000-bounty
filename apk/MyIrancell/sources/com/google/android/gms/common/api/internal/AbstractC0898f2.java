package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0860b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0899g;
import p000.C2908ls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.f2 */
/* loaded from: classes.dex */
public abstract class AbstractC0898f2<T> extends AbstractC0956u0 {

    /* renamed from: a */
    protected final C2908ls<T> f5805a;

    public AbstractC0898f2(int i, C2908ls<T> c2908ls) {
        super(i);
        this.f5805a = c2908ls;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public void mo6681a(Status status) {
        this.f5805a.m13927b(new C0860b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final void mo6683a(C0899g.a<?> aVar) {
        Status m6844a;
        Status m6844a2;
        try {
            mo6691d(aVar);
        } catch (DeadObjectException e) {
            m6844a2 = AbstractC0941q1.m6844a(e);
            mo6681a(m6844a2);
            throw e;
        } catch (RemoteException e2) {
            m6844a = AbstractC0941q1.m6844a(e2);
            mo6681a(m6844a);
        } catch (RuntimeException e3) {
            mo6684a(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public void mo6684a(RuntimeException runtimeException) {
        this.f5805a.m13927b(runtimeException);
    }

    /* renamed from: d */
    protected abstract void mo6691d(C0899g.a<?> aVar);
}
