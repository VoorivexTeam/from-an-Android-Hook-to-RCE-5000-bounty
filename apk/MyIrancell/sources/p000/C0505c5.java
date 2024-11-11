package p000;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.List;
import p000.AbstractC2538h5;
import p000.C2924m7;

/* renamed from: c5 */
/* loaded from: classes.dex */
public class C0505c5 implements AbstractC2538h5.b, InterfaceC3471y4, InterfaceC0006a5 {

    /* renamed from: c */
    private final String f2946c;

    /* renamed from: d */
    private final boolean f2947d;

    /* renamed from: e */
    private final C0540f f2948e;

    /* renamed from: f */
    private final AbstractC2538h5<?, PointF> f2949f;

    /* renamed from: g */
    private final AbstractC2538h5<?, PointF> f2950g;

    /* renamed from: h */
    private final AbstractC2538h5<?, Float> f2951h;

    /* renamed from: j */
    private boolean f2953j;

    /* renamed from: a */
    private final Path f2944a = new Path();

    /* renamed from: b */
    private final RectF f2945b = new RectF();

    /* renamed from: i */
    private C3070p4 f2952i = new C3070p4();

    public C0505c5(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C2461f7 c2461f7) {
        this.f2946c = c2461f7.m11694b();
        this.f2947d = c2461f7.m11697e();
        this.f2948e = c0540f;
        this.f2949f = c2461f7.m11695c().mo12378a();
        this.f2950g = c2461f7.m11696d().mo12378a();
        this.f2951h = c2461f7.m11693a().mo12378a();
        abstractC2976n7.m14279a(this.f2949f);
        abstractC2976n7.m14279a(this.f2950g);
        abstractC2976n7.m14279a(this.f2951h);
        this.f2949f.m12102a(this);
        this.f2950g.m12102a(this);
        this.f2951h.m12102a(this);
    }

    /* renamed from: d */
    private void m3591d() {
        this.f2953j = false;
        this.f2948e.invalidateSelf();
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f2946c;
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
        if (t == InterfaceC0545k.f3162h) {
            abstractC2538h5 = this.f2950g;
        } else if (t == InterfaceC0545k.f3164j) {
            abstractC2538h5 = this.f2949f;
        } else if (t != InterfaceC0545k.f3163i) {
            return;
        } else {
            abstractC2538h5 = this.f2951h;
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
                    this.f2952i.m14714a(c2498g5);
                    c2498g5.m11888a(this);
                }
            }
        }
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        m3591d();
    }

    @Override // p000.InterfaceC0006a5
    /* renamed from: c */
    public Path mo49c() {
        if (this.f2953j) {
            return this.f2944a;
        }
        this.f2944a.reset();
        if (!this.f2947d) {
            PointF mo12108f = this.f2950g.mo12108f();
            float f = mo12108f.x / 2.0f;
            float f2 = mo12108f.y / 2.0f;
            AbstractC2538h5<?, Float> abstractC2538h5 = this.f2951h;
            float m13400i = abstractC2538h5 == null ? 0.0f : ((C2800j5) abstractC2538h5).m13400i();
            float min = Math.min(f, f2);
            if (m13400i > min) {
                m13400i = min;
            }
            PointF mo12108f2 = this.f2949f.mo12108f();
            this.f2944a.moveTo(mo12108f2.x + f, (mo12108f2.y - f2) + m13400i);
            this.f2944a.lineTo(mo12108f2.x + f, (mo12108f2.y + f2) - m13400i);
            if (m13400i > 0.0f) {
                RectF rectF = this.f2945b;
                float f3 = mo12108f2.x;
                float f4 = m13400i * 2.0f;
                float f5 = mo12108f2.y;
                rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
                this.f2944a.arcTo(this.f2945b, 0.0f, 90.0f, false);
            }
            this.f2944a.lineTo((mo12108f2.x - f) + m13400i, mo12108f2.y + f2);
            if (m13400i > 0.0f) {
                RectF rectF2 = this.f2945b;
                float f6 = mo12108f2.x;
                float f7 = mo12108f2.y;
                float f8 = m13400i * 2.0f;
                rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
                this.f2944a.arcTo(this.f2945b, 90.0f, 90.0f, false);
            }
            this.f2944a.lineTo(mo12108f2.x - f, (mo12108f2.y - f2) + m13400i);
            if (m13400i > 0.0f) {
                RectF rectF3 = this.f2945b;
                float f9 = mo12108f2.x;
                float f10 = mo12108f2.y;
                float f11 = m13400i * 2.0f;
                rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
                this.f2944a.arcTo(this.f2945b, 180.0f, 90.0f, false);
            }
            this.f2944a.lineTo((mo12108f2.x + f) - m13400i, mo12108f2.y - f2);
            if (m13400i > 0.0f) {
                RectF rectF4 = this.f2945b;
                float f12 = mo12108f2.x;
                float f13 = m13400i * 2.0f;
                float f14 = mo12108f2.y;
                rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
                this.f2944a.arcTo(this.f2945b, 270.0f, 90.0f, false);
            }
            this.f2944a.close();
            this.f2952i.m14713a(this.f2944a);
        }
        this.f2953j = true;
        return this.f2944a;
    }
}
