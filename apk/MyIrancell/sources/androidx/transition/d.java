package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import defpackage.q2;

/* loaded from: classes.dex */
public class d extends h0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends m {
        final /* synthetic */ View a;

        a(d dVar, View view) {
            this.a = view;
        }

        @Override // androidx.transition.l.f
        public void d(l lVar) {
            c0.a(this.a, 1.0f);
            c0.a(this.a);
            lVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.a(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (q2.u(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public d(int i) {
        a(i);
    }

    private static float a(r rVar, float f) {
        Float f2;
        return (rVar == null || (f2 = (Float) rVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private Animator a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        c0.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.d, f2);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // androidx.transition.h0
    public Animator a(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        float a2 = a(rVar, 0.0f);
        return a(view, a2 != 1.0f ? a2 : 0.0f, 1.0f);
    }

    @Override // androidx.transition.h0
    public Animator b(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        c0.e(view);
        return a(view, a(rVar, 1.0f), 0.0f);
    }

    @Override // androidx.transition.h0, androidx.transition.l
    public void c(r rVar) {
        super.c(rVar);
        rVar.a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(rVar.b)));
    }
}
