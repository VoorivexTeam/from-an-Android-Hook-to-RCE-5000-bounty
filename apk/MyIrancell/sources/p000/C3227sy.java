package p000;

/* renamed from: sy */
/* loaded from: classes.dex */
public final class C3227sy extends AbstractC3102py {
    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3183ry mo3202a(C2488fw c2488fw) {
        String str;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (!m14848b.startsWith("smsto:") && !m14848b.startsWith("SMSTO:") && !m14848b.startsWith("mmsto:") && !m14848b.startsWith("MMSTO:")) {
            return null;
        }
        String substring = m14848b.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new C3183ry(substring, (String) null, (String) null, str);
    }
}
