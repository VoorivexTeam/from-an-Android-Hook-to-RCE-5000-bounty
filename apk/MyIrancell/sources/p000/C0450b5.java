package p000;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.List;
import p000.AbstractC2538h5;
import p000.C2419e7;
import p000.C2924m7;

/* renamed from: b5 */
/* loaded from: classes.dex */
public class C0450b5 implements InterfaceC0006a5, AbstractC2538h5.b, InterfaceC3471y4 {

    /* renamed from: b */
    private final String f2726b;

    /* renamed from: c */
    private final C0540f f2727c;

    /* renamed from: d */
    private final C2419e7.a f2728d;

    /* renamed from: e */
    private final boolean f2729e;

    /* renamed from: f */
    private final AbstractC2538h5<?, Float> f2730f;

    /* renamed from: g */
    private final AbstractC2538h5<?, PointF> f2731g;

    /* renamed from: h */
    private final AbstractC2538h5<?, Float> f2732h;

    /* renamed from: i */
    private final AbstractC2538h5<?, Float> f2733i;

    /* renamed from: j */
    private final AbstractC2538h5<?, Float> f2734j;

    /* renamed from: k */
    private final AbstractC2538h5<?, Float> f2735k;

    /* renamed from: l */
    private final AbstractC2538h5<?, Float> f2736l;

    /* renamed from: n */
    private boolean f2738n;

    /* renamed from: a */
    private final Path f2725a = new Path();

    /* renamed from: m */
    private C3070p4 f2737m = new C3070p4();

    /* renamed from: b5$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2739a;

        static {
            int[] iArr = new int[C2419e7.a.values().length];
            f2739a = iArr;
            try {
                iArr[C2419e7.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2739a[C2419e7.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C0450b5(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C2419e7 c2419e7) {
        AbstractC2538h5<Float, Float> abstractC2538h5;
        this.f2727c = c0540f;
        this.f2726b = c2419e7.m11556c();
        this.f2728d = c2419e7.m11562i();
        this.f2729e = c2419e7.m11563j();
        this.f2730f = c2419e7.m11559f().mo12378a();
        this.f2731g = c2419e7.m11560g().mo12378a();
        this.f2732h = c2419e7.m11561h().mo12378a();
        this.f2734j = c2419e7.m11557d().mo12378a();
        this.f2736l = c2419e7.m11558e().mo12378a();
        if (this.f2728d == C2419e7.a.STAR) {
            this.f2733i = c2419e7.m11554a().mo12378a();
            abstractC2538h5 = c2419e7.m11555b().mo12378a();
        } else {
            abstractC2538h5 = null;
            this.f2733i = null;
        }
        this.f2735k = abstractC2538h5;
        abstractC2976n7.m14279a(this.f2730f);
        abstractC2976n7.m14279a(this.f2731g);
        abstractC2976n7.m14279a(this.f2732h);
        abstractC2976n7.m14279a(this.f2734j);
        abstractC2976n7.m14279a(this.f2736l);
        if (this.f2728d == C2419e7.a.STAR) {
            abstractC2976n7.m14279a(this.f2733i);
            abstractC2976n7.m14279a(this.f2735k);
        }
        this.f2730f.m12102a(this);
        this.f2731g.m12102a(this);
        this.f2732h.m12102a(this);
        this.f2734j.m12102a(this);
        this.f2736l.m12102a(this);
        if (this.f2728d == C2419e7.a.STAR) {
            this.f2733i.m12102a(this);
            this.f2735k.m12102a(this);
        }
    }

    /* renamed from: d */
    private void m3315d() {
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor(this.f2730f.mo12108f().floatValue());
        double radians = Math.toRadians((this.f2732h == null ? 0.0d : r2.mo12108f().floatValue()) - 90.0d);
        double d4 = floor;
        Double.isNaN(d4);
        float floatValue = this.f2736l.mo12108f().floatValue() / 100.0f;
        float floatValue2 = this.f2734j.mo12108f().floatValue();
        double d5 = floatValue2;
        double cos = Math.cos(radians);
        Double.isNaN(d5);
        float f = (float) (cos * d5);
        double sin = Math.sin(radians);
        Double.isNaN(d5);
        float f2 = (float) (sin * d5);
        this.f2725a.moveTo(f, f2);
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
                this.f2725a.cubicTo(f - (cos3 * f5), f2 - (sin3 * f5), f3 + (((float) Math.cos(atan22)) * f5), f4 + (f5 * ((float) Math.sin(atan22))), f3, f4);
            } else {
                d = d7;
                d2 = d5;
                d3 = d6;
                i = i2;
                this.f2725a.lineTo(f3, f4);
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
        PointF mo12108f = this.f2731g.mo12108f();
        this.f2725a.offset(mo12108f.x, mo12108f.y);
        this.f2725a.close();
    }

