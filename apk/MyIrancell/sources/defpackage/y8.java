package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.d;
import defpackage.k9;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y8 {
    private static k9.a a = k9.a.a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f7 a(k9 k9Var, d dVar) {
        String str = null;
        u6<PointF, PointF> u6Var = null;
        n6 n6Var = null;
        j6 j6Var = null;
        boolean z = false;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                str = k9Var.m();
            } else if (a2 == 1) {
                u6Var = y7.b(k9Var, dVar);
            } else if (a2 == 2) {
                n6Var = b8.e(k9Var, dVar);
            } else if (a2 == 3) {
                j6Var = b8.c(k9Var, dVar);
            } else if (a2 != 4) {
                k9Var.o();
            } else {
                z = k9Var.i();
            }
        }
        return new f7(str, u6Var, n6Var, j6Var, z);
    }
}
