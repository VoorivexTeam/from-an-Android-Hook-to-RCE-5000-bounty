package p000;

import java.util.Map;

/* loaded from: classes.dex */
public class i30 {

    /* renamed from: a */
    private final C2571hz f10563a;

    /* renamed from: b */
    private InterfaceC2790iw f10564b;

    public i30(C2571hz c2571hz) {
        this.f10563a = c2571hz;
    }

    /* renamed from: a */
    private float m12335a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        i30 i30Var;
        boolean z;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i11 = (-abs) / 2;
        int i12 = i5 < i7 ? 1 : -1;
        int i13 = i6 < i8 ? 1 : -1;
        int i14 = i7 + i12;
        int i15 = i5;
        int i16 = i6;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                i30Var = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                i30Var = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == i30Var.f10563a.m12295b(i18, i19)) {
                if (i17 == 2) {
                    return C3228sz.m15460a(i15, i16, i5, i6);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i8) {
                    break;
                }
                i16 += i13;
                i11 -= abs;
            }
            i15 += i12;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return C3228sz.m15460a(i9, i8, i5, i6);
        }
        return Float.NaN;
    }

    /* renamed from: a */
    private float m12336a(C2568hw c2568hw, C2568hw c2568hw2) {
        float m12340b = m12340b((int) c2568hw.m12248a(), (int) c2568hw.m12249b(), (int) c2568hw2.m12248a(), (int) c2568hw2.m12249b());
        float m12340b2 = m12340b((int) c2568hw2.m12248a(), (int) c2568hw2.m12249b(), (int) c2568hw.m12248a(), (int) c2568hw.m12249b());
        return Float.isNaN(m12340b) ? m12340b2 / 7.0f : Float.isNaN(m12340b2) ? m12340b / 7.0f : (m12340b + m12340b2) / 14.0f;
    }

    /* renamed from: a */
    private static int m12337a(C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, float f) {
        int m15461a = ((C3228sz.m15461a(C2568hw.m12245a(c2568hw, c2568hw2) / f) + C3228sz.m15461a(C2568hw.m12245a(c2568hw, c2568hw3) / f)) / 2) + 7;
        int i = m15461a & 3;
        if (i == 0) {
            return m15461a + 1;
        }
        if (i == 2) {
            return m15461a - 1;
        }
        if (i != 3) {
            return m15461a;
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: a */
    private static C2571hz m12338a(C2571hz c2571hz, C3145qz c3145qz, int i) {
        return AbstractC3064oz.m14668a().mo13946a(c2571hz, i, i, c3145qz);
    }

    /* renamed from: a */
    private static C3145qz m12339a(C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, C2568hw c2568hw4, int i) {
        float m12248a;
        float m12249b;
        float f;
        float f2 = i - 3.5f;
        if (c2568hw4 != null) {
            m12248a = c2568hw4.m12248a();
            m12249b = c2568hw4.m12249b();
            f = f2 - 3.0f;
        } else {
            m12248a = (c2568hw2.m12248a() - c2568hw.m12248a()) + c2568hw3.m12248a();
            m12249b = (c2568hw2.m12249b() - c2568hw.m12249b()) + c2568hw3.m12249b();
            f = f2;
        }
        return C3145qz.m15155a(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, c2568hw.m12248a(), c2568hw.m12249b(), c2568hw2.m12248a(), c2568hw2.m12249b(), m12248a, m12249b, c2568hw3.m12248a(), c2568hw3.m12249b());
    }

    /* renamed from: b */
    private float m12340b(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float m12335a = m12335a(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.f10563a.m12300h()) {
            f = ((this.f10563a.m12300h() - 1) - i) / (i5 - i);
            i5 = this.f10563a.m12300h() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.f10563a.m12297c()) {
            f2 = ((this.f10563a.m12297c() - 1) - i2) / (i7 - i2);
            i6 = this.f10563a.m12297c() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (m12335a + m12335a(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }

    /* renamed from: a */
    protected final float m12341a(C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3) {
        return (m12336a(c2568hw, c2568hw2) + m12336a(c2568hw, c2568hw3)) / 2.0f;
    }

    /* renamed from: a */
    protected final g30 m12342a(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f10563a.m12300h() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min < f3) {
            throw C0438aw.m3194a();
        }
        int max2 = Math.max(0, i2 - i3);
        int min2 = Math.min(this.f10563a.m12297c() - 1, i2 + i3) - max2;
        if (min2 >= f3) {
            return new h30(this.f10563a, max, max2, min, min2, f, this.f10564b).m12091a();
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: a */
    public final C2961mz m12343a(Map<EnumC3412wv, ?> map) {
        InterfaceC2790iw interfaceC2790iw = map == null ? null : (InterfaceC2790iw) map.get(EnumC3412wv.NEED_RESULT_POINT_CALLBACK);
        this.f10564b = interfaceC2790iw;
        return m12344a(new k30(this.f10563a, interfaceC2790iw).m13600a(map));
    }

    /* renamed from: a */
    protected final C2961mz m12344a(l30 l30Var) {
        j30 m13803b = l30Var.m13803b();
        j30 m13804c = l30Var.m13804c();
        j30 m13802a = l30Var.m13802a();
        float m12341a = m12341a(m13803b, m13804c, m13802a);
        if (m12341a < 1.0f) {
            throw C0438aw.m3194a();
        }
        int m12337a = m12337a(m13803b, m13804c, m13802a, m12341a);
        f30 m11674b = f30.m11674b(m12337a);
        int m11680c = m11674b.m11680c() - 7;
        g30 g30Var = null;
        if (m11674b.m11679b().length > 0) {
            float m12248a = (m13804c.m12248a() - m13803b.m12248a()) + m13802a.m12248a();
            float m12249b = (m13804c.m12249b() - m13803b.m12249b()) + m13802a.m12249b();
            float f = 1.0f - (3.0f / m11680c);
            int m12248a2 = (int) (m13803b.m12248a() + ((m12248a - m13803b.m12248a()) * f));
            int m12249b2 = (int) (m13803b.m12249b() + (f * (m12249b - m13803b.m12249b())));
            for (int i = 4; i <= 16; i <<= 1) {
                try {
                    g30Var = m12342a(m12341a, m12248a2, m12249b2, i);
                    break;
                } catch (C0438aw unused) {
                }
            }
        }
        return new C2961mz(m12338a(this.f10563a, m12339a(m13803b, m13804c, m13802a, g30Var, m12337a), m12337a), g30Var == null ? new C2568hw[]{m13802a, m13803b, m13804c} : new C2568hw[]{m13802a, m13803b, m13804c, g30Var});
    }
}
