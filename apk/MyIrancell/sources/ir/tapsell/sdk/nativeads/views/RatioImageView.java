package ir.tapsell.sdk.nativeads.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.R$styleable;

/* loaded from: classes.dex */
public class RatioImageView extends ImageView implements NoProguard {
    private float aspectRatio;
    private RatioViewStyle mStyle;

    public RatioImageView(Context context) {
        this(context, null, 0);
    }

    public RatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aspectRatio = 0.5625f;
        this.mStyle = RatioViewStyle.FIXED_WIDTH;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RatioImageView, 0, 0);
            try {
                this.mStyle = RatioViewStyle.fromId(obtainStyledAttributes.getInt(R$styleable.RatioImageView_aspect_style, 0));
                this.aspectRatio = obtainStyledAttributes.getFloat(R$styleable.RatioImageView_aspect_ratio, 0.5625f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
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
