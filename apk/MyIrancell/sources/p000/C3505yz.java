package p000;

import java.util.List;
import java.util.Map;

/* renamed from: yz */
/* loaded from: classes.dex */
public final class C3505yz implements InterfaceC2404dw {

    /* renamed from: b */
    private static final C2568hw[] f14308b = new C2568hw[0];

    /* renamed from: a */
    private final c00 f14309a = new c00();

    /* renamed from: a */
    private static int m16687a(int[] iArr, C2571hz c2571hz) {
        int m12300h = c2571hz.m12300h();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < m12300h && c2571hz.m12295b(i, i2)) {
            i++;
        }
        if (i == m12300h) {
            throw C0438aw.m3194a();
        }
        int i3 = i - iArr[0];
        if (i3 != 0) {
            return i3;
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: a */
    private static C2571hz m16688a(C2571hz c2571hz) {
        int[] m12299g = c2571hz.m12299g();
        int[] m12293a = c2571hz.m12293a();
        if (m12299g == null || m12293a == null) {
            throw C0438aw.m3194a();
        }
        int m16687a = m16687a(m12299g, c2571hz);
        int i = m12299g[1];
        int i2 = m12293a[1];
        int i3 = m12299g[0];
        int i4 = ((m12293a[0] - i3) + 1) / m16687a;
        int i5 = ((i2 - i) + 1) / m16687a;
        if (i4 <= 0 || i5 <= 0) {
            throw C0438aw.m3194a();
        }
        int i6 = m16687a / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C2571hz c2571hz2 = new C2571hz(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * m16687a) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (c2571hz.m12295b((i11 * m16687a) + i8, i10)) {
                    c2571hz2.m12298c(i11, i9);
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
    public C2488fw mo11488a(C3320uv c3320uv, Map<EnumC3412wv, ?> map) {
        C2568hw[] m14207b;
        C2878kz c2878kz;
        if (map == null || !map.containsKey(EnumC3412wv.PURE_BARCODE)) {
            C2961mz m11512a = new e00(c3320uv.m15855a()).m11512a();
            C2878kz m3517a = this.f14309a.m3517a(m11512a.m14206a());
            m14207b = m11512a.m14207b();
            c2878kz = m3517a;
        } else {
            c2878kz = this.f14309a.m3517a(m16688a(c3320uv.m15855a()));
            m14207b = f14308b;
        }
        C2488fw c2488fw = new C2488fw(c2878kz.m13762g(), c2878kz.m13759d(), m14207b, EnumC3224sv.DATA_MATRIX);
        List<byte[]> m13753a = c2878kz.m13753a();
        if (m13753a != null) {
            c2488fw.m11836a(EnumC2528gw.BYTE_SEGMENTS, m13753a);
        }
        String m13756b = c2878kz.m13756b();
        if (m13756b != null) {
            c2488fw.m11836a(EnumC2528gw.ERROR_CORRECTION_LEVEL, m13756b);
        }
        return c2488fw;
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public void mo11489a() {
    }
}
