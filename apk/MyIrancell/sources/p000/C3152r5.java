package p000;

import java.util.List;

/* renamed from: r5 */
/* loaded from: classes.dex */
public class C3152r5 extends AbstractC2922m5<C3478y9> {

    /* renamed from: i */
    private final C3478y9 f12911i;

    public C3152r5(List<C3346v9<C3478y9>> list) {
        super(list);
        this.f12911i = new C3478y9();
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo12099a(C3346v9 c3346v9, float f) {
        return mo12099a((C3346v9<C3478y9>) c3346v9, f);
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    public C3478y9 mo12099a(C3346v9<C3478y9> c3346v9, float f) {
        C3478y9 c3478y9;
        C3478y9 c3478y92;
        C3478y9 c3478y93 = c3346v9.f13631b;
        if (c3478y93 == null || (c3478y9 = c3346v9.f13632c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C3478y9 c3478y94 = c3478y93;
        C3478y9 c3478y95 = c3478y9;
        C3429x9<A> c3429x9 = this.f10385e;
        if (c3429x9 != 0 && (c3478y92 = (C3478y9) c3429x9.m16466a(c3346v9.f13634e, c3346v9.f13635f.floatValue(), c3478y94, c3478y95, f, m12106d(), m12107e())) != null) {
            return c3478y92;
        }
        this.f12911i.m16611b(C3243t9.m15581c(c3478y94.m16608a(), c3478y95.m16608a(), f), C3243t9.m15581c(c3478y94.m16610b(), c3478y95.m16610b(), f));
        return this.f12911i;
    }
}
