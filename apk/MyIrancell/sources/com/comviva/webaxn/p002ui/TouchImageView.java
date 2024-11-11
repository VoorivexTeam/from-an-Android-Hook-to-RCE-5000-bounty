package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class TouchImageView extends ImageView {

    /* renamed from: b */
    Matrix f3393b;

    /* renamed from: c */
    int f3394c;

    /* renamed from: d */
    PointF f3395d;

    /* renamed from: e */
    PointF f3396e;

    /* renamed from: f */
    float f3397f;

    /* renamed from: g */
    float f3398g;

    /* renamed from: h */
    float[] f3399h;

    /* renamed from: i */
    int f3400i;

    /* renamed from: j */
    int f3401j;

    /* renamed from: k */
    float f3402k;

    /* renamed from: l */
    protected float f3403l;

    /* renamed from: m */
    protected float f3404m;

    /* renamed from: n */
    int f3405n;

    /* renamed from: o */
    ScaleGestureDetector f3406o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.TouchImageView$a */
    /* loaded from: classes.dex */
    public class ViewOnTouchListenerC0595a implements View.OnTouchListener {
        ViewOnTouchListenerC0595a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            TouchImageView.this.f3406o.onTouchEvent(motionEvent);
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            if (action == 0) {
                TouchImageView.this.f3395d.set(pointF);
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.f3396e.set(touchImageView.f3395d);
                TouchImageView.this.f3394c = 1;
            } else if (action == 1) {
                TouchImageView touchImageView2 = TouchImageView.this;
                touchImageView2.f3394c = 0;
                int abs = (int) Math.abs(pointF.x - touchImageView2.f3396e.x);
                int abs2 = (int) Math.abs(pointF.y - TouchImageView.this.f3396e.y);
                if (abs < 3 && abs2 < 3) {
                    TouchImageView.this.performClick();
                }
            } else if (action == 2) {
                TouchImageView touchImageView3 = TouchImageView.this;
                if (touchImageView3.f3394c == 1) {
                    float f = pointF.x;
                    PointF pointF2 = touchImageView3.f3395d;
                    float f2 = f - pointF2.x;
                    float f3 = pointF.y - pointF2.y;
                    float m4056a = touchImageView3.m4056a(f2, touchImageView3.f3400i, touchImageView3.f3403l * touchImageView3.f3402k);
                    TouchImageView touchImageView4 = TouchImageView.this;
                    TouchImageView.this.f3393b.postTranslate(m4056a, touchImageView4.m4056a(f3, touchImageView4.f3401j, touchImageView4.f3404m * touchImageView4.f3402k));
                    TouchImageView.this.m4057a();
                    TouchImageView.this.f3395d.set(pointF.x, pointF.y);
                }
            } else if (action == 6) {
                TouchImageView.this.f3394c = 0;
            }
            TouchImageView touchImageView5 = TouchImageView.this;
            touchImageView5.setImageMatrix(touchImageView5.f3393b);
            TouchImageView.this.invalidate();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.comviva.webaxn.ui.TouchImageView$b */
    /* loaded from: classes.dex */
    public class C0596b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C0596b() {
        }

        /* synthetic */ C0596b(TouchImageView touchImageView, ViewOnTouchListenerC0595a viewOnTouchListenerC0595a) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        
            if (r3 < r4) goto L4;
         */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onScale(android.view.ScaleGestureDetector r7) {
            /*
                r6 = this;
                float r0 = r7.getScaleFactor()
                com.comviva.webaxn.ui.TouchImageView r1 = com.comviva.webaxn.p002ui.TouchImageView.this
                float r2 = r1.f3402k
                float r3 = r2 * r0
                r1.f3402k = r3
                float r4 = r1.f3398g
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 <= 0) goto L17
            L12:
                r1.f3402k = r4
                float r0 = r4 / r2
                goto L1e
            L17:
                float r4 = r1.f3397f
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 >= 0) goto L1e
                goto L12
            L1e:
                com.comviva.webaxn.ui.TouchImageView r1 = com.comviva.webaxn.p002ui.TouchImageView.this
                float r2 = r1.f3403l
                float r3 = r1.f3402k
                float r2 = r2 * r3
                int r4 = r1.f3400i
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L44
                float r2 = r1.f3404m
                float r2 = r2 * r3
                int r3 = r1.f3401j
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L39
                goto L44
            L39:
                android.graphics.Matrix r1 = r1.f3393b
                float r2 = r7.getFocusX()
                float r7 = r7.getFocusY()
                goto L52
            L44:
                com.comviva.webaxn.ui.TouchImageView r7 = com.comviva.webaxn.p002ui.TouchImageView.this
                android.graphics.Matrix r1 = r7.f3393b
                int r2 = r7.f3400i
                int r2 = r2 / 2
                float r2 = (float) r2
                int r7 = r7.f3401j
                int r7 = r7 / 2
                float r7 = (float) r7
            L52:
                r1.postScale(r0, r0, r2, r7)
                com.comviva.webaxn.ui.TouchImageView r7 = com.comviva.webaxn.p002ui.TouchImageView.this
                r7.m4057a()
                r7 = 1
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.TouchImageView.C0596b.onScale(android.view.ScaleGestureDetector):boolean");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.f3394c = 2;
            return true;
        }
    }

    public TouchImageView(Context context) {
        super(context);
        this.f3394c = 0;
        this.f3395d = new PointF();
        this.f3396e = new PointF();
        this.f3397f = 1.0f;
        this.f3398g = 3.0f;
        this.f3402k = 1.0f;
        m4055a(context);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3394c = 0;
        this.f3395d = new PointF();
        this.f3396e = new PointF();
        this.f3397f = 1.0f;
        this.f3398g = 3.0f;
        this.f3402k = 1.0f;
        m4055a(context);
    }

    /* renamed from: a */
    private void m4055a(Context context) {
        super.setClickable(true);
        this.f3406o = new ScaleGestureDetector(context, new C0596b(this, null));
        Matrix matrix = new Matrix();
        this.f3393b = matrix;
        this.f3399h = new float[9];
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setOnTouchListener(new ViewOnTouchListenerC0595a());
    }

    /* renamed from: a */
    float m4056a(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: a */
    void m4057a() {
        this.f3393b.getValues(this.f3399h);
        float[] fArr = this.f3399h;
        float f = fArr[2];
        float f2 = fArr[5];
        float m4058b = m4058b(f, this.f3400i, this.f3403l * this.f3402k);
        float m4058b2 = m4058b(f2, this.f3401j, this.f3404m * this.f3402k);
        if (m4058b == 0.0f && m4058b2 == 0.0f) {
            return;
        }
        this.f3393b.postTranslate(m4058b, m4058b2);
    }

    /* renamed from: b */
    float m4058b(float f, float f2, float f3) {
        float f4;
        float f5 = f2 - f3;
        if (f3 <= f2) {
            f4 = f5;
            f5 = 0.0f;
        } else {
            f4 = 0.0f;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        this.f3400i = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f3401j = size;
        int i4 = this.f3405n;
        if ((i4 == this.f3400i && i4 == size) || this.f3400i == 0 || (i3 = this.f3401j) == 0) {
            return;
        }
        this.f3405n = i3;
        if (this.f3402k == 1.0f) {
            Drawable drawable = getDrawable();
            if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
                return;
            }
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            float max = Math.max(this.f3400i / intrinsicWidth, this.f3401j / intrinsicHeight);
            this.f3393b.setScale(max, max);
            float f = (this.f3401j - (intrinsicHeight * max)) / 2.0f;
            float f2 = (this.f3400i - (max * intrinsicWidth)) / 2.0f;
            this.f3393b.postTranslate(f2, f);
            this.f3403l = this.f3400i - (f2 * 2.0f);
            this.f3404m = this.f3401j - (f * 2.0f);
            setImageMatrix(this.f3393b);
        }
        m4057a();
    }

    public void setMaxZoom(float f) {
        this.f3398g = f;
    }
}
