package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import p000.AbstractC2532h;
import p000.C3107q2;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0158a {

    /* renamed from: j */
    private CharSequence f715j;

    /* renamed from: k */
    private CharSequence f716k;

    /* renamed from: l */
    private View f717l;

    /* renamed from: m */
    private View f718m;

    /* renamed from: n */
    private LinearLayout f719n;

    /* renamed from: o */
    private TextView f720o;

    /* renamed from: p */
    private TextView f721p;

    /* renamed from: q */
    private int f722q;

    /* renamed from: r */
    private int f723r;

    /* renamed from: s */
    private boolean f724s;

    /* renamed from: t */
    private int f725t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0114a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC2532h f726b;

        ViewOnClickListenerC0114a(ActionBarContextView actionBarContextView, AbstractC2532h abstractC2532h) {
            this.f726b = abstractC2532h;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f726b.mo540a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0198t0 m1133a = C0198t0.m1133a(context, attributeSet, R$styleable.ActionMode, i, 0);
        C3107q2.m14891a(this, m1133a.m1142b(R$styleable.ActionMode_background));
        this.f722q = m1133a.m1151g(R$styleable.ActionMode_titleTextStyle, 0);
        this.f723r = m1133a.m1151g(R$styleable.ActionMode_subtitleTextStyle, 0);
        this.f956f = m1133a.m1149f(R$styleable.ActionMode_height, 0);
        this.f725t = m1133a.m1151g(R$styleable.ActionMode_closeItemLayout, R$layout.abc_action_mode_close_item_material);
        m1133a.m1138a();
    }

    /* renamed from: e */
    private void m739e() {
        if (this.f719n == null) {
            LayoutInflater.from(getContext()).inflate(R$layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f719n = linearLayout;
            this.f720o = (TextView) linearLayout.findViewById(R$id.action_bar_title);
            this.f721p = (TextView) this.f719n.findViewById(R$id.action_bar_subtitle);
            if (this.f722q != 0) {
                this.f720o.setTextAppearance(getContext(), this.f722q);
            }
            if (this.f723r != 0) {
                this.f721p.setTextAppearance(getContext(), this.f723r);
            }
        }
        this.f720o.setText(this.f715j);
        this.f721p.setText(this.f716k);
        boolean z = !TextUtils.isEmpty(this.f715j);
        boolean z2 = !TextUtils.isEmpty(this.f716k);
        int i = 0;
        this.f721p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f719n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f719n.getParent() == null) {
            addView(this.f719n);
        }
    }

    /* renamed from: a */
    public void m740a() {
        if (this.f717l == null) {
            m743c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m741a(p000.AbstractC2532h r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f717l
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f725t
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f717l = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f717l
            goto L15
        L22:
            android.view.View r0 = r3.f717l
            int r1 = androidx.appcompat.R$id.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo548c()
            androidx.appcompat.view.menu.h r4 = (androidx.appcompat.view.menu.C0099h) r4
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.f955e
            if (r0 == 0) goto L3f
            r0.m776b()
        L3f:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f955e = r0
            r1 = 1
            r0.m777c(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = r3.f955e
            android.content.Context r2 = r3.f953c
            r4.m646a(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r4 = r3.f955e
            androidx.appcompat.view.menu.p r4 = r4.mo590b(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f954d = r4
            r1 = 0
            p000.C3107q2.m14891a(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f954d
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m741a(h):void");
    }

    /* renamed from: b */
    public boolean m742b() {
        return this.f724s;
    }

    /* renamed from: c */
    public void m743c() {
        removeAllViews();
        this.f718m = null;
        this.f954d = null;
    }

    /* renamed from: d */
    public boolean m744d() {
        ActionMenuPresenter actionMenuPresenter = this.f955e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m783i();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0158a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0158a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f716k;
    }

    public CharSequence getTitle() {
        return this.f715j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f955e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m779e();
            this.f955e.m780f();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(ActionBarContextView.class.getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f715j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m1244a = C0210z0.m1244a(this);
        int paddingRight = m1244a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f717l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f717l.getLayoutParams();
            int i5 = m1244a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m1244a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m890a = AbstractC0158a.m890a(paddingRight, i5, m1244a);
            paddingRight = AbstractC0158a.m890a(m890a + m894a(this.f717l, m890a, paddingTop, paddingTop2, m1244a), i6, m1244a);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f719n;
        if (linearLayout != null && this.f718m == null && linearLayout.getVisibility() != 8) {
            i7 += m894a(this.f719n, i7, paddingTop, paddingTop2, m1244a);
        }
        int i8 = i7;
        View view2 = this.f718m;
        if (view2 != null) {
            m894a(view2, i8, paddingTop, paddingTop2, m1244a);
        }
        int paddingLeft = m1244a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f954d;
        if (actionMenuView != null) {
            m894a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m1244a);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f956f;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f717l;
        if (view != null) {
            int m893a = m893a(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f717l.getLayoutParams();
            paddingLeft = m893a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f954d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m893a(this.f954d, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f719n;
        if (linearLayout != null && this.f718m == null) {
            if (this.f724s) {
                this.f719n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f719n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f719n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m893a(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f718m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            int i6 = layoutParams.width;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i7 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            int i8 = layoutParams.height;
            if (i8 >= 0) {
                i4 = Math.min(i8, i4);
            }
            this.f718m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i4, i7));
        }
        if (this.f956f > 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // androidx.appcompat.widget.AbstractC0158a
    public void setContentHeight(int i) {
        this.f956f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f718m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f718m = view;
        if (view != null && (linearLayout = this.f719n) != null) {
            removeView(linearLayout);
            this.f719n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f716k = charSequence;
        m739e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f715j = charSequence;
        m739e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f724s) {
            requestLayout();
        }
        this.f724s = z;
    }

    @Override // androidx.appcompat.widget.AbstractC0158a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
