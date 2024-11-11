package p000;

/* renamed from: ky */
/* loaded from: classes.dex */
public final class C2877ky extends AbstractC3102py {
    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C2832jy mo3202a(C2488fw c2488fw) {
        if (c2488fw.m11835a() != EnumC3224sv.EAN_13) {
            return null;
        }
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (m14848b.length() != 13) {
            return null;
        }
        if (m14848b.startsWith("978") || m14848b.startsWith("979")) {
            return new C2832jy(m14848b);
        }
        return null;
    }
}
