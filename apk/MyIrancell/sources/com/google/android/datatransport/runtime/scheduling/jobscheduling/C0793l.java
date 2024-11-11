package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p000.AbstractC3266tl;
import p000.InterfaceC3365vn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C0793l implements InterfaceC3365vn.a {

    /* renamed from: a */
    private final C0794m f5428a;

    /* renamed from: b */
    private final AbstractC3266tl f5429b;

    /* renamed from: c */
    private final int f5430c;

    private C0793l(C0794m c0794m, AbstractC3266tl abstractC3266tl, int i) {
        this.f5428a = c0794m;
        this.f5429b = abstractC3266tl;
        this.f5430c = i;
    }

    /* renamed from: a */
    public static InterfaceC3365vn.a m6324a(C0794m c0794m, AbstractC3266tl abstractC3266tl, int i) {
        return new C0793l(c0794m, abstractC3266tl, i);
    }

    @Override // p000.InterfaceC3365vn.a
    /* renamed from: e */
    public Object mo6321e() {
        return C0794m.m6327a(this.f5428a, this.f5429b, this.f5430c);
    }
}
