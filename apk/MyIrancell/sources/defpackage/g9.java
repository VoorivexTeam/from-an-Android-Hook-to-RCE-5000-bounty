package defpackage;

import com.airbnb.lottie.d;
import defpackage.k9;
import defpackage.m7;

/* loaded from: classes.dex */
class g9 {
    private static k9.a a = k9.a.a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m7 a(k9 k9Var, d dVar) {
        String str = null;
        m7.a aVar = null;
        j6 j6Var = null;
        j6 j6Var2 = null;
        j6 j6Var3 = null;
        boolean z = false;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                j6Var = b8.a(k9Var, dVar, false);
            } else if (a2 == 1) {
                j6Var2 = b8.a(k9Var, dVar, false);
            } else if (a2 == 2) {
                j6Var3 = b8.a(k9Var, dVar, false);
            } else if (a2 == 3) {
                str = k9Var.m();
            } else if (a2 == 4) {
                aVar = m7.a.forId(k9Var.k());
            } else if (a2 != 5) {
                k9Var.o();
            } else {
                z = k9Var.i();
            }
        }
        return new m7(str, aVar, j6Var, j6Var2, j6Var3, z);
    }
}
