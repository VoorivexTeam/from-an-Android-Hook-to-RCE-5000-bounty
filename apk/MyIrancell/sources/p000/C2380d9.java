package p000;

import com.airbnb.lottie.C0538d;
import java.util.ArrayList;
import p000.AbstractC2852k9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d9 */
/* loaded from: classes.dex */
public class C2380d9 {

    /* renamed from: a */
    private static AbstractC2852k9.a f9775a = AbstractC2852k9.a.m13650a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2802j7 m11340a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f9775a);
            if (mo13634a == 0) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 1) {
                z = abstractC2852k9.mo13643i();
            } else if (mo13634a != 2) {
                abstractC2852k9.mo13649o();
            } else {
                abstractC2852k9.mo13636a();
                while (abstractC2852k9.mo13642h()) {
                    InterfaceC3426x6 m11565a = C2420e8.m11565a(abstractC2852k9, c0538d);
                    if (m11565a != null) {
                        arrayList.add(m11565a);
                    }
                }
                abstractC2852k9.mo13639d();
            }
        }
        return new C2802j7(str, arrayList, z);
    }
}
