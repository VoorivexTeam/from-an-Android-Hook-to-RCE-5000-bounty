package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.location.InterfaceC1576c;

/* renamed from: com.google.android.gms.internal.location.q */
/* loaded from: classes.dex */
final class C1181q implements C0915k.b<InterfaceC1576c> {

    /* renamed from: a */
    private final /* synthetic */ Location f6443a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1181q(BinderC1180p binderC1180p, Location location) {
        this.f6443a = location;
    }

    @Override // com.google.android.gms.common.api.internal.C0915k.b
    /* renamed from: a */
    public final void mo6791a() {
    }

    @Override // com.google.android.gms.common.api.internal.C0915k.b
    /* renamed from: a */
    public final /* synthetic */ void mo6792a(InterfaceC1576c interfaceC1576c) {
        interfaceC1576c.m8967a(this.f6443a);
    }
}
