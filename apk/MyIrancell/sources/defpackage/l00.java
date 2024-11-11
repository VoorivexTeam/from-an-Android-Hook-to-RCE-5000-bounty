package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class l00 extends t00 {
    private static final char[] e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".toCharArray();
    static final int[] f;
    private static final int g;
    private final boolean a;
    private final boolean b;
    private final StringBuilder c;
    private final int[] d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        f = iArr;
        g = iArr[39];
    }

    public l00() {
        this(false);
    }

    public l00(boolean z) {
        this(z, false);
    }

    public l00(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = new StringBuilder(20);
        this.d = new int[9];
    }

    private static char a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f;
            if (i2 >= iArr.length) {
                throw aw.a();
            }
            if (iArr[i2] == i) {
                return e[i2];
            }
            i2++;
        }
    }

    private static int a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if (i10 * 2 >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    private static String a(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt != '/') {
                                charAt = 0;
                            } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                            } else {
                                if (charAt2 != 'Z') {
                                    throw xv.a();
                                }
                                charAt = ':';
                            }
                        } else {
                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                throw xv.a();
                            }
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else {
                        if (charAt2 < 'F' || charAt2 > 'W') {
                            throw xv.a();
                        }
                        i = charAt2 - 11;
                    }
                } else {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        throw xv.a();
                    }
                    i = charAt2 - '@';
                }
                charAt = (char) i;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    private static int[] a(gz gzVar, int[] iArr) {
        int c = gzVar.c();
        int b = gzVar.b(0);
        int length = iArr.length;
        int i = b;
        boolean z = false;
        int i2 = 0;
        while (b < c) {
            if (gzVar.a(b) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                int i3 = length - 1;
                if (i2 != i3) {
                    i2++;
                } else {
                    if (a(iArr) == g && gzVar.a(Math.max(0, i - ((b - i) / 2)), i, false)) {
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

    @Override // defpackage.t00
    public fw a(int i, gz gzVar, Map<wv, ?> map) {
        int[] iArr = this.d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.c;
        sb.setLength(0);
        int b = gzVar.b(a(gzVar, iArr)[1]);
        int c = gzVar.c();
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
                sb.setLength(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                int i6 = (b2 - b) - i4;
                if (b2 != c && i6 * 2 < i4) {
                    throw aw.a();
                }
                if (this.a) {
                    int length = sb.length() - 1;
                    int i7 = 0;
                    for (int i8 = 0; i8 < length; i8++) {
                        i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(this.c.charAt(i8));
                    }
                    if (sb.charAt(length) != e[i7 % 43]) {
                        throw vv.a();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw aw.a();
                }
                float f2 = i;
                return new fw(this.b ? a(sb) : sb.toString(), null, new hw[]{new hw((r2[1] + r2[0]) / 2.0f, f2), new hw(b + (i4 / 2.0f), f2)}, sv.CODE_39);
            }
            b = b2;
        }
    }
}
