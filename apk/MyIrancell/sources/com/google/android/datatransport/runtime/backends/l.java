package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import defpackage.f70;
import defpackage.n30;

/* loaded from: classes.dex */
public final class l implements n30<k> {
    private final f70<Context> a;
    private final f70<i> b;

    public l(f70<Context> f70Var, f70<i> f70Var2) {
        this.a = f70Var;
        this.b = f70Var2;
    }

    public static l a(f70<Context> f70Var, f70<i> f70Var2) {
        return new l(f70Var, f70Var2);
    }

    @Override // defpackage.f70
    public k get() {
        return new k(this.a.get(), this.b.get());
    }
}
