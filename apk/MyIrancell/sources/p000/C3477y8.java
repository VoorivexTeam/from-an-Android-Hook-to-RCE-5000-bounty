package p000;

import android.graphics.PointF;
import com.airbnb.lottie.C0538d;
import p000.AbstractC2852k9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y8 */
/* loaded from: classes.dex */
public class C3477y8 {

    /* renamed from: a */
    private static AbstractC2852k9.a f14114a = AbstractC2852k9.a.m13650a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2461f7 m16604a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        String str = null;
        InterfaceC3289u6<PointF, PointF> interfaceC3289u6 = null;
        C2971n6 c2971n6 = null;
        C2801j6 c2801j6 = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f14114a);
            if (mo13634a == 0) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 1) {
                interfaceC3289u6 = C3475y7.m16587b(abstractC2852k9, c0538d);
            } else if (mo13634a == 2) {
                c2971n6 = C0453b8.m3337e(abstractC2852k9, c0538d);
            } else if (mo13634a == 3) {
                c2801j6 = C0453b8.m3335c(abstractC2852k9, c0538d);
            } else if (mo13634a != 4) {
                abstractC2852k9.mo13649o();
            } else {
                z = abstractC2852k9.mo13643i();
            }
        }
        return new C2461f7(str, interfaceC3289u6, c2971n6, c2801j6, z);
    }
}
