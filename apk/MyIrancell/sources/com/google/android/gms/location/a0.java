package com.google.android.gms.location;

import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.location.a;
import defpackage.ls;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 extends com.google.android.gms.common.api.internal.n<com.google.android.gms.internal.location.r, b> {
    private final /* synthetic */ zzbd d;
    private final /* synthetic */ com.google.android.gms.common.api.internal.k e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(a aVar, com.google.android.gms.common.api.internal.k kVar, zzbd zzbdVar, com.google.android.gms.common.api.internal.k kVar2) {
        super(kVar);
        this.d = zzbdVar;
        this.e = kVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.n
    public final /* synthetic */ void a(com.google.android.gms.internal.location.r rVar, ls lsVar) {
        rVar.a(this.d, this.e, new a.BinderC0049a(lsVar));
    }
}
