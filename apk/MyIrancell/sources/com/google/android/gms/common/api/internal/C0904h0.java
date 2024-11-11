package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC1020d;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* loaded from: classes.dex */
final class C0904h0 extends AbstractC0972y0 {

    /* renamed from: b */
    private final /* synthetic */ AbstractC1020d.c f5856b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904h0(C0896f0 c0896f0, InterfaceC0964w0 interfaceC0964w0, AbstractC1020d.c cVar) {
        super(interfaceC0964w0);
        this.f5856b = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0972y0
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo6618a() {
        this.f5856b.mo6763a(new ConnectionResult(16, null));
    }
}
