package defpackage;

/* loaded from: classes.dex */
public final class xx extends vx {
    private static String e(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1) + ' ' + str.substring(0, indexOf);
    }

    @Override // defpackage.py
    public yx a(fw fwVar) {
        String[] a;
        String b = py.b(fwVar);
        if (!b.startsWith("MECARD:") || (a = vx.a("N:", b, true)) == null) {
            return null;
        }
        String e = e(a[0]);
        String b2 = vx.b("SOUND:", b, true);
        String[] a2 = vx.a("TEL:", b, true);
        String[] a3 = vx.a("EMAIL:", b, true);
        String b3 = vx.b("NOTE:", b, false);
        String[] a4 = vx.a("ADR:", b, true);
        String b4 = vx.b("BDAY:", b, true);
        return new yx(py.a(e), null, b2, a2, null, a3, null, null, b3, a4, null, vx.b("ORG:", b, true), !py.b(b4, 8) ? null : b4, null, vx.a("URL:", b, true), null);
    }
}
