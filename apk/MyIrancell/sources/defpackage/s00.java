package defpackage;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class s00 extends t00 {
    private final y00[] a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s00(java.util.Map<defpackage.wv, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            wv r0 = defpackage.wv.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            sv r1 = defpackage.sv.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            n00 r1 = new n00
            r1.<init>()
        L23:
            r0.add(r1)
            goto L35
        L27:
            sv r1 = defpackage.sv.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L35
            u00 r1 = new u00
            r1.<init>()
            goto L23
        L35:
            sv r1 = defpackage.sv.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L45
            o00 r1 = new o00
            r1.<init>()
            r0.add(r1)
        L45:
            sv r1 = defpackage.sv.UPC_E
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
            y00[] r3 = new defpackage.y00[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            y00[] r3 = (defpackage.y00[]) r3
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s00.<init>(java.util.Map):void");
    }

    @Override // defpackage.t00
    public fw a(int i, gz gzVar, Map<wv, ?> map) {
        int[] a = y00.a(gzVar);
        for (y00 y00Var : this.a) {
            try {
                fw a2 = y00Var.a(i, gzVar, a, map);
                boolean z = a2.a() == sv.EAN_13 && a2.e().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(wv.POSSIBLE_FORMATS);
                boolean z2 = collection == null || collection.contains(sv.UPC_A);
                if (!z || !z2) {
                    return a2;
                }
                fw fwVar = new fw(a2.e().substring(1), a2.b(), a2.d(), sv.UPC_A);
                fwVar.a(a2.c());
                return fwVar;
            } catch (ew unused) {
            }
        }
        throw aw.a();
    }

    @Override // defpackage.t00, defpackage.dw
    public void a() {
        for (y00 y00Var : this.a) {
            y00Var.a();
        }
    }
}
