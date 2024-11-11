package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: b0 */
/* loaded from: classes.dex */
class C0443b0 extends Drawable {

    /* renamed from: q */
    private static final double f2678q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static a f2679r;

    /* renamed from: a */
    private final int f2680a;

    /* renamed from: b */
    private Paint f2681b;

    /* renamed from: c */
    private Paint f2682c;

    /* renamed from: d */
    private Paint f2683d;

    /* renamed from: e */
    private final RectF f2684e;

    /* renamed from: f */
    private float f2685f;

    /* renamed from: g */
    private Path f2686g;

    /* renamed from: h */
    private float f2687h;

    /* renamed from: i */
    private float f2688i;

    /* renamed from: j */
    private float f2689j;

    /* renamed from: k */
    private ColorStateList f2690k;

    /* renamed from: l */
    private boolean f2691l;

    /* renamed from: m */
    private final int f2692m;

    /* renamed from: n */
    private final int f2693n;

    /* renamed from: o */
    private boolean f2694o;

    /* renamed from: p */
    private boolean f2695p;

    /* renamed from: b0$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo3258a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m3238a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = f;
        double d2 = 1.0d - f2678q;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* renamed from: a */
    private void m3239a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        float m3244d = m3244d(f);
        float m3244d2 = m3244d(f2);
        if (m3244d > m3244d2) {
            if (!this.f2695p) {
                this.f2695p = true;
            }
            m3244d = m3244d2;
        }
        if (this.f2689j == m3244d && this.f2687h == m3244d2) {
            return;
        }
        this.f2689j = m3244d;
        this.f2687h = m3244d2;
        this.f2688i = (int) ((m3244d * 1.5f) + this.f2680a + 0.5f);
        this.f2691l = true;
        invalidateSelf();
    }

    /* renamed from: a */
    private void m3240a(Canvas canvas) {
        float f = this.f2685f;
        float f2 = (-f) - this.f2688i;
        float f3 = f + this.f2680a + (this.f2689j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f2684e.width() - f4 > 0.0f;
        boolean z2 = this.f2684e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f2684e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f2686g, this.f2682c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2684e.width() - f4, -this.f2685f, this.f2683d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f2684e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2686g, this.f2682c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2684e.width() - f4, (-this.f2685f) + this.f2688i, this.f2683d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f2684e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2686g, this.f2682c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2684e.height() - f4, -this.f2685f, this.f2683d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f2684e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2686g, this.f2682c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2684e.height() - f4, -this.f2685f, this.f2683d);
        }
        canvas.restoreToCount(save4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m3241b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = f3;
        double d2 = 1.0d - f2678q;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* renamed from: b */
    private void m3242b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2690k = colorStateList;
        this.f2681b.setColor(colorStateList.getColorForState(getState(), this.f2690k.getDefaultColor()));
    }

    /* renamed from: b */
    private void m3243b(Rect rect) {
        float f = this.f2687h;
        float f2 = 1.5f * f;
        this.f2684e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        m3245g();
    }

    /* renamed from: d */
    private int m3244d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m3245g() {
        float f = this.f2685f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f2688i;
        rectF2.inset(-f2, -f2);
        Path path = this.f2686g;
        if (path == null) {
            this.f2686g = new Path();
        } else {
            path.reset();
        }
        this.f2686g.setFillType(Path.FillType.EVEN_ODD);
        this.f2686g.moveTo(-this.f2685f, 0.0f);
        this.f2686g.rLineTo(-this.f2688i, 0.0f);
        this.f2686g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f2686g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f2686g.close();
        float f3 = this.f2685f;
        float f4 = f3 / (this.f2688i + f3);
        Paint paint = this.f2682c;
        float f5 = this.f2685f + this.f2688i;
        int i = this.f2692m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f2693n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f2683d;
        float f6 = this.f2685f;
        float f7 = this.f2688i;
        int i2 = this.f2692m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f2693n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f2683d.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList m3246a() {
        return this.f2690k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3247a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f2685f == f2) {
            return;
        }
        this.f2685f = f2;
        this.f2691l = true;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3248a(ColorStateList colorStateList) {
        m3242b(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3249a(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3250a(boolean z) {
        this.f2694o = z;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m3251b() {
        return this.f2685f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3252b(float f) {
        m3239a(this.f2689j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m3253c() {
        return this.f2687h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m3254c(float f) {
        m3239a(f, this.f2687h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m3255d() {
        float f = this.f2687h;
        return (Math.max(f, this.f2685f + this.f2680a + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f2687h * 1.5f) + this.f2680a) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f2691l) {
            m3243b(getBounds());
            this.f2691l = false;
        }
        canvas.translate(0.0f, this.f2689j / 2.0f);
        m3240a(canvas);
        canvas.translate(0.0f, (-this.f2689j) / 2.0f);
        f2679r.mo3258a(canvas, this.f2684e, this.f2685f, this.f2681b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m3256e() {
        float f = this.f2687h;
        return (Math.max(f, this.f2685f + this.f2680a + (f / 2.0f)) * 2.0f) + ((this.f2687h + this.f2680a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m3257f() {
        return this.f2689j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m3241b(this.f2687h, this.f2685f, this.f2694o));
        int ceil2 = (int) Math.ceil(m3238a(this.f2687h, this.f2685f, this.f2694o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f2690k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2691l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2690k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2681b.getColor() == colorForState) {
            return false;
        }
        this.f2681b.setColor(colorForState);
        this.f2691l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2681b.setAlpha(i);
        this.f2682c.setAlpha(i);
        this.f2683d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2681b.setColorFilter(colorFilter);
    }
}
