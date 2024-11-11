package p000;

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
import androidx.core.graphics.drawable.C0239a;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.C2009h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: tt */
/* loaded from: classes.dex */
public class C3274tt {

    /* renamed from: w */
    private static final boolean f13341w;

    /* renamed from: a */
    private final C3178rt f13342a;

    /* renamed from: b */
    private int f13343b;

    /* renamed from: c */
    private int f13344c;

    /* renamed from: d */
    private int f13345d;

    /* renamed from: e */
    private int f13346e;

    /* renamed from: f */
    private int f13347f;

    /* renamed from: g */
    private int f13348g;

    /* renamed from: h */
    private PorterDuff.Mode f13349h;

    /* renamed from: i */
    private ColorStateList f13350i;

    /* renamed from: j */
    private ColorStateList f13351j;

    /* renamed from: k */
    private ColorStateList f13352k;

    /* renamed from: o */
    private GradientDrawable f13356o;

    /* renamed from: p */
    private Drawable f13357p;

    /* renamed from: q */
    private GradientDrawable f13358q;

    /* renamed from: r */
    private Drawable f13359r;

    /* renamed from: s */
    private GradientDrawable f13360s;

    /* renamed from: t */
    private GradientDrawable f13361t;

    /* renamed from: u */
    private GradientDrawable f13362u;

    /* renamed from: l */
    private final Paint f13353l = new Paint(1);

    /* renamed from: m */
    private final Rect f13354m = new Rect();

    /* renamed from: n */
    private final RectF f13355n = new RectF();

    /* renamed from: v */
    private boolean f13363v = false;

    static {
        f13341w = Build.VERSION.SDK_INT >= 21;
    }

    public C3274tt(C3178rt c3178rt) {
        this.f13342a = c3178rt;
    }

