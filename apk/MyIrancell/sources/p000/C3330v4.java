package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C0537c;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2538h5;

/* renamed from: v4 */
/* loaded from: classes.dex */
public class C3330v4 implements InterfaceC3190s4, AbstractC2538h5.b, InterfaceC3471y4 {

    /* renamed from: a */
    private final String f13564a;

    /* renamed from: b */
    private final boolean f13565b;

    /* renamed from: c */
    private final AbstractC2976n7 f13566c;

    /* renamed from: d */
    private final C2452f0<LinearGradient> f13567d = new C2452f0<>();

    /* renamed from: e */
    private final C2452f0<RadialGradient> f13568e = new C2452f0<>();

    /* renamed from: f */
    private final Path f13569f = new Path();

    /* renamed from: g */
    private final Paint f13570g = new C2967n4(1);

    /* renamed from: h */
    private final RectF f13571h = new RectF();

    /* renamed from: i */
    private final List<InterfaceC0006a5> f13572i = new ArrayList();

    /* renamed from: j */
    private final EnumC0452b7 f13573j;

    /* renamed from: k */
    private final AbstractC2538h5<C3474y6, C3474y6> f13574k;

    /* renamed from: l */
    private final AbstractC2538h5<Integer, Integer> f13575l;

    /* renamed from: m */
    private final AbstractC2538h5<PointF, PointF> f13576m;

    /* renamed from: n */
    private final AbstractC2538h5<PointF, PointF> f13577n;

    /* renamed from: o */
    private AbstractC2538h5<ColorFilter, ColorFilter> f13578o;

    /* renamed from: p */
    private C3385w5 f13579p;

    /* renamed from: q */
    private final C0540f f13580q;

    /* renamed from: r */
    private final int f13581r;

    public C3330v4(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C3513z6 c3513z6) {
        this.f13566c = abstractC2976n7;
        this.f13564a = c3513z6.m16781e();
        this.f13565b = c3513z6.m16784h();
        this.f13580q = c0540f;
        this.f13573j = c3513z6.m16780d();
        this.f13569f.setFillType(c3513z6.m16778b());
        this.f13581r = (int) (c0540f.m3806e().m3732c() / 32.0f);
        AbstractC2538h5<C3474y6, C3474y6> mo12378a = c3513z6.m16779c().mo12378a();
        this.f13574k = mo12378a;
        mo12378a.m12102a(this);
        abstractC2976n7.m14279a(this.f13574k);
        AbstractC2538h5<Integer, Integer> mo12378a2 = c3513z6.m16782f().mo12378a();
        this.f13575l = mo12378a2;
        mo12378a2.m12102a(this);
        abstractC2976n7.m14279a(this.f13575l);
        AbstractC2538h5<PointF, PointF> mo12378a3 = c3513z6.m16783g().mo12378a();
        this.f13576m = mo12378a3;
        mo12378a3.m12102a(this);
        abstractC2976n7.m14279a(this.f13576m);
        AbstractC2538h5<PointF, PointF> mo12378a4 = c3513z6.m16777a().mo12378a();
        this.f13577n = mo12378a4;
        mo12378a4.m12102a(this);
        abstractC2976n7.m14279a(this.f13577n);
    }

