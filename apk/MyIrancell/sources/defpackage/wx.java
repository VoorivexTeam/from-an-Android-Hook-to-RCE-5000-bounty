package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wx extends py {
    private static String[] a(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String b = py.b(str + i2 + ':', str2, '\r', z);
            if (b == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(b);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // defpackage.py
    public yx a(fw fwVar) {
        String b = py.b(fwVar);
        if (!b.contains("MEMORY") || !b.contains("\r\n")) {
            return null;
        }
        String b2 = py.b("NAME1:", b, '\r', true);
        String b3 = py.b("NAME2:", b, '\r', true);
        String[] a = a("TEL", 3, b, true);
        String[] a2 = a("MAIL", 3, b, true);
        String b4 = py.b("MEMORY:", b, '\r', false);
        String b5 = py.b("ADD:", b, '\r', true);
        return new yx(py.a(b2), null, b3, a, null, a2, null, null, b4, b5 != null ? new String[]{b5} : null, null, null, null, null, null, null);
    }
}
