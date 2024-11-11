package p000;

import java.util.List;

/* renamed from: j5 */
/* loaded from: classes.dex */
public class C2800j5 extends AbstractC2922m5<Float> {
    public C2800j5(List<C3346v9<Float>> list) {
        super(list);
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    Float mo12099a(C3346v9<Float> c3346v9, float f) {
        return Float.valueOf(m13399b(c3346v9, f));
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    /* bridge */ /* synthetic */ Object mo12099a(C3346v9 c3346v9, float f) {
        return mo12099a((C3346v9<Float>) c3346v9, f);
    }

    /* renamed from: b */
    float m13399b(C3346v9<Float> c3346v9, float f) {
        Float f2;
        if (c3346v9.f13631b == null || c3346v9.f13632c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C3429x9<A> c3429x9 = this.f10385e;
        return (c3429x9 == 0 || (f2 = (Float) c3429x9.m16466a(c3346v9.f13634e, c3346v9.f13635f.floatValue(), c3346v9.f13631b, c3346v9.f13632c, f, m12106d(), m12107e())) == null) ? C3243t9.m15581c(c3346v9.m15978e(), c3346v9.m15975b(), f) : f2.floatValue();
    }

    /* renamed from: i */
    public float m13400i() {
        return m13399b(m12100a(), m12105c());
    }
}
