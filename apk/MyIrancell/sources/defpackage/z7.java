package defpackage;

import com.airbnb.lottie.d;
import defpackage.k9;

/* loaded from: classes.dex */
public class z7 {
    private static k9.a a = k9.a.a("a");
    private static k9.a b = k9.a.a("fc", "sc", "sw", "t");

    public static s6 a(k9 k9Var, d dVar) {
        k9Var.c();
        s6 s6Var = null;
        while (k9Var.h()) {
            if (k9Var.a(a) != 0) {
                k9Var.n();
                k9Var.o();
            } else {
                s6Var = b(k9Var, dVar);
            }
        }
        k9Var.e();
        return s6Var == null ? new s6(null, null, null, null) : s6Var;
    }

    private static s6 b(k9 k9Var, d dVar) {
        k9Var.c();
        i6 i6Var = null;
        i6 i6Var2 = null;
        j6 j6Var = null;
        j6 j6Var2 = null;
        while (k9Var.h()) {
            int a2 = k9Var.a(b);
            if (a2 == 0) {
                i6Var = b8.a(k9Var, dVar);
            } else if (a2 == 1) {
                i6Var2 = b8.a(k9Var, dVar);
            } else if (a2 == 2) {
                j6Var = b8.c(k9Var, dVar);
            } else if (a2 != 3) {
                k9Var.n();
                k9Var.o();
            } else {
                j6Var2 = b8.c(k9Var, dVar);
            }
        }
        k9Var.e();
        return new s6(i6Var, i6Var2, j6Var, j6Var2);
    }
}
