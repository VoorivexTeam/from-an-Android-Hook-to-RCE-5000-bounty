package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p000.C0448b3;
import p000.C2372d3;
import p000.C2797j2;
import p000.C2919m2;
import p000.C3107q2;
import p000.C3508z1;
import p000.InterfaceC2535h2;
import p000.InterfaceC2837k2;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC2837k2, InterfaceC2535h2 {

    /* renamed from: B */
    private static final C0247a f1491B = new C0247a();

    /* renamed from: C */
    private static final int[] f1492C = {R.attr.fillViewport};

    /* renamed from: A */
    private InterfaceC0248b f1493A;

    /* renamed from: b */
    private long f1494b;

    /* renamed from: c */
    private final Rect f1495c;

    /* renamed from: d */
    private OverScroller f1496d;

    /* renamed from: e */
    private EdgeEffect f1497e;

    /* renamed from: f */
    private EdgeEffect f1498f;

    /* renamed from: g */
    private int f1499g;

    /* renamed from: h */
    private boolean f1500h;

    /* renamed from: i */
    private boolean f1501i;

    /* renamed from: j */
    private View f1502j;

    /* renamed from: k */
    private boolean f1503k;

    /* renamed from: l */
    private VelocityTracker f1504l;

    /* renamed from: m */
    private boolean f1505m;

    /* renamed from: n */
    private boolean f1506n;

    /* renamed from: o */
    private int f1507o;

    /* renamed from: p */
    private int f1508p;

    /* renamed from: q */
    private int f1509q;

    /* renamed from: r */
    private int f1510r;

    /* renamed from: s */
    private final int[] f1511s;

    /* renamed from: t */
    private final int[] f1512t;

    /* renamed from: u */
    private int f1513u;

    /* renamed from: v */
    private int f1514v;

    /* renamed from: w */
    private SavedState f1515w;

    /* renamed from: x */
    private final C2919m2 f1516x;

    /* renamed from: y */
    private final C2797j2 f1517y;

    /* renamed from: z */
    private float f1518z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0246a();

        /* renamed from: b */
        public int f1519b;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        /* loaded from: classes.dex */
        static class C0246a implements Parcelable.Creator<SavedState> {
            C0246a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1519b = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1519b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1519b);
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C0247a extends C3508z1 {
        C0247a() {
        }

        @Override // p000.C3508z1
        /* renamed from: a */
        public void mo1538a(View view, C0448b3 c0448b3) {
            int scrollRange;
            super.mo1538a(view, c0448b3);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0448b3.m3281a((CharSequence) ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0448b3.m3294d(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0448b3.m3279a(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0448b3.m3279a(4096);
            }
        }

        @Override // p000.C3508z1
        /* renamed from: a */
        public boolean mo1539a(View view, int i, Bundle bundle) {
            if (super.mo1539a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m1531b(0, min);
                return true;
            }
            if (i != 8192) {
                return false;
            }
            int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
            if (max == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m1531b(0, max);
            return true;
        }

        @Override // p000.C3508z1
        /* renamed from: b */
        public void mo1540b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1540b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C2372d3.m11253a(accessibilityEvent, nestedScrollView.getScrollX());
            C2372d3.m11254b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0248b {
        /* renamed from: a */
        void mo350a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1495c = new Rect();
        this.f1500h = true;
        this.f1501i = false;
        this.f1502j = null;
        this.f1503k = false;
        this.f1506n = true;
        this.f1510r = -1;
        this.f1511s = new int[2];
        this.f1512t = new int[2];
        m1519e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1492C, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1516x = new C2919m2(this);
        this.f1517y = new C2797j2(this);
        setNestedScrollingEnabled(true);
        C3107q2.m14897a(this, f1491B);
    }

    /* renamed from: a */
    private static int m1505a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    private View m1506a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m1507a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1510r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1499g = (int) motionEvent.getY(i);
            this.f1510r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1504l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m1508a() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: a */
    private boolean m1509a(Rect rect, boolean z) {
        int m1524a = m1524a(rect);
        boolean z2 = m1524a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m1524a);
            } else {
                m1526a(0, m1524a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m1510a(View view) {
        return !m1511a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m1511a(View view, int i, int i2) {
        view.getDrawingRect(this.f1495c);
        offsetDescendantRectToMyCoords(view, this.f1495c);
        return this.f1495c.bottom + i >= getScrollY() && this.f1495c.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m1512a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1512a((View) parent, view2);
    }

    /* renamed from: b */
    private void m1513b() {
        this.f1503k = false;
        m1521g();
        mo1525a(0);
        EdgeEffect edgeEffect = this.f1497e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1498f.onRelease();
        }
    }

    /* renamed from: b */
    private void m1514b(View view) {
        view.getDrawingRect(this.f1495c);
        offsetDescendantRectToMyCoords(view, this.f1495c);
        int m1524a = m1524a(this.f1495c);
        if (m1524a != 0) {
            scrollBy(0, m1524a);
        }
    }

    /* renamed from: b */
    private boolean m1515b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View m1506a = m1506a(z2, i2, i3);
        if (m1506a == null) {
            m1506a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1522g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (m1506a != findFocus()) {
            m1506a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: c */
    private void m1516c() {
        if (getOverScrollMode() == 2) {
            this.f1497e = null;
            this.f1498f = null;
        } else if (this.f1497e == null) {
            Context context = getContext();
            this.f1497e = new EdgeEffect(context);
            this.f1498f = new EdgeEffect(context);
        }
    }

    /* renamed from: d */
    private void m1517d() {
        VelocityTracker velocityTracker = this.f1504l;
        if (velocityTracker == null) {
            this.f1504l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: d */
    private boolean m1518d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: e */
    private void m1519e() {
        this.f1496d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1507o = viewConfiguration.getScaledTouchSlop();
        this.f1508p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1509q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: f */
    private void m1520f() {
        if (this.f1504l == null) {
            this.f1504l = VelocityTracker.obtain();
        }
    }

    /* renamed from: g */
    private void m1521g() {
        VelocityTracker velocityTracker = this.f1504l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1504l = null;
        }
    }

    /* renamed from: g */
    private void m1522g(int i) {
        if (i != 0) {
            if (this.f1506n) {
                m1526a(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1518z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1518z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1518z;
    }

    /* renamed from: h */
    private void m1523h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = i;
        if (dispatchNestedPreFling(0.0f, f)) {
            return;
        }
        dispatchNestedFling(0.0f, f, z);
        m1533c(i);
    }

    /* renamed from: a */
    protected int m1524a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // p000.InterfaceC2535h2
    /* renamed from: a */
    public void mo1525a(int i) {
        this.f1517y.m13344c(i);
    }

    /* renamed from: a */
    public final void m1526a(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1494b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f1514v = getScrollY();
            this.f1496d.startScroll(getScrollX(), scrollY, 0, max);
            C3107q2.m14877A(this);
        } else {
            if (!this.f1496d.isFinished()) {
                this.f1496d.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.f1494b = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: a */
    public void mo1273a(View view, int i) {
        this.f1516x.m13996a(view, i);
        mo1525a(i);
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: a */
    public void mo1275a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        m1528a(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: a */
    public void mo1276a(View view, int i, int i2, int[] iArr, int i3) {
        m1529a(i, i2, iArr, (int[]) null, i3);
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: a */
    public void mo1279a(View view, View view2, int i, int i2) {
        this.f1516x.m13998a(view, view2, i, i2);
        m1534c(2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m1527a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.m1536e(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f1496d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m1527a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean m1528a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f1517y.m13338a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean m1529a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1517y.m13340a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean m1530a(KeyEvent keyEvent) {
        this.f1495c.setEmpty();
        if (!m1508a()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? m1532b(33) : m1535d(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? m1532b(130) : m1535d(130);
        }
        if (keyCode != 62) {
            return false;
        }
        m1537f(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public final void m1531b(int i, int i2) {
        m1526a(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    public boolean m1532b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1511a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1522g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1495c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1495c);
            m1522g(m1524a(this.f1495c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m1510a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: b */
    public boolean mo1286b(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public void m1533c(int i) {
        if (getChildCount() > 0) {
            m1534c(2, 1);
            this.f1496d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1514v = getScrollY();
            C3107q2.m14877A(this);
        }
    }

    /* renamed from: c */
    public boolean m1534c(int i, int i2) {
        return this.f1517y.m13336a(i, i2);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f1496d.computeScrollOffset()) {
            if (m1536e(1)) {
                mo1525a(1);
            }
            this.f1514v = 0;
            return;
        }
        this.f1496d.getCurrX();
        int currY = this.f1496d.getCurrY();
        int i = currY - this.f1514v;
        if (m1529a(0, i, this.f1512t, (int[]) null, 1)) {
            i -= this.f1512t[1];
        }
        int i2 = i;
        if (i2 != 0) {
            int scrollRange = getScrollRange();
            int scrollY = getScrollY();
            m1527a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            if (!m1528a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, 1)) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    m1516c();
                    if (currY <= 0 && scrollY > 0) {
                        edgeEffect = this.f1497e;
                    } else if (currY >= scrollRange && scrollY < scrollRange) {
                        edgeEffect = this.f1498f;
                    }
                    edgeEffect.onAbsorb((int) this.f1496d.getCurrVelocity());
                }
            }
        }
        this.f1514v = currY;
        C3107q2.m14877A(this);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public boolean m1535d(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1495c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1495c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1495c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1495c;
        return m1515b(i, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1530a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1517y.m13334a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1517y.m13333a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m1529a(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m1528a(i, i2, i3, i4, iArr, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f1497e != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f1497e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.f1497e.setSize(width, height);
                if (this.f1497e.draw(canvas)) {
                    C3107q2.m14877A(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.f1498f.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i = 0 + getPaddingLeft();
            }
            if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f1498f.setSize(width2, height2);
            if (this.f1498f.draw(canvas)) {
                C3107q2.m14877A(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: e */
    public boolean m1536e(int i) {
        return this.f1517y.m13335a(i);
    }

    /* renamed from: f */
    public boolean m1537f(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1495c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1495c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1495c.top = getScrollY() - height;
            Rect rect2 = this.f1495c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1495c;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m1515b(i, i2, i3);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1516x.m13994a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m1536e(0);
    }

    @Override // android.view.View, p000.InterfaceC2575i2
    public boolean isNestedScrollingEnabled() {
        return this.f1517y.m13341b();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1501i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1503k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1503k) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1510r;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            String str = "Invalid pointerId=" + i2 + " in onInterceptTouchEvent";
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1499g) > this.f1507o && (2 & getNestedScrollAxes()) == 0) {
                                this.f1503k = true;
                                this.f1499g = y;
                                m1520f();
                                this.f1504l.addMovement(motionEvent);
                                this.f1513u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1507a(motionEvent);
                    }
                }
            }
            this.f1503k = false;
            this.f1510r = -1;
            m1521g();
            if (this.f1496d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C3107q2.m14877A(this);
            }
            mo1525a(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (m1518d((int) motionEvent.getX(), y2)) {
                this.f1499g = y2;
                this.f1510r = motionEvent.getPointerId(0);
                m1517d();
                this.f1504l.addMovement(motionEvent);
                this.f1496d.computeScrollOffset();
                this.f1503k = !this.f1496d.isFinished();
                m1534c(2, 0);
            } else {
                this.f1503k = false;
                m1521g();
            }
        }
        return this.f1503k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1500h = false;
        View view = this.f1502j;
        if (view != null && m1512a(view, this)) {
            m1514b(this.f1502j);
        }
        this.f1502j = null;
        if (!this.f1501i) {
            if (this.f1515w != null) {
                scrollTo(getScrollX(), this.f1515w.f1519b);
                this.f1515w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m1505a = m1505a(scrollY, paddingTop, i5);
            if (m1505a != scrollY) {
                scrollTo(getScrollX(), m1505a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1501i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1505m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m1523h((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1276a(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1275a(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1279a(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || m1510a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1515w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1519b = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0248b interfaceC0248b = this.f1493A;
        if (interfaceC0248b != null) {
            interfaceC0248b.mo350a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1511a(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f1495c);
        offsetDescendantRectToMyCoords(findFocus, this.f1495c);
        m1522g(m1524a(this.f1495c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1286b(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onStopNestedScroll(View view) {
        mo1273a(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r23.f1496d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        p000.C3107q2.m14877A(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0210, code lost:
    
        if (r23.f1496d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1500h) {
            this.f1502j = view2;
        } else {
            m1514b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1509a(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1521g();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1500h = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m1505a = m1505a(i, width, width2);
            int m1505a2 = m1505a(i2, height, height2);
            if (m1505a == getScrollX() && m1505a2 == getScrollY()) {
                return;
            }
            super.scrollTo(m1505a, m1505a2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1505m) {
            this.f1505m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f1517y.m13331a(z);
    }

    public void setOnScrollChangeListener(InterfaceC0248b interfaceC0248b) {
        this.f1493A = interfaceC0248b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1506n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m1534c(i, 0);
    }

    @Override // android.view.View, p000.InterfaceC2575i2
    public void stopNestedScroll() {
        mo1525a(0);
    }
}