    /* renamed from: e */
    private void m3316e() {
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
        float floatValue = this.f2730f.mo12108f().floatValue();
        double radians = Math.toRadians((this.f2732h == null ? 0.0d : r2.mo12108f().floatValue()) - 90.0d);
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
        float floatValue2 = this.f2734j.mo12108f().floatValue();
        float floatValue3 = this.f2733i.mo12108f().floatValue();
        AbstractC2538h5<?, Float> abstractC2538h5 = this.f2735k;
        float floatValue4 = abstractC2538h5 != null ? abstractC2538h5.mo12108f().floatValue() / 100.0f : 0.0f;
        AbstractC2538h5<?, Float> abstractC2538h52 = this.f2736l;
        float floatValue5 = abstractC2538h52 != null ? abstractC2538h52.mo12108f().floatValue() / 100.0f : 0.0f;
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
            this.f2725a.moveTo(f17, f18);
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
            this.f2725a.moveTo(f3, f4);
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
                PointF mo12108f = this.f2731g.mo12108f();
                this.f2725a.offset(mo12108f.x, mo12108f.y);
                this.f2725a.close();
                return;
            }
            float f20 = z ? f : floatValue3;
            float f21 = (f5 == 0.0f || d10 != ceil - 2.0d) ? f2 : (f13 * f15) / 2.0f;
            if (f5 == 0.0f || d10 != ceil - 1.0d) {
                f6 = f13;
                f7 = f20;
                f8 = f;
            } else {
                f6 = f13;
                f8 = f;
                f7 = f5;
            }
            double d11 = f7;
            double cos3 = Math.cos(d2);
            Double.isNaN(d11);
            float f22 = (float) (d11 * cos3);
            double sin3 = Math.sin(d2);
            Double.isNaN(d11);
            float f23 = (float) (d11 * sin3);
            if (floatValue4 == 0.0f && f19 == 0.0f) {
                this.f2725a.lineTo(f22, f23);
                d3 = d2;
                f9 = floatValue3;
                f10 = floatValue4;
                f11 = f2;
                f12 = f21;
            } else {
                f9 = floatValue3;
                f10 = floatValue4;
                double atan2 = (float) (Math.atan2(f4, f3) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin4 = (float) Math.sin(atan2);
                d3 = d2;
                f11 = f2;
                f12 = f21;
                double atan22 = (float) (Math.atan2(f23, f22) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin5 = (float) Math.sin(atan22);
                float f24 = z ? f10 : f19;
                float f25 = z ? f19 : f10;
                float f26 = (z ? f9 : f8) * f24 * 0.47829f;
                float f27 = cos4 * f26;
                float f28 = f26 * sin4;
                float f29 = (z ? f8 : f9) * f25 * 0.47829f;
                float f30 = cos5 * f29;
                float f31 = f29 * sin5;
                if (f15 != 0.0f) {
                    if (i == 0) {
                        f27 *= f15;
                        f28 *= f15;
                    } else if (d10 == ceil - 1.0d) {
                        f30 *= f15;
                        f31 *= f15;
                    }
                }
                this.f2725a.cubicTo(f3 - f27, f4 - f28, f22 + f30, f23 + f31, f22, f23);
            }
            double d12 = f12;
            Double.isNaN(d12);
            z = !z;
            i++;
            f4 = f23;
            d2 = d3 + d12;
            f2 = f11;
            f3 = f22;
            f = f8;
            f13 = f6;
            floatValue3 = f9;
            floatValue4 = f10;
        }
    }

    /* renamed from: f */
    private void m3317f() {
        this.f2738n = false;
        this.f2727c.invalidateSelf();
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f2726b;
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public void mo3319a(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        C3243t9.m15577a(c2375d6, i, list, c2375d62, this);
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        AbstractC2538h5 abstractC2538h5;
        AbstractC2538h5<?, Float> abstractC2538h52;
        if (t == InterfaceC0545k.f3173s) {
            abstractC2538h5 = this.f2730f;
        } else if (t == InterfaceC0545k.f3174t) {
            abstractC2538h5 = this.f2732h;
        } else {
            if (t != InterfaceC0545k.f3164j) {
                if (t != InterfaceC0545k.f3175u || (abstractC2538h52 = this.f2733i) == null) {
                    if (t == InterfaceC0545k.f3176v) {
                        abstractC2538h5 = this.f2734j;
                    } else if (t != InterfaceC0545k.f3177w || (abstractC2538h52 = this.f2735k) == null) {
                        if (t != InterfaceC0545k.f3178x) {
                            return;
                        } else {
                            abstractC2538h5 = this.f2736l;
                        }
                    }
                }
                abstractC2538h52.m12103a((C3429x9<Float>) c3429x9);
                return;
            }
            abstractC2538h5 = this.f2731g;
        }
        abstractC2538h5.m12103a(c3429x9);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC3109q4 interfaceC3109q4 = list.get(i);
            if (interfaceC3109q4 instanceof C2498g5) {
                C2498g5 c2498g5 = (C2498g5) interfaceC3109q4;
                if (c2498g5.m11892g() == C2924m7.a.SIMULTANEOUSLY) {
                    this.f2737m.m14714a(c2498g5);
                    c2498g5.m11888a(this);
                }
            }
        }
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        m3317f();
    }

    @Override // p000.InterfaceC0006a5
    /* renamed from: c */
    public Path mo49c() {
        if (this.f2738n) {
            return this.f2725a;
        }
        this.f2725a.reset();
        if (!this.f2729e) {
            int i = a.f2739a[this.f2728d.ordinal()];
            if (i == 1) {
                m3316e();
            } else if (i == 2) {
                m3315d();
            }
            this.f2725a.close();
            this.f2737m.m14713a(this.f2725a);
        }
        this.f2738n = true;
        return this.f2725a;
    }
}
