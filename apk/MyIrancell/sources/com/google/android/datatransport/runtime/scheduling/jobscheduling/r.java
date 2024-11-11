package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.f70;
import defpackage.n30;
import defpackage.qm;
import defpackage.vn;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r implements n30<q> {
    private final f70<Executor> a;
    private final f70<qm> b;
    private final f70<s> c;
    private final f70<vn> d;

    public r(f70<Executor> f70Var, f70<qm> f70Var2, f70<s> f70Var3, f70<vn> f70Var4) {
        this.a = f70Var;
        this.b = f70Var2;
        this.c = f70Var3;
        this.d = f70Var4;
    }

    public static r a(f70<Executor> f70Var, f70<qm> f70Var2, f70<s> f70Var3, f70<vn> f70Var4) {
        return new r(f70Var, f70Var2, f70Var3, f70Var4);
    }

    @Override // defpackage.f70
    public q get() {
        return new q(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
