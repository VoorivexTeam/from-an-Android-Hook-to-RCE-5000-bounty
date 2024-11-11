package p000;

/* renamed from: oy */
/* loaded from: classes.dex */
public final class C3063oy extends AbstractC3102py {
    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3006ny mo3202a(C2488fw c2488fw) {
        EnumC3224sv m11835a = c2488fw.m11835a();
        if (m11835a != EnumC3224sv.UPC_A && m11835a != EnumC3224sv.UPC_E && m11835a != EnumC3224sv.EAN_8 && m11835a != EnumC3224sv.EAN_13) {
            return null;
        }
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (AbstractC3102py.m14851b(m14848b, m14848b.length())) {
            return new C3006ny(m14848b, (m11835a == EnumC3224sv.UPC_E && m14848b.length() == 8) ? z00.m16697b(m14848b) : m14848b);
        }
        return null;
    }
}
