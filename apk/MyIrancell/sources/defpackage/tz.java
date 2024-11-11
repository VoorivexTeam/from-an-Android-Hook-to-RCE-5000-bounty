package defpackage;

/* loaded from: classes.dex */
public final class tz {
    private final hz a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public tz(hz hzVar) {
        this(hzVar, 10, hzVar.h() / 2, hzVar.c() / 2);
    }

    public tz(hz hzVar, int i, int i2, int i3) {
        this.a = hzVar;
        this.b = hzVar.c();
        int h = hzVar.h();
        this.c = h;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.d = i5;
        int i6 = i2 + i4;
        this.e = i6;
        int i7 = i3 - i4;
        this.g = i7;
        int i8 = i3 + i4;
        this.f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= this.b || i6 >= h) {
            throw aw.a();
        }
    }

    private hw a(float f, float f2, float f3, float f4) {
        int a = sz.a(sz.a(f, f2, f3, f4));
        float f5 = a;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < a; i++) {
            float f8 = i;
            int a2 = sz.a((f8 * f6) + f);
            int a3 = sz.a((f8 * f7) + f2);
            if (this.a.b(a2, a3)) {
                return new hw(a2, a3);
            }
        }
        return null;
    }

    private boolean a(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.a.b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.a.b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    private hw[] a(hw hwVar, hw hwVar2, hw hwVar3, hw hwVar4) {
        float a = hwVar.a();
        float b = hwVar.b();
        float a2 = hwVar2.a();
        float b2 = hwVar2.b();
        float a3 = hwVar3.a();
        float b3 = hwVar3.b();
        float a4 = hwVar4.a();
        float b4 = hwVar4.b();
        return a < ((float) this.c) / 2.0f ? new hw[]{new hw(a4 - 1.0f, b4 + 1.0f), new hw(a2 + 1.0f, b2 + 1.0f), new hw(a3 - 1.0f, b3 - 1.0f), new hw(a + 1.0f, b - 1.0f)} : new hw[]{new hw(a4 + 1.0f, b4 + 1.0f), new hw(a2 + 1.0f, b2 - 1.0f), new hw(a3 - 1.0f, b3 + 1.0f), new hw(a - 1.0f, b - 1.0f)};
    }

    public hw[] a() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.g;
        int i4 = this.f;
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
                if ((z8 || !z3) && i2 < this.c) {
                    z8 = a(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 < this.c) {
                boolean z10 = true;
                while (true) {
                    if ((z10 || !z4) && i4 < this.b) {
                        z10 = a(i, i2, i4, true);
                        if (z10) {
                            i4++;
                            z4 = true;
                            z9 = true;
                        } else if (!z4) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.b) {
                    boolean z11 = true;
                    while (true) {
                        if ((z11 || !z5) && i >= 0) {
                            z11 = a(i3, i4, i, false);
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
                                z12 = a(i, i2, i3, true);
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
            throw aw.a();
        }
        int i5 = i2 - i;
        hw hwVar = null;
        hw hwVar2 = null;
        for (int i6 = 1; i6 < i5; i6++) {
            hwVar2 = a(i, i4 - i6, i + i6, i4);
            if (hwVar2 != null) {
                break;
            }
        }
        if (hwVar2 == null) {
            throw aw.a();
        }
        hw hwVar3 = null;
        for (int i7 = 1; i7 < i5; i7++) {
            hwVar3 = a(i, i3 + i7, i + i7, i3);
            if (hwVar3 != null) {
                break;
            }
        }
        if (hwVar3 == null) {
            throw aw.a();
        }
        hw hwVar4 = null;
        for (int i8 = 1; i8 < i5; i8++) {
            hwVar4 = a(i2, i3 + i8, i2 - i8, i3);
            if (hwVar4 != null) {
                break;
            }
        }
        if (hwVar4 == null) {
            throw aw.a();
        }
        for (int i9 = 1; i9 < i5; i9++) {
            hwVar = a(i2, i4 - i9, i2 - i9, i4);
            if (hwVar != null) {
                break;
            }
        }
        if (hwVar != null) {
            return a(hwVar, hwVar2, hwVar4, hwVar3);
        }
        throw aw.a();
    }
}
