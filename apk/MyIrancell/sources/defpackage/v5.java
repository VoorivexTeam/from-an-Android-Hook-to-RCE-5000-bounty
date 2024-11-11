package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.k;
import defpackage.h5;
import java.util.Collections;

/* loaded from: classes.dex */
public class v5 {
    private final Matrix a = new Matrix();
    private final Matrix b;
    private final Matrix c;
    private final Matrix d;
    private final float[] e;
    private h5<PointF, PointF> f;
    private h5<?, PointF> g;
    private h5<y9, y9> h;
    private h5<Float, Float> i;
    private h5<Integer, Integer> j;
    private j5 k;
    private j5 l;
    private h5<?, Float> m;
    private h5<?, Float> n;

    public v5(t6 t6Var) {
        this.f = t6Var.b() == null ? null : t6Var.b().a();
        this.g = t6Var.e() == null ? null : t6Var.e().a();
        this.h = t6Var.g() == null ? null : t6Var.g().a();
        this.i = t6Var.f() == null ? null : t6Var.f().a();
        j5 j5Var = t6Var.h() == null ? null : (j5) t6Var.h().a();
        this.k = j5Var;
        if (j5Var != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.l = t6Var.i() == null ? null : (j5) t6Var.i().a();
        if (t6Var.d() != null) {
            this.j = t6Var.d().a();
        }
        if (t6Var.j() != null) {
            this.m = t6Var.j().a();
        } else {
            this.m = null;
        }
        if (t6Var.c() != null) {
            this.n = t6Var.c().a();
        } else {
            this.n = null;
        }
    }

    private void e() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public Matrix a(float f) {
        h5<?, PointF> h5Var = this.g;
        PointF f2 = h5Var == null ? null : h5Var.f();
        h5<y9, y9> h5Var2 = this.h;
        y9 f3 = h5Var2 == null ? null : h5Var2.f();
        this.a.reset();
        if (f2 != null) {
            this.a.preTranslate(f2.x * f, f2.y * f);
        }
        if (f3 != null) {
            double d = f;
            this.a.preScale((float) Math.pow(f3.a(), d), (float) Math.pow(f3.b(), d));
        }
        h5<Float, Float> h5Var3 = this.i;
        if (h5Var3 != null) {
            float floatValue = h5Var3.f().floatValue();
            h5<PointF, PointF> h5Var4 = this.f;
            PointF f4 = h5Var4 != null ? h5Var4.f() : null;
            this.a.preRotate(floatValue * f, f4 == null ? 0.0f : f4.x, f4 != null ? f4.y : 0.0f);
        }
        return this.a;
    }

    public h5<?, Float> a() {
        return this.n;
    }

    public void a(h5.b bVar) {
        h5<Integer, Integer> h5Var = this.j;
        if (h5Var != null) {
            h5Var.a(bVar);
        }
        h5<?, Float> h5Var2 = this.m;
        if (h5Var2 != null) {
            h5Var2.a(bVar);
        }
        h5<?, Float> h5Var3 = this.n;
        if (h5Var3 != null) {
            h5Var3.a(bVar);
        }
        h5<PointF, PointF> h5Var4 = this.f;
        if (h5Var4 != null) {
            h5Var4.a(bVar);
        }
        h5<?, PointF> h5Var5 = this.g;
        if (h5Var5 != null) {
            h5Var5.a(bVar);
        }
        h5<y9, y9> h5Var6 = this.h;
        if (h5Var6 != null) {
            h5Var6.a(bVar);
        }
        h5<Float, Float> h5Var7 = this.i;
        if (h5Var7 != null) {
            h5Var7.a(bVar);
        }
        j5 j5Var = this.k;
        if (j5Var != null) {
            j5Var.a(bVar);
        }
        j5 j5Var2 = this.l;
        if (j5Var2 != null) {
            j5Var2.a(bVar);
        }
    }

    public void a(n7 n7Var) {
        n7Var.a(this.j);
        n7Var.a(this.m);
        n7Var.a(this.n);
        n7Var.a(this.f);
        n7Var.a(this.g);
        n7Var.a(this.h);
        n7Var.a(this.i);
        n7Var.a(this.k);
        n7Var.a(this.l);
    }

    public <T> boolean a(T t, x9<T> x9Var) {
        j5 j5Var;
        h5 h5Var;
        j5 j5Var2;
        h5<?, Float> h5Var2;
        if (t == k.e) {
            h5Var = this.f;
            if (h5Var == null) {
                this.f = new w5(x9Var, new PointF());
                return true;
            }
        } else if (t == k.f) {
            h5Var = this.g;
            if (h5Var == null) {
                this.g = new w5(x9Var, new PointF());
                return true;
            }
        } else if (t == k.k) {
            h5Var = this.h;
            if (h5Var == null) {
                this.h = new w5(x9Var, new y9());
                return true;
            }
        } else if (t == k.l) {
            h5Var = this.i;
            if (h5Var == null) {
                this.i = new w5(x9Var, Float.valueOf(0.0f));
                return true;
            }
        } else {
            if (t != k.c) {
                if (t != k.y || (h5Var2 = this.m) == null) {
                    if (t != k.z || (h5Var2 = this.n) == null) {
                        if (t == k.m && (j5Var2 = this.k) != null) {
                            if (j5Var2 == null) {
                                this.k = new j5(Collections.singletonList(new v9(Float.valueOf(0.0f))));
                            }
                            h5Var = this.k;
                        } else {
                            if (t != k.n || (j5Var = this.l) == null) {
                                return false;
                            }
                            if (j5Var == null) {
                                this.l = new j5(Collections.singletonList(new v9(Float.valueOf(0.0f))));
                            }
                            h5Var = this.l;
                        }
                    } else if (h5Var2 == null) {
                        this.n = new w5(x9Var, 100);
                        return true;
                    }
                } else if (h5Var2 == null) {
                    this.m = new w5(x9Var, 100);
                    return true;
                }
                h5Var2.a((x9<Float>) x9Var);
                return true;
            }
            h5Var = this.j;
            if (h5Var == null) {
                this.j = new w5(x9Var, 100);
                return true;
            }
        }
        h5Var.a(x9Var);
        return true;
    }

    public Matrix b() {
        this.a.reset();
        h5<?, PointF> h5Var = this.g;
        if (h5Var != null) {
            PointF f = h5Var.f();
            if (f.x != 0.0f || f.y != 0.0f) {
                this.a.preTranslate(f.x, f.y);
            }
        }
        h5<Float, Float> h5Var2 = this.i;
        if (h5Var2 != null) {
            float floatValue = h5Var2 instanceof w5 ? h5Var2.f().floatValue() : ((j5) h5Var2).i();
            if (floatValue != 0.0f) {
                this.a.preRotate(floatValue);
            }
        }
        if (this.k != null) {
            float cos = this.l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r0.i()) + 90.0f));
            float sin = this.l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r4.i()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(this.k.i()));
            e();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            e();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            e();
            float[] fArr3 = this.e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        h5<y9, y9> h5Var3 = this.h;
        if (h5Var3 != null) {
            y9 f3 = h5Var3.f();
            if (f3.a() != 1.0f || f3.b() != 1.0f) {
                this.a.preScale(f3.a(), f3.b());
            }
        }
        h5<PointF, PointF> h5Var4 = this.f;
        if (h5Var4 != null) {
            PointF f4 = h5Var4.f();
            if (f4.x != 0.0f || f4.y != 0.0f) {
                this.a.preTranslate(-f4.x, -f4.y);
            }
        }
        return this.a;
    }

    public void b(float f) {
        h5<Integer, Integer> h5Var = this.j;
        if (h5Var != null) {
            h5Var.a(f);
        }
        h5<?, Float> h5Var2 = this.m;
        if (h5Var2 != null) {
            h5Var2.a(f);
        }
        h5<?, Float> h5Var3 = this.n;
        if (h5Var3 != null) {
            h5Var3.a(f);
        }
        h5<PointF, PointF> h5Var4 = this.f;
        if (h5Var4 != null) {
            h5Var4.a(f);
        }
        h5<?, PointF> h5Var5 = this.g;
        if (h5Var5 != null) {
            h5Var5.a(f);
        }
        h5<y9, y9> h5Var6 = this.h;
        if (h5Var6 != null) {
            h5Var6.a(f);
        }
        h5<Float, Float> h5Var7 = this.i;
        if (h5Var7 != null) {
            h5Var7.a(f);
        }
        j5 j5Var = this.k;
        if (j5Var != null) {
            j5Var.a(f);
        }
        j5 j5Var2 = this.l;
        if (j5Var2 != null) {
            j5Var2.a(f);
        }
    }

    public h5<?, Integer> c() {
        return this.j;
    }

    public h5<?, Float> d() {
        return this.m;
    }
}
