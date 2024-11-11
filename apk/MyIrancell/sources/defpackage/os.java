package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class os<TResult, TContinuationResult> implements ct<TResult> {
    private final Executor a;
    private final ds<TResult, TContinuationResult> b;
    private final ft<TContinuationResult> c;

    public os(Executor executor, ds<TResult, TContinuationResult> dsVar, ft<TContinuationResult> ftVar) {
        this.a = executor;
        this.b = dsVar;
        this.c = ftVar;
    }

    @Override // defpackage.ct
    public final void a(ks<TResult> ksVar) {
        this.a.execute(new ps(this, ksVar));
    }

    @Override // defpackage.ct
    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
