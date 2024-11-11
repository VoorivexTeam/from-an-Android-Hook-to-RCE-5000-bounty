package defpackage;

import defpackage.k9;

/* loaded from: classes.dex */
class i8 {
    private static final k9.a a = k9.a.a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b6 a(k9 k9Var) {
        k9Var.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                str = k9Var.m();
            } else if (a2 == 1) {
                str2 = k9Var.m();
            } else if (a2 == 2) {
                str3 = k9Var.m();
            } else if (a2 != 3) {
                k9Var.n();
                k9Var.o();
            } else {
                f = (float) k9Var.j();
            }
        }
        k9Var.e();
        return new b6(str, str2, str3, f);
    }
}
