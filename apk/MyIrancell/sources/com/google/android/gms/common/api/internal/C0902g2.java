package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0899g;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.api.internal.g2 */
/* loaded from: classes.dex */
public final class C0902g2<ResultT> extends AbstractC0956u0 {

    /* renamed from: a */
    private final AbstractC0943r<C0859a.b, ResultT> f5848a;

    /* renamed from: b */
    private final C2908ls<ResultT> f5849b;

    /* renamed from: c */
    private final InterfaceC0935p f5850c;

    public C0902g2(int i, AbstractC0943r<C0859a.b, ResultT> abstractC0943r, C2908ls<ResultT> c2908ls, InterfaceC0935p interfaceC0935p) {
        super(i);
        this.f5849b = c2908ls;
        this.f5848a = abstractC0943r;
        this.f5850c = interfaceC0935p;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final void mo6681a(Status status) {
        this.f5849b.m13927b(this.f5850c.mo6604a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final void mo6682a(C0874a3 c0874a3, boolean z) {
        c0874a3.m6611a(this.f5849b, z);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final void mo6683a(C0899g.a<?> aVar) {
        Status m6844a;
        try {
            this.f5848a.mo6848a(aVar.m6750f(), this.f5849b);
        } catch (DeadObjectException e) {
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
    public final void mo6684a(RuntimeException runtimeException) {
        this.f5849b.m13927b(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0956u0
    /* renamed from: b */
    public final Feature[] mo6769b(C0899g.a<?> aVar) {
        return this.f5848a.m6850b();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0956u0
    /* renamed from: c */
    public final boolean mo6770c(C0899g.a<?> aVar) {
        return this.f5848a.m6849a();
    }
}
