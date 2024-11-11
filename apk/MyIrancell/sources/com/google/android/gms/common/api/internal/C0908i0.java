package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
/* loaded from: classes.dex */
final class C0908i0 extends AbstractC0972y0 {

    /* renamed from: b */
    private final /* synthetic */ ConnectionResult f5861b;

    /* renamed from: c */
    private final /* synthetic */ C0896f0 f5862c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0908i0(C0896f0 c0896f0, InterfaceC0964w0 interfaceC0964w0, ConnectionResult connectionResult) {
        super(interfaceC0964w0);
        this.f5862c = c0896f0;
        this.f5861b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0972y0
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo6618a() {
        this.f5862c.f5803d.m6652b(this.f5861b);
    }
}
