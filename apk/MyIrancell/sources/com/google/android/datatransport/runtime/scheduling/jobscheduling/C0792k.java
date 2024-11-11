package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p000.InterfaceC3132qm;
import p000.InterfaceC3365vn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0792k implements InterfaceC3365vn.a {

    /* renamed from: a */
    private final InterfaceC3132qm f5427a;

    private C0792k(InterfaceC3132qm interfaceC3132qm) {
        this.f5427a = interfaceC3132qm;
    }

    /* renamed from: a */
    public static InterfaceC3365vn.a m6323a(InterfaceC3132qm interfaceC3132qm) {
        return new C0792k(interfaceC3132qm);
    }

    @Override // p000.InterfaceC3365vn.a
    /* renamed from: e */
    public Object mo6321e() {
        return Integer.valueOf(this.f5427a.mo14375b());
    }
}
