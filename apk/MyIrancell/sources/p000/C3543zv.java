package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: zv */
/* loaded from: classes.dex */
public final class C3543zv implements InterfaceC2404dw {

    /* renamed from: a */
    private Map<EnumC3412wv, ?> f14537a;

    /* renamed from: b */
    private InterfaceC2404dw[] f14538b;

    /* renamed from: c */
    private C2488fw m16957c(C3320uv c3320uv) {
        InterfaceC2404dw[] interfaceC2404dwArr = this.f14538b;
        if (interfaceC2404dwArr != null) {
            for (InterfaceC2404dw interfaceC2404dw : interfaceC2404dwArr) {
                try {
                    return interfaceC2404dw.mo11488a(c3320uv, this.f14537a);
                } catch (AbstractC2447ew unused) {
                }
            }
        }
        throw C0438aw.m3194a();
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11487a(C3320uv c3320uv) {
        m16958a((Map<EnumC3412wv, ?>) null);
        return m16957c(c3320uv);
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11488a(C3320uv c3320uv, Map<EnumC3412wv, ?> map) {
        m16958a(map);
        return m16957c(c3320uv);
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public void mo11489a() {
        InterfaceC2404dw[] interfaceC2404dwArr = this.f14538b;
        if (interfaceC2404dwArr != null) {
            for (InterfaceC2404dw interfaceC2404dw : interfaceC2404dwArr) {
                interfaceC2404dw.mo11489a();
            }
        }
    }

    /* renamed from: a */
    public void m16958a(Map<EnumC3412wv, ?> map) {
        this.f14537a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(EnumC3412wv.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(EnumC3412wv.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(EnumC3224sv.UPC_A) && !collection.contains(EnumC3224sv.UPC_E) && !collection.contains(EnumC3224sv.EAN_13) && !collection.contains(EnumC3224sv.EAN_8) && !collection.contains(EnumC3224sv.CODABAR) && !collection.contains(EnumC3224sv.CODE_39) && !collection.contains(EnumC3224sv.CODE_93) && !collection.contains(EnumC3224sv.CODE_128) && !collection.contains(EnumC3224sv.ITF) && !collection.contains(EnumC3224sv.RSS_14) && !collection.contains(EnumC3224sv.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new r00(map));
            }
            if (collection.contains(EnumC3224sv.QR_CODE)) {
                arrayList.add(new v20());
            }
            if (collection.contains(EnumC3224sv.DATA_MATRIX)) {
                arrayList.add(new C3505yz());
            }
            if (collection.contains(EnumC3224sv.AZTEC)) {
                arrayList.add(new C2875kw());
            }
            if (collection.contains(EnumC3224sv.PDF_417)) {
                arrayList.add(new e20());
            }
            if (collection.contains(EnumC3224sv.MAXICODE)) {
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
            arrayList.add(new C3505yz());
            arrayList.add(new C2875kw());
            arrayList.add(new e20());
            arrayList.add(new f00());
            if (z2) {
                arrayList.add(new r00(map));
            }
        }
        this.f14538b = (InterfaceC2404dw[]) arrayList.toArray(new InterfaceC2404dw[arrayList.size()]);
    }

    /* renamed from: b */
    public C2488fw m16959b(C3320uv c3320uv) {
        if (this.f14538b == null) {
            m16958a((Map<EnumC3412wv, ?>) null);
        }
        return m16957c(c3320uv);
    }
}
