package ir.tapsell.sdk.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public class DilatingDotDrawable extends Drawable implements NoProguard {
    private static final String TAG = DilatingDotDrawable.class.getSimpleName();
    final Rect mDirtyBounds = new Rect(0, 0, 0, 0);
    private Paint mPaint;
    private float maxRadius;
    private float radius;

    public DilatingDotDrawable(int i, float f, float f2) {
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(i);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setStrokeJoin(Paint.Join.ROUND);
        this.radius = f;
        setMaxRadius(f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.radius - 1.0f, this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.mDirtyBounds;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) (this.maxRadius * 2.0f)) + 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) (this.maxRadius * 2.0f)) + 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getRadius() {
        return this.radius;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mDirtyBounds.offsetTo(rect.left, rect.top);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        this.mPaint.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setMaxRadius(float f) {
        this.maxRadius = f;
        Rect rect = this.mDirtyBounds;
        int i = ((int) (f * 2.0f)) + 2;
        rect.bottom = i;
        rect.right = i;
    }

    public void setRadius(float f) {
        this.radius = f;
        invalidateSelf();
    }
}
