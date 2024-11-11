package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import p000.C3107q2;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    private boolean f705b;

    /* renamed from: c */
    private View f706c;

    /* renamed from: d */
    private View f707d;

    /* renamed from: e */
    private View f708e;

    /* renamed from: f */
    Drawable f709f;

    /* renamed from: g */
    Drawable f710g;

    /* renamed from: h */
    Drawable f711h;

    /* renamed from: i */
    boolean f712i;

    /* renamed from: j */
    boolean f713j;

    /* renamed from: k */
    private int f714k;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3107q2.m14891a(this, new C0161b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBar);
        this.f709f = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_background);
        this.f710g = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundStacked);
        this.f714k = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == R$id.split_action_bar) {
            this.f712i = true;
            this.f711h = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f712i ? this.f709f != null || this.f710g != null : this.f711h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m737a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m738b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f709f;
        if (drawable != null && drawable.isStateful()) {
            this.f709f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f710g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f710g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f711h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f711h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f706c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f709f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f710g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f711h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f707d = findViewById(R$id.action_bar);
        this.f708e = findViewById(R$id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f705b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f706c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            view2.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f712i) {
            Drawable drawable3 = this.f711h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f709f != null) {
                if (this.f707d.getVisibility() == 0) {
                    drawable2 = this.f709f;
                    left = this.f707d.getLeft();
                    top = this.f707d.getTop();
                    right = this.f707d.getRight();
                    view = this.f707d;
                } else {
                    View view3 = this.f708e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f709f.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f709f;
                        left = this.f708e.getLeft();
                        top = this.f708e.getTop();
                        right = this.f708e.getRight();
                        view = this.f708e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f713j = z4;
            if (!z4 || (drawable = this.f710g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f707d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f714k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f707d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f706c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f707d
            boolean r0 = r3.m738b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f707d
        L42:
            int r0 = r3.m737a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f708e
            boolean r0 = r3.m738b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f708e
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f706c
            int r1 = r3.m737a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f709f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f709f);
        }
        this.f709f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f707d;
            if (view != null) {
                this.f709f.setBounds(view.getLeft(), this.f707d.getTop(), this.f707d.getRight(), this.f707d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f712i ? this.f709f != null || this.f710g != null : this.f711h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f711h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f711h);
        }
        this.f711h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f712i && (drawable2 = this.f711h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f712i ? !(this.f709f != null || this.f710g != null) : this.f711h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f710g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f710g);
        }
        this.f710g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f713j && (drawable2 = this.f710g) != null) {
                drawable2.setBounds(this.f706c.getLeft(), this.f706c.getTop(), this.f706c.getRight(), this.f706c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f712i ? this.f709f != null || this.f710g != null : this.f711h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0182l0 c0182l0) {
        View view = this.f706c;
        if (view != null) {
            removeView(view);
        }
        this.f706c = c0182l0;
        if (c0182l0 != null) {
            addView(c0182l0);
            ViewGroup.LayoutParams layoutParams = c0182l0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0182l0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f705b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f709f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f710g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f711h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f709f && !this.f712i) || (drawable == this.f710g && this.f713j) || ((drawable == this.f711h && this.f712i) || super.verifyDrawable(drawable));
    }
}
