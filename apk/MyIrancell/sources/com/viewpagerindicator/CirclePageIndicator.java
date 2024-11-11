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
public class CirclePageIndicator extends View implements InterfaceC2350c {

    /* renamed from: b */
    private float f9555b;

    /* renamed from: c */
    private final Paint f9556c;

    /* renamed from: d */
    private final Paint f9557d;

    /* renamed from: e */
    private final Paint f9558e;

    /* renamed from: f */
    private ViewPager f9559f;

    /* renamed from: g */
    private ViewPager.InterfaceC0425j f9560g;

    /* renamed from: h */
    private int f9561h;

    /* renamed from: i */
    private int f9562i;

    /* renamed from: j */
    private float f9563j;

    /* renamed from: k */
    private int f9564k;

    /* renamed from: l */
    private int f9565l;

    /* renamed from: m */
    private boolean f9566m;

    /* renamed from: n */
    private boolean f9567n;

    /* renamed from: o */
    private int f9568o;

    /* renamed from: p */
    private float f9569p;

    /* renamed from: q */
    private int f9570q;

    /* renamed from: r */
    private boolean f9571r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2341a();

        /* renamed from: b */
        int f9572b;

        /* renamed from: com.viewpagerindicator.CirclePageIndicator$SavedState$a */
        /* loaded from: classes.dex */
        static class C2341a implements Parcelable.Creator<SavedState> {
            C2341a() {
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
            this.f9572b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9572b);
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9556c = new Paint(1);
        this.f9557d = new Paint(1);
        this.f9558e = new Paint(1);
        this.f9569p = -1.0f;
        this.f9570q = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R$color.default_circle_indicator_page_color);
        int color2 = resources.getColor(R$color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R$integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(R$color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R$dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R$dimen.default_circle_indicator_radius);
        boolean z = resources.getBoolean(R$bool.default_circle_indicator_centered);
        boolean z2 = resources.getBoolean(R$bool.default_circle_indicator_snap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CirclePageIndicator, i, 0);
        this.f9566m = obtainStyledAttributes.getBoolean(R$styleable.CirclePageIndicator_centered, z);
        this.f9565l = obtainStyledAttributes.getInt(R$styleable.CirclePageIndicator_android_orientation, integer);
        this.f9556c.setStyle(Paint.Style.FILL);
        this.f9556c.setColor(obtainStyledAttributes.getColor(R$styleable.CirclePageIndicator_pageColor, color));
        this.f9557d.setStyle(Paint.Style.STROKE);
        this.f9557d.setColor(obtainStyledAttributes.getColor(R$styleable.CirclePageIndicator_strokeColor, color3));
        this.f9557d.setStrokeWidth(obtainStyledAttributes.getDimension(R$styleable.CirclePageIndicator_strokeWidth, dimension));
        this.f9558e.setStyle(Paint.Style.FILL);
        this.f9558e.setColor(obtainStyledAttributes.getColor(R$styleable.CirclePageIndicator_fillColor, color2));
        this.f9555b = obtainStyledAttributes.getDimension(R$styleable.CirclePageIndicator_radius, dimension2);
        this.f9567n = obtainStyledAttributes.getBoolean(R$styleable.CirclePageIndicator_snap, z2);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.CirclePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f9568o = C3149r2.m15171b(ViewConfiguration.get(context));
    }

