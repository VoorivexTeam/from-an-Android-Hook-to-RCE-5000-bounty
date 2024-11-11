package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p20 {
    private static final q20 a = new q20();

    private static int a(hz hzVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (((z && i6 >= i) || (!z && i6 < i2)) && z == hzVar.b(i6, i4)) {
                    if (Math.abs(i3 - i6) > 2) {
                        return i3;
                    }
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    private static int a(l20 l20Var, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        int i4 = i - i3;
        j20 a2 = a(l20Var, i4) ? l20Var.a(i4).a(i2) : null;
        if (a2 != null) {
            return z ? a2.b() : a2.d();
        }
        j20 b = l20Var.a(i).b(i2);
        if (b != null) {
            return z ? b.d() : b.b();
        }
        if (a(l20Var, i4)) {
            b = l20Var.a(i4).b(i2);
        }
        if (b != null) {
            return z ? b.b() : b.d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (!a(l20Var, i)) {
                i20 d = l20Var.d();
                return z ? d.e() : d.c();
            }
            for (j20 j20Var : l20Var.a(i).b()) {
                if (j20Var != null) {
                    return (z ? j20Var.b() : j20Var.d()) + (i3 * i5 * (j20Var.b() - j20Var.d()));
                }
            }
            i5++;
        }
    }

    private static int a(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int a(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return a.a(iArr, i, iArr2);
        }
        throw vv.a();
    }

    private static g20 a(n20 n20Var, n20 n20Var2) {
        g20 c;
        g20 c2;
        if (n20Var == null || (c = n20Var.c()) == null) {
            if (n20Var2 == null) {
                return null;
            }
            return n20Var2.c();
        }
        if (n20Var2 == null || (c2 = n20Var2.c()) == null || c.a() == c2.a() || c.b() == c2.b() || c.c() == c2.c()) {
            return c;
        }
        return null;
    }

    private static i20 a(n20 n20Var) {
        int[] d;
        if (n20Var == null || (d = n20Var.d()) == null) {
            return null;
        }
        int b = b(d);
        int i = 0;
        int i2 = 0;
        for (int i3 : d) {
            i2 += b - i3;
            if (i3 > 0) {
                break;
            }
        }
        j20[] b2 = n20Var.b();
        for (int i4 = 0; i2 > 0 && b2[i4] == null; i4++) {
            i2--;
        }
        for (int length = d.length - 1; length >= 0; length--) {
            i += b - d[length];
            if (d[length] > 0) {
                break;
            }
        }
        for (int length2 = b2.length - 1; i > 0 && b2[length2] == null; length2--) {
            i--;
        }
        return n20Var.a().a(i2, i, n20Var.e());
    }

    private static j20 a(hz hzVar, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int d;
        int a2;
        int a3 = a(hzVar, i, i2, z, i3, i4);
        int[] b = b(hzVar, i, i2, z, a3, i4);
        if (b == null) {
            return null;
        }
        int a4 = d20.a(b);
        if (z) {
            i7 = a3 + a4;
        } else {
            for (int i8 = 0; i8 < b.length / 2; i8++) {
                int i9 = b[i8];
                b[i8] = b[(b.length - 1) - i8];
                b[(b.length - 1) - i8] = i9;
            }
            a3 -= a4;
            i7 = a3;
        }
        if (a(a4, i5, i6) && (a2 = d20.a((d = o20.d(b)))) != -1) {
            return new j20(a3, i7, b(d), a2);
        }
        return null;
    }

    private static kz a(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                throw vv.a();
            }
            for (int i4 = 0; i4 < length; i4++) {
                iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
            }
            try {
                return a(iArr, i, iArr2);
            } catch (vv unused) {
                if (length == 0) {
                    throw vv.a();
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (iArr5[i5] < iArr4[i5].length - 1) {
                        iArr5[i5] = iArr5[i5] + 1;
                        break;
                    }
                    iArr5[i5] = 0;
                    if (i5 == length - 1) {
                        throw vv.a();
                    }
                    i5++;
                }
                i2 = i3;
            }
        }
    }

    public static kz a(hz hzVar, hw hwVar, hw hwVar2, hw hwVar3, hw hwVar4, int i, int i2) {
        int i3;
        int i4;
        int i5;
        n20 n20Var = null;
        n20 n20Var2 = null;
        l20 l20Var = null;
        i20 i20Var = new i20(hzVar, hwVar, hwVar2, hwVar3, hwVar4);
        for (int i6 = 0; i6 < 2; i6++) {
            if (hwVar != null) {
                n20Var = a(hzVar, i20Var, hwVar, true, i, i2);
            }
            if (hwVar3 != null) {
                n20Var2 = a(hzVar, i20Var, hwVar3, false, i, i2);
            }
            l20Var = b(n20Var, n20Var2);
            if (l20Var == null) {
                throw aw.a();
            }
            if (i6 != 0 || l20Var.d() == null || (l20Var.d().f() >= i20Var.f() && l20Var.d().d() <= i20Var.d())) {
                l20Var.a(i20Var);
                break;
            }
            i20Var = l20Var.d();
        }
        int a2 = l20Var.a() + 1;
        l20Var.a(0, n20Var);
        l20Var.a(a2, n20Var2);
        boolean z = n20Var != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= a2; i9++) {
            int i10 = z ? i9 : a2 - i9;
            if (l20Var.a(i10) == null) {
                m20 n20Var3 = (i10 == 0 || i10 == a2) ? new n20(i20Var, i10 == 0) : new m20(i20Var);
                l20Var.a(i10, n20Var3);
                int i11 = -1;
                int f = i20Var.f();
                int i12 = -1;
                while (f <= i20Var.d()) {
                    int a3 = a(l20Var, i10, f, z);
                    if (a3 >= 0 && a3 <= i20Var.c()) {
                        i3 = a3;
                    } else if (i12 == i11) {
                        i4 = i12;
                        i5 = f;
                        i12 = i4;
                        f = i5 + 1;
                        i11 = -1;
                    } else {
                        i3 = i12;
                    }
                    i4 = i12;
                    int i13 = f;
                    j20 a4 = a(hzVar, i20Var.e(), i20Var.c(), z, i3, i13, i7, i8);
                    i5 = i13;
                    if (a4 != null) {
                        n20Var3.a(i5, a4);
                        i7 = Math.min(i7, a4.f());
                        i8 = Math.max(i8, a4.f());
                        i12 = i3;
                        f = i5 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    f = i5 + 1;
                    i11 = -1;
                }
            }
        }
        return b(l20Var);
    }

    private static kz a(int[] iArr, int i, int[] iArr2) {
        if (iArr.length == 0) {
            throw xv.a();
        }
        int i2 = 1 << (i + 1);
        int a2 = a(iArr, iArr2, i2);
        a(iArr, i2);
        kz a3 = k20.a(iArr, String.valueOf(i));
        a3.b(Integer.valueOf(a2));
        a3.a(Integer.valueOf(iArr2.length));
        return a3;
    }

    private static n20 a(hz hzVar, i20 i20Var, hw hwVar, boolean z, int i, int i2) {
        n20 n20Var = new n20(i20Var, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int a2 = (int) hwVar.a();
            for (int b = (int) hwVar.b(); b <= i20Var.d() && b >= i20Var.f(); b += i4) {
                j20 a3 = a(hzVar, 0, hzVar.h(), z, a2, b, i, i2);
                if (a3 != null) {
                    n20Var.a(b, a3);
                    a2 = z ? a3.d() : a3.b();
                }
            }
            i3++;
        }
        return n20Var;
    }

    private static void a(l20 l20Var, h20[][] h20VarArr) {
        h20 h20Var;
        int[] a2 = h20VarArr[0][1].a();
        int a3 = (l20Var.a() * l20Var.c()) - c(l20Var.b());
        if (a2.length == 0) {
            if (a3 < 1 || a3 > 928) {
                throw aw.a();
            }
            h20Var = h20VarArr[0][1];
        } else if (a2[0] == a3) {
            return;
        } else {
            h20Var = h20VarArr[0][1];
        }
        h20Var.a(a3);
    }

    private static void a(int[] iArr, int i) {
        if (iArr.length < 4) {
            throw xv.a();
        }
        int i2 = iArr[0];
        if (i2 > iArr.length) {
            throw xv.a();
        }
        if (i2 == 0) {
            if (i >= iArr.length) {
                throw xv.a();
            }
            iArr[0] = iArr.length - i;
        }
    }

    private static boolean a(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    private static boolean a(l20 l20Var, int i) {
        return i >= 0 && i <= l20Var.a() + 1;
    }

    private static int[] a(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    private static h20[][] a(l20 l20Var) {
        int c;
        h20[][] h20VarArr = (h20[][]) Array.newInstance((Class<?>) h20.class, l20Var.c(), l20Var.a() + 2);
        for (int i = 0; i < h20VarArr.length; i++) {
            for (int i2 = 0; i2 < h20VarArr[i].length; i2++) {
                h20VarArr[i][i2] = new h20();
            }
        }
        int i3 = 0;
        for (m20 m20Var : l20Var.e()) {
            if (m20Var != null) {
                for (j20 j20Var : m20Var.b()) {
                    if (j20Var != null && (c = j20Var.c()) >= 0) {
                        if (c >= h20VarArr.length) {
                            throw xv.a();
                        }
                        h20VarArr[c][i3].a(j20Var.e());
                    }
                }
            }
            i3++;
        }
        return h20VarArr;
    }

    private static int b(int i) {
        return a(a(i));
    }

    private static int b(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    private static kz b(l20 l20Var) {
        h20[][] a2 = a(l20Var);
        a(l20Var, a2);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[l20Var.c() * l20Var.a()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < l20Var.c(); i++) {
            int i2 = 0;
            while (i2 < l20Var.a()) {
                int i3 = i2 + 1;
                int[] a3 = a2[i][i3].a();
                int a4 = (l20Var.a() * i) + i2;
                if (a3.length == 0) {
                    arrayList.add(Integer.valueOf(a4));
                } else if (a3.length == 1) {
                    iArr[a4] = a3[0];
                } else {
                    arrayList3.add(Integer.valueOf(a4));
                    arrayList2.add(a3);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return a(l20Var.b(), iArr, d20.a(arrayList), d20.a(arrayList3), iArr2);
    }

    private static l20 b(n20 n20Var, n20 n20Var2) {
        g20 a2;
        if ((n20Var == null && n20Var2 == null) || (a2 = a(n20Var, n20Var2)) == null) {
            return null;
        }
        return new l20(a2, i20.a(a(n20Var), a(n20Var2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r10 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r11 == r9) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r4 != 7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        if (r10 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
    
        if (r11 != r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] b(defpackage.hz r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L10
            if (r11 < r9) goto L14
        L10:
            if (r10 != 0) goto L28
            if (r11 < r8) goto L28
        L14:
            if (r4 >= r0) goto L28
            boolean r6 = r7.b(r11, r12)
            if (r6 != r5) goto L23
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L23:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L28:
            if (r4 == r0) goto L38
            if (r10 == 0) goto L2e
            if (r11 == r9) goto L32
        L2e:
            if (r10 != 0) goto L36
            if (r11 != r8) goto L36
        L32:
            r7 = 7
            if (r4 != r7) goto L36
            goto L38
        L36:
            r7 = 0
            return r7
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p20.b(hz, int, int, boolean, int, int):int[]");
    }

    private static int c(int i) {
        return 2 << i;
    }
}
