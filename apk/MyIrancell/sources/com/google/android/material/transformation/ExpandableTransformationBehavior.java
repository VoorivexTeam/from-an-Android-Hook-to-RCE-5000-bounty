package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    private AnimatorSet f8757b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C2038a extends AnimatorListenerAdapter {
        C2038a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f8757b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    public boolean mo10456a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f8757b != null;
        if (z3) {
            this.f8757b.cancel();
        }
        AnimatorSet mo10459b = mo10459b(view, view2, z, z3);
        this.f8757b = mo10459b;
        mo10459b.addListener(new C2038a());
        this.f8757b.start();
        if (!z2) {
            this.f8757b.end();
        }
        return true;
    }

    /* renamed from: b */
    protected abstract AnimatorSet mo10459b(View view, View view2, boolean z, boolean z2);
}
