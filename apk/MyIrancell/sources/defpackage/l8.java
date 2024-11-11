package defpackage;

import com.airbnb.lottie.d;
import defpackage.k9;
import defpackage.l7;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l8 {
    private static k9.a a = k9.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final k9.a b = k9.a.a("p", "k");
    private static final k9.a c = k9.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a7 a(k9 k9Var, d dVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        b7 b7Var = null;
        k6 k6Var = null;
        l6 l6Var = null;
        n6 n6Var = null;
        n6 n6Var2 = null;
        j6 j6Var = null;
        l7.b bVar = null;
        l7.c cVar = null;
        float f = 0.0f;
        j6 j6Var2 = null;
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
                        k6 k6Var2 = k6Var;
                        if (a2 == 0) {
                            i = k9Var.k();
                        } else if (a2 != 1) {
                            k9Var.n();
                            k9Var.o();
                        } else {
                            k6Var = b8.a(k9Var, dVar, i);
                        }
                        k6Var = k6Var2;
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
                    j6Var = b8.c(k9Var, dVar);
                    break;
                case 7:
                    bVar = l7.b.values()[k9Var.k() - 1];
                    break;
                case 8:
                    cVar = l7.c.values()[k9Var.k() - 1];
                    break;
                case 9:
                    f = (float) k9Var.j();
                    break;
                case 10:
                    z = k9Var.i();
                    break;
                case 11:
                    k9Var.a();
                    while (k9Var.h()) {
                        k9Var.c();
                        String str2 = null;
                        j6 j6Var3 = null;
                        while (k9Var.h()) {
                            int a3 = k9Var.a(c);
                            j6 j6Var4 = j6Var2;
                            if (a3 != 0) {
                                if (a3 != 1) {
                                    k9Var.n();
                                    k9Var.o();
                                } else {
                                    j6Var3 = b8.c(k9Var, dVar);
                                }
                                j6Var2 = j6Var4;
                            } else {
                                str2 = k9Var.m();
                            }
                        }
                        j6 j6Var5 = j6Var2;
                        k9Var.e();
                        if (str2.equals("o")) {
                            j6Var2 = j6Var3;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                dVar.a(true);
                                arrayList.add(j6Var3);
                            }
                            j6Var2 = j6Var5;
                        }
                    }
                    j6 j6Var6 = j6Var2;
                    k9Var.d();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    j6Var2 = j6Var6;
                    break;
                default:
                    k9Var.n();
                    k9Var.o();
                    break;
            }
        }
        return new a7(str, b7Var, k6Var, l6Var, n6Var, n6Var2, j6Var, bVar, cVar, f, arrayList, j6Var2, z);
    }
}
