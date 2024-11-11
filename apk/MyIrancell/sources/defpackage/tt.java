package defpackage;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class tt {
    private static final boolean w;
    private final rt a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private PorterDuff.Mode h;
    private ColorStateList i;
    private ColorStateList j;
    private ColorStateList k;
    private GradientDrawable o;
    private Drawable p;
    private GradientDrawable q;
    private Drawable r;
    private GradientDrawable s;
    private GradientDrawable t;
    private GradientDrawable u;
    private final Paint l = new Paint(1);
    private final Rect m = new Rect();
    private final RectF n = new RectF();
    private boolean v = false;

    static {
        w = Build.VERSION.SDK_INT >= 21;
    }

    public tt(rt rtVar) {
        this.a = rtVar;
    }

    private InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.b, this.d, this.c, this.e);
    }

    private Drawable i() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.o = gradientDrawable;
        gradientDrawable.setCornerRadius(this.f + 1.0E-5f);
        this.o.setColor(-1);
        Drawable i = a.i(this.o);
        this.p = i;
        a.a(i, this.i);
        PorterDuff.Mode mode = this.h;
        if (mode != null) {
            a.a(this.p, mode);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.q = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.f + 1.0E-5f);
        this.q.setColor(-1);
        Drawable i2 = a.i(this.q);
        this.r = i2;
        a.a(i2, this.k);
        return a(new LayerDrawable(new Drawable[]{this.p, this.r}));
    }

    @TargetApi(21)
    private Drawable j() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.s = gradientDrawable;
        gradientDrawable.setCornerRadius(this.f + 1.0E-5f);
        this.s.setColor(-1);
        n();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.t = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.f + 1.0E-5f);
        this.t.setColor(0);
        this.t.setStroke(this.g, this.j);
        InsetDrawable a = a(new LayerDrawable(new Drawable[]{this.s, this.t}));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.u = gradientDrawable3;
        gradientDrawable3.setCornerRadius(this.f + 1.0E-5f);
        this.u.setColor(-1);
        return new st(eu.a(this.k), a, this.u);
    }

    private GradientDrawable k() {
        if (!w || this.a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    private GradientDrawable l() {
        if (!w || this.a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    private void m() {
        if (w && this.t != null) {
            this.a.setInternalBackground(j());
        } else {
            if (w) {
                return;
            }
            this.a.invalidate();
        }
    }

    private void n() {
        GradientDrawable gradientDrawable = this.s;
        if (gradientDrawable != null) {
            a.a(gradientDrawable, this.i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                a.a(this.s, mode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        GradientDrawable gradientDrawable;
        if ((!w || (gradientDrawable = this.s) == null) && (w || (gradientDrawable = this.o) == null)) {
            return;
        }
        gradientDrawable.setColor(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        GradientDrawable gradientDrawable = this.u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.b, this.d, i2 - this.c, i - this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.k != colorStateList) {
            this.k = colorStateList;
            if (w && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(colorStateList);
            } else {
                if (w || (drawable = this.r) == null) {
                    return;
                }
                a.a(drawable, colorStateList);
            }
        }
    }

    public void a(TypedArray typedArray) {
        this.b = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetLeft, 0);
        this.c = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetRight, 0);
        this.d = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetTop, 0);
        this.e = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetBottom, 0);
        this.f = typedArray.getDimensionPixelSize(R$styleable.MaterialButton_cornerRadius, 0);
        this.g = typedArray.getDimensionPixelSize(R$styleable.MaterialButton_strokeWidth, 0);
        this.h = h.a(typedArray.getInt(R$styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.i = du.a(this.a.getContext(), typedArray, R$styleable.MaterialButton_backgroundTint);
        this.j = du.a(this.a.getContext(), typedArray, R$styleable.MaterialButton_strokeColor);
        this.k = du.a(this.a.getContext(), typedArray, R$styleable.MaterialButton_rippleColor);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth(this.g);
        Paint paint = this.l;
        ColorStateList colorStateList = this.j;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(this.a.getDrawableState(), 0) : 0);
        int o = q2.o(this.a);
        int paddingTop = this.a.getPaddingTop();
        int n = q2.n(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        this.a.setInternalBackground(w ? j() : i());
        q2.a(this.a, o + this.b, paddingTop + this.d, n + this.c, paddingBottom + this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        if (canvas == null || this.j == null || this.g <= 0) {
            return;
        }
        this.m.set(this.a.getBackground().getBounds());
        RectF rectF = this.n;
        float f = this.m.left;
        int i = this.g;
        rectF.set(f + (i / 2.0f) + this.b, r1.top + (i / 2.0f) + this.d, (r1.right - (i / 2.0f)) - this.c, (r1.bottom - (i / 2.0f)) - this.e);
        float f2 = this.f - (this.g / 2.0f);
        canvas.drawRoundRect(this.n, f2, f2, this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            if (w) {
                n();
                return;
            }
            Drawable drawable = this.p;
            if (drawable == null || mode == null) {
                return;
            }
            a.a(drawable, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        GradientDrawable gradientDrawable;
        if (this.f != i) {
            this.f = i;
            if (!w || this.s == null || this.t == null || this.u == null) {
                if (w || (gradientDrawable = this.o) == null || this.q == null) {
                    return;
                }
                float f = i + 1.0E-5f;
                gradientDrawable.setCornerRadius(f);
                this.q.setCornerRadius(f);
                this.a.invalidate();
                return;
            }
            if (Build.VERSION.SDK_INT == 21) {
                float f2 = i + 1.0E-5f;
                k().setCornerRadius(f2);
                l().setCornerRadius(f2);
            }
            float f3 = i + 1.0E-5f;
            this.s.setCornerRadius(f3);
            this.t.setCornerRadius(f3);
            this.u.setCornerRadius(f3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            this.l.setColor(colorStateList != null ? colorStateList.getColorForState(this.a.getDrawableState(), 0) : 0);
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        if (this.g != i) {
            this.g = i;
            this.l.setStrokeWidth(i);
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            if (w) {
                n();
                return;
            }
            Drawable drawable = this.p;
            if (drawable != null) {
                a.a(drawable, colorStateList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList e() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode f() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.v = true;
        this.a.setSupportBackgroundTintList(this.i);
        this.a.setSupportBackgroundTintMode(this.h);
    }
}
