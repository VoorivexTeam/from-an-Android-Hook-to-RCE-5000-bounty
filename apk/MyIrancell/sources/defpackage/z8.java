package defpackage;

import com.airbnb.lottie.d;
import defpackage.k9;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z8 {
    private static k9.a a = k9.a.a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g7 a(k9 k9Var, d dVar) {
        String str = null;
        j6 j6Var = null;
        j6 j6Var2 = null;
        t6 t6Var = null;
        boolean z = false;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                str = k9Var.m();
            } else if (a2 == 1) {
                j6Var = b8.a(k9Var, dVar, false);
            } else if (a2 == 2) {
                j6Var2 = b8.a(k9Var, dVar, false);
            } else if (a2 == 3) {
                t6Var = a8.a(k9Var, dVar);
            } else if (a2 != 4) {
                k9Var.o();
            } else {
                z = k9Var.i();
            }
        }
        return new g7(str, j6Var, j6Var2, t6Var, z);
    }
}
