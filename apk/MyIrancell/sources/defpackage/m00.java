package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class m00 extends t00 {
    private static final char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private static final int[] d;
    private static final int e;
    private final StringBuilder a = new StringBuilder(20);
    private final int[] b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        d = iArr;
        e = iArr[47];
    }

    private static char a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = d;
            if (i2 >= iArr.length) {
                throw aw.a();
            }
            if (iArr[i2] == i) {
                return c[i2];
            }
            i2++;
        }
    }

    private static int a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((iArr[i4] * 9.0f) / i);
            if (round < 1 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    private static void a(CharSequence charSequence) {
        int length = charSequence.length();
        a(charSequence, length - 2, 20);
        a(charSequence, length - 1, 15);
    }

    private static void a(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != c[i3 % 47]) {
            throw vv.a();
        }
    }

    private int[] a(gz gzVar) {
        int c2 = gzVar.c();
        int b = gzVar.b(0);
        Arrays.fill(this.b, 0);
        int[] iArr = this.b;
        int length = iArr.length;
        int i = b;
        boolean z = false;
        int i2 = 0;
        while (b < c2) {
            if (gzVar.a(b) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                int i3 = length - 1;
                if (i2 != i3) {
                    i2++;
                } else {
                    if (a(iArr) == e) {
                        return new int[]{i, b};
                    }
                    i += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            b++;
        }
        throw aw.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
    private static String b(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i2 >= length - 1) {
                    throw xv.a();
                }
                i2++;
                char charAt2 = charSequence.charAt(i2);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 - '@';
                            charAt = (char) i;
                            break;
                        } else {
                            throw xv.a();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i = charAt2 - 11;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i = charAt2 + 16;
                        } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                            i = charAt2 + '+';
                        } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                            charAt = 127;
                            break;
                        } else {
                            throw xv.a();
                        }
                        charAt = (char) i;
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i = charAt2 - ' ';
                            charAt = (char) i;
                            break;
                        } else {
                            if (charAt2 != 'Z') {
                                throw xv.a();
                            }
                            charAt = ':';
                            break;
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 + ' ';
                            charAt = (char) i;
                            break;
                        } else {
                            throw xv.a();
                        }
                    default:
                        charAt = 0;
                        break;
                }
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    @Override // defpackage.t00
    public fw a(int i, gz gzVar, Map<wv, ?> map) {
        int b = gzVar.b(a(gzVar)[1]);
        int c2 = gzVar.c();
        int[] iArr = this.b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.a;
        sb.setLength(0);
        while (true) {
            t00.a(gzVar, b, iArr);
            int a = a(iArr);
            if (a < 0) {
                throw aw.a();
            }
            char a2 = a(a);
            sb.append(a2);
            int i2 = b;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int b2 = gzVar.b(i2);
            if (a2 == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                if (b2 == c2 || !gzVar.a(b2)) {
                    throw aw.a();
                }
                if (sb.length() < 2) {
                    throw aw.a();
                }
                a(sb);
                sb.setLength(sb.length() - 2);
                float f = i;
                return new fw(b(sb), null, new hw[]{new hw((r14[1] + r14[0]) / 2.0f, f), new hw(b + (i4 / 2.0f), f)}, sv.CODE_93);
            }
            b = b2;
        }
    }
}
