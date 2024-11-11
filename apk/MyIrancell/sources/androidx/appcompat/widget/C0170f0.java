package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.R$styleable;

/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: classes.dex */
public class C0170f0 extends ViewGroup {

    /* renamed from: b */
    private boolean f1005b;

    /* renamed from: c */
    private int f1006c;

    /* renamed from: d */
    private int f1007d;

    /* renamed from: e */
    private int f1008e;

    /* renamed from: f */
    private int f1009f;

    /* renamed from: g */
    private int f1010g;

    /* renamed from: h */
    private float f1011h;

    /* renamed from: i */
    private boolean f1012i;

    /* renamed from: j */
    private int[] f1013j;

    /* renamed from: k */
    private int[] f1014k;

    /* renamed from: l */
    private Drawable f1015l;

    /* renamed from: m */
    private int f1016m;

    /* renamed from: n */
    private int f1017n;

    /* renamed from: o */
    private int f1018o;

    /* renamed from: p */
    private int f1019p;

    /* renamed from: androidx.appcompat.widget.f0$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f1020a;

        /* renamed from: b */
        public int f1021b;

        public a(int i, int i2) {
            super(i, i2);
            this.f1021b = -1;
            this.f1020a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1021b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LinearLayoutCompat_Layout);
            this.f1020a = obtainStyledAttributes.getFloat(R$styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1021b = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1021b = -1;
        }
    }

    public C0170f0(Context context) {
        this(context, null);
    }

    public C0170f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0170f0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1005b = true;
        this.f1006c = -1;
        this.f1007d = 0;
        this.f1009f = 8388659;
        C0198t0 m1133a = C0198t0.m1133a(context, attributeSet, R$styleable.LinearLayoutCompat, i, 0);
        int m1145d = m1133a.m1145d(R$styleable.LinearLayoutCompat_android_orientation, -1);
        if (m1145d >= 0) {
            setOrientation(m1145d);
        }
        int m1145d2 = m1133a.m1145d(R$styleable.LinearLayoutCompat_android_gravity, -1);
        if (m1145d2 >= 0) {
            setGravity(m1145d2);
        }
        boolean m1139a = m1133a.m1139a(R$styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!m1139a) {
            setBaselineAligned(m1139a);
        }
        this.f1011h = m1133a.m1140b(R$styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1006c = m1133a.m1145d(R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1012i = m1133a.m1139a(R$styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(m1133a.m1142b(R$styleable.LinearLayoutCompat_divider));
        this.f1018o = m1133a.m1145d(R$styleable.LinearLayoutCompat_showDividers, 0);
        this.f1019p = m1133a.m1143c(R$styleable.LinearLayoutCompat_dividerPadding, 0);
        m1133a.m1138a();
    }

    /* renamed from: a */
    private void m958a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private void m959c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m963a = m963a(i3);
            if (m963a.getVisibility() != 8) {
                a aVar = (a) m963a.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = m963a.getMeasuredWidth();
                    measureChildWithMargins(m963a, i2, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m960d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m963a = m963a(i3);
            if (m963a.getVisibility() != 8) {
                a aVar = (a) m963a.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = m963a.getMeasuredHeight();
                    measureChildWithMargins(m963a, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i4;
                }
            }
        }
    }

    /* renamed from: a */
    int m961a(View view) {
        return 0;
    }

    /* renamed from: a */
    int m962a(View view, int i) {
        return 0;
    }

    /* renamed from: a */
    View m963a(int i) {
        return getChildAt(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a3, code lost:
    
        if (r8 > 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03b0, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03b1, code lost:
    
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03ae, code lost:
    
        if (r8 < 0) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m964a(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0170f0.m964a(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m965a(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0170f0.m965a(int, int, int, int):void");
    }

    /* renamed from: a */
    void m966a(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean m1244a = C0210z0.m1244a(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View m963a = m963a(i2);
            if (m963a != null && m963a.getVisibility() != 8 && m974b(i2)) {
                a aVar = (a) m963a.getLayoutParams();
                m973b(canvas, m1244a ? m963a.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (m963a.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1016m);
            }
        }
        if (m974b(virtualChildCount)) {
            View m963a2 = m963a(virtualChildCount - 1);
            if (m963a2 != null) {
                a aVar2 = (a) m963a2.getLayoutParams();
                if (m1244a) {
                    left = m963a2.getLeft();
                    i = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - i) - this.f1016m;
                } else {
                    right = m963a2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (m1244a) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i = getPaddingRight();
                right = (left - i) - this.f1016m;
            }
            m973b(canvas, right);
        }
    }

    /* renamed from: a */
    void m967a(Canvas canvas, int i) {
        this.f1015l.setBounds(getPaddingLeft() + this.f1019p, i, (getWidth() - getPaddingRight()) - this.f1019p, this.f1017n + i);
        this.f1015l.draw(canvas);
    }

    /* renamed from: a */
    void m968a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* renamed from: b */
    int m969b(View view) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d0, code lost:
    
        if (r15 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02dd, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02de, code lost:
    
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02db, code lost:
    
        if (r15 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m970b(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0170f0.m970b(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m971b(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1009f
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1010g
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1010g
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc6
            android.view.View r13 = r6.m963a(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m975c(r12)
            int r0 = r0 + r1
            goto Lc3
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc3
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.f0$a r5 = (androidx.appcompat.widget.C0170f0.a) r5
            int r1 = r5.f1021b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = p000.C3107q2.m14919k(r17)
            int r1 = p000.C0447b2.m3270a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.m974b(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1017n
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m961a(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m958a(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m969b(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m962a(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc3:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0170f0.m971b(int, int, int, int):void");
    }

    /* renamed from: b */
    void m972b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m963a = m963a(i);
            if (m963a != null && m963a.getVisibility() != 8 && m974b(i)) {
                m967a(canvas, (m963a.getTop() - ((ViewGroup.MarginLayoutParams) ((a) m963a.getLayoutParams())).topMargin) - this.f1017n);
            }
        }
        if (m974b(virtualChildCount)) {
            View m963a2 = m963a(virtualChildCount - 1);
            m967a(canvas, m963a2 == null ? (getHeight() - getPaddingBottom()) - this.f1017n : m963a2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) m963a2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: b */
    void m973b(Canvas canvas, int i) {
        this.f1015l.setBounds(i, getPaddingTop() + this.f1019p, this.f1016m + i, (getHeight() - getPaddingBottom()) - this.f1019p);
        this.f1015l.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public boolean m974b(int i) {
        if (i == 0) {
            return (this.f1018o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1018o & 4) != 0;
        }
        if ((this.f1018o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    int m975c(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i = this.f1008e;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1006c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1006c;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1006c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f1007d;
        if (this.f1008e == 1 && (i = this.f1009f & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1010g) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1010g;
            }
        }
        return i3 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1006c;
    }

    public Drawable getDividerDrawable() {
        return this.f1015l;
    }

    public int getDividerPadding() {
        return this.f1019p;
    }

    public int getDividerWidth() {
        return this.f1016m;
    }

    public int getGravity() {
        return this.f1009f;
    }

    public int getOrientation() {
        return this.f1008e;
    }

    public int getShowDividers() {
        return this.f1018o;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1011h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1015l == null) {
            return;
        }
        if (this.f1008e == 1) {
            m972b(canvas);
        } else {
            m966a(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0170f0.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0170f0.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1008e == 1) {
            m971b(i, i2, i3, i4);
        } else {
            m965a(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1008e == 1) {
            m970b(i, i2);
        } else {
            m964a(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f1005b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1006c = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1015l) {
            return;
        }
        this.f1015l = drawable;
        if (drawable != null) {
            this.f1016m = drawable.getIntrinsicWidth();
            this.f1017n = drawable.getIntrinsicHeight();
        } else {
            this.f1016m = 0;
            this.f1017n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1019p = i;
    }

    public void setGravity(int i) {
        if (this.f1009f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1009f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1009f;
        if ((8388615 & i3) != i2) {
            this.f1009f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1012i = z;
    }

    public void setOrientation(int i) {
        if (this.f1008e != i) {
            this.f1008e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1018o) {
            requestLayout();
        }
        this.f1018o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1009f;
        if ((i3 & 112) != i2) {
            this.f1009f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1011h = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
