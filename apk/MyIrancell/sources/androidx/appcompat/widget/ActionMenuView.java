package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.view.menu.C0101j;
import androidx.appcompat.view.menu.InterfaceC0106o;
import androidx.appcompat.view.menu.InterfaceC0107p;
import androidx.appcompat.widget.C0170f0;

/* loaded from: classes.dex */
public class ActionMenuView extends C0170f0 implements C0099h.b, InterfaceC0107p {

    /* renamed from: A */
    private int f788A;

    /* renamed from: B */
    InterfaceC0131e f789B;

    /* renamed from: q */
    private C0099h f790q;

    /* renamed from: r */
    private Context f791r;

    /* renamed from: s */
    private int f792s;

    /* renamed from: t */
    private boolean f793t;

    /* renamed from: u */
    private ActionMenuPresenter f794u;

    /* renamed from: v */
    private InterfaceC0106o.a f795v;

    /* renamed from: w */
    C0099h.a f796w;

    /* renamed from: x */
    private boolean f797x;

    /* renamed from: y */
    private int f798y;

    /* renamed from: z */
    private int f799z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0127a {
        /* renamed from: a */
        boolean mo558a();

        /* renamed from: c */
        boolean mo560c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0128b implements InterfaceC0106o.a {
        C0128b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
        /* renamed from: a */
        public void mo450a(C0099h c0099h, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
        /* renamed from: a */
        public boolean mo451a(C0099h c0099h) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0129c extends C0170f0.a {

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public boolean f800c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public int f801d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public int f802e;

        /* renamed from: f */
        @ViewDebug.ExportedProperty
        public boolean f803f;

        /* renamed from: g */
        @ViewDebug.ExportedProperty
        public boolean f804g;

        /* renamed from: h */
        boolean f805h;

        public C0129c(int i, int i2) {
            super(i, i2);
            this.f800c = false;
        }

        public C0129c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0129c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0129c(C0129c c0129c) {
            super(c0129c);
            this.f800c = c0129c.f800c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0130d implements C0099h.a {
        C0130d() {
        }

        @Override // androidx.appcompat.view.menu.C0099h.a
        /* renamed from: a */
        public void mo401a(C0099h c0099h) {
            C0099h.a aVar = ActionMenuView.this.f796w;
            if (aVar != null) {
                aVar.mo401a(c0099h);
            }
        }

        @Override // androidx.appcompat.view.menu.C0099h.a
        /* renamed from: a */
        public boolean mo406a(C0099h c0099h, MenuItem menuItem) {
            InterfaceC0131e interfaceC0131e = ActionMenuView.this.f789B;
            return interfaceC0131e != null && interfaceC0131e.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0131e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f799z = (int) (56.0f * f);
        this.f788A = (int) (f * 4.0f);
        this.f791r = context;
        this.f792s = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m785a(View view, int i, int i2, int i3, int i4) {
        C0129c c0129c = (C0129c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.m561d();
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        c0129c.f803f = !c0129c.f800c && z;
        c0129c.f801d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* renamed from: c */
    private void m786c(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f799z;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z5) {
                    int i19 = this.f788A;
                    i6 = i18;
                    r14 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    r14 = 0;
                }
                C0129c c0129c = (C0129c) childAt.getLayoutParams();
                c0129c.f805h = r14;
                c0129c.f802e = r14;
                c0129c.f801d = r14;
                c0129c.f803f = r14;
                ((ViewGroup.MarginLayoutParams) c0129c).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) c0129c).rightMargin = r14;
                c0129c.f804g = z5 && ((ActionMenuItemView) childAt).m561d();
                int m785a = m785a(childAt, i11, c0129c.f800c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, m785a);
                if (c0129c.f803f) {
                    i16++;
                }
                if (c0129c.f800c) {
                    z4 = true;
                }
                i9 -= m785a;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (m785a == 1) {
                    j |= 1 << i13;
                    i12 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i20 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i16 > 0 && i9 > 0) {
            int i21 = 0;
            int i22 = 0;
            int i23 = Integer.MAX_VALUE;
            long j2 = 0;
            while (i22 < childCount) {
                boolean z8 = z7;
                C0129c c0129c2 = (C0129c) getChildAt(i22).getLayoutParams();
                int i24 = i12;
                if (c0129c2.f803f) {
                    int i25 = c0129c2.f801d;
                    if (i25 < i23) {
                        j2 = 1 << i22;
                        i23 = i25;
                        i21 = 1;
                    } else if (i25 == i23) {
                        i21++;
                        j2 |= 1 << i22;
                    }
                }
                i22++;
                i12 = i24;
                z7 = z8;
            }
            z = z7;
            i5 = i12;
            j |= j2;
            if (i21 > i9) {
                i3 = mode;
                i4 = i7;
                break;
            }
            int i26 = i23 + 1;
            int i27 = 0;
            while (i27 < childCount) {
                View childAt2 = getChildAt(i27);
                C0129c c0129c3 = (C0129c) childAt2.getLayoutParams();
                int i28 = i7;
                int i29 = mode;
                long j3 = 1 << i27;
                if ((j2 & j3) == 0) {
                    if (c0129c3.f801d == i26) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && c0129c3.f804g && i9 == 1) {
                        int i30 = this.f788A;
                        z3 = z6;
                        childAt2.setPadding(i30 + i11, 0, i30, 0);
                    } else {
                        z3 = z6;
                    }
                    c0129c3.f801d++;
                    c0129c3.f805h = true;
                    i9--;
                }
                i27++;
                mode = i29;
                i7 = i28;
                z6 = z3;
            }
            i12 = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i7;
        z = z7;
        i5 = i12;
        boolean z9 = !z4 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z9 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((C0129c) getChildAt(0).getLayoutParams()).f804g) {
                    bitCount -= 0.5f;
                }
                int i31 = childCount - 1;
                if ((j & (1 << i31)) != 0 && !((C0129c) getChildAt(i31).getLayoutParams()).f804g) {
                    bitCount -= 0.5f;
                }
            }
            int i32 = bitCount > 0.0f ? (int) ((i9 * i11) / bitCount) : 0;
            z2 = z;
            for (int i33 = 0; i33 < childCount; i33++) {
                if ((j & (1 << i33)) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0129c c0129c4 = (C0129c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0129c4.f802e = i32;
                        c0129c4.f805h = true;
                        if (i33 == 0 && !c0129c4.f804g) {
                            ((ViewGroup.MarginLayoutParams) c0129c4).leftMargin = (-i32) / 2;
                        }
                    } else if (c0129c4.f800c) {
                        c0129c4.f802e = i32;
                        c0129c4.f805h = true;
                        ((ViewGroup.MarginLayoutParams) c0129c4).rightMargin = (-i32) / 2;
                    } else {
                        if (i33 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0129c4).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) c0129c4).rightMargin = i32 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i34 = 0; i34 < childCount; i34++) {
                View childAt4 = getChildAt(i34);
                C0129c c0129c5 = (C0129c) childAt4.getLayoutParams();
                if (c0129c5.f805h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0129c5.f801d * i11) + c0129c5.f802e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i20);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p
    /* renamed from: a */
    public void mo565a(C0099h c0099h) {
        this.f790q = c0099h;
    }

    /* renamed from: a */
    public void m787a(InterfaceC0106o.a aVar, C0099h.a aVar2) {
        this.f795v = aVar;
        this.f796w = aVar2;
    }

    @Override // androidx.appcompat.view.menu.C0099h.b
    /* renamed from: a */
    public boolean mo566a(C0101j c0101j) {
        return this.f790q.m649a(c0101j, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0170f0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0129c);
    }

    /* renamed from: d */
    public void m788d() {
        ActionMenuPresenter actionMenuPresenter = this.f794u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m776b();
        }
    }

    /* renamed from: d */
    protected boolean m789d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0127a)) {
            z = false | ((InterfaceC0127a) childAt).mo558a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0127a)) ? z : z | ((InterfaceC0127a) childAt2).mo560c();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public C0129c m790e() {
        C0129c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f800c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: f */
    public boolean m791f() {
        ActionMenuPresenter actionMenuPresenter = this.f794u;
        return actionMenuPresenter != null && actionMenuPresenter.m779e();
    }

    /* renamed from: g */
    public boolean m792g() {
        ActionMenuPresenter actionMenuPresenter = this.f794u;
        return actionMenuPresenter != null && actionMenuPresenter.m781g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0170f0, android.view.ViewGroup
    public C0129c generateDefaultLayoutParams() {
        C0129c c0129c = new C0129c(-2, -2);
        c0129c.f1021b = 16;
        return c0129c;
    }

    @Override // androidx.appcompat.widget.C0170f0, android.view.ViewGroup
    public C0129c generateLayoutParams(AttributeSet attributeSet) {
        return new C0129c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0170f0, android.view.ViewGroup
    public C0129c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0129c c0129c = layoutParams instanceof C0129c ? new C0129c((C0129c) layoutParams) : new C0129c(layoutParams);
        if (c0129c.f1021b <= 0) {
            c0129c.f1021b = 16;
        }
        return c0129c;
    }

    public Menu getMenu() {
        if (this.f790q == null) {
            Context context = getContext();
            C0099h c0099h = new C0099h(context);
            this.f790q = c0099h;
            c0099h.mo644a(new C0130d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f794u = actionMenuPresenter;
            actionMenuPresenter.m777c(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f794u;
            InterfaceC0106o.a aVar = this.f795v;
            if (aVar == null) {
                aVar = new C0128b();
            }
            actionMenuPresenter2.mo584a(aVar);
            this.f790q.m646a(this.f794u, this.f791r);
            this.f794u.m774a(this);
        }
        return this.f790q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f794u.m778d();
    }

    public int getPopupTheme() {
        return this.f792s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean m793h() {
        ActionMenuPresenter actionMenuPresenter = this.f794u;
        return actionMenuPresenter != null && actionMenuPresenter.m782h();
    }

    /* renamed from: i */
    public boolean m794i() {
        return this.f793t;
    }

    /* renamed from: j */
    public C0099h m795j() {
        return this.f790q;
    }

    /* renamed from: k */
    public boolean m796k() {
        ActionMenuPresenter actionMenuPresenter = this.f794u;
        return actionMenuPresenter != null && actionMenuPresenter.m783i();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f794u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo585a(false);
            if (this.f794u.m782h()) {
                this.f794u.m779e();
                this.f794u.m783i();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m788d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0170f0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f797x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean m1244a = C0210z0.m1244a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0129c c0129c = (C0129c) childAt.getLayoutParams();
                if (c0129c.f800c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m789d(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m1244a) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0129c).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0129c).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0129c).leftMargin) + ((ViewGroup.MarginLayoutParams) c0129c).rightMargin;
                    m789d(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (m1244a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0129c c0129c2 = (C0129c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0129c2.f800c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) c0129c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0129c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0129c c0129c3 = (C0129c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0129c3.f800c) {
                int i19 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0129c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0129c3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0170f0, android.view.View
    public void onMeasure(int i, int i2) {
        C0099h c0099h;
        boolean z = this.f797x;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f797x = z2;
        if (z != z2) {
            this.f798y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f797x && (c0099h = this.f790q) != null && size != this.f798y) {
            this.f798y = size;
            c0099h.m657b(true);
        }
        int childCount = getChildCount();
        if (this.f797x && childCount > 0) {
            m786c(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0129c c0129c = (C0129c) getChildAt(i3).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0129c).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0129c).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f794u.m775b(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0131e interfaceC0131e) {
        this.f789B = interfaceC0131e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f794u.m773a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f793t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f792s != i) {
            this.f792s = i;
            if (i == 0) {
                this.f791r = getContext();
            } else {
                this.f791r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f794u = actionMenuPresenter;
        actionMenuPresenter.m774a(this);
    }
}
