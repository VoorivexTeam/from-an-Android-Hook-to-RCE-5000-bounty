package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e10 extends a10 {

    /* renamed from: i */
    private static final int[] f9900i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    private static final int[] f9901j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f9902k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f9903l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f9904m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f9905n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f9906o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<d10> f9907g = new ArrayList();

    /* renamed from: h */
    private final List<d10> f9908h = new ArrayList();

    /* renamed from: a */
    private b10 m11522a(C2531gz c2531gz, c10 c10Var, boolean z) {
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
        if (z) {
            t00.m15479b(c2531gz, m3519b[0], m24b);
        } else {
            t00.m15477a(c2531gz, m3519b[1] + 1, m24b);
            int i = 0;
            for (int length = m24b.length - 1; i < length; length--) {
                int i2 = m24b[i];
                m24b[i] = m24b[length];
                m24b[length] = i2;
                i++;
            }
        }
        int i3 = z ? 16 : 15;
        float m19a = a10.m19a(m24b) / i3;
        int[] m28f = m28f();
        int[] m26d = m26d();
        float[] m29g = m29g();
        float[] m27e = m27e();
        for (int i4 = 0; i4 < m24b.length; i4++) {
            float f = m24b[i4] / m19a;
            int i5 = (int) (0.5f + f);
            if (i5 < 1) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                m28f[i6] = i5;
                m29g[i6] = f - i5;
            } else {
                m26d[i6] = i5;
                m27e[i6] = f - i5;
            }
        }
        m11526a(z, i3);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = m28f.length - 1; length2 >= 0; length2--) {
            i7 = (i7 * 9) + m28f[length2];
            i8 += m28f[length2];
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = m26d.length - 1; length3 >= 0; length3--) {
            i9 = (i9 * 9) + m26d[length3];
            i10 += m26d[length3];
        }
        int i11 = i7 + (i9 * 3);
        if (!z) {
            if ((i10 & 1) != 0 || i10 > 10 || i10 < 4) {
                throw C0438aw.m3194a();
            }
            int i12 = (10 - i10) / 2;
            int i13 = f9905n[i12];
            return new b10((f10.m11660a(m26d, 9 - i13, false) * f9901j[i12]) + f10.m11660a(m28f, i13, true) + f9903l[i12], i11);
        }
        if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
            throw C0438aw.m3194a();
        }
        int i14 = (12 - i8) / 2;
        int i15 = f9904m[i14];
        return new b10((f10.m11660a(m28f, i15, false) * f9900i[i14]) + f10.m11660a(m26d, 9 - i15, true) + f9902k[i14], i11);
    }

    /* renamed from: a */
    private c10 m11523a(C2531gz c2531gz, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean m12048a = c2531gz.m12048a(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (c2531gz.m12048a(i4) ^ m12048a)) {
            i4--;
        }
        int i5 = i4 + 1;
        int i6 = iArr[0] - i5;
        int[] m25c = m25c();
        System.arraycopy(m25c, 0, m25c, 1, m25c.length - 1);
        m25c[0] = i6;
        int m20a = a10.m20a(m25c, f9906o);
        int i7 = iArr[1];
        if (z) {
            int m12052c = (c2531gz.m12052c() - 1) - i5;
            i2 = (c2531gz.m12052c() - 1) - i7;
            i3 = m12052c;
        } else {
            i2 = i7;
            i3 = i5;
        }
        return new c10(m20a, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* renamed from: a */
    private d10 m11524a(C2531gz c2531gz, boolean z, int i, Map<EnumC3412wv, ?> map) {
        try {
            c10 m11523a = m11523a(c2531gz, i, z, m11528a(c2531gz, 0, z));
            InterfaceC2790iw interfaceC2790iw = map == null ? null : (InterfaceC2790iw) map.get(EnumC3412wv.NEED_RESULT_POINT_CALLBACK);
            if (interfaceC2790iw != null) {
                float f = (r2[0] + r2[1]) / 2.0f;
                if (z) {
                    f = (c2531gz.m12052c() - 1) - f;
                }
                interfaceC2790iw.mo10907a(new C2568hw(f, i));
            }
            b10 m11522a = m11522a(c2531gz, m11523a, true);
            b10 m11522a2 = m11522a(c2531gz, m11523a, false);
            return new d10((m11522a.m3269b() * 1597) + m11522a2.m3269b(), m11522a.m3268a() + (m11522a2.m3268a() * 4), m11523a);
        } catch (C0438aw unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m11525a(Collection<d10> collection, d10 d10Var) {
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
            if (next.m3269b() == d10Var.m3269b()) {
                next.m11247e();
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m11526a(boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e10.m11526a(boolean, int):void");
    }

    /* renamed from: a */
    private static boolean m11527a(d10 d10Var, d10 d10Var2) {
        int m3268a = (d10Var.m3268a() + (d10Var2.m3268a() * 16)) % 79;
        int m3520c = (d10Var.m11246d().m3520c() * 9) + d10Var2.m11246d().m3520c();
        if (m3520c > 72) {
            m3520c--;
        }
        if (m3520c > 8) {
            m3520c--;
        }
        return m3268a == m3520c;
    }

    /* renamed from: a */
    private int[] m11528a(C2531gz c2531gz, int i, boolean z) {
        int[] m25c = m25c();
        m25c[0] = 0;
        m25c[1] = 0;
        m25c[2] = 0;
        m25c[3] = 0;
        int m12052c = c2531gz.m12052c();
        boolean z2 = false;
        while (i < m12052c) {
            z2 = !c2531gz.m12048a(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < m12052c) {
            if (c2531gz.m12048a(i) ^ z2) {
                m25c[i3] = m25c[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else {
                    if (a10.m23b(m25c)) {
                        return new int[]{i2, i};
                    }
                    i2 += m25c[0] + m25c[1];
                    m25c[0] = m25c[2];
                    m25c[1] = m25c[3];
                    m25c[2] = 0;
                    m25c[3] = 0;
                    i3--;
                }
                m25c[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: b */
    private static C2488fw m11529b(d10 d10Var, d10 d10Var2) {
        String valueOf = String.valueOf((d10Var.m3269b() * 4537077) + d10Var2.m3269b());
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C2568hw[] m3518a = d10Var.m11246d().m3518a();
        C2568hw[] m3518a2 = d10Var2.m11246d().m3518a();
        return new C2488fw(String.valueOf(sb.toString()), null, new C2568hw[]{m3518a[0], m3518a[1], m3518a2[0], m3518a2[1]}, EnumC3224sv.RSS_14);
    }

    @Override // p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        m11525a(this.f9907g, m11524a(c2531gz, false, i, map));
        c2531gz.m12055g();
        m11525a(this.f9908h, m11524a(c2531gz, true, i, map));
        c2531gz.m12055g();
        int size = this.f9907g.size();
        for (int i2 = 0; i2 < size; i2++) {
            d10 d10Var = this.f9907g.get(i2);
            if (d10Var.m11245c() > 1) {
                int size2 = this.f9908h.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d10 d10Var2 = this.f9908h.get(i3);
                    if (d10Var2.m11245c() > 1 && m11527a(d10Var, d10Var2)) {
                        return m11529b(d10Var, d10Var2);
                    }
                }
            }
        }
        throw C0438aw.m3194a();
    }

    @Override // p000.t00, p000.InterfaceC2404dw
    /* renamed from: a */
    public void mo11489a() {
        this.f9907g.clear();
        this.f9908h.clear();
    }
}
