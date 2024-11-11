package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends Animation implements Animation.AnimationListener {
    private final ImageView b;
    private final CropOverlayView c;
    private final float[] d = new float[8];
    private final float[] e = new float[8];
    private final RectF f = new RectF();
    private final RectF g = new RectF();
    private final float[] h = new float[9];
    private final float[] i = new float[9];
    private final RectF j = new RectF();
    private final float[] k = new float[8];
    private final float[] l = new float[9];

    public d(ImageView imageView, CropOverlayView cropOverlayView) {
        this.b = imageView;
        this.c = cropOverlayView;
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public void a(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.e, 0, 8);
        this.g.set(this.c.getCropWindowRect());
        matrix.getValues(this.i);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.j;
        RectF rectF2 = this.f;
        float f2 = rectF2.left;
        RectF rectF3 = this.g;
        rectF.left = f2 + ((rectF3.left - f2) * f);
        float f3 = rectF2.top;
        rectF.top = f3 + ((rectF3.top - f3) * f);
        float f4 = rectF2.right;
        rectF.right = f4 + ((rectF3.right - f4) * f);
        float f5 = rectF2.bottom;
        rectF.bottom = f5 + ((rectF3.bottom - f5) * f);
        this.c.setCropWindowRect(rectF);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.k;
            if (i2 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.d;
            fArr[i2] = fArr2[i2] + ((this.e[i2] - fArr2[i2]) * f);
            i2++;
        }
        this.c.a(fArr, this.b.getWidth(), this.b.getHeight());
        while (true) {
            float[] fArr3 = this.l;
            if (i >= fArr3.length) {
                Matrix imageMatrix = this.b.getImageMatrix();
                imageMatrix.setValues(this.l);
                this.b.setImageMatrix(imageMatrix);
                this.b.invalidate();
                this.c.invalidate();
                return;
            }
            float[] fArr4 = this.h;
            fArr3[i] = fArr4[i] + ((this.i[i] - fArr4[i]) * f);
            i++;
        }
    }

    public void b(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.d, 0, 8);
        this.f.set(this.c.getCropWindowRect());
        matrix.getValues(this.h);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.b.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
