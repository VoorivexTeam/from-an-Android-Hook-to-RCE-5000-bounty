package p000;

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

/* renamed from: c4 */
/* loaded from: classes.dex */
public class C0504c4 extends Drawable implements Animatable {

    /* renamed from: h */
    private static final Interpolator f2908h = new LinearInterpolator();

    /* renamed from: i */
    private static final Interpolator f2909i = new C2920m3();

    /* renamed from: j */
    private static final int[] f2910j = {-16777216};

    /* renamed from: b */
    private final c f2911b;

    /* renamed from: c */
    private float f2912c;

    /* renamed from: d */
    private Resources f2913d;

    /* renamed from: e */
    private Animator f2914e;

    /* renamed from: f */
    float f2915f;

    /* renamed from: g */
    boolean f2916g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c4$a */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ c f2917a;

        a(c cVar) {
            this.f2917a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0504c4.this.m3557a(floatValue, this.f2917a);
            C0504c4.this.m3558a(floatValue, this.f2917a, false);
            C0504c4.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c4$b */
    /* loaded from: classes.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ c f2919a;

        b(c cVar) {
            this.f2919a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C0504c4.this.m3558a(1.0f, this.f2919a, true);
            this.f2919a.m3590l();
            this.f2919a.m3588j();
            C0504c4 c0504c4 = C0504c4.this;
            if (!c0504c4.f2916g) {
                c0504c4.f2915f += 1.0f;
                return;
            }
            c0504c4.f2916g = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f2919a.m3571a(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0504c4.this.f2915f = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c4$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: i */
        int[] f2929i;

        /* renamed from: j */
        int f2930j;

        /* renamed from: k */
        float f2931k;

        /* renamed from: l */
        float f2932l;

        /* renamed from: m */
        float f2933m;

        /* renamed from: n */
        boolean f2934n;

        /* renamed from: o */
        Path f2935o;

        /* renamed from: q */
        float f2937q;

        /* renamed from: r */
        int f2938r;

        /* renamed from: s */
        int f2939s;

        /* renamed from: u */
        int f2941u;

        /* renamed from: a */
        final RectF f2921a = new RectF();

        /* renamed from: b */
        final Paint f2922b = new Paint();

        /* renamed from: c */
        final Paint f2923c = new Paint();

        /* renamed from: d */
        final Paint f2924d = new Paint();

        /* renamed from: e */
        float f2925e = 0.0f;

        /* renamed from: f */
        float f2926f = 0.0f;

        /* renamed from: g */
        float f2927g = 0.0f;

        /* renamed from: h */
        float f2928h = 5.0f;

        /* renamed from: p */
        float f2936p = 1.0f;

        /* renamed from: t */
        int f2940t = 255;

        c() {
            this.f2922b.setStrokeCap(Paint.Cap.SQUARE);
            this.f2922b.setAntiAlias(true);
            this.f2922b.setStyle(Paint.Style.STROKE);
            this.f2923c.setStyle(Paint.Style.FILL);
            this.f2923c.setAntiAlias(true);
            this.f2924d.setColor(0);
        }

        /* renamed from: a */
        int m3564a() {
            return this.f2940t;
        }

        /* renamed from: a */
        void m3565a(float f) {
            if (f != this.f2936p) {
                this.f2936p = f;
            }
        }

        /* renamed from: a */
        void m3566a(float f, float f2) {
            this.f2938r = (int) f;
            this.f2939s = (int) f2;
        }

        /* renamed from: a */
        void m3567a(int i) {
            this.f2940t = i;
        }

        /* renamed from: a */
        void m3568a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f2934n) {
                Path path = this.f2935o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f2935o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.f2938r * this.f2936p) / 2.0f;
                this.f2935o.moveTo(0.0f, 0.0f);
                this.f2935o.lineTo(this.f2938r * this.f2936p, 0.0f);
                Path path3 = this.f2935o;
                float f4 = this.f2938r;
                float f5 = this.f2936p;
                path3.lineTo((f4 * f5) / 2.0f, this.f2939s * f5);
                this.f2935o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f2928h / 2.0f));
                this.f2935o.close();
                this.f2923c.setColor(this.f2941u);
                this.f2923c.setAlpha(this.f2940t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f2935o, this.f2923c);
                canvas.restore();
            }
        }

        /* renamed from: a */
        void m3569a(Canvas canvas, Rect rect) {
            RectF rectF = this.f2921a;
            float f = this.f2937q;
            float f2 = (this.f2928h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f2938r * this.f2936p) / 2.0f, this.f2928h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f2925e;
            float f4 = this.f2927g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f2926f + f4) * 360.0f) - f5;
            this.f2922b.setColor(this.f2941u);
            this.f2922b.setAlpha(this.f2940t);
            float f7 = this.f2928h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f2924d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f2922b);
            m3568a(canvas, f5, f6, rectF);
        }

        /* renamed from: a */
        void m3570a(ColorFilter colorFilter) {
            this.f2922b.setColorFilter(colorFilter);
        }

        /* renamed from: a */
        void m3571a(boolean z) {
            if (this.f2934n != z) {
                this.f2934n = z;
            }
        }

        /* renamed from: a */
        void m3572a(int[] iArr) {
            this.f2929i = iArr;
            m3578c(0);
        }

        /* renamed from: b */
        float m3573b() {
            return this.f2926f;
        }

        /* renamed from: b */
        void m3574b(float f) {
            this.f2937q = f;
        }

        /* renamed from: b */
        void m3575b(int i) {
            this.f2941u = i;
        }

        /* renamed from: c */
        int m3576c() {
            return this.f2929i[m3579d()];
        }

        /* renamed from: c */
        void m3577c(float f) {
            this.f2926f = f;
        }

        /* renamed from: c */
        void m3578c(int i) {
            this.f2930j = i;
            this.f2941u = this.f2929i[i];
        }

        /* renamed from: d */
        int m3579d() {
            return (this.f2930j + 1) % this.f2929i.length;
        }

        /* renamed from: d */
        void m3580d(float f) {
            this.f2927g = f;
        }

        /* renamed from: e */
        float m3581e() {
            return this.f2925e;
        }

        /* renamed from: e */
        void m3582e(float f) {
            this.f2925e = f;
        }

        /* renamed from: f */
        int m3583f() {
            return this.f2929i[this.f2930j];
        }

        /* renamed from: f */
        void m3584f(float f) {
            this.f2928h = f;
            this.f2922b.setStrokeWidth(f);
        }

        /* renamed from: g */
        float m3585g() {
            return this.f2932l;
        }

        /* renamed from: h */
        float m3586h() {
            return this.f2933m;
        }

        /* renamed from: i */
        float m3587i() {
            return this.f2931k;
        }

        /* renamed from: j */
        void m3588j() {
            m3578c(m3579d());
        }

        /* renamed from: k */
        void m3589k() {
            this.f2931k = 0.0f;
            this.f2932l = 0.0f;
            this.f2933m = 0.0f;
            m3582e(0.0f);
            m3577c(0.0f);
            m3580d(0.0f);
        }

        /* renamed from: l */
        void m3590l() {
            this.f2931k = this.f2925e;
            this.f2932l = this.f2926f;
            this.f2933m = this.f2927g;
        }
    }

    public C0504c4(Context context) {
        C3419x1.m16410a(context);
        this.f2913d = context.getResources();
        c cVar = new c();
        this.f2911b = cVar;
        cVar.m3572a(f2910j);
        m3563c(2.5f);
        m3551a();
    }

    /* renamed from: a */
    private int m3550a(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r0) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r1) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r2) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r8))));
    }

    /* renamed from: a */
    private void m3551a() {
        c cVar = this.f2911b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f2908h);
        ofFloat.addListener(new b(cVar));
        this.f2914e = ofFloat;
    }

    /* renamed from: a */
    private void m3552a(float f, float f2, float f3, float f4) {
        c cVar = this.f2911b;
        float f5 = this.f2913d.getDisplayMetrics().density;
        cVar.m3584f(f2 * f5);
        cVar.m3574b(f * f5);
        cVar.m3578c(0);
        cVar.m3566a(f3 * f5, f4 * f5);
    }

    /* renamed from: b */
    private void m3553b(float f, c cVar) {
        m3557a(f, cVar);
        float floor = (float) (Math.floor(cVar.m3586h() / 0.8f) + 1.0d);
        cVar.m3582e(cVar.m3587i() + (((cVar.m3585g() - 0.01f) - cVar.m3587i()) * f));
        cVar.m3577c(cVar.m3585g());
        cVar.m3580d(cVar.m3586h() + ((floor - cVar.m3586h()) * f));
    }

    /* renamed from: d */
    private void m3554d(float f) {
        this.f2912c = f;
    }

    /* renamed from: a */
    public void m3555a(float f) {
        this.f2911b.m3565a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m3556a(float f, float f2) {
        this.f2911b.m3582e(f);
        this.f2911b.m3577c(f2);
        invalidateSelf();
    }

    /* renamed from: a */
    void m3557a(float f, c cVar) {
        cVar.m3575b(f > 0.75f ? m3550a((f - 0.75f) / 0.25f, cVar.m3583f(), cVar.m3576c()) : cVar.m3583f());
    }

    /* renamed from: a */
    void m3558a(float f, c cVar, boolean z) {
        float interpolation;
        float f2;
        if (this.f2916g) {
            m3553b(f, cVar);
            return;
        }
        if (f != 1.0f || z) {
            float m3586h = cVar.m3586h();
            if (f < 0.5f) {
                interpolation = cVar.m3587i();
                f2 = (f2909i.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m3587i = cVar.m3587i() + 0.79f;
                interpolation = m3587i - (((1.0f - f2909i.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = m3587i;
            }
            float f3 = m3586h + (0.20999998f * f);
            float f4 = (f + this.f2915f) * 216.0f;
            cVar.m3582e(interpolation);
            cVar.m3577c(f2);
            cVar.m3580d(f3);
            m3554d(f4);
        }
    }

    /* renamed from: a */
    public void m3559a(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
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
        m3552a(f, f2, f3, f4);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m3560a(boolean z) {
        this.f2911b.m3571a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m3561a(int... iArr) {
        this.f2911b.m3572a(iArr);
        this.f2911b.m3578c(0);
        invalidateSelf();
    }

    /* renamed from: b */
    public void m3562b(float f) {
        this.f2911b.m3580d(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void m3563c(float f) {
        this.f2911b.m3584f(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f2912c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f2911b.m3569a(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2911b.m3564a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f2914e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2911b.m3567a(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2911b.m3570a(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j;
        this.f2914e.cancel();
        this.f2911b.m3590l();
        if (this.f2911b.m3573b() != this.f2911b.m3581e()) {
            this.f2916g = true;
            animator = this.f2914e;
            j = 666;
        } else {
            this.f2911b.m3578c(0);
            this.f2911b.m3589k();
            animator = this.f2914e;
            j = 1332;
        }
        animator.setDuration(j);
        this.f2914e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f2914e.cancel();
        m3554d(0.0f);
        this.f2911b.m3571a(false);
        this.f2911b.m3578c(0);
        this.f2911b.m3589k();
        invalidateSelf();
    }
}
