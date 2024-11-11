package p000;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class e20 implements InterfaceC2404dw {
    /* renamed from: a */
    private static int m11534a(C2568hw c2568hw, C2568hw c2568hw2) {
        if (c2568hw == null || c2568hw2 == null) {
            return 0;
        }
        return (int) Math.abs(c2568hw.m12248a() - c2568hw2.m12248a());
    }

    /* renamed from: a */
    private static int m11535a(C2568hw[] c2568hwArr) {
        return Math.max(Math.max(m11534a(c2568hwArr[0], c2568hwArr[4]), (m11534a(c2568hwArr[6], c2568hwArr[2]) * 17) / 18), Math.max(m11534a(c2568hwArr[1], c2568hwArr[5]), (m11534a(c2568hwArr[7], c2568hwArr[3]) * 17) / 18));
    }

    /* renamed from: a */
    private static C2488fw[] m11536a(C3320uv c3320uv, Map<EnumC3412wv, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        u20 m15492a = t20.m15492a(c3320uv, map, z);
        for (C2568hw[] c2568hwArr : m15492a.m15715b()) {
            C2878kz m14693a = p20.m14693a(m15492a.m15714a(), c2568hwArr[4], c2568hwArr[5], c2568hwArr[6], c2568hwArr[7], m11538b(c2568hwArr), m11535a(c2568hwArr));
            C2488fw c2488fw = new C2488fw(m14693a.m13762g(), m14693a.m13759d(), c2568hwArr, EnumC3224sv.PDF_417);
            c2488fw.m11836a(EnumC2528gw.ERROR_CORRECTION_LEVEL, m14693a.m13756b());
            f20 f20Var = (f20) m14693a.m13758c();
            if (f20Var != null) {
                c2488fw.m11836a(EnumC2528gw.PDF417_EXTRA_METADATA, f20Var);
            }
            arrayList.add(c2488fw);
        }
        return (C2488fw[]) arrayList.toArray(new C2488fw[arrayList.size()]);
    }

    /* renamed from: b */
    private static int m11537b(C2568hw c2568hw, C2568hw c2568hw2) {
        if (c2568hw == null || c2568hw2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(c2568hw.m12248a() - c2568hw2.m12248a());
    }

    /* renamed from: b */
    private static int m11538b(C2568hw[] c2568hwArr) {
        return Math.min(Math.min(m11537b(c2568hwArr[0], c2568hwArr[4]), (m11537b(c2568hwArr[6], c2568hwArr[2]) * 17) / 18), Math.min(m11537b(c2568hwArr[1], c2568hwArr[5]), (m11537b(c2568hwArr[7], c2568hwArr[3]) * 17) / 18));
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11487a(C3320uv c3320uv) {
        return mo11488a(c3320uv, (Map<EnumC3412wv, ?>) null);
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11488a(C3320uv c3320uv, Map<EnumC3412wv, ?> map) {
        C2488fw[] m11536a = m11536a(c3320uv, map, false);
        if (m11536a == null || m11536a.length == 0 || m11536a[0] == null) {
            throw C0438aw.m3194a();
        }
        return m11536a[0];
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public void mo11489a() {
    }
}
