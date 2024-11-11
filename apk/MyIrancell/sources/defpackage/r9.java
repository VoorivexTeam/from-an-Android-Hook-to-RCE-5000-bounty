package defpackage;

import android.view.Choreographer;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;

/* loaded from: classes.dex */
public class r9 extends n9 implements Choreographer.FrameCallback {
    private d k;
    private float d = 1.0f;
    private boolean e = false;
    private long f = 0;
    private float g = 0.0f;
    private int h = 0;
    private float i = -2.1474836E9f;
    private float j = 2.1474836E9f;
    protected boolean l = false;

    private float u() {
        d dVar = this.k;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.g()) / Math.abs(this.d);
    }

    private boolean v() {
        return n() < 0.0f;
    }

    private void w() {
        if (this.k == null) {
            return;
        }
        float f = this.g;
        if (f < this.i || f > this.j) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.g)));
        }
    }

    public void a(float f) {
        if (this.g == f) {
            return;
        }
        this.g = t9.a(f, m(), l());
        this.f = 0L;
        c();
    }

    public void a(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        d dVar = this.k;
        float l = dVar == null ? -3.4028235E38f : dVar.l();
        d dVar2 = this.k;
        float e = dVar2 == null ? Float.MAX_VALUE : dVar2.e();
        this.i = t9.a(f, l, e);
        this.j = t9.a(f2, l, e);
        a((int) t9.a(this.g, f, f2));
    }

    public void a(int i) {
        a(i, (int) this.j);
    }

    public void a(d dVar) {
        float l;
        float e;
        boolean z = this.k == null;
        this.k = dVar;
        if (z) {
            l = (int) Math.max(this.i, dVar.l());
            e = Math.min(this.j, dVar.e());
        } else {
            l = (int) dVar.l();
            e = dVar.e();
        }
        a(l, (int) e);
        float f = this.g;
        this.g = 0.0f;
        a((int) f);
    }

    public void b(float f) {
        a(this.i, f);
    }

    public void c(float f) {
        this.d = f;
    }

    protected void c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.l = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        r();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        q();
        if (this.k == null || !isRunning()) {
            return;
        }
        c.a("LottieValueAnimator#doFrame");
        long j2 = this.f;
        float u = ((float) (j2 != 0 ? j - j2 : 0L)) / u();
        float f = this.g;
        if (v()) {
            u = -u;
        }
        float f2 = f + u;
        this.g = f2;
        boolean z = !t9.b(f2, m(), l());
        this.g = t9.a(this.g, m(), l());
        this.f = j;
        c();
        if (z) {
            if (getRepeatCount() == -1 || this.h < getRepeatCount()) {
                b();
                this.h++;
                if (getRepeatMode() == 2) {
                    this.e = !this.e;
                    t();
                } else {
                    this.g = v() ? l() : m();
                }
                this.f = j;
            } else {
                this.g = this.d < 0.0f ? m() : l();
                r();
                a(v());
            }
        }
        w();
        c.b("LottieValueAnimator#doFrame");
    }

    public void g() {
        this.k = null;
        this.i = -2.1474836E9f;
        this.j = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float f;
        float m;
        if (this.k == null) {
            return 0.0f;
        }
        if (v()) {
            f = l();
            m = this.g;
        } else {
            f = this.g;
            m = m();
        }
        return (f - m) / (l() - m());
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        if (this.k == null) {
            return 0L;
        }
        return r0.c();
    }

    public void h() {
        r();
        a(v());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.l;
    }

    public float j() {
        d dVar = this.k;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.g - dVar.l()) / (this.k.e() - this.k.l());
    }

    public float k() {
        return this.g;
    }

    public float l() {
        d dVar = this.k;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.j;
        return f == 2.1474836E9f ? dVar.e() : f;
    }

    public float m() {
        d dVar = this.k;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.i;
        return f == -2.1474836E9f ? dVar.l() : f;
    }

    public float n() {
        return this.d;
    }

    public void o() {
        r();
    }

    public void p() {
        this.l = true;
        b(v());
        a((int) (v() ? l() : m()));
        this.f = 0L;
        this.h = 0;
        q();
    }

    protected void q() {
        if (isRunning()) {
            c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void r() {
        c(true);
    }

    public void s() {
        float m;
        this.l = true;
        q();
        this.f = 0L;
        if (v() && k() == m()) {
            m = l();
        } else if (v() || k() != l()) {
            return;
        } else {
            m = m();
        }
        this.g = m;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        t();
    }

    public void t() {
        c(-n());
    }
}
