package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p000.InterfaceC3450xt;

/* renamed from: ut */
/* loaded from: classes.dex */
public final class C3318ut {

    /* renamed from: ut$a */
    /* loaded from: classes.dex */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3450xt f13503a;

        a(InterfaceC3450xt interfaceC3450xt) {
            this.f13503a = interfaceC3450xt;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13503a.mo16054a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13503a.mo16055b();
        }
    }

    /* renamed from: a */
    public static Animator.AnimatorListener m15850a(InterfaceC3450xt interfaceC3450xt) {
        return new a(interfaceC3450xt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Animator m15851a(InterfaceC3450xt interfaceC3450xt, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC3450xt, (Property<InterfaceC3450xt, V>) InterfaceC3450xt.c.f14068a, (TypeEvaluator) InterfaceC3450xt.b.f14066b, (Object[]) new InterfaceC3450xt.e[]{new InterfaceC3450xt.e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        InterfaceC3450xt.e revealInfo = interfaceC3450xt.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC3450xt, (int) f, (int) f2, revealInfo.f14072c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }
}
