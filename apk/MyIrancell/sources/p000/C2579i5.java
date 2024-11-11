package p000;

import java.util.List;

/* renamed from: i5 */
/* loaded from: classes.dex */
public class C2579i5 extends AbstractC2922m5<Integer> {
    public C2579i5(List<C3346v9<Integer>> list) {
        super(list);
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    Integer mo12099a(C3346v9<Integer> c3346v9, float f) {
        return Integer.valueOf(m12366b(c3346v9, f));
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    /* bridge */ /* synthetic */ Object mo12099a(C3346v9 c3346v9, float f) {
        return mo12099a((C3346v9<Integer>) c3346v9, f);
    }

    /* renamed from: b */
    public int m12366b(C3346v9<Integer> c3346v9, float f) {
        Integer num;
        Integer num2 = c3346v9.f13631b;
        if (num2 == null || c3346v9.f13632c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = num2.intValue();
        int intValue2 = c3346v9.f13632c.intValue();
        C3429x9<A> c3429x9 = this.f10385e;
        return (c3429x9 == 0 || (num = (Integer) c3429x9.m16466a(c3346v9.f13634e, c3346v9.f13635f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, m12106d(), m12107e())) == null) ? C3021o9.m14477a(C3243t9.m15571a(f, 0.0f, 1.0f), intValue, intValue2) : num.intValue();
    }

    /* renamed from: i */
    public int m12367i() {
        return m12366b(m12100a(), m12105c());
    }
}
