package p000;

import com.airbnb.lottie.C0538d;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2852k9;

/* renamed from: p8 */
/* loaded from: classes.dex */
class C3075p8 {

    /* renamed from: a */
    static AbstractC2852k9.a f12576a = AbstractC2852k9.a.m13650a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> List<C3346v9<T>> m14736a(AbstractC2852k9 abstractC2852k9, C0538d c0538d, float f, InterfaceC2545h9<T> interfaceC2545h9) {
        ArrayList arrayList = new ArrayList();
        if (abstractC2852k9.peek() == AbstractC2852k9.b.STRING) {
            c0538d.m3727a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC2852k9.mo13638c();
        while (abstractC2852k9.mo13642h()) {
            if (abstractC2852k9.mo13634a(f12576a) != 0) {
                abstractC2852k9.mo13649o();
            } else if (abstractC2852k9.peek() == AbstractC2852k9.b.BEGIN_ARRAY) {
                abstractC2852k9.mo13636a();
                if (abstractC2852k9.peek() == AbstractC2852k9.b.NUMBER) {
                    arrayList.add(C3018o8.m14437a(abstractC2852k9, c0538d, f, interfaceC2545h9, false));
                } else {
                    while (abstractC2852k9.mo13642h()) {
                        arrayList.add(C3018o8.m14437a(abstractC2852k9, c0538d, f, interfaceC2545h9, true));
                    }
                }
                abstractC2852k9.mo13639d();
            } else {
                arrayList.add(C3018o8.m14437a(abstractC2852k9, c0538d, f, interfaceC2545h9, false));
            }
        }
        abstractC2852k9.mo13640e();
        m14737a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static <T> void m14737a(List<? extends C3346v9<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C3346v9<T> c3346v9 = list.get(i2);
            i2++;
            C3346v9<T> c3346v92 = list.get(i2);
            c3346v9.f13635f = Float.valueOf(c3346v92.f13634e);
            if (c3346v9.f13632c == null && (t = c3346v92.f13631b) != null) {
                c3346v9.f13632c = t;
                if (c3346v9 instanceof C3014o5) {
                    ((C3014o5) c3346v9).m14425h();
                }
            }
        }
        C3346v9<T> c3346v93 = list.get(i);
        if ((c3346v93.f13631b == null || c3346v93.f13632c == null) && list.size() > 1) {
            list.remove(c3346v93);
        }
    }
}