    /* renamed from: c */
    private int m11199c(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.f9559f) == null) {
            return size;
        }
        int mo3160a = viewPager.getAdapter().mo3160a() > 1 ? this.f9559f.getAdapter().mo3160a() - 2 : this.f9559f.getAdapter().mo3160a();
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        float f = this.f9555b;
        int i2 = (int) (paddingLeft + (mo3160a * 2 * f) + ((mo3160a - 1) * f) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    /* renamed from: d */
    private int m11200d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f9555b * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
    /* renamed from: a */
    public void mo3155a(int i) {
        this.f9564k = i;
        ViewPager.InterfaceC0425j interfaceC0425j = this.f9560g;
        if (interfaceC0425j != null) {
            interfaceC0425j.mo3155a(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
    /* renamed from: a */
    public void mo3156a(int i, float f, int i2) {
        if (this.f9559f.getAdapter().mo3160a() > 1) {
            this.f9561h = i - 1;
        } else {
            this.f9561h = i;
        }
        this.f9563j = f;
        invalidate();
        ViewPager.InterfaceC0425j interfaceC0425j = this.f9560g;
        if (interfaceC0425j != null) {
            interfaceC0425j.mo3156a(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
    /* renamed from: b */
    public void mo3157b(int i) {
        if (this.f9567n || this.f9564k == 0) {
            int i2 = 1;
            if (this.f9559f.getAdapter().mo3160a() > 1) {
                if (i == 0) {
                    i = this.f9559f.getAdapter().mo3160a() - 2;
                    setCurrentItem(i);
                }
                if (i == this.f9559f.getAdapter().mo3160a() - 1) {
                    setCurrentItem(1);
                } else {
                    i2 = i;
                }
                int i3 = i2 - 1;
                this.f9561h = i3;
                this.f9562i = i3;
                i = i2;
            } else {
                this.f9561h = i;
                this.f9562i = i;
            }
            invalidate();
        }
        ViewPager.InterfaceC0425j interfaceC0425j = this.f9560g;
        if (interfaceC0425j != null) {
            interfaceC0425j.mo3157b(i);
        }
    }

    public int getFillColor() {
        return this.f9558e.getColor();
    }

    public int getOrientation() {
        return this.f9565l;
    }

    public int getPageColor() {
        return this.f9556c.getColor();
    }

    public float getRadius() {
        return this.f9555b;
    }

    public int getStrokeColor() {
        return this.f9557d.getColor();
    }

    public float getStrokeWidth() {
        return this.f9557d.getStrokeWidth();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        super.onDraw(canvas);
        ViewPager viewPager = this.f9559f;
        if (viewPager == null) {
            return;
        }
        int mo3160a = viewPager.getAdapter().mo3160a() > 1 ? this.f9559f.getAdapter().mo3160a() - 2 : this.f9559f.getAdapter().mo3160a();
        if (mo3160a == 0) {
            return;
        }
        if (this.f9565l == 0) {
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
        float f2 = this.f9555b;
        float f3 = 3.0f * f2;
        float f4 = paddingLeft + f2;
        float f5 = paddingTop + f2;
        if (this.f9566m) {
            f5 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((mo3160a * f3) / 2.0f);
        }
        float f6 = this.f9555b;
        if (this.f9557d.getStrokeWidth() > 0.0f) {
            f6 -= this.f9557d.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < mo3160a; i++) {
            float f7 = (i * f3) + f5;
            if (this.f9565l == 0) {
                f = f4;
            } else {
                f = f7;
                f7 = f4;
            }
            if (this.f9556c.getAlpha() > 0) {
                canvas.drawCircle(f7, f, f6, this.f9556c);
            }
            float f8 = this.f9555b;
            if (f6 != f8) {
                canvas.drawCircle(f7, f, f8, this.f9557d);
            }
        }
        float f9 = (this.f9567n ? this.f9562i : this.f9561h) * f3;
        if (!this.f9567n) {
            f9 += this.f9563j * f3;
        }
        float f10 = f5 + f9;
        if (this.f9565l == 0) {
            f10 = f4;
            f4 = f10;
        }
        canvas.drawCircle(f4, f10, this.f9555b, this.f9558e);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int m11200d;
        int m11199c;
        if (this.f9565l == 0) {
            m11200d = m11199c(i);
            m11199c = m11200d(i2);
        } else {
            m11200d = m11200d(i);
            m11199c = m11199c(i2);
        }
        setMeasuredDimension(m11200d, m11199c);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f9572b;
        this.f9561h = i;
        this.f9562i = i;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9572b = this.f9561h;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f9559f;
        if (viewPager == null || viewPager.getAdapter().mo3160a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float m11869c = C2495g2.m11869c(motionEvent, C2495g2.m11867a(motionEvent, this.f9570q));
                    float f = m11869c - this.f9569p;
                    if (!this.f9571r && Math.abs(f) > this.f9568o) {
                        this.f9571r = true;
                    }
                    if (this.f9571r) {
                        this.f9569p = m11869c;
                        if (this.f9559f.m3148e() || this.f9559f.m3135a()) {
                            this.f9559f.m3142b(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int m11866a = C2495g2.m11866a(motionEvent);
                        this.f9569p = C2495g2.m11869c(motionEvent, m11866a);
                        this.f9570q = C2495g2.m11868b(motionEvent, m11866a);
                    } else if (action == 6) {
                        int m11866a2 = C2495g2.m11866a(motionEvent);
                        if (C2495g2.m11868b(motionEvent, m11866a2) == this.f9570q) {
                            this.f9570q = C2495g2.m11868b(motionEvent, m11866a2 == 0 ? 1 : 0);
                        }
                        x = C2495g2.m11869c(motionEvent, C2495g2.m11867a(motionEvent, this.f9570q));
                    }
                }
                return true;
            }
            if (!this.f9571r) {
                int mo3160a = this.f9559f.getAdapter().mo3160a() > 1 ? this.f9559f.getAdapter().mo3160a() - 2 : this.f9559f.getAdapter().mo3160a();
                float width = getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.f9561h > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.f9559f.setCurrentItem(this.f9561h - 1);
                    }
                    return true;
                }
                if (this.f9561h < mo3160a - 1 && motionEvent.getX() > f2 + f3) {
                    if (action != 3) {
                        this.f9559f.setCurrentItem(this.f9561h + 1);
                    }
                    return true;
                }
            }
            this.f9571r = false;
            this.f9570q = -1;
            if (this.f9559f.m3148e()) {
                this.f9559f.m3145c();
            }
            return true;
        }
        this.f9570q = C2495g2.m11868b(motionEvent, 0);
        x = motionEvent.getX();
        this.f9569p = x;
        return true;
    }

    public void setCentered(boolean z) {
        this.f9566m = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f9559f;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(i);
        this.f9561h = i;
        invalidate();
    }

    public void setFillColor(int i) {
        this.f9558e.setColor(i);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0425j interfaceC0425j) {
        this.f9560g = interfaceC0425j;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.f9565l = i;
        requestLayout();
    }

    public void setPageColor(int i) {
        this.f9556c.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.f9555b = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.f9567n = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f9557d.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f9557d.setStrokeWidth(f);
        invalidate();
    }

    @Override // com.viewpagerindicator.InterfaceC2350c
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f9559f;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f9559f = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
    }
}
