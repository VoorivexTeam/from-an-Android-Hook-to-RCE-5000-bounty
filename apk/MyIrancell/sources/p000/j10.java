package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j10 extends a10 {

    /* renamed from: k */
    private static final int[] f11412k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f11413l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f11414m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f11415n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f11416o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f11417p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<h10> f11418g = new ArrayList(11);

    /* renamed from: h */
    private final List<i10> f11419h = new ArrayList();

    /* renamed from: i */
    private final int[] f11420i = new int[2];

    /* renamed from: j */
    private boolean f11421j;

    /* renamed from: a */
    private static int m13312a(C2531gz c2531gz, int i) {
        return c2531gz.m12048a(i) ? c2531gz.m12050b(c2531gz.m12053c(i)) : c2531gz.m12053c(c2531gz.m12050b(i));
    }

    /* renamed from: a */
    private c10 m13313a(C2531gz c2531gz, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f11420i[0] - 1;
            while (i5 >= 0 && !c2531gz.m12048a(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f11420i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f11420i;
            int i7 = iArr2[0];
            int m12053c = c2531gz.m12053c(iArr2[1] + 1);
            i2 = m12053c;
            i3 = i7;
            i4 = m12053c - this.f11420i[1];
        }
        int[] m25c = m25c();
        System.arraycopy(m25c, 0, m25c, 1, m25c.length - 1);
        m25c[0] = i4;
        try {
            return new c10(a10.m20a(m25c, f11415n), new int[]{i3, i2}, i3, i2, i);
        } catch (C0438aw unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C2488fw m13314a(List<h10> list) {
        String mo13993c = t10.m15480a(g10.m11865a(list)).mo13993c();
        C2568hw[] m3518a = list.get(0).m12081a().m3518a();
        C2568hw[] m3518a2 = list.get(list.size() - 1).m12081a().m3518a();
        return new C2488fw(mo13993c, null, new C2568hw[]{m3518a[0], m3518a[1], m3518a2[0], m3518a2[1]}, EnumC3224sv.RSS_EXPANDED);
    }

    /* renamed from: a */
    private List<h10> m13315a(List<i10> list, int i) {
        while (i < this.f11419h.size()) {
            i10 i10Var = this.f11419h.get(i);
            this.f11418g.clear();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f11418g.addAll(list.get(i2).m12320a());
            }
            this.f11418g.addAll(i10Var.m12320a());
            if (m13323b(this.f11418g)) {
                if (m13325h()) {
                    return this.f11418g;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(i10Var);
                try {
                    return m13315a(arrayList, i + 1);
                } catch (C0438aw unused) {
                    continue;
                }
            }
            i++;
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: a */
    private List<h10> m13316a(boolean z) {
        List<h10> list = null;
        if (this.f11419h.size() > 25) {
            this.f11419h.clear();
            return null;
        }
        this.f11418g.clear();
        if (z) {
            Collections.reverse(this.f11419h);
        }
        try {
            list = m13315a(new ArrayList(), 0);
        } catch (C0438aw unused) {
        }
        if (z) {
            Collections.reverse(this.f11419h);
        }
        return list;
    }

    /* renamed from: a */
    private void m13317a(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int m19a = a10.m19a(m28f());
        int m19a2 = a10.m19a(m26d());
        int i2 = (m19a + m19a2) - i;
        boolean z4 = true;
        boolean z5 = (m19a & 1) == 1;
        boolean z6 = (m19a2 & 1) == 0;
        if (m19a > 13) {
            z = false;
            z2 = true;
        } else {
            z = m19a < 4;
            z2 = false;
        }
        if (m19a2 > 13) {
            z3 = true;
        } else {
            r3 = m19a2 < 4;
            z3 = false;
        }
        if (i2 == 1) {
            if (z5) {
                if (z6) {
                    throw C0438aw.m3194a();
                }
                z4 = z;
                z2 = true;
            } else {
                if (!z6) {
                    throw C0438aw.m3194a();
                }
                z4 = z;
                z3 = true;
            }
        } else if (i2 == -1) {
            if (z5) {
                if (z6) {
                    throw C0438aw.m3194a();
                }
            } else {
                if (!z6) {
                    throw C0438aw.m3194a();
                }
                z4 = z;
                r3 = true;
            }
        } else {
            if (i2 != 0) {
                throw C0438aw.m3194a();
            }
            if (z5) {
                if (!z6) {
                    throw C0438aw.m3194a();
                }
                if (m19a >= m19a2) {
                    z4 = z;
                    r3 = true;
                    z2 = true;
                }
                z3 = true;
            } else {
                if (z6) {
                    throw C0438aw.m3194a();
                }
                z4 = z;
            }
        }
        if (z4) {
            if (z2) {
                throw C0438aw.m3194a();
            }
            a10.m22b(m28f(), m29g());
        }
        if (z2) {
            a10.m21a(m28f(), m29g());
        }
        if (r3) {
            if (z3) {
                throw C0438aw.m3194a();
            }
            a10.m22b(m26d(), m29g());
        }
        if (z3) {
            a10.m21a(m26d(), m27e());
        }
    }

    /* renamed from: a */
    private void m13318a(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f11419h.size()) {
                break;
            }
            i10 i10Var = this.f11419h.get(i2);
            if (i10Var.m12322b() > i) {
                z2 = i10Var.m12321a(this.f11418g);
                break;
            } else {
                z3 = i10Var.m12321a(this.f11418g);
                i2++;
            }
        }
        if (z2 || z3 || m13321a((Iterable<h10>) this.f11418g, (Iterable<i10>) this.f11419h)) {
            return;
        }
        this.f11419h.add(i2, new i10(this.f11418g, i, z));
        m13319a(this.f11418g, this.f11419h);
    }

    /* renamed from: a */
    private static void m13319a(List<h10> list, List<i10> list2) {
        boolean z;
        Iterator<i10> it = list2.iterator();
        while (it.hasNext()) {
            i10 next = it.next();
            if (next.m12320a().size() != list.size()) {
                Iterator<h10> it2 = next.m12320a().iterator();
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

    /* renamed from: a */
    private static boolean m13320a(c10 c10Var, boolean z, boolean z2) {
        return (c10Var.m3520c() == 0 && z && z2) ? false : true;
    }

    /* renamed from: a */
    private static boolean m13321a(Iterable<h10> iterable, Iterable<i10> iterable2) {
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
                Iterator<h10> it3 = next.m12320a().iterator();
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

    /* renamed from: b */
    private void m13322b(C2531gz c2531gz, List<h10> list, int i) {
        int[] m25c = m25c();
        m25c[0] = 0;
        m25c[1] = 0;
        m25c[2] = 0;
        m25c[3] = 0;
        int m12052c = c2531gz.m12052c();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).m12081a().m3519b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f11421j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < m12052c) {
            z2 = !c2531gz.m12048a(i);
            if (!z2) {
                break;
            } else {
                i++;
            }
        }
        boolean z3 = z2;
        int i2 = 0;
        int i3 = i;
        while (i < m12052c) {
            if (c2531gz.m12048a(i) ^ z3) {
                m25c[i2] = m25c[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m13324c(m25c);
                    }
                    if (a10.m23b(m25c)) {
                        int[] iArr = this.f11420i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m13324c(m25c);
                    }
                    i3 += m25c[0] + m25c[1];
                    m25c[0] = m25c[2];
                    m25c[1] = m25c[3];
                    m25c[2] = 0;
                    m25c[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                m25c[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: b */
    private static boolean m13323b(List<h10> list) {
        boolean z;
        for (int[] iArr : f11417p) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    }
                    if (list.get(i).m12081a().m3520c() != iArr[i]) {
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

    /* renamed from: c */
    private static void m13324c(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: h */
    private boolean m13325h() {
        h10 h10Var = this.f11418g.get(0);
        b10 m12082b = h10Var.m12082b();
        b10 m12083c = h10Var.m12083c();
        if (m12083c == null) {
            return false;
        }
        int m3268a = m12083c.m3268a();
        int i = 2;
        for (int i2 = 1; i2 < this.f11418g.size(); i2++) {
            h10 h10Var2 = this.f11418g.get(i2);
            m3268a += h10Var2.m12082b().m3268a();
            i++;
            b10 m12083c2 = h10Var2.m12083c();
            if (m12083c2 != null) {
                m3268a += m12083c2.m3268a();
                i++;
            }
        }
        return ((i + (-4)) * 211) + (m3268a % 211) == m12082b.m3269b();
    }

    /* renamed from: a */
    b10 m13326a(C2531gz c2531gz, c10 c10Var, boolean z, boolean z2) {
        int[] m24b = m24b();
        m24b[0] = 0;
        m24b[1] = 0;
        m24b[2] = 0;
        m24b[3] = 0;
        m24b[4] = 0;
        m24b[5] = 0;
        m24b[6] = 0;
        m24b[7] = 0;
        int[] m3519b = c10Var.m3519b();
        if (z2) {
            t00.m15479b(c2531gz, m3519b[0], m24b);
        } else {
            t00.m15477a(c2531gz, m3519b[1], m24b);
            int i = 0;
            for (int length = m24b.length - 1; i < length; length--) {
                int i2 = m24b[i];
                m24b[i] = m24b[length];
                m24b[length] = i2;
                i++;
            }
        }
        float m19a = a10.m19a(m24b) / 17;
        float f = (c10Var.m3519b()[1] - c10Var.m3519b()[0]) / 15.0f;
        if (Math.abs(m19a - f) / f > 0.3f) {
            throw C0438aw.m3194a();
        }
        int[] m28f = m28f();
        int[] m26d = m26d();
        float[] m29g = m29g();
        float[] m27e = m27e();
        for (int i3 = 0; i3 < m24b.length; i3++) {
            float f2 = (m24b[i3] * 1.0f) / m19a;
            int i4 = (int) (0.5f + f2);
            if (i4 < 1) {
                if (f2 < 0.3f) {
                    throw C0438aw.m3194a();
                }
                i4 = 1;
            } else if (i4 > 8) {
                if (f2 > 8.7f) {
                    throw C0438aw.m3194a();
                }
                i4 = 8;
            }
            int i5 = i3 / 2;
            if ((i3 & 1) == 0) {
                m28f[i5] = i4;
                m29g[i5] = f2 - i4;
            } else {
                m26d[i5] = i4;
                m27e[i5] = f2 - i4;
            }
        }
        m13317a(17);
        int m3520c = (((c10Var.m3520c() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
        int i6 = 0;
        int i7 = 0;
        for (int length2 = m28f.length - 1; length2 >= 0; length2--) {
            if (m13320a(c10Var, z, z2)) {
                i6 += m28f[length2] * f11416o[m3520c][length2 * 2];
            }
            i7 += m28f[length2];
        }
        int i8 = 0;
        for (int length3 = m26d.length - 1; length3 >= 0; length3--) {
            if (m13320a(c10Var, z, z2)) {
                i8 += m26d[length3] * f11416o[m3520c][(length3 * 2) + 1];
            }
        }
        int i9 = i6 + i8;
        if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
            throw C0438aw.m3194a();
        }
        int i10 = (13 - i7) / 2;
        int i11 = f11412k[i10];
        return new b10((f10.m11660a(m28f, i11, true) * f11413l[i10]) + f10.m11660a(m26d, 9 - i11, false) + f11414m[i10], i9);
    }

    @Override // p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        this.f11418g.clear();
        this.f11421j = false;
        try {
            return m13314a(m13328a(i, c2531gz));
        } catch (C0438aw unused) {
            this.f11418g.clear();
            this.f11421j = true;
            return m13314a(m13328a(i, c2531gz));
        }
    }

    /* renamed from: a */
    h10 m13327a(C2531gz c2531gz, List<h10> list, int i) {
        c10 m13313a;
        b10 b10Var;
        boolean z = list.size() % 2 == 0;
        if (this.f11421j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m13322b(c2531gz, list, i2);
            m13313a = m13313a(c2531gz, i, z);
            if (m13313a == null) {
                i2 = m13312a(c2531gz, this.f11420i[0]);
            } else {
                z2 = false;
            }
        } while (z2);
        b10 m13326a = m13326a(c2531gz, m13313a, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).m12084d()) {
            throw C0438aw.m3194a();
        }
        try {
            b10Var = m13326a(c2531gz, m13313a, z, false);
        } catch (C0438aw unused) {
            b10Var = null;
        }
        return new h10(m13326a, b10Var, m13313a, true);
    }

    /* renamed from: a */
    List<h10> m13328a(int i, C2531gz c2531gz) {
        while (true) {
            try {
                this.f11418g.add(m13327a(c2531gz, this.f11418g, i));
            } catch (C0438aw e) {
                if (this.f11418g.isEmpty()) {
                    throw e;
                }
                if (m13325h()) {
                    return this.f11418g;
                }
                boolean z = !this.f11419h.isEmpty();
                m13318a(i, false);
                if (z) {
                    List<h10> m13316a = m13316a(false);
                    if (m13316a != null) {
                        return m13316a;
                    }
                    List<h10> m13316a2 = m13316a(true);
                    if (m13316a2 != null) {
                        return m13316a2;
                    }
                }
                throw C0438aw.m3194a();
            }
        }
    }

    @Override // p000.t00, p000.InterfaceC2404dw
    /* renamed from: a */
    public void mo11489a() {
        this.f11418g.clear();
        this.f11419h.clear();
    }
}
