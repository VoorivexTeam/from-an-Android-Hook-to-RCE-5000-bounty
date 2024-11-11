package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class yz implements dw {
    private static final hw[] b = new hw[0];
    private final c00 a = new c00();

    private static int a(int[] iArr, hz hzVar) {
        int h = hzVar.h();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < h && hzVar.b(i, i2)) {
            i++;
        }
        if (i == h) {
            throw aw.a();
        }
        int i3 = i - iArr[0];
        if (i3 != 0) {
            return i3;
        }
        throw aw.a();
    }

    private static hz a(hz hzVar) {
        int[] g = hzVar.g();
        int[] a = hzVar.a();
        if (g == null || a == null) {
            throw aw.a();
        }
        int a2 = a(g, hzVar);
        int i = g[1];
        int i2 = a[1];
        int i3 = g[0];
        int i4 = ((a[0] - i3) + 1) / a2;
        int i5 = ((i2 - i) + 1) / a2;
        if (i4 <= 0 || i5 <= 0) {
            throw aw.a();
        }
        int i6 = a2 / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        hz hzVar2 = new hz(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * a2) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (hzVar.b((i11 * a2) + i8, i10)) {
                    hzVar2.c(i11, i9);
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
    public fw a(uv uvVar, Map<wv, ?> map) {
        hw[] b2;
        kz kzVar;
        if (map == null || !map.containsKey(wv.PURE_BARCODE)) {
            mz a = new e00(uvVar.a()).a();
            kz a2 = this.a.a(a.a());
            b2 = a.b();
            kzVar = a2;
        } else {
            kzVar = this.a.a(a(uvVar.a()));
            b2 = b;
        }
        fw fwVar = new fw(kzVar.g(), kzVar.d(), b2, sv.DATA_MATRIX);
        List<byte[]> a3 = kzVar.a();
        if (a3 != null) {
            fwVar.a(gw.BYTE_SEGMENTS, a3);
        }
        String b3 = kzVar.b();
        if (b3 != null) {
            fwVar.a(gw.ERROR_CORRECTION_LEVEL, b3);
        }
        return fwVar;
    }

    @Override // defpackage.dw
    public void a() {
    }
}
