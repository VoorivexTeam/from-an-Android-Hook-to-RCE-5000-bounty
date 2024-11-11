package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.view.menu.InterfaceC0106o;
import p000.C2919m2;
import p000.C3107q2;
import p000.InterfaceC2882l2;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0209z, InterfaceC2882l2 {

    /* renamed from: C */
    static final int[] f727C = {R$attr.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: A */
    private final Runnable f728A;

    /* renamed from: B */
    private final C2919m2 f729B;

    /* renamed from: b */
    private int f730b;

    /* renamed from: c */
    private int f731c;

    /* renamed from: d */
    private ContentFrameLayout f732d;

    /* renamed from: e */
    ActionBarContainer f733e;

    /* renamed from: f */
    private InterfaceC0159a0 f734f;

    /* renamed from: g */
    private Drawable f735g;

    /* renamed from: h */
    private boolean f736h;

    /* renamed from: i */
    private boolean f737i;

    /* renamed from: j */
    private boolean f738j;

    /* renamed from: k */
    private boolean f739k;

    /* renamed from: l */
    boolean f740l;

    /* renamed from: m */
    private int f741m;

    /* renamed from: n */
    private int f742n;

    /* renamed from: o */
    private final Rect f743o;

    /* renamed from: p */
    private final Rect f744p;

    /* renamed from: q */
    private final Rect f745q;

    /* renamed from: r */
    private final Rect f746r;

    /* renamed from: s */
    private final Rect f747s;

    /* renamed from: t */
    private final Rect f748t;

    /* renamed from: u */
    private final Rect f749u;

    /* renamed from: v */
    private InterfaceC0118d f750v;

    /* renamed from: w */
    private OverScroller f751w;

    /* renamed from: x */
    ViewPropertyAnimator f752x;

    /* renamed from: y */
    final AnimatorListenerAdapter f753y;

    /* renamed from: z */
    private final Runnable f754z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    class C0115a extends AnimatorListenerAdapter {
        C0115a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f752x = null;
            actionBarOverlayLayout.f740l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f752x = null;
            actionBarOverlayLayout.f740l = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    class RunnableC0116b implements Runnable {
        RunnableC0116b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m762h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f752x = actionBarOverlayLayout.f733e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f753y);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    class RunnableC0117c implements Runnable {
        RunnableC0117c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m762h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f752x = actionBarOverlayLayout.f733e.animate().translationY(-ActionBarOverlayLayout.this.f733e.getHeight()).setListener(ActionBarOverlayLayout.this.f753y);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0118d {
        /* renamed from: a */
        void mo524a();

        /* renamed from: a */
        void mo526a(int i);

        /* renamed from: a */
        void mo528a(boolean z);

        /* renamed from: b */
        void mo529b();

        /* renamed from: c */
        void mo530c();

        /* renamed from: d */
        void mo531d();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0119e extends ViewGroup.MarginLayoutParams {
        public C0119e(int i, int i2) {
            super(i, i2);
        }

        public C0119e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0119e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f731c = 0;
        this.f743o = new Rect();
        this.f744p = new Rect();
        this.f745q = new Rect();
        this.f746r = new Rect();
        this.f747s = new Rect();
        this.f748t = new Rect();
        this.f749u = new Rect();
        this.f753y = new C0115a();
        this.f754z = new RunnableC0116b();
        this.f728A = new RunnableC0117c();
        m746a(context);
        this.f729B = new C2919m2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private InterfaceC0159a0 m745a(View view) {
        if (view instanceof InterfaceC0159a0) {
            return (InterfaceC0159a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private void m746a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f727C);
        this.f730b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f735g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f736h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f751w = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m747a(float f, float f2) {
        this.f751w.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f751w.getFinalY() > this.f733e.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m748a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0119e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m748a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: k */
    private void m749k() {
        m762h();
        this.f728A.run();
    }

    /* renamed from: l */
    private void m750l() {
        m762h();
        postDelayed(this.f728A, 600L);
    }

    /* renamed from: m */
    private void m751m() {
        m762h();
        postDelayed(this.f754z, 600L);
    }

    /* renamed from: n */
    private void m752n() {
        m762h();
        this.f754z.run();
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    /* renamed from: a */
    public void mo753a(int i) {
        m764j();
        if (i == 2) {
            this.f734f.mo918m();
        } else if (i == 5) {
            this.f734f.mo919n();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    /* renamed from: a */
    public void mo754a(Menu menu, InterfaceC0106o.a aVar) {
        m764j();
        this.f734f.mo900a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    /* renamed from: a */
    public boolean mo755a() {
        m764j();
        return this.f734f.mo903a();
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    /* renamed from: b */
    public void mo756b() {
        m764j();
        this.f734f.mo904b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    /* renamed from: c */
    public boolean mo757c() {
        m764j();
        return this.f734f.mo908c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0119e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    /* renamed from: d */
    public boolean mo758d() {
        m764j();
        return this.f734f.mo909d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f735g == null || this.f736h) {
            return;
        }
        int bottom = this.f733e.getVisibility() == 0 ? (int) (this.f733e.getBottom() + this.f733e.getTranslationY() + 0.5f) : 0;
        this.f735g.setBounds(0, bottom, getWidth(), this.f735g.getIntrinsicHeight() + bottom);
        this.f735g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    /* renamed from: e */
    public boolean mo759e() {
        m764j();
        return this.f734f.mo910e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    /* renamed from: f */
    public boolean mo760f() {
        m764j();
        return this.f734f.mo911f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        m764j();
        int m14925q = C3107q2.m14925q(this) & 256;
        boolean m748a = m748a(this.f733e, rect, true, true, false, true);
        this.f746r.set(rect);
        C0210z0.m1243a(this, this.f746r, this.f743o);
        if (!this.f747s.equals(this.f746r)) {
            this.f747s.set(this.f746r);
            m748a = true;
        }
        if (!this.f744p.equals(this.f743o)) {
            this.f744p.set(this.f743o);
            m748a = true;
        }
        if (m748a) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    /* renamed from: g */
    public void mo761g() {
        m764j();
        this.f734f.mo912g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0119e generateDefaultLayoutParams() {
        return new C0119e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0119e(layoutParams);
    }

    @Override // android.view.ViewGroup
    public C0119e generateLayoutParams(AttributeSet attributeSet) {
        return new C0119e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f733e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f729B.m13994a();
    }

    public CharSequence getTitle() {
        m764j();
        return this.f734f.getTitle();
    }

    /* renamed from: h */
    void m762h() {
        removeCallbacks(this.f754z);
        removeCallbacks(this.f728A);
        ViewPropertyAnimator viewPropertyAnimator = this.f752x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public boolean m763i() {
        return this.f737i;
    }

    /* renamed from: j */
    void m764j() {
        if (this.f732d == null) {
            this.f732d = (ContentFrameLayout) findViewById(R$id.action_bar_activity_content);
            this.f733e = (ActionBarContainer) findViewById(R$id.action_bar_container);
            this.f734f = m745a(findViewById(R$id.action_bar));
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m746a(getContext());
        C3107q2.m14878B(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m762h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0119e c0119e = (C0119e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0119e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0119e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        m764j();
        measureChildWithMargins(this.f733e, i, 0, i2, 0);
        C0119e c0119e = (C0119e) this.f733e.getLayoutParams();
        int max = Math.max(0, this.f733e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0119e).leftMargin + ((ViewGroup.MarginLayoutParams) c0119e).rightMargin);
        int max2 = Math.max(0, this.f733e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0119e).topMargin + ((ViewGroup.MarginLayoutParams) c0119e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f733e.getMeasuredState());
        boolean z = (C3107q2.m14925q(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f730b;
            if (this.f738j && this.f733e.getTabContainer() != null) {
                measuredHeight += this.f730b;
            }
        } else {
            measuredHeight = this.f733e.getVisibility() != 8 ? this.f733e.getMeasuredHeight() : 0;
        }
        this.f745q.set(this.f743o);
        this.f748t.set(this.f746r);
        Rect rect = (this.f737i || z) ? this.f748t : this.f745q;
        rect.top += measuredHeight;
        rect.bottom += 0;
        m748a(this.f732d, this.f745q, true, true, true, true);
        if (!this.f749u.equals(this.f748t)) {
            this.f749u.set(this.f748t);
            this.f732d.m804a(this.f748t);
        }
        measureChildWithMargins(this.f732d, i, 0, i2, 0);
        C0119e c0119e2 = (C0119e) this.f732d.getLayoutParams();
        int max3 = Math.max(max, this.f732d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0119e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0119e2).rightMargin);
        int max4 = Math.max(max2, this.f732d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0119e2).topMargin + ((ViewGroup.MarginLayoutParams) c0119e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f732d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f739k || !z) {
            return false;
        }
        if (m747a(f, f2)) {
            m749k();
        } else {
            m752n();
        }
        this.f740l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f741m + i2;
        this.f741m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f729B.m13997a(view, view2, i);
        this.f741m = getActionBarHideOffset();
        m762h();
        InterfaceC0118d interfaceC0118d = this.f750v;
        if (interfaceC0118d != null) {
            interfaceC0118d.mo529b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f733e.getVisibility() != 0) {
            return false;
        }
        return this.f739k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onStopNestedScroll(View view) {
        if (this.f739k && !this.f740l) {
            if (this.f741m <= this.f733e.getHeight()) {
                m751m();
            } else {
                m750l();
            }
        }
        InterfaceC0118d interfaceC0118d = this.f750v;
        if (interfaceC0118d != null) {
            interfaceC0118d.mo530c();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m764j();
        int i2 = this.f742n ^ i;
        this.f742n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0118d interfaceC0118d = this.f750v;
        if (interfaceC0118d != null) {
            interfaceC0118d.mo528a(!z2);
            if (z || !z2) {
                this.f750v.mo524a();
            } else {
                this.f750v.mo531d();
            }
        }
        if ((i2 & 256) == 0 || this.f750v == null) {
            return;
        }
        C3107q2.m14878B(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f731c = i;
        InterfaceC0118d interfaceC0118d = this.f750v;
        if (interfaceC0118d != null) {
            interfaceC0118d.mo526a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        m762h();
        this.f733e.setTranslationY(-Math.max(0, Math.min(i, this.f733e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0118d interfaceC0118d) {
        this.f750v = interfaceC0118d;
        if (getWindowToken() != null) {
            this.f750v.mo526a(this.f731c);
            int i = this.f742n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C3107q2.m14878B(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f738j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f739k) {
            this.f739k = z;
            if (z) {
                return;
            }
            m762h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m764j();
        this.f734f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m764j();
        this.f734f.setIcon(drawable);
    }

    public void setLogo(int i) {
        m764j();
        this.f734f.mo907c(i);
    }

    public void setOverlayMode(boolean z) {
        this.f737i = z;
        this.f736h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    public void setWindowCallback(Window.Callback callback) {
        m764j();
        this.f734f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0209z
    public void setWindowTitle(CharSequence charSequence) {
        m764j();
        this.f734f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
