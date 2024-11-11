package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class at<TResult, TContinuationResult> implements es, gs, hs<TContinuationResult>, ct<TResult> {
    private final Executor a;
    private final js<TResult, TContinuationResult> b;
    private final ft<TContinuationResult> c;

    public at(Executor executor, js<TResult, TContinuationResult> jsVar, ft<TContinuationResult> ftVar) {
        this.a = executor;
        this.b = jsVar;
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
        this.a.execute(new bt(this, ksVar));
    }

    @Override // defpackage.ct
    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
