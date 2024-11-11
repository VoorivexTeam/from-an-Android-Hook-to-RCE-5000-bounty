package com.triggertrap.seekarc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class SeekArc extends View {

    /* renamed from: b */
    private Drawable f9531b;

    /* renamed from: c */
    private int f9532c;

    /* renamed from: d */
    private int f9533d;

    /* renamed from: e */
    private int f9534e;

    /* renamed from: f */
    private int f9535f;

    /* renamed from: g */
    private int f9536g;

    /* renamed from: h */
    private int f9537h;

    /* renamed from: i */
    private int f9538i;

    /* renamed from: j */
    private boolean f9539j;

    /* renamed from: k */
    private boolean f9540k;

    /* renamed from: l */
    private boolean f9541l;

    /* renamed from: m */
    private boolean f9542m;

    /* renamed from: n */
    private int f9543n;

    /* renamed from: o */
    private float f9544o;

    /* renamed from: p */
    private RectF f9545p;

    /* renamed from: q */
    private Paint f9546q;

    /* renamed from: r */
    private Paint f9547r;

    /* renamed from: s */
    private int f9548s;

    /* renamed from: t */
    private int f9549t;

    /* renamed from: u */
    private int f9550u;

    /* renamed from: v */
    private int f9551v;

    /* renamed from: w */
    private double f9552w;

    /* renamed from: x */
    private float f9553x;

    /* renamed from: y */
    private InterfaceC2340a f9554y;

    /* renamed from: z */
    private static final String f9530z = SeekArc.class.getSimpleName();

    /* renamed from: A */
    private static int f9529A = -1;

    /* renamed from: com.triggertrap.seekarc.SeekArc$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2340a {
        /* renamed from: a */
        void mo4949a(SeekArc seekArc);

        /* renamed from: a */
        void mo4950a(SeekArc seekArc, int i, boolean z);

        /* renamed from: b */
        void mo4951b(SeekArc seekArc);
    }

    public SeekArc(Context context) {
        super(context);
        this.f9532c = 100;
        this.f9533d = 0;
        this.f9534e = 4;
        this.f9535f = 2;
        this.f9536g = 0;
        this.f9537h = 360;
        this.f9538i = 0;
        this.f9539j = false;
        this.f9540k = true;
        this.f9541l = true;
        this.f9542m = true;
        this.f9543n = 0;
        this.f9544o = 0.0f;
        this.f9545p = new RectF();
        m11192a(context, null, 0);
    }

    public SeekArc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9532c = 100;
        this.f9533d = 0;
        this.f9534e = 4;
        this.f9535f = 2;
        this.f9536g = 0;
        this.f9537h = 360;
        this.f9538i = 0;
        this.f9539j = false;
        this.f9540k = true;
        this.f9541l = true;
        this.f9542m = true;
        this.f9543n = 0;
        this.f9544o = 0.0f;
        this.f9545p = new RectF();
        m11192a(context, attributeSet, R$attr.seekArcStyle);
    }

    public SeekArc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9532c = 100;
        this.f9533d = 0;
        this.f9534e = 4;
        this.f9535f = 2;
        this.f9536g = 0;
        this.f9537h = 360;
        this.f9538i = 0;
        this.f9539j = false;
        this.f9540k = true;
        this.f9541l = true;
        this.f9542m = true;
        this.f9543n = 0;
        this.f9544o = 0.0f;
        this.f9545p = new RectF();
        m11192a(context, attributeSet, i);
    }

    /* renamed from: a */
    private double m11188a(float f, float f2) {
        float f3 = f - this.f9548s;
        float f4 = f2 - this.f9549t;
        if (!this.f9541l) {
            f3 = -f3;
        }
        double degrees = Math.toDegrees((Math.atan2(f4, f3) + 1.5707963267948966d) - Math.toRadians(this.f9538i));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        }
        double d = this.f9536g;
        Double.isNaN(d);
        return degrees - d;
    }

    /* renamed from: a */
    private int m11189a(double d) {
        double m11198d = m11198d();
        Double.isNaN(m11198d);
        int round = (int) Math.round(m11198d * d);
        if (round < 0) {
            round = f9529A;
        }
        return round > this.f9532c ? f9529A : round;
    }

    /* renamed from: a */
    private void m11190a() {
        InterfaceC2340a interfaceC2340a = this.f9554y;
        if (interfaceC2340a != null) {
            interfaceC2340a.mo4949a(this);
        }
    }

    /* renamed from: a */
    private void m11191a(int i, boolean z) {
        m11195b(i, z);
    }

    /* renamed from: a */
    private void m11192a(Context context, AttributeSet attributeSet, int i) {
        Resources resources = getResources();
        float f = context.getResources().getDisplayMetrics().density;
        int color = resources.getColor(R$color.progress_gray);
        int color2 = resources.getColor(R$color.default_blue_light);
        this.f9531b = resources.getDrawable(R$drawable.seek_arc_control_selector);
        this.f9534e = (int) (this.f9534e * f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SeekArc, i, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.SeekArc_thumb);
            if (drawable != null) {
                this.f9531b = drawable;
            }
            int intrinsicHeight = this.f9531b.getIntrinsicHeight() / 2;
            int intrinsicWidth = this.f9531b.getIntrinsicWidth() / 2;
            this.f9531b.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
            this.f9532c = obtainStyledAttributes.getInteger(R$styleable.SeekArc_max, this.f9532c);
            this.f9533d = obtainStyledAttributes.getInteger(R$styleable.SeekArc_progress, this.f9533d);
            this.f9534e = (int) obtainStyledAttributes.getDimension(R$styleable.SeekArc_progressWidth, this.f9534e);
            this.f9535f = (int) obtainStyledAttributes.getDimension(R$styleable.SeekArc_arcWidth, this.f9535f);
            this.f9536g = obtainStyledAttributes.getInt(R$styleable.SeekArc_startAngle, this.f9536g);
            this.f9537h = obtainStyledAttributes.getInt(R$styleable.SeekArc_sweepAngle, this.f9537h);
            this.f9538i = obtainStyledAttributes.getInt(R$styleable.SeekArc_rotation, this.f9538i);
            this.f9539j = obtainStyledAttributes.getBoolean(R$styleable.SeekArc_roundEdges, this.f9539j);
            this.f9540k = obtainStyledAttributes.getBoolean(R$styleable.SeekArc_touchInside, this.f9540k);
            this.f9541l = obtainStyledAttributes.getBoolean(R$styleable.SeekArc_clockwise, this.f9541l);
            this.f9542m = obtainStyledAttributes.getBoolean(R$styleable.SeekArc_enabled, this.f9542m);
            color = obtainStyledAttributes.getColor(R$styleable.SeekArc_arcColor, color);
            color2 = obtainStyledAttributes.getColor(R$styleable.SeekArc_progressColor, color2);
            obtainStyledAttributes.recycle();
        }
        int i2 = this.f9533d;
        int i3 = this.f9532c;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f9533d = i2;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f9533d = i2;
        int i4 = this.f9537h;
        if (i4 > 360) {
            i4 = 360;
        }
        this.f9537h = i4;
        if (i4 < 0) {
            i4 = 0;
        }
        this.f9537h = i4;
        this.f9544o = (this.f9533d / this.f9532c) * i4;
        int i5 = this.f9536g;
        if (i5 > 360) {
            i5 = 0;
        }
        this.f9536g = i5;
        this.f9536g = i5 >= 0 ? i5 : 0;
        Paint paint = new Paint();
        this.f9546q = paint;
        paint.setColor(color);
        this.f9546q.setAntiAlias(true);
        this.f9546q.setStyle(Paint.Style.STROKE);
        this.f9546q.setStrokeWidth(this.f9535f);
        Paint paint2 = new Paint();
        this.f9547r = paint2;
        paint2.setColor(color2);
        this.f9547r.setAntiAlias(true);
        this.f9547r.setStyle(Paint.Style.STROKE);
        this.f9547r.setStrokeWidth(this.f9534e);
        if (this.f9539j) {
            this.f9546q.setStrokeCap(Paint.Cap.ROUND);
            this.f9547r.setStrokeCap(Paint.Cap.ROUND);
        }
    }

    /* renamed from: a */
    private void m11193a(MotionEvent motionEvent) {
        if (m11196b(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        setPressed(true);
        double m11188a = m11188a(motionEvent.getX(), motionEvent.getY());
        this.f9552w = m11188a;
        if (0.0d > m11188a || m11188a > this.f9537h) {
            return;
        }
        m11191a(m11189a(m11188a), true);
    }

    /* renamed from: b */
    private void m11194b() {
        InterfaceC2340a interfaceC2340a = this.f9554y;
        if (interfaceC2340a != null) {
            interfaceC2340a.mo4951b(this);
        }
    }

    /* renamed from: b */
    private void m11195b(int i, boolean z) {
        if (i == f9529A) {
            return;
        }
        int i2 = this.f9532c;
        if (i > i2) {
            i = i2;
        }
        if (i < 0) {
            i = 0;
        }
        this.f9533d = i;
        InterfaceC2340a interfaceC2340a = this.f9554y;
        if (interfaceC2340a != null) {
            interfaceC2340a.mo4950a(this, i, z);
        }
        this.f9544o = (i / this.f9532c) * this.f9537h;
        m11197c();
        invalidate();
    }

    /* renamed from: b */
    private boolean m11196b(float f, float f2) {
        float f3 = f - this.f9548s;
        float f4 = f2 - this.f9549t;
        return ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) < this.f9553x;
    }

    /* renamed from: c */
    private void m11197c() {
        int i = (int) (this.f9536g + this.f9544o + this.f9538i + 90.0f);
        double d = this.f9543n;
        double d2 = i;
        double cos = Math.cos(Math.toRadians(d2));
        Double.isNaN(d);
        this.f9550u = (int) (d * cos);
        double d3 = this.f9543n;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        this.f9551v = (int) (d3 * sin);
    }

    /* renamed from: d */
    private float m11198d() {
        return this.f9532c / this.f9537h;
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9531b;
        if (drawable != null && drawable.isStateful()) {
            this.f9531b.setState(getDrawableState());
        }
        invalidate();
    }

    public int getArcColor() {
        return this.f9546q.getColor();
    }

    public int getArcRotation() {
        return this.f9538i;
    }

    public int getArcWidth() {
        return this.f9535f;
    }

    public int getMax() {
        return this.f9532c;
    }

    public int getProgress() {
        return this.f9533d;
    }

    public int getProgressColor() {
        return this.f9547r.getColor();
    }

    public int getProgressWidth() {
        return this.f9534e;
    }

    public int getStartAngle() {
        return this.f9536g;
    }

    public int getSweepAngle() {
        return this.f9537h;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f9542m;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.f9541l) {
            canvas.scale(-1.0f, 1.0f, this.f9545p.centerX(), this.f9545p.centerY());
        }
        float f = (this.f9536g - 90) + this.f9538i;
        canvas.drawArc(this.f9545p, f, this.f9537h, false, this.f9546q);
        float f2 = this.f9544o;
        if (f2 == 0.0f || f2 == 0.0f) {
            this.f9544o = 1.0E-4f;
        }
        canvas.drawArc(this.f9545p, f, this.f9544o, false, this.f9547r);
        if (this.f9542m) {
            canvas.translate(this.f9548s - this.f9550u, this.f9549t - this.f9551v);
            this.f9531b.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int min = Math.min(defaultSize2, defaultSize);
        this.f9548s = (int) (defaultSize2 * 0.5f);
        this.f9549t = (int) (defaultSize * 0.5f);
        int paddingLeft = min - getPaddingLeft();
        int i3 = paddingLeft / 2;
        this.f9543n = i3;
        float f = (defaultSize / 2) - i3;
        float f2 = (defaultSize2 / 2) - i3;
        float f3 = paddingLeft;
        this.f9545p.set(f2, f, f2 + f3, f3 + f);
        int i4 = ((int) this.f9544o) + this.f9536g + this.f9538i + 90;
        double d = this.f9543n;
        double d2 = i4;
        double cos = Math.cos(Math.toRadians(d2));
        Double.isNaN(d);
        this.f9550u = (int) (d * cos);
        double d3 = this.f9543n;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        this.f9551v = (int) (d3 * sin);
        setTouchInSide(this.f9540k);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r0 != 3) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.f9542m
            r1 = 0
            if (r0 == 0) goto L31
            android.view.ViewParent r0 = r4.getParent()
            r2 = 1
            r0.requestDisallowInterceptTouchEvent(r2)
            int r0 = r5.getAction()
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L1c
            r3 = 2
            if (r0 == r3) goto L2d
            r5 = 3
            if (r0 == r5) goto L1c
            goto L30
        L1c:
            r4.m11194b()
            r4.setPressed(r1)
            android.view.ViewParent r5 = r4.getParent()
            r5.requestDisallowInterceptTouchEvent(r1)
            goto L30
        L2a:
            r4.m11190a()
        L2d:
            r4.m11193a(r5)
        L30:
            return r2
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.triggertrap.seekarc.SeekArc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setArcColor(int i) {
        this.f9546q.setColor(i);
        invalidate();
    }

    public void setArcRotation(int i) {
        this.f9538i = i;
        m11197c();
    }

    public void setArcWidth(int i) {
        this.f9535f = i;
        this.f9546q.setStrokeWidth(i);
    }

    public void setClockwise(boolean z) {
        this.f9541l = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.f9542m = z;
    }

    public void setMax(int i) {
        this.f9532c = i;
    }

    public void setOnSeekArcChangeListener(InterfaceC2340a interfaceC2340a) {
        this.f9554y = interfaceC2340a;
    }

    public void setProgress(int i) {
        m11195b(i, false);
    }

    public void setProgressColor(int i) {
        this.f9547r.setColor(i);
        invalidate();
    }

    public void setProgressWidth(int i) {
        this.f9534e = i;
        this.f9547r.setStrokeWidth(i);
    }

    public void setRoundedEdges(boolean z) {
        Paint paint;
        Paint.Cap cap;
        this.f9539j = z;
        if (z) {
            this.f9546q.setStrokeCap(Paint.Cap.ROUND);
            paint = this.f9547r;
            cap = Paint.Cap.ROUND;
        } else {
            this.f9546q.setStrokeCap(Paint.Cap.SQUARE);
            paint = this.f9547r;
            cap = Paint.Cap.SQUARE;
        }
        paint.setStrokeCap(cap);
    }

    public void setStartAngle(int i) {
        this.f9536g = i;
        m11197c();
    }

    public void setSweepAngle(int i) {
        this.f9537h = i;
        m11197c();
    }

    public void setThumbBound(int i) {
        if (i > 0) {
            int i2 = (-i) / 2;
            int i3 = i / 2;
            this.f9531b.setBounds(i2, i2, i3, i3);
        } else {
            int intrinsicHeight = this.f9531b.getIntrinsicHeight() / 2;
            int intrinsicWidth = this.f9531b.getIntrinsicWidth() / 2;
            this.f9531b.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f9531b = drawable;
    }

    public void setTouchInSide(boolean z) {
        int intrinsicHeight = this.f9531b.getIntrinsicHeight() / 2;
        int intrinsicWidth = this.f9531b.getIntrinsicWidth() / 2;
        this.f9540k = z;
        this.f9553x = z ? this.f9543n / 4.0f : this.f9543n - Math.min(intrinsicWidth, intrinsicHeight);
    }
}
