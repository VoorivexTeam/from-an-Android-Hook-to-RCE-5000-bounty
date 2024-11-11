package defpackage;

import com.airbnb.lottie.d;
import defpackage.k9;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d9 {
    private static k9.a a = k9.a.a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j7 a(k9 k9Var, d dVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                str = k9Var.m();
            } else if (a2 == 1) {
                z = k9Var.i();
            } else if (a2 != 2) {
                k9Var.o();
            } else {
                k9Var.a();
                while (k9Var.h()) {
                    x6 a3 = e8.a(k9Var, dVar);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                k9Var.d();
            }
        }
        return new j7(str, arrayList, z);
    }
}
