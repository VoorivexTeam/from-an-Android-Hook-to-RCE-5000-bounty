package ir.tapsell.sdk.nativeads.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.R$styleable;

/* loaded from: classes.dex */
public class RatioFrameLayout extends FrameLayout implements NoProguard {
    private float aspectRatio;
    private RatioViewStyle mStyle;

    public RatioFrameLayout(Context context) {
        this(context, null, 0);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aspectRatio = 0.5625f;
        RatioViewStyle ratioViewStyle = RatioViewStyle.FIXED_WIDTH;
        this.mStyle = ratioViewStyle;
        if (attributeSet == null) {
            this.mStyle = ratioViewStyle;
            this.aspectRatio = 0.5625f;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RatioFrameLayout, 0, 0);
        try {
            this.mStyle = RatioViewStyle.fromId(obtainStyledAttributes.getInt(R$styleable.RatioFrameLayout_aspect_style, 0));
            this.aspectRatio = obtainStyledAttributes.getFloat(R$styleable.RatioFrameLayout_aspect_ratio, 0.5625f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mStyle != RatioViewStyle.FIXED_WIDTH) {
            int size = View.MeasureSpec.getSize(i2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.round(size / this.aspectRatio), 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            int size2 = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(this.aspectRatio * size2), 1073741824));
        }
    }

    public void setAspectRatio(RatioViewStyle ratioViewStyle, float f) {
        this.aspectRatio = f;
        this.mStyle = ratioViewStyle;
        requestLayout();
    }
}
