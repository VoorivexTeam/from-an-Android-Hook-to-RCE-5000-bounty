package defpackage;

import java.util.Formatter;

/* loaded from: classes.dex */
class m20 {
    private final i20 a;
    private final j20[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m20(i20 i20Var) {
        this.a = new i20(i20Var);
        this.b = new j20[(i20Var.d() - i20Var.f()) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final i20 a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j20 a(int i) {
        return this.b[c(i)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, j20 j20Var) {
        this.b[c(i)] = j20Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j20 b(int i) {
        j20 j20Var;
        j20 j20Var2;
        j20 a = a(i);
        if (a != null) {
            return a;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int c = c(i) - i2;
            if (c >= 0 && (j20Var2 = this.b[c]) != null) {
                return j20Var2;
            }
            int c2 = c(i) + i2;
            j20[] j20VarArr = this.b;
            if (c2 < j20VarArr.length && (j20Var = j20VarArr[c2]) != null) {
                return j20Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j20[] b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(int i) {
        return i - this.a.f();
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i = 0;
        for (j20 j20Var : this.b) {
            if (j20Var == null) {
                formatter.format("%3d:    |   %n", Integer.valueOf(i));
                i++;
            } else {
                formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(j20Var.c()), Integer.valueOf(j20Var.e()));
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
