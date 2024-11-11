package defpackage;

/* loaded from: classes.dex */
public final class sy extends py {
    @Override // defpackage.py
    public ry a(fw fwVar) {
        String str;
        String b = py.b(fwVar);
        if (!b.startsWith("smsto:") && !b.startsWith("SMSTO:") && !b.startsWith("mmsto:") && !b.startsWith("MMSTO:")) {
            return null;
        }
        String substring = b.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new ry(substring, (String) null, (String) null, str);
    }
}
