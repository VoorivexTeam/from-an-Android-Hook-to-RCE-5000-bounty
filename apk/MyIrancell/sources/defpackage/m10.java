package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m10 extends r10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m10(gz gzVar) {
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
        sb.append("(392");
        sb.append(a);
        sb.append(')');
        sb.append(a().a(50, (String) null).b());
        return sb.toString();
    }
}
