package p000;

import java.util.Map;

/* loaded from: classes.dex */
public final class u00 extends y00 {

    /* renamed from: h */
    private final y00 f13377h = new n00();

    /* renamed from: a */
    private static C2488fw m15701a(C2488fw c2488fw) {
        String m11842e = c2488fw.m11842e();
        if (m11842e.charAt(0) == '0') {
            return new C2488fw(m11842e.substring(1), null, c2488fw.m11841d(), EnumC3224sv.UPC_A);
        }
        throw C3452xv.m16518a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.y00
    /* renamed from: a */
    public int mo14222a(C2531gz c2531gz, int[] iArr, StringBuilder sb) {
        return this.f13377h.mo14222a(c2531gz, iArr, sb);
    }

    @Override // p000.y00, p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        return m15701a(this.f13377h.mo11530a(i, c2531gz, map));
    }

    @Override // p000.y00
    /* renamed from: a */
    public C2488fw mo15702a(int i, C2531gz c2531gz, int[] iArr, Map<EnumC3412wv, ?> map) {
        return m15701a(this.f13377h.mo15702a(i, c2531gz, iArr, map));
    }

    @Override // p000.t00, p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11487a(C3320uv c3320uv) {
        return m15701a(this.f13377h.mo11487a(c3320uv));
    }

    @Override // p000.t00, p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11488a(C3320uv c3320uv, Map<EnumC3412wv, ?> map) {
        return m15701a(this.f13377h.mo11488a(c3320uv, map));
    }

    @Override // p000.y00
    /* renamed from: b */
    EnumC3224sv mo14223b() {
        return EnumC3224sv.UPC_A;
    }
}
