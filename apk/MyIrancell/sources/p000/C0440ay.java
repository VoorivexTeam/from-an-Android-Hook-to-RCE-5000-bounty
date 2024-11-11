package p000;

/* renamed from: ay */
/* loaded from: classes.dex */
public final class C0440ay extends AbstractC3375vx {
    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3455xy mo3202a(C2488fw c2488fw) {
        String m11842e = c2488fw.m11842e();
        if (!m11842e.startsWith("MEBKM:")) {
            return null;
        }
        String m16060b = AbstractC3375vx.m16060b("TITLE:", m11842e, true);
        String[] m16059a = AbstractC3375vx.m16059a("URL:", m11842e, true);
        if (m16059a == null) {
            return null;
        }
        String str = m16059a[0];
        if (C3504yy.m16686e(str)) {
            return new C3455xy(str, m16060b);
        }
        return null;
    }
}
