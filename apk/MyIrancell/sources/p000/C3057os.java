package p000;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: os */
/* loaded from: classes.dex */
public final class C3057os<TResult, TContinuationResult> implements InterfaceC2358ct<TResult> {

    /* renamed from: a */
    private final Executor f12525a;

    /* renamed from: b */
    private final InterfaceC2400ds<TResult, TContinuationResult> f12526b;

    /* renamed from: c */
    private final C2485ft<TContinuationResult> f12527c;

    public C3057os(Executor executor, InterfaceC2400ds<TResult, TContinuationResult> interfaceC2400ds, C2485ft<TContinuationResult> c2485ft) {
        this.f12525a = executor;
        this.f12526b = interfaceC2400ds;
        this.f12527c = c2485ft;
    }

    @Override // p000.InterfaceC2358ct
    /* renamed from: a */
    public final void mo3191a(AbstractC2871ks<TResult> abstractC2871ks) {
        this.f12525a.execute(new RunnableC3096ps(this, abstractC2871ks));
    }

    @Override // p000.InterfaceC2358ct
    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
