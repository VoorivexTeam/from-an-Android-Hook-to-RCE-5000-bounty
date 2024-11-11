package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class zv implements dw {
    private Map<wv, ?> a;
    private dw[] b;

    private fw c(uv uvVar) {
        dw[] dwVarArr = this.b;
        if (dwVarArr != null) {
            for (dw dwVar : dwVarArr) {
                try {
                    return dwVar.a(uvVar, this.a);
                } catch (ew unused) {
                }
            }
        }
        throw aw.a();
    }

    @Override // defpackage.dw
    public fw a(uv uvVar) {
        a((Map<wv, ?>) null);
        return c(uvVar);
    }

    @Override // defpackage.dw
    public fw a(uv uvVar, Map<wv, ?> map) {
        a(map);
        return c(uvVar);
    }

    @Override // defpackage.dw
    public void a() {
        dw[] dwVarArr = this.b;
        if (dwVarArr != null) {
            for (dw dwVar : dwVarArr) {
                dwVar.a();
            }
        }
    }

    public void a(Map<wv, ?> map) {
        this.a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(wv.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(wv.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(sv.UPC_A) && !collection.contains(sv.UPC_E) && !collection.contains(sv.EAN_13) && !collection.contains(sv.EAN_8) && !collection.contains(sv.CODABAR) && !collection.contains(sv.CODE_39) && !collection.contains(sv.CODE_93) && !collection.contains(sv.CODE_128) && !collection.contains(sv.ITF) && !collection.contains(sv.RSS_14) && !collection.contains(sv.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new r00(map));
            }
            if (collection.contains(sv.QR_CODE)) {
                arrayList.add(new v20());
            }
            if (collection.contains(sv.DATA_MATRIX)) {
                arrayList.add(new yz());
            }
            if (collection.contains(sv.AZTEC)) {
                arrayList.add(new kw());
            }
            if (collection.contains(sv.PDF_417)) {
                arrayList.add(new e20());
            }
            if (collection.contains(sv.MAXICODE)) {
                arrayList.add(new f00());
            }
            if (z && z2) {
                arrayList.add(new r00(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new r00(map));
            }
            arrayList.add(new v20());
            arrayList.add(new yz());
            arrayList.add(new kw());
            arrayList.add(new e20());
            arrayList.add(new f00());
            if (z2) {
                arrayList.add(new r00(map));
            }
        }
        this.b = (dw[]) arrayList.toArray(new dw[arrayList.size()]);
    }

    public fw b(uv uvVar) {
        if (this.b == null) {
            a((Map<wv, ?>) null);
        }
        return c(uvVar);
    }
}
