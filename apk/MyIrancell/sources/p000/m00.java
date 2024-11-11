package p000;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class m00 extends t00 {

    /* renamed from: c */
    private static final char[] f11983c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    private static final int[] f11984d;

    /* renamed from: e */
    private static final int f11985e;

    /* renamed from: a */
    private final StringBuilder f11986a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f11987b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f11984d = iArr;
        f11985e = iArr[47];
    }

    /* renamed from: a */
    private static char m13977a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f11984d;
            if (i2 >= iArr.length) {
                throw C0438aw.m3194a();
            }
            if (iArr[i2] == i) {
                return f11983c[i2];
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static int m13978a(int[] iArr) {
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

    /* renamed from: a */
    private static void m13979a(CharSequence charSequence) {
        int length = charSequence.length();
        m13980a(charSequence, length - 2, 20);
        m13980a(charSequence, length - 1, 15);
    }

    /* renamed from: a */
    private static void m13980a(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f11983c[i3 % 47]) {
            throw C3373vv.m16057a();
        }
    }

    /* renamed from: a */
    private int[] m13981a(C2531gz c2531gz) {
        int m12052c = c2531gz.m12052c();
        int m12050b = c2531gz.m12050b(0);
        Arrays.fill(this.f11987b, 0);
        int[] iArr = this.f11987b;
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
                    if (m13978a(iArr) == f11985e) {
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

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
    /* renamed from: b */
    private static String m13982b(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i2 >= length - 1) {
                    throw C3452xv.m16518a();
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
                            throw C3452xv.m16518a();
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
                            throw C3452xv.m16518a();
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
                                throw C3452xv.m16518a();
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
                            throw C3452xv.m16518a();
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

    @Override // p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        int m12050b = c2531gz.m12050b(m13981a(c2531gz)[1]);
        int m12052c = c2531gz.m12052c();
        int[] iArr = this.f11987b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f11986a;
        sb.setLength(0);
        while (true) {
            t00.m15477a(c2531gz, m12050b, iArr);
            int m13978a = m13978a(iArr);
            if (m13978a < 0) {
                throw C0438aw.m3194a();
            }
            char m13977a = m13977a(m13978a);
            sb.append(m13977a);
            int i2 = m12050b;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int m12050b2 = c2531gz.m12050b(i2);
            if (m13977a == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                if (m12050b2 == m12052c || !c2531gz.m12048a(m12050b2)) {
                    throw C0438aw.m3194a();
                }
                if (sb.length() < 2) {
                    throw C0438aw.m3194a();
                }
                m13979a(sb);
                sb.setLength(sb.length() - 2);
                float f = i;
                return new C2488fw(m13982b(sb), null, new C2568hw[]{new C2568hw((r14[1] + r14[0]) / 2.0f, f), new C2568hw(m12050b + (i4 / 2.0f), f)}, EnumC3224sv.CODE_93);
            }
            m12050b = m12050b2;
        }
    }
}