    /* renamed from: a */
    private InsetDrawable m15666a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f13343b, this.f13345d, this.f13344c, this.f13346e);
    }

    /* renamed from: i */
    private Drawable m15667i() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f13356o = gradientDrawable;
        gradientDrawable.setCornerRadius(this.f13347f + 1.0E-5f);
        this.f13356o.setColor(-1);
        Drawable m1495i = C0239a.m1495i(this.f13356o);
        this.f13357p = m1495i;
        C0239a.m1480a(m1495i, this.f13350i);
        PorterDuff.Mode mode = this.f13349h;
        if (mode != null) {
            C0239a.m1483a(this.f13357p, mode);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.f13358q = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.f13347f + 1.0E-5f);
        this.f13358q.setColor(-1);
        Drawable m1495i2 = C0239a.m1495i(this.f13358q);
        this.f13359r = m1495i2;
        C0239a.m1480a(m1495i2, this.f13352k);
        return m15666a(new LayerDrawable(new Drawable[]{this.f13357p, this.f13359r}));
    }

    @TargetApi(21)
    /* renamed from: j */
    private Drawable m15668j() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f13360s = gradientDrawable;
        gradientDrawable.setCornerRadius(this.f13347f + 1.0E-5f);
        this.f13360s.setColor(-1);
        m15672n();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.f13361t = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.f13347f + 1.0E-5f);
        this.f13361t.setColor(0);
        this.f13361t.setStroke(this.f13348g, this.f13351j);
        InsetDrawable m15666a = m15666a(new LayerDrawable(new Drawable[]{this.f13360s, this.f13361t}));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.f13362u = gradientDrawable3;
        gradientDrawable3.setCornerRadius(this.f13347f + 1.0E-5f);
        this.f13362u.setColor(-1);
        return new C3222st(C2445eu.m11636a(this.f13352k), m15666a, this.f13362u);
    }

    /* renamed from: k */
    private GradientDrawable m15669k() {
        if (!f13341w || this.f13342a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f13342a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    /* renamed from: l */
    private GradientDrawable m15670l() {
        if (!f13341w || this.f13342a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f13342a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    /* renamed from: m */
    private void m15671m() {
        if (f13341w && this.f13361t != null) {
            this.f13342a.setInternalBackground(m15668j());
        } else {
            if (f13341w) {
                return;
            }
            this.f13342a.invalidate();
        }
    }

    /* renamed from: n */
    private void m15672n() {
        GradientDrawable gradientDrawable = this.f13360s;
        if (gradientDrawable != null) {
            C0239a.m1480a(gradientDrawable, this.f13350i);
            PorterDuff.Mode mode = this.f13349h;
            if (mode != null) {
                C0239a.m1483a(this.f13360s, mode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m15673a() {
        return this.f13347f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15674a(int i) {
        GradientDrawable gradientDrawable;
        if ((!f13341w || (gradientDrawable = this.f13360s) == null) && (f13341w || (gradientDrawable = this.f13356o) == null)) {
            return;
        }
        gradientDrawable.setColor(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15675a(int i, int i2) {
        GradientDrawable gradientDrawable = this.f13362u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f13343b, this.f13345d, i2 - this.f13344c, i - this.f13346e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15676a(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f13352k != colorStateList) {
            this.f13352k = colorStateList;
            if (f13341w && (this.f13342a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f13342a.getBackground()).setColor(colorStateList);
            } else {
                if (f13341w || (drawable = this.f13359r) == null) {
                    return;
                }
                C0239a.m1480a(drawable, colorStateList);
            }
        }
    }

    /* renamed from: a */
    public void m15677a(TypedArray typedArray) {
        this.f13343b = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetLeft, 0);
        this.f13344c = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetRight, 0);
        this.f13345d = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetTop, 0);
        this.f13346e = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetBottom, 0);
        this.f13347f = typedArray.getDimensionPixelSize(R$styleable.MaterialButton_cornerRadius, 0);
        this.f13348g = typedArray.getDimensionPixelSize(R$styleable.MaterialButton_strokeWidth, 0);
        this.f13349h = C2009h.m10275a(typedArray.getInt(R$styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f13350i = C2402du.m11484a(this.f13342a.getContext(), typedArray, R$styleable.MaterialButton_backgroundTint);
        this.f13351j = C2402du.m11484a(this.f13342a.getContext(), typedArray, R$styleable.MaterialButton_strokeColor);
        this.f13352k = C2402du.m11484a(this.f13342a.getContext(), typedArray, R$styleable.MaterialButton_rippleColor);
        this.f13353l.setStyle(Paint.Style.STROKE);
        this.f13353l.setStrokeWidth(this.f13348g);
        Paint paint = this.f13353l;
        ColorStateList colorStateList = this.f13351j;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(this.f13342a.getDrawableState(), 0) : 0);
        int m14923o = C3107q2.m14923o(this.f13342a);
        int paddingTop = this.f13342a.getPaddingTop();
        int m14922n = C3107q2.m14922n(this.f13342a);
        int paddingBottom = this.f13342a.getPaddingBottom();
        this.f13342a.setInternalBackground(f13341w ? m15668j() : m15667i());
        C3107q2.m14887a(this.f13342a, m14923o + this.f13343b, paddingTop + this.f13345d, m14922n + this.f13344c, paddingBottom + this.f13346e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15678a(Canvas canvas) {
        if (canvas == null || this.f13351j == null || this.f13348g <= 0) {
            return;
        }
        this.f13354m.set(this.f13342a.getBackground().getBounds());
        RectF rectF = this.f13355n;
        float f = this.f13354m.left;
        int i = this.f13348g;
        rectF.set(f + (i / 2.0f) + this.f13343b, r1.top + (i / 2.0f) + this.f13345d, (r1.right - (i / 2.0f)) - this.f13344c, (r1.bottom - (i / 2.0f)) - this.f13346e);
        float f2 = this.f13347f - (this.f13348g / 2.0f);
        canvas.drawRoundRect(this.f13355n, f2, f2, this.f13353l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15679a(PorterDuff.Mode mode) {
        if (this.f13349h != mode) {
            this.f13349h = mode;
            if (f13341w) {
                m15672n();
                return;
            }
            Drawable drawable = this.f13357p;
            if (drawable == null || mode == null) {
                return;
            }
            C0239a.m1483a(drawable, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m15680b() {
        return this.f13352k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15681b(int i) {
        GradientDrawable gradientDrawable;
        if (this.f13347f != i) {
            this.f13347f = i;
            if (!f13341w || this.f13360s == null || this.f13361t == null || this.f13362u == null) {
                if (f13341w || (gradientDrawable = this.f13356o) == null || this.f13358q == null) {
                    return;
                }
                float f = i + 1.0E-5f;
                gradientDrawable.setCornerRadius(f);
                this.f13358q.setCornerRadius(f);
                this.f13342a.invalidate();
                return;
            }
            if (Build.VERSION.SDK_INT == 21) {
                float f2 = i + 1.0E-5f;
                m15669k().setCornerRadius(f2);
                m15670l().setCornerRadius(f2);
            }
            float f3 = i + 1.0E-5f;
            this.f13360s.setCornerRadius(f3);
            this.f13361t.setCornerRadius(f3);
            this.f13362u.setCornerRadius(f3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15682b(ColorStateList colorStateList) {
        if (this.f13351j != colorStateList) {
            this.f13351j = colorStateList;
            this.f13353l.setColor(colorStateList != null ? colorStateList.getColorForState(this.f13342a.getDrawableState(), 0) : 0);
            m15671m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m15683c() {
        return this.f13351j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m15684c(int i) {
        if (this.f13348g != i) {
            this.f13348g = i;
            this.f13353l.setStrokeWidth(i);
            m15671m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m15685c(ColorStateList colorStateList) {
        if (this.f13350i != colorStateList) {
            this.f13350i = colorStateList;
            if (f13341w) {
                m15672n();
                return;
            }
            Drawable drawable = this.f13357p;
            if (drawable != null) {
                C0239a.m1480a(drawable, colorStateList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m15686d() {
        return this.f13348g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public ColorStateList m15687e() {
        return this.f13350i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public PorterDuff.Mode m15688f() {
        return this.f13349h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m15689g() {
        return this.f13363v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m15690h() {
        this.f13363v = true;
        this.f13342a.setSupportBackgroundTintList(this.f13350i);
        this.f13342a.setSupportBackgroundTintMode(this.f13349h);
    }
}
