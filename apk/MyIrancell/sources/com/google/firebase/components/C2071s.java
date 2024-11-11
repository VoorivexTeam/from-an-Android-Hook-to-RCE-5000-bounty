package com.google.firebase.components;

import p000.InterfaceC2789iv;

/* renamed from: com.google.firebase.components.s */
/* loaded from: classes.dex */
public class C2071s<T> implements InterfaceC2789iv<T> {

    /* renamed from: c */
    private static final Object f8845c = new Object();

    /* renamed from: a */
    private volatile Object f8846a = f8845c;

    /* renamed from: b */
    private volatile InterfaceC2789iv<T> f8847b;

    public C2071s(InterfaceC2789iv<T> interfaceC2789iv) {
        this.f8847b = interfaceC2789iv;
    }

    @Override // p000.InterfaceC2789iv
    public T get() {
        T t = (T) this.f8846a;
        if (t == f8845c) {
            synchronized (this) {
                t = (T) this.f8846a;
                if (t == f8845c) {
                    t = this.f8847b.get();
                    this.f8846a = t;
                    this.f8847b = null;
                }
            }
        }
        return t;
    }
}
