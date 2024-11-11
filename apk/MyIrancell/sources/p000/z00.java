package p000;

/* loaded from: classes.dex */
public final class z00 extends y00 {

    /* renamed from: i */
    private static final int[] f14310i = {1, 1, 1, 1, 1, 1};

    /* renamed from: j */
    private static final int[][] f14311j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h */
    private final int[] f14312h = new int[4];

    /* renamed from: a */
    private static void m16696a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f14311j[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: b */
    public static String m16697b(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.y00
    /* renamed from: a */
    public int mo14222a(C2531gz c2531gz, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f14312h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m12052c = c2531gz.m12052c();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < m12052c; i3++) {
            int m16536a = y00.m16536a(c2531gz, iArr2, i, y00.f14086g);
            sb.append((char) ((m16536a % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m16536a >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m16696a(sb, i2);
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.y00
    /* renamed from: a */
    public boolean mo16541a(String str) {
        return super.mo16541a(m16697b(str));
    }

    @Override // p000.y00
    /* renamed from: a */
    protected int[] mo16542a(C2531gz c2531gz, int i) {
        return y00.m16539a(c2531gz, i, true, f14310i);
    }

    @Override // p000.y00
    /* renamed from: b */
    EnumC3224sv mo14223b() {
        return EnumC3224sv.UPC_E;
    }
}
