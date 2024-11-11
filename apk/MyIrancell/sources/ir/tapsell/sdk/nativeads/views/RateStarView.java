package ir.tapsell.sdk.nativeads.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.utils.C2770l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class RateStarView extends View implements NoProguard {
    private static final String INSTANCE_EMPTY_COLOR = "empty_color";
    private static final String INSTANCE_FULL_COLOR = "full_color";
    private static final String INSTANCE_MAX = "max";
    private static final String INSTANCE_RATE = "rate";
    private static final String INSTANCE_STARS = "stars";
    private static final String INSTANCE_STATE = "super_instance_state";
    private static final String INSTANCE_STROKE_COLOR = "stroke_color";
    private static final String INSTANCE_STROKE_ENABLED = "stroke_enabled";
    private static final String INSTANCE_STROKE_WIDTH = "stroke_width";
    private static final int defaultWidthDp = 150;
    private Bitmap cache;
    private Canvas cacheCanvas;
    private int emptyColor;
    private Paint emptyPaint;
    private int fullColor;
    private Paint fullPaint;
    private Bitmap mask;
    private Canvas maskCanvas;
    private Paint maskPaint;
    private float max;
    private float rate;
    private int stars;
    private Path starsPath;
    private int strokeColor;
    private boolean strokeEnabled;
    private Paint strokePaint;
    private int strokeWidthDpi;
    private Rect viewRect;
    private Paint whitePaint;

    public RateStarView(Context context) {
        super(context);
        this.emptyColor = Color.rgb(100, 100, 100);
        this.fullColor = Color.rgb(255, 215, 0);
        this.strokeColor = -16777216;
        this.strokeEnabled = true;
        this.strokeWidthDpi = 1;
        this.stars = 5;
        this.max = 5.0f;
        this.rate = 2.6f;
        initialize(context, null, 0, 0);
    }

    public RateStarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.emptyColor = Color.rgb(100, 100, 100);
        this.fullColor = Color.rgb(255, 215, 0);
        this.strokeColor = -16777216;
        this.strokeEnabled = true;
        this.strokeWidthDpi = 1;
        this.stars = 5;
        this.max = 5.0f;
        this.rate = 2.6f;
        initialize(context, attributeSet, 0, 0);
    }

    public RateStarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.emptyColor = Color.rgb(100, 100, 100);
        this.fullColor = Color.rgb(255, 215, 0);
        this.strokeColor = -16777216;
        this.strokeEnabled = true;
        this.strokeWidthDpi = 1;
        this.stars = 5;
        this.max = 5.0f;
        this.rate = 2.6f;
        initialize(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public RateStarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.emptyColor = Color.rgb(100, 100, 100);
        this.fullColor = Color.rgb(255, 215, 0);
        this.strokeColor = -16777216;
        this.strokeEnabled = true;
        this.strokeWidthDpi = 1;
        this.stars = 5;
        this.max = 5.0f;
        this.rate = 2.6f;
        initialize(context, attributeSet, i, i2);
    }

    private Path createStarBySize(float f, int i, float f2) {
        float f3 = f2;
        float f4 = (f - (f3 * 2.0f)) / 2.0f;
        float f5 = 1.0f * f4;
        float f6 = f4 / 2.0f;
        float radians = (float) Math.toRadians(360.0f / i);
        float f7 = radians / 2.0f;
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        ArrayList arrayList = new ArrayList();
        double d = -1.5707964f;
        while (d < 4.712389f) {
            double d2 = f3 + f4;
            double d3 = f5;
            double cos = Math.cos(d);
            Double.isNaN(d3);
            Double.isNaN(d2);
            float f8 = f4;
            float f9 = f5;
            float f10 = (float) (d2 + (cos * d3));
            double sin = Math.sin(d);
            Double.isNaN(d3);
            Double.isNaN(d2);
            arrayList.add(new PointF(f10, (float) ((d3 * sin) + d2)));
            double d4 = f6;
            double d5 = f7;
            Double.isNaN(d5);
            double d6 = d5 + d;
            double cos2 = Math.cos(d6);
            Double.isNaN(d4);
            Double.isNaN(d2);
            double sin2 = Math.sin(d6);
            Double.isNaN(d4);
            Double.isNaN(d2);
            arrayList.add(new PointF((float) (d2 + (cos2 * d4)), (float) (d2 + (d4 * sin2))));
            double d7 = radians;
            Double.isNaN(d7);
            d += d7;
            f4 = f8;
            f7 = f7;
            f3 = f2;
            f6 = f6;
            f5 = f9;
        }
        path.moveTo(f3 + f4, f3);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            path.lineTo(((PointF) arrayList.get(i2)).x, ((PointF) arrayList.get(i2)).y);
        }
        path.close();
        return path;
    }

    private void initPaints() {
        Paint paint = new Paint(1);
        this.emptyPaint = paint;
        paint.setColor(this.emptyColor);
        Paint paint2 = new Paint(1);
        this.maskPaint = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = new Paint(1);
        this.whitePaint = paint3;
        paint3.setColor(-1);
        Paint paint4 = new Paint(1);
        this.fullPaint = paint4;
        paint4.setColor(this.fullColor);
        Paint paint5 = new Paint(1);
        this.strokePaint = paint5;
        paint5.setColor(this.strokeColor);
        this.strokePaint.setStyle(Paint.Style.STROKE);
        this.strokePaint.setStrokeJoin(Paint.Join.ROUND);
        this.strokePaint.setStrokeWidth(C2770l.m13173a(getResources(), this.strokeWidthDpi));
    }

    private void initStarsPath() {
        this.starsPath = new Path();
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / this.stars;
        Path createStarBySize = createStarBySize(width, 5, (!this.strokeEnabled || this.strokeWidthDpi == 0) ? 0.0f : C2770l.m13173a(getResources(), this.strokeWidthDpi));
        for (int i = 0; i < this.stars; i++) {
            this.starsPath.addPath(createStarBySize, i * width, 0.0f);
        }
    }

    private void initialize(Context context, AttributeSet attributeSet, int i, int i2) {
        initPaints();
    }

    private void onFirstDraw() {
        this.viewRect = new Rect(0, 0, getWidth(), getHeight());
        this.mask = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
        this.maskCanvas = new Canvas(this.mask);
        this.cache = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
        this.cacheCanvas = new Canvas(this.cache);
    }

    public int getEmptyColor() {
        return this.emptyColor;
    }

    public int getFullColor() {
        return this.fullColor;
    }

    public float getMax() {
        return this.max;
    }

    public float getRate() {
        return this.rate;
    }

    public int getStars() {
        return this.stars;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public int getStrokeWidthDpi() {
        return this.strokeWidthDpi;
    }

    public boolean isStrokeEnabled() {
        return this.strokeEnabled;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.viewRect == null) {
            onFirstDraw();
        }
        if (this.starsPath == null) {
            initStarsPath();
        }
        this.maskCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.maskCanvas.save();
        this.maskCanvas.translate(getPaddingLeft(), getPaddingTop());
        this.maskCanvas.drawPath(this.starsPath, this.whitePaint);
        this.maskCanvas.restore();
        this.cache.eraseColor(0);
        this.cacheCanvas.setBitmap(this.cache);
        this.cacheCanvas.drawRect(this.viewRect, this.emptyPaint);
        this.cacheCanvas.drawRect(0.0f, 0.0f, getPaddingLeft() + ((this.rate * ((getWidth() - getPaddingRight()) - getPaddingLeft())) / this.max), getHeight(), this.fullPaint);
        this.cacheCanvas.drawBitmap(this.mask, (Rect) null, this.viewRect, this.maskPaint);
        canvas.drawBitmap(this.cache, 0.0f, 0.0f, this.whitePaint);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        if (this.strokeEnabled) {
            canvas.drawPath(this.starsPath, this.strokePaint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (getLayoutParams().width == -2) {
            size = (int) C2770l.m13173a(getResources(), 150.0f);
        }
        if (this.stars <= 0) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) ((((size - getPaddingLeft()) - getPaddingRight()) / this.stars) + getPaddingTop() + getPaddingBottom()), 1073741824));
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.emptyColor = bundle.getInt(INSTANCE_EMPTY_COLOR);
        this.fullColor = bundle.getInt(INSTANCE_FULL_COLOR);
        this.strokeColor = bundle.getInt(INSTANCE_STROKE_COLOR);
        this.strokeWidthDpi = bundle.getInt(INSTANCE_STROKE_WIDTH);
        this.strokeEnabled = bundle.getBoolean(INSTANCE_STROKE_ENABLED);
        this.stars = bundle.getInt(INSTANCE_STARS);
        this.rate = bundle.getFloat(INSTANCE_RATE);
        this.max = bundle.getFloat(INSTANCE_MAX);
        super.onRestoreInstanceState(bundle.getParcelable(INSTANCE_STATE));
        initPaints();
        this.starsPath = null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(INSTANCE_STATE, super.onSaveInstanceState());
        bundle.putInt(INSTANCE_EMPTY_COLOR, getEmptyColor());
        bundle.putInt(INSTANCE_FULL_COLOR, getFullColor());
        bundle.putInt(INSTANCE_STROKE_COLOR, getStrokeColor());
        bundle.putBoolean(INSTANCE_STROKE_ENABLED, isStrokeEnabled());
        bundle.putInt(INSTANCE_STROKE_WIDTH, getStrokeWidthDpi());
        bundle.putInt(INSTANCE_STARS, getStars());
        bundle.putFloat(INSTANCE_RATE, getRate());
        bundle.putFloat(INSTANCE_MAX, getMax());
        return bundle;
    }

    public void setEmptyColor(int i) {
        if (this.emptyPaint == null) {
            this.emptyPaint = new Paint(1);
        }
        this.emptyColor = i;
        this.emptyPaint.setColor(i);
        invalidate();
    }

    public void setFullColor(int i) {
        this.fullColor = i;
        if (this.fullPaint == null) {
            this.fullPaint = new Paint(1);
        }
        this.fullPaint.setColor(i);
        invalidate();
    }

    public void setMax(float f) {
        this.max = f;
        invalidate();
    }

    public void setRate(float f) {
        this.rate = f;
        invalidate();
    }

    public void setStars(int i) {
        this.stars = i;
        this.starsPath = null;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.strokeColor = i;
        if (this.strokePaint == null) {
            this.strokePaint = new Paint(1);
        }
        this.strokePaint.setColor(i);
        invalidate();
    }

    public void setStrokeEnabled(boolean z) {
        this.strokeEnabled = z;
        this.starsPath = null;
        invalidate();
    }

    public void setStrokeWidthDpi(int i) {
        this.strokeWidthDpi = i;
        if (this.strokePaint == null) {
            this.strokePaint = new Paint(1);
        }
        this.strokePaint.setStrokeWidth(C2770l.m13173a(getResources(), i));
        this.starsPath = null;
        invalidate();
    }
}
