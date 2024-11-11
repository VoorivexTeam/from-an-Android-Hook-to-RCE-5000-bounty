package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p000.C3107q2;
import p000.InterfaceC0436au;

/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0214c<View> {

    /* renamed from: a */
    private int f8752a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes.dex */
    class ViewTreeObserverOnPreDrawListenerC2037a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ View f8753b;

        /* renamed from: c */
        final /* synthetic */ int f8754c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC0436au f8755d;

        ViewTreeObserverOnPreDrawListenerC2037a(View view, int i, InterfaceC0436au interfaceC0436au) {
            this.f8753b = view;
            this.f8754c = i;
            this.f8755d = interfaceC0436au;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f8753b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f8752a == this.f8754c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC0436au interfaceC0436au = this.f8755d;
                expandableBehavior.mo10456a((View) interfaceC0436au, this.f8753b, interfaceC0436au.mo3192a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f8752a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8752a = 0;
    }

    /* renamed from: a */
    private boolean m10455a(boolean z) {
        if (!z) {
            return this.f8752a == 1;
        }
        int i = this.f8752a;
        return i == 0 || i == 2;
    }

    /* renamed from: a */
    protected abstract boolean mo10456a(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1304a(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC0436au m10457e;
        if (C3107q2.m14932x(view) || (m10457e = m10457e(coordinatorLayout, view)) == null || !m10455a(m10457e.mo3192a())) {
            return false;
        }
        int i2 = m10457e.mo3192a() ? 1 : 2;
        this.f8752a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2037a(view, i2, m10457e));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: b */
    public boolean mo1314b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC0436au interfaceC0436au = (InterfaceC0436au) view2;
        if (!m10455a(interfaceC0436au.mo3192a())) {
            return false;
        }
        this.f8752a = interfaceC0436au.mo3192a() ? 1 : 2;
        return mo10456a((View) interfaceC0436au, view, interfaceC0436au.mo3192a(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    protected InterfaceC0436au m10457e(CoordinatorLayout coordinatorLayout, View view) {
        List<View> m1282b = coordinatorLayout.m1282b(view);
        int size = m1282b.size();
        for (int i = 0; i < size; i++) {
            View view2 = m1282b.get(i);
            if (mo1309a(coordinatorLayout, (CoordinatorLayout) view, view2)) {
                return (InterfaceC0436au) view2;
            }
        }
        return null;
    }
}
