package p000;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class v20 implements InterfaceC2404dw {

    /* renamed from: b */
    private static final C2568hw[] f13541b = new C2568hw[0];

    /* renamed from: a */
    private final a30 f13542a = new a30();

    /* renamed from: a */
    private static float m15897a(int[] iArr, C2571hz c2571hz) {
        int m12297c = c2571hz.m12297c();
        int m12300h = c2571hz.m12300h();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < m12300h && i2 < m12297c) {
            if (z != c2571hz.m12295b(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i == m12300h || i2 == m12297c) {
            throw C0438aw.m3194a();
        }
        return (i - iArr[0]) / 7.0f;
    }

    /* renamed from: a */
    private static C2571hz m15898a(C2571hz c2571hz) {
        int[] m12299g = c2571hz.m12299g();
        int[] m12293a = c2571hz.m12293a();
        if (m12299g == null || m12293a == null) {
            throw C0438aw.m3194a();
        }
        float m15897a = m15897a(m12299g, c2571hz);
        int i = m12299g[1];
        int i2 = m12293a[1];
        int i3 = m12299g[0];
        int i4 = m12293a[0];
        if (i3 >= i4 || i >= i2) {
            throw C0438aw.m3194a();
        }
        int i5 = i2 - i;
        if (i5 != i4 - i3) {
            i4 = i3 + i5;
        }
        int round = Math.round(((i4 - i3) + 1) / m15897a);
        int round2 = Math.round((i5 + 1) / m15897a);
        if (round <= 0 || round2 <= 0) {
            throw C0438aw.m3194a();
        }
        if (round2 != round) {
            throw C0438aw.m3194a();
        }
        int i6 = (int) (m15897a / 2.0f);
        int i7 = i + i6;
        int i8 = i3 + i6;
        int i9 = (((int) ((round - 1) * m15897a)) + i8) - i4;
        if (i9 > 0) {
            if (i9 > i6) {
                throw C0438aw.m3194a();
            }
            i8 -= i9;
        }
        int i10 = (((int) ((round2 - 1) * m15897a)) + i7) - i2;
        if (i10 > 0) {
            if (i10 > i6) {
                throw C0438aw.m3194a();
            }
            i7 -= i10;
        }
        C2571hz c2571hz2 = new C2571hz(round, round2);
        for (int i11 = 0; i11 < round2; i11++) {
            int i12 = ((int) (i11 * m15897a)) + i7;
            for (int i13 = 0; i13 < round; i13++) {
                if (c2571hz.m12295b(((int) (i13 * m15897a)) + i8, i12)) {
                    c2571hz2.m12298c(i13, i11);
                }
            }
        }
        return c2571hz2;
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11487a(C3320uv c3320uv) {
        return mo11488a(c3320uv, (Map<EnumC3412wv, ?>) null);
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public final C2488fw mo11488a(C3320uv c3320uv, Map<EnumC3412wv, ?> map) {
        C2568hw[] m14207b;
        C2878kz c2878kz;
        if (map == null || !map.containsKey(EnumC3412wv.PURE_BARCODE)) {
            C2961mz m12343a = new i30(c3320uv.m15855a()).m12343a(map);
            C2878kz m45a = this.f13542a.m45a(m12343a.m14206a(), map);
            m14207b = m12343a.m14207b();
            c2878kz = m45a;
        } else {
            c2878kz = this.f13542a.m45a(m15898a(c3320uv.m15855a()), map);
            m14207b = f13541b;
        }
        if (c2878kz.m13758c() instanceof e30) {
            ((e30) c2878kz.m13758c()).m11540a(m14207b);
        }
        C2488fw c2488fw = new C2488fw(c2878kz.m13762g(), c2878kz.m13759d(), m14207b, EnumC3224sv.QR_CODE);
        List<byte[]> m13753a = c2878kz.m13753a();
        if (m13753a != null) {
            c2488fw.m11836a(EnumC2528gw.BYTE_SEGMENTS, m13753a);
        }
        String m13756b = c2878kz.m13756b();
        if (m13756b != null) {
            c2488fw.m11836a(EnumC2528gw.ERROR_CORRECTION_LEVEL, m13756b);
        }
        if (c2878kz.m13763h()) {
            c2488fw.m11836a(EnumC2528gw.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c2878kz.m13761f()));
            c2488fw.m11836a(EnumC2528gw.STRUCTURED_APPEND_PARITY, Integer.valueOf(c2878kz.m13760e()));
        }
        return c2488fw;
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public void mo11489a() {
    }
}
