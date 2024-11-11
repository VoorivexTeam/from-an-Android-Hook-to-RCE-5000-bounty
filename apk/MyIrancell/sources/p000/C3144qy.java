package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: qy */
/* loaded from: classes.dex */
public final class C3144qy extends AbstractC3102py {
    /* renamed from: a */
    private static void m15153a(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        String str2 = null;
        if (indexOf < 0) {
            collection.add(str);
        } else {
            collection.add(str.substring(0, indexOf));
            String substring = str.substring(indexOf + 1);
            if (substring.startsWith("via=")) {
                str2 = substring.substring(4);
            }
        }
        collection2.add(str2);
    }

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3183ry mo3202a(C2488fw c2488fw) {
        String str;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        String str2 = null;
        if (!m14848b.startsWith("sms:") && !m14848b.startsWith("SMS:") && !m14848b.startsWith("mms:") && !m14848b.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> m14850b = AbstractC3102py.m14850b(m14848b);
        boolean z = false;
        if (m14850b == null || m14850b.isEmpty()) {
            str = null;
        } else {
            str2 = m14850b.get("subject");
            str = m14850b.get("body");
            z = true;
        }
        int indexOf = m14848b.indexOf(63, 4);
        String substring = (indexOf < 0 || !z) ? m14848b.substring(4) : m14848b.substring(4, indexOf);
        int i = -1;
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        while (true) {
            int i2 = i + 1;
            int indexOf2 = substring.indexOf(44, i2);
            if (indexOf2 <= i) {
                m15153a(arrayList, arrayList2, substring.substring(i2));
                return new C3183ry((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
            m15153a(arrayList, arrayList2, substring.substring(i2, indexOf2));
            i = indexOf2;
        }
    }
}
