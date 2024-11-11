package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class r00 extends t00 {
    private final t00[] a;

    public r00(Map<wv, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(wv.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(wv.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(sv.EAN_13) || collection.contains(sv.UPC_A) || collection.contains(sv.EAN_8) || collection.contains(sv.UPC_E)) {
                arrayList.add(new s00(map));
            }
            if (collection.contains(sv.CODE_39)) {
                arrayList.add(new l00(z));
            }
            if (collection.contains(sv.CODE_93)) {
                arrayList.add(new m00());
            }
            if (collection.contains(sv.CODE_128)) {
                arrayList.add(new k00());
            }
            if (collection.contains(sv.ITF)) {
                arrayList.add(new q00());
            }
            if (collection.contains(sv.CODABAR)) {
                arrayList.add(new j00());
            }
            if (collection.contains(sv.RSS_14)) {
                arrayList.add(new e10());
            }
            if (collection.contains(sv.RSS_EXPANDED)) {
                arrayList.add(new j10());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new s00(map));
            arrayList.add(new l00());
            arrayList.add(new j00());
            arrayList.add(new m00());
            arrayList.add(new k00());
            arrayList.add(new q00());
            arrayList.add(new e10());
            arrayList.add(new j10());
        }
        this.a = (t00[]) arrayList.toArray(new t00[arrayList.size()]);
    }

    @Override // defpackage.t00
    public fw a(int i, gz gzVar, Map<wv, ?> map) {
        for (t00 t00Var : this.a) {
            try {
                return t00Var.a(i, gzVar, map);
            } catch (ew unused) {
            }
        }
        throw aw.a();
    }

    @Override // defpackage.t00, defpackage.dw
    public void a() {
        for (t00 t00Var : this.a) {
            t00Var.a();
        }
    }
}
