package defpackage;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class pz extends nz {
    private hz e;

    public pz(yv yvVar) {
        super(yvVar);
    }

    private static int a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static void a(byte[] bArr, int i, int i2, int i3, int i4, hz hzVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    hzVar.c(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    private static void a(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, hz hzVar) {
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
                int a = a(i8, 2, i - 3);
                int a2 = a(i5, 2, i2 - 3);
                int i11 = 0;
                for (int i12 = -2; i12 <= 2; i12++) {
                    int[] iArr2 = iArr[a2 + i12];
                    i11 += iArr2[a - 2] + iArr2[a - 1] + iArr2[a] + iArr2[a + 1] + iArr2[a + 2];
                }
                a(bArr, i10, i6, i11 / 25, i3, hzVar);
            }
        }
    }

    private static int[][] a(byte[] bArr, int i, int i2, int i3, int i4) {
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

    @Override // defpackage.nz, defpackage.tv
    public hz a() {
        hz a;
        hz hzVar = this.e;
        if (hzVar != null) {
            return hzVar;
        }
        yv c = c();
        int c2 = c.c();
        int a2 = c.a();
        if (c2 < 40 || a2 < 40) {
            a = super.a();
        } else {
            byte[] b = c.b();
            int i = c2 >> 3;
            if ((c2 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a2 >> 3;
            if ((a2 & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] a3 = a(b, i2, i4, c2, a2);
            a = new hz(c2, a2);
            a(b, i2, i4, c2, a2, a3, a);
        }
        this.e = a;
        return this.e;
    }
}
