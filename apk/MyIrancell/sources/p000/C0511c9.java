package p000;

import android.graphics.Path;
import com.airbnb.lottie.C0538d;
import p000.AbstractC2852k9;

/* renamed from: c9 */
/* loaded from: classes.dex */
class C0511c9 {

    /* renamed from: a */
    private static final AbstractC2852k9.a f2978a = AbstractC2852k9.a.m13650a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2581i7 m3618a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        String str = null;
        C2580i6 c2580i6 = null;
        C2886l6 c2886l6 = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f2978a);
            if (mo13634a == 0) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 1) {
                c2580i6 = C0453b8.m3329a(abstractC2852k9, c0538d);
            } else if (mo13634a == 2) {
                c2886l6 = C0453b8.m3336d(abstractC2852k9, c0538d);
            } else if (mo13634a == 3) {
                z = abstractC2852k9.mo13643i();
            } else if (mo13634a == 4) {
                i = abstractC2852k9.mo13645k();
            } else if (mo13634a != 5) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                z2 = abstractC2852k9.mo13643i();
            }
        }
        return new C2581i7(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c2580i6, c2886l6, z2);
    }
}
