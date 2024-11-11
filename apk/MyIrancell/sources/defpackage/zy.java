package defpackage;

/* loaded from: classes.dex */
public final class zy extends py {
    @Override // defpackage.py
    public xy a(fw fwVar) {
        int indexOf;
        String b = py.b(fwVar);
        if ((b.startsWith("urlto:") || b.startsWith("URLTO:")) && (indexOf = b.indexOf(58, 6)) >= 0) {
            return new xy(b.substring(indexOf + 1), indexOf > 6 ? b.substring(6, indexOf) : null);
        }
        return null;
    }
}
