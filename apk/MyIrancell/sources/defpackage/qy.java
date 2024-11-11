package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class qy extends py {
    private static void a(Collection<String> collection, Collection<String> collection2, String str) {
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

    @Override // defpackage.py
    public ry a(fw fwVar) {
        String str;
        String b = py.b(fwVar);
        String str2 = null;
        if (!b.startsWith("sms:") && !b.startsWith("SMS:") && !b.startsWith("mms:") && !b.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> b2 = py.b(b);
        boolean z = false;
        if (b2 == null || b2.isEmpty()) {
            str = null;
        } else {
            str2 = b2.get("subject");
            str = b2.get("body");
            z = true;
        }
        int indexOf = b.indexOf(63, 4);
        String substring = (indexOf < 0 || !z) ? b.substring(4) : b.substring(4, indexOf);
        int i = -1;
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        while (true) {
            int i2 = i + 1;
            int indexOf2 = substring.indexOf(44, i2);
            if (indexOf2 <= i) {
                a(arrayList, arrayList2, substring.substring(i2));
                return new ry((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
            a(arrayList, arrayList2, substring.substring(i2, indexOf2));
            i = indexOf2;
        }
    }
}
