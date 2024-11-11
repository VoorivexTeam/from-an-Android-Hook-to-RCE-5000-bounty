package p000;

import p000.AbstractC2852k9;

/* renamed from: a9 */
/* loaded from: classes.dex */
public class C0011a9 implements InterfaceC2545h9<C3478y9> {

    /* renamed from: a */
    public static final C0011a9 f61a = new C0011a9();

    private C0011a9() {
    }

    @Override // p000.InterfaceC2545h9
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public C3478y9 mo101a(AbstractC2852k9 abstractC2852k9, float f) {
        boolean z = abstractC2852k9.peek() == AbstractC2852k9.b.BEGIN_ARRAY;
        if (z) {
            abstractC2852k9.mo13636a();
        }
        float mo13644j = (float) abstractC2852k9.mo13644j();
        float mo13644j2 = (float) abstractC2852k9.mo13644j();
        while (abstractC2852k9.mo13642h()) {
            abstractC2852k9.mo13649o();
        }
        if (z) {
            abstractC2852k9.mo13639d();
        }
        return new C3478y9((mo13644j / 100.0f) * f, (mo13644j2 / 100.0f) * f);
    }
}
