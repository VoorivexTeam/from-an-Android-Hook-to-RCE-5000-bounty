package p000;

/* renamed from: mw */
/* loaded from: classes.dex */
public final class C2958mw {

    /* renamed from: g */
    private static final int[] f12185g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C2571hz f12186a;

    /* renamed from: b */
    private boolean f12187b;

    /* renamed from: c */
    private int f12188c;

    /* renamed from: d */
    private int f12189d;

    /* renamed from: e */
    private int f12190e;

    /* renamed from: f */
    private int f12191f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mw$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final int f12192a;

        /* renamed from: b */
        private final int f12193b;

        a(int i, int i2) {
            this.f12192a = i;
            this.f12193b = i2;
        }

        /* renamed from: a */
        int m14203a() {
            return this.f12192a;
        }

        /* renamed from: b */
        int m14204b() {
            return this.f12193b;
        }

        /* renamed from: c */
        C2568hw m14205c() {
            return new C2568hw(m14203a(), m14204b());
        }

        public String toString() {
            return "<" + this.f12192a + ' ' + this.f12193b + '>';
        }
    }

    public C2958mw(C2571hz c2571hz) {
        this.f12186a = c2571hz;
    }

    /* renamed from: a */
    private static float m14185a(C2568hw c2568hw, C2568hw c2568hw2) {
        return C3228sz.m15459a(c2568hw.m12248a(), c2568hw.m12249b(), c2568hw2.m12248a(), c2568hw2.m12249b());
    }

    /* renamed from: a */
    private static float m14186a(a aVar, a aVar2) {
        return C3228sz.m15460a(aVar.m14203a(), aVar.m14204b(), aVar2.m14203a(), aVar2.m14204b());
    }

    /* renamed from: a */
    private int m14187a() {
        if (this.f12187b) {
            return (this.f12188c * 4) + 11;
        }
        int i = this.f12188c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: a */
    private static int m14188a(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C3416wz(C3324uz.f13519k).m16405a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C3456xz unused) {
            throw C0438aw.m3194a();
        }
    }

    /* renamed from: a */
    private int m14189a(C2568hw c2568hw, C2568hw c2568hw2, int i) {
        float m14185a = m14185a(c2568hw, c2568hw2);
        float f = m14185a / i;
        float m12248a = c2568hw.m12248a();
        float m12249b = c2568hw.m12249b();
        float m12248a2 = ((c2568hw2.m12248a() - c2568hw.m12248a()) * f) / m14185a;
        float m12249b2 = (f * (c2568hw2.m12249b() - c2568hw.m12249b())) / m14185a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f12186a.m12295b(C3228sz.m15461a((f2 * m12248a2) + m12248a), C3228sz.m15461a((f2 * m12249b2) + m12249b))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m14190a(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f12185g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: a */
    private C2571hz m14191a(C2571hz c2571hz, C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, C2568hw c2568hw4) {
        AbstractC3064oz m14668a = AbstractC3064oz.m14668a();
        int m14187a = m14187a();
        float f = m14187a / 2.0f;
        int i = this.f12190e;
        float f2 = f - i;
        float f3 = f + i;
        return m14668a.mo13945a(c2571hz, m14187a, m14187a, f2, f2, f3, f2, f3, f3, f2, f3, c2568hw.m12248a(), c2568hw.m12249b(), c2568hw2.m12248a(), c2568hw2.m12249b(), c2568hw3.m12248a(), c2568hw3.m12249b(), c2568hw4.m12248a(), c2568hw4.m12249b());
    }

    /* renamed from: a */
    private a m14192a(a aVar, boolean z, int i, int i2) {
        int m14203a = aVar.m14203a() + i;
        int m14204b = aVar.m14204b();
        while (true) {
            m14204b += i2;
            if (!m14194a(m14203a, m14204b) || this.f12186a.m12295b(m14203a, m14204b) != z) {
                break;
            }
            m14203a += i;
        }
        int i3 = m14203a - i;
        int i4 = m14204b - i2;
        while (m14194a(i3, i4) && this.f12186a.m12295b(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m14194a(i5, i4) && this.f12186a.m12295b(i5, i4) == z) {
            i4 += i2;
        }
        return new a(i5, i4 - i2);
    }

    /* renamed from: a */
    private void m14193a(C2568hw[] c2568hwArr) {
        int i;
        long j;
        long j2;
        if (!m14195a(c2568hwArr[0]) || !m14195a(c2568hwArr[1]) || !m14195a(c2568hwArr[2]) || !m14195a(c2568hwArr[3])) {
            throw C0438aw.m3194a();
        }
        int i2 = this.f12190e * 2;
        int[] iArr = {m14189a(c2568hwArr[0], c2568hwArr[1], i2), m14189a(c2568hwArr[1], c2568hwArr[2], i2), m14189a(c2568hwArr[2], c2568hwArr[3], i2), m14189a(c2568hwArr[3], c2568hwArr[0], i2)};
        this.f12191f = m14190a(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f12191f + i3) % 4];
            if (this.f12187b) {
                j = j3 << 7;
                j2 = (i4 >> 1) & 127;
            } else {
                j = j3 << 10;
                j2 = ((i4 >> 2) & 992) + ((i4 >> 1) & 31);
            }
            j3 = j + j2;
        }
        int m14188a = m14188a(j3, this.f12187b);
        if (this.f12187b) {
            this.f12188c = (m14188a >> 6) + 1;
            i = m14188a & 63;
        } else {
            this.f12188c = (m14188a >> 11) + 1;
            i = m14188a & 2047;
        }
        this.f12189d = i + 1;
    }

    /* renamed from: a */
    private boolean m14194a(int i, int i2) {
        return i >= 0 && i < this.f12186a.m12300h() && i2 > 0 && i2 < this.f12186a.m12297c();
    }

    /* renamed from: a */
    private boolean m14195a(C2568hw c2568hw) {
        return m14194a(C3228sz.m15461a(c2568hw.m12248a()), C3228sz.m15461a(c2568hw.m12249b()));
    }

    /* renamed from: a */
    private boolean m14196a(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.m14203a() - 3, aVar.m14204b() + 3);
        a aVar6 = new a(aVar2.m14203a() - 3, aVar2.m14204b() - 3);
        a aVar7 = new a(aVar3.m14203a() + 3, aVar3.m14204b() - 3);
        a aVar8 = new a(aVar4.m14203a() + 3, aVar4.m14204b() + 3);
        int m14199b = m14199b(aVar8, aVar5);
        return m14199b != 0 && m14199b(aVar5, aVar6) == m14199b && m14199b(aVar6, aVar7) == m14199b && m14199b(aVar7, aVar8) == m14199b;
    }

    /* renamed from: a */
    private C2568hw[] m14197a(a aVar) {
        this.f12190e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        a aVar5 = aVar4;
        boolean z = true;
        while (this.f12190e < 9) {
            a m14192a = m14192a(aVar2, z, 1, -1);
            a m14192a2 = m14192a(aVar3, z, 1, 1);
            a m14192a3 = m14192a(aVar4, z, -1, 1);
            a m14192a4 = m14192a(aVar5, z, -1, -1);
            if (this.f12190e > 2) {
                double m14186a = (m14186a(m14192a4, m14192a) * this.f12190e) / (m14186a(aVar5, aVar2) * (this.f12190e + 2));
                if (m14186a < 0.75d || m14186a > 1.25d || !m14196a(m14192a, m14192a2, m14192a3, m14192a4)) {
                    break;
                }
            }
            z = !z;
            this.f12190e++;
            aVar5 = m14192a4;
            aVar2 = m14192a;
            aVar3 = m14192a2;
            aVar4 = m14192a3;
        }
        int i = this.f12190e;
        if (i != 5 && i != 7) {
            throw C0438aw.m3194a();
        }
        this.f12187b = this.f12190e == 5;
        C2568hw[] c2568hwArr = {new C2568hw(aVar2.m14203a() + 0.5f, aVar2.m14204b() - 0.5f), new C2568hw(aVar3.m14203a() + 0.5f, aVar3.m14204b() + 0.5f), new C2568hw(aVar4.m14203a() - 0.5f, aVar4.m14204b() + 0.5f), new C2568hw(aVar5.m14203a() - 0.5f, aVar5.m14204b() - 0.5f)};
        int i2 = this.f12190e;
        return m14198a(c2568hwArr, (i2 * 2) - 3, i2 * 2);
    }

    /* renamed from: a */
    private static C2568hw[] m14198a(C2568hw[] c2568hwArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float m12248a = c2568hwArr[0].m12248a() - c2568hwArr[2].m12248a();
        float m12249b = c2568hwArr[0].m12249b() - c2568hwArr[2].m12249b();
        float m12248a2 = (c2568hwArr[0].m12248a() + c2568hwArr[2].m12248a()) / 2.0f;
        float m12249b2 = (c2568hwArr[0].m12249b() + c2568hwArr[2].m12249b()) / 2.0f;
        float f4 = m12248a * f3;
        float f5 = m12249b * f3;
        C2568hw c2568hw = new C2568hw(m12248a2 + f4, m12249b2 + f5);
        C2568hw c2568hw2 = new C2568hw(m12248a2 - f4, m12249b2 - f5);
        float m12248a3 = c2568hwArr[1].m12248a() - c2568hwArr[3].m12248a();
        float m12249b3 = c2568hwArr[1].m12249b() - c2568hwArr[3].m12249b();
        float m12248a4 = (c2568hwArr[1].m12248a() + c2568hwArr[3].m12248a()) / 2.0f;
        float m12249b4 = (c2568hwArr[1].m12249b() + c2568hwArr[3].m12249b()) / 2.0f;
        float f6 = m12248a3 * f3;
        float f7 = f3 * m12249b3;
        return new C2568hw[]{c2568hw, new C2568hw(m12248a4 + f6, m12249b4 + f7), c2568hw2, new C2568hw(m12248a4 - f6, m12249b4 - f7)};
    }

    /* renamed from: b */
    private int m14199b(a aVar, a aVar2) {
        float m14186a = m14186a(aVar, aVar2);
        float m14203a = (aVar2.m14203a() - aVar.m14203a()) / m14186a;
        float m14204b = (aVar2.m14204b() - aVar.m14204b()) / m14186a;
        float m14203a2 = aVar.m14203a();
        float m14204b2 = aVar.m14204b();
        boolean m12295b = this.f12186a.m12295b(aVar.m14203a(), aVar.m14204b());
        int i = 0;
        for (int i2 = 0; i2 < m14186a; i2++) {
            m14203a2 += m14203a;
            m14204b2 += m14204b;
            if (this.f12186a.m12295b(C3228sz.m15461a(m14203a2), C3228sz.m15461a(m14204b2)) != m12295b) {
                i++;
            }
        }
        float f = i / m14186a;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == m12295b ? 1 : -1;
        }
        return 0;
    }

    /* renamed from: b */
    private a m14200b() {
        C2568hw m14205c;
        C2568hw c2568hw;
        C2568hw c2568hw2;
        C2568hw c2568hw3;
        C2568hw m14205c2;
        C2568hw m14205c3;
        C2568hw m14205c4;
        C2568hw m14205c5;
        try {
            C2568hw[] m15698a = new C3280tz(this.f12186a).m15698a();
            c2568hw2 = m15698a[0];
            c2568hw3 = m15698a[1];
            c2568hw = m15698a[2];
            m14205c = m15698a[3];
        } catch (C0438aw unused) {
            int m12300h = this.f12186a.m12300h() / 2;
            int m12297c = this.f12186a.m12297c() / 2;
            int i = m12300h + 7;
            int i2 = m12297c - 7;
            C2568hw m14205c6 = m14192a(new a(i, i2), false, 1, -1).m14205c();
            int i3 = m12297c + 7;
            C2568hw m14205c7 = m14192a(new a(i, i3), false, 1, 1).m14205c();
            int i4 = m12300h - 7;
            C2568hw m14205c8 = m14192a(new a(i4, i3), false, -1, 1).m14205c();
            m14205c = m14192a(new a(i4, i2), false, -1, -1).m14205c();
            c2568hw = m14205c8;
            c2568hw2 = m14205c6;
            c2568hw3 = m14205c7;
        }
        int m15461a = C3228sz.m15461a((((c2568hw2.m12248a() + m14205c.m12248a()) + c2568hw3.m12248a()) + c2568hw.m12248a()) / 4.0f);
        int m15461a2 = C3228sz.m15461a((((c2568hw2.m12249b() + m14205c.m12249b()) + c2568hw3.m12249b()) + c2568hw.m12249b()) / 4.0f);
        try {
            C2568hw[] m15698a2 = new C3280tz(this.f12186a, 15, m15461a, m15461a2).m15698a();
            m14205c2 = m15698a2[0];
            m14205c3 = m15698a2[1];
            m14205c4 = m15698a2[2];
            m14205c5 = m15698a2[3];
        } catch (C0438aw unused2) {
            int i5 = m15461a + 7;
            int i6 = m15461a2 - 7;
            m14205c2 = m14192a(new a(i5, i6), false, 1, -1).m14205c();
            int i7 = m15461a2 + 7;
            m14205c3 = m14192a(new a(i5, i7), false, 1, 1).m14205c();
            int i8 = m15461a - 7;
            m14205c4 = m14192a(new a(i8, i7), false, -1, 1).m14205c();
            m14205c5 = m14192a(new a(i8, i6), false, -1, -1).m14205c();
        }
        return new a(C3228sz.m15461a((((m14205c2.m12248a() + m14205c5.m12248a()) + m14205c3.m12248a()) + m14205c4.m12248a()) / 4.0f), C3228sz.m15461a((((m14205c2.m12249b() + m14205c5.m12249b()) + m14205c3.m12249b()) + m14205c4.m12249b()) / 4.0f));
    }

    /* renamed from: b */
    private C2568hw[] m14201b(C2568hw[] c2568hwArr) {
        return m14198a(c2568hwArr, this.f12190e * 2, m14187a());
    }

    /* renamed from: a */
    public C2830jw m14202a(boolean z) {
        C2568hw[] m14197a = m14197a(m14200b());
        if (z) {
            C2568hw c2568hw = m14197a[0];
            m14197a[0] = m14197a[2];
            m14197a[2] = c2568hw;
        }
        m14193a(m14197a);
        C2571hz c2571hz = this.f12186a;
        int i = this.f12191f;
        return new C2830jw(m14191a(c2571hz, m14197a[i % 4], m14197a[(i + 1) % 4], m14197a[(i + 2) % 4], m14197a[(i + 3) % 4]), m14201b(m14197a), this.f12187b, this.f12189d, this.f12188c);
    }
}
