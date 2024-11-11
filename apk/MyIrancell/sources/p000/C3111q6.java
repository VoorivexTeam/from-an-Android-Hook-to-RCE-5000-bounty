package p000;

import android.graphics.PointF;
import java.util.List;

/* renamed from: q6 */
/* loaded from: classes.dex */
public class C3111q6 implements InterfaceC3289u6<PointF, PointF> {

    /* renamed from: a */
    private final C2801j6 f12696a;

    /* renamed from: b */
    private final C2801j6 f12697b;

    public C3111q6(C2801j6 c2801j6, C2801j6 c2801j62) {
        this.f12696a = c2801j6;
        this.f12697b = c2801j62;
    }

    @Override // p000.InterfaceC3289u6
    /* renamed from: a */
    public AbstractC2538h5<PointF, PointF> mo12378a() {
        return new C3238t5(this.f12696a.mo12378a(), this.f12697b.mo12378a());
    }

    @Override // p000.InterfaceC3289u6
    /* renamed from: b */
    public List<C3346v9<PointF>> mo14046b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p000.InterfaceC3289u6
    /* renamed from: c */
    public boolean mo14047c() {
        return this.f12696a.mo14047c() && this.f12697b.mo14047c();
    }
}
