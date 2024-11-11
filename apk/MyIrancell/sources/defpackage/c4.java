package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class c4 extends Drawable implements Animatable {
    private static final Interpolator h = new LinearInterpolator();
    private static final Interpolator i = new m3();
    private static final int[] j = {-16777216};
    private final c b;
    private float c;
    private Resources d;
    private Animator e;
    float f;
    boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            c4.this.a(floatValue, this.a);
            c4.this.a(floatValue, this.a, false);
            c4.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Animator.AnimatorListener {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            c4.this.a(1.0f, this.a, true);
            this.a.l();
            this.a.j();
            c4 c4Var = c4.this;
            if (!c4Var.g) {
                c4Var.f += 1.0f;
                return;
            }
            c4Var.g = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.a.a(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c4.this.f = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float q;
        int r;
        int s;
        int u;
        final RectF a = new RectF();
        final Paint b = new Paint();
        final Paint c = new Paint();
        final Paint d = new Paint();
        float e = 0.0f;
        float f = 0.0f;
        float g = 0.0f;
        float h = 5.0f;
        float p = 1.0f;
        int t = 255;

        c() {
            this.b.setStrokeCap(Paint.Cap.SQUARE);
            this.b.setAntiAlias(true);
            this.b.setStyle(Paint.Style.STROKE);
            this.c.setStyle(Paint.Style.FILL);
            this.c.setAntiAlias(true);
            this.d.setColor(0);
        }

        int a() {
            return this.t;
        }

        void a(float f) {
            if (f != this.p) {
                this.p = f;
            }
        }

        void a(float f, float f2) {
            this.r = (int) f;
            this.s = (int) f2;
        }

        void a(int i) {
            this.t = i;
        }

        void a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.r * this.p) / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.r * this.p, 0.0f);
                Path path3 = this.o;
                float f4 = this.r;
                float f5 = this.p;
                path3.lineTo((f4 * f5) / 2.0f, this.s * f5);
                this.o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.c);
                canvas.restore();
            }
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.a;
            float f = this.q;
            float f2 = (this.h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.e;
            float f4 = this.g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f + f4) * 360.0f) - f5;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f7 = this.h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.b);
            a(canvas, f5, f6, rectF);
        }

        void a(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        void a(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        void a(int[] iArr) {
            this.i = iArr;
            c(0);
        }

        float b() {
            return this.f;
        }

        void b(float f) {
            this.q = f;
        }

        void b(int i) {
            this.u = i;
        }

        int c() {
            return this.i[d()];
        }

        void c(float f) {
            this.f = f;
        }

        void c(int i) {
            this.j = i;
            this.u = this.i[i];
        }

        int d() {
            return (this.j + 1) % this.i.length;
        }

        void d(float f) {
            this.g = f;
        }

        float e() {
            return this.e;
        }

        void e(float f) {
            this.e = f;
        }

        int f() {
            return this.i[this.j];
        }

        void f(float f) {
            this.h = f;
            this.b.setStrokeWidth(f);
        }

        float g() {
            return this.l;
        }

        float h() {
            return this.m;
        }

        float i() {
            return this.k;
        }

        void j() {
            c(d());
        }

        void k() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            e(0.0f);
            c(0.0f);
            d(0.0f);
        }

        void l() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }
    }

    public c4(Context context) {
        x1.a(context);
        this.d = context.getResources();
        c cVar = new c();
        this.b = cVar;
        cVar.a(j);
        c(2.5f);
        a();
    }

    private int a(float f, int i2, int i3) {
        return ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r0) * f))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r1) * f))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r2) * f))) << 8) | ((i2 & 255) + ((int) (f * ((i3 & 255) - r8))));
    }

    private void a() {
        c cVar = this.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(h);
        ofFloat.addListener(new b(cVar));
        this.e = ofFloat;
    }

    private void a(float f, float f2, float f3, float f4) {
        c cVar = this.b;
        float f5 = this.d.getDisplayMetrics().density;
        cVar.f(f2 * f5);
        cVar.b(f * f5);
        cVar.c(0);
        cVar.a(f3 * f5, f4 * f5);
    }

    private void b(float f, c cVar) {
        a(f, cVar);
        float floor = (float) (Math.floor(cVar.h() / 0.8f) + 1.0d);
        cVar.e(cVar.i() + (((cVar.g() - 0.01f) - cVar.i()) * f));
        cVar.c(cVar.g());
        cVar.d(cVar.h() + ((floor - cVar.h()) * f));
    }

    private void d(float f) {
        this.c = f;
    }

    public void a(float f) {
        this.b.a(f);
        invalidateSelf();
    }

    public void a(float f, float f2) {
        this.b.e(f);
        this.b.c(f2);
        invalidateSelf();
    }

    void a(float f, c cVar) {
        cVar.b(f > 0.75f ? a((f - 0.75f) / 0.25f, cVar.f(), cVar.c()) : cVar.f());
    }

    void a(float f, c cVar, boolean z) {
        float interpolation;
        float f2;
        if (this.g) {
            b(f, cVar);
            return;
        }
        if (f != 1.0f || z) {
            float h2 = cVar.h();
            if (f < 0.5f) {
                interpolation = cVar.i();
                f2 = (i.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float i2 = cVar.i() + 0.79f;
                interpolation = i2 - (((1.0f - i.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = i2;
            }
            float f3 = h2 + (0.20999998f * f);
            float f4 = (f + this.f) * 216.0f;
            cVar.e(interpolation);
            cVar.c(f2);
            cVar.d(f3);
            d(f4);
        }
    }

    public void a(int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i2 == 0) {
            f = 11.0f;
            f2 = 3.0f;
            f3 = 12.0f;
            f4 = 6.0f;
        } else {
            f = 7.5f;
            f2 = 2.5f;
            f3 = 10.0f;
            f4 = 5.0f;
        }
        a(f, f2, f3, f4);
        invalidateSelf();
    }

    public void a(boolean z) {
        this.b.a(z);
        invalidateSelf();
    }

    public void a(int... iArr) {
        this.b.a(iArr);
        this.b.c(0);
        invalidateSelf();
    }

    public void b(float f) {
        this.b.d(f);
        invalidateSelf();
    }

    public void c(float f) {
        this.b.f(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.c, bounds.exactCenterX(), bounds.exactCenterY());
        this.b.a(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.b.a(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.a(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j2;
        this.e.cancel();
        this.b.l();
        if (this.b.b() != this.b.e()) {
            this.g = true;
            animator = this.e;
            j2 = 666;
        } else {
            this.b.c(0);
            this.b.k();
            animator = this.e;
            j2 = 1332;
        }
        animator.setDuration(j2);
        this.e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.e.cancel();
        d(0.0f);
        this.b.a(false);
        this.b.c(0);
        this.b.k();
        invalidateSelf();
    }
}
