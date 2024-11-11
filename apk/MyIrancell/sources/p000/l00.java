package p000;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class l00 extends t00 {

    /* renamed from: e */
    private static final char[] f11787e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".toCharArray();

    /* renamed from: f */
    static final int[] f11788f;

    /* renamed from: g */
    private static final int f11789g;

    /* renamed from: a */
    private final boolean f11790a;

    /* renamed from: b */
    private final boolean f11791b;

    /* renamed from: c */
    private final StringBuilder f11792c;

    /* renamed from: d */
    private final int[] f11793d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        f11788f = iArr;
        f11789g = iArr[39];
    }

    public l00() {
        this(false);
    }

    public l00(boolean z) {
        this(z, false);
    }

    public l00(boolean z, boolean z2) {
        this.f11790a = z;
        this.f11791b = z2;
        this.f11792c = new StringBuilder(20);
        this.f11793d = new int[9];
    }

    /* renamed from: a */
    private static char m13778a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f11788f;
            if (i2 >= iArr.length) {
                throw C0438aw.m3194a();
            }
            if (iArr[i2] == i) {
                return f11787e[i2];
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static int m13779a(int[] iArr) {
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

    /* renamed from: a */
    private static String m13780a(CharSequence charSequence) {
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
                                    throw C3452xv.m16518a();
                                }
                                charAt = ':';
                            }
                        } else {
                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                throw C3452xv.m16518a();
                            }
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else {
                        if (charAt2 < 'F' || charAt2 > 'W') {
                            throw C3452xv.m16518a();
                        }
                        i = charAt2 - 11;
                    }
                } else {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        throw C3452xv.m16518a();
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

    /* renamed from: a */
    private static int[] m13781a(C2531gz c2531gz, int[] iArr) {
        int m12052c = c2531gz.m12052c();
        int m12050b = c2531gz.m12050b(0);
        int length = iArr.length;
        int i = m12050b;
        boolean z = false;
        int i2 = 0;
        while (m12050b < m12052c) {
            if (c2531gz.m12048a(m12050b) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                int i3 = length - 1;
                if (i2 != i3) {
                    i2++;
                } else {
                    if (m13779a(iArr) == f11789g && c2531gz.m12049a(Math.max(0, i - ((m12050b - i) / 2)), i, false)) {
                        return new int[]{i, m12050b};
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
            m12050b++;
        }
        throw C0438aw.m3194a();
    }

    @Override // p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        int[] iArr = this.f11793d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f11792c;
        sb.setLength(0);
        int m12050b = c2531gz.m12050b(m13781a(c2531gz, iArr)[1]);
        int m12052c = c2531gz.m12052c();
        while (true) {
            t00.m15477a(c2531gz, m12050b, iArr);
            int m13779a = m13779a(iArr);
            if (m13779a < 0) {
                throw C0438aw.m3194a();
            }
            char m13778a = m13778a(m13779a);
            sb.append(m13778a);
            int i2 = m12050b;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int m12050b2 = c2531gz.m12050b(i2);
            if (m13778a == '*') {
                sb.setLength(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                int i6 = (m12050b2 - m12050b) - i4;
                if (m12050b2 != m12052c && i6 * 2 < i4) {
                    throw C0438aw.m3194a();
                }
                if (this.f11790a) {
                    int length = sb.length() - 1;
                    int i7 = 0;
                    for (int i8 = 0; i8 < length; i8++) {
                        i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(this.f11792c.charAt(i8));
                    }
                    if (sb.charAt(length) != f11787e[i7 % 43]) {
                        throw C3373vv.m16057a();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw C0438aw.m3194a();
                }
                float f = i;
                return new C2488fw(this.f11791b ? m13780a(sb) : sb.toString(), null, new C2568hw[]{new C2568hw((r2[1] + r2[0]) / 2.0f, f), new C2568hw(m12050b + (i4 / 2.0f), f)}, EnumC3224sv.CODE_39);
            }
            m12050b = m12050b2;
        }
    }
}
