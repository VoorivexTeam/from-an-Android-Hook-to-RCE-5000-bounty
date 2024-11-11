package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;

/* renamed from: w4 */
/* loaded from: classes.dex */
public class C3384w4 extends AbstractC3013o4 {

    /* renamed from: o */
    private final String f13757o;

    /* renamed from: p */
    private final boolean f13758p;

    /* renamed from: q */
    private final C2452f0<LinearGradient> f13759q;

    /* renamed from: r */
    private final C2452f0<RadialGradient> f13760r;

    /* renamed from: s */
    private final RectF f13761s;

    /* renamed from: t */
    private final EnumC0452b7 f13762t;

    /* renamed from: u */
    private final int f13763u;

    /* renamed from: v */
    private final AbstractC2538h5<C3474y6, C3474y6> f13764v;

    /* renamed from: w */
    private final AbstractC2538h5<PointF, PointF> f13765w;

    /* renamed from: x */
    private final AbstractC2538h5<PointF, PointF> f13766x;

    /* renamed from: y */
    private C3385w5 f13767y;

    public C3384w4(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C0008a7 c0008a7) {
        super(c0540f, abstractC2976n7, c0008a7.m74a().toPaintCap(), c0008a7.m80f().toPaintJoin(), c0008a7.m82h(), c0008a7.m84j(), c0008a7.m86l(), c0008a7.m81g(), c0008a7.m76b());
        this.f13759q = new C2452f0<>();
        this.f13760r = new C2452f0<>();
        this.f13761s = new RectF();
        this.f13757o = c0008a7.m83i();
        this.f13762t = c0008a7.m79e();
        this.f13758p = c0008a7.m87m();
        this.f13763u = (int) (c0540f.m3806e().m3732c() / 32.0f);
        AbstractC2538h5<C3474y6, C3474y6> mo12378a = c0008a7.m78d().mo12378a();
        this.f13764v = mo12378a;
        mo12378a.m12102a(this);
        abstractC2976n7.m14279a(this.f13764v);
        AbstractC2538h5<PointF, PointF> mo12378a2 = c0008a7.m85k().mo12378a();
        this.f13765w = mo12378a2;
        mo12378a2.m12102a(this);
        abstractC2976n7.m14279a(this.f13765w);
        AbstractC2538h5<PointF, PointF> mo12378a3 = c0008a7.m77c().mo12378a();
        this.f13766x = mo12378a3;
        mo12378a3.m12102a(this);
        abstractC2976n7.m14279a(this.f13766x);
    }

    /* renamed from: a */
    private int[] m16129a(int[] iArr) {
        C3385w5 c3385w5 = this.f13767y;
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
    private int m16130d() {
        int round = Math.round(this.f13765w.m12107e() * this.f13763u);
        int round2 = Math.round(this.f13766x.m12107e() * this.f13763u);
        int round3 = Math.round(this.f13764v.m12107e() * this.f13763u);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: e */
    private LinearGradient m16131e() {
        long m16130d = m16130d();
        LinearGradient m11655c = this.f13759q.m11655c(m16130d);
        if (m11655c != null) {
            return m11655c;
        }
        PointF mo12108f = this.f13765w.mo12108f();
        PointF mo12108f2 = this.f13766x.mo12108f();
        C3474y6 mo12108f3 = this.f13764v.mo12108f();
        LinearGradient linearGradient = new LinearGradient(mo12108f.x, mo12108f.y, mo12108f2.x, mo12108f2.y, m16129a(mo12108f3.m16583a()), mo12108f3.m16584b(), Shader.TileMode.CLAMP);
        this.f13759q.m11656c(m16130d, linearGradient);
        return linearGradient;
    }

    /* renamed from: f */
    private RadialGradient m16132f() {
        long m16130d = m16130d();
        RadialGradient m11655c = this.f13760r.m11655c(m16130d);
        if (m11655c != null) {
            return m11655c;
        }
        PointF mo12108f = this.f13765w.mo12108f();
        PointF mo12108f2 = this.f13766x.mo12108f();
        C3474y6 mo12108f3 = this.f13764v.mo12108f();
        int[] m16129a = m16129a(mo12108f3.m16583a());
        float[] m16584b = mo12108f3.m16584b();
        RadialGradient radialGradient = new RadialGradient(mo12108f.x, mo12108f.y, (float) Math.hypot(mo12108f2.x - r7, mo12108f2.y - r8), m16129a, m16584b, Shader.TileMode.CLAMP);
        this.f13760r.m11656c(m16130d, radialGradient);
        return radialGradient;
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f13757o;
    }

    @Override // p000.AbstractC3013o4, p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11275a(Canvas canvas, Matrix matrix, int i) {
        if (this.f13758p) {
            return;
        }
        mo11276a(this.f13761s, matrix, false);
        Shader m16131e = this.f13762t == EnumC0452b7.LINEAR ? m16131e() : m16132f();
        m16131e.setLocalMatrix(matrix);
        this.f12399i.setShader(m16131e);
        super.mo11275a(canvas, matrix, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC3013o4, p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        super.mo3320a((C3384w4) t, (C3429x9<C3384w4>) c3429x9);
        if (t == InterfaceC0545k.f3154D) {
            if (c3429x9 == null) {
                C3385w5 c3385w5 = this.f13767y;
                if (c3385w5 != null) {
                    this.f12396f.m14283b(c3385w5);
                }
                this.f13767y = null;
                return;
            }
            C3385w5 c3385w52 = new C3385w5(c3429x9);
            this.f13767y = c3385w52;
            c3385w52.m12102a(this);
            this.f12396f.m14279a(this.f13767y);
        }
    }
}
