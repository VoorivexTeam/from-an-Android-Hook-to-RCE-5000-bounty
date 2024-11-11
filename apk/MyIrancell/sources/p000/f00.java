package p000;

import java.util.Map;

/* loaded from: classes.dex */
public final class f00 implements InterfaceC2404dw {

    /* renamed from: b */
    private static final C2568hw[] f10056b = new C2568hw[0];

    /* renamed from: a */
    private final i00 f10057a = new i00();

    /* renamed from: a */
    private static C2571hz m11658a(C2571hz c2571hz) {
        int[] m12296b = c2571hz.m12296b();
        if (m12296b == null) {
            throw C0438aw.m3194a();
        }
        int i = m12296b[0];
        int i2 = m12296b[1];
        int i3 = m12296b[2];
        int i4 = m12296b[3];
        C2571hz c2571hz2 = new C2571hz(30, 33);
        for (int i5 = 0; i5 < 33; i5++) {
            int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
            for (int i7 = 0; i7 < 30; i7++) {
                if (c2571hz.m12295b(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                    c2571hz2.m12298c(i7, i5);
                }
            }
        }
        return c2571hz2;
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11487a(C3320uv c3320uv) {
        return mo11488a(c3320uv, null);
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11488a(C3320uv c3320uv, Map<EnumC3412wv, ?> map) {
        if (map == null || !map.containsKey(EnumC3412wv.PURE_BARCODE)) {
            throw C0438aw.m3194a();
        }
        C2878kz m12313a = this.f10057a.m12313a(m11658a(c3320uv.m15855a()), map);
        C2488fw c2488fw = new C2488fw(m12313a.m13762g(), m12313a.m13759d(), f10056b, EnumC3224sv.MAXICODE);
        String m13756b = m12313a.m13756b();
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
