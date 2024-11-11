package p000;

import android.graphics.Rect;
import com.airbnb.lottie.C0538d;
import com.airbnb.lottie.C0541g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC2852k9;
import p000.C3112q7;

/* renamed from: r8 */
/* loaded from: classes.dex */
public class C3157r8 {

    /* renamed from: a */
    private static final AbstractC2852k9.a f12927a = AbstractC2852k9.a.m13650a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static AbstractC2852k9.a f12928b = AbstractC2852k9.a.m13650a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final AbstractC2852k9.a f12929c = AbstractC2852k9.a.m13650a("list");

    /* renamed from: d */
    private static final AbstractC2852k9.a f12930d = AbstractC2852k9.a.m13650a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0043. Please report as an issue. */
    /* renamed from: a */
    public static C0538d m15223a(AbstractC2852k9 abstractC2852k9) {
        HashMap hashMap;
        ArrayList arrayList;
        AbstractC2852k9 abstractC2852k92 = abstractC2852k9;
        float m15753a = C3295u9.m15753a();
        C2452f0<C3112q7> c2452f0 = new C2452f0<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C2795j0<C0506c6> c2795j0 = new C2795j0<>();
        C0538d c0538d = new C0538d();
        abstractC2852k9.mo13638c();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (abstractC2852k9.mo13642h()) {
            switch (abstractC2852k92.mo13634a(f12927a)) {
                case 0:
                    i = abstractC2852k9.mo13645k();
                    break;
                case 1:
                    i2 = abstractC2852k9.mo13645k();
                    break;
                case 2:
                    f = (float) abstractC2852k9.mo13644j();
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) abstractC2852k9.mo13644j()) - 0.01f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) abstractC2852k9.mo13644j();
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 5:
                    String[] split = abstractC2852k9.mo13647m().split("\\.");
                    if (!C3295u9.m15764a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        c0538d.m3727a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    m15226a(abstractC2852k92, c0538d, arrayList2, c2452f0);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    m15227a(abstractC2852k92, c0538d, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    m15228a(abstractC2852k92, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    m15224a(abstractC2852k92, c0538d, c2795j0);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    m15225a(abstractC2852k92, c0538d, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    abstractC2852k9.mo13648n();
                    abstractC2852k9.mo13649o();
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
            }
            abstractC2852k92 = abstractC2852k9;
        }
        c0538d.m3726a(new Rect(0, 0, (int) (i * m15753a), (int) (i2 * m15753a)), f, f2, f3, arrayList2, c2452f0, hashMap2, hashMap3, c2795j0, hashMap4, arrayList3);
        return c0538d;
    }

    /* renamed from: a */
    private static void m15224a(AbstractC2852k9 abstractC2852k9, C0538d c0538d, C2795j0<C0506c6> c2795j0) {
        abstractC2852k9.mo13636a();
        while (abstractC2852k9.mo13642h()) {
            C0506c6 m12144a = C2542h8.m12144a(abstractC2852k9, c0538d);
            c2795j0.m13284c(m12144a.hashCode(), m12144a);
        }
        abstractC2852k9.mo13639d();
    }

    /* renamed from: a */
    private static void m15225a(AbstractC2852k9 abstractC2852k9, C0538d c0538d, List<C2499g6> list) {
        abstractC2852k9.mo13636a();
        while (abstractC2852k9.mo13642h()) {
            String str = null;
            abstractC2852k9.mo13638c();
            float f = 0.0f;
            float f2 = 0.0f;
            while (abstractC2852k9.mo13642h()) {
                int mo13634a = abstractC2852k9.mo13634a(f12930d);
                if (mo13634a == 0) {
                    str = abstractC2852k9.mo13647m();
                } else if (mo13634a == 1) {
                    f = (float) abstractC2852k9.mo13644j();
                } else if (mo13634a != 2) {
                    abstractC2852k9.mo13648n();
                    abstractC2852k9.mo13649o();
                } else {
                    f2 = (float) abstractC2852k9.mo13644j();
                }
            }
            abstractC2852k9.mo13640e();
            list.add(new C2499g6(str, f, f2));
        }
        abstractC2852k9.mo13639d();
    }

    /* renamed from: a */
    private static void m15226a(AbstractC2852k9 abstractC2852k9, C0538d c0538d, List<C3112q7> list, C2452f0<C3112q7> c2452f0) {
        abstractC2852k9.mo13636a();
        int i = 0;
        while (abstractC2852k9.mo13642h()) {
            C3112q7 m14994a = C3114q8.m14994a(abstractC2852k9, c0538d);
            if (m14994a.m14961d() == C3112q7.a.IMAGE) {
                i++;
            }
            list.add(m14994a);
            c2452f0.m11656c(m14994a.m14959b(), m14994a);
            if (i > 4) {
                C3116q9.m15002b("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC2852k9.mo13639d();
    }

    /* renamed from: a */
    private static void m15227a(AbstractC2852k9 abstractC2852k9, C0538d c0538d, Map<String, List<C3112q7>> map, Map<String, C0541g> map2) {
        abstractC2852k9.mo13636a();
        while (abstractC2852k9.mo13642h()) {
            ArrayList arrayList = new ArrayList();
            C2452f0 c2452f0 = new C2452f0();
            abstractC2852k9.mo13638c();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (abstractC2852k9.mo13642h()) {
                int mo13634a = abstractC2852k9.mo13634a(f12928b);
                if (mo13634a == 0) {
                    str = abstractC2852k9.mo13647m();
                } else if (mo13634a == 1) {
                    abstractC2852k9.mo13636a();
                    while (abstractC2852k9.mo13642h()) {
                        C3112q7 m14994a = C3114q8.m14994a(abstractC2852k9, c0538d);
                        c2452f0.m11656c(m14994a.m14959b(), m14994a);
                        arrayList.add(m14994a);
                    }
                    abstractC2852k9.mo13639d();
                } else if (mo13634a == 2) {
                    i = abstractC2852k9.mo13645k();
                } else if (mo13634a == 3) {
                    i2 = abstractC2852k9.mo13645k();
                } else if (mo13634a == 4) {
                    str2 = abstractC2852k9.mo13647m();
                } else if (mo13634a != 5) {
                    abstractC2852k9.mo13648n();
                    abstractC2852k9.mo13649o();
                } else {
                    str3 = abstractC2852k9.mo13647m();
                }
            }
            abstractC2852k9.mo13640e();
            if (str2 != null) {
                C0541g c0541g = new C0541g(i, i2, str, str2, str3);
                map2.put(c0541g.m3832d(), c0541g);
            } else {
                map.put(str, arrayList);
            }
        }
        abstractC2852k9.mo13639d();
    }

    /* renamed from: a */
    private static void m15228a(AbstractC2852k9 abstractC2852k9, Map<String, C0451b6> map) {
        abstractC2852k9.mo13638c();
        while (abstractC2852k9.mo13642h()) {
            if (abstractC2852k9.mo13634a(f12929c) != 0) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                abstractC2852k9.mo13636a();
                while (abstractC2852k9.mo13642h()) {
                    C0451b6 m12384a = C2582i8.m12384a(abstractC2852k9);
                    map.put(m12384a.m3327b(), m12384a);
                }
                abstractC2852k9.mo13639d();
            }
        }
        abstractC2852k9.mo13640e();
    }
}
