package p000;

import android.graphics.PointF;
import java.util.List;

/* renamed from: q5 */
/* loaded from: classes.dex */
public class C3110q5 extends AbstractC2922m5<PointF> {

    /* renamed from: i */
    private final PointF f12694i;

    public C3110q5(List<C3346v9<PointF>> list) {
        super(list);
        this.f12694i = new PointF();
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    public PointF mo12099a(C3346v9<PointF> c3346v9, float f) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c3346v9.f13631b;
        if (pointF3 == null || (pointF = c3346v9.f13632c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C3429x9<A> c3429x9 = this.f10385e;
        if (c3429x9 != 0 && (pointF2 = (PointF) c3429x9.m16466a(c3346v9.f13634e, c3346v9.f13635f.floatValue(), pointF4, pointF5, f, m12106d(), m12107e())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f12694i;
        float f2 = pointF4.x;
        float f3 = f2 + ((pointF5.x - f2) * f);
        float f4 = pointF4.y;
        pointF6.set(f3, f4 + (f * (pointF5.y - f4)));
        return this.f12694i;
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo12099a(C3346v9 c3346v9, float f) {
        return mo12099a((C3346v9<PointF>) c3346v9, f);
    }
}
