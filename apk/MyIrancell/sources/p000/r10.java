package p000;

/* loaded from: classes.dex */
abstract class r10 extends t10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r10(C2531gz c2531gz) {
        super(c2531gz);
    }

    /* renamed from: b */
    private static void m15165b(StringBuilder sb, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            int charAt = sb.charAt(i3 + i) - '0';
            if ((i3 & 1) == 0) {
                charAt *= 3;
            }
            i2 += charAt;
        }
        int i4 = 10 - (i2 % 10);
        sb.append(i4 != 10 ? i4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m15166a(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        m15167a(sb, i, length);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m15167a(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int m3541a = m15481a().m3541a((i3 * 10) + i, 10);
            if (m3541a / 100 == 0) {
                sb.append('0');
            }
            if (m3541a / 10 == 0) {
                sb.append('0');
            }
            sb.append(m3541a);
        }
        m15165b(sb, i2);
    }
}
