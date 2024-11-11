package p000;

/* loaded from: classes.dex */
final class n20 extends m20 {

    /* renamed from: c */
    private final boolean f12211c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n20(i20 i20Var, boolean z) {
        super(i20Var);
        this.f12211c = z;
    }

    /* renamed from: a */
    private void m14225a(j20[] j20VarArr, g20 g20Var) {
        for (int i = 0; i < j20VarArr.length; i++) {
            j20 j20Var = j20VarArr[i];
            if (j20VarArr[i] != null) {
                int m13351e = j20Var.m13351e() % 30;
                int m13349c = j20Var.m13349c();
                if (m13349c > g20Var.m11873c()) {
                    j20VarArr[i] = null;
                } else {
                    if (!this.f12211c) {
                        m13349c += 2;
                    }
                    int i2 = m13349c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && m13351e + 1 != g20Var.m11871a()) {
                                j20VarArr[i] = null;
                            }
                        } else if (m13351e / 3 != g20Var.m11872b() || m13351e % 3 != g20Var.m11874d()) {
                            j20VarArr[i] = null;
                        }
                    } else if ((m13351e * 3) + 1 != g20Var.m11875e()) {
                        j20VarArr[i] = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m14226a(g20 g20Var) {
        j20[] m14003b = m14003b();
        m14231f();
        m14225a(m14003b, g20Var);
        i20 m13999a = m13999a();
        C2568hw m12333g = this.f12211c ? m13999a.m12333g() : m13999a.m12334h();
        C2568hw m12326a = this.f12211c ? m13999a.m12326a() : m13999a.m12328b();
        int m14004c = m14004c((int) m12333g.m12249b());
        int m14004c2 = m14004c((int) m12326a.m12249b());
        float m11873c = (m14004c2 - m14004c) / g20Var.m11873c();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (m14004c < m14004c2) {
            if (m14003b[m14004c] != null) {
                j20 j20Var = m14003b[m14004c];
                int m13349c = j20Var.m13349c() - i;
                if (m13349c == 0) {
                    i2++;
                } else {
                    if (m13349c == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (m13349c < 0 || j20Var.m13349c() >= g20Var.m11873c() || m13349c > m14004c) {
                        m14003b[m14004c] = null;
                    } else {
                        if (i3 > 2) {
                            m13349c *= i3 - 2;
                        }
                        boolean z = m13349c >= m14004c;
                        for (int i4 = 1; i4 <= m13349c && !z; i4++) {
                            z = m14003b[m14004c - i4] != null;
                        }
                        if (z) {
                            m14003b[m14004c] = null;
                        }
                    }
                    i = j20Var.m13349c();
                    i2 = 1;
                }
            }
            m14004c++;
        }
        double d = m11873c;
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    /* renamed from: b */
    int m14227b(g20 g20Var) {
        i20 m13999a = m13999a();
        C2568hw m12333g = this.f12211c ? m13999a.m12333g() : m13999a.m12334h();
        C2568hw m12326a = this.f12211c ? m13999a.m12326a() : m13999a.m12328b();
        int m14004c = m14004c((int) m12333g.m12249b());
        int m14004c2 = m14004c((int) m12326a.m12249b());
        float m11873c = (m14004c2 - m14004c) / g20Var.m11873c();
        j20[] m14003b = m14003b();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (m14004c < m14004c2) {
            if (m14003b[m14004c] != null) {
                j20 j20Var = m14003b[m14004c];
                j20Var.m13354h();
                int m13349c = j20Var.m13349c() - i;
                if (m13349c == 0) {
                    i2++;
                } else {
                    if (m13349c == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (j20Var.m13349c() >= g20Var.m11873c()) {
                        m14003b[m14004c] = null;
                    }
                    i = j20Var.m13349c();
                    i2 = 1;
                }
            }
            m14004c++;
        }
        double d = m11873c;
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public g20 m14228c() {
        j20[] m14003b = m14003b();
        h20 h20Var = new h20();
        h20 h20Var2 = new h20();
        h20 h20Var3 = new h20();
        h20 h20Var4 = new h20();
        for (j20 j20Var : m14003b) {
            if (j20Var != null) {
                j20Var.m13354h();
                int m13351e = j20Var.m13351e() % 30;
                int m13349c = j20Var.m13349c();
                if (!this.f12211c) {
                    m13349c += 2;
                }
                int i = m13349c % 3;
                if (i == 0) {
                    h20Var2.m12085a((m13351e * 3) + 1);
                } else if (i == 1) {
                    h20Var4.m12085a(m13351e / 3);
                    h20Var3.m12085a(m13351e % 3);
                } else if (i == 2) {
                    h20Var.m12085a(m13351e + 1);
                }
            }
        }
        if (h20Var.m12086a().length == 0 || h20Var2.m12086a().length == 0 || h20Var3.m12086a().length == 0 || h20Var4.m12086a().length == 0 || h20Var.m12086a()[0] < 1 || h20Var2.m12086a()[0] + h20Var3.m12086a()[0] < 3 || h20Var2.m12086a()[0] + h20Var3.m12086a()[0] > 90) {
            return null;
        }
        g20 g20Var = new g20(h20Var.m12086a()[0], h20Var2.m12086a()[0], h20Var3.m12086a()[0], h20Var4.m12086a()[0]);
        m14225a(m14003b, g20Var);
        return g20Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int[] m14229d() {
        g20 m14228c = m14228c();
        if (m14228c == null) {
            return null;
        }
        m14227b(m14228c);
        int m11873c = m14228c.m11873c();
        int[] iArr = new int[m11873c];
        for (j20 j20Var : m14003b()) {
            if (j20Var != null) {
                int m13349c = j20Var.m13349c();
                if (m13349c >= m11873c) {
                    throw C3452xv.m16518a();
                }
                iArr[m13349c] = iArr[m13349c] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m14230e() {
        return this.f12211c;
    }

    /* renamed from: f */
    void m14231f() {
        for (j20 j20Var : m14003b()) {
            if (j20Var != null) {
                j20Var.m13354h();
            }
        }
    }

    @Override // p000.m20
    public String toString() {
        return "IsLeft: " + this.f12211c + '\n' + super.toString();
    }
}
