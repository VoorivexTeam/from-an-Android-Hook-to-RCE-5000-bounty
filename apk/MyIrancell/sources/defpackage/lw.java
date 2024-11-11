package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class lw {
    private static final String[] b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    private jw a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    private static int a(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static String a(b bVar, int i) {
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1) {
            return b[i];
        }
        if (i2 == 2) {
            return c[i];
        }
        if (i2 == 3) {
            return d[i];
        }
        if (i2 == 4) {
            return e[i];
        }
        if (i2 == 5) {
            return f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    private static b a(char c2) {
        return c2 != 'B' ? c2 != 'D' ? c2 != 'P' ? c2 != 'L' ? c2 != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : b.DIGIT : b.BINARY;
    }

    private boolean[] a(boolean[] zArr) {
        uz uzVar;
        int i = 8;
        if (this.a.d() <= 2) {
            i = 6;
            uzVar = uz.j;
        } else if (this.a.d() <= 8) {
            uzVar = uz.n;
        } else if (this.a.d() <= 22) {
            i = 10;
            uzVar = uz.i;
        } else {
            i = 12;
            uzVar = uz.h;
        }
        int c2 = this.a.c();
        int length = zArr.length / i;
        if (length < c2) {
            throw xv.a();
        }
        int length2 = zArr.length % i;
        int i2 = length - c2;
        int[] iArr = new int[length];
        int i3 = 0;
        while (i3 < length) {
            iArr[i3] = a(zArr, length2, i);
            i3++;
            length2 += i;
        }
        try {
            new wz(uzVar).a(iArr, i2);
            int i4 = (1 << i) - 1;
            int i5 = 0;
            for (int i6 = 0; i6 < c2; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4) {
                    throw xv.a();
                }
                if (i7 == 1 || i7 == i4 - 1) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(c2 * i) - i5];
            int i8 = 0;
            for (int i9 = 0; i9 < c2; i9++) {
                int i10 = iArr[i9];
                if (i10 == 1 || i10 == i4 - 1) {
                    Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                    i8 += i - 1;
                } else {
                    int i11 = i - 1;
                    while (i11 >= 0) {
                        int i12 = i8 + 1;
                        zArr2[i8] = ((1 << i11) & i10) != 0;
                        i11--;
                        i8 = i12;
                    }
                }
            }
            return zArr2;
        } catch (xz e2) {
            throw xv.a(e2);
        }
    }

    private static String b(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        b bVar2 = bVar;
        int i = 0;
        while (i < length) {
            if (bVar != b.BINARY) {
                int i2 = bVar == b.DIGIT ? 4 : 5;
                if (length - i < i2) {
                    break;
                }
                int a2 = a(zArr, i, i2);
                i += i2;
                String a3 = a(bVar, a2);
                if (a3.startsWith("CTRL_")) {
                    b a4 = a(a3.charAt(5));
                    if (a3.charAt(6) == 'L') {
                        bVar = a4;
                        bVar2 = bVar;
                    } else {
                        bVar = a4;
                    }
                } else {
                    sb.append(a3);
                    bVar = bVar2;
                }
            } else {
                if (length - i < 5) {
                    break;
                }
                int a5 = a(zArr, i, 5);
                i += 5;
                if (a5 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    a5 = a(zArr, i, 11) + 31;
                    i += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= a5) {
                        break;
                    }
                    if (length - i < 8) {
                        i = length;
                        break;
                    }
                    sb.append((char) a(zArr, i, 8));
                    i += 8;
                    i3++;
                }
                bVar = bVar2;
            }
        }
        return sb.toString();
    }

    public kz a(jw jwVar) {
        this.a = jwVar;
        return new kz(null, b(a(a(jwVar.a()))), null, null);
    }

    boolean[] a(hz hzVar) {
        boolean e2 = this.a.e();
        int d2 = this.a.d();
        int i = e2 ? (d2 * 4) + 11 : (d2 * 4) + 14;
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[a(d2, e2)];
        int i2 = 2;
        if (e2) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                iArr[(i4 - i6) - 1] = (i5 - r12) - 1;
                iArr[i4 + i6] = (i6 / 15) + i6 + i5 + 1;
            }
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < d2) {
            int i9 = (d2 - i7) * 4;
            int i10 = e2 ? i9 + 9 : i9 + 12;
            int i11 = i7 * 2;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 * 2;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i8 + i14 + i15] = hzVar.b(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i8 + i14 + i15] = hzVar.b(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i8 + i14 + i15] = hzVar.b(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i8 + i14 + i15] = hzVar.b(iArr[i20], iArr[i16]);
                    i15++;
                    i2 = 2;
                    d2 = d2;
                    e2 = e2;
                }
                i13++;
                i2 = 2;
            }
            i8 += i10 * 8;
            i7++;
            i2 = 2;
        }
        return zArr;
    }
}
