package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
/* loaded from: classes.dex */
public final class C0842j extends AbstractC0844l<Status> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0842j(AbstractC0864f abstractC0864f) {
        super(abstractC0864f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ InterfaceC0982m mo6471a(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0885d
    /* renamed from: a */
    protected final /* synthetic */ void mo6472a(C0840h c0840h) {
        C0840h c0840h2 = c0840h;
        ((InterfaceC0850r) c0840h2.m7070A()).mo6481a(new BinderC0843k(this), c0840h2.m6461F());
    }
}
