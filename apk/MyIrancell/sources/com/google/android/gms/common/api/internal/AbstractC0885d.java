package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.C0859a.b;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.C1059v;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC0885d<R extends InterfaceC0982m, A extends C0859a.b> extends BasePendingResult<R> implements InterfaceC0890e<R> {

    /* renamed from: q */
    private final C0859a.c<A> f5764q;

    /* renamed from: r */
    private final C0859a<?> f5765r;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0885d(C0859a<?> c0859a, AbstractC0864f abstractC0864f) {
        super(abstractC0864f);
        C1057u.m7287a(abstractC0864f, "GoogleApiClient must not be null");
        C1057u.m7287a(c0859a, "Api must not be null");
        this.f5764q = (C0859a.c<A>) c0859a.m6502a();
        this.f5765r = c0859a;
    }

    /* renamed from: a */
    private void m6635a(RemoteException remoteException) {
        m6639c(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* renamed from: a */
    protected abstract void mo6472a(A a);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.InterfaceC0890e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo6636a(Object obj) {
        super.m6585a((AbstractC0885d<R, A>) obj);
    }

    /* renamed from: b */
    public final void m6637b(A a) {
        if (a instanceof C1059v) {
            a = ((C1059v) a).m7302F();
        }
        try {
            mo6472a((AbstractC0885d<R, A>) a);
        } catch (DeadObjectException e) {
            m6635a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            m6635a(e2);
        }
    }

    /* renamed from: b */
    protected void m6638b(R r) {
    }

    /* renamed from: c */
    public final void m6639c(Status status) {
        C1057u.m7294a(!status.m6500m(), "Failed result must not be success");
        R mo6471a = mo6471a(status);
        m6585a((AbstractC0885d<R, A>) mo6471a);
        m6638b((AbstractC0885d<R, A>) mo6471a);
    }

    /* renamed from: g */
    public final C0859a<?> m6640g() {
        return this.f5765r;
    }

    /* renamed from: h */
    public final C0859a.c<A> m6641h() {
        return this.f5764q;
    }
}
