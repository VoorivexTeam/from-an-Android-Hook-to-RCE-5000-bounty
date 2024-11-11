package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class u2 {
    private WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;
    int d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ v2 a;
        final /* synthetic */ View b;

        a(u2 u2Var, v2 v2Var, View view) {
            this.a = v2Var;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ x2 a;
        final /* synthetic */ View b;

        b(u2 u2Var, x2 x2Var, View view) {
            this.a = x2Var;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.b);
        }
    }

    /* loaded from: classes.dex */
    static class c implements v2 {
        u2 a;
        boolean b;

        c(u2 u2Var) {
            this.a = u2Var;
        }

        @Override // defpackage.v2
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            v2 v2Var = tag instanceof v2 ? (v2) tag : null;
            if (v2Var != null) {
                v2Var.a(view);
            }
        }

        @Override // defpackage.v2
        public void b(View view) {
            int i = this.a.d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.b) {
                u2 u2Var = this.a;
                Runnable runnable = u2Var.c;
                if (runnable != null) {
                    u2Var.c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                v2 v2Var = tag instanceof v2 ? (v2) tag : null;
                if (v2Var != null) {
                    v2Var.b(view);
                }
                this.b = true;
            }
        }

        @Override // defpackage.v2
        public void c(View view) {
            this.b = false;
            if (this.a.d > -1) {
                view.setLayerType(2, null);
            }
            u2 u2Var = this.a;
            Runnable runnable = u2Var.b;
            if (runnable != null) {
                u2Var.b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            v2 v2Var = tag instanceof v2 ? (v2) tag : null;
            if (v2Var != null) {
                v2Var.c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u2(View view) {
        this.a = new WeakReference<>(view);
    }

    private void a(View view, v2 v2Var) {
        if (v2Var != null) {
            view.animate().setListener(new a(this, v2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public u2 a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public u2 a(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public u2 a(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public u2 a(v2 v2Var) {
        View view = this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, v2Var);
                v2Var = new c(this);
            }
            a(view, v2Var);
        }
        return this;
    }

    public u2 a(x2 x2Var) {
        View view = this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(x2Var != null ? new b(this, x2Var, view) : null);
        }
        return this;
    }

    public void a() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long b() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public u2 b(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public u2 b(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public void c() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