    /* renamed from: a */
    private int[] m15920a(int[] iArr) {
        C3385w5 c3385w5 = this.f13579p;
        if (c3385w5 != null) {
            Integer[] numArr = (Integer[]) c3385w5.mo12108f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: d */
    private int m15921d() {
        int round = Math.round(this.f13576m.m12107e() * this.f13581r);
        int round2 = Math.round(this.f13577n.m12107e() * this.f13581r);
        int round3 = Math.round(this.f13574k.m12107e() * this.f13581r);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: e */
    private LinearGradient m15922e() {
        long m15921d = m15921d();
        LinearGradient m11655c = this.f13567d.m11655c(m15921d);
        if (m11655c != null) {
            return m11655c;
        }
        PointF mo12108f = this.f13576m.mo12108f();
        PointF mo12108f2 = this.f13577n.mo12108f();
        C3474y6 mo12108f3 = this.f13574k.mo12108f();
        LinearGradient linearGradient = new LinearGradient(mo12108f.x, mo12108f.y, mo12108f2.x, mo12108f2.y, m15920a(mo12108f3.m16583a()), mo12108f3.m16584b(), Shader.TileMode.CLAMP);
        this.f13567d.m11656c(m15921d, linearGradient);
        return linearGradient;
    }

    /* renamed from: f */
    private RadialGradient m15923f() {
        long m15921d = m15921d();
        RadialGradient m11655c = this.f13568e.m11655c(m15921d);
        if (m11655c != null) {
            return m11655c;
        }
        PointF mo12108f = this.f13576m.mo12108f();
        PointF mo12108f2 = this.f13577n.mo12108f();
        C3474y6 mo12108f3 = this.f13574k.mo12108f();
        int[] m15920a = m15920a(mo12108f3.m16583a());
        float[] m16584b = mo12108f3.m16584b();
        float f = mo12108f.x;
        float f2 = mo12108f.y;
        float hypot = (float) Math.hypot(mo12108f2.x - f, mo12108f2.y - f2);
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, m15920a, m16584b, Shader.TileMode.CLAMP);
        this.f13568e.m11656c(m15921d, radialGradient);
        return radialGradient;
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f13564a;
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11275a(Canvas canvas, Matrix matrix, int i) {
        if (this.f13565b) {
            return;
        }
        C0537c.m3721a("GradientFillContent#draw");
        this.f13569f.reset();
        for (int i2 = 0; i2 < this.f13572i.size(); i2++) {
            this.f13569f.addPath(this.f13572i.get(i2).mo49c(), matrix);
        }
        this.f13569f.computeBounds(this.f13571h, false);
        Shader m15922e = this.f13573j == EnumC0452b7.LINEAR ? m15922e() : m15923f();
        m15922e.setLocalMatrix(matrix);
        this.f13570g.setShader(m15922e);
        AbstractC2538h5<ColorFilter, ColorFilter> abstractC2538h5 = this.f13578o;
        if (abstractC2538h5 != null) {
            this.f13570g.setColorFilter(abstractC2538h5.mo12108f());
        }
        this.f13570g.setAlpha(C3243t9.m15575a((int) ((((i / 255.0f) * this.f13575l.mo12108f().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f13569f, this.f13570g);
        C0537c.m3722b("GradientFillContent#draw");
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        this.f13569f.reset();
        for (int i = 0; i < this.f13572i.size(); i++) {
            this.f13569f.addPath(this.f13572i.get(i).mo49c(), matrix);
        }
        this.f13569f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public void mo3319a(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        C3243t9.m15577a(c2375d6, i, list, c2375d62, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        AbstractC2976n7 abstractC2976n7;
        AbstractC2538h5<?, ?> abstractC2538h5;
        if (t == InterfaceC0545k.f3158d) {
            this.f13575l.m12103a((C3429x9<Integer>) c3429x9);
            return;
        }
        if (t == InterfaceC0545k.f3153C) {
            if (c3429x9 == null) {
                this.f13578o = null;
                return;
            }
            C3385w5 c3385w5 = new C3385w5(c3429x9);
            this.f13578o = c3385w5;
            c3385w5.m12102a(this);
            abstractC2976n7 = this.f13566c;
            abstractC2538h5 = this.f13578o;
        } else {
            if (t != InterfaceC0545k.f3154D) {
                return;
            }
            if (c3429x9 == null) {
                C3385w5 c3385w52 = this.f13579p;
                if (c3385w52 != null) {
                    this.f13566c.m14283b(c3385w52);
                }
                this.f13579p = null;
                return;
            }
            C3385w5 c3385w53 = new C3385w5(c3429x9);
            this.f13579p = c3385w53;
            c3385w53.m12102a(this);
            abstractC2976n7 = this.f13566c;
            abstractC2538h5 = this.f13579p;
        }
        abstractC2976n7.m14279a(abstractC2538h5);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC3109q4 interfaceC3109q4 = list2.get(i);
            if (interfaceC3109q4 instanceof InterfaceC0006a5) {
                this.f13572i.add((InterfaceC0006a5) interfaceC3109q4);
            }
        }
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        this.f13580q.invalidateSelf();
    }
}
