package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p000.f70;
import p000.n30;

/* renamed from: com.google.android.datatransport.runtime.backends.l */
/* loaded from: classes.dex */
public final class C0780l implements n30<C0779k> {

    /* renamed from: a */
    private final f70<Context> f5393a;

    /* renamed from: b */
    private final f70<C0777i> f5394b;

    public C0780l(f70<Context> f70Var, f70<C0777i> f70Var2) {
        this.f5393a = f70Var;
        this.f5394b = f70Var2;
    }

    /* renamed from: a */
    public static C0780l m6290a(f70<Context> f70Var, f70<C0777i> f70Var2) {
        return new C0780l(f70Var, f70Var2);
    }

    @Override // p000.f70
    public C0779k get() {
        return new C0779k(this.f5393a.get(), this.f5394b.get());
    }
}
