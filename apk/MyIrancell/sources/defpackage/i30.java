package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public class i30 {
    private final hz a;
    private iw b;

    public i30(hz hzVar) {
        this.a = hzVar;
    }

    private float a(int i, int i2, int i3, int i4) {
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
            if (z2 == i30Var.a.b(i18, i19)) {
                if (i17 == 2) {
                    return sz.a(i15, i16, i5, i6);
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
            return sz.a(i9, i8, i5, i6);
        }
        return Float.NaN;
    }

    private float a(hw hwVar, hw hwVar2) {
        float b = b((int) hwVar.a(), (int) hwVar.b(), (int) hwVar2.a(), (int) hwVar2.b());
        float b2 = b((int) hwVar2.a(), (int) hwVar2.b(), (int) hwVar.a(), (int) hwVar.b());
        return Float.isNaN(b) ? b2 / 7.0f : Float.isNaN(b2) ? b / 7.0f : (b + b2) / 14.0f;
    }

    private static int a(hw hwVar, hw hwVar2, hw hwVar3, float f) {
        int a = ((sz.a(hw.a(hwVar, hwVar2) / f) + sz.a(hw.a(hwVar, hwVar3) / f)) / 2) + 7;
        int i = a & 3;
        if (i == 0) {
            return a + 1;
        }
        if (i == 2) {
            return a - 1;
        }
        if (i != 3) {
            return a;
        }
        throw aw.a();
    }

    private static hz a(hz hzVar, qz qzVar, int i) {
        return oz.a().a(hzVar, i, i, qzVar);
    }

    private static qz a(hw hwVar, hw hwVar2, hw hwVar3, hw hwVar4, int i) {
        float a;
        float b;
        float f;
        float f2 = i - 3.5f;
        if (hwVar4 != null) {
            a = hwVar4.a();
            b = hwVar4.b();
            f = f2 - 3.0f;
        } else {
            a = (hwVar2.a() - hwVar.a()) + hwVar3.a();
            b = (hwVar2.b() - hwVar.b()) + hwVar3.b();
            f = f2;
        }
        return qz.a(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, hwVar.a(), hwVar.b(), hwVar2.a(), hwVar2.b(), a, b, hwVar3.a(), hwVar3.b());
    }

    private float b(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float a = a(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.a.h()) {
            f = ((this.a.h() - 1) - i) / (i5 - i);
            i5 = this.a.h() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.a.c()) {
            f2 = ((this.a.c() - 1) - i2) / (i7 - i2);
            i6 = this.a.c() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (a + a(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }

    protected final float a(hw hwVar, hw hwVar2, hw hwVar3) {
        return (a(hwVar, hwVar2) + a(hwVar, hwVar3)) / 2.0f;
    }

    protected final g30 a(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.a.h() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min < f3) {
            throw aw.a();
        }
        int max2 = Math.max(0, i2 - i3);
        int min2 = Math.min(this.a.c() - 1, i2 + i3) - max2;
        if (min2 >= f3) {
            return new h30(this.a, max, max2, min, min2, f, this.b).a();
        }
        throw aw.a();
    }

    public final mz a(Map<wv, ?> map) {
        iw iwVar = map == null ? null : (iw) map.get(wv.NEED_RESULT_POINT_CALLBACK);
        this.b = iwVar;
        return a(new k30(this.a, iwVar).a(map));
    }

    protected final mz a(l30 l30Var) {
        j30 b = l30Var.b();
        j30 c = l30Var.c();
        j30 a = l30Var.a();
        float a2 = a(b, c, a);
        if (a2 < 1.0f) {
            throw aw.a();
        }
        int a3 = a(b, c, a, a2);
        f30 b2 = f30.b(a3);
        int c2 = b2.c() - 7;
        g30 g30Var = null;
        if (b2.b().length > 0) {
            float a4 = (c.a() - b.a()) + a.a();
            float b3 = (c.b() - b.b()) + a.b();
            float f = 1.0f - (3.0f / c2);
            int a5 = (int) (b.a() + ((a4 - b.a()) * f));
            int b4 = (int) (b.b() + (f * (b3 - b.b())));
            for (int i = 4; i <= 16; i <<= 1) {
                try {
                    g30Var = a(a2, a5, b4, i);
                    break;
                } catch (aw unused) {
                }
            }
        }
        return new mz(a(this.a, a(b, c, a, g30Var, a3), a3), g30Var == null ? new hw[]{a, b, c} : new hw[]{a, b, c, g30Var});
    }
}
