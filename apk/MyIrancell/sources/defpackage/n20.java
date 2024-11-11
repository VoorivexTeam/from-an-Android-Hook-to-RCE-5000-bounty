package defpackage;

/* loaded from: classes.dex */
final class n20 extends m20 {
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n20(i20 i20Var, boolean z) {
        super(i20Var);
        this.c = z;
    }

    private void a(j20[] j20VarArr, g20 g20Var) {
        for (int i = 0; i < j20VarArr.length; i++) {
            j20 j20Var = j20VarArr[i];
            if (j20VarArr[i] != null) {
                int e = j20Var.e() % 30;
                int c = j20Var.c();
                if (c > g20Var.c()) {
                    j20VarArr[i] = null;
                } else {
                    if (!this.c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != g20Var.a()) {
                                j20VarArr[i] = null;
                            }
                        } else if (e / 3 != g20Var.b() || e % 3 != g20Var.d()) {
                            j20VarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != g20Var.e()) {
                        j20VarArr[i] = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(g20 g20Var) {
        j20[] b = b();
        f();
        a(b, g20Var);
        i20 a = a();
        hw g = this.c ? a.g() : a.h();
        hw a2 = this.c ? a.a() : a.b();
        int c = c((int) g.b());
        int c2 = c((int) a2.b());
        float c3 = (c2 - c) / g20Var.c();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (c < c2) {
            if (b[c] != null) {
                j20 j20Var = b[c];
                int c4 = j20Var.c() - i;
                if (c4 == 0) {
                    i2++;
                } else {
                    if (c4 == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (c4 < 0 || j20Var.c() >= g20Var.c() || c4 > c) {
                        b[c] = null;
                    } else {
                        if (i3 > 2) {
                            c4 *= i3 - 2;
                        }
                        boolean z = c4 >= c;
                        for (int i4 = 1; i4 <= c4 && !z; i4++) {
                            z = b[c - i4] != null;
                        }
                        if (z) {
                            b[c] = null;
                        }
                    }
                    i = j20Var.c();
                    i2 = 1;
                }
            }
            c++;
        }
        double d = c3;
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    int b(g20 g20Var) {
        i20 a = a();
        hw g = this.c ? a.g() : a.h();
        hw a2 = this.c ? a.a() : a.b();
        int c = c((int) g.b());
        int c2 = c((int) a2.b());
        float c3 = (c2 - c) / g20Var.c();
        j20[] b = b();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (c < c2) {
            if (b[c] != null) {
                j20 j20Var = b[c];
                j20Var.h();
                int c4 = j20Var.c() - i;
                if (c4 == 0) {
                    i2++;
                } else {
                    if (c4 == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (j20Var.c() >= g20Var.c()) {
                        b[c] = null;
                    }
                    i = j20Var.c();
                    i2 = 1;
                }
            }
            c++;
        }
        double d = c3;
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g20 c() {
        j20[] b = b();
        h20 h20Var = new h20();
        h20 h20Var2 = new h20();
        h20 h20Var3 = new h20();
        h20 h20Var4 = new h20();
        for (j20 j20Var : b) {
            if (j20Var != null) {
                j20Var.h();
                int e = j20Var.e() % 30;
                int c = j20Var.c();
                if (!this.c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    h20Var2.a((e * 3) + 1);
                } else if (i == 1) {
                    h20Var4.a(e / 3);
                    h20Var3.a(e % 3);
                } else if (i == 2) {
                    h20Var.a(e + 1);
                }
            }
        }
        if (h20Var.a().length == 0 || h20Var2.a().length == 0 || h20Var3.a().length == 0 || h20Var4.a().length == 0 || h20Var.a()[0] < 1 || h20Var2.a()[0] + h20Var3.a()[0] < 3 || h20Var2.a()[0] + h20Var3.a()[0] > 90) {
            return null;
        }
        g20 g20Var = new g20(h20Var.a()[0], h20Var2.a()[0], h20Var3.a()[0], h20Var4.a()[0]);
        a(b, g20Var);
        return g20Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] d() {
        g20 c = c();
        if (c == null) {
            return null;
        }
        b(c);
        int c2 = c.c();
        int[] iArr = new int[c2];
        for (j20 j20Var : b()) {
            if (j20Var != null) {
                int c3 = j20Var.c();
                if (c3 >= c2) {
                    throw xv.a();
                }
                iArr[c3] = iArr[c3] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.c;
    }

    void f() {
        for (j20 j20Var : b()) {
            if (j20Var != null) {
                j20Var.h();
            }
        }
    }

    @Override // defpackage.m20
    public String toString() {
        return "IsLeft: " + this.c + '\n' + super.toString();
    }
}
