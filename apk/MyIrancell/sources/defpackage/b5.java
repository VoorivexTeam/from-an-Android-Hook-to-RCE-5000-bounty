package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import defpackage.e7;
import defpackage.h5;
import defpackage.m7;
import java.util.List;

/* loaded from: classes.dex */
public class b5 implements a5, h5.b, y4 {
    private final String b;
    private final f c;
    private final e7.a d;
    private final boolean e;
    private final h5<?, Float> f;
    private final h5<?, PointF> g;
    private final h5<?, Float> h;
    private final h5<?, Float> i;
    private final h5<?, Float> j;
    private final h5<?, Float> k;
    private final h5<?, Float> l;
    private boolean n;
    private final Path a = new Path();
    private p4 m = new p4();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e7.a.values().length];
            a = iArr;
            try {
                iArr[e7.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e7.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b5(f fVar, n7 n7Var, e7 e7Var) {
        h5<Float, Float> h5Var;
        this.c = fVar;
        this.b = e7Var.c();
        this.d = e7Var.i();
        this.e = e7Var.j();
        this.f = e7Var.f().a();
        this.g = e7Var.g().a();
        this.h = e7Var.h().a();
        this.j = e7Var.d().a();
        this.l = e7Var.e().a();
        if (this.d == e7.a.STAR) {
            this.i = e7Var.a().a();
            h5Var = e7Var.b().a();
        } else {
            h5Var = null;
            this.i = null;
        }
        this.k = h5Var;
        n7Var.a(this.f);
        n7Var.a(this.g);
        n7Var.a(this.h);
        n7Var.a(this.j);
        n7Var.a(this.l);
        if (this.d == e7.a.STAR) {
            n7Var.a(this.i);
            n7Var.a(this.k);
        }
        this.f.a(this);
        this.g.a(this);
        this.h.a(this);
        this.j.a(this);
        this.l.a(this);
        if (this.d == e7.a.STAR) {
            this.i.a(this);
            this.k.a(this);
        }
    }

    private void d() {
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor(this.f.f().floatValue());
        double radians = Math.toRadians((this.h == null ? 0.0d : r2.f().floatValue()) - 90.0d);
        double d4 = floor;
        Double.isNaN(d4);
        float floatValue = this.l.f().floatValue() / 100.0f;
        float floatValue2 = this.j.f().floatValue();
        double d5 = floatValue2;
        double cos = Math.cos(radians);
        Double.isNaN(d5);
        float f = (float) (cos * d5);
        double sin = Math.sin(radians);
        Double.isNaN(d5);
        float f2 = (float) (sin * d5);
        this.a.moveTo(f, f2);
        double d6 = (float) (6.283185307179586d / d4);
        Double.isNaN(d6);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            double cos2 = Math.cos(d7);
            Double.isNaN(d5);
            float f3 = (float) (cos2 * d5);
            double sin2 = Math.sin(d7);
            Double.isNaN(d5);
            double d8 = ceil;
            float f4 = (float) (d5 * sin2);
            if (floatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(f2, f) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(f4, f3) - 1.5707963267948966d);
                float f5 = floatValue2 * floatValue * 0.25f;
                this.a.cubicTo(f - (cos3 * f5), f2 - (sin3 * f5), f3 + (((float) Math.cos(atan22)) * f5), f4 + (f5 * ((float) Math.sin(atan22))), f3, f4);
            } else {
                d = d7;
                d2 = d5;
                d3 = d6;
                i = i2;
                this.a.lineTo(f3, f4);
            }
            Double.isNaN(d3);
            d7 = d + d3;
            i2 = i + 1;
            f2 = f4;
            f = f3;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF f6 = this.g.f();
        this.a.offset(f6.x, f6.y);
        this.a.close();
    }

    private void e() {
        double d;
        float f;
        float f2;
        float f3;
        float f4;
        double d2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        double d3;
        float f11;
        float f12;
        float floatValue = this.f.f().floatValue();
        double radians = Math.toRadians((this.h == null ? 0.0d : r2.f().floatValue()) - 90.0d);
        double d4 = floatValue;
        Double.isNaN(d4);
        float f13 = (float) (6.283185307179586d / d4);
        float f14 = f13 / 2.0f;
        float f15 = floatValue - ((int) floatValue);
        if (f15 != 0.0f) {
            double d5 = (1.0f - f15) * f14;
            Double.isNaN(d5);
            radians += d5;
        }
        float floatValue2 = this.j.f().floatValue();
        float floatValue3 = this.i.f().floatValue();
        h5<?, Float> h5Var = this.k;
        float floatValue4 = h5Var != null ? h5Var.f().floatValue() / 100.0f : 0.0f;
        h5<?, Float> h5Var2 = this.l;
        float floatValue5 = h5Var2 != null ? h5Var2.f().floatValue() / 100.0f : 0.0f;
        if (f15 != 0.0f) {
            float f16 = ((floatValue2 - floatValue3) * f15) + floatValue3;
            double d6 = f16;
            double cos = Math.cos(radians);
            Double.isNaN(d6);
            d = d4;
            float f17 = (float) (d6 * cos);
            double sin = Math.sin(radians);
            Double.isNaN(d6);
            float f18 = (float) (d6 * sin);
            this.a.moveTo(f17, f18);
            double d7 = (f13 * f15) / 2.0f;
            Double.isNaN(d7);
            d2 = radians + d7;
            f3 = f17;
            f5 = f16;
            f = floatValue2;
            f4 = f18;
            f2 = f14;
        } else {
            d = d4;
            f = floatValue2;
            double d8 = f;
            double cos2 = Math.cos(radians);
            Double.isNaN(d8);
            f2 = f14;
            f3 = (float) (d8 * cos2);
            double sin2 = Math.sin(radians);
            Double.isNaN(d8);
            f4 = (float) (d8 * sin2);
            this.a.moveTo(f3, f4);
            double d9 = f2;
            Double.isNaN(d9);
            d2 = radians + d9;
            f5 = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        int i = 0;
        float f19 = floatValue5;
        boolean z = false;
        while (true) {
            double d10 = i;
            if (d10 >= ceil) {
                PointF f20 = this.g.f();
                this.a.offset(f20.x, f20.y);
                this.a.close();
                return;
            }
            float f21 = z ? f : floatValue3;
            float f22 = (f5 == 0.0f || d10 != ceil - 2.0d) ? f2 : (f13 * f15) / 2.0f;
            if (f5 == 0.0f || d10 != ceil - 1.0d) {
                f6 = f13;
                f7 = f21;
                f8 = f;
            } else {
                f6 = f13;
                f8 = f;
                f7 = f5;
            }
            double d11 = f7;
            double cos3 = Math.cos(d2);
            Double.isNaN(d11);
            float f23 = (float) (d11 * cos3);
            double sin3 = Math.sin(d2);
            Double.isNaN(d11);
            float f24 = (float) (d11 * sin3);
            if (floatValue4 == 0.0f && f19 == 0.0f) {
                this.a.lineTo(f23, f24);
                d3 = d2;
                f9 = floatValue3;
                f10 = floatValue4;
                f11 = f2;
                f12 = f22;
            } else {
                f9 = floatValue3;
                f10 = floatValue4;
                double atan2 = (float) (Math.atan2(f4, f3) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin4 = (float) Math.sin(atan2);
                d3 = d2;
                f11 = f2;
                f12 = f22;
                double atan22 = (float) (Math.atan2(f24, f23) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin5 = (float) Math.sin(atan22);
                float f25 = z ? f10 : f19;
                float f26 = z ? f19 : f10;
                float f27 = (z ? f9 : f8) * f25 * 0.47829f;
                float f28 = cos4 * f27;
                float f29 = f27 * sin4;
                float f30 = (z ? f8 : f9) * f26 * 0.47829f;
                float f31 = cos5 * f30;
                float f32 = f30 * sin5;
                if (f15 != 0.0f) {
                    if (i == 0) {
                        f28 *= f15;
                        f29 *= f15;
                    } else if (d10 == ceil - 1.0d) {
                        f31 *= f15;
                        f32 *= f15;
                    }
                }
                this.a.cubicTo(f3 - f28, f4 - f29, f23 + f31, f24 + f32, f23, f24);
            }
            double d12 = f12;
            Double.isNaN(d12);
            z = !z;
            i++;
            f4 = f24;
            d2 = d3 + d12;
            f2 = f11;
            f3 = f23;
            f = f8;
            f13 = f6;
            floatValue3 = f9;
            floatValue4 = f10;
        }
    }

    private void f() {
        this.n = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.q4
    public String a() {
        return this.b;
    }

    @Override // defpackage.e6
    public void a(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        t9.a(d6Var, i, list, d6Var2, this);
    }

    @Override // defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        h5 h5Var;
        h5<?, Float> h5Var2;
        if (t == k.s) {
            h5Var = this.f;
        } else if (t == k.t) {
            h5Var = this.h;
        } else {
            if (t != k.j) {
                if (t != k.u || (h5Var2 = this.i) == null) {
                    if (t == k.v) {
                        h5Var = this.j;
                    } else if (t != k.w || (h5Var2 = this.k) == null) {
                        if (t != k.x) {
                            return;
                        } else {
                            h5Var = this.l;
                        }
                    }
                }
                h5Var2.a((x9<Float>) x9Var);
                return;
            }
            h5Var = this.g;
        }
        h5Var.a(x9Var);
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        for (int i = 0; i < list.size(); i++) {
            q4 q4Var = list.get(i);
            if (q4Var instanceof g5) {
                g5 g5Var = (g5) q4Var;
                if (g5Var.g() == m7.a.SIMULTANEOUSLY) {
                    this.m.a(g5Var);
                    g5Var.a(this);
                }
            }
        }
    }

    @Override // h5.b
    public void b() {
        f();
    }

    @Override // defpackage.a5
    public Path c() {
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (!this.e) {
            int i = a.a[this.d.ordinal()];
            if (i == 1) {
                e();
            } else if (i == 2) {
                d();
            }
            this.a.close();
            this.m.a(this.a);
        }
        this.n = true;
        return this.a;
    }
}
