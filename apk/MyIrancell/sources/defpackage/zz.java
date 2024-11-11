package defpackage;

/* loaded from: classes.dex */
final class zz {
    private final hz a;
    private final hz b;
    private final d00 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zz(hz hzVar) {
        int c = hzVar.c();
        if (c < 8 || c > 144 || (c & 1) != 0) {
            throw xv.a();
        }
        this.c = b(hzVar);
        hz a = a(hzVar);
        this.a = a;
        this.b = new hz(a.h(), this.a.c());
    }

    private static d00 b(hz hzVar) {
        return d00.a(hzVar.c(), hzVar.h());
    }

    int a(int i, int i2) {
        int i3 = i - 1;
        int i4 = (a(i3, 0, i, i2) ? 1 : 0) << 1;
        if (a(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (a(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (a(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (a(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (a(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (a(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return a(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d00 a() {
        return this.c;
    }

    hz a(hz hzVar) {
        int e = this.c.e();
        int d = this.c.d();
        if (hzVar.c() != e) {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int b = this.c.b();
        int a = this.c.a();
        int i = e / b;
        int i2 = d / a;
        hz hzVar2 = new hz(i2 * a, i * b);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * b;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i5 * a;
                for (int i7 = 0; i7 < b; i7++) {
                    int i8 = ((b + 2) * i3) + 1 + i7;
                    int i9 = i4 + i7;
                    for (int i10 = 0; i10 < a; i10++) {
                        if (hzVar.b(((a + 2) * i5) + 1 + i10, i8)) {
                            hzVar2.c(i6 + i10, i9);
                        }
                    }
                }
            }
        }
        return hzVar2;
    }

    boolean a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.b.c(i2, i);
        return this.a.b(i2, i);
    }

    int b(int i, int i2) {
        int i3 = (a(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (a(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (a(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (a(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return a(1, i9, i, i2) ? i10 | 1 : i10;
    }

    int b(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (a(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (a(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (a(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (a(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (a(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (a(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (a(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return a(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] b() {
        byte[] bArr = new byte[this.c.f()];
        int c = this.a.c();
        int h = this.a.h();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == c && i == 0 && !z) {
                bArr[i2] = (byte) a(c, h);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = c - 2;
                if (i3 == i4 && i == 0 && (h & 3) != 0 && !z2) {
                    bArr[i2] = (byte) b(c, h);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == c + 4 && i == 2 && (h & 7) == 0 && !z3) {
                    bArr[i2] = (byte) c(c, h);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (h & 7) == 4 && !z4) {
                    bArr[i2] = (byte) d(c, h);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < c && i >= 0 && !this.b.b(i, i3)) {
                            bArr[i2] = (byte) b(i3, i, c, h);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < h);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < h && !this.b.b(i6, i5)) {
                            bArr[i2] = (byte) b(i5, i6, c, h);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= c) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= c && i >= h) {
                break;
            }
        }
        if (i2 == this.c.f()) {
            return bArr;
        }
        throw xv.a();
    }

    int c(int i, int i2) {
        int i3 = i - 1;
        int i4 = (a(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (a(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (a(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (a(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (a(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return a(1, i5, i, i2) ? i13 | 1 : i13;
    }

    int d(int i, int i2) {
        int i3 = (a(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (a(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (a(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (a(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return a(3, i7, i, i2) ? i10 | 1 : i10;
    }
}
