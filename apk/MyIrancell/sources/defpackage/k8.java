package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.d;
import defpackage.k9;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k8 {
    private static final k9.a a = k9.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final k9.a b = k9.a.a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z6 a(k9 k9Var, d dVar) {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        b7 b7Var = null;
        k6 k6Var = null;
        l6 l6Var = null;
        n6 n6Var = null;
        n6 n6Var2 = null;
        boolean z = false;
        while (k9Var.h()) {
            switch (k9Var.a(a)) {
                case 0:
                    str = k9Var.m();
                    break;
                case 1:
                    int i = -1;
                    k9Var.c();
                    while (k9Var.h()) {
                        int a2 = k9Var.a(b);
                        if (a2 == 0) {
                            i = k9Var.k();
                        } else if (a2 != 1) {
                            k9Var.n();
                            k9Var.o();
                        } else {
                            k6Var = b8.a(k9Var, dVar, i);
                        }
                    }
                    k9Var.e();
                    break;
                case 2:
                    l6Var = b8.d(k9Var, dVar);
                    break;
                case 3:
                    b7Var = k9Var.k() == 1 ? b7.LINEAR : b7.RADIAL;
                    break;
                case 4:
                    n6Var = b8.e(k9Var, dVar);
                    break;
                case 5:
                    n6Var2 = b8.e(k9Var, dVar);
                    break;
                case 6:
                    fillType = k9Var.k() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = k9Var.i();
                    break;
                default:
                    k9Var.n();
                    k9Var.o();
                    break;
            }
        }
        return new z6(str, b7Var, fillType, k6Var, l6Var, n6Var, n6Var2, null, null, z);
    }
}
