package p000;

import java.util.concurrent.Executor;

/* renamed from: at */
/* loaded from: classes.dex */
final class C0435at<TResult, TContinuationResult> implements InterfaceC2443es, InterfaceC2524gs, InterfaceC2564hs<TContinuationResult>, InterfaceC2358ct<TResult> {

    /* renamed from: a */
    private final Executor f2646a;

    /* renamed from: b */
    private final InterfaceC2826js<TResult, TContinuationResult> f2647b;

    /* renamed from: c */
    private final C2485ft<TContinuationResult> f2648c;

    public C0435at(Executor executor, InterfaceC2826js<TResult, TContinuationResult> interfaceC2826js, C2485ft<TContinuationResult> c2485ft) {
        this.f2646a = executor;
        this.f2647b = interfaceC2826js;
        this.f2648c = c2485ft;
    }

    @Override // p000.InterfaceC2443es
    /* renamed from: a */
    public final void mo3188a() {
        this.f2648c.m11826f();
    }

    @Override // p000.InterfaceC2524gs
    /* renamed from: a */
    public final void mo3189a(Exception exc) {
        this.f2648c.m11817a(exc);
    }

    @Override // p000.InterfaceC2564hs
    /* renamed from: a */
    public final void mo3190a(TContinuationResult tcontinuationresult) {
        this.f2648c.m11818a((C2485ft<TContinuationResult>) tcontinuationresult);
    }

    @Override // p000.InterfaceC2358ct
    /* renamed from: a */
    public final void mo3191a(AbstractC2871ks<TResult> abstractC2871ks) {
        this.f2646a.execute(new RunnableC0492bt(this, abstractC2871ks));
    }

    @Override // p000.InterfaceC2358ct
    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
