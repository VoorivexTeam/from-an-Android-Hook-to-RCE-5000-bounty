package p000;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
final class o20 {

    /* renamed from: a */
    private static final float[][] f12387a = (float[][]) Array.newInstance((Class<?>) float.class, d20.f9644b.length, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = d20.f9644b;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            int i4 = i3 & 1;
            int i5 = 0;
            while (i5 < 8) {
                float f = 0.0f;
                while (true) {
                    i = i3 & 1;
                    if (i == i4) {
                        f += 1.0f;
                        i3 >>= 1;
                    }
                }
                f12387a[i2][(8 - i5) - 1] = f / 17.0f;
                i5++;
                i4 = i;
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static int m14415a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | i3;
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m14416b(int[] iArr) {
        int m11251a = d20.m11251a(iArr);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = iArr[i] / m11251a;
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f12387a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = d20.f9644b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    private static int m14417c(int[] iArr) {
        int m14415a = m14415a(iArr);
        if (d20.m11250a(m14415a) == -1) {
            return -1;
        }
        return m14415a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m14418d(int[] iArr) {
        int m14417c = m14417c(m14419e(iArr));
        return m14417c != -1 ? m14417c : m14416b(iArr);
    }

    /* renamed from: e */
    private static int[] m14419e(int[] iArr) {
        float m11251a = d20.m11251a(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (iArr[i2] + i <= (m11251a / 34.0f) + ((i3 * m11251a) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
