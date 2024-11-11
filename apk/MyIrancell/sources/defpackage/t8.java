package defpackage;

import defpackage.d7;
import defpackage.k9;

/* loaded from: classes.dex */
class t8 {
    private static final k9.a a = k9.a.a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d7 a(k9 k9Var) {
        String str = null;
        d7.a aVar = null;
        boolean z = false;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                str = k9Var.m();
            } else if (a2 == 1) {
                aVar = d7.a.forId(k9Var.k());
            } else if (a2 != 2) {
                k9Var.n();
                k9Var.o();
            } else {
                z = k9Var.i();
            }
        }
        return new d7(str, aVar, z);
    }
}
