package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j10 extends a10 {
    private static final int[] k = {7, 5, 4, 3, 1};
    private static final int[] l = {4, 20, 52, 104, 204};
    private static final int[] m = {0, 348, 1388, 2948, 3988};
    private static final int[][] n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private static final int[][] p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    private final List<h10> g = new ArrayList(11);
    private final List<i10> h = new ArrayList();
    private final int[] i = new int[2];
    private boolean j;

    private static int a(gz gzVar, int i) {
        return gzVar.a(i) ? gzVar.b(gzVar.c(i)) : gzVar.c(gzVar.b(i));
    }

    private c10 a(gz gzVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.i[0] - 1;
            while (i5 >= 0 && !gzVar.a(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.i;
            int i7 = iArr2[0];
            int c = gzVar.c(iArr2[1] + 1);
            i2 = c;
            i3 = i7;
            i4 = c - this.i[1];
        }
        int[] c2 = c();
        System.arraycopy(c2, 0, c2, 1, c2.length - 1);
        c2[0] = i4;
        try {
            return new c10(a10.a(c2, n), new int[]{i3, i2}, i3, i2, i);
        } catch (aw unused) {
            return null;
        }
    }

    static fw a(List<h10> list) {
        String c = t10.a(g10.a(list)).c();
        hw[] a = list.get(0).a().a();
        hw[] a2 = list.get(list.size() - 1).a().a();
        return new fw(c, null, new hw[]{a[0], a[1], a2[0], a2[1]}, sv.RSS_EXPANDED);
    }

    private List<h10> a(List<i10> list, int i) {
        while (i < this.h.size()) {
            i10 i10Var = this.h.get(i);
            this.g.clear();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.g.addAll(list.get(i2).a());
            }
            this.g.addAll(i10Var.a());
            if (b(this.g)) {
                if (h()) {
                    return this.g;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(i10Var);
                try {
                    return a(arrayList, i + 1);
                } catch (aw unused) {
                    continue;
                }
            }
            i++;
        }
        throw aw.a();
    }

    private List<h10> a(boolean z) {
        List<h10> list = null;
        if (this.h.size() > 25) {
            this.h.clear();
            return null;
        }
        this.g.clear();
        if (z) {
            Collections.reverse(this.h);
        }
        try {
            list = a(new ArrayList(), 0);
        } catch (aw unused) {
        }
        if (z) {
            Collections.reverse(this.h);
        }
        return list;
    }

    private void a(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int a = a10.a(f());
        int a2 = a10.a(d());
        int i2 = (a + a2) - i;
        boolean z4 = true;
        boolean z5 = (a & 1) == 1;
        boolean z6 = (a2 & 1) == 0;
        if (a > 13) {
            z = false;
            z2 = true;
        } else {
            z = a < 4;
            z2 = false;
        }
        if (a2 > 13) {
            z3 = true;
        } else {
            r3 = a2 < 4;
            z3 = false;
        }
        if (i2 == 1) {
            if (z5) {
                if (z6) {
                    throw aw.a();
                }
                z4 = z;
                z2 = true;
            } else {
                if (!z6) {
                    throw aw.a();
                }
                z4 = z;
                z3 = true;
            }
        } else if (i2 == -1) {
            if (z5) {
                if (z6) {
                    throw aw.a();
                }
            } else {
                if (!z6) {
                    throw aw.a();
                }
                z4 = z;
                r3 = true;
            }
        } else {
            if (i2 != 0) {
                throw aw.a();
            }
            if (z5) {
                if (!z6) {
                    throw aw.a();
                }
                if (a >= a2) {
                    z4 = z;
                    r3 = true;
                    z2 = true;
                }
                z3 = true;
            } else {
                if (z6) {
                    throw aw.a();
                }
                z4 = z;
            }
        }
        if (z4) {
            if (z2) {
                throw aw.a();
            }
            a10.b(f(), g());
        }
        if (z2) {
            a10.a(f(), g());
        }
        if (r3) {
            if (z3) {
                throw aw.a();
            }
            a10.b(d(), g());
        }
        if (z3) {
            a10.a(d(), e());
        }
    }

    private void a(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.h.size()) {
                break;
            }
            i10 i10Var = this.h.get(i2);
            if (i10Var.b() > i) {
                z2 = i10Var.a(this.g);
                break;
            } else {
                z3 = i10Var.a(this.g);
                i2++;
            }
        }
        if (z2 || z3 || a((Iterable<h10>) this.g, (Iterable<i10>) this.h)) {
            return;
        }
        this.h.add(i2, new i10(this.g, i, z));
        a(this.g, this.h);
    }

    private static void a(List<h10> list, List<i10> list2) {
        boolean z;
        Iterator<i10> it = list2.iterator();
        while (it.hasNext()) {
            i10 next = it.next();
            if (next.a().size() != list.size()) {
                Iterator<h10> it2 = next.a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    h10 next2 = it2.next();
                    Iterator<h10> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z2 = false;
                            break;
                        } else if (next2.equals(it3.next())) {
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    private static boolean a(c10 c10Var, boolean z, boolean z2) {
        return (c10Var.c() == 0 && z && z2) ? false : true;
    }

    private static boolean a(Iterable<h10> iterable, Iterable<i10> iterable2) {
        boolean z;
        boolean z2;
        Iterator<i10> it = iterable2.iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            i10 next = it.next();
            Iterator<h10> it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                h10 next2 = it2.next();
                Iterator<h10> it3 = next.a().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (next2.equals(it3.next())) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    break;
                }
            }
        } while (!z);
        return true;
    }

    private void b(gz gzVar, List<h10> list, int i) {
        int[] c = c();
        c[0] = 0;
        c[1] = 0;
        c[2] = 0;
        c[3] = 0;
        int c2 = gzVar.c();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).a().b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < c2) {
            z2 = !gzVar.a(i);
            if (!z2) {
                break;
            } else {
                i++;
            }
        }
        boolean z3 = z2;
        int i2 = 0;
        int i3 = i;
        while (i < c2) {
            if (gzVar.a(i) ^ z3) {
                c[i2] = c[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        c(c);
                    }
                    if (a10.b(c)) {
                        int[] iArr = this.i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        c(c);
                    }
                    i3 += c[0] + c[1];
                    c[0] = c[2];
                    c[1] = c[3];
                    c[2] = 0;
                    c[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                c[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw aw.a();
    }

    private static boolean b(List<h10> list) {
        boolean z;
        for (int[] iArr : p) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    }
                    if (list.get(i).a().c() != iArr[i]) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void c(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    private boolean h() {
        h10 h10Var = this.g.get(0);
        b10 b = h10Var.b();
        b10 c = h10Var.c();
        if (c == null) {
            return false;
        }
        int a = c.a();
        int i = 2;
        for (int i2 = 1; i2 < this.g.size(); i2++) {
            h10 h10Var2 = this.g.get(i2);
            a += h10Var2.b().a();
            i++;
            b10 c2 = h10Var2.c();
            if (c2 != null) {
                a += c2.a();
                i++;
            }
        }
        return ((i + (-4)) * 211) + (a % 211) == b.b();
    }

    b10 a(gz gzVar, c10 c10Var, boolean z, boolean z2) {
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
        if (z2) {
            t00.b(gzVar, b2[0], b);
        } else {
            t00.a(gzVar, b2[1], b);
            int i = 0;
            for (int length = b.length - 1; i < length; length--) {
                int i2 = b[i];
                b[i] = b[length];
                b[length] = i2;
                i++;
            }
        }
        float a = a10.a(b) / 17;
        float f = (c10Var.b()[1] - c10Var.b()[0]) / 15.0f;
        if (Math.abs(a - f) / f > 0.3f) {
            throw aw.a();
        }
        int[] f2 = f();
        int[] d = d();
        float[] g = g();
        float[] e = e();
        for (int i3 = 0; i3 < b.length; i3++) {
            float f3 = (b[i3] * 1.0f) / a;
            int i4 = (int) (0.5f + f3);
            if (i4 < 1) {
                if (f3 < 0.3f) {
                    throw aw.a();
                }
                i4 = 1;
            } else if (i4 > 8) {
                if (f3 > 8.7f) {
                    throw aw.a();
                }
                i4 = 8;
            }
            int i5 = i3 / 2;
            if ((i3 & 1) == 0) {
                f2[i5] = i4;
                g[i5] = f3 - i4;
            } else {
                d[i5] = i4;
                e[i5] = f3 - i4;
            }
        }
        a(17);
        int c = (((c10Var.c() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
        int i6 = 0;
        int i7 = 0;
        for (int length2 = f2.length - 1; length2 >= 0; length2--) {
            if (a(c10Var, z, z2)) {
                i6 += f2[length2] * o[c][length2 * 2];
            }
            i7 += f2[length2];
        }
        int i8 = 0;
        for (int length3 = d.length - 1; length3 >= 0; length3--) {
            if (a(c10Var, z, z2)) {
                i8 += d[length3] * o[c][(length3 * 2) + 1];
            }
        }
        int i9 = i6 + i8;
        if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
            throw aw.a();
        }
        int i10 = (13 - i7) / 2;
        int i11 = k[i10];
        return new b10((f10.a(f2, i11, true) * l[i10]) + f10.a(d, 9 - i11, false) + m[i10], i9);
    }

    @Override // defpackage.t00
    public fw a(int i, gz gzVar, Map<wv, ?> map) {
        this.g.clear();
        this.j = false;
        try {
            return a(a(i, gzVar));
        } catch (aw unused) {
            this.g.clear();
            this.j = true;
            return a(a(i, gzVar));
        }
    }

    h10 a(gz gzVar, List<h10> list, int i) {
        c10 a;
        b10 b10Var;
        boolean z = list.size() % 2 == 0;
        if (this.j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            b(gzVar, list, i2);
            a = a(gzVar, i, z);
            if (a == null) {
                i2 = a(gzVar, this.i[0]);
            } else {
                z2 = false;
            }
        } while (z2);
        b10 a2 = a(gzVar, a, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).d()) {
            throw aw.a();
        }
        try {
            b10Var = a(gzVar, a, z, false);
        } catch (aw unused) {
            b10Var = null;
        }
        return new h10(a2, b10Var, a, true);
    }

    List<h10> a(int i, gz gzVar) {
        while (true) {
            try {
                this.g.add(a(gzVar, this.g, i));
            } catch (aw e) {
                if (this.g.isEmpty()) {
                    throw e;
                }
                if (h()) {
                    return this.g;
                }
                boolean z = !this.h.isEmpty();
                a(i, false);
                if (z) {
                    List<h10> a = a(false);
                    if (a != null) {
                        return a;
                    }
                    List<h10> a2 = a(true);
                    if (a2 != null) {
                        return a2;
                    }
                }
                throw aw.a();
            }
        }
    }

    @Override // defpackage.t00, defpackage.dw
    public void a() {
        this.g.clear();
        this.h.clear();
    }
}
