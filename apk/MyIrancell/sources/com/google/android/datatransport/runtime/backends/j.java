package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import defpackage.f70;
import defpackage.n30;
import defpackage.wn;

/* loaded from: classes.dex */
public final class j implements n30<i> {
    private final f70<Context> a;
    private final f70<wn> b;
    private final f70<wn> c;

    public j(f70<Context> f70Var, f70<wn> f70Var2, f70<wn> f70Var3) {
        this.a = f70Var;
        this.b = f70Var2;
        this.c = f70Var3;
    }

    public static j a(f70<Context> f70Var, f70<wn> f70Var2, f70<wn> f70Var3) {
        return new j(f70Var, f70Var2, f70Var3);
    }

    @Override // defpackage.f70
    public i get() {
        return new i(this.a.get(), this.b.get(), this.c.get());
    }
}
