package p000;

/* renamed from: ty */
/* loaded from: classes.dex */
public final class C3279ty extends AbstractC3102py {
    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C2363cy mo3202a(C2488fw c2488fw) {
        String str;
        String str2;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (!m14848b.startsWith("smtp:") && !m14848b.startsWith("SMTP:")) {
            return null;
        }
        String substring = m14848b.substring(5);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            String substring2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(58);
            if (indexOf2 >= 0) {
                String substring3 = substring2.substring(indexOf2 + 1);
                str = substring2.substring(0, indexOf2);
                str2 = substring3;
            } else {
                str2 = null;
                str = substring2;
            }
        } else {
            str = null;
            str2 = null;
        }
        return new C2363cy(new String[]{substring}, null, null, str, str2);
    }
}
