package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import p000.InterfaceC3132qm;
import p000.InterfaceC3365vn;
import p000.f70;
import p000.n30;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
/* loaded from: classes.dex */
public final class C0799r implements n30<C0798q> {

    /* renamed from: a */
    private final f70<Executor> f5451a;

    /* renamed from: b */
    private final f70<InterfaceC3132qm> f5452b;

    /* renamed from: c */
    private final f70<InterfaceC0800s> f5453c;

    /* renamed from: d */
    private final f70<InterfaceC3365vn> f5454d;

    public C0799r(f70<Executor> f70Var, f70<InterfaceC3132qm> f70Var2, f70<InterfaceC0800s> f70Var3, f70<InterfaceC3365vn> f70Var4) {
        this.f5451a = f70Var;
        this.f5452b = f70Var2;
        this.f5453c = f70Var3;
        this.f5454d = f70Var4;
    }

    /* renamed from: a */
    public static C0799r m6338a(f70<Executor> f70Var, f70<InterfaceC3132qm> f70Var2, f70<InterfaceC0800s> f70Var3, f70<InterfaceC3365vn> f70Var4) {
        return new C0799r(f70Var, f70Var2, f70Var3, f70Var4);
    }

    @Override // p000.f70
    public C0798q get() {
        return new C0798q(this.f5451a.get(), this.f5452b.get(), this.f5453c.get(), this.f5454d.get());
    }
}
