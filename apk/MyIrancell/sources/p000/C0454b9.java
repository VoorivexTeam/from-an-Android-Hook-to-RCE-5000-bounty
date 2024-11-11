package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.AbstractC2852k9;

/* renamed from: b9 */
/* loaded from: classes.dex */
public class C0454b9 implements InterfaceC2545h9<C2540h7> {

    /* renamed from: a */
    public static final C0454b9 f2749a = new C0454b9();

    /* renamed from: b */
    private static final AbstractC2852k9.a f2750b = AbstractC2852k9.a.m13650a("c", "v", "i", "o");

    private C0454b9() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.InterfaceC2545h9
    /* renamed from: a */
    public C2540h7 mo101a(AbstractC2852k9 abstractC2852k9, float f) {
        if (abstractC2852k9.peek() == AbstractC2852k9.b.BEGIN_ARRAY) {
            abstractC2852k9.mo13636a();
        }
        abstractC2852k9.mo13638c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f2750b);
            if (mo13634a == 0) {
                z = abstractC2852k9.mo13643i();
            } else if (mo13634a == 1) {
                list = C2978n8.m14299e(abstractC2852k9, f);
            } else if (mo13634a == 2) {
                list2 = C2978n8.m14299e(abstractC2852k9, f);
            } else if (mo13634a != 3) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                list3 = C2978n8.m14299e(abstractC2852k9, f);
            }
        }
        abstractC2852k9.mo13640e();
        if (abstractC2852k9.peek() == AbstractC2852k9.b.END_ARRAY) {
            abstractC2852k9.mo13639d();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new C2540h7(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new C3512z5(C3243t9.m15576a(list.get(i2), list3.get(i2)), C3243t9.m15576a(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new C3512z5(C3243t9.m15576a(list.get(i3), list3.get(i3)), C3243t9.m15576a(pointF3, list2.get(0)), pointF3));
        }
        return new C2540h7(pointF, z, arrayList);
    }
}
