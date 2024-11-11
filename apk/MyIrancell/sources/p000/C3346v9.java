package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C0538d;

/* renamed from: v9 */
/* loaded from: classes.dex */
public class C3346v9<T> {

    /* renamed from: a */
    private final C0538d f13630a;

    /* renamed from: b */
    public final T f13631b;

    /* renamed from: c */
    public T f13632c;

    /* renamed from: d */
    public final Interpolator f13633d;

    /* renamed from: e */
    public final float f13634e;

    /* renamed from: f */
    public Float f13635f;

    /* renamed from: g */
    private float f13636g;

    /* renamed from: h */
    private float f13637h;

    /* renamed from: i */
    private int f13638i;

    /* renamed from: j */
    private int f13639j;

    /* renamed from: k */
    private float f13640k;

    /* renamed from: l */
    private float f13641l;

    /* renamed from: m */
    public PointF f13642m;

    /* renamed from: n */
    public PointF f13643n;

    public C3346v9(C0538d c0538d, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f13636g = -3987645.8f;
        this.f13637h = -3987645.8f;
        this.f13638i = 784923401;
        this.f13639j = 784923401;
        this.f13640k = Float.MIN_VALUE;
        this.f13641l = Float.MIN_VALUE;
        this.f13642m = null;
        this.f13643n = null;
        this.f13630a = c0538d;
        this.f13631b = t;
        this.f13632c = t2;
        this.f13633d = interpolator;
        this.f13634e = f;
        this.f13635f = f2;
    }

    public C3346v9(T t) {
        this.f13636g = -3987645.8f;
        this.f13637h = -3987645.8f;
        this.f13638i = 784923401;
        this.f13639j = 784923401;
        this.f13640k = Float.MIN_VALUE;
        this.f13641l = Float.MIN_VALUE;
        this.f13642m = null;
        this.f13643n = null;
        this.f13630a = null;
        this.f13631b = t;
        this.f13632c = t;
        this.f13633d = null;
        this.f13634e = Float.MIN_VALUE;
        this.f13635f = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: a */
    public float m15973a() {
        if (this.f13630a == null) {
            return 1.0f;
        }
        if (this.f13641l == Float.MIN_VALUE) {
            if (this.f13635f == null) {
                this.f13641l = 1.0f;
            } else {
                this.f13641l = m15977d() + ((this.f13635f.floatValue() - this.f13634e) / this.f13630a.m3734d());
            }
        }
        return this.f13641l;
    }

    /* renamed from: a */
    public boolean m15974a(float f) {
        return f >= m15977d() && f < m15973a();
    }

    /* renamed from: b */
    public float m15975b() {
        if (this.f13637h == -3987645.8f) {
            this.f13637h = ((Float) this.f13632c).floatValue();
        }
        return this.f13637h;
    }

    /* renamed from: c */
    public int m15976c() {
        if (this.f13639j == 784923401) {
            this.f13639j = ((Integer) this.f13632c).intValue();
        }
        return this.f13639j;
    }

    /* renamed from: d */
    public float m15977d() {
        C0538d c0538d = this.f13630a;
        if (c0538d == null) {
            return 0.0f;
        }
        if (this.f13640k == Float.MIN_VALUE) {
            this.f13640k = (this.f13634e - c0538d.m3742l()) / this.f13630a.m3734d();
        }
        return this.f13640k;
    }

    /* renamed from: e */
    public float m15978e() {
        if (this.f13636g == -3987645.8f) {
            this.f13636g = ((Float) this.f13631b).floatValue();
        }
        return this.f13636g;
    }

    /* renamed from: f */
    public int m15979f() {
        if (this.f13638i == 784923401) {
            this.f13638i = ((Integer) this.f13631b).intValue();
        }
        return this.f13638i;
    }

    /* renamed from: g */
    public boolean m15980g() {
        return this.f13633d == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f13631b + ", endValue=" + this.f13632c + ", startFrame=" + this.f13634e + ", endFrame=" + this.f13635f + ", interpolator=" + this.f13633d + '}';
    }
}
