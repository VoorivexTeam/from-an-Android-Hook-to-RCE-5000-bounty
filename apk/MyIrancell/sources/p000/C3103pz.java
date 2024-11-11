package p000;

import java.lang.reflect.Array;

/* renamed from: pz */
/* loaded from: classes.dex */
public final class C3103pz extends C3007nz {

    /* renamed from: e */
    private C2571hz f12648e;

    public C3103pz(AbstractC3501yv abstractC3501yv) {
        super(abstractC3501yv);
    }

    /* renamed from: a */
    private static int m14855a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    private static void m14856a(byte[] bArr, int i, int i2, int i3, int i4, C2571hz c2571hz) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    c2571hz.m12298c(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    private static void m14857a(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C2571hz c2571hz) {
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 << 3;
            int i7 = i4 - 8;
            if (i6 > i7) {
                i6 = i7;
            }
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 << 3;
                int i10 = i3 - 8;
                if (i9 <= i10) {
                    i10 = i9;
                }
                int m14855a = m14855a(i8, 2, i - 3);
                int m14855a2 = m14855a(i5, 2, i2 - 3);
                int i11 = 0;
                for (int i12 = -2; i12 <= 2; i12++) {
                    int[] iArr2 = iArr[m14855a2 + i12];
                    i11 += iArr2[m14855a - 2] + iArr2[m14855a - 1] + iArr2[m14855a] + iArr2[m14855a + 1] + iArr2[m14855a + 2];
                }
                m14856a(bArr, i10, i6, i11 / 25, i3, c2571hz);
            }
        }
    }

    /* renamed from: a */
    private static int[][] m14858a(byte[] bArr, int i, int i2, int i3, int i4) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, i2, i);
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 << 3;
            int i7 = i4 - 8;
            if (i6 > i7) {
                i6 = i7;
            }
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 << 3;
                int i10 = i3 - 8;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = (i6 * i3) + i9;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 255;
                while (i12 < 8) {
                    for (int i16 = 0; i16 < 8; i16++) {
                        int i17 = bArr[i11 + i16] & 255;
                        i13 += i17;
                        if (i17 < i15) {
                            i15 = i17;
                        }
                        if (i17 > i14) {
                            i14 = i17;
                        }
                    }
                    if (i14 - i15 <= 24) {
                        i12++;
                        i11 += i3;
                    }
                    while (true) {
                        i12++;
                        i11 += i3;
                        if (i12 < 8) {
                            for (int i18 = 0; i18 < 8; i18++) {
                                i13 += bArr[i11 + i18] & 255;
                            }
                        }
                    }
                    i12++;
                    i11 += i3;
                }
                int i19 = i13 >> 6;
                if (i14 - i15 <= 24) {
                    i19 = i15 / 2;
                    if (i5 > 0 && i8 > 0) {
                        int i20 = i5 - 1;
                        int i21 = i8 - 1;
                        int i22 = ((iArr[i20][i8] + (iArr[i5][i21] * 2)) + iArr[i20][i21]) / 4;
                        if (i15 < i22) {
                            i19 = i22;
                        }
                        iArr[i5][i8] = i19;
                    }
                }
                iArr[i5][i8] = i19;
            }
        }
        return iArr;
    }

    @Override // p000.C3007nz, p000.AbstractC3276tv
    /* renamed from: a */
    public C2571hz mo14403a() {
        C2571hz mo14403a;
        C2571hz c2571hz = this.f12648e;
        if (c2571hz != null) {
            return c2571hz;
        }
        AbstractC3501yv m15693c = m15693c();
        int m16666c = m15693c.m16666c();
        int m16665a = m15693c.m16665a();
        if (m16666c < 40 || m16665a < 40) {
            mo14403a = super.mo14403a();
        } else {
            byte[] mo3448b = m15693c.mo3448b();
            int i = m16666c >> 3;
            if ((m16666c & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = m16665a >> 3;
            if ((m16665a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] m14858a = m14858a(mo3448b, i2, i4, m16666c, m16665a);
            mo14403a = new C2571hz(m16666c, m16665a);
            m14857a(mo3448b, i2, i4, m16666c, m16665a, m14858a, mo14403a);
        }
        this.f12648e = mo14403a;
        return this.f12648e;
    }
}
