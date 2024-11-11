package p000;

import com.airbnb.lottie.C0538d;
import p000.AbstractC2852k9;
import p000.C2924m7;

/* renamed from: g9 */
/* loaded from: classes.dex */
class C2503g9 {

    /* renamed from: a */
    private static AbstractC2852k9.a f10252a = AbstractC2852k9.a.m13650a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2924m7 m11934a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        String str = null;
        C2924m7.a aVar = null;
        C2801j6 c2801j6 = null;
        C2801j6 c2801j62 = null;
        C2801j6 c2801j63 = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f10252a);
            if (mo13634a == 0) {
                c2801j6 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
            } else if (mo13634a == 1) {
                c2801j62 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
            } else if (mo13634a == 2) {
                c2801j63 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
            } else if (mo13634a == 3) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 4) {
                aVar = C2924m7.a.forId(abstractC2852k9.mo13645k());
            } else if (mo13634a != 5) {
                abstractC2852k9.mo13649o();
            } else {
                z = abstractC2852k9.mo13643i();
            }
        }
        return new C2924m7(str, aVar, c2801j6, c2801j62, c2801j63, z);
    }
}
