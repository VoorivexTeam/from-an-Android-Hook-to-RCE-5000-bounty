package defpackage;

/* loaded from: classes.dex */
abstract class p10 extends s10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public p10(gz gzVar) {
        super(gzVar);
    }

    @Override // defpackage.t10
    public String c() {
        if (b().c() != 60) {
            throw aw.a();
        }
        StringBuilder sb = new StringBuilder();
        a(sb, 5);
        b(sb, 45, 15);
        return sb.toString();
    }
}
