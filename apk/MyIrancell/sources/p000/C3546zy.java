package p000;

/* renamed from: zy */
/* loaded from: classes.dex */
public final class C3546zy extends AbstractC3102py {
    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3455xy mo3202a(C2488fw c2488fw) {
        int indexOf;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if ((m14848b.startsWith("urlto:") || m14848b.startsWith("URLTO:")) && (indexOf = m14848b.indexOf(58, 6)) >= 0) {
            return new C3455xy(m14848b.substring(indexOf + 1), indexOf > 6 ? m14848b.substring(6, indexOf) : null);
        }
        return null;
    }
}
