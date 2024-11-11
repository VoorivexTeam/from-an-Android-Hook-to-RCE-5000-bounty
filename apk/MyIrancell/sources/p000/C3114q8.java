package p000;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.C0538d;
import java.util.ArrayList;
import java.util.Collections;
import p000.AbstractC2852k9;
import p000.C3112q7;

/* renamed from: q8 */
/* loaded from: classes.dex */
public class C3114q8 {

    /* renamed from: a */
    private static final AbstractC2852k9.a f12736a = AbstractC2852k9.a.m13650a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final AbstractC2852k9.a f12737b = AbstractC2852k9.a.m13650a("d", "a");

    /* renamed from: c */
    private static final AbstractC2852k9.a f12738c = AbstractC2852k9.a.m13650a("nm");

    /* renamed from: a */
    public static C3112q7 m14993a(C0538d c0538d) {
        Rect m3723a = c0538d.m3723a();
        return new C3112q7(Collections.emptyList(), c0538d, "__container", -1L, C3112q7.a.PRE_COMP, -1L, null, Collections.emptyList(), new C3240t6(), 0, 0, 0, 0.0f, 0.0f, m3723a.width(), m3723a.height(), null, null, Collections.emptyList(), C3112q7.b.NONE, null, false);
    }

    /* renamed from: a */
    public static C3112q7 m14994a(AbstractC2852k9 abstractC2852k9, C0538d c0538d) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C3112q7.b bVar = C3112q7.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        abstractC2852k9.mo13638c();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        C3112q7.b bVar2 = bVar;
        C3112q7.a aVar = null;
        String str = null;
        C3240t6 c3240t6 = null;
        C3155r6 c3155r6 = null;
        C3192s6 c3192s6 = null;
        C2801j6 c2801j6 = null;
        long j = -1;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (abstractC2852k9.mo13642h()) {
            switch (abstractC2852k9.mo13634a(f12736a)) {
                case 0:
                    str3 = abstractC2852k9.mo13647m();
                    continue;
                case 1:
                    j2 = abstractC2852k9.mo13645k();
                    continue;
                case 2:
                    str = abstractC2852k9.mo13647m();
                    continue;
                case 3:
                    int mo13645k = abstractC2852k9.mo13645k();
                    if (mo13645k < C3112q7.a.UNKNOWN.ordinal()) {
                        aVar = C3112q7.a.values()[mo13645k];
                        break;
                    } else {
                        aVar = C3112q7.a.UNKNOWN;
                        continue;
                    }
                case 4:
                    j = abstractC2852k9.mo13645k();
                    continue;
                case 5:
                    i = (int) (abstractC2852k9.mo13645k() * C3295u9.m15753a());
                    continue;
                case 6:
                    i2 = (int) (abstractC2852k9.mo13645k() * C3295u9.m15753a());
                    continue;
                case 7:
                    i3 = Color.parseColor(abstractC2852k9.mo13647m());
                    continue;
                case 8:
                    c3240t6 = C0009a8.m88a(abstractC2852k9, c0538d);
                    continue;
                case 9:
                    bVar2 = C3112q7.b.values()[abstractC2852k9.mo13645k()];
                    c0538d.m3725a(1);
                    continue;
                case 10:
                    abstractC2852k9.mo13636a();
                    while (abstractC2852k9.mo13642h()) {
                        arrayList3.add(C3197s8.m15378a(abstractC2852k9, c0538d));
                    }
                    c0538d.m3725a(arrayList3.size());
                    break;
                case 11:
                    abstractC2852k9.mo13636a();
                    while (abstractC2852k9.mo13642h()) {
                        InterfaceC3426x6 m11565a = C2420e8.m11565a(abstractC2852k9, c0538d);
                        if (m11565a != null) {
                            arrayList4.add(m11565a);
                        }
                    }
                    break;
                case 12:
                    abstractC2852k9.mo13638c();
                    while (abstractC2852k9.mo13642h()) {
                        int mo13634a = abstractC2852k9.mo13634a(f12737b);
                        if (mo13634a == 0) {
                            c3155r6 = C0453b8.m3334b(abstractC2852k9, c0538d);
                        } else if (mo13634a != 1) {
                            abstractC2852k9.mo13648n();
                            abstractC2852k9.mo13649o();
                        } else {
                            abstractC2852k9.mo13636a();
                            if (abstractC2852k9.mo13642h()) {
                                c3192s6 = C3514z7.m16788a(abstractC2852k9, c0538d);
                            }
                            while (abstractC2852k9.mo13642h()) {
                                abstractC2852k9.mo13649o();
                            }
                            abstractC2852k9.mo13639d();
                        }
                    }
                    abstractC2852k9.mo13640e();
                    continue;
                case 13:
                    abstractC2852k9.mo13636a();
                    ArrayList arrayList5 = new ArrayList();
                    while (abstractC2852k9.mo13642h()) {
                        abstractC2852k9.mo13638c();
                        while (abstractC2852k9.mo13642h()) {
                            if (abstractC2852k9.mo13634a(f12738c) != 0) {
                                abstractC2852k9.mo13648n();
                                abstractC2852k9.mo13649o();
                            } else {
                                arrayList5.add(abstractC2852k9.mo13647m());
                            }
                        }
                        abstractC2852k9.mo13640e();
                    }
                    abstractC2852k9.mo13639d();
                    c0538d.m3727a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    continue;
                case 14:
                    f3 = (float) abstractC2852k9.mo13644j();
                    continue;
                case 15:
                    f4 = (float) abstractC2852k9.mo13644j();
                    continue;
                case 16:
                    i4 = (int) (abstractC2852k9.mo13645k() * C3295u9.m15753a());
                    continue;
                case 17:
                    i5 = (int) (abstractC2852k9.mo13645k() * C3295u9.m15753a());
                    continue;
                case 18:
                    f = (float) abstractC2852k9.mo13644j();
                    continue;
                case 19:
                    f2 = (float) abstractC2852k9.mo13644j();
                    continue;
                case 20:
                    c2801j6 = C0453b8.m3330a(abstractC2852k9, c0538d, false);
                    continue;
                case 21:
                    str2 = abstractC2852k9.mo13647m();
                    continue;
                case 22:
                    z = abstractC2852k9.mo13643i();
                    continue;
                default:
                    abstractC2852k9.mo13648n();
                    abstractC2852k9.mo13649o();
                    continue;
            }
            abstractC2852k9.mo13639d();
        }
        abstractC2852k9.mo13640e();
        float f5 = f / f3;
        float f6 = f2 / f3;
        ArrayList arrayList6 = new ArrayList();
        if (f5 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C3346v9(c0538d, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f5)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f6 <= 0.0f) {
            f6 = c0538d.m3735e();
        }
        arrayList2.add(new C3346v9(c0538d, valueOf, valueOf, null, f5, Float.valueOf(f6)));
        arrayList2.add(new C3346v9(c0538d, valueOf2, valueOf2, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            c0538d.m3727a("Convert your Illustrator layers to shape layers.");
        }
        return new C3112q7(arrayList4, c0538d, str3, j2, aVar, j, str, arrayList, c3240t6, i, i2, i3, f3, f4, i4, i5, c3155r6, c3192s6, arrayList2, bVar2, c2801j6, z);
    }
}
