package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p20 {

    /* renamed from: a */
    private static final q20 f12551a = new q20();

    /* renamed from: a */
    private static int m14685a(C2571hz c2571hz, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (((z && i6 >= i) || (!z && i6 < i2)) && z == c2571hz.m12295b(i6, i4)) {
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

    /* renamed from: a */
    private static int m14686a(l20 l20Var, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        int i4 = i - i3;
        j20 m14000a = m14699a(l20Var, i4) ? l20Var.m13795a(i4).m14000a(i2) : null;
        if (m14000a != null) {
            return z ? m14000a.m13347b() : m14000a.m13350d();
        }
        j20 m14002b = l20Var.m13795a(i).m14002b(i2);
        if (m14002b != null) {
            return z ? m14002b.m13350d() : m14002b.m13347b();
        }
        if (m14699a(l20Var, i4)) {
            m14002b = l20Var.m13795a(i4).m14002b(i2);
        }
        if (m14002b != null) {
            return z ? m14002b.m13347b() : m14002b.m13350d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (!m14699a(l20Var, i)) {
                i20 m13800d = l20Var.m13800d();
                return z ? m13800d.m12331e() : m13800d.m12329c();
            }
            for (j20 j20Var : l20Var.m13795a(i).m14003b()) {
                if (j20Var != null) {
                    return (z ? j20Var.m13347b() : j20Var.m13350d()) + (i3 * i5 * (j20Var.m13347b() - j20Var.m13350d()));
                }
            }
            i5++;
        }
    }

    /* renamed from: a */
    private static int m14687a(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: a */
    private static int m14688a(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f12551a.m14946a(iArr, i, iArr2);
        }
        throw C3373vv.m16057a();
    }

    /* renamed from: a */
    private static g20 m14689a(n20 n20Var, n20 n20Var2) {
        g20 m14228c;
        g20 m14228c2;
        if (n20Var == null || (m14228c = n20Var.m14228c()) == null) {
            if (n20Var2 == null) {
                return null;
            }
            return n20Var2.m14228c();
        }
        if (n20Var2 == null || (m14228c2 = n20Var2.m14228c()) == null || m14228c.m11871a() == m14228c2.m11871a() || m14228c.m11872b() == m14228c2.m11872b() || m14228c.m11873c() == m14228c2.m11873c()) {
            return m14228c;
        }
        return null;
    }

    /* renamed from: a */
    private static i20 m14690a(n20 n20Var) {
        int[] m14229d;
        if (n20Var == null || (m14229d = n20Var.m14229d()) == null) {
            return null;
        }
        int m14703b = m14703b(m14229d);
        int i = 0;
        int i2 = 0;
        for (int i3 : m14229d) {
            i2 += m14703b - i3;
            if (i3 > 0) {
                break;
            }
        }
        j20[] m14003b = n20Var.m14003b();
        for (int i4 = 0; i2 > 0 && m14003b[i4] == null; i4++) {
            i2--;
        }
        for (int length = m14229d.length - 1; length >= 0; length--) {
            i += m14703b - m14229d[length];
            if (m14229d[length] > 0) {
                break;
            }
        }
        for (int length2 = m14003b.length - 1; i > 0 && m14003b[length2] == null; length2--) {
            i--;
        }
        return n20Var.m13999a().m12327a(i2, i, n20Var.m14230e());
    }

    /* renamed from: a */
    private static j20 m14691a(C2571hz c2571hz, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int m14418d;
        int m11250a;
        int m14685a = m14685a(c2571hz, i, i2, z, i3, i4);
        int[] m14706b = m14706b(c2571hz, i, i2, z, m14685a, i4);
        if (m14706b == null) {
            return null;
        }
        int m11251a = d20.m11251a(m14706b);
        if (z) {
            i7 = m14685a + m11251a;
        } else {
            for (int i8 = 0; i8 < m14706b.length / 2; i8++) {
                int i9 = m14706b[i8];
                m14706b[i8] = m14706b[(m14706b.length - 1) - i8];
                m14706b[(m14706b.length - 1) - i8] = i9;
            }
            m14685a -= m11251a;
            i7 = m14685a;
        }
        if (m14698a(m11251a, i5, i6) && (m11250a = d20.m11250a((m14418d = o20.m14418d(m14706b)))) != -1) {
            return new j20(m14685a, i7, m14702b(m14418d), m11250a);
        }
        return null;
    }

    /* renamed from: a */
    private static C2878kz m14692a(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                throw C3373vv.m16057a();
            }
            for (int i4 = 0; i4 < length; i4++) {
                iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
            }
            try {
                return m14694a(iArr, i, iArr2);
            } catch (C3373vv unused) {
                if (length == 0) {
                    throw C3373vv.m16057a();
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
                        throw C3373vv.m16057a();
                    }
                    i5++;
                }
                i2 = i3;
            }
        }
    }

    /* renamed from: a */
    public static C2878kz m14693a(C2571hz c2571hz, C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, C2568hw c2568hw4, int i, int i2) {
        int i3;
        int i4;
        int i5;
        n20 n20Var = null;
        n20 n20Var2 = null;
        l20 l20Var = null;
        i20 i20Var = new i20(c2571hz, c2568hw, c2568hw2, c2568hw3, c2568hw4);
        for (int i6 = 0; i6 < 2; i6++) {
            if (c2568hw != null) {
                n20Var = m14695a(c2571hz, i20Var, c2568hw, true, i, i2);
            }
            if (c2568hw3 != null) {
                n20Var2 = m14695a(c2571hz, i20Var, c2568hw3, false, i, i2);
            }
            l20Var = m14705b(n20Var, n20Var2);
            if (l20Var == null) {
                throw C0438aw.m3194a();
            }
            if (i6 != 0 || l20Var.m13800d() == null || (l20Var.m13800d().m12332f() >= i20Var.m12332f() && l20Var.m13800d().m12330d() <= i20Var.m12330d())) {
                l20Var.m13797a(i20Var);
                break;
            }
            i20Var = l20Var.m13800d();
        }
        int m13794a = l20Var.m13794a() + 1;
        l20Var.m13796a(0, n20Var);
        l20Var.m13796a(m13794a, n20Var2);
        boolean z = n20Var != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= m13794a; i9++) {
            int i10 = z ? i9 : m13794a - i9;
            if (l20Var.m13795a(i10) == null) {
                m20 n20Var3 = (i10 == 0 || i10 == m13794a) ? new n20(i20Var, i10 == 0) : new m20(i20Var);
                l20Var.m13796a(i10, n20Var3);
                int i11 = -1;
                int m12332f = i20Var.m12332f();
                int i12 = -1;
                while (m12332f <= i20Var.m12330d()) {
                    int m14686a = m14686a(l20Var, i10, m12332f, z);
                    if (m14686a >= 0 && m14686a <= i20Var.m12329c()) {
                        i3 = m14686a;
                    } else if (i12 == i11) {
                        i4 = i12;
                        i5 = m12332f;
                        i12 = i4;
                        m12332f = i5 + 1;
                        i11 = -1;
                    } else {
                        i3 = i12;
                    }
                    i4 = i12;
                    int i13 = m12332f;
                    j20 m14691a = m14691a(c2571hz, i20Var.m12331e(), i20Var.m12329c(), z, i3, i13, i7, i8);
                    i5 = i13;
                    if (m14691a != null) {
                        n20Var3.m14001a(i5, m14691a);
                        i7 = Math.min(i7, m14691a.m13352f());
                        i8 = Math.max(i8, m14691a.m13352f());
                        i12 = i3;
                        m12332f = i5 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    m12332f = i5 + 1;
                    i11 = -1;
                }
            }
        }
        return m14704b(l20Var);
    }

    /* renamed from: a */
    private static C2878kz m14694a(int[] iArr, int i, int[] iArr2) {
        if (iArr.length == 0) {
            throw C3452xv.m16518a();
        }
        int i2 = 1 << (i + 1);
        int m14688a = m14688a(iArr, iArr2, i2);
        m14697a(iArr, i2);
        C2878kz m13543a = k20.m13543a(iArr, String.valueOf(i));
        m13543a.m13757b(Integer.valueOf(m14688a));
        m13543a.m13754a(Integer.valueOf(iArr2.length));
        return m13543a;
    }

    /* renamed from: a */
    private static n20 m14695a(C2571hz c2571hz, i20 i20Var, C2568hw c2568hw, boolean z, int i, int i2) {
        n20 n20Var = new n20(i20Var, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int m12248a = (int) c2568hw.m12248a();
            for (int m12249b = (int) c2568hw.m12249b(); m12249b <= i20Var.m12330d() && m12249b >= i20Var.m12332f(); m12249b += i4) {
                j20 m14691a = m14691a(c2571hz, 0, c2571hz.m12300h(), z, m12248a, m12249b, i, i2);
                if (m14691a != null) {
                    n20Var.m14001a(m12249b, m14691a);
                    m12248a = z ? m14691a.m13350d() : m14691a.m13347b();
                }
            }
            i3++;
        }
        return n20Var;
    }

    /* renamed from: a */
    private static void m14696a(l20 l20Var, h20[][] h20VarArr) {
        h20 h20Var;
        int[] m12086a = h20VarArr[0][1].m12086a();
        int m13794a = (l20Var.m13794a() * l20Var.m13799c()) - m14707c(l20Var.m13798b());
        if (m12086a.length == 0) {
            if (m13794a < 1 || m13794a > 928) {
                throw C0438aw.m3194a();
            }
            h20Var = h20VarArr[0][1];
        } else if (m12086a[0] == m13794a) {
            return;
        } else {
            h20Var = h20VarArr[0][1];
        }
        h20Var.m12085a(m13794a);
    }

    /* renamed from: a */
    private static void m14697a(int[] iArr, int i) {
        if (iArr.length < 4) {
            throw C3452xv.m16518a();
        }
        int i2 = iArr[0];
        if (i2 > iArr.length) {
            throw C3452xv.m16518a();
        }
        if (i2 == 0) {
            if (i >= iArr.length) {
                throw C3452xv.m16518a();
            }
            iArr[0] = iArr.length - i;
        }
    }

    /* renamed from: a */
    private static boolean m14698a(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    /* renamed from: a */
    private static boolean m14699a(l20 l20Var, int i) {
        return i >= 0 && i <= l20Var.m13794a() + 1;
    }

    /* renamed from: a */
    private static int[] m14700a(int i) {
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

    /* renamed from: a */
    private static h20[][] m14701a(l20 l20Var) {
        int m13349c;
        h20[][] h20VarArr = (h20[][]) Array.newInstance((Class<?>) h20.class, l20Var.m13799c(), l20Var.m13794a() + 2);
        for (int i = 0; i < h20VarArr.length; i++) {
            for (int i2 = 0; i2 < h20VarArr[i].length; i2++) {
                h20VarArr[i][i2] = new h20();
            }
        }
        int i3 = 0;
        for (m20 m20Var : l20Var.m13801e()) {
            if (m20Var != null) {
                for (j20 j20Var : m20Var.m14003b()) {
                    if (j20Var != null && (m13349c = j20Var.m13349c()) >= 0) {
                        if (m13349c >= h20VarArr.length) {
                            throw C3452xv.m16518a();
                        }
                        h20VarArr[m13349c][i3].m12085a(j20Var.m13351e());
                    }
                }
            }
            i3++;
        }
        return h20VarArr;
    }

    /* renamed from: b */
    private static int m14702b(int i) {
        return m14687a(m14700a(i));
    }

    /* renamed from: b */
    private static int m14703b(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* renamed from: b */
    private static C2878kz m14704b(l20 l20Var) {
        h20[][] m14701a = m14701a(l20Var);
        m14696a(l20Var, m14701a);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[l20Var.m13799c() * l20Var.m13794a()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < l20Var.m13799c(); i++) {
            int i2 = 0;
            while (i2 < l20Var.m13794a()) {
                int i3 = i2 + 1;
                int[] m12086a = m14701a[i][i3].m12086a();
                int m13794a = (l20Var.m13794a() * i) + i2;
                if (m12086a.length == 0) {
                    arrayList.add(Integer.valueOf(m13794a));
                } else if (m12086a.length == 1) {
                    iArr[m13794a] = m12086a[0];
                } else {
                    arrayList3.add(Integer.valueOf(m13794a));
                    arrayList2.add(m12086a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m14692a(l20Var.m13798b(), iArr, d20.m11252a(arrayList), d20.m11252a(arrayList3), iArr2);
    }

    /* renamed from: b */
    private static l20 m14705b(n20 n20Var, n20 n20Var2) {
        g20 m14689a;
        if ((n20Var == null && n20Var2 == null) || (m14689a = m14689a(n20Var, n20Var2)) == null) {
            return null;
        }
        return new l20(m14689a, i20.m12323a(m14690a(n20Var), m14690a(n20Var2)));
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] m14706b(p000.C2571hz r7, int r8, int r9, boolean r10, int r11, int r12) {
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
            boolean r6 = r7.m12295b(r11, r12)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.p20.m14706b(hz, int, int, boolean, int, int):int[]");
    }

    /* renamed from: c */
    private static int m14707c(int i) {
        return 2 << i;
    }
}
