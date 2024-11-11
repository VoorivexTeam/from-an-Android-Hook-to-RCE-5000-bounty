package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;

/* renamed from: f5 */
/* loaded from: classes.dex */
public class C2459f5 extends AbstractC3013o4 {

    /* renamed from: o */
    private final AbstractC2976n7 f10082o;

    /* renamed from: p */
    private final String f10083p;

    /* renamed from: q */
    private final boolean f10084q;

    /* renamed from: r */
    private final AbstractC2538h5<Integer, Integer> f10085r;

    /* renamed from: s */
    private AbstractC2538h5<ColorFilter, ColorFilter> f10086s;

    public C2459f5(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C2887l7 c2887l7) {
        super(c0540f, abstractC2976n7, c2887l7.m13819a().toPaintCap(), c2887l7.m13822d().toPaintJoin(), c2887l7.m13824f(), c2887l7.m13826h(), c2887l7.m13827i(), c2887l7.m13823e(), c2887l7.m13821c());
        this.f10082o = abstractC2976n7;
        this.f10083p = c2887l7.m13825g();
        this.f10084q = c2887l7.m13828j();
        AbstractC2538h5<Integer, Integer> mo12378a = c2887l7.m13820b().mo12378a();
        this.f10085r = mo12378a;
        mo12378a.m12102a(this);
        abstractC2976n7.m14279a(this.f10085r);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f10083p;
    }

    @Override // p000.AbstractC3013o4, p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11275a(Canvas canvas, Matrix matrix, int i) {
        if (this.f10084q) {
            return;
        }
        this.f12399i.setColor(((C2579i5) this.f10085r).m12367i());
        AbstractC2538h5<ColorFilter, ColorFilter> abstractC2538h5 = this.f10086s;
        if (abstractC2538h5 != null) {
            this.f12399i.setColorFilter(abstractC2538h5.mo12108f());
        }
        super.mo11275a(canvas, matrix, i);
    }

    @Override // p000.AbstractC3013o4, p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        super.mo3320a((C2459f5) t, (C3429x9<C2459f5>) c3429x9);
        if (t == InterfaceC0545k.f3156b) {
            this.f10085r.m12103a((C3429x9<Integer>) c3429x9);
            return;
        }
        if (t == InterfaceC0545k.f3153C) {
            if (c3429x9 == null) {
                this.f10086s = null;
                return;
            }
            C3385w5 c3385w5 = new C3385w5(c3429x9);
            this.f10086s = c3385w5;
            c3385w5.m12102a(this);
            this.f10082o.m14279a(this.f10085r);
        }
    }
}
