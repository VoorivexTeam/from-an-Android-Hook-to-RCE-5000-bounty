package p000;

import android.graphics.PointF;
import java.util.List;

/* renamed from: m6 */
/* loaded from: classes.dex */
public class C2923m6 implements InterfaceC3289u6<PointF, PointF> {

    /* renamed from: a */
    private final List<C3346v9<PointF>> f12079a;

    public C2923m6(List<C3346v9<PointF>> list) {
        this.f12079a = list;
    }

    @Override // p000.InterfaceC3289u6
    /* renamed from: a */
    public AbstractC2538h5<PointF, PointF> mo12378a() {
        return this.f12079a.get(0).m15980g() ? new C3110q5(this.f12079a) : new C3071p5(this.f12079a);
    }

    @Override // p000.InterfaceC3289u6
    /* renamed from: b */
    public List<C3346v9<PointF>> mo14046b() {
        return this.f12079a;
    }

    @Override // p000.InterfaceC3289u6
    /* renamed from: c */
    public boolean mo14047c() {
        return this.f12079a.size() == 1 && this.f12079a.get(0).m15980g();
    }
}
