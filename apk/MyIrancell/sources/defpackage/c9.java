package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.d;
import defpackage.k9;

/* loaded from: classes.dex */
class c9 {
    private static final k9.a a = k9.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i7 a(k9 k9Var, d dVar) {
        String str = null;
        i6 i6Var = null;
        l6 l6Var = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                str = k9Var.m();
            } else if (a2 == 1) {
                i6Var = b8.a(k9Var, dVar);
            } else if (a2 == 2) {
                l6Var = b8.d(k9Var, dVar);
            } else if (a2 == 3) {
                z = k9Var.i();
            } else if (a2 == 4) {
                i = k9Var.k();
            } else if (a2 != 5) {
                k9Var.n();
                k9Var.o();
            } else {
                z2 = k9Var.i();
            }
        }
        return new i7(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, i6Var, l6Var, z2);
    }
}
