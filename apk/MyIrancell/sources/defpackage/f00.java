package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class f00 implements dw {
    private static final hw[] b = new hw[0];
    private final i00 a = new i00();

    private static hz a(hz hzVar) {
        int[] b2 = hzVar.b();
        if (b2 == null) {
            throw aw.a();
        }
        int i = b2[0];
        int i2 = b2[1];
        int i3 = b2[2];
        int i4 = b2[3];
        hz hzVar2 = new hz(30, 33);
        for (int i5 = 0; i5 < 33; i5++) {
            int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
            for (int i7 = 0; i7 < 30; i7++) {
                if (hzVar.b(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                    hzVar2.c(i7, i5);
                }
            }
        }
        return hzVar2;
    }

    @Override // defpackage.dw
    public fw a(uv uvVar) {
        return a(uvVar, null);
    }

    @Override // defpackage.dw
    public fw a(uv uvVar, Map<wv, ?> map) {
        if (map == null || !map.containsKey(wv.PURE_BARCODE)) {
            throw aw.a();
        }
        kz a = this.a.a(a(uvVar.a()), map);
        fw fwVar = new fw(a.g(), a.d(), b, sv.MAXICODE);
        String b2 = a.b();
        if (b2 != null) {
            fwVar.a(gw.ERROR_CORRECTION_LEVEL, b2);
        }
        return fwVar;
    }

    @Override // defpackage.dw
    public void a() {
    }
}
