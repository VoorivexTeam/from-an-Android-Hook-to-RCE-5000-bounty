package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0885d;
import com.google.android.gms.common.api.internal.C0899g;

/* renamed from: com.google.android.gms.common.api.internal.e2 */
/* loaded from: classes.dex */
public final class C0893e2<A extends AbstractC0885d<? extends InterfaceC0982m, C0859a.b>> extends AbstractC0941q1 {

    /* renamed from: a */
    private final A f5797a;

    public C0893e2(int i, A a) {
        super(i);
        this.f5797a = a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final void mo6681a(Status status) {
        this.f5797a.m6639c(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final void mo6682a(C0874a3 c0874a3, boolean z) {
        c0874a3.m6610a(this.f5797a, z);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final void mo6683a(C0899g.a<?> aVar) {
        try {
            this.f5797a.m6637b(aVar.m6750f());
        } catch (RuntimeException e) {
            mo6684a(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final void mo6684a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f5797a.m6639c(new Status(10, sb.toString()));
    }
}
