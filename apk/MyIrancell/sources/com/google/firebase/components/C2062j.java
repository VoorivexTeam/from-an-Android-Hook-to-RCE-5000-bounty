package com.google.firebase.components;

import java.util.Set;
import p000.InterfaceC2789iv;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C2062j implements InterfaceC2789iv {

    /* renamed from: a */
    private final Set f8825a;

    private C2062j(Set set) {
        this.f8825a = set;
    }

    /* renamed from: a */
    public static InterfaceC2789iv m10551a(Set set) {
        return new C2062j(set);
    }

    @Override // p000.InterfaceC2789iv
    public Object get() {
        return C2064l.m10554a(this.f8825a);
    }
}
