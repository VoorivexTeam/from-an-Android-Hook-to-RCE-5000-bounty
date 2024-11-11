package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.AbstractC0951t;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.internal.location.C1182r;
import com.google.android.gms.internal.location.InterfaceC1164d;
import p000.C2908ls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.location.b0 */
/* loaded from: classes.dex */
public final class C1575b0 extends AbstractC0951t<C1182r, C1574b> {

    /* renamed from: b */
    private final /* synthetic */ C1572a f7097b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1575b0(C1572a c1572a, C0915k.a aVar) {
        super(aVar);
        this.f7097b = c1572a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC0951t
    /* renamed from: a */
    public final /* synthetic */ void mo6878a(C1182r c1182r, C2908ls c2908ls) {
        InterfaceC1164d m8964a;
        C1182r c1182r2 = c1182r;
        m8964a = this.f7097b.m8964a((C2908ls<Boolean>) c2908ls);
        try {
            c1182r2.m7495a(m6877a(), m8964a);
        } catch (RuntimeException e) {
            c2908ls.m13927b((Exception) e);
        }
    }
}
