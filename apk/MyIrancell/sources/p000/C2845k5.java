package p000;

import java.util.List;

/* renamed from: k5 */
/* loaded from: classes.dex */
public class C2845k5 extends AbstractC2922m5<C3474y6> {

    /* renamed from: i */
    private final C3474y6 f11648i;

    public C2845k5(List<C3346v9<C3474y6>> list) {
        super(list);
        C3474y6 c3474y6 = list.get(0).f13631b;
        int m16585c = c3474y6 != null ? c3474y6.m16585c() : 0;
        this.f11648i = new C3474y6(new float[m16585c], new int[m16585c]);
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    /* bridge */ /* synthetic */ Object mo12099a(C3346v9 c3346v9, float f) {
        return mo12099a((C3346v9<C3474y6>) c3346v9, f);
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    C3474y6 mo12099a(C3346v9<C3474y6> c3346v9, float f) {
        this.f11648i.m16582a(c3346v9.f13631b, c3346v9.f13632c, f);
        return this.f11648i;
    }
}
