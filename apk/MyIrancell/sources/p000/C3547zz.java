package p000;

/* renamed from: zz */
/* loaded from: classes.dex */
final class C3547zz {

    /* renamed from: a */
    private final C2571hz f14544a;

    /* renamed from: b */
    private final C2571hz f14545b;

    /* renamed from: c */
    private final d00 f14546c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3547zz(C2571hz c2571hz) {
        int m12297c = c2571hz.m12297c();
        if (m12297c < 8 || m12297c > 144 || (m12297c & 1) != 0) {
            throw C3452xv.m16518a();
        }
        this.f14546c = m16968b(c2571hz);
        C2571hz m16971a = m16971a(c2571hz);
        this.f14544a = m16971a;
        this.f14545b = new C2571hz(m16971a.m12300h(), this.f14544a.m12297c());
    }

    /* renamed from: b */
    private static d00 m16968b(C2571hz c2571hz) {
        return d00.m11230a(c2571hz.m12297c(), c2571hz.m12300h());
    }

    /* renamed from: a */
    int m16969a(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m16972a(i3, 0, i, i2) ? 1 : 0) << 1;
        if (m16972a(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m16972a(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m16972a(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m16972a(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m16972a(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m16972a(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m16972a(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public d00 m16970a() {
        return this.f14546c;
    }

    /* renamed from: a */
    C2571hz m16971a(C2571hz c2571hz) {
        int m11236e = this.f14546c.m11236e();
        int m11235d = this.f14546c.m11235d();
        if (c2571hz.m12297c() != m11236e) {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int m11233b = this.f14546c.m11233b();
        int m11232a = this.f14546c.m11232a();
        int i = m11236e / m11233b;
        int i2 = m11235d / m11232a;
        C2571hz c2571hz2 = new C2571hz(i2 * m11232a, i * m11233b);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * m11233b;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i5 * m11232a;
                for (int i7 = 0; i7 < m11233b; i7++) {
                    int i8 = ((m11233b + 2) * i3) + 1 + i7;
                    int i9 = i4 + i7;
                    for (int i10 = 0; i10 < m11232a; i10++) {
                        if (c2571hz.m12295b(((m11232a + 2) * i5) + 1 + i10, i8)) {
                            c2571hz2.m12298c(i6 + i10, i9);
                        }
                    }
                }
            }
        }
        return c2571hz2;
    }

    /* renamed from: a */
    boolean m16972a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f14545b.m12298c(i2, i);
        return this.f14544a.m12295b(i2, i);
    }

    /* renamed from: b */
    int m16973b(int i, int i2) {
        int i3 = (m16972a(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m16972a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m16972a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m16972a(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m16972a(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m16972a(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m16972a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m16972a(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: b */
    int m16974b(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m16972a(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (m16972a(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m16972a(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m16972a(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m16972a(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m16972a(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m16972a(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m16972a(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] m16975b() {
        byte[] bArr = new byte[this.f14546c.m11237f()];
        int m12297c = this.f14544a.m12297c();
        int m12300h = this.f14544a.m12300h();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == m12297c && i == 0 && !z) {
                bArr[i2] = (byte) m16969a(m12297c, m12300h);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = m12297c - 2;
                if (i3 == i4 && i == 0 && (m12300h & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m16973b(m12297c, m12300h);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == m12297c + 4 && i == 2 && (m12300h & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m16976c(m12297c, m12300h);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (m12300h & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m16977d(m12297c, m12300h);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < m12297c && i >= 0 && !this.f14545b.m12295b(i, i3)) {
                            bArr[i2] = (byte) m16974b(i3, i, m12297c, m12300h);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < m12300h);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < m12300h && !this.f14545b.m12295b(i6, i5)) {
                            bArr[i2] = (byte) m16974b(i5, i6, m12297c, m12300h);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= m12297c) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= m12297c && i >= m12300h) {
                break;
            }
        }
        if (i2 == this.f14546c.m11237f()) {
            return bArr;
        }
        throw C3452xv.m16518a();
    }

    /* renamed from: c */
    int m16976c(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m16972a(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (m16972a(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m16972a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m16972a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m16972a(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m16972a(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m16972a(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m16972a(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: d */
    int m16977d(int i, int i2) {
        int i3 = (m16972a(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m16972a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m16972a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m16972a(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m16972a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m16972a(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m16972a(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m16972a(3, i7, i, i2) ? i10 | 1 : i10;
    }
}
