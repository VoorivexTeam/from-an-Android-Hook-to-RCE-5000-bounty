package p000;

import com.airbnb.lottie.C0538d;
import p000.C0507c7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s8 */
/* loaded from: classes.dex */
public class C3197s8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0507c7 m15378a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        char c;
        abstractC2852k9.mo13638c();
        C0507c7.a aVar = null;
        C3072p6 c3072p6 = null;
        C2886l6 c2886l6 = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            String mo13646l = abstractC2852k9.mo13646l();
            int hashCode = mo13646l.hashCode();
            char c2 = 65535;
            if (hashCode == 111) {
                if (mo13646l.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 3588) {
                if (mo13646l.equals("pt")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 104433) {
                if (hashCode == 3357091 && mo13646l.equals("mode")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (mo13646l.equals("inv")) {
                    c = 3;
                }
                c = 65535;
            }
            if (c == 0) {
                String mo13647m = abstractC2852k9.mo13647m();
                int hashCode2 = mo13647m.hashCode();
                if (hashCode2 != 97) {
                    if (hashCode2 != 105) {
                        if (hashCode2 != 110) {
                            if (hashCode2 == 115 && mo13647m.equals("s")) {
                                c2 = 1;
                            }
                        } else if (mo13647m.equals("n")) {
                            c2 = 2;
                        }
                    } else if (mo13647m.equals("i")) {
                        c2 = 3;
                    }
                } else if (mo13647m.equals("a")) {
                    c2 = 0;
                }
                if (c2 != 0) {
                    if (c2 == 1) {
                        aVar = C0507c7.a.MASK_MODE_SUBTRACT;
                    } else if (c2 == 2) {
                        aVar = C0507c7.a.MASK_MODE_NONE;
                    } else if (c2 != 3) {
                        C3116q9.m15002b("Unknown mask mode " + mo13646l + ". Defaulting to Add.");
                    } else {
                        c0538d.m3727a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                        aVar = C0507c7.a.MASK_MODE_INTERSECT;
                    }
                }
                aVar = C0507c7.a.MASK_MODE_ADD;
            } else if (c == 1) {
                c3072p6 = C0453b8.m3339g(abstractC2852k9, c0538d);
            } else if (c == 2) {
                c2886l6 = C0453b8.m3336d(abstractC2852k9, c0538d);
            } else if (c != 3) {
                abstractC2852k9.mo13649o();
            } else {
                z = abstractC2852k9.mo13643i();
            }
        }
        abstractC2852k9.mo13640e();
        return new C0507c7(aVar, c3072p6, c2886l6, z);
    }
}
