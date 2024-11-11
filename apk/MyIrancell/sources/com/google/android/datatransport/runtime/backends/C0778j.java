package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p000.InterfaceC3404wn;
import p000.f70;
import p000.n30;

/* renamed from: com.google.android.datatransport.runtime.backends.j */
/* loaded from: classes.dex */
public final class C0778j implements n30<C0777i> {

    /* renamed from: a */
    private final f70<Context> f5385a;

    /* renamed from: b */
    private final f70<InterfaceC3404wn> f5386b;

    /* renamed from: c */
    private final f70<InterfaceC3404wn> f5387c;

    public C0778j(f70<Context> f70Var, f70<InterfaceC3404wn> f70Var2, f70<InterfaceC3404wn> f70Var3) {
        this.f5385a = f70Var;
        this.f5386b = f70Var2;
        this.f5387c = f70Var3;
    }

    /* renamed from: a */
    public static C0778j m6285a(f70<Context> f70Var, f70<InterfaceC3404wn> f70Var2, f70<InterfaceC3404wn> f70Var3) {
        return new C0778j(f70Var, f70Var2, f70Var3);
    }

    @Override // p000.f70
    public C0777i get() {
        return new C0777i(this.f5385a.get(), this.f5386b.get(), this.f5387c.get());
    }
}
