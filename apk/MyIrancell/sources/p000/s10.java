package p000;

/* loaded from: classes.dex */
abstract class s10 extends r10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s10(C2531gz c2531gz) {
        super(c2531gz);
    }

    /* renamed from: a */
    protected abstract int mo13537a(int i);

    /* renamed from: b */
    protected abstract void mo13538b(StringBuilder sb, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m15320b(StringBuilder sb, int i, int i2) {
        int m3541a = m15481a().m3541a(i, i2);
        mo13538b(sb, m3541a);
        int mo13537a = mo13537a(m3541a);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (mo13537a / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(mo13537a);
    }
}
