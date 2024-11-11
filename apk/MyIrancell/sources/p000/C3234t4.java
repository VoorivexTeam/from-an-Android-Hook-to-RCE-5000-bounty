package p000;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.List;
import p000.AbstractC2538h5;
import p000.C2924m7;

/* renamed from: t4 */
/* loaded from: classes.dex */
public class C3234t4 implements InterfaceC0006a5, AbstractC2538h5.b, InterfaceC3471y4 {

    /* renamed from: b */
    private final String f13186b;

    /* renamed from: c */
    private final C0540f f13187c;

    /* renamed from: d */
    private final AbstractC2538h5<?, PointF> f13188d;

    /* renamed from: e */
    private final AbstractC2538h5<?, PointF> f13189e;

    /* renamed from: f */
    private final C3386w6 f13190f;

    /* renamed from: h */
    private boolean f13192h;

    /* renamed from: a */
    private final Path f13185a = new Path();

    /* renamed from: g */
    private C3070p4 f13191g = new C3070p4();

    public C3234t4(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C3386w6 c3386w6) {
        this.f13186b = c3386w6.m16136a();
        this.f13187c = c0540f;
        this.f13188d = c3386w6.m16138c().mo12378a();
        this.f13189e = c3386w6.m16137b().mo12378a();
        this.f13190f = c3386w6;
        abstractC2976n7.m14279a(this.f13188d);
        abstractC2976n7.m14279a(this.f13189e);
        this.f13188d.m12102a(this);
        this.f13189e.m12102a(this);
    }

    /* renamed from: d */
    private void m15512d() {
        this.f13192h = false;
        this.f13187c.invalidateSelf();
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f13186b;
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public void mo3319a(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        C3243t9.m15577a(c2375d6, i, list, c2375d62, this);
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        AbstractC2538h5<?, PointF> abstractC2538h5;
        if (t == InterfaceC0545k.f3161g) {
            abstractC2538h5 = this.f13188d;
        } else if (t != InterfaceC0545k.f3164j) {
            return;
        } else {
            abstractC2538h5 = this.f13189e;
        }
        abstractC2538h5.m12103a((C3429x9<PointF>) c3429x9);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC3109q4 interfaceC3109q4 = list.get(i);
            if (interfaceC3109q4 instanceof C2498g5) {
                C2498g5 c2498g5 = (C2498g5) interfaceC3109q4;
                if (c2498g5.m11892g() == C2924m7.a.SIMULTANEOUSLY) {
                    this.f13191g.m14714a(c2498g5);
                    c2498g5.m11888a(this);
                }
            }
        }
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        m15512d();
    }

    @Override // p000.InterfaceC0006a5
    /* renamed from: c */
    public Path mo49c() {
        if (this.f13192h) {
            return this.f13185a;
        }
        this.f13185a.reset();
        if (!this.f13190f.m16139d()) {
            PointF mo12108f = this.f13188d.mo12108f();
            float f = mo12108f.x / 2.0f;
            float f2 = mo12108f.y / 2.0f;
            float f3 = f * 0.55228f;
            float f4 = 0.55228f * f2;
            this.f13185a.reset();
            if (this.f13190f.m16140e()) {
                float f5 = -f2;
                this.f13185a.moveTo(0.0f, f5);
                float f6 = 0.0f - f3;
                float f7 = -f;
                float f8 = 0.0f - f4;
                this.f13185a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                float f9 = f4 + 0.0f;
                this.f13185a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                float f10 = f3 + 0.0f;
                this.f13185a.cubicTo(f10, f2, f, f9, f, 0.0f);
                this.f13185a.cubicTo(f, f8, f10, f5, 0.0f, f5);
            } else {
                float f11 = -f2;
                this.f13185a.moveTo(0.0f, f11);
                float f12 = f3 + 0.0f;
                float f13 = 0.0f - f4;
                this.f13185a.cubicTo(f12, f11, f, f13, f, 0.0f);
                float f14 = f4 + 0.0f;
                this.f13185a.cubicTo(f, f14, f12, f2, 0.0f, f2);
                float f15 = 0.0f - f3;
                float f16 = -f;
                this.f13185a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
                this.f13185a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
            }
            PointF mo12108f2 = this.f13189e.mo12108f();
            this.f13185a.offset(mo12108f2.x, mo12108f2.y);
            this.f13185a.close();
            this.f13191g.m14713a(this.f13185a);
        }
        this.f13192h = true;
        return this.f13185a;
    }
}
