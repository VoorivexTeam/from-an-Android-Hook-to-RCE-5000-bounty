package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p000.AbstractC3266tl;
import p000.InterfaceC3365vn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C0790i implements InterfaceC3365vn.a {

    /* renamed from: a */
    private final C0794m f5420a;

    /* renamed from: b */
    private final AbstractC3266tl f5421b;

    private C0790i(C0794m c0794m, AbstractC3266tl abstractC3266tl) {
        this.f5420a = c0794m;
        this.f5421b = abstractC3266tl;
    }

    /* renamed from: a */
    public static InterfaceC3365vn.a m6320a(C0794m c0794m, AbstractC3266tl abstractC3266tl) {
        return new C0790i(c0794m, abstractC3266tl);
    }

    @Override // p000.InterfaceC3365vn.a
    /* renamed from: e */
    public Object mo6321e() {
        Iterable mo14370a;
        mo14370a = this.f5420a.f5433c.mo14370a(this.f5421b);
        return mo14370a;
    }
}
