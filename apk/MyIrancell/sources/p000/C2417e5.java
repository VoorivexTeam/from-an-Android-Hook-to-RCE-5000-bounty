package p000;

import android.graphics.Path;
import com.airbnb.lottie.C0540f;
import java.util.List;
import p000.AbstractC2538h5;
import p000.C2924m7;

/* renamed from: e5 */
/* loaded from: classes.dex */
public class C2417e5 implements InterfaceC0006a5, AbstractC2538h5.b {

    /* renamed from: b */
    private final String f9927b;

    /* renamed from: c */
    private final boolean f9928c;

    /* renamed from: d */
    private final C0540f f9929d;

    /* renamed from: e */
    private final AbstractC2538h5<?, Path> f9930e;

    /* renamed from: f */
    private boolean f9931f;

    /* renamed from: a */
    private final Path f9926a = new Path();

    /* renamed from: g */
    private C3070p4 f9932g = new C3070p4();

    public C2417e5(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C2849k7 c2849k7) {
        this.f9927b = c2849k7.m13623a();
        this.f9928c = c2849k7.m13625c();
        this.f9929d = c0540f;
        AbstractC2538h5<C2540h7, Path> mo12378a = c2849k7.m13624b().mo12378a();
        this.f9930e = mo12378a;
        abstractC2976n7.m14279a(mo12378a);
        this.f9930e.m12102a(this);
    }

    /* renamed from: d */
    private void m11541d() {
        this.f9931f = false;
        this.f9929d.invalidateSelf();
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f9927b;
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC3109q4 interfaceC3109q4 = list.get(i);
            if (interfaceC3109q4 instanceof C2498g5) {
                C2498g5 c2498g5 = (C2498g5) interfaceC3109q4;
                if (c2498g5.m11892g() == C2924m7.a.SIMULTANEOUSLY) {
                    this.f9932g.m14714a(c2498g5);
                    c2498g5.m11888a(this);
                }
            }
        }
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        m11541d();
    }

    @Override // p000.InterfaceC0006a5
    /* renamed from: c */
    public Path mo49c() {
        if (this.f9931f) {
            return this.f9926a;
        }
        this.f9926a.reset();
        if (!this.f9928c) {
            this.f9926a.set(this.f9930e.mo12108f());
            this.f9926a.setFillType(Path.FillType.EVEN_ODD);
            this.f9932g.m14713a(this.f9926a);
        }
        this.f9931f = true;
        return this.f9926a;
    }
}
