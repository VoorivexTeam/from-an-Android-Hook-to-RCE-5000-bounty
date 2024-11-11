package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.C3107q2;

/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes.dex */
abstract class AbstractC1974a<V extends View> extends C1976c<V> {

    /* renamed from: d */
    private Runnable f8308d;

    /* renamed from: e */
    OverScroller f8309e;

    /* renamed from: f */
    private boolean f8310f;

    /* renamed from: g */
    private int f8311g;

    /* renamed from: h */
    private int f8312h;

    /* renamed from: i */
    private int f8313i;

    /* renamed from: j */
    private VelocityTracker f8314j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f8315b;

        /* renamed from: c */
        private final V f8316c;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.f8315b = coordinatorLayout;
            this.f8316c = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f8316c == null || (overScroller = AbstractC1974a.this.f8309e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC1974a.this.mo10027e(this.f8315b, this.f8316c);
                return;
            }
            AbstractC1974a abstractC1974a = AbstractC1974a.this;
            abstractC1974a.m10042c(this.f8315b, (CoordinatorLayout) this.f8316c, abstractC1974a.f8309e.getCurrY());
            C3107q2.m14892a(this.f8316c, this);
        }
    }

    public AbstractC1974a() {
        this.f8311g = -1;
        this.f8313i = -1;
    }

    public AbstractC1974a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8311g = -1;
        this.f8313i = -1;
    }

    /* renamed from: d */
    private void m10039d() {
        if (this.f8314j == null) {
            this.f8314j = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m10040a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo10021b(coordinatorLayout, (CoordinatorLayout) v, mo10024c() - i, i2, i3);
    }

    /* renamed from: a */
    abstract boolean mo10015a(V v);

    /* renamed from: a */
    final boolean m10041a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f8308d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f8308d = null;
        }
        if (this.f8309e == null) {
            this.f8309e = new OverScroller(v.getContext());
        }
        this.f8309e.fling(0, m10050b(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.f8309e.computeScrollOffset()) {
            mo10027e(coordinatorLayout, v);
            return false;
        }
        a aVar = new a(coordinatorLayout, v);
        this.f8308d = aVar;
        C3107q2.m14892a(v, aVar);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0 != 3) goto L35;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1308a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f8313i
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f8313i = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.f8310f
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L60
            r5 = -1
            if (r0 == r2) goto L51
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L51
            goto L83
        L2f:
            int r6 = r4.f8311g
            if (r6 != r5) goto L34
            goto L83
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L83
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f8312h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f8313i
            if (r6 <= r0) goto L83
            r4.f8310f = r2
            r4.f8312h = r5
            goto L83
        L51:
            r4.f8310f = r3
            r4.f8311g = r5
            android.view.VelocityTracker r5 = r4.f8314j
            if (r5 == 0) goto L83
            r5.recycle()
            r5 = 0
            r4.f8314j = r5
            goto L83
        L60:
            r4.f8310f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo10015a(r6)
            if (r2 == 0) goto L83
            boolean r5 = r5.m1281a(r6, r0, r1)
            if (r5 == 0) goto L83
            r4.f8312h = r1
            int r5 = r7.getPointerId(r3)
            r4.f8311g = r5
            r4.m10039d()
        L83:
            android.view.VelocityTracker r5 = r4.f8314j
            if (r5 == 0) goto L8a
            r5.addMovement(r7)
        L8a:
            boolean r5 = r4.f8310f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC1974a.mo1308a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    abstract int mo10020b(V v);

    /* renamed from: b */
    abstract int mo10021b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0 != 3) goto L39;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1313b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f8313i
            if (r0 >= 0) goto L12
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f8313i = r0
        L12:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8d
            r3 = -1
            if (r0 == r1) goto L5c
            r4 = 2
            if (r0 == r4) goto L25
            r12 = 3
            if (r0 == r12) goto L7e
            goto Lae
        L25:
            int r0 = r11.f8311g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L2e
            return r2
        L2e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f8312h
            int r2 = r2 - r0
            boolean r3 = r11.f8310f
            if (r3 != 0) goto L49
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f8313i
            if (r3 <= r4) goto L49
            r11.f8310f = r1
            if (r2 <= 0) goto L48
            int r2 = r2 - r4
            goto L49
        L48:
            int r2 = r2 + r4
        L49:
            r6 = r2
            boolean r2 = r11.f8310f
            if (r2 == 0) goto Lae
            r11.f8312h = r0
            int r7 = r11.mo10020b(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.m10040a(r4, r5, r6, r7, r8)
            goto Lae
        L5c:
            android.view.VelocityTracker r0 = r11.f8314j
            if (r0 == 0) goto L7e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f8314j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f8314j
            int r4 = r11.f8311g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo10025c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m10041a(r6, r7, r8, r9, r10)
        L7e:
            r11.f8310f = r2
            r11.f8311g = r3
            android.view.VelocityTracker r12 = r11.f8314j
            if (r12 == 0) goto Lae
            r12.recycle()
            r12 = 0
            r11.f8314j = r12
            goto Lae
        L8d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.m1281a(r13, r0, r3)
            if (r12 == 0) goto Lb6
            boolean r12 = r11.mo10015a(r13)
            if (r12 == 0) goto Lb6
            r11.f8312h = r3
            int r12 = r14.getPointerId(r2)
            r11.f8311g = r12
            r11.m10039d()
        Lae:
            android.view.VelocityTracker r12 = r11.f8314j
            if (r12 == 0) goto Lb5
            r12.addMovement(r14)
        Lb5:
            return r1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC1974a.mo1313b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: c */
    abstract int mo10024c();

    /* renamed from: c */
    abstract int mo10025c(V v);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m10042c(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo10021b(coordinatorLayout, (CoordinatorLayout) v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: e */
    abstract void mo10027e(CoordinatorLayout coordinatorLayout, V v);
}
