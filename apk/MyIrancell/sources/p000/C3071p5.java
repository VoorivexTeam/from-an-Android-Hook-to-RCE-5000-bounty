package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: p5 */
/* loaded from: classes.dex */
public class C3071p5 extends AbstractC2922m5<PointF> {

    /* renamed from: i */
    private final PointF f12555i;

    /* renamed from: j */
    private final float[] f12556j;

    /* renamed from: k */
    private C3014o5 f12557k;

    /* renamed from: l */
    private PathMeasure f12558l;

    public C3071p5(List<? extends C3346v9<PointF>> list) {
        super(list);
        this.f12555i = new PointF();
        this.f12556j = new float[2];
        this.f12558l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    public PointF mo12099a(C3346v9<PointF> c3346v9, float f) {
        PointF pointF;
        C3014o5 c3014o5 = (C3014o5) c3346v9;
        Path m14426i = c3014o5.m14426i();
        if (m14426i == null) {
            return c3346v9.f13631b;
        }
        C3429x9<A> c3429x9 = this.f10385e;
        if (c3429x9 != 0 && (pointF = (PointF) c3429x9.m16466a(c3014o5.f13634e, c3014o5.f13635f.floatValue(), c3014o5.f13631b, c3014o5.f13632c, m12106d(), f, m12107e())) != null) {
            return pointF;
        }
        if (this.f12557k != c3014o5) {
            this.f12558l.setPath(m14426i, false);
            this.f12557k = c3014o5;
        }
        PathMeasure pathMeasure = this.f12558l;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f12556j, null);
        PointF pointF2 = this.f12555i;
        float[] fArr = this.f12556j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f12555i;
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo12099a(C3346v9 c3346v9, float f) {
        return mo12099a((C3346v9<PointF>) c3346v9, f);
    }
}
