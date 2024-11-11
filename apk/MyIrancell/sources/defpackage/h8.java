package defpackage;

import com.airbnb.lottie.d;
import defpackage.k9;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h8 {
    private static final k9.a a = k9.a.a("ch", "size", "w", "style", "fFamily", "data");
    private static final k9.a b = k9.a.a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c6 a(k9 k9Var, d dVar) {
        ArrayList arrayList = new ArrayList();
        k9Var.c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                c = k9Var.m().charAt(0);
            } else if (a2 == 1) {
                d = k9Var.j();
            } else if (a2 == 2) {
                d2 = k9Var.j();
            } else if (a2 == 3) {
                str = k9Var.m();
            } else if (a2 == 4) {
                str2 = k9Var.m();
            } else if (a2 != 5) {
                k9Var.n();
                k9Var.o();
            } else {
                k9Var.c();
                while (k9Var.h()) {
                    if (k9Var.a(b) != 0) {
                        k9Var.n();
                        k9Var.o();
                    } else {
                        k9Var.a();
                        while (k9Var.h()) {
                            arrayList.add((j7) e8.a(k9Var, dVar));
                        }
                        k9Var.d();
                    }
                }
                k9Var.e();
            }
        }
        k9Var.e();
        return new c6(arrayList, c, d, d2, str, str2);
    }
}
