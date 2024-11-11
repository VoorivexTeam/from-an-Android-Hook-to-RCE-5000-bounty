package defpackage;

/* loaded from: classes.dex */
public final class ky extends py {
    @Override // defpackage.py
    public jy a(fw fwVar) {
        if (fwVar.a() != sv.EAN_13) {
            return null;
        }
        String b = py.b(fwVar);
        if (b.length() != 13) {
            return null;
        }
        if (b.startsWith("978") || b.startsWith("979")) {
            return new jy(b);
        }
        return null;
    }
}
