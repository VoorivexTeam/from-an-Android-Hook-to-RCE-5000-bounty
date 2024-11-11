package defpackage;

import java.util.Formatter;

/* loaded from: classes.dex */
final class l20 {
    private final g20 a;
    private final m20[] b;
    private i20 c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l20(g20 g20Var, i20 i20Var) {
        this.a = g20Var;
        int a = g20Var.a();
        this.d = a;
        this.c = i20Var;
        this.b = new m20[a + 2];
    }

    private static int a(int i, int i2, j20 j20Var) {
        if (j20Var == null || j20Var.g()) {
            return i2;
        }
        if (!j20Var.a(i)) {
            return i2 + 1;
        }
        j20Var.b(i);
        return 0;
    }

    private void a(int i, int i2, j20[] j20VarArr) {
        j20 j20Var = j20VarArr[i2];
        j20[] b = this.b[i - 1].b();
        m20[] m20VarArr = this.b;
        int i3 = i + 1;
        j20[] b2 = m20VarArr[i3] != null ? m20VarArr[i3].b() : b;
        j20[] j20VarArr2 = new j20[14];
        j20VarArr2[2] = b[i2];
        j20VarArr2[3] = b2[i2];
        if (i2 > 0) {
            int i4 = i2 - 1;
            j20VarArr2[0] = j20VarArr[i4];
            j20VarArr2[4] = b[i4];
            j20VarArr2[5] = b2[i4];
        }
        if (i2 > 1) {
            int i5 = i2 - 2;
            j20VarArr2[8] = j20VarArr[i5];
            j20VarArr2[10] = b[i5];
            j20VarArr2[11] = b2[i5];
        }
        if (i2 < j20VarArr.length - 1) {
            int i6 = i2 + 1;
            j20VarArr2[1] = j20VarArr[i6];
            j20VarArr2[6] = b[i6];
            j20VarArr2[7] = b2[i6];
        }
        if (i2 < j20VarArr.length - 2) {
            int i7 = i2 + 2;
            j20VarArr2[9] = j20VarArr[i7];
            j20VarArr2[12] = b[i7];
            j20VarArr2[13] = b2[i7];
        }
        for (int i8 = 0; i8 < 14 && !a(j20Var, j20VarArr2[i8]); i8++) {
        }
    }

    private void a(m20 m20Var) {
        if (m20Var != null) {
            ((n20) m20Var).a(this.a);
        }
    }

    private static boolean a(j20 j20Var, j20 j20Var2) {
        if (j20Var2 == null || !j20Var2.g() || j20Var2.a() != j20Var.a()) {
            return false;
        }
        j20Var.b(j20Var2.c());
        return true;
    }

    private int f() {
        int g = g();
        if (g == 0) {
            return 0;
        }
        for (int i = 1; i < this.d + 1; i++) {
            j20[] b = this.b[i].b();
            for (int i2 = 0; i2 < b.length; i2++) {
                if (b[i2] != null && !b[i2].g()) {
                    a(i, i2, b);
                }
            }
        }
        return g;
    }

    private int g() {
        h();
        return i() + j();
    }

    private void h() {
        m20[] m20VarArr = this.b;
        if (m20VarArr[0] == null || m20VarArr[this.d + 1] == null) {
            return;
        }
        j20[] b = m20VarArr[0].b();
        j20[] b2 = this.b[this.d + 1].b();
        for (int i = 0; i < b.length; i++) {
            if (b[i] != null && b2[i] != null && b[i].c() == b2[i].c()) {
                for (int i2 = 1; i2 <= this.d; i2++) {
                    j20 j20Var = this.b[i2].b()[i];
                    if (j20Var != null) {
                        j20Var.b(b[i].c());
                        if (!j20Var.g()) {
                            this.b[i2].b()[i] = null;
                        }
                    }
                }
            }
        }
    }

    private int i() {
        m20[] m20VarArr = this.b;
        if (m20VarArr[0] == null) {
            return 0;
        }
        j20[] b = m20VarArr[0].b();
        int i = 0;
        for (int i2 = 0; i2 < b.length; i2++) {
            if (b[i2] != null) {
                int c = b[i2].c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.d + 1 && i3 < 2; i4++) {
                    j20 j20Var = this.b[i4].b()[i2];
                    if (j20Var != null) {
                        i3 = a(c, i3, j20Var);
                        if (!j20Var.g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    private int j() {
        m20[] m20VarArr = this.b;
        int i = this.d;
        if (m20VarArr[i + 1] == null) {
            return 0;
        }
        j20[] b = m20VarArr[i + 1].b();
        int i2 = 0;
        for (int i3 = 0; i3 < b.length; i3++) {
            if (b[i3] != null) {
                int c = b[i3].c();
                int i4 = 0;
                for (int i5 = this.d + 1; i5 > 0 && i4 < 2; i5--) {
                    j20 j20Var = this.b[i5].b()[i3];
                    if (j20Var != null) {
                        i4 = a(c, i4, j20Var);
                        if (!j20Var.g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m20 a(int i) {
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, m20 m20Var) {
        this.b[i] = m20Var;
    }

    public void a(i20 i20Var) {
        this.c = i20Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i20 d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m20[] e() {
        a(this.b[0]);
        a(this.b[this.d + 1]);
        int i = 928;
        while (true) {
            int f = f();
            if (f <= 0 || f >= i) {
                break;
            }
            i = f;
        }
        return this.b;
    }

    public String toString() {
        m20[] m20VarArr = this.b;
        m20 m20Var = m20VarArr[0];
        if (m20Var == null) {
            m20Var = m20VarArr[this.d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < m20Var.b().length; i++) {
            formatter.format("CW %3d:", Integer.valueOf(i));
            for (int i2 = 0; i2 < this.d + 2; i2++) {
                m20[] m20VarArr2 = this.b;
                if (m20VarArr2[i2] == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    j20 j20Var = m20VarArr2[i2].b()[i];
                    if (j20Var == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", Integer.valueOf(j20Var.c()), Integer.valueOf(j20Var.e()));
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
