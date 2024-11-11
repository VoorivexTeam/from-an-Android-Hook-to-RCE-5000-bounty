package com.theartofdev.edmodo.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    private CropImageView.EnumC2322c f9423A;

    /* renamed from: B */
    private final Rect f9424B;

    /* renamed from: C */
    private boolean f9425C;

    /* renamed from: D */
    private Integer f9426D;

    /* renamed from: b */
    private ScaleGestureDetector f9427b;

    /* renamed from: c */
    private boolean f9428c;

    /* renamed from: d */
    private final C2338e f9429d;

    /* renamed from: e */
    private InterfaceC2332b f9430e;

    /* renamed from: f */
    private final RectF f9431f;

    /* renamed from: g */
    private Paint f9432g;

    /* renamed from: h */
    private Paint f9433h;

    /* renamed from: i */
    private Paint f9434i;

    /* renamed from: j */
    private Paint f9435j;

    /* renamed from: k */
    private Path f9436k;

    /* renamed from: l */
    private final float[] f9437l;

    /* renamed from: m */
    private final RectF f9438m;

    /* renamed from: n */
    private int f9439n;

    /* renamed from: o */
    private int f9440o;

    /* renamed from: p */
    private float f9441p;

    /* renamed from: q */
    private float f9442q;

    /* renamed from: r */
    private float f9443r;

    /* renamed from: s */
    private float f9444s;

    /* renamed from: t */
    private float f9445t;

    /* renamed from: u */
    private C2339f f9446u;

    /* renamed from: v */
    private boolean f9447v;

    /* renamed from: w */
    private int f9448w;

    /* renamed from: x */
    private int f9449x;

    /* renamed from: y */
    private float f9450y;

    /* renamed from: z */
    private CropImageView.EnumC2323d f9451z;

    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2332b {
        /* renamed from: a */
        void mo11082a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$c */
    /* loaded from: classes.dex */
    public class C2333c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C2333c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        @TargetApi(11)
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF m11167e = CropOverlayView.this.f9429d.m11167e();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 >= f3 || f > f4 || f2 < 0.0f || f3 > CropOverlayView.this.f9429d.m11164b() || f < 0.0f || f4 > CropOverlayView.this.f9429d.m11159a()) {
                return true;
            }
            m11167e.set(f2, f, f3, f4);
            CropOverlayView.this.f9429d.m11162a(m11167e);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context) {
        this(context, null);
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9429d = new C2338e();
        this.f9431f = new RectF();
        this.f9436k = new Path();
        this.f9437l = new float[8];
        this.f9438m = new RectF();
        this.f9450y = this.f9448w / this.f9449x;
        this.f9424B = new Rect();
    }

    /* renamed from: a */
    private static Paint m11094a(float f, int i) {
        if (f <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    /* renamed from: a */
    private static Paint m11095a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    /* renamed from: a */
    private void m11097a(float f, float f2) {
        C2339f m11160a = this.f9429d.m11160a(f, f2, this.f9444s, this.f9423A);
        this.f9446u = m11160a;
        if (m11160a != null) {
            invalidate();
        }
    }

    /* renamed from: a */
    private void m11098a(Canvas canvas) {
        RectF m11167e = this.f9429d.m11167e();
        float max = Math.max(C2336c.m11146e(this.f9437l), 0.0f);
        float max2 = Math.max(C2336c.m11148g(this.f9437l), 0.0f);
        float min = Math.min(C2336c.m11147f(this.f9437l), getWidth());
        float min2 = Math.min(C2336c.m11120a(this.f9437l), getHeight());
        if (this.f9423A != CropImageView.EnumC2322c.RECTANGLE) {
            this.f9436k.reset();
            if (Build.VERSION.SDK_INT > 17 || this.f9423A != CropImageView.EnumC2322c.OVAL) {
                this.f9431f.set(m11167e.left, m11167e.top, m11167e.right, m11167e.bottom);
            } else {
                this.f9431f.set(m11167e.left + 2.0f, m11167e.top + 2.0f, m11167e.right - 2.0f, m11167e.bottom - 2.0f);
            }
            this.f9436k.addOval(this.f9431f, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(this.f9436k, Region.Op.XOR);
        } else {
            if (!m11107e() || Build.VERSION.SDK_INT <= 17) {
                canvas.drawRect(max, max2, min, m11167e.top, this.f9435j);
                canvas.drawRect(max, m11167e.bottom, min, min2, this.f9435j);
                canvas.drawRect(max, m11167e.top, m11167e.left, m11167e.bottom, this.f9435j);
                canvas.drawRect(m11167e.right, m11167e.top, min, m11167e.bottom, this.f9435j);
                return;
            }
            this.f9436k.reset();
            Path path = this.f9436k;
            float[] fArr = this.f9437l;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.f9436k;
            float[] fArr2 = this.f9437l;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.f9436k;
            float[] fArr3 = this.f9437l;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.f9436k;
            float[] fArr4 = this.f9437l;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.f9436k.close();
            canvas.save();
            canvas.clipPath(this.f9436k, Region.Op.INTERSECT);
            canvas.clipRect(m11167e, Region.Op.XOR);
        }
        canvas.drawRect(max, max2, min, min2, this.f9435j);
        canvas.restore();
    }

    /* renamed from: a */
    private boolean m11099a(RectF rectF) {
        float m11146e = C2336c.m11146e(this.f9437l);
        float m11148g = C2336c.m11148g(this.f9437l);
        float m11147f = C2336c.m11147f(this.f9437l);
        float m11120a = C2336c.m11120a(this.f9437l);
        if (!m11107e()) {
            this.f9438m.set(m11146e, m11148g, m11147f, m11120a);
            return false;
        }
        float[] fArr = this.f9437l;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[4];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f = fArr[6];
                f2 = fArr[7];
                f3 = fArr[2];
                f4 = fArr[3];
                f5 = fArr[4];
                f6 = fArr[5];
            } else {
                f = fArr[4];
                f2 = fArr[5];
                f3 = fArr[0];
                f4 = fArr[1];
                f5 = fArr[2];
                f6 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f = fArr[2];
            f2 = fArr[3];
            f3 = fArr[6];
            f4 = fArr[7];
            f5 = fArr[0];
            f6 = fArr[1];
        }
        float f7 = (f6 - f2) / (f5 - f);
        float f8 = (-1.0f) / f7;
        float f9 = f2 - (f7 * f);
        float f10 = f2 - (f * f8);
        float f11 = f4 - (f7 * f3);
        float f12 = f4 - (f3 * f8);
        float centerY = rectF.centerY() - rectF.top;
        float centerX = rectF.centerX();
        float f13 = rectF.left;
        float f14 = centerY / (centerX - f13);
        float f15 = -f14;
        float f16 = rectF.top;
        float f17 = f16 - (f13 * f14);
        float f18 = rectF.right;
        float f19 = f16 - (f15 * f18);
        float f20 = f7 - f14;
        float f21 = (f17 - f9) / f20;
        float max = Math.max(m11146e, f21 < f18 ? f21 : m11146e);
        float f22 = (f17 - f10) / (f8 - f14);
        if (f22 >= rectF.right) {
            f22 = max;
        }
        float max2 = Math.max(max, f22);
        float f23 = f8 - f15;
        float f24 = (f19 - f12) / f23;
        if (f24 >= rectF.right) {
            f24 = max2;
        }
        float max3 = Math.max(max2, f24);
        float f25 = (f19 - f10) / f23;
        if (f25 <= rectF.left) {
            f25 = m11147f;
        }
        float min = Math.min(m11147f, f25);
        float f26 = (f19 - f11) / (f7 - f15);
        if (f26 <= rectF.left) {
            f26 = min;
        }
        float min2 = Math.min(min, f26);
        float f27 = (f17 - f11) / f20;
        if (f27 <= rectF.left) {
            f27 = min2;
        }
        float min3 = Math.min(min2, f27);
        float max4 = Math.max(m11148g, Math.max((f7 * max3) + f9, (f8 * min3) + f10));
        float min4 = Math.min(m11120a, Math.min((f8 * max3) + f12, (f7 * min3) + f11));
        RectF rectF2 = this.f9438m;
        rectF2.left = max3;
        rectF2.top = max4;
        rectF2.right = min3;
        rectF2.bottom = min4;
        return true;
    }

    /* renamed from: b */
    private void m11100b(float f, float f2) {
        if (this.f9446u != null) {
            float f3 = this.f9445t;
            RectF m11167e = this.f9429d.m11167e();
            this.f9446u.m11187a(m11167e, f, f2, this.f9438m, this.f9439n, this.f9440o, m11099a(m11167e) ? 0.0f : f3, this.f9447v, this.f9450y);
            this.f9429d.m11162a(m11167e);
            m11103b(true);
            invalidate();
        }
    }

    /* renamed from: b */
    private void m11101b(Canvas canvas) {
        Paint paint = this.f9432g;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF m11167e = this.f9429d.m11167e();
            float f = strokeWidth / 2.0f;
            m11167e.inset(f, f);
            if (this.f9423A == CropImageView.EnumC2322c.RECTANGLE) {
                canvas.drawRect(m11167e, this.f9432g);
            } else {
                canvas.drawOval(m11167e, this.f9432g);
            }
        }
    }

    /* renamed from: b */
    private void m11102b(RectF rectF) {
        if (rectF.width() < this.f9429d.m11166d()) {
            float m11166d = (this.f9429d.m11166d() - rectF.width()) / 2.0f;
            rectF.left -= m11166d;
            rectF.right += m11166d;
        }
        if (rectF.height() < this.f9429d.m11165c()) {
            float m11165c = (this.f9429d.m11165c() - rectF.height()) / 2.0f;
            rectF.top -= m11165c;
            rectF.bottom += m11165c;
        }
        if (rectF.width() > this.f9429d.m11164b()) {
            float width = (rectF.width() - this.f9429d.m11164b()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.f9429d.m11159a()) {
            float height = (rectF.height() - this.f9429d.m11159a()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        m11099a(rectF);
        if (this.f9438m.width() > 0.0f && this.f9438m.height() > 0.0f) {
            float max = Math.max(this.f9438m.left, 0.0f);
            float max2 = Math.max(this.f9438m.top, 0.0f);
            float min = Math.min(this.f9438m.right, getWidth());
            float min2 = Math.min(this.f9438m.bottom, getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (!this.f9447v || Math.abs(rectF.width() - (rectF.height() * this.f9450y)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.f9450y) {
            float abs = Math.abs((rectF.height() * this.f9450y) - rectF.width()) / 2.0f;
            rectF.left += abs;
            rectF.right -= abs;
        } else {
            float abs2 = Math.abs((rectF.width() / this.f9450y) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* renamed from: b */
    private void m11103b(boolean z) {
        try {
            if (this.f9430e != null) {
                this.f9430e.mo11082a(z);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m11104c(Canvas canvas) {
        if (this.f9433h != null) {
            Paint paint = this.f9432g;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            float strokeWidth2 = this.f9433h.getStrokeWidth();
            float f = strokeWidth2 / 2.0f;
            float f2 = (this.f9423A == CropImageView.EnumC2322c.RECTANGLE ? this.f9441p : 0.0f) + f;
            RectF m11167e = this.f9429d.m11167e();
            m11167e.inset(f2, f2);
            float f3 = (strokeWidth2 - strokeWidth) / 2.0f;
            float f4 = f + f3;
            float f5 = m11167e.left;
            float f6 = m11167e.top;
            canvas.drawLine(f5 - f3, f6 - f4, f5 - f3, f6 + this.f9442q, this.f9433h);
            float f7 = m11167e.left;
            float f8 = m11167e.top;
            canvas.drawLine(f7 - f4, f8 - f3, f7 + this.f9442q, f8 - f3, this.f9433h);
            float f9 = m11167e.right;
            float f10 = m11167e.top;
            canvas.drawLine(f9 + f3, f10 - f4, f9 + f3, f10 + this.f9442q, this.f9433h);
            float f11 = m11167e.right;
            float f12 = m11167e.top;
            canvas.drawLine(f11 + f4, f12 - f3, f11 - this.f9442q, f12 - f3, this.f9433h);
            float f13 = m11167e.left;
            float f14 = m11167e.bottom;
            canvas.drawLine(f13 - f3, f14 + f4, f13 - f3, f14 - this.f9442q, this.f9433h);
            float f15 = m11167e.left;
            float f16 = m11167e.bottom;
            canvas.drawLine(f15 - f4, f16 + f3, f15 + this.f9442q, f16 + f3, this.f9433h);
            float f17 = m11167e.right;
            float f18 = m11167e.bottom;
            canvas.drawLine(f17 + f3, f18 + f4, f17 + f3, f18 - this.f9442q, this.f9433h);
            float f19 = m11167e.right;
            float f20 = m11167e.bottom;
            canvas.drawLine(f19 + f4, f20 + f3, f19 - this.f9442q, f20 + f3, this.f9433h);
        }
    }

    /* renamed from: d */
    private void m11105d() {
        float f;
        float max = Math.max(C2336c.m11146e(this.f9437l), 0.0f);
        float max2 = Math.max(C2336c.m11148g(this.f9437l), 0.0f);
        float min = Math.min(C2336c.m11147f(this.f9437l), getWidth());
        float min2 = Math.min(C2336c.m11120a(this.f9437l), getHeight());
        if (min <= max || min2 <= max2) {
            return;
        }
        RectF rectF = new RectF();
        this.f9425C = true;
        float f2 = this.f9443r;
        float f3 = min - max;
        float f4 = f2 * f3;
        float f5 = min2 - max2;
        float f6 = f2 * f5;
        if (this.f9424B.width() <= 0 || this.f9424B.height() <= 0) {
            if (!this.f9447v || min <= max || min2 <= max2) {
                rectF.left = max + f4;
                rectF.top = max2 + f6;
                rectF.right = min - f4;
                rectF.bottom = min2 - f6;
            } else if (f3 / f5 > this.f9450y) {
                rectF.top = max2 + f6;
                rectF.bottom = min2 - f6;
                float width = getWidth() / 2.0f;
                this.f9450y = this.f9448w / this.f9449x;
                float max3 = Math.max(this.f9429d.m11166d(), rectF.height() * this.f9450y) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f4;
                rectF.right = min - f4;
                float height = getHeight() / 2.0f;
                float max4 = Math.max(this.f9429d.m11165c(), rectF.width() / this.f9450y) / 2.0f;
                rectF.top = height - max4;
                f = height + max4;
            }
            m11102b(rectF);
            this.f9429d.m11162a(rectF);
        }
        rectF.left = (this.f9424B.left / this.f9429d.m11169g()) + max;
        rectF.top = (this.f9424B.top / this.f9429d.m11168f()) + max2;
        rectF.right = rectF.left + (this.f9424B.width() / this.f9429d.m11169g());
        rectF.bottom = rectF.top + (this.f9424B.height() / this.f9429d.m11168f());
        rectF.left = Math.max(max, rectF.left);
        rectF.top = Math.max(max2, rectF.top);
        rectF.right = Math.min(min, rectF.right);
        f = Math.min(min2, rectF.bottom);
        rectF.bottom = f;
        m11102b(rectF);
        this.f9429d.m11162a(rectF);
    }

    /* renamed from: d */
    private void m11106d(Canvas canvas) {
        if (this.f9434i != null) {
            Paint paint = this.f9432g;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF m11167e = this.f9429d.m11167e();
            m11167e.inset(strokeWidth, strokeWidth);
            float width = m11167e.width() / 3.0f;
            float height = m11167e.height() / 3.0f;
            if (this.f9423A != CropImageView.EnumC2322c.OVAL) {
                float f = m11167e.left + width;
                float f2 = m11167e.right - width;
                canvas.drawLine(f, m11167e.top, f, m11167e.bottom, this.f9434i);
                canvas.drawLine(f2, m11167e.top, f2, m11167e.bottom, this.f9434i);
                float f3 = m11167e.top + height;
                float f4 = m11167e.bottom - height;
                canvas.drawLine(m11167e.left, f3, m11167e.right, f3, this.f9434i);
                canvas.drawLine(m11167e.left, f4, m11167e.right, f4, this.f9434i);
                return;
            }
            float width2 = (m11167e.width() / 2.0f) - strokeWidth;
            float height2 = (m11167e.height() / 2.0f) - strokeWidth;
            float f5 = m11167e.left + width;
            float f6 = m11167e.right - width;
            double d = height2;
            double sin = Math.sin(Math.acos((width2 - width) / width2));
            Double.isNaN(d);
            float f7 = (float) (d * sin);
            canvas.drawLine(f5, (m11167e.top + height2) - f7, f5, (m11167e.bottom - height2) + f7, this.f9434i);
            canvas.drawLine(f6, (m11167e.top + height2) - f7, f6, (m11167e.bottom - height2) + f7, this.f9434i);
            float f8 = m11167e.top + height;
            float f9 = m11167e.bottom - height;
            double d2 = width2;
            double cos = Math.cos(Math.asin((height2 - height) / height2));
            Double.isNaN(d2);
            float f10 = (float) (d2 * cos);
            canvas.drawLine((m11167e.left + width2) - f10, f8, (m11167e.right - width2) + f10, f8, this.f9434i);
            canvas.drawLine((m11167e.left + width2) - f10, f9, (m11167e.right - width2) + f10, f9, this.f9434i);
        }
    }

    /* renamed from: e */
    private boolean m11107e() {
        float[] fArr = this.f9437l;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    /* renamed from: f */
    private void m11108f() {
        if (this.f9446u != null) {
            this.f9446u = null;
            m11103b(false);
            invalidate();
        }
    }

    /* renamed from: a */
    public void m11109a() {
        RectF cropWindowRect = getCropWindowRect();
        m11102b(cropWindowRect);
        this.f9429d.m11162a(cropWindowRect);
    }

    /* renamed from: a */
    public void m11110a(float f, float f2, float f3, float f4) {
        this.f9429d.m11161a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public void m11111a(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.f9437l, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f9437l, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f9437l, 0, fArr.length);
            }
            this.f9439n = i;
            this.f9440o = i2;
            RectF m11167e = this.f9429d.m11167e();
            if (m11167e.width() == 0.0f || m11167e.height() == 0.0f) {
                m11105d();
            }
        }
    }

    /* renamed from: a */
    public boolean m11112a(boolean z) {
        if (this.f9428c == z) {
            return false;
        }
        this.f9428c = z;
        if (!z || this.f9427b != null) {
            return true;
        }
        this.f9427b = new ScaleGestureDetector(getContext(), new C2333c());
        return true;
    }

    /* renamed from: b */
    public boolean m11113b() {
        return this.f9447v;
    }

    /* renamed from: c */
    public void m11114c() {
        if (this.f9425C) {
            setCropWindowRect(C2336c.f9489b);
            m11105d();
            invalidate();
        }
    }

    public int getAspectRatioX() {
        return this.f9448w;
    }

    public int getAspectRatioY() {
        return this.f9449x;
    }

    public CropImageView.EnumC2322c getCropShape() {
        return this.f9423A;
    }

    public RectF getCropWindowRect() {
        return this.f9429d.m11167e();
    }

    public CropImageView.EnumC2323d getGuidelines() {
        return this.f9451z;
    }

    public Rect getInitialCropWindowRect() {
        return this.f9424B;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        CropImageView.EnumC2323d enumC2323d;
        super.onDraw(canvas);
        m11098a(canvas);
        if (this.f9429d.m11170h() && ((enumC2323d = this.f9451z) == CropImageView.EnumC2323d.ON || (enumC2323d == CropImageView.EnumC2323d.ON_TOUCH && this.f9446u != null))) {
            m11106d(canvas);
        }
        m11101b(canvas);
        m11104c(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f9428c) {
            this.f9427b.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m11097a(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                m11100b(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m11108f();
        return true;
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f9448w != i) {
            this.f9448w = i;
            this.f9450y = i / this.f9449x;
            if (this.f9425C) {
                m11105d();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f9449x != i) {
            this.f9449x = i;
            this.f9450y = this.f9448w / i;
            if (this.f9425C) {
                m11105d();
                invalidate();
            }
        }
    }

    public void setCropShape(CropImageView.EnumC2322c enumC2322c) {
        if (this.f9423A != enumC2322c) {
            this.f9423A = enumC2322c;
            if (Build.VERSION.SDK_INT <= 17) {
                if (enumC2322c == CropImageView.EnumC2322c.OVAL) {
                    Integer valueOf = Integer.valueOf(getLayerType());
                    this.f9426D = valueOf;
                    if (valueOf.intValue() != 1) {
                        setLayerType(1, null);
                    }
                    this.f9426D = null;
                } else {
                    Integer num = this.f9426D;
                    if (num != null) {
                        setLayerType(num.intValue(), null);
                        this.f9426D = null;
                    }
                }
            }
            invalidate();
        }
    }

    public void setCropWindowChangeListener(InterfaceC2332b interfaceC2332b) {
        this.f9430e = interfaceC2332b;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f9429d.m11162a(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f9447v != z) {
            this.f9447v = z;
            if (this.f9425C) {
                m11105d();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.EnumC2323d enumC2323d) {
        if (this.f9451z != enumC2323d) {
            this.f9451z = enumC2323d;
            if (this.f9425C) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        this.f9429d.m11163a(cropImageOptions);
        setCropShape(cropImageOptions.f9344b);
        setSnapRadius(cropImageOptions.f9346c);
        setGuidelines(cropImageOptions.f9350e);
        setFixedAspectRatio(cropImageOptions.f9359m);
        setAspectRatioX(cropImageOptions.f9360n);
        setAspectRatioY(cropImageOptions.f9361o);
        m11112a(cropImageOptions.f9356j);
        this.f9444s = cropImageOptions.f9348d;
        this.f9443r = cropImageOptions.f9358l;
        this.f9432g = m11094a(cropImageOptions.f9362p, cropImageOptions.f9363q);
        this.f9441p = cropImageOptions.f9365s;
        this.f9442q = cropImageOptions.f9366t;
        this.f9433h = m11094a(cropImageOptions.f9364r, cropImageOptions.f9367u);
        this.f9434i = m11094a(cropImageOptions.f9368v, cropImageOptions.f9369w);
        this.f9435j = m11095a(cropImageOptions.f9370x);
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f9424B;
        if (rect == null) {
            rect = C2336c.f9488a;
        }
        rect2.set(rect);
        if (this.f9425C) {
            m11105d();
            invalidate();
            m11103b(false);
        }
    }

    public void setSnapRadius(float f) {
        this.f9445t = f;
    }
}
