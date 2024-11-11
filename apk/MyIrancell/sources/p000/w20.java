package p000;

/* loaded from: classes.dex */
final class w20 {

    /* renamed from: a */
    private final C2571hz f13735a;

    /* renamed from: b */
    private f30 f13736b;

    /* renamed from: c */
    private c30 f13737c;

    /* renamed from: d */
    private boolean f13738d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w20(C2571hz c2571hz) {
        int m12297c = c2571hz.m12297c();
        if (m12297c < 21 || (m12297c & 3) != 1) {
            throw C3452xv.m16518a();
        }
        this.f13735a = c2571hz;
    }

    /* renamed from: a */
    private int m16112a(int i, int i2, int i3) {
        return this.f13738d ? this.f13735a.m12295b(i2, i) : this.f13735a.m12295b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16113a() {
        int i = 0;
        while (i < this.f13735a.m12300h()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f13735a.m12297c(); i3++) {
                if (this.f13735a.m12295b(i, i3) != this.f13735a.m12295b(i3, i)) {
                    this.f13735a.m12291a(i3, i);
                    this.f13735a.m12291a(i, i3);
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16114a(boolean z) {
        this.f13736b = null;
        this.f13737c = null;
        this.f13738d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] m16115b() {
        c30 m16116c = m16116c();
        f30 m16117d = m16117d();
        y20 m16560a = y20.m16560a(m16116c.m3548a());
        int m12297c = this.f13735a.m12297c();
        m16560a.m16561a(this.f13735a, m12297c);
        C2571hz m11678a = m16117d.m11678a();
        byte[] bArr = new byte[m16117d.m11681d()];
        int i = m12297c - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < m12297c; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!m11678a.m12295b(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f13735a.m12295b(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == m16117d.m11681d()) {
            return bArr;
        }
        throw C3452xv.m16518a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public c30 m16116c() {
        c30 c30Var = this.f13737c;
        if (c30Var != null) {
            return c30Var;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m16112a(i3, 8, i2);
        }
        int m16112a = m16112a(8, 7, m16112a(8, 8, m16112a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            m16112a = m16112a(8, i4, m16112a);
        }
        int m12297c = this.f13735a.m12297c();
        int i5 = m12297c - 7;
        for (int i6 = m12297c - 1; i6 >= i5; i6--) {
            i = m16112a(8, i6, i);
        }
        for (int i7 = m12297c - 8; i7 < m12297c; i7++) {
            i = m16112a(i7, 8, i);
        }
        c30 m3545a = c30.m3545a(m16112a, i);
        this.f13737c = m3545a;
        if (m3545a != null) {
            return m3545a;
        }
        throw C3452xv.m16518a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public f30 m16117d() {
        f30 f30Var = this.f13736b;
        if (f30Var != null) {
            return f30Var;
        }
        int m12297c = this.f13735a.m12297c();
        int i = (m12297c - 17) / 4;
        if (i <= 6) {
            return f30.m11675c(i);
        }
        int i2 = m12297c - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = m12297c - 9; i6 >= i2; i6--) {
                i4 = m16112a(i6, i5, i4);
            }
        }
        f30 m11673a = f30.m11673a(i4);
        if (m11673a != null && m11673a.m11680c() == m12297c) {
            this.f13736b = m11673a;
            return m11673a;
        }
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = m12297c - 9; i8 >= i2; i8--) {
                i3 = m16112a(i7, i8, i3);
            }
        }
        f30 m11673a2 = f30.m11673a(i3);
        if (m11673a2 == null || m11673a2.m11680c() != m12297c) {
            throw C3452xv.m16518a();
        }
        this.f13736b = m11673a2;
        return m11673a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m16118e() {
        c30 c30Var = this.f13737c;
        if (c30Var == null) {
            return;
        }
        y20.m16560a(c30Var.m3548a()).m16561a(this.f13735a, this.f13735a.m12297c());
    }
}
