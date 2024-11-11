package p000;

import com.airbnb.lottie.C0538d;
import java.util.ArrayList;
import p000.AbstractC2852k9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h8 */
/* loaded from: classes.dex */
public class C2542h8 {

    /* renamed from: a */
    private static final AbstractC2852k9.a f10404a = AbstractC2852k9.a.m13650a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final AbstractC2852k9.a f10405b = AbstractC2852k9.a.m13650a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0506c6 m12144a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        ArrayList arrayList = new ArrayList();
        abstractC2852k9.mo13638c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f10404a);
            if (mo13634a == 0) {
                c = abstractC2852k9.mo13647m().charAt(0);
            } else if (mo13634a == 1) {
                d = abstractC2852k9.mo13644j();
            } else if (mo13634a == 2) {
                d2 = abstractC2852k9.mo13644j();
            } else if (mo13634a == 3) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 4) {
                str2 = abstractC2852k9.mo13647m();
            } else if (mo13634a != 5) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                abstractC2852k9.mo13638c();
                while (abstractC2852k9.mo13642h()) {
                    if (abstractC2852k9.mo13634a(f10405b) != 0) {
                        abstractC2852k9.mo13648n();
                        abstractC2852k9.mo13649o();
                    } else {
                        abstractC2852k9.mo13636a();
                        while (abstractC2852k9.mo13642h()) {
                            arrayList.add((C2802j7) C2420e8.m11565a(abstractC2852k9, c0538d));
                        }
                        abstractC2852k9.mo13639d();
                    }
                }
                abstractC2852k9.mo13640e();
            }
        }
        abstractC2852k9.mo13640e();
        return new C0506c6(arrayList, c, d, d2, str, str2);
    }
}
