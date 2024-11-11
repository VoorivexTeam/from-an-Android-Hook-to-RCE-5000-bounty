package p000;

/* renamed from: fz */
/* loaded from: classes.dex */
public final class C2491fz extends AbstractC3102py {
    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C2450ez mo3202a(C2488fw c2488fw) {
        String m14849b;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (!m14848b.startsWith("WIFI:") || (m14849b = AbstractC3102py.m14849b("S:", m14848b, ';', false)) == null || m14849b.isEmpty()) {
            return null;
        }
        String m14849b2 = AbstractC3102py.m14849b("P:", m14848b, ';', false);
        String m14849b3 = AbstractC3102py.m14849b("T:", m14848b, ';', false);
        if (m14849b3 == null) {
            m14849b3 = "nopass";
        }
        return new C2450ez(m14849b3, m14849b, m14849b2, Boolean.parseBoolean(AbstractC3102py.m14849b("H:", m14848b, ';', false)));
    }
}
