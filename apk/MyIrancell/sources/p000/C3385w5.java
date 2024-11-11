package p000;

import java.util.Collections;

/* renamed from: w5 */
/* loaded from: classes.dex */
public class C3385w5<K, A> extends AbstractC2538h5<K, A> {

    /* renamed from: i */
    private final A f13769i;

    public C3385w5(C3429x9<A> c3429x9) {
        this(c3429x9, null);
    }

    public C3385w5(C3429x9<A> c3429x9, A a) {
        super(Collections.emptyList());
        new C3390w9();
        m12103a(c3429x9);
        this.f13769i = a;
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    A mo12099a(C3346v9<K> c3346v9, float f) {
        return mo12108f();
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: b */
    float mo12104b() {
        return 1.0f;
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: f */
    public A mo12108f() {
        C3429x9<A> c3429x9 = this.f10385e;
        A a = this.f13769i;
        return c3429x9.m16466a(0.0f, 0.0f, a, a, m12107e(), m12107e(), m12107e());
    }

    @Override // p000.AbstractC2538h5
    /* renamed from: g */
    public void mo12109g() {
        if (this.f10385e != null) {
            super.mo12109g();
        }
    }
}
