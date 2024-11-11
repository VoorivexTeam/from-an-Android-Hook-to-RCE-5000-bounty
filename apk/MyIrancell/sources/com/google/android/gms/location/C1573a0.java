package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.AbstractC0927n;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.internal.location.C1182r;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.location.C1572a;
import p000.C2908ls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.location.a0 */
/* loaded from: classes.dex */
public final class C1573a0 extends AbstractC0927n<C1182r, C1574b> {

    /* renamed from: d */
    private final /* synthetic */ zzbd f7095d;

    /* renamed from: e */
    private final /* synthetic */ C0915k f7096e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573a0(C1572a c1572a, C0915k c0915k, zzbd zzbdVar, C0915k c0915k2) {
        super(c0915k);
        this.f7095d = zzbdVar;
        this.f7096e = c0915k2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC0927n
    /* renamed from: a */
    public final /* synthetic */ void mo6816a(C1182r c1182r, C2908ls c2908ls) {
        c1182r.m7496a(this.f7095d, this.f7096e, new C1572a.a(c2908ls));
    }
}
