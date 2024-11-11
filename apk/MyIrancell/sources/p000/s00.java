package p000;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class s00 extends t00 {

    /* renamed from: a */
    private final y00[] f13003a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s00(java.util.Map<p000.EnumC3412wv, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            wv r0 = p000.EnumC3412wv.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            sv r1 = p000.EnumC3224sv.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            n00 r1 = new n00
            r1.<init>()
        L23:
            r0.add(r1)
            goto L35
        L27:
            sv r1 = p000.EnumC3224sv.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L35
            u00 r1 = new u00
            r1.<init>()
            goto L23
        L35:
            sv r1 = p000.EnumC3224sv.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L45
            o00 r1 = new o00
            r1.<init>()
            r0.add(r1)
        L45:
            sv r1 = p000.EnumC3224sv.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L55
            z00 r3 = new z00
            r3.<init>()
            r0.add(r3)
        L55:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L73
            n00 r3 = new n00
            r3.<init>()
            r0.add(r3)
            o00 r3 = new o00
            r3.<init>()
            r0.add(r3)
            z00 r3 = new z00
            r3.<init>()
            r0.add(r3)
        L73:
            int r3 = r0.size()
            y00[] r3 = new p000.y00[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            y00[] r3 = (p000.y00[]) r3
            r2.f13003a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s00.<init>(java.util.Map):void");
    }

    @Override // p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        int[] m16538a = y00.m16538a(c2531gz);
        for (y00 y00Var : this.f13003a) {
            try {
                C2488fw mo15702a = y00Var.mo15702a(i, c2531gz, m16538a, map);
                boolean z = mo15702a.m11835a() == EnumC3224sv.EAN_13 && mo15702a.m11842e().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(EnumC3412wv.POSSIBLE_FORMATS);
                boolean z2 = collection == null || collection.contains(EnumC3224sv.UPC_A);
                if (!z || !z2) {
                    return mo15702a;
                }
                C2488fw c2488fw = new C2488fw(mo15702a.m11842e().substring(1), mo15702a.m11839b(), mo15702a.m11841d(), EnumC3224sv.UPC_A);
                c2488fw.m11837a(mo15702a.m11840c());
                return c2488fw;
            } catch (AbstractC2447ew unused) {
            }
        }
        throw C0438aw.m3194a();
    }

    @Override // p000.t00, p000.InterfaceC2404dw
    /* renamed from: a */
    public void mo11489a() {
        for (y00 y00Var : this.f13003a) {
            y00Var.mo11489a();
        }
    }
}
