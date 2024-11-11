package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class r00 extends t00 {

    /* renamed from: a */
    private final t00[] f12857a;

    public r00(Map<EnumC3412wv, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC3412wv.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(EnumC3412wv.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC3224sv.EAN_13) || collection.contains(EnumC3224sv.UPC_A) || collection.contains(EnumC3224sv.EAN_8) || collection.contains(EnumC3224sv.UPC_E)) {
                arrayList.add(new s00(map));
            }
            if (collection.contains(EnumC3224sv.CODE_39)) {
                arrayList.add(new l00(z));
            }
            if (collection.contains(EnumC3224sv.CODE_93)) {
                arrayList.add(new m00());
            }
            if (collection.contains(EnumC3224sv.CODE_128)) {
                arrayList.add(new k00());
            }
            if (collection.contains(EnumC3224sv.ITF)) {
                arrayList.add(new q00());
            }
            if (collection.contains(EnumC3224sv.CODABAR)) {
                arrayList.add(new j00());
            }
            if (collection.contains(EnumC3224sv.RSS_14)) {
                arrayList.add(new e10());
            }
            if (collection.contains(EnumC3224sv.RSS_EXPANDED)) {
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
        this.f12857a = (t00[]) arrayList.toArray(new t00[arrayList.size()]);
    }

    @Override // p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        for (t00 t00Var : this.f12857a) {
            try {
                return t00Var.mo11530a(i, c2531gz, map);
            } catch (AbstractC2447ew unused) {
            }
        }
        throw C0438aw.m3194a();
    }

    @Override // p000.t00, p000.InterfaceC2404dw
    /* renamed from: a */
    public void mo11489a() {
        for (t00 t00Var : this.f12857a) {
            t00Var.mo11489a();
        }
    }
}
