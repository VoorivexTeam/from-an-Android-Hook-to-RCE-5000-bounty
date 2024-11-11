package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import defpackage.xt;

/* loaded from: classes.dex */
public final class ut {

    /* loaded from: classes.dex */
    static class a extends AnimatorListenerAdapter {
        final /* synthetic */ xt a;

        a(xt xtVar) {
            this.a = xtVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.b();
        }
    }

    public static Animator.AnimatorListener a(xt xtVar) {
        return new a(xtVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator a(xt xtVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(xtVar, (Property<xt, V>) xt.c.a, (TypeEvaluator) xt.b.b, (Object[]) new xt.e[]{new xt.e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        xt.e revealInfo = xtVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) xtVar, (int) f, (int) f2, revealInfo.c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }
}
