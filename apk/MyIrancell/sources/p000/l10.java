package p000;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l10 extends p10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l10(C2531gz c2531gz) {
        super(c2531gz);
    }

    @Override // p000.s10
    /* renamed from: a */
    protected int mo13537a(int i) {
        return i < 10000 ? i : i - 10000;
    }

    @Override // p000.s10
    /* renamed from: b */
    protected void mo13538b(StringBuilder sb, int i) {
        sb.append(i < 10000 ? "(3202)" : "(3203)");
    }
}
