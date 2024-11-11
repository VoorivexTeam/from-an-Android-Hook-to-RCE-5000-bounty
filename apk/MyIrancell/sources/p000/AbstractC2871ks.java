package p000;

import android.app.Activity;
import java.util.concurrent.Executor;

/* renamed from: ks */
/* loaded from: classes.dex */
public abstract class AbstractC2871ks<TResult> {
    /* renamed from: a */
    public abstract Exception mo11802a();

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo11803a(Class<X> cls);

    /* renamed from: a */
    public AbstractC2871ks<TResult> mo11804a(Activity activity, InterfaceC2484fs<TResult> interfaceC2484fs) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public abstract AbstractC2871ks<TResult> mo11805a(Activity activity, InterfaceC2524gs interfaceC2524gs);

    /* renamed from: a */
    public abstract AbstractC2871ks<TResult> mo11806a(Activity activity, InterfaceC2564hs<? super TResult> interfaceC2564hs);

    /* renamed from: a */
    public <TContinuationResult> AbstractC2871ks<TContinuationResult> mo11807a(InterfaceC2400ds<TResult, TContinuationResult> interfaceC2400ds) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: a */
    public AbstractC2871ks<TResult> mo11808a(InterfaceC2484fs<TResult> interfaceC2484fs) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public abstract AbstractC2871ks<TResult> mo11809a(InterfaceC2524gs interfaceC2524gs);

    /* renamed from: a */
    public abstract AbstractC2871ks<TResult> mo11810a(InterfaceC2564hs<? super TResult> interfaceC2564hs);

    /* renamed from: a */
    public <TContinuationResult> AbstractC2871ks<TContinuationResult> mo11811a(Executor executor, InterfaceC2400ds<TResult, TContinuationResult> interfaceC2400ds) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: a */
    public AbstractC2871ks<TResult> mo11812a(Executor executor, InterfaceC2443es interfaceC2443es) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: a */
    public AbstractC2871ks<TResult> mo11813a(Executor executor, InterfaceC2484fs<TResult> interfaceC2484fs) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public abstract AbstractC2871ks<TResult> mo11814a(Executor executor, InterfaceC2524gs interfaceC2524gs);

    /* renamed from: a */
    public abstract AbstractC2871ks<TResult> mo11815a(Executor executor, InterfaceC2564hs<? super TResult> interfaceC2564hs);

    /* renamed from: a */
    public <TContinuationResult> AbstractC2871ks<TContinuationResult> mo11816a(Executor executor, InterfaceC2826js<TResult, TContinuationResult> interfaceC2826js) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    /* renamed from: b */
    public abstract TResult mo11819b();

    /* renamed from: b */
    public <TContinuationResult> AbstractC2871ks<TContinuationResult> mo11820b(Executor executor, InterfaceC2400ds<TResult, AbstractC2871ks<TContinuationResult>> interfaceC2400ds) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: c */
    public abstract boolean mo11823c();

    /* renamed from: d */
    public abstract boolean mo11824d();

    /* renamed from: e */
    public abstract boolean mo11825e();
}
