package p000;

import android.graphics.PointF;
import com.airbnb.lottie.C0538d;
import p000.AbstractC2852k9;
import p000.C2419e7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x8 */
/* loaded from: classes.dex */
public class C3428x8 {

    /* renamed from: a */
    private static final AbstractC2852k9.a f14002a = AbstractC2852k9.a.m13650a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2419e7 m16462a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        String str = null;
        C2419e7.a aVar = null;
        C2801j6 c2801j6 = null;
        InterfaceC3289u6<PointF, PointF> interfaceC3289u6 = null;
        C2801j6 c2801j62 = null;
        C2801j6 c2801j63 = null;
        C2801j6 c2801j64 = null;
        C2801j6 c2801j65 = null;
        C2801j6 c2801j66 = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            switch (abstractC2852k9.mo13634a(f14002a)) {
                case 0:
                    str = abstractC2852k9.mo13647m();
                    break;
                case 1:
                    aVar = C2419e7.a.forValue(abstractC2852k9.mo13645k());
                    break;
                case 2:
                    c2801j6 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
                    break;
                case 3:
                    interfaceC3289u6 = C3475y7.m16587b(abstractC2852k9, c0538d);
                    break;
                case 4:
                    c2801j62 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
                    break;
                case 5:
                    c2801j64 = C0453b8.m3335c(abstractC2852k9, c0538d);
                    break;
                case 6:
                    c2801j66 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
                    break;
                case 7:
                    c2801j63 = C0453b8.m3335c(abstractC2852k9, c0538d);
                    break;
                case 8:
                    c2801j65 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
                    break;
                case 9:
                    z = abstractC2852k9.mo13643i();
                    break;
                default:
                    abstractC2852k9.mo13648n();
                    abstractC2852k9.mo13649o();
                    break;
            }
        }
        return new C2419e7(str, aVar, c2801j6, interfaceC3289u6, c2801j62, c2801j63, c2801j64, c2801j65, c2801j66, z);
    }
}
