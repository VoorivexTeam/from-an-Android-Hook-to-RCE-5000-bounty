package p000;

import android.graphics.Path;
import com.airbnb.lottie.C0538d;
import p000.AbstractC2852k9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k8 */
/* loaded from: classes.dex */
public class C2851k8 {

    /* renamed from: a */
    private static final AbstractC2852k9.a f11660a = AbstractC2852k9.a.m13650a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final AbstractC2852k9.a f11661b = AbstractC2852k9.a.m13650a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3513z6 m13626a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        EnumC0452b7 enumC0452b7 = null;
        C2848k6 c2848k6 = null;
        C2886l6 c2886l6 = null;
        C2971n6 c2971n6 = null;
        C2971n6 c2971n62 = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            switch (abstractC2852k9.mo13634a(f11660a)) {
                case 0:
                    str = abstractC2852k9.mo13647m();
                    break;
                case 1:
                    int i = -1;
                    abstractC2852k9.mo13638c();
                    while (abstractC2852k9.mo13642h()) {
                        int mo13634a = abstractC2852k9.mo13634a(f11661b);
                        if (mo13634a == 0) {
                            i = abstractC2852k9.mo13645k();
                        } else if (mo13634a != 1) {
                            abstractC2852k9.mo13648n();
                            abstractC2852k9.mo13649o();
                        } else {
                            c2848k6 = C0453b8.m3333a(abstractC2852k9, c0538d, i);
                        }
                    }
                    abstractC2852k9.mo13640e();
                    break;
                case 2:
                    c2886l6 = C0453b8.m3336d(abstractC2852k9, c0538d);
                    break;
                case 3:
                    enumC0452b7 = abstractC2852k9.mo13645k() == 1 ? EnumC0452b7.LINEAR : EnumC0452b7.RADIAL;
                    break;
                case 4:
                    c2971n6 = C0453b8.m3337e(abstractC2852k9, c0538d);
                    break;
                case 5:
                    c2971n62 = C0453b8.m3337e(abstractC2852k9, c0538d);
                    break;
                case 6:
                    fillType = abstractC2852k9.mo13645k() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = abstractC2852k9.mo13643i();
                    break;
                default:
                    abstractC2852k9.mo13648n();
                    abstractC2852k9.mo13649o();
                    break;
            }
        }
        return new C3513z6(str, enumC0452b7, fillType, c2848k6, c2886l6, c2971n6, c2971n62, null, null, z);
    }
}
