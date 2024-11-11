package p000;

/* renamed from: vy */
/* loaded from: classes.dex */
public final class C3376vy extends AbstractC3102py {
    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3323uy mo3202a(C2488fw c2488fw) {
        String str;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (!m14848b.startsWith("tel:") && !m14848b.startsWith("TEL:")) {
            return null;
        }
        if (m14848b.startsWith("TEL:")) {
            str = "tel:" + m14848b.substring(4);
        } else {
            str = m14848b;
        }
        int indexOf = m14848b.indexOf(63, 4);
        return new C3323uy(indexOf < 0 ? m14848b.substring(4) : m14848b.substring(4, indexOf), str, null);
    }
}
