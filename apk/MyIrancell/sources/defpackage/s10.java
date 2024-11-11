package defpackage;

/* loaded from: classes.dex */
abstract class s10 extends r10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s10(gz gzVar) {
        super(gzVar);
    }

    protected abstract int a(int i);

    protected abstract void b(StringBuilder sb, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(StringBuilder sb, int i, int i2) {
        int a = a().a(i, i2);
        b(sb, a);
        int a2 = a(a);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (a2 / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(a2);
    }
}
