package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: u2 */
/* loaded from: classes.dex */
public final class C3284u2 {

    /* renamed from: a */
    private WeakReference<View> f13378a;

    /* renamed from: b */
    Runnable f13379b = null;

    /* renamed from: c */
    Runnable f13380c = null;

    /* renamed from: d */
    int f13381d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3328v2 f13382a;

        /* renamed from: b */
        final /* synthetic */ View f13383b;

        a(C3284u2 c3284u2, InterfaceC3328v2 interfaceC3328v2, View view) {
            this.f13382a = interfaceC3328v2;
            this.f13383b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13382a.mo897a(this.f13383b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13382a.mo448b(this.f13383b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13382a.mo449c(this.f13383b);
        }
    }

    /* renamed from: u2$b */
    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3420x2 f13384a;

        /* renamed from: b */
        final /* synthetic */ View f13385b;

        b(C3284u2 c3284u2, InterfaceC3420x2 interfaceC3420x2, View view) {
            this.f13384a = interfaceC3420x2;
            this.f13385b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f13384a.mo539a(this.f13385b);
        }
    }

    /* renamed from: u2$c */
    /* loaded from: classes.dex */
    static class c implements InterfaceC3328v2 {

        /* renamed from: a */
        C3284u2 f13386a;

        /* renamed from: b */
        boolean f13387b;

        c(C3284u2 c3284u2) {
            this.f13386a = c3284u2;
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: a */
        public void mo897a(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC3328v2 interfaceC3328v2 = tag instanceof InterfaceC3328v2 ? (InterfaceC3328v2) tag : null;
            if (interfaceC3328v2 != null) {
                interfaceC3328v2.mo897a(view);
            }
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: b */
        public void mo448b(View view) {
            int i = this.f13386a.f13381d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f13386a.f13381d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f13387b) {
                C3284u2 c3284u2 = this.f13386a;
                Runnable runnable = c3284u2.f13380c;
                if (runnable != null) {
                    c3284u2.f13380c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC3328v2 interfaceC3328v2 = tag instanceof InterfaceC3328v2 ? (InterfaceC3328v2) tag : null;
                if (interfaceC3328v2 != null) {
                    interfaceC3328v2.mo448b(view);
                }
                this.f13387b = true;
            }
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: c */
        public void mo449c(View view) {
            this.f13387b = false;
            if (this.f13386a.f13381d > -1) {
                view.setLayerType(2, null);
            }
            C3284u2 c3284u2 = this.f13386a;
            Runnable runnable = c3284u2.f13379b;
            if (runnable != null) {
                c3284u2.f13379b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC3328v2 interfaceC3328v2 = tag instanceof InterfaceC3328v2 ? (InterfaceC3328v2) tag : null;
            if (interfaceC3328v2 != null) {
                interfaceC3328v2.mo449c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3284u2(View view) {
        this.f13378a = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m15703a(View view, InterfaceC3328v2 interfaceC3328v2) {
        if (interfaceC3328v2 != null) {
            view.animate().setListener(new a(this, interfaceC3328v2, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C3284u2 m15704a(float f) {
        View view = this.f13378a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C3284u2 m15705a(long j) {
        View view = this.f13378a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C3284u2 m15706a(Interpolator interpolator) {
        View view = this.f13378a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public C3284u2 m15707a(InterfaceC3328v2 interfaceC3328v2) {
        View view = this.f13378a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, interfaceC3328v2);
                interfaceC3328v2 = new c(this);
            }
            m15703a(view, interfaceC3328v2);
        }
        return this;
    }

    /* renamed from: a */
    public C3284u2 m15708a(InterfaceC3420x2 interfaceC3420x2) {
        View view = this.f13378a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(interfaceC3420x2 != null ? new b(this, interfaceC3420x2, view) : null);
        }
        return this;
    }

    /* renamed from: a */
    public void m15709a() {
        View view = this.f13378a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public long m15710b() {
        View view = this.f13378a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: b */
    public C3284u2 m15711b(float f) {
        View view = this.f13378a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C3284u2 m15712b(long j) {
        View view = this.f13378a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: c */
    public void m15713c() {
        View view = this.f13378a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
