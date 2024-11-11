package p000;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: u */
/* loaded from: classes.dex */
public class C3281u extends FrameLayout {

    /* renamed from: f */
    private static final InterfaceC3506z f13372f;

    /* renamed from: b */
    private boolean f13373b;

    /* renamed from: c */
    private boolean f13374c;

    /* renamed from: d */
    final Rect f13375d;

    /* renamed from: e */
    private final InterfaceC3457y f13376e;

    static {
        int i = Build.VERSION.SDK_INT;
        f13372f = i >= 21 ? new C3378w() : i >= 17 ? new C3325v() : new C3417x();
        f13372f.mo15885a();
    }

    public ColorStateList getCardBackgroundColor() {
        return f13372f.mo16073b(this.f13376e);
    }

    public float getCardElevation() {
        return f13372f.mo16075c(this.f13376e);
    }

    public int getContentPaddingBottom() {
        return this.f13375d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f13375d.left;
    }

    public int getContentPaddingRight() {
        return this.f13375d.right;
    }

    public int getContentPaddingTop() {
        return this.f13375d.top;
    }

    public float getMaxCardElevation() {
        return f13372f.mo16070a(this.f13376e);
    }

    public boolean getPreventCornerOverlap() {
        return this.f13374c;
    }

    public float getRadius() {
        return f13372f.mo16077d(this.f13376e);
    }

    public boolean getUseCompatPadding() {
        return this.f13373b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(f13372f instanceof C3378w)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f13372f.mo16079f(this.f13376e)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f13372f.mo16078e(this.f13376e)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f13372f.mo16072a(this.f13376e, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f13372f.mo16072a(this.f13376e, colorStateList);
    }

    public void setCardElevation(float f) {
        f13372f.mo16074b(this.f13376e, f);
    }

    public void setMaxCardElevation(float f) {
        f13372f.mo16076c(this.f13376e, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f13374c) {
            this.f13374c = z;
            f13372f.mo16081h(this.f13376e);
        }
    }

    public void setRadius(float f) {
        f13372f.mo16071a(this.f13376e, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f13373b != z) {
            this.f13373b = z;
            f13372f.mo16080g(this.f13376e);
        }
    }
}
