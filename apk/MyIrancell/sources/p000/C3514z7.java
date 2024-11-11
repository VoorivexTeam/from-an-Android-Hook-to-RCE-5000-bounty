package p000;

import com.airbnb.lottie.C0538d;
import p000.AbstractC2852k9;

/* renamed from: z7 */
/* loaded from: classes.dex */
public class C3514z7 {

    /* renamed from: a */
    private static AbstractC2852k9.a f14352a = AbstractC2852k9.a.m13650a("a");

    /* renamed from: b */
    private static AbstractC2852k9.a f14353b = AbstractC2852k9.a.m13650a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C3192s6 m16788a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        abstractC2852k9.mo13638c();
        C3192s6 c3192s6 = null;
        while (abstractC2852k9.mo13642h()) {
            if (abstractC2852k9.mo13634a(f14352a) != 0) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                c3192s6 = m16789b(abstractC2852k9, c0538d);
            }
        }
        abstractC2852k9.mo13640e();
        return c3192s6 == null ? new C3192s6(null, null, null, null) : c3192s6;
    }

    /* renamed from: b */
    private static C3192s6 m16789b(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        abstractC2852k9.mo13638c();
        C2580i6 c2580i6 = null;
        C2580i6 c2580i62 = null;
        C2801j6 c2801j6 = null;
        C2801j6 c2801j62 = null;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f14353b);
            if (mo13634a == 0) {
                c2580i6 = C0453b8.m3329a(abstractC2852k9, c0538d);
            } else if (mo13634a == 1) {
                c2580i62 = C0453b8.m3329a(abstractC2852k9, c0538d);
            } else if (mo13634a == 2) {
                c2801j6 = C0453b8.m3335c(abstractC2852k9, c0538d);
            } else if (mo13634a != 3) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                c2801j62 = C0453b8.m3335c(abstractC2852k9, c0538d);
            }
        }
        abstractC2852k9.mo13640e();
        return new C3192s6(c2580i6, c2580i62, c2801j6, c2801j62);
    }
}
