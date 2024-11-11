package p000;

import com.airbnb.lottie.C0538d;
import java.util.ArrayList;
import p000.AbstractC2852k9;
import p000.C2887l7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l8 */
/* loaded from: classes.dex */
public class C2888l8 {

    /* renamed from: a */
    private static AbstractC2852k9.a f11827a = AbstractC2852k9.a.m13650a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final AbstractC2852k9.a f11828b = AbstractC2852k9.a.m13650a("p", "k");

    /* renamed from: c */
    private static final AbstractC2852k9.a f11829c = AbstractC2852k9.a.m13650a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0008a7 m13831a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        EnumC0452b7 enumC0452b7 = null;
        C2848k6 c2848k6 = null;
        C2886l6 c2886l6 = null;
        C2971n6 c2971n6 = null;
        C2971n6 c2971n62 = null;
        C2801j6 c2801j6 = null;
        C2887l7.b bVar = null;
        C2887l7.c cVar = null;
        float f = 0.0f;
        C2801j6 c2801j62 = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            switch (abstractC2852k9.mo13634a(f11827a)) {
                case 0:
                    str = abstractC2852k9.mo13647m();
                    break;
                case 1:
                    int i = -1;
                    abstractC2852k9.mo13638c();
                    while (abstractC2852k9.mo13642h()) {
                        int mo13634a = abstractC2852k9.mo13634a(f11828b);
                        C2848k6 c2848k62 = c2848k6;
                        if (mo13634a == 0) {
                            i = abstractC2852k9.mo13645k();
                        } else if (mo13634a != 1) {
                            abstractC2852k9.mo13648n();
                            abstractC2852k9.mo13649o();
                        } else {
                            c2848k6 = C0453b8.m3333a(abstractC2852k9, c0538d, i);
                        }
                        c2848k6 = c2848k62;
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
                    c2801j6 = C0453b8.m3335c(abstractC2852k9, c0538d);
                    break;
                case 7:
                    bVar = C2887l7.b.values()[abstractC2852k9.mo13645k() - 1];
                    break;
                case 8:
                    cVar = C2887l7.c.values()[abstractC2852k9.mo13645k() - 1];
                    break;
                case 9:
                    f = (float) abstractC2852k9.mo13644j();
                    break;
                case 10:
                    z = abstractC2852k9.mo13643i();
                    break;
                case 11:
                    abstractC2852k9.mo13636a();
                    while (abstractC2852k9.mo13642h()) {
                        abstractC2852k9.mo13638c();
                        String str2 = null;
                        C2801j6 c2801j63 = null;
                        while (abstractC2852k9.mo13642h()) {
                            int mo13634a2 = abstractC2852k9.mo13634a(f11829c);
                            C2801j6 c2801j64 = c2801j62;
                            if (mo13634a2 != 0) {
                                if (mo13634a2 != 1) {
                                    abstractC2852k9.mo13648n();
                                    abstractC2852k9.mo13649o();
                                } else {
                                    c2801j63 = C0453b8.m3335c(abstractC2852k9, c0538d);
                                }
                                c2801j62 = c2801j64;
                            } else {
                                str2 = abstractC2852k9.mo13647m();
                            }
                        }
                        C2801j6 c2801j65 = c2801j62;
                        abstractC2852k9.mo13640e();
                        if (str2.equals("o")) {
                            c2801j62 = c2801j63;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                c0538d.m3728a(true);
                                arrayList.add(c2801j63);
                            }
                            c2801j62 = c2801j65;
                        }
                    }
                    C2801j6 c2801j66 = c2801j62;
                    abstractC2852k9.mo13639d();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    c2801j62 = c2801j66;
                    break;
                default:
                    abstractC2852k9.mo13648n();
                    abstractC2852k9.mo13649o();
                    break;
            }
        }
        return new C0008a7(str, enumC0452b7, c2848k6, c2886l6, c2971n6, c2971n62, c2801j6, bVar, cVar, f, arrayList, c2801j62, z);
    }
}
