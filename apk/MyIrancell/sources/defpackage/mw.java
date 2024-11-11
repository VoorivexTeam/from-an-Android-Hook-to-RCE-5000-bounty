package defpackage;

/* loaded from: classes.dex */
public final class mw {
    private static final int[] g = {3808, 476, 2107, 1799};
    private final hz a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        private final int a;
        private final int b;

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        int a() {
            return this.a;
        }

        int b() {
            return this.b;
        }

        hw c() {
            return new hw(a(), b());
        }

        public String toString() {
            return "<" + this.a + ' ' + this.b + '>';
        }
    }

    public mw(hz hzVar) {
        this.a = hzVar;
    }

    private static float a(hw hwVar, hw hwVar2) {
        return sz.a(hwVar.a(), hwVar.b(), hwVar2.a(), hwVar2.b());
    }

    private static float a(a aVar, a aVar2) {
        return sz.a(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private int a() {
        if (this.b) {
            return (this.c * 4) + 11;
        }
        int i = this.c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    private static int a(long j, boolean z) {
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
            new wz(uz.k).a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (xz unused) {
            throw aw.a();
        }
    }

    private int a(hw hwVar, hw hwVar2, int i) {
        float a2 = a(hwVar, hwVar2);
        float f = a2 / i;
        float a3 = hwVar.a();
        float b = hwVar.b();
        float a4 = ((hwVar2.a() - hwVar.a()) * f) / a2;
        float b2 = (f * (hwVar2.b() - hwVar.b())) / a2;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.a.b(sz.a((f2 * a4) + a3), sz.a((f2 * b2) + b))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    private static int a(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw aw.a();
    }

    private hz a(hz hzVar, hw hwVar, hw hwVar2, hw hwVar3, hw hwVar4) {
        oz a2 = oz.a();
        int a3 = a();
        float f = a3 / 2.0f;
        int i = this.e;
        float f2 = f - i;
        float f3 = f + i;
        return a2.a(hzVar, a3, a3, f2, f2, f3, f2, f3, f3, f2, f3, hwVar.a(), hwVar.b(), hwVar2.a(), hwVar2.b(), hwVar3.a(), hwVar3.b(), hwVar4.a(), hwVar4.b());
    }

    private a a(a aVar, boolean z, int i, int i2) {
        int a2 = aVar.a() + i;
        int b = aVar.b();
        while (true) {
            b += i2;
            if (!a(a2, b) || this.a.b(a2, b) != z) {
                break;
            }
            a2 += i;
        }
        int i3 = a2 - i;
        int i4 = b - i2;
        while (a(i3, i4) && this.a.b(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (a(i5, i4) && this.a.b(i5, i4) == z) {
            i4 += i2;
        }
        return new a(i5, i4 - i2);
    }

    private void a(hw[] hwVarArr) {
        int i;
        long j;
        long j2;
        if (!a(hwVarArr[0]) || !a(hwVarArr[1]) || !a(hwVarArr[2]) || !a(hwVarArr[3])) {
            throw aw.a();
        }
        int i2 = this.e * 2;
        int[] iArr = {a(hwVarArr[0], hwVarArr[1], i2), a(hwVarArr[1], hwVarArr[2], i2), a(hwVarArr[2], hwVarArr[3], i2), a(hwVarArr[3], hwVarArr[0], i2)};
        this.f = a(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f + i3) % 4];
            if (this.b) {
                j = j3 << 7;
                j2 = (i4 >> 1) & 127;
            } else {
                j = j3 << 10;
                j2 = ((i4 >> 2) & 992) + ((i4 >> 1) & 31);
            }
            j3 = j + j2;
        }
        int a2 = a(j3, this.b);
        if (this.b) {
            this.c = (a2 >> 6) + 1;
            i = a2 & 63;
        } else {
            this.c = (a2 >> 11) + 1;
            i = a2 & 2047;
        }
        this.d = i + 1;
    }

    private boolean a(int i, int i2) {
        return i >= 0 && i < this.a.h() && i2 > 0 && i2 < this.a.c();
    }

    private boolean a(hw hwVar) {
        return a(sz.a(hwVar.a()), sz.a(hwVar.b()));
    }

    private boolean a(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.a() - 3, aVar.b() + 3);
        a aVar6 = new a(aVar2.a() - 3, aVar2.b() - 3);
        a aVar7 = new a(aVar3.a() + 3, aVar3.b() - 3);
        a aVar8 = new a(aVar4.a() + 3, aVar4.b() + 3);
        int b = b(aVar8, aVar5);
        return b != 0 && b(aVar5, aVar6) == b && b(aVar6, aVar7) == b && b(aVar7, aVar8) == b;
    }

    private hw[] a(a aVar) {
        this.e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        a aVar5 = aVar4;
        boolean z = true;
        while (this.e < 9) {
            a a2 = a(aVar2, z, 1, -1);
            a a3 = a(aVar3, z, 1, 1);
            a a4 = a(aVar4, z, -1, 1);
            a a5 = a(aVar5, z, -1, -1);
            if (this.e > 2) {
                double a6 = (a(a5, a2) * this.e) / (a(aVar5, aVar2) * (this.e + 2));
                if (a6 < 0.75d || a6 > 1.25d || !a(a2, a3, a4, a5)) {
                    break;
                }
            }
            z = !z;
            this.e++;
            aVar5 = a5;
            aVar2 = a2;
            aVar3 = a3;
            aVar4 = a4;
        }
        int i = this.e;
        if (i != 5 && i != 7) {
            throw aw.a();
        }
        this.b = this.e == 5;
        hw[] hwVarArr = {new hw(aVar2.a() + 0.5f, aVar2.b() - 0.5f), new hw(aVar3.a() + 0.5f, aVar3.b() + 0.5f), new hw(aVar4.a() - 0.5f, aVar4.b() + 0.5f), new hw(aVar5.a() - 0.5f, aVar5.b() - 0.5f)};
        int i2 = this.e;
        return a(hwVarArr, (i2 * 2) - 3, i2 * 2);
    }

    private static hw[] a(hw[] hwVarArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float a2 = hwVarArr[0].a() - hwVarArr[2].a();
        float b = hwVarArr[0].b() - hwVarArr[2].b();
        float a3 = (hwVarArr[0].a() + hwVarArr[2].a()) / 2.0f;
        float b2 = (hwVarArr[0].b() + hwVarArr[2].b()) / 2.0f;
        float f4 = a2 * f3;
        float f5 = b * f3;
        hw hwVar = new hw(a3 + f4, b2 + f5);
        hw hwVar2 = new hw(a3 - f4, b2 - f5);
        float a4 = hwVarArr[1].a() - hwVarArr[3].a();
        float b3 = hwVarArr[1].b() - hwVarArr[3].b();
        float a5 = (hwVarArr[1].a() + hwVarArr[3].a()) / 2.0f;
        float b4 = (hwVarArr[1].b() + hwVarArr[3].b()) / 2.0f;
        float f6 = a4 * f3;
        float f7 = f3 * b3;
        return new hw[]{hwVar, new hw(a5 + f6, b4 + f7), hwVar2, new hw(a5 - f6, b4 - f7)};
    }

    private int b(a aVar, a aVar2) {
        float a2 = a(aVar, aVar2);
        float a3 = (aVar2.a() - aVar.a()) / a2;
        float b = (aVar2.b() - aVar.b()) / a2;
        float a4 = aVar.a();
        float b2 = aVar.b();
        boolean b3 = this.a.b(aVar.a(), aVar.b());
        int i = 0;
        for (int i2 = 0; i2 < a2; i2++) {
            a4 += a3;
            b2 += b;
            if (this.a.b(sz.a(a4), sz.a(b2)) != b3) {
                i++;
            }
        }
        float f = i / a2;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == b3 ? 1 : -1;
        }
        return 0;
    }

    private a b() {
        hw c;
        hw hwVar;
        hw hwVar2;
        hw hwVar3;
        hw c2;
        hw c3;
        hw c4;
        hw c5;
        try {
            hw[] a2 = new tz(this.a).a();
            hwVar2 = a2[0];
            hwVar3 = a2[1];
            hwVar = a2[2];
            c = a2[3];
        } catch (aw unused) {
            int h = this.a.h() / 2;
            int c6 = this.a.c() / 2;
            int i = h + 7;
            int i2 = c6 - 7;
            hw c7 = a(new a(i, i2), false, 1, -1).c();
            int i3 = c6 + 7;
            hw c8 = a(new a(i, i3), false, 1, 1).c();
            int i4 = h - 7;
            hw c9 = a(new a(i4, i3), false, -1, 1).c();
            c = a(new a(i4, i2), false, -1, -1).c();
            hwVar = c9;
            hwVar2 = c7;
            hwVar3 = c8;
        }
        int a3 = sz.a((((hwVar2.a() + c.a()) + hwVar3.a()) + hwVar.a()) / 4.0f);
        int a4 = sz.a((((hwVar2.b() + c.b()) + hwVar3.b()) + hwVar.b()) / 4.0f);
        try {
            hw[] a5 = new tz(this.a, 15, a3, a4).a();
            c2 = a5[0];
            c3 = a5[1];
            c4 = a5[2];
            c5 = a5[3];
        } catch (aw unused2) {
            int i5 = a3 + 7;
            int i6 = a4 - 7;
            c2 = a(new a(i5, i6), false, 1, -1).c();
            int i7 = a4 + 7;
            c3 = a(new a(i5, i7), false, 1, 1).c();
            int i8 = a3 - 7;
            c4 = a(new a(i8, i7), false, -1, 1).c();
            c5 = a(new a(i8, i6), false, -1, -1).c();
        }
        return new a(sz.a((((c2.a() + c5.a()) + c3.a()) + c4.a()) / 4.0f), sz.a((((c2.b() + c5.b()) + c3.b()) + c4.b()) / 4.0f));
    }

    private hw[] b(hw[] hwVarArr) {
        return a(hwVarArr, this.e * 2, a());
    }

    public jw a(boolean z) {
        hw[] a2 = a(b());
        if (z) {
            hw hwVar = a2[0];
            a2[0] = a2[2];
            a2[2] = hwVar;
        }
        a(a2);
        hz hzVar = this.a;
        int i = this.f;
        return new jw(a(hzVar, a2[i % 4], a2[(i + 1) % 4], a2[(i + 2) % 4], a2[(i + 3) % 4]), b(a2), this.b, this.d, this.c);
    }
}
