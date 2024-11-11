package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0239a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p000.C2565ht;
import p000.C2788iu;
import p000.C3107q2;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0213b {

    /* renamed from: Q */
    private final int f8350Q;

    /* renamed from: R */
    private final C2788iu f8351R;

    /* renamed from: S */
    private final C1987a f8352S;

    /* renamed from: T */
    private Animator f8353T;

    /* renamed from: U */
    private Animator f8354U;

    /* renamed from: V */
    private Animator f8355V;

    /* renamed from: W */
    private int f8356W;

    /* renamed from: a0 */
    private boolean f8357a0;

    /* renamed from: b0 */
    private boolean f8358b0;

    /* renamed from: c0 */
    AnimatorListenerAdapter f8359c0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d */
        private final Rect f8360d;

        public Behavior() {
            this.f8360d = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8360d = new Rect();
        }

        /* renamed from: a */
        private boolean m10103a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((CoordinatorLayout.C0217f) floatingActionButton.getLayoutParams()).f1350d = 17;
            bottomAppBar.m10090a(floatingActionButton);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo10059a(BottomAppBar bottomAppBar) {
            super.mo10059a((Behavior) bottomAppBar);
            FloatingActionButton m10099m = bottomAppBar.m10099m();
            if (m10099m != null) {
                m10099m.m10144a(this.f8360d);
                float measuredHeight = m10099m.getMeasuredHeight() - this.f8360d.height();
                m10099m.clearAnimation();
                m10099m.animate().translationY((-m10099m.getPaddingBottom()) + measuredHeight).setInterpolator(C2565ht.f10511c).setDuration(175L);
            }
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo1304a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton m10099m = bottomAppBar.m10099m();
            if (m10099m != null) {
                m10103a(m10099m, bottomAppBar);
                m10099m.m10146b(this.f8360d);
                bottomAppBar.setFabDiameter(this.f8360d.height());
            }
            if (bottomAppBar.m10100n()) {
                coordinatorLayout.m1289c(bottomAppBar, i);
                return super.mo1304a(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i);
            }
            BottomAppBar.m10096c(bottomAppBar);
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo1316b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo1316b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo10060b(BottomAppBar bottomAppBar) {
            super.mo10060b((Behavior) bottomAppBar);
            FloatingActionButton m10099m = bottomAppBar.m10099m();
            if (m10099m != null) {
                m10099m.clearAnimation();
                m10099m.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(C2565ht.f10512d).setDuration(225L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1983a();

        /* renamed from: d */
        int f8361d;

        /* renamed from: e */
        boolean f8362e;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        /* loaded from: classes.dex */
        static class C1983a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1983a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8361d = parcel.readInt();
            this.f8362e = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8361d);
            parcel.writeInt(this.f8362e ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes.dex */
    public class C1984a extends AnimatorListenerAdapter {
        C1984a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.f8354U = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes.dex */
    public class C1985b extends AnimatorListenerAdapter {
        C1985b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.f8355V = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes.dex */
    public class C1986c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f8365a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f8366b;

        /* renamed from: c */
        final /* synthetic */ int f8367c;

        /* renamed from: d */
        final /* synthetic */ boolean f8368d;

        C1986c(ActionMenuView actionMenuView, int i, boolean z) {
            this.f8366b = actionMenuView;
            this.f8367c = i;
            this.f8368d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8365a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8365a) {
                return;
            }
            BottomAppBar.this.m10087a(this.f8366b, this.f8367c, this.f8368d);
        }
    }

    /* renamed from: a */
    private float m10080a(boolean z) {
        FloatingActionButton m10099m = m10099m();
        if (m10099m == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        m10099m.m10144a(rect);
        float height = rect.height();
        if (height == 0.0f) {
            height = m10099m.getMeasuredHeight();
        }
        float height2 = m10099m.getHeight() - rect.bottom;
        float height3 = m10099m.getHeight() - rect.height();
        float f = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float paddingBottom = height3 - m10099m.getPaddingBottom();
        float f2 = -getMeasuredHeight();
        if (!z) {
            f = paddingBottom;
        }
        return f2 + f;
    }

    /* renamed from: a */
    private int m10081a(int i) {
        boolean z = C3107q2.m14919k(this) == 1;
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - this.f8350Q) * (z ? -1 : 1);
        }
        return 0;
    }

    /* renamed from: a */
    private void m10084a(int i, List<Animator> list) {
        if (this.f8358b0) {
            this.f8352S.m10114e();
            throw null;
        }
    }

    /* renamed from: a */
    private void m10085a(int i, boolean z) {
        if (C3107q2.m14932x(this)) {
            Animator animator = this.f8355V;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m10101o()) {
                i = 0;
                z = false;
            }
            m10086a(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f8355V = animatorSet;
            animatorSet.addListener(new C1985b());
            this.f8355V.start();
        }
    }

    /* renamed from: a */
    private void m10086a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if ((!this.f8358b0 && (!z || !m10101o())) || (this.f8356W != 1 && i != 1)) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new C1986c(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10087a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C3107q2.m14919k(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0155e) && (((Toolbar.C0155e) childAt.getLayoutParams()).f412a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i == 1 && z) ? i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft()) : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10090a(FloatingActionButton floatingActionButton) {
        m10094b(floatingActionButton);
        floatingActionButton.m10142a(this.f8359c0);
        floatingActionButton.m10145b(this.f8359c0);
    }

    /* renamed from: b */
    private void m10092b(int i) {
        if (this.f8356W == i || !C3107q2.m14932x(this)) {
            return;
        }
        Animator animator = this.f8354U;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        m10084a(i, arrayList);
        m10093b(i, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f8354U = animatorSet;
        animatorSet.addListener(new C1984a());
        this.f8354U.start();
    }

    /* renamed from: b */
    private void m10093b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m10099m(), "translationX", m10081a(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: b */
    private void m10094b(FloatingActionButton floatingActionButton) {
        floatingActionButton.m10149c(this.f8359c0);
        floatingActionButton.m10150d(this.f8359c0);
    }

    /* renamed from: c */
    static /* synthetic */ void m10096c(BottomAppBar bottomAppBar) {
        bottomAppBar.m10102p();
        throw null;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return m10081a(this.f8356W);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationY() {
        return m10080a(this.f8358b0);
    }

    /* renamed from: l */
    private void m10098l() {
        Animator animator = this.f8353T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f8355V;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f8354U;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public FloatingActionButton m10099m() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m1287c(this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m10100n() {
        Animator animator;
        Animator animator2;
        Animator animator3 = this.f8353T;
        return (animator3 != null && animator3.isRunning()) || ((animator = this.f8355V) != null && animator.isRunning()) || ((animator2 = this.f8354U) != null && animator2.isRunning());
    }

    /* renamed from: o */
    private boolean m10101o() {
        FloatingActionButton m10099m = m10099m();
        return m10099m != null && m10099m.m10148b();
    }

    /* renamed from: p */
    private void m10102p() {
        this.f8352S.m10113d(getFabTranslationX());
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        this.f8351R.m13265a();
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0213b
    public CoordinatorLayout.AbstractC0214c<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        this.f8352S.m10106a();
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.f8356W;
    }

    public float getFabCradleMargin() {
        this.f8352S.m10108b();
        throw null;
    }

    public float getFabCradleRoundedCornerRadius() {
        this.f8352S.m10110c();
        throw null;
    }

    public boolean getHideOnScroll() {
        return this.f8357a0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m10098l();
        m10102p();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m1612a());
        this.f8356W = savedState.f8361d;
        this.f8358b0 = savedState.f8362e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8361d = this.f8356W;
        savedState.f8362e = this.f8358b0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0239a.m1480a(this.f8351R, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f == getCradleVerticalOffset()) {
            return;
        }
        this.f8352S.m10107a(f);
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        m10092b(i);
        m10085a(i, this.f8358b0);
        this.f8356W = i;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        this.f8352S.m10109b(f);
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        this.f8352S.m10111c(f);
        throw null;
    }

    void setFabDiameter(int i) {
        this.f8352S.m10112d();
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f8357a0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
