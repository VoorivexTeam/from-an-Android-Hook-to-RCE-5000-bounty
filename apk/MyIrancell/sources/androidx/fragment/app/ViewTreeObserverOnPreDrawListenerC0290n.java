package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
class ViewTreeObserverOnPreDrawListenerC0290n implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final View f1874b;

    /* renamed from: c */
    private ViewTreeObserver f1875c;

    /* renamed from: d */
    private final Runnable f1876d;

    private ViewTreeObserverOnPreDrawListenerC0290n(View view, Runnable runnable) {
        this.f1874b = view;
        this.f1875c = view.getViewTreeObserver();
        this.f1876d = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0290n m2002a(View view, Runnable runnable) {
        ViewTreeObserverOnPreDrawListenerC0290n viewTreeObserverOnPreDrawListenerC0290n = new ViewTreeObserverOnPreDrawListenerC0290n(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0290n);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0290n);
        return viewTreeObserverOnPreDrawListenerC0290n;
    }

    /* renamed from: a */
    public void m2003a() {
        (this.f1875c.isAlive() ? this.f1875c : this.f1874b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1874b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m2003a();
        this.f1876d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1875c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2003a();
    }
}
