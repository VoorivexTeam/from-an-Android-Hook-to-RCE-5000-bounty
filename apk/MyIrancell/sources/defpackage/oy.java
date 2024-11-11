package defpackage;

/* loaded from: classes.dex */
public final class oy extends py {
    @Override // defpackage.py
    public ny a(fw fwVar) {
        sv a = fwVar.a();
        if (a != sv.UPC_A && a != sv.UPC_E && a != sv.EAN_8 && a != sv.EAN_13) {
            return null;
        }
        String b = py.b(fwVar);
        if (py.b(b, b.length())) {
            return new ny(b, (a == sv.UPC_E && b.length() == 8) ? z00.b(b) : b);
        }
        return null;
    }
}
