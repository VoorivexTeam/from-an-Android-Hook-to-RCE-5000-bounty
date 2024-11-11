package p000;

import java.util.Arrays;

/* renamed from: lw */
/* loaded from: classes.dex */
public final class C2912lw {

    /* renamed from: b */
    private static final String[] f11923b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f11924c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f11925d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f11926e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f11927f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C2830jw f11928a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lw$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11929a;

        static {
            int[] iArr = new int[b.values().length];
            f11929a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11929a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11929a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11929a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11929a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lw$b */
    /* loaded from: classes.dex */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    private static int m13934a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    /* renamed from: a */
    private static int m13935a(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static String m13936a(b bVar, int i) {
        int i2 = a.f11929a[bVar.ordinal()];
        if (i2 == 1) {
            return f11923b[i];
        }
        if (i2 == 2) {
            return f11924c[i];
        }
        if (i2 == 3) {
            return f11925d[i];
        }
        if (i2 == 4) {
            return f11926e[i];
        }
        if (i2 == 5) {
            return f11927f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: a */
    private static b m13937a(char c) {
        return c != 'B' ? c != 'D' ? c != 'P' ? c != 'L' ? c != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : b.DIGIT : b.BINARY;
    }

    /* renamed from: a */
    private boolean[] m13938a(boolean[] zArr) {
        C3324uz c3324uz;
        int i = 8;
        if (this.f11928a.m13522d() <= 2) {
            i = 6;
            c3324uz = C3324uz.f13518j;
        } else if (this.f11928a.m13522d() <= 8) {
            c3324uz = C3324uz.f13522n;
        } else if (this.f11928a.m13522d() <= 22) {
            i = 10;
            c3324uz = C3324uz.f13517i;
        } else {
            i = 12;
            c3324uz = C3324uz.f13516h;
        }
        int m13521c = this.f11928a.m13521c();
        int length = zArr.length / i;
        if (length < m13521c) {
            throw C3452xv.m16518a();
        }
        int length2 = zArr.length % i;
        int i2 = length - m13521c;
        int[] iArr = new int[length];
        int i3 = 0;
        while (i3 < length) {
            iArr[i3] = m13935a(zArr, length2, i);
            i3++;
            length2 += i;
        }
        try {
            new C3416wz(c3324uz).m16405a(iArr, i2);
            int i4 = (1 << i) - 1;
            int i5 = 0;
            for (int i6 = 0; i6 < m13521c; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4) {
                    throw C3452xv.m16518a();
                }
                if (i7 == 1 || i7 == i4 - 1) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(m13521c * i) - i5];
            int i8 = 0;
            for (int i9 = 0; i9 < m13521c; i9++) {
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
        } catch (C3456xz e) {
            throw C3452xv.m16519a(e);
        }
    }

    /* renamed from: b */
    private static String m13939b(boolean[] zArr) {
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
                int m13935a = m13935a(zArr, i, i2);
                i += i2;
                String m13936a = m13936a(bVar, m13935a);
                if (m13936a.startsWith("CTRL_")) {
                    b m13937a = m13937a(m13936a.charAt(5));
                    if (m13936a.charAt(6) == 'L') {
                        bVar = m13937a;
                        bVar2 = bVar;
                    } else {
                        bVar = m13937a;
                    }
                } else {
                    sb.append(m13936a);
                    bVar = bVar2;
                }
            } else {
                if (length - i < 5) {
                    break;
                }
                int m13935a2 = m13935a(zArr, i, 5);
                i += 5;
                if (m13935a2 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    m13935a2 = m13935a(zArr, i, 11) + 31;
                    i += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= m13935a2) {
                        break;
                    }
                    if (length - i < 8) {
                        i = length;
                        break;
                    }
                    sb.append((char) m13935a(zArr, i, 8));
                    i += 8;
                    i3++;
                }
                bVar = bVar2;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C2878kz m13940a(C2830jw c2830jw) {
        this.f11928a = c2830jw;
        return new C2878kz(null, m13939b(m13938a(m13941a(c2830jw.m14206a()))), null, null);
    }

    /* renamed from: a */
    boolean[] m13941a(C2571hz c2571hz) {
        boolean m13523e = this.f11928a.m13523e();
        int m13522d = this.f11928a.m13522d();
        int i = m13523e ? (m13522d * 4) + 11 : (m13522d * 4) + 14;
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m13934a(m13522d, m13523e)];
        int i2 = 2;
        if (m13523e) {
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
        while (i7 < m13522d) {
            int i9 = (m13522d - i7) * 4;
            int i10 = m13523e ? i9 + 9 : i9 + 12;
            int i11 = i7 * 2;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 * 2;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i8 + i14 + i15] = c2571hz.m12295b(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i8 + i14 + i15] = c2571hz.m12295b(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i8 + i14 + i15] = c2571hz.m12295b(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i8 + i14 + i15] = c2571hz.m12295b(iArr[i20], iArr[i16]);
                    i15++;
                    i2 = 2;
                    m13522d = m13522d;
                    m13523e = m13523e;
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
