package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.k;
import defpackage.ls;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b0 extends com.google.android.gms.common.api.internal.t<com.google.android.gms.internal.location.r, b> {
    private final /* synthetic */ a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a aVar, k.a aVar2) {
        super(aVar2);
        this.b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.t
    public final /* synthetic */ void a(com.google.android.gms.internal.location.r rVar, ls lsVar) {
        com.google.android.gms.internal.location.d a;
        com.google.android.gms.internal.location.r rVar2 = rVar;
        a = this.b.a((ls<Boolean>) lsVar);
        try {
            rVar2.a(a(), a);
        } catch (RuntimeException e) {
            lsVar.b((Exception) e);
        }
    }
}
