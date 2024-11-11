package p000;

import java.util.List;

/* renamed from: l5 */
/* loaded from: classes.dex */
public class C2885l5 extends AbstractC2922m5<Integer> {
    public C2885l5(List<C3346v9<Integer>> list) {
        super(list);
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    Integer mo12099a(C3346v9<Integer> c3346v9, float f) {
        return Integer.valueOf(m13805b(c3346v9, f));
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    /* bridge */ /* synthetic */ Object mo12099a(C3346v9 c3346v9, float f) {
        return mo12099a((C3346v9<Integer>) c3346v9, f);
    }

    /* renamed from: b */
    int m13805b(C3346v9<Integer> c3346v9, float f) {
        Integer num;
        if (c3346v9.f13631b == null || c3346v9.f13632c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C3429x9<A> c3429x9 = this.f10385e;
        return (c3429x9 == 0 || (num = (Integer) c3429x9.m16466a(c3346v9.f13634e, c3346v9.f13635f.floatValue(), c3346v9.f13631b, c3346v9.f13632c, f, m12106d(), m12107e())) == null) ? C3243t9.m15574a(c3346v9.m15979f(), c3346v9.m15976c(), f) : num.intValue();
    }

    /* renamed from: i */
    public int m13806i() {
        return m13805b(m12100a(), m12105c());
    }
}
