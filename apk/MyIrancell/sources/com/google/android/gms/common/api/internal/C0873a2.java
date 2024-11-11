package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.a2 */
/* loaded from: classes.dex */
public final class C0873a2 implements InterfaceC0883c2 {

    /* renamed from: a */
    private final /* synthetic */ C0878b2 f5736a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0873a2(C0878b2 c0878b2) {
        this.f5736a = c0878b2;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0883c2
    /* renamed from: a */
    public final void mo6606a(BasePendingResult<?> basePendingResult) {
        this.f5736a.f5747a.remove(basePendingResult);
        basePendingResult.m6589d();
    }
}
