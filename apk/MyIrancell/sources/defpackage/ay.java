package defpackage;

/* loaded from: classes.dex */
public final class ay extends vx {
    @Override // defpackage.py
    public xy a(fw fwVar) {
        String e = fwVar.e();
        if (!e.startsWith("MEBKM:")) {
            return null;
        }
        String b = vx.b("TITLE:", e, true);
        String[] a = vx.a("URL:", e, true);
        if (a == null) {
            return null;
        }
        String str = a[0];
        if (yy.e(str)) {
            return new xy(str, b);
        }
        return null;
    }
}
