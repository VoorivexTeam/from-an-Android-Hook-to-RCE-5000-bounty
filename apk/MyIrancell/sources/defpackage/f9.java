package defpackage;

import com.airbnb.lottie.d;
import defpackage.k9;
import defpackage.l7;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f9 {
    private static k9.a a = k9.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final k9.a b = k9.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l7 a(k9 k9Var, d dVar) {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        j6 j6Var = null;
        i6 i6Var = null;
        l6 l6Var = null;
        j6 j6Var2 = null;
        l7.b bVar = null;
        l7.c cVar = null;
        float f = 0.0f;
        boolean z = false;
        while (k9Var.h()) {
            int i = 1;
            switch (k9Var.a(a)) {
                case 0:
                    str = k9Var.m();
                    break;
                case 1:
                    i6Var = b8.a(k9Var, dVar);
                    break;
                case 2:
                    j6Var2 = b8.c(k9Var, dVar);
                    break;
                case 3:
                    l6Var = b8.d(k9Var, dVar);
                    break;
                case 4:
                    bVar = l7.b.values()[k9Var.k() - 1];
                    break;
                case 5:
                    cVar = l7.c.values()[k9Var.k() - 1];
                    break;
                case 6:
                    f = (float) k9Var.j();
                    break;
                case 7:
                    z = k9Var.i();
                    break;
                case 8:
                    k9Var.a();
                    while (k9Var.h()) {
                        k9Var.c();
                        String str2 = null;
                        j6 j6Var3 = null;
                        while (k9Var.h()) {
                            int a2 = k9Var.a(b);
                            if (a2 == 0) {
                                str2 = k9Var.m();
                            } else if (a2 != i) {
                                k9Var.n();
                                k9Var.o();
                            } else {
                                j6Var3 = b8.c(k9Var, dVar);
                            }
                        }
                        k9Var.e();
                        int hashCode = str2.hashCode();
                        if (hashCode == 100) {
                            if (str2.equals("d")) {
                                c = 1;
                            }
                            c = 65535;
                        } else if (hashCode != 103) {
                            if (hashCode == 111 && str2.equals("o")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (str2.equals("g")) {
                                c = 2;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            j6Var = j6Var3;
                        } else if (c == 1 || c == 2) {
                            dVar.a(true);
                            arrayList.add(j6Var3);
                        }
                        i = 1;
                    }
                    k9Var.d();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                default:
                    k9Var.o();
                    break;
            }
        }
        return new l7(str, j6Var, arrayList, i6Var, l6Var, j6Var2, bVar, cVar, f, z);
    }
}
