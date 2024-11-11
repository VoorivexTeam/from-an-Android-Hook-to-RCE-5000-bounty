package defpackage;

/* loaded from: classes.dex */
public final class vy extends py {
    @Override // defpackage.py
    public uy a(fw fwVar) {
        String str;
        String b = py.b(fwVar);
        if (!b.startsWith("tel:") && !b.startsWith("TEL:")) {
            return null;
        }
        if (b.startsWith("TEL:")) {
            str = "tel:" + b.substring(4);
        } else {
            str = b;
        }
        int indexOf = b.indexOf(63, 4);
        return new uy(indexOf < 0 ? b.substring(4) : b.substring(4, indexOf), str, null);
    }
}
