package p000;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class j00 extends t00 {

    /* renamed from: d */
    static final char[] f11385d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f11386e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f11387f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f11388a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f11389b = new int[80];

    /* renamed from: c */
    private int f11390c = 0;

    /* renamed from: a */
    private void m13288a(C2531gz c2531gz) {
        int i = 0;
        this.f11390c = 0;
        int m12053c = c2531gz.m12053c(0);
        int m12052c = c2531gz.m12052c();
        if (m12053c >= m12052c) {
            throw C0438aw.m3194a();
        }
        boolean z = true;
        while (m12053c < m12052c) {
            if (c2531gz.m12048a(m12053c) ^ z) {
                i++;
            } else {
                m13291b(i);
                z = !z;
                i = 1;
            }
            m12053c++;
        }
        m13291b(i);
    }

    /* renamed from: a */
    static boolean m13289a(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m13290b() {
        for (int i = 1; i < this.f11390c; i += 2) {
            int m13292c = m13292c(i);
            if (m13292c != -1 && m13289a(f11387f, f11385d[m13292c])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f11389b[i3];
                }
                if (i == 1 || this.f11389b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: b */
    private void m13291b(int i) {
        int[] iArr = this.f11389b;
        int i2 = this.f11390c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f11390c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[i3 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f11389b = iArr2;
        }
    }

    /* renamed from: c */
    private int m13292c(int i) {
        int i2 = i + 7;
        if (i2 >= this.f11390c) {
            return -1;
        }
        int[] iArr = this.f11389b;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f11386e;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    @Override // p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        Arrays.fill(this.f11389b, 0);
        m13288a(c2531gz);
        int m13290b = m13290b();
        this.f11388a.setLength(0);
        int i2 = m13290b;
        do {
            int m13292c = m13292c(i2);
            if (m13292c == -1) {
                throw C0438aw.m3194a();
            }
            this.f11388a.append((char) m13292c);
            i2 += 8;
            if (this.f11388a.length() > 1 && m13289a(f11387f, f11385d[m13292c])) {
                break;
            }
        } while (i2 < this.f11390c);
        int i3 = i2 - 1;
        int i4 = this.f11389b[i3];
        int i5 = 0;
        for (int i6 = -8; i6 < -1; i6++) {
            i5 += this.f11389b[i2 + i6];
        }
        if (i2 < this.f11390c && i4 < i5 / 2) {
            throw C0438aw.m3194a();
        }
        m13293a(m13290b);
        for (int i7 = 0; i7 < this.f11388a.length(); i7++) {
            StringBuilder sb = this.f11388a;
            sb.setCharAt(i7, f11385d[sb.charAt(i7)]);
        }
        if (!m13289a(f11387f, this.f11388a.charAt(0))) {
            throw C0438aw.m3194a();
        }
        StringBuilder sb2 = this.f11388a;
        if (!m13289a(f11387f, sb2.charAt(sb2.length() - 1))) {
            throw C0438aw.m3194a();
        }
        if (this.f11388a.length() <= 3) {
            throw C0438aw.m3194a();
        }
        if (map == null || !map.containsKey(EnumC3412wv.RETURN_CODABAR_START_END)) {
            StringBuilder sb3 = this.f11388a;
            sb3.deleteCharAt(sb3.length() - 1);
            this.f11388a.deleteCharAt(0);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < m13290b; i9++) {
            i8 += this.f11389b[i9];
        }
        float f = i8;
        while (m13290b < i3) {
            i8 += this.f11389b[m13290b];
            m13290b++;
        }
        float f2 = i;
        return new C2488fw(this.f11388a.toString(), null, new C2568hw[]{new C2568hw(f, f2), new C2568hw(i8, f2)}, EnumC3224sv.CODABAR);
    }

    /* renamed from: a */
    void m13293a(int i) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f11388a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f11386e[this.f11388a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) * 2);
                iArr[i7] = iArr[i7] + this.f11389b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            fArr2[i9] = ((iArr[i8] / iArr2[i8]) + (iArr[i9] / iArr2[i9])) / 2.0f;
            fArr[i8] = fArr2[i9];
            fArr[i9] = ((iArr[i9] * 2.0f) + 1.5f) / iArr2[i9];
        }
        loop3: while (true) {
            int i10 = f11386e[this.f11388a.charAt(i2)];
            for (int i11 = 6; i11 >= 0; i11--) {
                int i12 = (i11 & 1) + ((i10 & 1) * 2);
                float f = this.f11389b[i + i11];
                if (f < fArr2[i12] || f > fArr[i12]) {
                    break loop3;
                }
                i10 >>= 1;
            }
            if (i2 >= length) {
                return;
            }
            i += 8;
            i2++;
        }
        throw C0438aw.m3194a();
    }
}
