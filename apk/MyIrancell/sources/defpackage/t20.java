package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class t20 {
    private static final int[] a = {0, 4, 1, 5};
    private static final int[] b = {6, 2, 7, 3};
    private static final int[] c = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static float a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r5 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r4.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r5 = (defpackage.hw[]) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r5[1] == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r3 = (int) java.lang.Math.max(r3, r5[1].b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r5[3] == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = java.lang.Math.max(r3, (int) r5[3].b());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<defpackage.hw[]> a(boolean r8, defpackage.hz r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L8:
            r4 = 0
            r5 = 0
        La:
            int r6 = r9.c()
            if (r3 >= r6) goto L7a
            hw[] r4 = a(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L53
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L53
            if (r5 != 0) goto L20
            goto L7a
        L20:
            java.util.Iterator r4 = r0.iterator()
        L24:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            hw[] r5 = (defpackage.hw[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L40
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.b()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L40:
            r7 = r5[r6]
            if (r7 == 0) goto L24
            r5 = r5[r6]
            float r5 = r5.b()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L24
        L50:
            int r3 = r3 + 5
            goto L8
        L53:
            r0.add(r4)
            if (r8 != 0) goto L59
            goto L7a
        L59:
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L68
            r5 = r4[r3]
            float r5 = r5.a()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L72
        L68:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.a()
            int r5 = (int) r5
            r3 = r4[r3]
        L72:
            float r3 = r3.b()
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto La
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.a(boolean, hz):java.util.List");
    }

    public static u20 a(uv uvVar, Map<wv, ?> map, boolean z) {
        hz a2 = uvVar.a();
        List<hw[]> a3 = a(z, a2);
        if (a3.isEmpty()) {
            a2 = a2.m7clone();
            a2.j();
            a3 = a(z, a2);
        }
        return new u20(a2, a3);
    }

    private static void a(hw[] hwVarArr, hw[] hwVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            hwVarArr[iArr[i]] = hwVarArr2[i];
        }
    }

    private static int[] a(hz hzVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int length = iArr.length;
        int i4 = 0;
        while (hzVar.b(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (hzVar.b(i, i2) ^ z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                int i8 = length - 1;
                if (i6 != i8) {
                    i6++;
                } else {
                    if (a(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i7, i};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i9 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || a(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    private static hw[] a(hz hzVar, int i, int i2) {
        int c2 = hzVar.c();
        int h = hzVar.h();
        hw[] hwVarArr = new hw[8];
        a(hwVarArr, a(hzVar, c2, h, i, i2, c), a);
        if (hwVarArr[4] != null) {
            i2 = (int) hwVarArr[4].a();
            i = (int) hwVarArr[4].b();
        }
        a(hwVarArr, a(hzVar, c2, h, i, i2, d), b);
        return hwVarArr;
    }

    private static hw[] a(hz hzVar, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        hw[] hwVarArr = new hw[4];
        int[] iArr2 = new int[iArr.length];
        int i9 = i3;
        while (true) {
            if (i9 >= i) {
                z = false;
                break;
            }
            int[] a2 = a(hzVar, i4, i9, i2, false, iArr, iArr2);
            if (a2 != null) {
                int i10 = i9;
                int[] iArr3 = a2;
                int i11 = i10;
                while (true) {
                    if (i11 <= 0) {
                        i8 = i11;
                        break;
                    }
                    int i12 = i11 - 1;
                    int[] a3 = a(hzVar, i4, i12, i2, false, iArr, iArr2);
                    if (a3 == null) {
                        i8 = i12 + 1;
                        break;
                    }
                    iArr3 = a3;
                    i11 = i12;
                }
                float f = i8;
                hwVarArr[0] = new hw(iArr3[0], f);
                hwVarArr[1] = new hw(iArr3[1], f);
                i9 = i8;
                z = true;
            } else {
                i9 += 5;
            }
        }
        int i13 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) hwVarArr[0].a(), (int) hwVarArr[1].a()};
            int i14 = i13;
            int i15 = 0;
            while (true) {
                if (i14 >= i) {
                    i6 = i15;
                    i7 = i14;
                    break;
                }
                i6 = i15;
                i7 = i14;
                int[] a4 = a(hzVar, iArr4[0], i14, i2, false, iArr, iArr2);
                if (a4 != null && Math.abs(iArr4[0] - a4[0]) < 5 && Math.abs(iArr4[1] - a4[1]) < 5) {
                    iArr4 = a4;
                    i15 = 0;
                } else {
                    if (i6 > 25) {
                        break;
                    }
                    i15 = i6 + 1;
                }
                i14 = i7 + 1;
            }
            i13 = i7 - (i6 + 1);
            float f2 = i13;
            hwVarArr[2] = new hw(iArr4[0], f2);
            hwVarArr[3] = new hw(iArr4[1], f2);
        }
        if (i13 - i9 < 10) {
            for (i5 = 0; i5 < 4; i5++) {
                hwVarArr[i5] = null;
            }
        }
        return hwVarArr;
    }
}
