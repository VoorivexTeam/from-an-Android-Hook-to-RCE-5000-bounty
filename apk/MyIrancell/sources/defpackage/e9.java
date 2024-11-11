package defpackage;

import com.airbnb.lottie.d;
import defpackage.k9;

/* loaded from: classes.dex */
class e9 {
    static k9.a a = k9.a.a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k7 a(k9 k9Var, d dVar) {
        int i = 0;
        String str = null;
        p6 p6Var = null;
        boolean z = false;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                str = k9Var.m();
            } else if (a2 == 1) {
                i = k9Var.k();
            } else if (a2 == 2) {
                p6Var = b8.g(k9Var, dVar);
            } else if (a2 != 3) {
                k9Var.o();
            } else {
                z = k9Var.i();
            }
        }
        return new k7(str, i, p6Var, z);
    }
}
