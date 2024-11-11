package p000;

import com.airbnb.lottie.C0538d;
import java.util.ArrayList;
import p000.AbstractC2852k9;
import p000.C2887l7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f9 */
/* loaded from: classes.dex */
public class C2465f9 {

    /* renamed from: a */
    private static AbstractC2852k9.a f10106a = AbstractC2852k9.a.m13650a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final AbstractC2852k9.a f10107b = AbstractC2852k9.a.m13650a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2887l7 m11712a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        C2801j6 c2801j6 = null;
        C2580i6 c2580i6 = null;
        C2886l6 c2886l6 = null;
        C2801j6 c2801j62 = null;
        C2887l7.b bVar = null;
        C2887l7.c cVar = null;
        float f = 0.0f;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            int i = 1;
            switch (abstractC2852k9.mo13634a(f10106a)) {
                case 0:
                    str = abstractC2852k9.mo13647m();
                    break;
                case 1:
                    c2580i6 = C0453b8.m3329a(abstractC2852k9, c0538d);
                    break;
                case 2:
                    c2801j62 = C0453b8.m3335c(abstractC2852k9, c0538d);
                    break;
                case 3:
                    c2886l6 = C0453b8.m3336d(abstractC2852k9, c0538d);
                    break;
                case 4:
                    bVar = C2887l7.b.values()[abstractC2852k9.mo13645k() - 1];
                    break;
                case 5:
                    cVar = C2887l7.c.values()[abstractC2852k9.mo13645k() - 1];
                    break;
                case 6:
                    f = (float) abstractC2852k9.mo13644j();
                    break;
                case 7:
                    z = abstractC2852k9.mo13643i();
                    break;
                case 8:
                    abstractC2852k9.mo13636a();
                    while (abstractC2852k9.mo13642h()) {
                        abstractC2852k9.mo13638c();
                        String str2 = null;
                        C2801j6 c2801j63 = null;
                        while (abstractC2852k9.mo13642h()) {
                            int mo13634a = abstractC2852k9.mo13634a(f10107b);
                            if (mo13634a == 0) {
                                str2 = abstractC2852k9.mo13647m();
                            } else if (mo13634a != i) {
                                abstractC2852k9.mo13648n();
                                abstractC2852k9.mo13649o();
                            } else {
                                c2801j63 = C0453b8.m3335c(abstractC2852k9, c0538d);
                            }
                        }
                        abstractC2852k9.mo13640e();
                        int hashCode = str2.hashCode();
                        if (hashCode == 100) {
                            if (str2.equals("d")) {
                                c = 1;
                            }
                            c = 65535;
                        } else if (hashCode != 103) {
                            if (hashCode == 111 && str2.equals("o")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (str2.equals("g")) {
                                c = 2;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            c2801j6 = c2801j63;
                        } else if (c == 1 || c == 2) {
                            c0538d.m3728a(true);
                            arrayList.add(c2801j63);
                        }
                        i = 1;
                    }
                    abstractC2852k9.mo13639d();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                default:
                    abstractC2852k9.mo13649o();
                    break;
            }
        }
        return new C2887l7(str, c2801j6, arrayList, c2580i6, c2886l6, c2801j62, bVar, cVar, f, z);
    }
}
