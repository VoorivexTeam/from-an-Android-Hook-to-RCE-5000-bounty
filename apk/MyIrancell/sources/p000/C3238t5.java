package p000;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: t5 */
/* loaded from: classes.dex */
public class C3238t5 extends AbstractC2538h5<PointF, PointF> {

    /* renamed from: i */
    private final PointF f13196i;

    /* renamed from: j */
    private final AbstractC2538h5<Float, Float> f13197j;

    /* renamed from: k */
    private final AbstractC2538h5<Float, Float> f13198k;

    public C3238t5(AbstractC2538h5<Float, Float> abstractC2538h5, AbstractC2538h5<Float, Float> abstractC2538h52) {
        super(Collections.emptyList());
        this.f13196i = new PointF();
        this.f13197j = abstractC2538h5;
        this.f13198k = abstractC2538h52;
        mo12101a(m12107e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    public PointF mo12099a(C3346v9<PointF> c3346v9, float f) {
        return this.f13196i;
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    public void mo12101a(float f) {
        this.f13197j.mo12101a(f);
        this.f13198k.mo12101a(f);
        this.f13196i.set(this.f13197j.mo12108f().floatValue(), this.f13198k.mo12108f().floatValue());
        for (int i = 0; i < this.f10381a.size(); i++) {
            this.f10381a.get(i).mo3322b();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC2538h5
    /* renamed from: f */
    public PointF mo12108f() {
        return mo12099a((C3346v9<PointF>) null, 0.0f);
    }
}
