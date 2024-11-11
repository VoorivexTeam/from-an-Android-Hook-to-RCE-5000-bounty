package p000;

import java.util.ArrayList;

/* renamed from: zx */
/* loaded from: classes.dex */
public final class C3545zx extends AbstractC3375vx {
    /* renamed from: a */
    private static String m16966a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    /* renamed from: a */
    private static String[] m16967a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3503yx mo3202a(C2488fw c2488fw) {
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (!m14848b.startsWith("BIZCARD:")) {
            return null;
        }
        String m16966a = m16966a(AbstractC3375vx.m16060b("N:", m14848b, true), AbstractC3375vx.m16060b("X:", m14848b, true));
        String m16060b = AbstractC3375vx.m16060b("T:", m14848b, true);
        String m16060b2 = AbstractC3375vx.m16060b("C:", m14848b, true);
        return new C3503yx(AbstractC3102py.m14846a(m16966a), null, null, m16967a(AbstractC3375vx.m16060b("B:", m14848b, true), AbstractC3375vx.m16060b("M:", m14848b, true), AbstractC3375vx.m16060b("F:", m14848b, true)), null, AbstractC3102py.m14846a(AbstractC3375vx.m16060b("E:", m14848b, true)), null, null, null, AbstractC3375vx.m16059a("A:", m14848b, true), null, m16060b2, null, m16060b, null, null);
    }
}
