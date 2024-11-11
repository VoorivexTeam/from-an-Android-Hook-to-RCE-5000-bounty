package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p000.C3107q2;

/* renamed from: androidx.transition.d */
/* loaded from: classes.dex */
public class C0380d extends AbstractC0389h0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.d$a */
    /* loaded from: classes.dex */
    public class a extends C0397m {

        /* renamed from: a */
        final /* synthetic */ View f2413a;

        a(C0380d c0380d, View view) {
            this.f2413a = view;
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: d */
        public void mo2939d(AbstractC0396l abstractC0396l) {
            C0379c0.m2945a(this.f2413a, 1.0f);
            C0379c0.m2944a(this.f2413a);
            abstractC0396l.mo3020b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.d$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f2414a;

        /* renamed from: b */
        private boolean f2415b = false;

        b(View view) {
            this.f2414a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0379c0.m2945a(this.f2414a, 1.0f);
            if (this.f2415b) {
                this.f2414a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C3107q2.m14929u(this.f2414a) && this.f2414a.getLayerType() == 0) {
                this.f2415b = true;
                this.f2414a.setLayerType(2, null);
            }
        }
    }

    public C0380d(int i) {
        m2982a(i);
    }

    /* renamed from: a */
    private static float m2958a(C0402r c0402r, float f) {
        Float f2;
        return (c0402r == null || (f2 = (Float) c0402r.f2524a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* renamed from: a */
    private Animator m2959a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0379c0.m2945a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0379c0.f2412d, f2);
        ofFloat.addListener(new b(view));
        mo3006a(new a(this, view));
        return ofFloat;
    }

    @Override // androidx.transition.AbstractC0389h0
    /* renamed from: a */
    public Animator mo2960a(ViewGroup viewGroup, View view, C0402r c0402r, C0402r c0402r2) {
        float m2958a = m2958a(c0402r, 0.0f);
        return m2959a(view, m2958a != 1.0f ? m2958a : 0.0f, 1.0f);
    }

    @Override // androidx.transition.AbstractC0389h0
    /* renamed from: b */
    public Animator mo2961b(ViewGroup viewGroup, View view, C0402r c0402r, C0402r c0402r2) {
        C0379c0.m2953e(view);
        return m2959a(view, m2958a(c0402r, 1.0f), 0.0f);
    }

    @Override // androidx.transition.AbstractC0389h0, androidx.transition.AbstractC0396l
    /* renamed from: c */
    public void mo2923c(C0402r c0402r) {
        super.mo2923c(c0402r);
        c0402r.f2524a.put("android:fade:transitionAlpha", Float.valueOf(C0379c0.m2951c(c0402r.f2525b)));
    }
}
