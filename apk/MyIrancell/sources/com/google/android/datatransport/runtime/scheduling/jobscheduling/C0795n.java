package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.InterfaceC0773e;
import java.util.concurrent.Executor;
import p000.InterfaceC3132qm;
import p000.InterfaceC3365vn;
import p000.InterfaceC3404wn;
import p000.f70;
import p000.n30;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.n */
/* loaded from: classes.dex */
public final class C0795n implements n30<C0794m> {

    /* renamed from: a */
    private final f70<Context> f5438a;

    /* renamed from: b */
    private final f70<InterfaceC0773e> f5439b;

    /* renamed from: c */
    private final f70<InterfaceC3132qm> f5440c;

    /* renamed from: d */
    private final f70<InterfaceC0800s> f5441d;

    /* renamed from: e */
    private final f70<Executor> f5442e;

    /* renamed from: f */
    private final f70<InterfaceC3365vn> f5443f;

    /* renamed from: g */
    private final f70<InterfaceC3404wn> f5444g;

    public C0795n(f70<Context> f70Var, f70<InterfaceC0773e> f70Var2, f70<InterfaceC3132qm> f70Var3, f70<InterfaceC0800s> f70Var4, f70<Executor> f70Var5, f70<InterfaceC3365vn> f70Var6, f70<InterfaceC3404wn> f70Var7) {
        this.f5438a = f70Var;
        this.f5439b = f70Var2;
        this.f5440c = f70Var3;
        this.f5441d = f70Var4;
        this.f5442e = f70Var5;
        this.f5443f = f70Var6;
        this.f5444g = f70Var7;
    }

    /* renamed from: a */
    public static C0795n m6332a(f70<Context> f70Var, f70<InterfaceC0773e> f70Var2, f70<InterfaceC3132qm> f70Var3, f70<InterfaceC0800s> f70Var4, f70<Executor> f70Var5, f70<InterfaceC3365vn> f70Var6, f70<InterfaceC3404wn> f70Var7) {
        return new C0795n(f70Var, f70Var2, f70Var3, f70Var4, f70Var5, f70Var6, f70Var7);
    }

    @Override // p000.f70
    public C0794m get() {
        return new C0794m(this.f5438a.get(), this.f5439b.get(), this.f5440c.get(), this.f5441d.get(), this.f5442e.get(), this.f5443f.get(), this.f5444g.get());
    }
}
