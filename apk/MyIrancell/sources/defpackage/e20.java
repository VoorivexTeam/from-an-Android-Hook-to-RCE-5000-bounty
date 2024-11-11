package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class e20 implements dw {
    private static int a(hw hwVar, hw hwVar2) {
        if (hwVar == null || hwVar2 == null) {
            return 0;
        }
        return (int) Math.abs(hwVar.a() - hwVar2.a());
    }

    private static int a(hw[] hwVarArr) {
        return Math.max(Math.max(a(hwVarArr[0], hwVarArr[4]), (a(hwVarArr[6], hwVarArr[2]) * 17) / 18), Math.max(a(hwVarArr[1], hwVarArr[5]), (a(hwVarArr[7], hwVarArr[3]) * 17) / 18));
    }

    private static fw[] a(uv uvVar, Map<wv, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        u20 a = t20.a(uvVar, map, z);
        for (hw[] hwVarArr : a.b()) {
            kz a2 = p20.a(a.a(), hwVarArr[4], hwVarArr[5], hwVarArr[6], hwVarArr[7], b(hwVarArr), a(hwVarArr));
            fw fwVar = new fw(a2.g(), a2.d(), hwVarArr, sv.PDF_417);
            fwVar.a(gw.ERROR_CORRECTION_LEVEL, a2.b());
            f20 f20Var = (f20) a2.c();
            if (f20Var != null) {
                fwVar.a(gw.PDF417_EXTRA_METADATA, f20Var);
            }
            arrayList.add(fwVar);
        }
        return (fw[]) arrayList.toArray(new fw[arrayList.size()]);
    }

    private static int b(hw hwVar, hw hwVar2) {
        if (hwVar == null || hwVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(hwVar.a() - hwVar2.a());
    }

    private static int b(hw[] hwVarArr) {
        return Math.min(Math.min(b(hwVarArr[0], hwVarArr[4]), (b(hwVarArr[6], hwVarArr[2]) * 17) / 18), Math.min(b(hwVarArr[1], hwVarArr[5]), (b(hwVarArr[7], hwVarArr[3]) * 17) / 18));
    }

    @Override // defpackage.dw
    public fw a(uv uvVar) {
        return a(uvVar, (Map<wv, ?>) null);
    }

    @Override // defpackage.dw
    public fw a(uv uvVar, Map<wv, ?> map) {
        fw[] a = a(uvVar, map, false);
        if (a == null || a.length == 0 || a[0] == null) {
            throw aw.a();
        }
        return a[0];
    }

    @Override // defpackage.dw
    public void a() {
    }
}
