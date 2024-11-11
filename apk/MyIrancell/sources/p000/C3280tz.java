package p000;

/* renamed from: tz */
/* loaded from: classes.dex */
public final class C3280tz {

    /* renamed from: a */
    private final C2571hz f13365a;

    /* renamed from: b */
    private final int f13366b;

    /* renamed from: c */
    private final int f13367c;

    /* renamed from: d */
    private final int f13368d;

    /* renamed from: e */
    private final int f13369e;

    /* renamed from: f */
    private final int f13370f;

    /* renamed from: g */
    private final int f13371g;

    public C3280tz(C2571hz c2571hz) {
        this(c2571hz, 10, c2571hz.m12300h() / 2, c2571hz.m12297c() / 2);
    }

    public C3280tz(C2571hz c2571hz, int i, int i2, int i3) {
        this.f13365a = c2571hz;
        this.f13366b = c2571hz.m12297c();
        int m12300h = c2571hz.m12300h();
        this.f13367c = m12300h;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f13368d = i5;
        int i6 = i2 + i4;
        this.f13369e = i6;
        int i7 = i3 - i4;
        this.f13371g = i7;
        int i8 = i3 + i4;
        this.f13370f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= this.f13366b || i6 >= m12300h) {
            throw C0438aw.m3194a();
        }
    }

    /* renamed from: a */
    private C2568hw m15695a(float f, float f2, float f3, float f4) {
        int m15461a = C3228sz.m15461a(C3228sz.m15459a(f, f2, f3, f4));
        float f5 = m15461a;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < m15461a; i++) {
            float f8 = i;
            int m15461a2 = C3228sz.m15461a((f8 * f6) + f);
            int m15461a3 = C3228sz.m15461a((f8 * f7) + f2);
            if (this.f13365a.m12295b(m15461a2, m15461a3)) {
                return new C2568hw(m15461a2, m15461a3);
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m15696a(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f13365a.m12295b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f13365a.m12295b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: a */
    private C2568hw[] m15697a(C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, C2568hw c2568hw4) {
        float m12248a = c2568hw.m12248a();
        float m12249b = c2568hw.m12249b();
        float m12248a2 = c2568hw2.m12248a();
        float m12249b2 = c2568hw2.m12249b();
        float m12248a3 = c2568hw3.m12248a();
        float m12249b3 = c2568hw3.m12249b();
        float m12248a4 = c2568hw4.m12248a();
        float m12249b4 = c2568hw4.m12249b();
        return m12248a < ((float) this.f13367c) / 2.0f ? new C2568hw[]{new C2568hw(m12248a4 - 1.0f, m12249b4 + 1.0f), new C2568hw(m12248a2 + 1.0f, m12249b2 + 1.0f), new C2568hw(m12248a3 - 1.0f, m12249b3 - 1.0f), new C2568hw(m12248a + 1.0f, m12249b - 1.0f)} : new C2568hw[]{new C2568hw(m12248a4 + 1.0f, m12249b4 + 1.0f), new C2568hw(m12248a2 + 1.0f, m12249b2 - 1.0f), new C2568hw(m12248a3 - 1.0f, m12249b3 + 1.0f), new C2568hw(m12248a - 1.0f, m12249b - 1.0f)};
    }

    /* renamed from: a */
    public C2568hw[] m15698a() {
        int i = this.f13368d;
        int i2 = this.f13369e;
        int i3 = this.f13371g;
        int i4 = this.f13370f;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (z2) {
            boolean z8 = true;
            boolean z9 = false;
            while (true) {
                if ((z8 || !z3) && i2 < this.f13367c) {
                    z8 = m15696a(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f13367c) {
                boolean z10 = true;
                while (true) {
                    if ((z10 || !z4) && i4 < this.f13366b) {
                        z10 = m15696a(i, i2, i4, true);
                        if (z10) {
                            i4++;
                            z4 = true;
                            z9 = true;
                        } else if (!z4) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f13366b) {
                    boolean z11 = true;
                    while (true) {
                        if ((z11 || !z5) && i >= 0) {
                            z11 = m15696a(i3, i4, i, false);
                            if (z11) {
                                i--;
                                z5 = true;
                                z9 = true;
                            } else if (!z5) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z2 = z9;
                        boolean z12 = true;
                        while (true) {
                            if ((z12 || !z7) && i3 >= 0) {
                                z12 = m15696a(i, i2, i3, true);
                                if (z12) {
                                    i3--;
                                    z2 = true;
                                    z7 = true;
                                } else if (!z7) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 >= 0) {
                            if (z2) {
                                z6 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z || !z6) {
            throw C0438aw.m3194a();
        }
        int i5 = i2 - i;
        C2568hw c2568hw = null;
        C2568hw c2568hw2 = null;
        for (int i6 = 1; i6 < i5; i6++) {
            c2568hw2 = m15695a(i, i4 - i6, i + i6, i4);
            if (c2568hw2 != null) {
                break;
            }
        }
        if (c2568hw2 == null) {
            throw C0438aw.m3194a();
        }
        C2568hw c2568hw3 = null;
        for (int i7 = 1; i7 < i5; i7++) {
            c2568hw3 = m15695a(i, i3 + i7, i + i7, i3);
            if (c2568hw3 != null) {
                break;
            }
        }
        if (c2568hw3 == null) {
            throw C0438aw.m3194a();
        }
        C2568hw c2568hw4 = null;
        for (int i8 = 1; i8 < i5; i8++) {
            c2568hw4 = m15695a(i2, i3 + i8, i2 - i8, i3);
            if (c2568hw4 != null) {
                break;
            }
        }
        if (c2568hw4 == null) {
            throw C0438aw.m3194a();
        }
        for (int i9 = 1; i9 < i5; i9++) {
            c2568hw = m15695a(i2, i4 - i9, i2 - i9, i4);
            if (c2568hw != null) {
                break;
            }
        }
        if (c2568hw != null) {
            return m15697a(c2568hw, c2568hw2, c2568hw4, c2568hw3);
        }
        throw C0438aw.m3194a();
    }
}
