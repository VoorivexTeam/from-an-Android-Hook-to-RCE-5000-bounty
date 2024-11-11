package p000;

import com.airbnb.lottie.C0538d;
import p000.AbstractC2852k9;

/* renamed from: e9 */
/* loaded from: classes.dex */
class C2421e9 {

    /* renamed from: a */
    static AbstractC2852k9.a f9947a = AbstractC2852k9.a.m13650a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2849k7 m11566a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        int i = 0;
        String str = null;
        C3072p6 c3072p6 = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f9947a);
            if (mo13634a == 0) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 1) {
                i = abstractC2852k9.mo13645k();
            } else if (mo13634a == 2) {
                c3072p6 = C0453b8.m3339g(abstractC2852k9, c0538d);
            } else if (mo13634a != 3) {
                abstractC2852k9.mo13649o();
            } else {
                z = abstractC2852k9.mo13643i();
            }
        }
        return new C2849k7(str, i, c3072p6, z);
    }
}
