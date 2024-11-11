package p000;

import java.util.Formatter;

/* loaded from: classes.dex */
final class l20 {

    /* renamed from: a */
    private final g20 f11796a;

    /* renamed from: b */
    private final m20[] f11797b;

    /* renamed from: c */
    private i20 f11798c;

    /* renamed from: d */
    private final int f11799d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l20(g20 g20Var, i20 i20Var) {
        this.f11796a = g20Var;
        int m11871a = g20Var.m11871a();
        this.f11799d = m11871a;
        this.f11798c = i20Var;
        this.f11797b = new m20[m11871a + 2];
    }

    /* renamed from: a */
    private static int m13785a(int i, int i2, j20 j20Var) {
        if (j20Var == null || j20Var.m13353g()) {
            return i2;
        }
        if (!j20Var.m13346a(i)) {
            return i2 + 1;
        }
        j20Var.m13348b(i);
        return 0;
    }

    /* renamed from: a */
    private void m13786a(int i, int i2, j20[] j20VarArr) {
        j20 j20Var = j20VarArr[i2];
        j20[] m14003b = this.f11797b[i - 1].m14003b();
        m20[] m20VarArr = this.f11797b;
        int i3 = i + 1;
        j20[] m14003b2 = m20VarArr[i3] != null ? m20VarArr[i3].m14003b() : m14003b;
        j20[] j20VarArr2 = new j20[14];
        j20VarArr2[2] = m14003b[i2];
        j20VarArr2[3] = m14003b2[i2];
        if (i2 > 0) {
            int i4 = i2 - 1;
            j20VarArr2[0] = j20VarArr[i4];
            j20VarArr2[4] = m14003b[i4];
            j20VarArr2[5] = m14003b2[i4];
        }
        if (i2 > 1) {
            int i5 = i2 - 2;
            j20VarArr2[8] = j20VarArr[i5];
            j20VarArr2[10] = m14003b[i5];
            j20VarArr2[11] = m14003b2[i5];
        }
        if (i2 < j20VarArr.length - 1) {
            int i6 = i2 + 1;
            j20VarArr2[1] = j20VarArr[i6];
            j20VarArr2[6] = m14003b[i6];
            j20VarArr2[7] = m14003b2[i6];
        }
        if (i2 < j20VarArr.length - 2) {
            int i7 = i2 + 2;
            j20VarArr2[9] = j20VarArr[i7];
            j20VarArr2[12] = m14003b[i7];
            j20VarArr2[13] = m14003b2[i7];
        }
        for (int i8 = 0; i8 < 14 && !m13788a(j20Var, j20VarArr2[i8]); i8++) {
        }
    }

    /* renamed from: a */
    private void m13787a(m20 m20Var) {
        if (m20Var != null) {
            ((n20) m20Var).m14226a(this.f11796a);
        }
    }

    /* renamed from: a */
    private static boolean m13788a(j20 j20Var, j20 j20Var2) {
        if (j20Var2 == null || !j20Var2.m13353g() || j20Var2.m13345a() != j20Var.m13345a()) {
            return false;
        }
        j20Var.m13348b(j20Var2.m13349c());
        return true;
    }

    /* renamed from: f */
    private int m13789f() {
        int m13790g = m13790g();
        if (m13790g == 0) {
            return 0;
        }
        for (int i = 1; i < this.f11799d + 1; i++) {
            j20[] m14003b = this.f11797b[i].m14003b();
            for (int i2 = 0; i2 < m14003b.length; i2++) {
                if (m14003b[i2] != null && !m14003b[i2].m13353g()) {
                    m13786a(i, i2, m14003b);
                }
            }
        }
        return m13790g;
    }

    /* renamed from: g */
    private int m13790g() {
        m13791h();
        return m13792i() + m13793j();
    }

    /* renamed from: h */
    private void m13791h() {
        m20[] m20VarArr = this.f11797b;
        if (m20VarArr[0] == null || m20VarArr[this.f11799d + 1] == null) {
            return;
        }
        j20[] m14003b = m20VarArr[0].m14003b();
        j20[] m14003b2 = this.f11797b[this.f11799d + 1].m14003b();
        for (int i = 0; i < m14003b.length; i++) {
            if (m14003b[i] != null && m14003b2[i] != null && m14003b[i].m13349c() == m14003b2[i].m13349c()) {
                for (int i2 = 1; i2 <= this.f11799d; i2++) {
                    j20 j20Var = this.f11797b[i2].m14003b()[i];
                    if (j20Var != null) {
                        j20Var.m13348b(m14003b[i].m13349c());
                        if (!j20Var.m13353g()) {
                            this.f11797b[i2].m14003b()[i] = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private int m13792i() {
        m20[] m20VarArr = this.f11797b;
        if (m20VarArr[0] == null) {
            return 0;
        }
        j20[] m14003b = m20VarArr[0].m14003b();
        int i = 0;
        for (int i2 = 0; i2 < m14003b.length; i2++) {
            if (m14003b[i2] != null) {
                int m13349c = m14003b[i2].m13349c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f11799d + 1 && i3 < 2; i4++) {
                    j20 j20Var = this.f11797b[i4].m14003b()[i2];
                    if (j20Var != null) {
                        i3 = m13785a(m13349c, i3, j20Var);
                        if (!j20Var.m13353g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: j */
    private int m13793j() {
        m20[] m20VarArr = this.f11797b;
        int i = this.f11799d;
        if (m20VarArr[i + 1] == null) {
            return 0;
        }
        j20[] m14003b = m20VarArr[i + 1].m14003b();
        int i2 = 0;
        for (int i3 = 0; i3 < m14003b.length; i3++) {
            if (m14003b[i3] != null) {
                int m13349c = m14003b[i3].m13349c();
                int i4 = 0;
                for (int i5 = this.f11799d + 1; i5 > 0 && i4 < 2; i5--) {
                    j20 j20Var = this.f11797b[i5].m14003b()[i3];
                    if (j20Var != null) {
                        i4 = m13785a(m13349c, i4, j20Var);
                        if (!j20Var.m13353g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m13794a() {
        return this.f11799d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public m20 m13795a(int i) {
        return this.f11797b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13796a(int i, m20 m20Var) {
        this.f11797b[i] = m20Var;
    }

    /* renamed from: a */
    public void m13797a(i20 i20Var) {
        this.f11798c = i20Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m13798b() {
        return this.f11796a.m11872b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m13799c() {
        return this.f11796a.m11873c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public i20 m13800d() {
        return this.f11798c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public m20[] m13801e() {
        m13787a(this.f11797b[0]);
        m13787a(this.f11797b[this.f11799d + 1]);
        int i = 928;
        while (true) {
            int m13789f = m13789f();
            if (m13789f <= 0 || m13789f >= i) {
                break;
            }
            i = m13789f;
        }
        return this.f11797b;
    }

    public String toString() {
        m20[] m20VarArr = this.f11797b;
        m20 m20Var = m20VarArr[0];
        if (m20Var == null) {
            m20Var = m20VarArr[this.f11799d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < m20Var.m14003b().length; i++) {
            formatter.format("CW %3d:", Integer.valueOf(i));
            for (int i2 = 0; i2 < this.f11799d + 2; i2++) {
                m20[] m20VarArr2 = this.f11797b;
                if (m20VarArr2[i2] == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    j20 j20Var = m20VarArr2[i2].m14003b()[i];
                    if (j20Var == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", Integer.valueOf(j20Var.m13349c()), Integer.valueOf(j20Var.m13351e()));
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
