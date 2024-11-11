package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.d;
import defpackage.k9;

/* loaded from: classes.dex */
class c8 {
    private static k9.a a = k9.a.a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w6 a(k9 k9Var, d dVar, int i) {
        boolean z = i == 3;
        String str = null;
        u6<PointF, PointF> u6Var = null;
        n6 n6Var = null;
        boolean z2 = false;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                str = k9Var.m();
            } else if (a2 == 1) {
                u6Var = y7.b(k9Var, dVar);
            } else if (a2 == 2) {
                n6Var = b8.e(k9Var, dVar);
            } else if (a2 == 3) {
                z2 = k9Var.i();
            } else if (a2 != 4) {
                k9Var.n();
                k9Var.o();
            } else {
                z = k9Var.k() == 3;
            }
        }
        return new w6(str, u6Var, n6Var, z, z2);
    }
}
