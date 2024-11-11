package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import defpackage.f70;
import defpackage.n30;
import defpackage.qm;
import defpackage.vn;
import defpackage.wn;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements n30<m> {
    private final f70<Context> a;
    private final f70<com.google.android.datatransport.runtime.backends.e> b;
    private final f70<qm> c;
    private final f70<s> d;
    private final f70<Executor> e;
    private final f70<vn> f;
    private final f70<wn> g;

    public n(f70<Context> f70Var, f70<com.google.android.datatransport.runtime.backends.e> f70Var2, f70<qm> f70Var3, f70<s> f70Var4, f70<Executor> f70Var5, f70<vn> f70Var6, f70<wn> f70Var7) {
        this.a = f70Var;
        this.b = f70Var2;
        this.c = f70Var3;
        this.d = f70Var4;
        this.e = f70Var5;
        this.f = f70Var6;
        this.g = f70Var7;
    }

    public static n a(f70<Context> f70Var, f70<com.google.android.datatransport.runtime.backends.e> f70Var2, f70<qm> f70Var3, f70<s> f70Var4, f70<Executor> f70Var5, f70<vn> f70Var6, f70<wn> f70Var7) {
        return new n(f70Var, f70Var2, f70Var3, f70Var4, f70Var5, f70Var6, f70Var7);
    }

    @Override // defpackage.f70
    public m get() {
        return new m(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
