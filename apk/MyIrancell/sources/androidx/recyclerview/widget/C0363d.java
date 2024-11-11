package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p000.C3107q2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C0363d extends RecyclerView.AbstractC0341n implements RecyclerView.InterfaceC0346s {

    /* renamed from: D */
    private static final int[] f2293D = {R.attr.state_pressed};

    /* renamed from: E */
    private static final int[] f2294E = new int[0];

    /* renamed from: a */
    private final int f2298a;

    /* renamed from: b */
    private final int f2299b;

    /* renamed from: c */
    final StateListDrawable f2300c;

    /* renamed from: d */
    final Drawable f2301d;

    /* renamed from: e */
    private final int f2302e;

    /* renamed from: f */
    private final int f2303f;

    /* renamed from: g */
    private final StateListDrawable f2304g;

    /* renamed from: h */
    private final Drawable f2305h;

    /* renamed from: i */
    private final int f2306i;

    /* renamed from: j */
    private final int f2307j;

    /* renamed from: k */
    int f2308k;

    /* renamed from: l */
    int f2309l;

    /* renamed from: m */
    float f2310m;

    /* renamed from: n */
    int f2311n;

    /* renamed from: o */
    int f2312o;

    /* renamed from: p */
    float f2313p;

    /* renamed from: s */
    private RecyclerView f2316s;

    /* renamed from: q */
    private int f2314q = 0;

    /* renamed from: r */
    private int f2315r = 0;

    /* renamed from: t */
    private boolean f2317t = false;

    /* renamed from: u */
    private boolean f2318u = false;

    /* renamed from: v */
    private int f2319v = 0;

    /* renamed from: w */
    private int f2320w = 0;

    /* renamed from: x */
    private final int[] f2321x = new int[2];

    /* renamed from: y */
    private final int[] f2322y = new int[2];

    /* renamed from: z */
    final ValueAnimator f2323z = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: A */
    int f2295A = 0;

    /* renamed from: B */
    private final Runnable f2296B = new a();

    /* renamed from: C */
    private final RecyclerView.AbstractC0347t f2297C = new b();

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0363d.this.m2815a(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    class b extends RecyclerView.AbstractC0347t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0347t
        /* renamed from: a */
        public void mo2567a(RecyclerView recyclerView, int i, int i2) {
            C0363d.this.m2816a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f2326a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2326a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2326a) {
                this.f2326a = false;
                return;
            }
            if (((Float) C0363d.this.f2323z.getAnimatedValue()).floatValue() == 0.0f) {
                C0363d c0363d = C0363d.this;
                c0363d.f2295A = 0;
                c0363d.m2820b(0);
            } else {
                C0363d c0363d2 = C0363d.this;
                c0363d2.f2295A = 2;
                c0363d2.m2814a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0363d.this.f2300c.setAlpha(floatValue);
            C0363d.this.f2301d.setAlpha(floatValue);
            C0363d.this.m2814a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0363d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f2300c = stateListDrawable;
        this.f2301d = drawable;
        this.f2304g = stateListDrawable2;
        this.f2305h = drawable2;
        this.f2302e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2303f = Math.max(i, drawable.getIntrinsicWidth());
        this.f2306i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2307j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2298a = i2;
        this.f2299b = i3;
        this.f2300c.setAlpha(255);
        this.f2301d.setAlpha(255);
        this.f2323z.addListener(new c());
        this.f2323z.addUpdateListener(new d());
        m2817a(recyclerView);
    }

    /* renamed from: a */
    private int m2802a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: a */
    private void m2803a(float f) {
        int[] m2810e = m2810e();
        float max = Math.max(m2810e[0], Math.min(m2810e[1], f));
        if (Math.abs(this.f2312o - max) < 2.0f) {
            return;
        }
        int m2802a = m2802a(this.f2313p, max, m2810e, this.f2316s.computeHorizontalScrollRange(), this.f2316s.computeHorizontalScrollOffset(), this.f2314q);
        if (m2802a != 0) {
            this.f2316s.scrollBy(m2802a, 0);
        }
        this.f2313p = max;
    }

    /* renamed from: a */
    private void m2804a(Canvas canvas) {
        int i = this.f2315r;
        int i2 = this.f2306i;
        int i3 = this.f2312o;
        int i4 = this.f2311n;
        this.f2304g.setBounds(0, 0, i4, i2);
        this.f2305h.setBounds(0, 0, this.f2314q, this.f2307j);
        canvas.translate(0.0f, i - i2);
        this.f2305h.draw(canvas);
        canvas.translate(i3 - (i4 / 2), 0.0f);
        this.f2304g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: b */
    private void m2805b(float f) {
        int[] m2811f = m2811f();
        float max = Math.max(m2811f[0], Math.min(m2811f[1], f));
        if (Math.abs(this.f2309l - max) < 2.0f) {
            return;
        }
        int m2802a = m2802a(this.f2310m, max, m2811f, this.f2316s.computeVerticalScrollRange(), this.f2316s.computeVerticalScrollOffset(), this.f2315r);
        if (m2802a != 0) {
            this.f2316s.scrollBy(0, m2802a);
        }
        this.f2310m = max;
    }

    /* renamed from: b */
    private void m2806b(Canvas canvas) {
        int i = this.f2314q;
        int i2 = this.f2302e;
        int i3 = i - i2;
        int i4 = this.f2309l;
        int i5 = this.f2308k;
        int i6 = i4 - (i5 / 2);
        this.f2300c.setBounds(0, 0, i2, i5);
        this.f2301d.setBounds(0, 0, this.f2303f, this.f2315r);
        if (m2812g()) {
            this.f2301d.draw(canvas);
            canvas.translate(this.f2302e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f2300c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f2302e;
        } else {
            canvas.translate(i3, 0.0f);
            this.f2301d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f2300c.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    /* renamed from: c */
    private void m2807c() {
        this.f2316s.removeCallbacks(this.f2296B);
    }

    /* renamed from: c */
    private void m2808c(int i) {
        m2807c();
        this.f2316s.postDelayed(this.f2296B, i);
    }

    /* renamed from: d */
    private void m2809d() {
        this.f2316s.m2277b((RecyclerView.AbstractC0341n) this);
        this.f2316s.m2278b((RecyclerView.InterfaceC0346s) this);
        this.f2316s.m2279b(this.f2297C);
        m2807c();
    }

    /* renamed from: e */
    private int[] m2810e() {
        int[] iArr = this.f2322y;
        int i = this.f2299b;
        iArr[0] = i;
        iArr[1] = this.f2314q - i;
        return iArr;
    }

    /* renamed from: f */
    private int[] m2811f() {
        int[] iArr = this.f2321x;
        int i = this.f2299b;
        iArr[0] = i;
        iArr[1] = this.f2315r - i;
        return iArr;
    }

    /* renamed from: g */
    private boolean m2812g() {
        return C3107q2.m14919k(this.f2316s) == 1;
    }

    /* renamed from: h */
    private void m2813h() {
        this.f2316s.m2258a((RecyclerView.AbstractC0341n) this);
        this.f2316s.m2260a((RecyclerView.InterfaceC0346s) this);
        this.f2316s.m2261a(this.f2297C);
    }

    /* renamed from: a */
    void m2814a() {
        this.f2316s.invalidate();
    }

    /* renamed from: a */
    void m2815a(int i) {
        int i2 = this.f2295A;
        if (i2 == 1) {
            this.f2323z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f2295A = 3;
        ValueAnimator valueAnimator = this.f2323z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f2323z.setDuration(i);
        this.f2323z.start();
    }

    /* renamed from: a */
    void m2816a(int i, int i2) {
        int computeVerticalScrollRange = this.f2316s.computeVerticalScrollRange();
        int i3 = this.f2315r;
        this.f2317t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f2298a;
        int computeHorizontalScrollRange = this.f2316s.computeHorizontalScrollRange();
        int i4 = this.f2314q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f2298a;
        this.f2318u = z;
        if (!this.f2317t && !z) {
            if (this.f2319v != 0) {
                m2820b(0);
                return;
            }
            return;
        }
        if (this.f2317t) {
            float f = i3;
            this.f2309l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f2308k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f2318u) {
            float f2 = i4;
            this.f2312o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f2311n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f2319v;
        if (i5 == 0 || i5 == 1) {
            m2820b(1);
        }
    }

    /* renamed from: a */
    public void m2817a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2316s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m2809d();
        }
        this.f2316s = recyclerView;
        if (recyclerView != null) {
            m2813h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0346s
    /* renamed from: a */
    public void mo2563a(boolean z) {
    }

    /* renamed from: a */
    boolean m2818a(float f, float f2) {
        if (f2 >= this.f2315r - this.f2306i) {
            int i = this.f2312o;
            int i2 = this.f2311n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0346s
    /* renamed from: a */
    public boolean mo2564a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f2319v;
        if (i == 1) {
            boolean m2821b = m2821b(motionEvent.getX(), motionEvent.getY());
            boolean m2818a = m2818a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m2821b && !m2818a) {
                return false;
            }
            if (m2818a) {
                this.f2320w = 1;
                this.f2313p = (int) motionEvent.getX();
            } else if (m2821b) {
                this.f2320w = 2;
                this.f2310m = (int) motionEvent.getY();
            }
            m2820b(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m2819b() {
        int i = this.f2295A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f2323z.cancel();
            }
        }
        this.f2295A = 1;
        ValueAnimator valueAnimator = this.f2323z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f2323z.setDuration(500L);
        this.f2323z.setStartDelay(0L);
        this.f2323z.start();
    }

    /* renamed from: b */
    void m2820b(int i) {
        int i2;
        if (i == 2 && this.f2319v != 2) {
            this.f2300c.setState(f2293D);
            m2807c();
        }
        if (i == 0) {
            m2814a();
        } else {
            m2819b();
        }
        if (this.f2319v != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1200;
            this.f2319v = i;
        }
        this.f2300c.setState(f2294E);
        m2808c(i2);
        this.f2319v = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0341n
    /* renamed from: b */
    public void mo2450b(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0353z c0353z) {
        if (this.f2314q != this.f2316s.getWidth() || this.f2315r != this.f2316s.getHeight()) {
            this.f2314q = this.f2316s.getWidth();
            this.f2315r = this.f2316s.getHeight();
            m2820b(0);
        } else if (this.f2295A != 0) {
            if (this.f2317t) {
                m2806b(canvas);
            }
            if (this.f2318u) {
                m2804a(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0346s
    /* renamed from: b */
    public void mo2565b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2319v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m2821b = m2821b(motionEvent.getX(), motionEvent.getY());
            boolean m2818a = m2818a(motionEvent.getX(), motionEvent.getY());
            if (m2821b || m2818a) {
                if (m2818a) {
                    this.f2320w = 1;
                    this.f2313p = (int) motionEvent.getX();
                } else if (m2821b) {
                    this.f2320w = 2;
                    this.f2310m = (int) motionEvent.getY();
                }
                m2820b(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f2319v == 2) {
            this.f2310m = 0.0f;
            this.f2313p = 0.0f;
            m2820b(1);
            this.f2320w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f2319v == 2) {
            m2819b();
            if (this.f2320w == 1) {
                m2803a(motionEvent.getX());
            }
            if (this.f2320w == 2) {
                m2805b(motionEvent.getY());
            }
        }
    }

    /* renamed from: b */
    boolean m2821b(float f, float f2) {
        if (!m2812g() ? f >= this.f2314q - this.f2302e : f <= this.f2302e / 2) {
            int i = this.f2309l;
            int i2 = this.f2308k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }
}
