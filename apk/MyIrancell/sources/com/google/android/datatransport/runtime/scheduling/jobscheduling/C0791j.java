package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.backends.AbstractC0775g;
import p000.AbstractC3266tl;
import p000.InterfaceC3365vn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0791j implements InterfaceC3365vn.a {

    /* renamed from: a */
    private final C0794m f5422a;

    /* renamed from: b */
    private final AbstractC0775g f5423b;

    /* renamed from: c */
    private final Iterable f5424c;

    /* renamed from: d */
    private final AbstractC3266tl f5425d;

    /* renamed from: e */
    private final int f5426e;

    private C0791j(C0794m c0794m, AbstractC0775g abstractC0775g, Iterable iterable, AbstractC3266tl abstractC3266tl, int i) {
        this.f5422a = c0794m;
        this.f5423b = abstractC0775g;
        this.f5424c = iterable;
        this.f5425d = abstractC3266tl;
        this.f5426e = i;
    }

    /* renamed from: a */
    public static InterfaceC3365vn.a m6322a(C0794m c0794m, AbstractC0775g abstractC0775g, Iterable iterable, AbstractC3266tl abstractC3266tl, int i) {
        return new C0791j(c0794m, abstractC0775g, iterable, abstractC3266tl, i);
    }

    @Override // p000.InterfaceC3365vn.a
    /* renamed from: e */
    public Object mo6321e() {
        return C0794m.m6326a(this.f5422a, this.f5423b, this.f5424c, this.f5425d, this.f5426e);
    }
}
