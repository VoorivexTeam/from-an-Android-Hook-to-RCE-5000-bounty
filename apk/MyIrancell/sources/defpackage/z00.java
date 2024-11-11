package defpackage;

/* loaded from: classes.dex */
public final class z00 extends y00 {
    private static final int[] i = {1, 1, 1, 1, 1, 1};
    private static final int[][] j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    private final int[] h = new int[4];

    private static void a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 <= 1; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                if (i2 == j[i3][i4]) {
                    sb.insert(0, (char) (i3 + 48));
                    sb.append((char) (i4 + 48));
                    return;
                }
            }
        }
        throw aw.a();
    }

    public static String b(String str) {
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
    @Override // defpackage.y00
    public int a(gz gzVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int c = gzVar.c();
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < c; i4++) {
            int a = y00.a(gzVar, iArr2, i2, y00.g);
            sb.append((char) ((a % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (a >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        a(sb, i3);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.y00
    public boolean a(String str) {
        return super.a(b(str));
    }

    @Override // defpackage.y00
    protected int[] a(gz gzVar, int i2) {
        return y00.a(gzVar, i2, true, i);
    }

    @Override // defpackage.y00
    sv b() {
        return sv.UPC_E;
    }
}
