package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l10 extends p10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l10(gz gzVar) {
        super(gzVar);
    }

    @Override // defpackage.s10
    protected int a(int i) {
        return i < 10000 ? i : i - 10000;
    }

    @Override // defpackage.s10
    protected void b(StringBuilder sb, int i) {
        sb.append(i < 10000 ? "(3202)" : "(3203)");
    }
}
