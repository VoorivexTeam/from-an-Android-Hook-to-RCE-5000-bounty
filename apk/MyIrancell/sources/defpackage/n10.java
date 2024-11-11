package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n10 extends r10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n10(gz gzVar) {
        super(gzVar);
    }

    @Override // defpackage.t10
    public String c() {
        if (b().c() < 48) {
            throw aw.a();
        }
        StringBuilder sb = new StringBuilder();
        a(sb, 8);
        int a = a().a(48, 2);
        sb.append("(393");
        sb.append(a);
        sb.append(')');
        int a2 = a().a(50, 10);
        if (a2 / 100 == 0) {
            sb.append('0');
        }
        if (a2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(a2);
        sb.append(a().a(60, (String) null).b());
        return sb.toString();
    }
}
