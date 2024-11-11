package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.Collections;
import p000.AbstractC2538h5;

/* renamed from: v5 */
/* loaded from: classes.dex */
public class C3339v5 {

    /* renamed from: a */
    private final Matrix f13605a = new Matrix();

    /* renamed from: b */
    private final Matrix f13606b;

    /* renamed from: c */
    private final Matrix f13607c;

    /* renamed from: d */
    private final Matrix f13608d;

    /* renamed from: e */
    private final float[] f13609e;

    /* renamed from: f */
    private AbstractC2538h5<PointF, PointF> f13610f;

    /* renamed from: g */
    private AbstractC2538h5<?, PointF> f13611g;

    /* renamed from: h */
    private AbstractC2538h5<C3478y9, C3478y9> f13612h;

    /* renamed from: i */
    private AbstractC2538h5<Float, Float> f13613i;

    /* renamed from: j */
    private AbstractC2538h5<Integer, Integer> f13614j;

    /* renamed from: k */
    private C2800j5 f13615k;

    /* renamed from: l */
    private C2800j5 f13616l;

    /* renamed from: m */
    private AbstractC2538h5<?, Float> f13617m;

    /* renamed from: n */
    private AbstractC2538h5<?, Float> f13618n;

    public C3339v5(C3240t6 c3240t6) {
        this.f13610f = c3240t6.m15540b() == null ? null : c3240t6.m15540b().mo12378a();
        this.f13611g = c3240t6.m15543e() == null ? null : c3240t6.m15543e().mo12378a();
        this.f13612h = c3240t6.m15545g() == null ? null : c3240t6.m15545g().mo12378a();
        this.f13613i = c3240t6.m15544f() == null ? null : c3240t6.m15544f().mo12378a();
        C2800j5 c2800j5 = c3240t6.m15546h() == null ? null : (C2800j5) c3240t6.m15546h().mo12378a();
        this.f13615k = c2800j5;
        if (c2800j5 != null) {
            this.f13606b = new Matrix();
            this.f13607c = new Matrix();
            this.f13608d = new Matrix();
            this.f13609e = new float[9];
        } else {
            this.f13606b = null;
            this.f13607c = null;
            this.f13608d = null;
            this.f13609e = null;
        }
        this.f13616l = c3240t6.m15547i() == null ? null : (C2800j5) c3240t6.m15547i().mo12378a();
        if (c3240t6.m15542d() != null) {
            this.f13614j = c3240t6.m15542d().mo12378a();
        }
        if (c3240t6.m15548j() != null) {
            this.f13617m = c3240t6.m15548j().mo12378a();
        } else {
            this.f13617m = null;
        }
        if (c3240t6.m15541c() != null) {
            this.f13618n = c3240t6.m15541c().mo12378a();
        } else {
            this.f13618n = null;
        }
    }

