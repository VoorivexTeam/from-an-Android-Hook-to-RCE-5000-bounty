package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.d;

/* loaded from: classes.dex */
public class v9<T> {
    private final d a;
    public final T b;
    public T c;
    public final Interpolator d;
    public final float e;
    public Float f;
    private float g;
    private float h;
    private int i;
    private int j;
    private float k;
    private float l;
    public PointF m;
    public PointF n;

    public v9(d dVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.k = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = dVar;
        this.b = t;
        this.c = t2;
        this.d = interpolator;
        this.e = f;
        this.f = f2;
    }

    public v9(T t) {
        this.g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.k = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = null;
        this.b = t;
        this.c = t;
        this.d = null;
        this.e = Float.MIN_VALUE;
        this.f = Float.valueOf(Float.MAX_VALUE);
    }

    public float a() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.l == Float.MIN_VALUE) {
            if (this.f == null) {
                this.l = 1.0f;
            } else {
                this.l = d() + ((this.f.floatValue() - this.e) / this.a.d());
            }
        }
        return this.l;
    }

    public boolean a(float f) {
        return f >= d() && f < a();
    }

    public float b() {
        if (this.h == -3987645.8f) {
            this.h = ((Float) this.c).floatValue();
        }
        return this.h;
    }

    public int c() {
        if (this.j == 784923401) {
            this.j = ((Integer) this.c).intValue();
        }
        return this.j;
    }

    public float d() {
        d dVar = this.a;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.k == Float.MIN_VALUE) {
            this.k = (this.e - dVar.l()) / this.a.d();
        }
        return this.k;
    }

    public float e() {
        if (this.g == -3987645.8f) {
            this.g = ((Float) this.b).floatValue();
        }
        return this.g;
    }

    public int f() {
        if (this.i == 784923401) {
            this.i = ((Integer) this.b).intValue();
        }
        return this.i;
    }

    public boolean g() {
        return this.d == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.c + ", startFrame=" + this.e + ", endFrame=" + this.f + ", interpolator=" + this.d + '}';
    }
}
