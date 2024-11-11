package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.theartofdev.edmodo.cropper.d */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC2337d extends Animation implements Animation.AnimationListener {

    /* renamed from: b */
    private final ImageView f9499b;

    /* renamed from: c */
    private final CropOverlayView f9500c;

    /* renamed from: d */
    private final float[] f9501d = new float[8];

    /* renamed from: e */
    private final float[] f9502e = new float[8];

    /* renamed from: f */
    private final RectF f9503f = new RectF();

    /* renamed from: g */
    private final RectF f9504g = new RectF();

    /* renamed from: h */
    private final float[] f9505h = new float[9];

    /* renamed from: i */
    private final float[] f9506i = new float[9];

    /* renamed from: j */
    private final RectF f9507j = new RectF();

    /* renamed from: k */
    private final float[] f9508k = new float[8];

    /* renamed from: l */
    private final float[] f9509l = new float[9];

    public AnimationAnimationListenerC2337d(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f9499b = imageView;
        this.f9500c = cropOverlayView;
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    /* renamed from: a */
    public void m11150a(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.f9502e, 0, 8);
        this.f9504g.set(this.f9500c.getCropWindowRect());
        matrix.getValues(this.f9506i);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.f9507j;
        RectF rectF2 = this.f9503f;
        float f2 = rectF2.left;
        RectF rectF3 = this.f9504g;
        rectF.left = f2 + ((rectF3.left - f2) * f);
        float f3 = rectF2.top;
        rectF.top = f3 + ((rectF3.top - f3) * f);
        float f4 = rectF2.right;
        rectF.right = f4 + ((rectF3.right - f4) * f);
        float f5 = rectF2.bottom;
        rectF.bottom = f5 + ((rectF3.bottom - f5) * f);
        this.f9500c.setCropWindowRect(rectF);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.f9508k;
            if (i2 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.f9501d;
            fArr[i2] = fArr2[i2] + ((this.f9502e[i2] - fArr2[i2]) * f);
            i2++;
        }
        this.f9500c.m11111a(fArr, this.f9499b.getWidth(), this.f9499b.getHeight());
        while (true) {
            float[] fArr3 = this.f9509l;
            if (i >= fArr3.length) {
                Matrix imageMatrix = this.f9499b.getImageMatrix();
                imageMatrix.setValues(this.f9509l);
                this.f9499b.setImageMatrix(imageMatrix);
                this.f9499b.invalidate();
                this.f9500c.invalidate();
                return;
            }
            float[] fArr4 = this.f9505h;
            fArr3[i] = fArr4[i] + ((this.f9506i[i] - fArr4[i]) * f);
            i++;
        }
    }

    /* renamed from: b */
    public void m11151b(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.f9501d, 0, 8);
        this.f9503f.set(this.f9500c.getCropWindowRect());
        matrix.getValues(this.f9505h);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f9499b.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
