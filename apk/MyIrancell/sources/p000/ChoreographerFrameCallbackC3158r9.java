package p000;

import android.view.Choreographer;
import com.airbnb.lottie.C0537c;
import com.airbnb.lottie.C0538d;

/* renamed from: r9 */
/* loaded from: classes.dex */
public class ChoreographerFrameCallbackC3158r9 extends AbstractC2979n9 implements Choreographer.FrameCallback {

    /* renamed from: k */
    private C0538d f12938k;

    /* renamed from: d */
    private float f12931d = 1.0f;

    /* renamed from: e */
    private boolean f12932e = false;

    /* renamed from: f */
    private long f12933f = 0;

    /* renamed from: g */
    private float f12934g = 0.0f;

    /* renamed from: h */
    private int f12935h = 0;

    /* renamed from: i */
    private float f12936i = -2.1474836E9f;

    /* renamed from: j */
    private float f12937j = 2.1474836E9f;

    /* renamed from: l */
    protected boolean f12939l = false;

    /* renamed from: u */
    private float m15231u() {
        C0538d c0538d = this.f12938k;
        if (c0538d == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c0538d.m3737g()) / Math.abs(this.f12931d);
    }

    /* renamed from: v */
    private boolean m15232v() {
        return m15247n() < 0.0f;
    }

    /* renamed from: w */
    private void m15233w() {
        if (this.f12938k == null) {
            return;
        }
        float f = this.f12934g;
        if (f < this.f12936i || f > this.f12937j) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f12936i), Float.valueOf(this.f12937j), Float.valueOf(this.f12934g)));
        }
    }

    /* renamed from: a */
    public void m15234a(float f) {
        if (this.f12934g == f) {
            return;
        }
        this.f12934g = C3243t9.m15571a(f, m15246m(), m15245l());
        this.f12933f = 0L;
        m14304c();
    }

    /* renamed from: a */
    public void m15235a(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        C0538d c0538d = this.f12938k;
        float m3742l = c0538d == null ? -3.4028235E38f : c0538d.m3742l();
        C0538d c0538d2 = this.f12938k;
        float m3735e = c0538d2 == null ? Float.MAX_VALUE : c0538d2.m3735e();
        this.f12936i = C3243t9.m15571a(f, m3742l, m3735e);
        this.f12937j = C3243t9.m15571a(f2, m3742l, m3735e);
        m15234a((int) C3243t9.m15571a(this.f12934g, f, f2));
    }

    /* renamed from: a */
    public void m15236a(int i) {
        m15235a(i, (int) this.f12937j);
    }

    /* renamed from: a */
    public void m15237a(C0538d c0538d) {
        float m3742l;
        float m3735e;
        boolean z = this.f12938k == null;
        this.f12938k = c0538d;
        if (z) {
            m3742l = (int) Math.max(this.f12936i, c0538d.m3742l());
            m3735e = Math.min(this.f12937j, c0538d.m3735e());
        } else {
            m3742l = (int) c0538d.m3742l();
            m3735e = c0538d.m3735e();
        }
        m15235a(m3742l, (int) m3735e);
        float f = this.f12934g;
        this.f12934g = 0.0f;
        m15234a((int) f);
    }

    /* renamed from: b */
    public void m15238b(float f) {
        m15235a(this.f12936i, f);
    }

    /* renamed from: c */
    public void m15239c(float f) {
        this.f12931d = f;
    }

    /* renamed from: c */
    protected void m15240c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f12939l = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        m14300a();
        m15251r();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m15250q();
        if (this.f12938k == null || !isRunning()) {
            return;
        }
        C0537c.m3721a("LottieValueAnimator#doFrame");
        long j2 = this.f12933f;
        float m15231u = ((float) (j2 != 0 ? j - j2 : 0L)) / m15231u();
        float f = this.f12934g;
        if (m15232v()) {
            m15231u = -m15231u;
        }
        float f2 = f + m15231u;
        this.f12934g = f2;
        boolean z = !C3243t9.m15580b(f2, m15246m(), m15245l());
        this.f12934g = C3243t9.m15571a(this.f12934g, m15246m(), m15245l());
        this.f12933f = j;
        m14304c();
        if (z) {
            if (getRepeatCount() == -1 || this.f12935h < getRepeatCount()) {
                m14302b();
                this.f12935h++;
                if (getRepeatMode() == 2) {
                    this.f12932e = !this.f12932e;
                    m15253t();
                } else {
                    this.f12934g = m15232v() ? m15245l() : m15246m();
                }
                this.f12933f = j;
            } else {
                this.f12934g = this.f12931d < 0.0f ? m15246m() : m15245l();
                m15251r();
                m14301a(m15232v());
            }
        }
        m15233w();
        C0537c.m3722b("LottieValueAnimator#doFrame");
    }

    /* renamed from: g */
    public void m15241g() {
        this.f12938k = null;
        this.f12936i = -2.1474836E9f;
        this.f12937j = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float f;
        float m15246m;
        if (this.f12938k == null) {
            return 0.0f;
        }
        if (m15232v()) {
            f = m15245l();
            m15246m = this.f12934g;
        } else {
            f = this.f12934g;
            m15246m = m15246m();
        }
        return (f - m15246m) / (m15245l() - m15246m());
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m15243j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        if (this.f12938k == null) {
            return 0L;
        }
        return r0.m3732c();
    }

    /* renamed from: h */
    public void m15242h() {
        m15251r();
        m14301a(m15232v());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f12939l;
    }

    /* renamed from: j */
    public float m15243j() {
        C0538d c0538d = this.f12938k;
        if (c0538d == null) {
            return 0.0f;
        }
        return (this.f12934g - c0538d.m3742l()) / (this.f12938k.m3735e() - this.f12938k.m3742l());
    }

    /* renamed from: k */
    public float m15244k() {
        return this.f12934g;
    }

    /* renamed from: l */
    public float m15245l() {
        C0538d c0538d = this.f12938k;
        if (c0538d == null) {
            return 0.0f;
        }
        float f = this.f12937j;
        return f == 2.1474836E9f ? c0538d.m3735e() : f;
    }

    /* renamed from: m */
    public float m15246m() {
        C0538d c0538d = this.f12938k;
        if (c0538d == null) {
            return 0.0f;
        }
        float f = this.f12936i;
        return f == -2.1474836E9f ? c0538d.m3742l() : f;
    }

    /* renamed from: n */
    public float m15247n() {
        return this.f12931d;
    }

    /* renamed from: o */
    public void m15248o() {
        m15251r();
    }

    /* renamed from: p */
    public void m15249p() {
        this.f12939l = true;
        m14303b(m15232v());
        m15234a((int) (m15232v() ? m15245l() : m15246m()));
        this.f12933f = 0L;
        this.f12935h = 0;
        m15250q();
    }

    /* renamed from: q */
    protected void m15250q() {
        if (isRunning()) {
            m15240c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: r */
    protected void m15251r() {
        m15240c(true);
    }

    /* renamed from: s */
    public void m15252s() {
        float m15246m;
        this.f12939l = true;
        m15250q();
        this.f12933f = 0L;
        if (m15232v() && m15244k() == m15246m()) {
            m15246m = m15245l();
        } else if (m15232v() || m15244k() != m15245l()) {
            return;
        } else {
            m15246m = m15246m();
        }
        this.f12934g = m15246m;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f12932e) {
            return;
        }
        this.f12932e = false;
        m15253t();
    }

    /* renamed from: t */
    public void m15253t() {
        m15239c(-m15247n());
    }
}
