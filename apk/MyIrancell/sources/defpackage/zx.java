package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zx extends vx {
    private static String a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    private static String[] a(String str, String str2, String str3) {
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

    @Override // defpackage.py
    public yx a(fw fwVar) {
        String b = py.b(fwVar);
        if (!b.startsWith("BIZCARD:")) {
            return null;
        }
        String a = a(vx.b("N:", b, true), vx.b("X:", b, true));
        String b2 = vx.b("T:", b, true);
        String b3 = vx.b("C:", b, true);
        return new yx(py.a(a), null, null, a(vx.b("B:", b, true), vx.b("M:", b, true), vx.b("F:", b, true)), null, py.a(vx.b("E:", b, true)), null, null, null, vx.a("A:", b, true), null, b3, null, b2, null, null);
    }
}
