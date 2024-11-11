package defpackage;

/* loaded from: classes.dex */
public final class fz extends py {
    @Override // defpackage.py
    public ez a(fw fwVar) {
        String b;
        String b2 = py.b(fwVar);
        if (!b2.startsWith("WIFI:") || (b = py.b("S:", b2, ';', false)) == null || b.isEmpty()) {
            return null;
        }
        String b3 = py.b("P:", b2, ';', false);
        String b4 = py.b("T:", b2, ';', false);
        if (b4 == null) {
            b4 = "nopass";
        }
        return new ez(b4, b, b3, Boolean.parseBoolean(py.b("H:", b2, ';', false)));
    }
}
