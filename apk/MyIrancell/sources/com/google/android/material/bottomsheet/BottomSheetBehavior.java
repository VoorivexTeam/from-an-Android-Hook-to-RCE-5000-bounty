package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p000.C2370d1;
import p000.C2798j3;
import p000.C3107q2;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0214c<V> {

    /* renamed from: a */
    private boolean f8372a;

    /* renamed from: b */
    private float f8373b;

    /* renamed from: c */
    private int f8374c;

    /* renamed from: d */
    private boolean f8375d;

    /* renamed from: e */
    private int f8376e;

    /* renamed from: f */
    private int f8377f;

    /* renamed from: g */
    int f8378g;

    /* renamed from: h */
    int f8379h;

    /* renamed from: i */
    int f8380i;

    /* renamed from: j */
    boolean f8381j;

    /* renamed from: k */
    private boolean f8382k;

    /* renamed from: l */
    int f8383l;

    /* renamed from: m */
    C2798j3 f8384m;

    /* renamed from: n */
    private boolean f8385n;

    /* renamed from: o */
    private int f8386o;

    /* renamed from: p */
    private boolean f8387p;

    /* renamed from: q */
    int f8388q;

    /* renamed from: r */
    WeakReference<V> f8389r;

    /* renamed from: s */
    WeakReference<View> f8390s;

    /* renamed from: t */
    private AbstractC1992b f8391t;

    /* renamed from: u */
    private VelocityTracker f8392u;

    /* renamed from: v */
    int f8393v;

    /* renamed from: w */
    private int f8394w;

    /* renamed from: x */
    boolean f8395x;

    /* renamed from: y */
    private Map<View, Integer> f8396y;

    /* renamed from: z */
    private final C2798j3.c f8397z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1990a();

        /* renamed from: d */
        final int f8398d;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        /* loaded from: classes.dex */
        static class C1990a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1990a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f8398d = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f8398d = i;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8398d);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes.dex */
    class C1991a extends C2798j3.c {
        C1991a() {
        }

        @Override // p000.C2798j3.c
        /* renamed from: a */
        public int mo10071a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        
            if (r9 < java.lang.Math.abs(r9 - r10.f8380i)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        
            if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - r7.f8399a.f8380i)) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00c8  */
        @Override // p000.C2798j3.c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo10072a(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C1991a.mo10072a(android.view.View, float, float):void");
        }

        @Override // p000.C2798j3.c
        /* renamed from: a */
        public void mo10074a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m10124a(i2);
        }

        @Override // p000.C2798j3.c
        /* renamed from: b */
        public int mo10131b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f8381j ? bottomSheetBehavior.f8388q : bottomSheetBehavior.f8380i;
        }

        @Override // p000.C2798j3.c
        /* renamed from: b */
        public int mo10075b(View view, int i, int i2) {
            int m10119c = BottomSheetBehavior.this.m10119c();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C2370d1.m11244a(i, m10119c, bottomSheetBehavior.f8381j ? bottomSheetBehavior.f8388q : bottomSheetBehavior.f8380i);
        }

        @Override // p000.C2798j3.c
        /* renamed from: b */
        public boolean mo10076b(View view, int i) {
            WeakReference<V> weakReference;
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f8383l;
            if (i2 == 1 || bottomSheetBehavior.f8395x) {
                return false;
            }
            return ((i2 == 3 && bottomSheetBehavior.f8393v == i && (view2 = bottomSheetBehavior.f8390s.get()) != null && view2.canScrollVertically(-1)) || (weakReference = BottomSheetBehavior.this.f8389r) == null || weakReference.get() != view) ? false : true;
        }

        @Override // p000.C2798j3.c
        /* renamed from: c */
        public void mo10077c(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.m10129c(1);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1992b {
        /* renamed from: a */
        public abstract void m10132a(View view, float f);

        /* renamed from: a */
        public abstract void m10133a(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes.dex */
    private class RunnableC1993c implements Runnable {

        /* renamed from: b */
        private final View f8400b;

        /* renamed from: c */
        private final int f8401c;

        RunnableC1993c(View view, int i) {
            this.f8400b = view;
            this.f8401c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2798j3 c2798j3 = BottomSheetBehavior.this.f8384m;
            if (c2798j3 == null || !c2798j3.m13382a(true)) {
                BottomSheetBehavior.this.m10129c(this.f8401c);
            } else {
                C3107q2.m14892a(this.f8400b, this);
            }
        }
    }

    public BottomSheetBehavior() {
        this.f8372a = true;
        this.f8383l = 4;
        this.f8397z = new C1991a();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f8372a = true;
        this.f8383l = 4;
        this.f8397z = new C1991a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        m10127b((peekValue == null || (i = peekValue.data) != -1) ? obtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : i);
        m10128b(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        m10125a(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        m10130c(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f8373b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: b */
    private void m10118b() {
        this.f8380i = this.f8372a ? Math.max(this.f8388q - this.f8377f, this.f8378g) : this.f8388q - this.f8377f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public int m10119c() {
        if (this.f8372a) {
            return this.f8378g;
        }
        return 0;
    }

    /* renamed from: d */
    private float m10120d() {
        VelocityTracker velocityTracker = this.f8392u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f8373b);
        return this.f8392u.getYVelocity(this.f8393v);
    }

    /* renamed from: d */
    private void m10121d(boolean z) {
        int intValue;
        WeakReference<V> weakReference = this.f8389r;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f8396y != null) {
                    return;
                } else {
                    this.f8396y = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f8389r.get()) {
                    if (!z) {
                        Map<View, Integer> map = this.f8396y;
                        intValue = (map != null && map.containsKey(childAt)) ? this.f8396y.get(childAt).intValue() : 4;
                    } else if (Build.VERSION.SDK_INT >= 16) {
                        this.f8396y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    C3107q2.m14912f(childAt, intValue);
                }
            }
            if (z) {
                return;
            }
            this.f8396y = null;
        }
    }

    /* renamed from: e */
    private void m10122e() {
        this.f8393v = -1;
        VelocityTracker velocityTracker = this.f8392u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8392u = null;
        }
    }

    /* renamed from: a */
    View m10123a(View view) {
        if (C3107q2.m14933y(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View m10123a = m10123a(viewGroup.getChildAt(i));
            if (m10123a != null) {
                return m10123a;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m10124a(int i) {
        AbstractC1992b abstractC1992b;
        float f;
        float m10119c;
        V v = this.f8389r.get();
        if (v == null || (abstractC1992b = this.f8391t) == null) {
            return;
        }
        int i2 = this.f8380i;
        if (i > i2) {
            f = i2 - i;
            m10119c = this.f8388q - i2;
        } else {
            f = i2 - i;
            m10119c = i2 - m10119c();
        }
        abstractC1992b.m10132a(v, f / m10119c);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public void mo1295a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1295a(coordinatorLayout, (CoordinatorLayout) v, savedState.m1612a());
        int i = savedState.f8398d;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f8383l = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.f8380i)) goto L33;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1296a(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.m10119c()
            r0 = 3
            if (r4 != r7) goto Lf
            r3.m10129c(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f8390s
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L9f
            boolean r4 = r3.f8387p
            if (r4 != 0) goto L1d
            goto L9f
        L1d:
            int r4 = r3.f8386o
            r6 = 0
            r7 = 4
            if (r4 <= 0) goto L28
            int r4 = r3.m10119c()
            goto L81
        L28:
            boolean r4 = r3.f8381j
            if (r4 == 0) goto L3a
            float r4 = r3.m10120d()
            boolean r4 = r3.m10126a(r5, r4)
            if (r4 == 0) goto L3a
            int r4 = r3.f8388q
            r0 = 5
            goto L81
        L3a:
            int r4 = r3.f8386o
            if (r4 != 0) goto L7e
            int r4 = r5.getTop()
            boolean r1 = r3.f8372a
            r2 = 6
            if (r1 == 0) goto L5b
            int r1 = r3.f8378g
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f8380i
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r1 >= r4) goto L7e
            int r4 = r3.f8378g
            goto L81
        L5b:
            int r1 = r3.f8379h
            if (r4 >= r1) goto L6b
            int r7 = r3.f8380i
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r4 >= r7) goto L7a
            r4 = 0
            goto L81
        L6b:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f8380i
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L7e
        L7a:
            int r4 = r3.f8379h
            r0 = 6
            goto L81
        L7e:
            int r4 = r3.f8380i
            r0 = 4
        L81:
            j3 r7 = r3.f8384m
            int r1 = r5.getLeft()
            boolean r4 = r7.m13388b(r5, r1, r4)
            if (r4 == 0) goto L9a
            r4 = 2
            r3.m10129c(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            r4.<init>(r5, r0)
            p000.C3107q2.m14892a(r5, r4)
            goto L9d
        L9a:
            r3.m10129c(r0)
        L9d:
            r3.f8387p = r6
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1296a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public void mo1300a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1 && view == this.f8390s.get()) {
            int top = v.getTop();
            int i5 = top - i2;
            if (i2 > 0) {
                if (i5 < m10119c()) {
                    iArr[1] = top - m10119c();
                    C3107q2.m14908d(v, -iArr[1]);
                    i4 = 3;
                    m10129c(i4);
                } else {
                    iArr[1] = i2;
                    C3107q2.m14908d(v, -i2);
                    m10129c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f8380i;
                if (i5 <= i6 || this.f8381j) {
                    iArr[1] = i2;
                    C3107q2.m14908d(v, -i2);
                    m10129c(1);
                } else {
                    iArr[1] = top - i6;
                    C3107q2.m14908d(v, -iArr[1]);
                    i4 = 4;
                    m10129c(i4);
                }
            }
            m10124a(v.getTop());
            this.f8386o = i2;
            this.f8387p = true;
        }
    }

    /* renamed from: a */
    public void m10125a(boolean z) {
        if (this.f8372a == z) {
            return;
        }
        this.f8372a = z;
        if (this.f8389r != null) {
            m10118b();
        }
        m10129c((this.f8372a && this.f8383l == 6) ? 3 : this.f8383l);
    }

    /* renamed from: a */
    boolean m10126a(View view, float f) {
        if (this.f8382k) {
            return true;
        }
        return view.getTop() >= this.f8380i && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f8380i)) / ((float) this.f8374c) > 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1304a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, int r7) {
        /*
            r4 = this;
            boolean r0 = p000.C3107q2.m14916h(r5)
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = p000.C3107q2.m14916h(r6)
            if (r0 != 0) goto L10
            r6.setFitsSystemWindows(r1)
        L10:
            int r0 = r6.getTop()
            r5.m1289c(r6, r7)
            int r7 = r5.getHeight()
            r4.f8388q = r7
            boolean r7 = r4.f8375d
            if (r7 == 0) goto L43
            int r7 = r4.f8376e
            if (r7 != 0) goto L31
            android.content.res.Resources r7 = r5.getResources()
            int r2 = com.google.android.material.R$dimen.design_bottom_sheet_peek_height_min
            int r7 = r7.getDimensionPixelSize(r2)
            r4.f8376e = r7
        L31:
            int r7 = r4.f8376e
            int r2 = r4.f8388q
            int r3 = r5.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            goto L45
        L43:
            int r7 = r4.f8374c
        L45:
            r4.f8377f = r7
            r7 = 0
            int r2 = r4.f8388q
            int r3 = r6.getHeight()
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            r4.f8378g = r7
            int r7 = r4.f8388q
            r2 = 2
            int r7 = r7 / r2
            r4.f8379h = r7
            r4.m10118b()
            int r7 = r4.f8383l
            r3 = 3
            if (r7 != r3) goto L6b
            int r7 = r4.m10119c()
        L67:
            p000.C3107q2.m14908d(r6, r7)
            goto L8f
        L6b:
            r3 = 6
            if (r7 != r3) goto L71
            int r7 = r4.f8379h
            goto L67
        L71:
            boolean r3 = r4.f8381j
            if (r3 == 0) goto L7b
            r3 = 5
            if (r7 != r3) goto L7b
            int r7 = r4.f8388q
            goto L67
        L7b:
            int r7 = r4.f8383l
            r3 = 4
            if (r7 != r3) goto L83
            int r7 = r4.f8380i
            goto L67
        L83:
            if (r7 == r1) goto L87
            if (r7 != r2) goto L8f
        L87:
            int r7 = r6.getTop()
            int r0 = r0 - r7
            p000.C3107q2.m14908d(r6, r0)
        L8f:
            j3 r7 = r4.f8384m
            if (r7 != 0) goto L9b
            j3$c r7 = r4.f8397z
            j3 r5 = p000.C2798j3.m13360a(r5, r7)
            r4.f8384m = r5
        L9b:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r6)
            r4.f8389r = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.view.View r6 = r4.m10123a(r6)
            r5.<init>(r6)
            r4.f8390s = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1304a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1308a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C2798j3 c2798j3;
        if (!v.isShown()) {
            this.f8385n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m10122e();
        }
        if (this.f8392u == null) {
            this.f8392u = VelocityTracker.obtain();
        }
        this.f8392u.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f8394w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f8390s;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.m1281a(view, x, this.f8394w)) {
                this.f8393v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f8395x = true;
            }
            this.f8385n = this.f8393v == -1 && !coordinatorLayout.m1281a(v, x, this.f8394w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f8395x = false;
            this.f8393v = -1;
            if (this.f8385n) {
                this.f8385n = false;
                return false;
            }
        }
        if (!this.f8385n && (c2798j3 = this.f8384m) != null && c2798j3.m13386b(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f8390s;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f8385n || this.f8383l == 1 || coordinatorLayout.m1281a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f8384m == null || Math.abs(((float) this.f8394w) - motionEvent.getY()) <= ((float) this.f8384m.m13383b())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1310a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f8390s.get() && (this.f8383l != 3 || super.mo1310a(coordinatorLayout, (CoordinatorLayout) v, view, f, f2));
    }

    /* renamed from: b */
    public final void m10127b(int i) {
        WeakReference<V> weakReference;
        V v;
        boolean z = true;
        if (i == -1) {
            if (!this.f8375d) {
                this.f8375d = true;
            }
            z = false;
        } else {
            if (this.f8375d || this.f8374c != i) {
                this.f8375d = false;
                this.f8374c = Math.max(0, i);
                this.f8380i = this.f8388q - i;
            }
            z = false;
        }
        if (!z || this.f8383l != 4 || (weakReference = this.f8389r) == null || (v = weakReference.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    /* renamed from: b */
    public void m10128b(boolean z) {
        this.f8381j = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: b */
    public boolean mo1313b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8383l == 1 && actionMasked == 0) {
            return true;
        }
        C2798j3 c2798j3 = this.f8384m;
        if (c2798j3 != null) {
            c2798j3.m13378a(motionEvent);
        }
        if (actionMasked == 0) {
            m10122e();
        }
        if (this.f8392u == null) {
            this.f8392u = VelocityTracker.obtain();
        }
        this.f8392u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f8385n && Math.abs(this.f8394w - motionEvent.getY()) > this.f8384m.m13383b()) {
            this.f8384m.m13379a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f8385n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: b */
    public boolean mo1316b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f8386o = 0;
        this.f8387p = false;
        return (i & 2) != 0;
    }

    /* renamed from: c */
    void m10129c(int i) {
        boolean z;
        V v;
        AbstractC1992b abstractC1992b;
        if (this.f8383l == i) {
            return;
        }
        this.f8383l = i;
        if (i != 6 && i != 3) {
            z = (i == 5 || i == 4) ? false : true;
            v = this.f8389r.get();
            if (v != null || (abstractC1992b = this.f8391t) == null) {
            }
            abstractC1992b.m10133a((View) v, i);
            return;
        }
        m10121d(z);
        v = this.f8389r.get();
        if (v != null) {
        }
    }

    /* renamed from: c */
    public void m10130c(boolean z) {
        this.f8382k = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: d */
    public Parcelable mo1319d(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1319d(coordinatorLayout, v), this.f8383l);
    }
}
