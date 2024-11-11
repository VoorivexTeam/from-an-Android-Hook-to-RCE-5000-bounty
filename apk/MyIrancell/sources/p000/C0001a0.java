package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a0 */
/* loaded from: classes.dex */
class C0001a0 extends Drawable {

    /* renamed from: a */
    private float f5a;

    /* renamed from: b */
    private final Paint f6b;

    /* renamed from: c */
    private final RectF f7c;

    /* renamed from: d */
    private final Rect f8d;

    /* renamed from: e */
    private float f9e;

    /* renamed from: f */
    private boolean f10f;

    /* renamed from: g */
    private boolean f11g;

    /* renamed from: h */
    private ColorStateList f12h;

    /* renamed from: i */
    private PorterDuffColorFilter f13i;

    /* renamed from: j */
    private ColorStateList f14j;

    /* renamed from: k */
    private PorterDuff.Mode f15k;

    /* renamed from: a */
    private PorterDuffColorFilter m7a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    private void m8a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f7c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f8d.set(rect);
        if (this.f10f) {
            this.f8d.inset((int) Math.ceil(C0443b0.m3238a(this.f9e, this.f5a, this.f11g)), (int) Math.ceil(C0443b0.m3241b(this.f9e, this.f5a, this.f11g)));
            this.f7c.set(this.f8d);
        }
    }

    /* renamed from: b */
    private void m9b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f12h = colorStateList;
        this.f6b.setColor(colorStateList.getColorForState(getState(), this.f12h.getDefaultColor()));
    }

    /* renamed from: a */
    public ColorStateList m10a() {
        return this.f12h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11a(float f) {
        if (f == this.f5a) {
            return;
        }
        this.f5a = f;
        m8a((Rect) null);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12a(float f, boolean z, boolean z2) {
        if (f == this.f9e && this.f10f == z && this.f11g == z2) {
            return;
        }
        this.f9e = f;
        this.f10f = z;
        this.f11g = z2;
        m8a((Rect) null);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m13a(ColorStateList colorStateList) {
        m9b(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m14b() {
        return this.f9e;
    }

    /* renamed from: c */
    public float m15c() {
        return this.f5a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f6b;
        if (this.f13i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f13i);
            z = true;
        }
        RectF rectF = this.f7c;
        float f = this.f5a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f8d, this.f5a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f14j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f12h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m8a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f12h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f6b.getColor();
        if (z) {
            this.f6b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f14j;
        if (colorStateList2 == null || (mode = this.f15k) == null) {
            return z;
        }
        this.f13i = m7a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f14j = colorStateList;
        this.f13i = m7a(colorStateList, this.f15k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f15k = mode;
        this.f13i = m7a(this.f14j, mode);
        invalidateSelf();
    }
}