    /* renamed from: e */
    private void m15937e() {
        for (int i = 0; i < 9; i++) {
            this.f13609e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public Matrix m15938a(float f) {
        AbstractC2538h5<?, PointF> abstractC2538h5 = this.f13611g;
        PointF mo12108f = abstractC2538h5 == null ? null : abstractC2538h5.mo12108f();
        AbstractC2538h5<C3478y9, C3478y9> abstractC2538h52 = this.f13612h;
        C3478y9 mo12108f2 = abstractC2538h52 == null ? null : abstractC2538h52.mo12108f();
        this.f13605a.reset();
        if (mo12108f != null) {
            this.f13605a.preTranslate(mo12108f.x * f, mo12108f.y * f);
        }
        if (mo12108f2 != null) {
            double d = f;
            this.f13605a.preScale((float) Math.pow(mo12108f2.m16608a(), d), (float) Math.pow(mo12108f2.m16610b(), d));
        }
        AbstractC2538h5<Float, Float> abstractC2538h53 = this.f13613i;
        if (abstractC2538h53 != null) {
            float floatValue = abstractC2538h53.mo12108f().floatValue();
            AbstractC2538h5<PointF, PointF> abstractC2538h54 = this.f13610f;
            PointF mo12108f3 = abstractC2538h54 != null ? abstractC2538h54.mo12108f() : null;
            this.f13605a.preRotate(floatValue * f, mo12108f3 == null ? 0.0f : mo12108f3.x, mo12108f3 != null ? mo12108f3.y : 0.0f);
        }
        return this.f13605a;
    }

    /* renamed from: a */
    public AbstractC2538h5<?, Float> m15939a() {
        return this.f13618n;
    }

    /* renamed from: a */
    public void m15940a(AbstractC2538h5.b bVar) {
        AbstractC2538h5<Integer, Integer> abstractC2538h5 = this.f13614j;
        if (abstractC2538h5 != null) {
            abstractC2538h5.m12102a(bVar);
        }
        AbstractC2538h5<?, Float> abstractC2538h52 = this.f13617m;
        if (abstractC2538h52 != null) {
            abstractC2538h52.m12102a(bVar);
        }
        AbstractC2538h5<?, Float> abstractC2538h53 = this.f13618n;
        if (abstractC2538h53 != null) {
            abstractC2538h53.m12102a(bVar);
        }
        AbstractC2538h5<PointF, PointF> abstractC2538h54 = this.f13610f;
        if (abstractC2538h54 != null) {
            abstractC2538h54.m12102a(bVar);
        }
        AbstractC2538h5<?, PointF> abstractC2538h55 = this.f13611g;
        if (abstractC2538h55 != null) {
            abstractC2538h55.m12102a(bVar);
        }
        AbstractC2538h5<C3478y9, C3478y9> abstractC2538h56 = this.f13612h;
        if (abstractC2538h56 != null) {
            abstractC2538h56.m12102a(bVar);
        }
        AbstractC2538h5<Float, Float> abstractC2538h57 = this.f13613i;
        if (abstractC2538h57 != null) {
            abstractC2538h57.m12102a(bVar);
        }
        C2800j5 c2800j5 = this.f13615k;
        if (c2800j5 != null) {
            c2800j5.m12102a(bVar);
        }
        C2800j5 c2800j52 = this.f13616l;
        if (c2800j52 != null) {
            c2800j52.m12102a(bVar);
        }
    }

    /* renamed from: a */
    public void m15941a(AbstractC2976n7 abstractC2976n7) {
        abstractC2976n7.m14279a(this.f13614j);
        abstractC2976n7.m14279a(this.f13617m);
        abstractC2976n7.m14279a(this.f13618n);
        abstractC2976n7.m14279a(this.f13610f);
        abstractC2976n7.m14279a(this.f13611g);
        abstractC2976n7.m14279a(this.f13612h);
        abstractC2976n7.m14279a(this.f13613i);
        abstractC2976n7.m14279a(this.f13615k);
        abstractC2976n7.m14279a(this.f13616l);
    }

    /* renamed from: a */
    public <T> boolean m15942a(T t, C3429x9<T> c3429x9) {
        C2800j5 c2800j5;
        AbstractC2538h5 abstractC2538h5;
        C2800j5 c2800j52;
        AbstractC2538h5<?, Float> abstractC2538h52;
        if (t == InterfaceC0545k.f3159e) {
            abstractC2538h5 = this.f13610f;
            if (abstractC2538h5 == null) {
                this.f13610f = new C3385w5(c3429x9, new PointF());
                return true;
            }
        } else if (t == InterfaceC0545k.f3160f) {
            abstractC2538h5 = this.f13611g;
            if (abstractC2538h5 == null) {
                this.f13611g = new C3385w5(c3429x9, new PointF());
                return true;
            }
        } else if (t == InterfaceC0545k.f3165k) {
            abstractC2538h5 = this.f13612h;
            if (abstractC2538h5 == null) {
                this.f13612h = new C3385w5(c3429x9, new C3478y9());
                return true;
            }
        } else if (t == InterfaceC0545k.f3166l) {
            abstractC2538h5 = this.f13613i;
            if (abstractC2538h5 == null) {
                this.f13613i = new C3385w5(c3429x9, Float.valueOf(0.0f));
                return true;
            }
        } else {
            if (t != InterfaceC0545k.f3157c) {
                if (t != InterfaceC0545k.f3179y || (abstractC2538h52 = this.f13617m) == null) {
                    if (t != InterfaceC0545k.f3180z || (abstractC2538h52 = this.f13618n) == null) {
                        if (t == InterfaceC0545k.f3167m && (c2800j52 = this.f13615k) != null) {
                            if (c2800j52 == null) {
                                this.f13615k = new C2800j5(Collections.singletonList(new C3346v9(Float.valueOf(0.0f))));
                            }
                            abstractC2538h5 = this.f13615k;
                        } else {
                            if (t != InterfaceC0545k.f3168n || (c2800j5 = this.f13616l) == null) {
                                return false;
                            }
                            if (c2800j5 == null) {
                                this.f13616l = new C2800j5(Collections.singletonList(new C3346v9(Float.valueOf(0.0f))));
                            }
                            abstractC2538h5 = this.f13616l;
                        }
                    } else if (abstractC2538h52 == null) {
                        this.f13618n = new C3385w5(c3429x9, 100);
                        return true;
                    }
                } else if (abstractC2538h52 == null) {
                    this.f13617m = new C3385w5(c3429x9, 100);
                    return true;
                }
                abstractC2538h52.m12103a((C3429x9<Float>) c3429x9);
                return true;
            }
            abstractC2538h5 = this.f13614j;
            if (abstractC2538h5 == null) {
                this.f13614j = new C3385w5(c3429x9, 100);
                return true;
            }
        }
        abstractC2538h5.m12103a(c3429x9);
        return true;
    }

    /* renamed from: b */
    public Matrix m15943b() {
        this.f13605a.reset();
        AbstractC2538h5<?, PointF> abstractC2538h5 = this.f13611g;
        if (abstractC2538h5 != null) {
            PointF mo12108f = abstractC2538h5.mo12108f();
            if (mo12108f.x != 0.0f || mo12108f.y != 0.0f) {
                this.f13605a.preTranslate(mo12108f.x, mo12108f.y);
            }
        }
        AbstractC2538h5<Float, Float> abstractC2538h52 = this.f13613i;
        if (abstractC2538h52 != null) {
            float floatValue = abstractC2538h52 instanceof C3385w5 ? abstractC2538h52.mo12108f().floatValue() : ((C2800j5) abstractC2538h52).m13400i();
            if (floatValue != 0.0f) {
                this.f13605a.preRotate(floatValue);
            }
        }
        if (this.f13615k != null) {
            float cos = this.f13616l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r0.m13400i()) + 90.0f));
            float sin = this.f13616l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r4.m13400i()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(this.f13615k.m13400i()));
            m15937e();
            float[] fArr = this.f13609e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f13606b.setValues(fArr);
            m15937e();
            float[] fArr2 = this.f13609e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f13607c.setValues(fArr2);
            m15937e();
            float[] fArr3 = this.f13609e;
            fArr3[0] = cos;
            fArr3[1] = f;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f13608d.setValues(fArr3);
            this.f13607c.preConcat(this.f13606b);
            this.f13608d.preConcat(this.f13607c);
            this.f13605a.preConcat(this.f13608d);
        }
        AbstractC2538h5<C3478y9, C3478y9> abstractC2538h53 = this.f13612h;
        if (abstractC2538h53 != null) {
            C3478y9 mo12108f2 = abstractC2538h53.mo12108f();
            if (mo12108f2.m16608a() != 1.0f || mo12108f2.m16610b() != 1.0f) {
                this.f13605a.preScale(mo12108f2.m16608a(), mo12108f2.m16610b());
            }
        }
        AbstractC2538h5<PointF, PointF> abstractC2538h54 = this.f13610f;
        if (abstractC2538h54 != null) {
            PointF mo12108f3 = abstractC2538h54.mo12108f();
            if (mo12108f3.x != 0.0f || mo12108f3.y != 0.0f) {
                this.f13605a.preTranslate(-mo12108f3.x, -mo12108f3.y);
            }
        }
        return this.f13605a;
    }

    /* renamed from: b */
    public void m15944b(float f) {
        AbstractC2538h5<Integer, Integer> abstractC2538h5 = this.f13614j;
        if (abstractC2538h5 != null) {
            abstractC2538h5.mo12101a(f);
        }
        AbstractC2538h5<?, Float> abstractC2538h52 = this.f13617m;
        if (abstractC2538h52 != null) {
            abstractC2538h52.mo12101a(f);
        }
        AbstractC2538h5<?, Float> abstractC2538h53 = this.f13618n;
        if (abstractC2538h53 != null) {
            abstractC2538h53.mo12101a(f);
        }
        AbstractC2538h5<PointF, PointF> abstractC2538h54 = this.f13610f;
        if (abstractC2538h54 != null) {
            abstractC2538h54.mo12101a(f);
        }
        AbstractC2538h5<?, PointF> abstractC2538h55 = this.f13611g;
        if (abstractC2538h55 != null) {
            abstractC2538h55.mo12101a(f);
        }
        AbstractC2538h5<C3478y9, C3478y9> abstractC2538h56 = this.f13612h;
        if (abstractC2538h56 != null) {
            abstractC2538h56.mo12101a(f);
        }
        AbstractC2538h5<Float, Float> abstractC2538h57 = this.f13613i;
        if (abstractC2538h57 != null) {
            abstractC2538h57.mo12101a(f);
        }
        C2800j5 c2800j5 = this.f13615k;
        if (c2800j5 != null) {
            c2800j5.mo12101a(f);
        }
        C2800j5 c2800j52 = this.f13616l;
        if (c2800j52 != null) {
            c2800j52.mo12101a(f);
        }
    }

    /* renamed from: c */
    public AbstractC2538h5<?, Integer> m15945c() {
        return this.f13614j;
    }

    /* renamed from: d */
    public AbstractC2538h5<?, Float> m15946d() {
        return this.f13617m;
    }
}
