package p000;

import android.graphics.PointF;
import com.airbnb.lottie.C0538d;
import p000.AbstractC2852k9;

/* renamed from: c8 */
/* loaded from: classes.dex */
class C0508c8 {

    /* renamed from: a */
    private static AbstractC2852k9.a f2963a = AbstractC2852k9.a.m13650a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3386w6 m3608a(AbstractC2852k9 abstractC2852k9, C0538d c0538d, int i) {
        boolean z = i == 3;
        String str = null;
        InterfaceC3289u6<PointF, PointF> interfaceC3289u6 = null;
        C2971n6 c2971n6 = null;
        boolean z2 = false;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f2963a);
            if (mo13634a == 0) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 1) {
                interfaceC3289u6 = C3475y7.m16587b(abstractC2852k9, c0538d);
            } else if (mo13634a == 2) {
                c2971n6 = C0453b8.m3337e(abstractC2852k9, c0538d);
            } else if (mo13634a == 3) {
                z2 = abstractC2852k9.mo13643i();
            } else if (mo13634a != 4) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                z = abstractC2852k9.mo13645k() == 3;
            }
        }
        return new C3386w6(str, interfaceC3289u6, c2971n6, z, z2);
    }
}
