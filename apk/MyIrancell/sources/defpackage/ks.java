package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ks<TResult> {
    public abstract Exception a();

    public abstract <X extends Throwable> TResult a(Class<X> cls);

    public ks<TResult> a(Activity activity, fs<TResult> fsVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract ks<TResult> a(Activity activity, gs gsVar);

    public abstract ks<TResult> a(Activity activity, hs<? super TResult> hsVar);

    public <TContinuationResult> ks<TContinuationResult> a(ds<TResult, TContinuationResult> dsVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public ks<TResult> a(fs<TResult> fsVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract ks<TResult> a(gs gsVar);

    public abstract ks<TResult> a(hs<? super TResult> hsVar);

    public <TContinuationResult> ks<TContinuationResult> a(Executor executor, ds<TResult, TContinuationResult> dsVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public ks<TResult> a(Executor executor, es esVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public ks<TResult> a(Executor executor, fs<TResult> fsVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract ks<TResult> a(Executor executor, gs gsVar);

    public abstract ks<TResult> a(Executor executor, hs<? super TResult> hsVar);

    public <TContinuationResult> ks<TContinuationResult> a(Executor executor, js<TResult, TContinuationResult> jsVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public abstract TResult b();

    public <TContinuationResult> ks<TContinuationResult> b(Executor executor, ds<TResult, ks<TContinuationResult>> dsVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();
}
