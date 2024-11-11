package p000;

import java.util.concurrent.Executor;

/* renamed from: qs */
/* loaded from: classes.dex */
final class C3138qs<TResult, TContinuationResult> implements InterfaceC2443es, InterfaceC2524gs, InterfaceC2564hs<TContinuationResult>, InterfaceC2358ct<TResult> {

    /* renamed from: a */
    private final Executor f12824a;

    /* renamed from: b */
    private final InterfaceC2400ds<TResult, AbstractC2871ks<TContinuationResult>> f12825b;

    /* renamed from: c */
    private final C2485ft<TContinuationResult> f12826c;

    public C3138qs(Executor executor, InterfaceC2400ds<TResult, AbstractC2871ks<TContinuationResult>> interfaceC2400ds, C2485ft<TContinuationResult> c2485ft) {
        this.f12824a = executor;
        this.f12825b = interfaceC2400ds;
        this.f12826c = c2485ft;
    }

    @Override // p000.InterfaceC2443es
    /* renamed from: a */
    public final void mo3188a() {
        this.f12826c.m11826f();
    }

    @Override // p000.InterfaceC2524gs
    /* renamed from: a */
    public final void mo3189a(Exception exc) {
        this.f12826c.m11817a(exc);
    }

    @Override // p000.InterfaceC2564hs
    /* renamed from: a */
    public final void mo3190a(TContinuationResult tcontinuationresult) {
        this.f12826c.m11818a((C2485ft<TContinuationResult>) tcontinuationresult);
    }

    @Override // p000.InterfaceC2358ct
    /* renamed from: a */
    public final void mo3191a(AbstractC2871ks<TResult> abstractC2871ks) {
        this.f12824a.execute(new RunnableC3177rs(this, abstractC2871ks));
    }

    @Override // p000.InterfaceC2358ct
    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
