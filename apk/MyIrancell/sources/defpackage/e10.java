package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e10 extends a10 {
    private static final int[] i = {1, 10, 34, 70, 126};
    private static final int[] j = {4, 20, 48, 81};
    private static final int[] k = {0, 161, 961, 2015, 2715};
    private static final int[] l = {0, 336, 1036, 1516};
    private static final int[] m = {8, 6, 4, 3, 1};
    private static final int[] n = {2, 4, 6, 8};
    private static final int[][] o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    private final List<d10> g = new ArrayList();
    private final List<d10> h = new ArrayList();

    private b10 a(gz gzVar, c10 c10Var, boolean z) {
        int[] b = b();
        b[0] = 0;
        b[1] = 0;
        b[2] = 0;
        b[3] = 0;
        b[4] = 0;
        b[5] = 0;
        b[6] = 0;
        b[7] = 0;
        int[] b2 = c10Var.b();
        if (z) {
            t00.b(gzVar, b2[0], b);
        } else {
            t00.a(gzVar, b2[1] + 1, b);
            int i2 = 0;
            for (int length = b.length - 1; i2 < length; length--) {
                int i3 = b[i2];
                b[i2] = b[length];
                b[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float a = a10.a(b) / i4;
        int[] f = f();
        int[] d = d();
        float[] g = g();
        float[] e = e();
        for (int i5 = 0; i5 < b.length; i5++) {
            float f2 = b[i5] / a;
            int i6 = (int) (0.5f + f2);
            if (i6 < 1) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                f[i7] = i6;
                g[i7] = f2 - i6;
            } else {
                d[i7] = i6;
                e[i7] = f2 - i6;
            }
        }
        a(z, i4);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = f.length - 1; length2 >= 0; length2--) {
            i8 = (i8 * 9) + f[length2];
            i9 += f[length2];
        }
        int i10 = 0;
        int i11 = 0;
        for (int length3 = d.length - 1; length3 >= 0; length3--) {
            i10 = (i10 * 9) + d[length3];
            i11 += d[length3];
        }
        int i12 = i8 + (i10 * 3);
        if (!z) {
            if ((i11 & 1) != 0 || i11 > 10 || i11 < 4) {
                throw aw.a();
            }
            int i13 = (10 - i11) / 2;
            int i14 = n[i13];
            return new b10((f10.a(d, 9 - i14, false) * j[i13]) + f10.a(f, i14, true) + l[i13], i12);
        }
        if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
            throw aw.a();
        }
        int i15 = (12 - i9) / 2;
        int i16 = m[i15];
        return new b10((f10.a(f, i16, false) * i[i15]) + f10.a(d, 9 - i16, true) + k[i15], i12);
    }

    private c10 a(gz gzVar, int i2, boolean z, int[] iArr) {
        int i3;
        int i4;
        boolean a = gzVar.a(iArr[0]);
        int i5 = iArr[0] - 1;
        while (i5 >= 0 && (gzVar.a(i5) ^ a)) {
            i5--;
        }
        int i6 = i5 + 1;
        int i7 = iArr[0] - i6;
        int[] c = c();
        System.arraycopy(c, 0, c, 1, c.length - 1);
        c[0] = i7;
        int a2 = a10.a(c, o);
        int i8 = iArr[1];
        if (z) {
            int c2 = (gzVar.c() - 1) - i6;
            i3 = (gzVar.c() - 1) - i8;
            i4 = c2;
        } else {
            i3 = i8;
            i4 = i6;
        }
        return new c10(a2, new int[]{i6, iArr[1]}, i4, i3, i2);
    }

    private d10 a(gz gzVar, boolean z, int i2, Map<wv, ?> map) {
        try {
            c10 a = a(gzVar, i2, z, a(gzVar, 0, z));
            iw iwVar = map == null ? null : (iw) map.get(wv.NEED_RESULT_POINT_CALLBACK);
            if (iwVar != null) {
                float f = (r2[0] + r2[1]) / 2.0f;
                if (z) {
                    f = (gzVar.c() - 1) - f;
                }
                iwVar.a(new hw(f, i2));
            }
            b10 a2 = a(gzVar, a, true);
            b10 a3 = a(gzVar, a, false);
            return new d10((a2.b() * 1597) + a3.b(), a2.a() + (a3.a() * 4), a);
        } catch (aw unused) {
            return null;
        }
    }

    private static void a(Collection<d10> collection, d10 d10Var) {
        if (d10Var == null) {
            return;
        }
        boolean z = false;
        Iterator<d10> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d10 next = it.next();
            if (next.b() == d10Var.b()) {
                next.e();
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        collection.add(d10Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r1 < 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x004f, code lost:
    
        r10 = false;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x004d, code lost:
    
        if (r1 < 4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e10.a(boolean, int):void");
    }

    private static boolean a(d10 d10Var, d10 d10Var2) {
        int a = (d10Var.a() + (d10Var2.a() * 16)) % 79;
        int c = (d10Var.d().c() * 9) + d10Var2.d().c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    private int[] a(gz gzVar, int i2, boolean z) {
        int[] c = c();
        c[0] = 0;
        c[1] = 0;
        c[2] = 0;
        c[3] = 0;
        int c2 = gzVar.c();
        boolean z2 = false;
        while (i2 < c2) {
            z2 = !gzVar.a(i2);
            if (z == z2) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        int i4 = 0;
        while (i2 < c2) {
            if (gzVar.a(i2) ^ z2) {
                c[i4] = c[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else {
                    if (a10.b(c)) {
                        return new int[]{i3, i2};
                    }
                    i3 += c[0] + c[1];
                    c[0] = c[2];
                    c[1] = c[3];
                    c[2] = 0;
                    c[3] = 0;
                    i4--;
                }
                c[i4] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw aw.a();
    }

    private static fw b(d10 d10Var, d10 d10Var2) {
        String valueOf = String.valueOf((d10Var.b() * 4537077) + d10Var2.b());
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            int charAt = sb.charAt(i3) - '0';
            if ((i3 & 1) == 0) {
                charAt *= 3;
            }
            i2 += charAt;
        }
        int i4 = 10 - (i2 % 10);
        if (i4 == 10) {
            i4 = 0;
        }
        sb.append(i4);
        hw[] a = d10Var.d().a();
        hw[] a2 = d10Var2.d().a();
        return new fw(String.valueOf(sb.toString()), null, new hw[]{a[0], a[1], a2[0], a2[1]}, sv.RSS_14);
    }

    @Override // defpackage.t00
    public fw a(int i2, gz gzVar, Map<wv, ?> map) {
        a(this.g, a(gzVar, false, i2, map));
        gzVar.g();
        a(this.h, a(gzVar, true, i2, map));
        gzVar.g();
        int size = this.g.size();
        for (int i3 = 0; i3 < size; i3++) {
            d10 d10Var = this.g.get(i3);
            if (d10Var.c() > 1) {
                int size2 = this.h.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    d10 d10Var2 = this.h.get(i4);
                    if (d10Var2.c() > 1 && a(d10Var, d10Var2)) {
                        return b(d10Var, d10Var2);
                    }
                }
            }
        }
        throw aw.a();
    }

    @Override // defpackage.t00, defpackage.dw
    public void a() {
        this.g.clear();
        this.h.clear();
    }
}
