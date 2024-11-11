package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import p000.C2495g2;
import p000.C3149r2;

/* loaded from: classes.dex */
public class CirclePageIndicator2 extends View implements InterfaceC2350c {

    /* renamed from: b */
    private float f9573b;

    /* renamed from: c */
    private final Paint f9574c;

    /* renamed from: d */
    private final Paint f9575d;

    /* renamed from: e */
    private ViewPager f9576e;

    /* renamed from: f */
    private ViewPager.InterfaceC0425j f9577f;

    /* renamed from: g */
    private int f9578g;

    /* renamed from: h */
    private int f9579h;

    /* renamed from: i */
    private boolean f9580i;

    /* renamed from: j */
    private float f9581j;

    /* renamed from: k */
    private float f9582k;

    /* renamed from: l */
    private int f9583l;

    /* renamed from: m */
    private float f9584m;

    /* renamed from: n */
    private int f9585n;

    /* renamed from: o */
    private boolean f9586o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2343a();

        /* renamed from: b */
        int f9587b;

        /* renamed from: com.viewpagerindicator.CirclePageIndicator2$SavedState$a */
        /* loaded from: classes.dex */
        static class C2343a implements Parcelable.Creator<SavedState> {
            C2343a() {
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

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f9587b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9587b);
        }
    }

    public CirclePageIndicator2(Context context) {
        this(context, null);
    }

    public CirclePageIndicator2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9574c = new Paint(1);
        this.f9575d = new Paint(1);
        this.f9584m = -1.0f;
        this.f9585n = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R$color.default_line_indicator_selected_color);
        int integer = resources.getInteger(R$integer.default_circle_indicator_orientation);
        int color2 = resources.getColor(R$color.default_line_indicator_unselected_color);
        float dimension = resources.getDimension(R$dimen.default_line_indicator_line_width);
        float dimension2 = resources.getDimension(R$dimen.default_line_indicator_gap_width);
        float dimension3 = resources.getDimension(R$dimen.default_line_indicator_stroke_width);
        boolean z = resources.getBoolean(R$bool.default_line_indicator_centered);
        float dimension4 = resources.getDimension(R$dimen.default_circle_indicator_radius);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LinePageIndicator, i, 0);
        this.f9580i = obtainStyledAttributes.getBoolean(R$styleable.CirclePageIndicator_centered, z);
        this.f9579h = obtainStyledAttributes.getInt(R$styleable.CirclePageIndicator_android_orientation, integer);
        this.f9581j = obtainStyledAttributes.getDimension(R$styleable.LinePageIndicator_lineWidth, dimension);
        this.f9582k = obtainStyledAttributes.getDimension(R$styleable.LinePageIndicator_gapWidth, dimension2);
        setStrokeWidth(obtainStyledAttributes.getDimension(R$styleable.LinePageIndicator_strokeWidth, dimension3));
        this.f9574c.setColor(obtainStyledAttributes.getColor(R$styleable.LinePageIndicator_unselectedColor, color2));
        this.f9573b = obtainStyledAttributes.getDimension(R$styleable.CirclePageIndicator_radius, dimension4);
        this.f9575d.setColor(obtainStyledAttributes.getColor(R$styleable.LinePageIndicator_selectedColor, color));
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.CirclePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f9583l = C3149r2.m15171b(ViewConfiguration.get(context));
    }

    /* renamed from: c */
    private int m11201c(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.f9576e) == null) {
            return size;
        }
        int mo3160a = viewPager.getAdapter().mo3160a() > 1 ? this.f9576e.getAdapter().mo3160a() - 2 : this.f9576e.getAdapter().mo3160a();
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        float f = this.f9573b;
        int i2 = (int) (paddingLeft + (mo3160a * 2 * f) + ((mo3160a - 1) * f) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    /* renamed from: d */
    private int m11202d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f9573b * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
    /* renamed from: a */
    public void mo3155a(int i) {
        ViewPager.InterfaceC0425j interfaceC0425j = this.f9577f;
        if (interfaceC0425j != null) {
            interfaceC0425j.mo3155a(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
    /* renamed from: a */
    public void mo3156a(int i, float f, int i2) {
        ViewPager.InterfaceC0425j interfaceC0425j = this.f9577f;
        if (interfaceC0425j != null) {
            interfaceC0425j.mo3156a(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
    /* renamed from: b */
    public void mo3157b(int i) {
        this.f9578g = i;
        invalidate();
        ViewPager.InterfaceC0425j interfaceC0425j = this.f9577f;
        if (interfaceC0425j != null) {
            interfaceC0425j.mo3157b(i);
        }
    }

    public float getGapWidth() {
        return this.f9582k;
    }

    public float getLineWidth() {
        return this.f9581j;
    }

    public int getOrientation() {
        return this.f9579h;
    }

    public float getRadius() {
        return this.f9573b;
    }

    public int getSelectedColor() {
        return this.f9575d.getColor();
    }

    public float getStrokeWidth() {
        return this.f9575d.getStrokeWidth();
    }

    public int getUnselectedColor() {
        return this.f9574c.getColor();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int mo3160a;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        super.onDraw(canvas);
        ViewPager viewPager = this.f9576e;
        if (viewPager == null || (mo3160a = viewPager.getAdapter().mo3160a()) == 0) {
            return;
        }
        if (this.f9578g >= mo3160a) {
            setCurrentItem(mo3160a - 1);
            return;
        }
        if (this.f9579h == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float f2 = this.f9573b;
        float f3 = 3.0f * f2;
        float f4 = paddingLeft + f2;
        float f5 = paddingTop + f2;
        if (this.f9580i) {
            f5 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((mo3160a * f3) / 2.0f);
        }
        int i = 0;
        while (i < mo3160a) {
            float f6 = (i * f3) + f5;
            if (this.f9579h == 0) {
                f = f4;
            } else {
                f = f6;
                f6 = f4;
            }
            canvas.drawCircle(f6, f, this.f9573b, i == this.f9578g ? this.f9575d : this.f9574c);
            i++;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int m11202d;
        int m11201c;
        if (this.f9579h == 0) {
            m11202d = m11201c(i);
            m11201c = m11202d(i2);
        } else {
            m11202d = m11202d(i);
            m11201c = m11201c(i2);
        }
        setMeasuredDimension(m11202d, m11201c);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f9578g = savedState.f9587b;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9587b = this.f9578g;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f9576e;
        if (viewPager == null || viewPager.getAdapter().mo3160a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float m11869c = C2495g2.m11869c(motionEvent, C2495g2.m11867a(motionEvent, this.f9585n));
                    float f = m11869c - this.f9584m;
                    if (!this.f9586o && Math.abs(f) > this.f9583l) {
                        this.f9586o = true;
                    }
                    if (this.f9586o) {
                        this.f9584m = m11869c;
                        if (this.f9576e.m3148e() || this.f9576e.m3135a()) {
                            this.f9576e.m3142b(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int m11866a = C2495g2.m11866a(motionEvent);
                        this.f9584m = C2495g2.m11869c(motionEvent, m11866a);
                        this.f9585n = C2495g2.m11868b(motionEvent, m11866a);
                    } else if (action == 6) {
                        int m11866a2 = C2495g2.m11866a(motionEvent);
                        if (C2495g2.m11868b(motionEvent, m11866a2) == this.f9585n) {
                            this.f9585n = C2495g2.m11868b(motionEvent, m11866a2 == 0 ? 1 : 0);
                        }
                        x = C2495g2.m11869c(motionEvent, C2495g2.m11867a(motionEvent, this.f9585n));
                    }
                }
                return true;
            }
            if (!this.f9586o) {
                int mo3160a = this.f9576e.getAdapter().mo3160a();
                float width = getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.f9578g > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.f9576e.setCurrentItem(this.f9578g - 1);
                    }
                    return true;
                }
                if (this.f9578g < mo3160a - 1 && motionEvent.getX() > f2 + f3) {
                    if (action != 3) {
                        this.f9576e.setCurrentItem(this.f9578g + 1);
                    }
                    return true;
                }
            }
            this.f9586o = false;
            this.f9585n = -1;
            if (this.f9576e.m3148e()) {
                this.f9576e.m3145c();
            }
            return true;
        }
        this.f9585n = C2495g2.m11868b(motionEvent, 0);
        x = motionEvent.getX();
        this.f9584m = x;
        return true;
    }

    public void setCentered(boolean z) {
        this.f9580i = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f9576e;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(i);
        this.f9578g = i;
        invalidate();
    }

    public void setGapWidth(float f) {
        this.f9582k = f;
        invalidate();
    }

    public void setLineWidth(float f) {
        this.f9581j = f;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0425j interfaceC0425j) {
        this.f9577f = interfaceC0425j;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.f9579h = i;
        requestLayout();
    }

    public void setRadius(float f) {
        this.f9573b = f;
        invalidate();
    }

    public void setSelectedColor(int i) {
        this.f9575d.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f9575d.setStrokeWidth(f);
        this.f9574c.setStrokeWidth(f);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.f9574c.setColor(i);
        invalidate();
    }

    @Override // com.viewpagerindicator.InterfaceC2350c
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f9576e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f9576e = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
    }
}
