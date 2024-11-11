package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.C2370d1;
import p000.C2565ht;
import p000.C3107q2;
import p000.C3460y2;
import p000.InterfaceC2575i2;

@CoordinatorLayout.InterfaceC0215d(Behavior.class)
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout {

    /* renamed from: b */
    private int f8280b;

    /* renamed from: c */
    private int f8281c;

    /* renamed from: d */
    private int f8282d;

    /* renamed from: e */
    private boolean f8283e;

    /* renamed from: f */
    private int f8284f;

    /* renamed from: g */
    private C3460y2 f8285g;

    /* renamed from: h */
    private List<InterfaceC1972a> f8286h;

    /* renamed from: i */
    private boolean f8287i;

    /* renamed from: j */
    private boolean f8288j;

    /* renamed from: k */
    private boolean f8289k;

    /* renamed from: l */
    private boolean f8290l;

    /* renamed from: m */
    private int[] f8291m;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC1974a<T> {

        /* renamed from: k */
        private int f8292k;

        /* renamed from: l */
        private int f8293l;

        /* renamed from: m */
        private ValueAnimator f8294m;

        /* renamed from: n */
        private int f8295n;

        /* renamed from: o */
        private boolean f8296o;

        /* renamed from: p */
        private float f8297p;

        /* renamed from: q */
        private WeakReference<View> f8298q;

        /* renamed from: r */
        private AbstractC1971b f8299r;

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C1969a();

            /* renamed from: d */
            int f8300d;

            /* renamed from: e */
            float f8301e;

            /* renamed from: f */
            boolean f8302f;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            /* loaded from: classes.dex */
            static class C1969a implements Parcelable.ClassLoaderCreator<SavedState> {
                C1969a() {
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
                this.f8300d = parcel.readInt();
                this.f8301e = parcel.readFloat();
                this.f8302f = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f8300d);
                parcel.writeFloat(this.f8301e);
                parcel.writeByte(this.f8302f ? (byte) 1 : (byte) 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes.dex */
        public class C1970a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f8303a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f8304b;

            C1970a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f8303a = coordinatorLayout;
                this.f8304b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m10042c(this.f8303a, (CoordinatorLayout) this.f8304b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1971b<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean m10028a(T t);
        }

        public BaseBehavior() {
            this.f8295n = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8295n = -1;
        }

        /* renamed from: a */
        private View m9997a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof InterfaceC2575i2) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private static View m9998a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private void m9999a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int mo10024c = mo10024c();
                if ((i >= 0 || mo10024c != 0) && (i <= 0 || mo10024c != (-t.getDownNestedScrollRange()))) {
                    return;
                }
                C3107q2.m14915h(view, 1);
            }
        }

        /* renamed from: a */
        private void m10000a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo10024c() - i);
            float abs2 = Math.abs(f);
            m10001a(coordinatorLayout, (CoordinatorLayout) t, i, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f));
        }

        /* renamed from: a */
        private void m10001a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int mo10024c = mo10024c();
            if (mo10024c == i) {
                ValueAnimator valueAnimator = this.f8294m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f8294m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f8294m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f8294m = valueAnimator3;
                valueAnimator3.setInterpolator(C2565ht.f10513e);
                this.f8294m.addUpdateListener(new C1970a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f8294m.setDuration(Math.min(i2, 600));
            this.f8294m.setIntValues(mo10024c, i);
            this.f8294m.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m10002a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = m9998a(r7, r8)
                if (r0 == 0) goto L6e
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$b r1 = (com.google.android.material.appbar.AppBarLayout.C1973b) r1
                int r1 = r1.m10036a()
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L41
                int r2 = p000.C3107q2.m14920l(r0)
                if (r9 <= 0) goto L2f
                r9 = r1 & 12
                if (r9 == 0) goto L2f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L41
            L2d:
                r8 = 1
                goto L42
            L2f:
                r9 = r1 & 2
                if (r9 == 0) goto L41
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L41
                goto L2d
            L41:
                r8 = 0
            L42:
                boolean r9 = r7.m9994c()
                if (r9 == 0) goto L57
                android.view.View r9 = r5.m9997a(r6)
                if (r9 == 0) goto L57
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L55
                goto L56
            L55:
                r3 = 0
            L56:
                r8 = r3
            L57:
                boolean r8 = r7.m9992a(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L6e
                if (r10 != 0) goto L6b
                if (r8 == 0) goto L6e
                boolean r6 = r5.m10007c(r6, r7)
                if (r6 == 0) goto L6e
            L6b:
                r7.jumpDrawablesToCurrentState()
            L6e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m10002a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: a */
        private static boolean m10003a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a */
        private boolean m10004a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.m9993b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: b */
        private int m10005b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C1973b c1973b = (C1973b) childAt.getLayoutParams();
                if (m10003a(c1973b.m10036a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c1973b).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c1973b).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private int m10006c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C1973b c1973b = (C1973b) childAt.getLayoutParams();
                Interpolator m10037b = c1973b.m10037b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (m10037b != null) {
                    int m10036a = c1973b.m10036a();
                    if ((m10036a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c1973b).topMargin + ((LinearLayout.LayoutParams) c1973b).bottomMargin;
                        if ((m10036a & 2) != 0) {
                            i2 -= C3107q2.m14920l(childAt);
                        }
                    }
                    if (C3107q2.m14916h(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * m10037b.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: c */
        private boolean m10007c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m1287c = coordinatorLayout.m1287c(t);
            int size = m1287c.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC0214c m1336d = ((CoordinatorLayout.C0217f) m1287c.get(i).getLayoutParams()).m1336d();
                if (m1336d instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) m1336d).m10047c() != 0;
                }
            }
            return false;
        }

        /* renamed from: d */
        private void m10008d(CoordinatorLayout coordinatorLayout, T t) {
            int mo10024c = mo10024c();
            int m10005b = m10005b((BaseBehavior<T>) t, mo10024c);
            if (m10005b >= 0) {
                View childAt = t.getChildAt(m10005b);
                C1973b c1973b = (C1973b) childAt.getLayoutParams();
                int m10036a = c1973b.m10036a();
                if ((m10036a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m10005b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m10003a(m10036a, 2)) {
                        i2 += C3107q2.m14920l(childAt);
                    } else if (m10003a(m10036a, 5)) {
                        int m14920l = C3107q2.m14920l(childAt) + i2;
                        if (mo10024c < m14920l) {
                            i = m14920l;
                        } else {
                            i2 = m14920l;
                        }
                    }
                    if (m10003a(m10036a, 32)) {
                        i += ((LinearLayout.LayoutParams) c1973b).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) c1973b).bottomMargin;
                    }
                    if (mo10024c < (i2 + i) / 2) {
                        i = i2;
                    }
                    m10000a(coordinatorLayout, (CoordinatorLayout) t, C2370d1.m11244a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1974a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int mo10021b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int mo10024c = mo10024c();
            int i4 = 0;
            if (i2 == 0 || mo10024c < i2 || mo10024c > i3) {
                this.f8292k = 0;
            } else {
                int m11244a = C2370d1.m11244a(i, i2, i3);
                if (mo10024c != m11244a) {
                    int m10006c = t.m9991a() ? m10006c((BaseBehavior<T>) t, m11244a) : m11244a;
                    boolean m10049a = m10049a(m10006c);
                    i4 = mo10024c - m11244a;
                    this.f8292k = m11244a - m10006c;
                    if (!m10049a && t.m9991a()) {
                        coordinatorLayout.m1272a(t);
                    }
                    t.m9989a(m10050b());
                    m10002a(coordinatorLayout, (CoordinatorLayout) t, m11244a, m11244a < mo10024c ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1974a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo10027e(CoordinatorLayout coordinatorLayout, T t) {
            m10008d(coordinatorLayout, (CoordinatorLayout) t);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo1295a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                super.mo1295a(coordinatorLayout, (CoordinatorLayout) t, parcelable);
                this.f8295n = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            super.mo1295a(coordinatorLayout, (CoordinatorLayout) t, savedState.m1612a());
            this.f8295n = savedState.f8300d;
            this.f8297p = savedState.f8301e;
            this.f8296o = savedState.f8302f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo1296a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f8293l == 0 || i == 1) {
                m10008d(coordinatorLayout, (CoordinatorLayout) t);
            }
            this.f8298q = new WeakReference<>(view);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo1298a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                m10040a(coordinatorLayout, (CoordinatorLayout) t, i4, -t.getDownNestedScrollRange(), 0);
                m9999a(i4, (int) t, view, i5);
            }
            if (t.m9994c()) {
                t.m9992a(view.getScrollY() > 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo1300a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i4 = i6;
                    i5 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = m10040a(coordinatorLayout, (CoordinatorLayout) t, i2, i4, i5);
                    m9999a(i2, (int) t, view, i3);
                }
            }
        }

        @Override // com.google.android.material.appbar.C1976c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo1304a(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean mo1304a = super.mo1304a(coordinatorLayout, (CoordinatorLayout) t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f8295n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                m10042c(coordinatorLayout, (CoordinatorLayout) t, (-childAt.getBottom()) + (this.f8296o ? C3107q2.m14920l(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.f8297p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m10000a(coordinatorLayout, (CoordinatorLayout) t, i3, 0.0f);
                    } else {
                        m10042c(coordinatorLayout, (CoordinatorLayout) t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m10000a(coordinatorLayout, (CoordinatorLayout) t, 0, 0.0f);
                    } else {
                        m10042c(coordinatorLayout, (CoordinatorLayout) t, 0);
                    }
                }
            }
            t.m9995d();
            this.f8295n = -1;
            m10049a(C2370d1.m11244a(m10050b(), -t.getTotalScrollRange(), 0));
            m10002a(coordinatorLayout, (CoordinatorLayout) t, m10050b(), 0, true);
            t.m9989a(m10050b());
            return mo1304a;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo1305a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0217f) t.getLayoutParams())).height != -2) {
                return super.mo1305a(coordinatorLayout, (CoordinatorLayout) t, i, i2, i3, i4);
            }
            coordinatorLayout.m1274a(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo1316b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.m9994c() || m10004a(coordinatorLayout, (CoordinatorLayout) t, view));
            if (z && (valueAnimator = this.f8294m) != null) {
                valueAnimator.cancel();
            }
            this.f8298q = null;
            this.f8293l = i2;
            return z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1974a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo10015a(T t) {
            AbstractC1971b abstractC1971b = this.f8299r;
            if (abstractC1971b != null) {
                return abstractC1971b.m10028a(t);
            }
            WeakReference<View> weakReference = this.f8298q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1974a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo10020b(T t) {
            return -t.getDownNestedScrollRange();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo1319d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable mo1319d = super.mo1319d(coordinatorLayout, (CoordinatorLayout) t);
            int m10050b = m10050b();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + m10050b;
                if (childAt.getTop() + m10050b <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(mo1319d);
                    savedState.f8300d = i;
                    savedState.f8302f = bottom == C3107q2.m14920l(childAt) + t.getTopInset();
                    savedState.f8301e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return mo1319d;
        }

        @Override // com.google.android.material.appbar.AbstractC1974a
        /* renamed from: c */
        int mo10024c() {
            return m10050b() + this.f8292k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1974a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo10025c(T t) {
            return t.getTotalScrollRange();
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends AbstractC1975b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            m10045b(obtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static int m10029a(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0214c m1336d = ((CoordinatorLayout.C0217f) appBarLayout.getLayoutParams()).m1336d();
            if (m1336d instanceof BaseBehavior) {
                return ((BaseBehavior) m1336d).mo10024c();
            }
            return 0;
        }

        /* renamed from: a */
        private void m10030a(View view, View view2) {
            CoordinatorLayout.AbstractC0214c m1336d = ((CoordinatorLayout.C0217f) view2.getLayoutParams()).m1336d();
            if (m1336d instanceof BaseBehavior) {
                C3107q2.m14908d(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m1336d).f8292k) + m10048d()) - m10044a(view2));
            }
        }

        /* renamed from: b */
        private void m10031b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m9994c()) {
                    appBarLayout.m9992a(view.getScrollY() > 0);
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC1975b
        /* renamed from: a */
        /* bridge */ /* synthetic */ View mo10032a(List list) {
            return mo10032a((List<View>) list);
        }

        @Override // com.google.android.material.appbar.AbstractC1975b
        /* renamed from: a */
        AppBarLayout mo10032a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a */
        public boolean mo1307a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout mo10032a = mo10032a(coordinatorLayout.m1282b(view));
            if (mo10032a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f8318d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo10032a.m9990a(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a */
        public boolean mo1309a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // com.google.android.material.appbar.AbstractC1975b
        /* renamed from: b */
        float mo10033b(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m10029a = m10029a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m10029a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m10029a / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: b */
        public boolean mo1314b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m10030a(view, view2);
            m10031b(view, view2);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1975b
        /* renamed from: c */
        public int mo10034c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo10034c(view);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1972a<T extends AppBarLayout> {
        /* renamed from: a */
        void m10035a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes.dex */
    public static class C1973b extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f8306a;

        /* renamed from: b */
        Interpolator f8307b;

        public C1973b(int i, int i2) {
            super(i, i2);
            this.f8306a = 1;
        }

        public C1973b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8306a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
            this.f8306a = obtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f8307b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C1973b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8306a = 1;
        }

        public C1973b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8306a = 1;
        }

        public C1973b(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8306a = 1;
        }

        /* renamed from: a */
        public int m10036a() {
            return this.f8306a;
        }

        /* renamed from: b */
        public Interpolator m10037b() {
            return this.f8307b;
        }

        /* renamed from: c */
        boolean m10038c() {
            int i = this.f8306a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    /* renamed from: a */
    private void m9985a(boolean z, boolean z2, boolean z3) {
        this.f8284f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: b */
    private boolean m9986b(boolean z) {
        if (this.f8288j == z) {
            return false;
        }
        this.f8288j = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: e */
    private boolean m9987e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C1973b) getChildAt(i).getLayoutParams()).m10038c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m9988f() {
        this.f8280b = -1;
        this.f8281c = -1;
        this.f8282d = -1;
    }

    /* renamed from: a */
    void m9989a(int i) {
        List<InterfaceC1972a> list = this.f8286h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1972a interfaceC1972a = this.f8286h.get(i2);
                if (interfaceC1972a != null) {
                    interfaceC1972a.m10035a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void m9990a(boolean z, boolean z2) {
        m9985a(z, z2, true);
    }

    /* renamed from: a */
    boolean m9991a() {
        return this.f8283e;
    }

    /* renamed from: a */
    boolean m9992a(boolean z) {
        if (this.f8289k == z) {
            return false;
        }
        this.f8289k = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: b */
    boolean m9993b() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: c */
    public boolean m9994c() {
        return this.f8290l;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1973b;
    }

    /* renamed from: d */
    void m9995d() {
        this.f8284f = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public C1973b generateDefaultLayoutParams() {
        return new C1973b(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public C1973b generateLayoutParams(AttributeSet attributeSet) {
        return new C1973b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public C1973b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1973b((ViewGroup.MarginLayoutParams) layoutParams) : new C1973b(layoutParams) : new C1973b((LinearLayout.LayoutParams) layoutParams);
    }

    int getDownNestedPreScrollRange() {
        int i = this.f8281c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C1973b c1973b = (C1973b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c1973b.f8306a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = i2 + ((LinearLayout.LayoutParams) c1973b).topMargin + ((LinearLayout.LayoutParams) c1973b).bottomMargin;
                i2 = (i3 & 8) != 0 ? i4 + C3107q2.m14920l(childAt) : i4 + (measuredHeight - ((i3 & 2) != 0 ? C3107q2.m14920l(childAt) : getTopInset()));
            }
        }
        int max = Math.max(0, i2);
        this.f8281c = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.f8282d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C1973b c1973b = (C1973b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c1973b).topMargin + ((LinearLayout.LayoutParams) c1973b).bottomMargin;
            int i4 = c1973b.f8306a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C3107q2.m14920l(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f8282d = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m14920l = C3107q2.m14920l(this);
        if (m14920l == 0) {
            int childCount = getChildCount();
            m14920l = childCount >= 1 ? C3107q2.m14920l(getChildAt(childCount - 1)) : 0;
            if (m14920l == 0) {
                return getHeight() / 3;
            }
        }
        return (m14920l * 2) + topInset;
    }

    int getPendingAction() {
        return this.f8284f;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C3460y2 c3460y2 = this.f8285g;
        if (c3460y2 != null) {
            return c3460y2.m16558d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f8280b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C1973b c1973b = (C1973b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c1973b.f8306a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) c1973b).topMargin + ((LinearLayout.LayoutParams) c1973b).bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= C3107q2.m14920l(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f8280b = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.f8291m == null) {
            this.f8291m = new int[4];
        }
        int[] iArr = this.f8291m;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f8288j ? R$attr.state_liftable : -R$attr.state_liftable;
        iArr[1] = (this.f8288j && this.f8289k) ? R$attr.state_lifted : -R$attr.state_lifted;
        iArr[2] = this.f8288j ? R$attr.state_collapsible : -R$attr.state_collapsible;
        iArr[3] = (this.f8288j && this.f8289k) ? R$attr.state_collapsed : -R$attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m9988f();
        this.f8283e = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            if (((C1973b) getChildAt(i5).getLayoutParams()).m10037b() != null) {
                this.f8283e = true;
                break;
            }
            i5++;
        }
        if (this.f8287i) {
            return;
        }
        m9986b(this.f8290l || m9987e());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m9988f();
    }

    public void setExpanded(boolean z) {
        m9990a(z, C3107q2.m14932x(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f8290l = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1978e.m10056a(this, f);
        }
    }
}
