package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class qs<TResult, TContinuationResult> implements es, gs, hs<TContinuationResult>, ct<TResult> {
    private final Executor a;
    private final ds<TResult, ks<TContinuationResult>> b;
    private final ft<TContinuationResult> c;

    public qs(Executor executor, ds<TResult, ks<TContinuationResult>> dsVar, ft<TContinuationResult> ftVar) {
        this.a = executor;
        this.b = dsVar;
        this.c = ftVar;
    }

    @Override // defpackage.es
    public final void a() {
        this.c.f();
    }

    @Override // defpackage.gs
    public final void a(Exception exc) {
        this.c.a(exc);
    }

    @Override // defpackage.hs
    public final void a(TContinuationResult tcontinuationresult) {
        this.c.a((ft<TContinuationResult>) tcontinuationresult);
    }

    @Override // defpackage.ct
    public final void a(ks<TResult> ksVar) {
        this.a.execute(new rs(this, ksVar));
    }

    @Override // defpackage.ct
    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
