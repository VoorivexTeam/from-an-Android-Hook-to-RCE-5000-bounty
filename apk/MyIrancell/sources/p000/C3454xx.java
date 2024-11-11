package p000;

/* renamed from: xx */
/* loaded from: classes.dex */
public final class C3454xx extends AbstractC3375vx {
    /* renamed from: e */
    private static String m16520e(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1) + ' ' + str.substring(0, indexOf);
    }

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3503yx mo3202a(C2488fw c2488fw) {
        String[] m16059a;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (!m14848b.startsWith("MECARD:") || (m16059a = AbstractC3375vx.m16059a("N:", m14848b, true)) == null) {
            return null;
        }
        String m16520e = m16520e(m16059a[0]);
        String m16060b = AbstractC3375vx.m16060b("SOUND:", m14848b, true);
        String[] m16059a2 = AbstractC3375vx.m16059a("TEL:", m14848b, true);
        String[] m16059a3 = AbstractC3375vx.m16059a("EMAIL:", m14848b, true);
        String m16060b2 = AbstractC3375vx.m16060b("NOTE:", m14848b, false);
        String[] m16059a4 = AbstractC3375vx.m16059a("ADR:", m14848b, true);
        String m16060b3 = AbstractC3375vx.m16060b("BDAY:", m14848b, true);
        return new C3503yx(AbstractC3102py.m14846a(m16520e), null, m16060b, m16059a2, null, m16059a3, null, null, m16060b2, m16059a4, null, AbstractC3375vx.m16060b("ORG:", m14848b, true), !AbstractC3102py.m14851b(m16060b3, 8) ? null : m16060b3, null, AbstractC3375vx.m16059a("URL:", m14848b, true), null);
    }
}
