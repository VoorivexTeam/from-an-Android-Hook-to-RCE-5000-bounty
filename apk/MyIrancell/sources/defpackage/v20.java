package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class v20 implements dw {
    private static final hw[] b = new hw[0];
    private final a30 a = new a30();

    private static float a(int[] iArr, hz hzVar) {
        int c = hzVar.c();
        int h = hzVar.h();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < h && i2 < c) {
            if (z != hzVar.b(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i == h || i2 == c) {
            throw aw.a();
        }
        return (i - iArr[0]) / 7.0f;
    }

    private static hz a(hz hzVar) {
        int[] g = hzVar.g();
        int[] a = hzVar.a();
        if (g == null || a == null) {
            throw aw.a();
        }
        float a2 = a(g, hzVar);
        int i = g[1];
        int i2 = a[1];
        int i3 = g[0];
        int i4 = a[0];
        if (i3 >= i4 || i >= i2) {
            throw aw.a();
        }
        int i5 = i2 - i;
        if (i5 != i4 - i3) {
            i4 = i3 + i5;
        }
        int round = Math.round(((i4 - i3) + 1) / a2);
        int round2 = Math.round((i5 + 1) / a2);
        if (round <= 0 || round2 <= 0) {
            throw aw.a();
        }
        if (round2 != round) {
            throw aw.a();
        }
        int i6 = (int) (a2 / 2.0f);
        int i7 = i + i6;
        int i8 = i3 + i6;
        int i9 = (((int) ((round - 1) * a2)) + i8) - i4;
        if (i9 > 0) {
            if (i9 > i6) {
                throw aw.a();
            }
            i8 -= i9;
        }
        int i10 = (((int) ((round2 - 1) * a2)) + i7) - i2;
        if (i10 > 0) {
            if (i10 > i6) {
                throw aw.a();
            }
            i7 -= i10;
        }
        hz hzVar2 = new hz(round, round2);
        for (int i11 = 0; i11 < round2; i11++) {
            int i12 = ((int) (i11 * a2)) + i7;
            for (int i13 = 0; i13 < round; i13++) {
                if (hzVar.b(((int) (i13 * a2)) + i8, i12)) {
                    hzVar2.c(i13, i11);
                }
            }
        }
        return hzVar2;
    }

    @Override // defpackage.dw
    public fw a(uv uvVar) {
        return a(uvVar, (Map<wv, ?>) null);
    }

    @Override // defpackage.dw
    public final fw a(uv uvVar, Map<wv, ?> map) {
        hw[] b2;
        kz kzVar;
        if (map == null || !map.containsKey(wv.PURE_BARCODE)) {
            mz a = new i30(uvVar.a()).a(map);
            kz a2 = this.a.a(a.a(), map);
            b2 = a.b();
            kzVar = a2;
        } else {
            kzVar = this.a.a(a(uvVar.a()), map);
            b2 = b;
        }
        if (kzVar.c() instanceof e30) {
            ((e30) kzVar.c()).a(b2);
        }
        fw fwVar = new fw(kzVar.g(), kzVar.d(), b2, sv.QR_CODE);
        List<byte[]> a3 = kzVar.a();
        if (a3 != null) {
            fwVar.a(gw.BYTE_SEGMENTS, a3);
        }
        String b3 = kzVar.b();
        if (b3 != null) {
            fwVar.a(gw.ERROR_CORRECTION_LEVEL, b3);
        }
        if (kzVar.h()) {
            fwVar.a(gw.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(kzVar.f()));
            fwVar.a(gw.STRUCTURED_APPEND_PARITY, Integer.valueOf(kzVar.e()));
        }
        return fwVar;
    }

    @Override // defpackage.dw
    public void a() {
    }
}
