package p000;

import android.graphics.PointF;
import com.airbnb.lottie.C0538d;
import java.util.ArrayList;
import p000.AbstractC2852k9;

/* renamed from: y7 */
/* loaded from: classes.dex */
public class C3475y7 {

    /* renamed from: a */
    private static AbstractC2852k9.a f14111a = AbstractC2852k9.a.m13650a("k", "x", "y");

    /* renamed from: a */
    public static C2923m6 m16586a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        ArrayList arrayList = new ArrayList();
        if (abstractC2852k9.peek() == AbstractC2852k9.b.BEGIN_ARRAY) {
            abstractC2852k9.mo13636a();
            while (abstractC2852k9.mo13642h()) {
                arrayList.add(C3294u8.m15752a(abstractC2852k9, c0538d));
            }
            abstractC2852k9.mo13639d();
            C3075p8.m14737a(arrayList);
        } else {
            arrayList.add(new C3346v9(C2978n8.m14298d(abstractC2852k9, C3295u9.m15753a())));
        }
        return new C2923m6(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC3289u6<PointF, PointF> m16587b(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        abstractC2852k9.mo13638c();
        C2923m6 c2923m6 = null;
        C2801j6 c2801j6 = null;
        C2801j6 c2801j62 = null;
        boolean z = false;
        while (abstractC2852k9.peek() != AbstractC2852k9.b.END_OBJECT) {
            int mo13634a = abstractC2852k9.mo13634a(f14111a);
            if (mo13634a == 0) {
                c2923m6 = m16586a(abstractC2852k9, c0538d);
            } else if (mo13634a != 1) {
                if (mo13634a != 2) {
                    abstractC2852k9.mo13648n();
                    abstractC2852k9.mo13649o();
                } else if (abstractC2852k9.peek() == AbstractC2852k9.b.STRING) {
                    abstractC2852k9.mo13649o();
                    z = true;
                } else {
                    c2801j62 = C0453b8.m3335c(abstractC2852k9, c0538d);
                }
            } else if (abstractC2852k9.peek() == AbstractC2852k9.b.STRING) {
                abstractC2852k9.mo13649o();
                z = true;
            } else {
                c2801j6 = C0453b8.m3335c(abstractC2852k9, c0538d);
            }
        }
        abstractC2852k9.mo13640e();
        if (z) {
            c0538d.m3727a("Lottie doesn't support expressions.");
        }
        return c2923m6 != null ? c2923m6 : new C3111q6(c2801j6, c2801j62);
    }
}
