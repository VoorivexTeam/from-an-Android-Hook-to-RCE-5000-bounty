package defpackage;

/* loaded from: classes.dex */
final class w20 {
    private final hz a;
    private f30 b;
    private c30 c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w20(hz hzVar) {
        int c = hzVar.c();
        if (c < 21 || (c & 3) != 1) {
            throw xv.a();
        }
        this.a = hzVar;
    }

    private int a(int i, int i2, int i3) {
        return this.d ? this.a.b(i2, i) : this.a.b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int i = 0;
        while (i < this.a.h()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.a.c(); i3++) {
                if (this.a.b(i, i3) != this.a.b(i3, i)) {
                    this.a.a(i3, i);
                    this.a.a(i, i3);
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.b = null;
        this.c = null;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] b() {
        c30 c = c();
        f30 d = d();
        y20 a = y20.a(c.a());
        int c2 = this.a.c();
        a.a(this.a, c2);
        hz a2 = d.a();
        byte[] bArr = new byte[d.d()];
        int i = c2 - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < c2; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a2.b(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.a.b(i9, i7)) {
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
        if (i3 == d.d()) {
            return bArr;
        }
        throw xv.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c30 c() {
        c30 c30Var = this.c;
        if (c30Var != null) {
            return c30Var;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = a(i3, 8, i2);
        }
        int a = a(8, 7, a(8, 8, a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = a(8, i4, a);
        }
        int c = this.a.c();
        int i5 = c - 7;
        for (int i6 = c - 1; i6 >= i5; i6--) {
            i = a(8, i6, i);
        }
        for (int i7 = c - 8; i7 < c; i7++) {
            i = a(i7, 8, i);
        }
        c30 a2 = c30.a(a, i);
        this.c = a2;
        if (a2 != null) {
            return a2;
        }
        throw xv.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f30 d() {
        f30 f30Var = this.b;
        if (f30Var != null) {
            return f30Var;
        }
        int c = this.a.c();
        int i = (c - 17) / 4;
        if (i <= 6) {
            return f30.c(i);
        }
        int i2 = c - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = c - 9; i6 >= i2; i6--) {
                i4 = a(i6, i5, i4);
            }
        }
        f30 a = f30.a(i4);
        if (a != null && a.c() == c) {
            this.b = a;
            return a;
        }
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = c - 9; i8 >= i2; i8--) {
                i3 = a(i7, i8, i3);
            }
        }
        f30 a2 = f30.a(i3);
        if (a2 == null || a2.c() != c) {
            throw xv.a();
        }
        this.b = a2;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        c30 c30Var = this.c;
        if (c30Var == null) {
            return;
        }
        y20.a(c30Var.a()).a(this.a, this.a.c());
    }
}
