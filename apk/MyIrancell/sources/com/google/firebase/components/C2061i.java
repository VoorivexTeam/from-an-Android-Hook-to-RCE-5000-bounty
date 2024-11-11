package com.google.firebase.components;

import p000.InterfaceC2789iv;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C2061i implements InterfaceC2789iv {

    /* renamed from: a */
    private final C2064l f8823a;

    /* renamed from: b */
    private final C2056d f8824b;

    private C2061i(C2064l c2064l, C2056d c2056d) {
        this.f8823a = c2064l;
        this.f8824b = c2056d;
    }

    /* renamed from: a */
    public static InterfaceC2789iv m10550a(C2064l c2064l, C2056d c2056d) {
        return new C2061i(c2064l, c2056d);
    }

    @Override // p000.InterfaceC2789iv
    public Object get() {
        Object mo10488a;
        mo10488a = r1.m10528b().mo10488a(new C2074v(this.f8824b, this.f8823a));
        return mo10488a;
    }
}
