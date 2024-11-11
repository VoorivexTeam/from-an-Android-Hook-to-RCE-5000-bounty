package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0170f0;
import com.google.android.material.R$styleable;

/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes.dex */
public class C2006e extends C0170f0 {

    /* renamed from: q */
    private Drawable f8541q;

    /* renamed from: r */
    private final Rect f8542r;

    /* renamed from: s */
    private final Rect f8543s;

    /* renamed from: t */
    private int f8544t;

    /* renamed from: u */
    protected boolean f8545u;

    /* renamed from: v */
    boolean f8546v;

    public C2006e(Context context) {
        this(context, null);
    }

    public C2006e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2006e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8542r = new Rect();
        this.f8543s = new Rect();
        this.f8544t = 119;
        this.f8545u = true;
        this.f8546v = false;
        TypedArray m10273c = C2008g.m10273c(context, attributeSet, R$styleable.ForegroundLinearLayout, i, 0, new int[0]);
        this.f8544t = m10273c.getInt(R$styleable.ForegroundLinearLayout_android_foregroundGravity, this.f8544t);
        Drawable drawable = m10273c.getDrawable(R$styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f8545u = m10273c.getBoolean(R$styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        m10273c.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f8541q;
        if (drawable != null) {
            if (this.f8546v) {
                this.f8546v = false;
                Rect rect = this.f8542r;
                Rect rect2 = this.f8543s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f8545u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f8544t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f8541q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8541q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f8541q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f8541q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f8544t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8541q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0170f0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f8546v = z | this.f8546v;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8546v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f8541q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f8541q);
            }
            this.f8541q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8544t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f8544t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f8544t = i;
            if (i == 119 && this.f8541q != null) {
                this.f8541q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8541q;
    }
}
