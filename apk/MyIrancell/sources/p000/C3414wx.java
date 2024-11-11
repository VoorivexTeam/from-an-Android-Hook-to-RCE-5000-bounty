package p000;

import java.util.ArrayList;

/* renamed from: wx */
/* loaded from: classes.dex */
public final class C3414wx extends AbstractC3102py {
    /* renamed from: a */
    private static String[] m16401a(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String m14849b = AbstractC3102py.m14849b(str + i2 + ':', str2, '\r', z);
            if (m14849b == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(m14849b);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3503yx mo3202a(C2488fw c2488fw) {
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (!m14848b.contains("MEMORY") || !m14848b.contains("\r\n")) {
            return null;
        }
        String m14849b = AbstractC3102py.m14849b("NAME1:", m14848b, '\r', true);
        String m14849b2 = AbstractC3102py.m14849b("NAME2:", m14848b, '\r', true);
        String[] m16401a = m16401a("TEL", 3, m14848b, true);
        String[] m16401a2 = m16401a("MAIL", 3, m14848b, true);
        String m14849b3 = AbstractC3102py.m14849b("MEMORY:", m14848b, '\r', false);
        String m14849b4 = AbstractC3102py.m14849b("ADD:", m14848b, '\r', true);
        return new C3503yx(AbstractC3102py.m14846a(m14849b), null, m14849b2, m16401a, null, m16401a2, null, null, m14849b3, m14849b4 != null ? new String[]{m14849b4} : null, null, null, null, null, null, null);
    }
}
