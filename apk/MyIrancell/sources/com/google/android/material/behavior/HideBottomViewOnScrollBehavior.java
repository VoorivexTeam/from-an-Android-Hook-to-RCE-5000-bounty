package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.C2565ht;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0214c<V> {

    /* renamed from: a */
    private int f8330a;

    /* renamed from: b */
    private int f8331b;

    /* renamed from: c */
    private ViewPropertyAnimator f8332c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes.dex */
    public class C1979a extends AnimatorListenerAdapter {
        C1979a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f8332c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f8330a = 0;
        this.f8331b = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8330a = 0;
        this.f8331b = 2;
    }

    /* renamed from: a */
    private void m10058a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f8332c = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C1979a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10059a(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f8332c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f8331b = 1;
        m10058a((HideBottomViewOnScrollBehavior<V>) v, this.f8330a, 175L, C2565ht.f10511c);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public void mo1297a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.f8331b != 1 && i2 > 0) {
            mo10059a((HideBottomViewOnScrollBehavior<V>) v);
        } else {
            if (this.f8331b == 2 || i2 >= 0) {
                return;
            }
            mo10060b(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1304a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f8330a = v.getMeasuredHeight();
        return super.mo1304a(coordinatorLayout, (CoordinatorLayout) v, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10060b(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f8332c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f8331b = 2;
        m10058a((HideBottomViewOnScrollBehavior<V>) v, 0, 225L, C2565ht.f10512d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: b */
    public boolean mo1315b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
