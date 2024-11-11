package p000;

import com.airbnb.lottie.C0538d;
import p000.AbstractC2852k9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z8 */
/* loaded from: classes.dex */
public class C3516z8 {

    /* renamed from: a */
    private static AbstractC2852k9.a f14372a = AbstractC2852k9.a.m13650a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2500g7 m16843a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        String str = null;
        C2801j6 c2801j6 = null;
        C2801j6 c2801j62 = null;
        C3240t6 c3240t6 = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f14372a);
            if (mo13634a == 0) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 1) {
                c2801j6 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
            } else if (mo13634a == 2) {
                c2801j62 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
            } else if (mo13634a == 3) {
                c3240t6 = C0009a8.m88a(abstractC2852k9, c0538d);
            } else if (mo13634a != 4) {
                abstractC2852k9.mo13649o();
            } else {
                z = abstractC2852k9.mo13643i();
            }
        }
        return new C2500g7(str, c2801j6, c2801j62, c3240t6, z);
    }
}
