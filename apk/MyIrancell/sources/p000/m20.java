package p000;

import java.util.Formatter;

/* loaded from: classes.dex */
class m20 {

    /* renamed from: a */
    private final i20 f12001a;

    /* renamed from: b */
    private final j20[] f12002b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m20(i20 i20Var) {
        this.f12001a = new i20(i20Var);
        this.f12002b = new j20[(i20Var.m12330d() - i20Var.m12332f()) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final i20 m13999a() {
        return this.f12001a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final j20 m14000a(int i) {
        return this.f12002b[m14004c(i)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m14001a(int i, j20 j20Var) {
        this.f12002b[m14004c(i)] = j20Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final j20 m14002b(int i) {
        j20 j20Var;
        j20 j20Var2;
        j20 m14000a = m14000a(i);
        if (m14000a != null) {
            return m14000a;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int m14004c = m14004c(i) - i2;
            if (m14004c >= 0 && (j20Var2 = this.f12002b[m14004c]) != null) {
                return j20Var2;
            }
            int m14004c2 = m14004c(i) + i2;
            j20[] j20VarArr = this.f12002b;
            if (m14004c2 < j20VarArr.length && (j20Var = j20VarArr[m14004c2]) != null) {
                return j20Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final j20[] m14003b() {
        return this.f12002b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m14004c(int i) {
        return i - this.f12001a.m12332f();
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i = 0;
        for (j20 j20Var : this.f12002b) {
            if (j20Var == null) {
                formatter.format("%3d:    |   %n", Integer.valueOf(i));
                i++;
            } else {
                formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(j20Var.m13349c()), Integer.valueOf(j20Var.m13351e()));
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
