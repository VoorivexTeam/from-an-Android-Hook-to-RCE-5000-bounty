package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p000.C2787it;
import p000.C3097pt;

/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C3097pt f8772c;

    /* renamed from: d */
    private final C3097pt f8773d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes.dex */
    class C2044a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f8774a;

        /* renamed from: b */
        final /* synthetic */ View f8775b;

        C2044a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f8774a = z;
            this.f8775b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8774a) {
                return;
            }
            this.f8775b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f8774a) {
                this.f8775b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f8772c = new C3097pt(75L, 150L);
        this.f8773d = new C3097pt(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8772c = new C3097pt(75L, 150L);
        this.f8773d = new C3097pt(0L, 150L);
    }

    /* renamed from: a */
    private void m10479a(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        C3097pt c3097pt = z ? this.f8772c : this.f8773d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c3097pt.m14820a((Animator) ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1309a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    protected AnimatorSet mo10459b(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m10479a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C2787it.m13264a(animatorSet, arrayList);
        animatorSet.addListener(new C2044a(this, z, view2));
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: b */
    public boolean mo1313b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo1313b(coordinatorLayout, (CoordinatorLayout) view, motionEvent);
    }
}
