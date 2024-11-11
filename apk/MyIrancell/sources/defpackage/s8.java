package defpackage;

import com.airbnb.lottie.d;
import defpackage.c7;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static c7 a(k9 k9Var, d dVar) {
        char c;
        k9Var.c();
        c7.a aVar = null;
        p6 p6Var = null;
        l6 l6Var = null;
        boolean z = false;
        while (k9Var.h()) {
            String l = k9Var.l();
            int hashCode = l.hashCode();
            char c2 = 65535;
            if (hashCode == 111) {
                if (l.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 3588) {
                if (l.equals("pt")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 104433) {
                if (hashCode == 3357091 && l.equals("mode")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (l.equals("inv")) {
                    c = 3;
                }
                c = 65535;
            }
            if (c == 0) {
                String m = k9Var.m();
                int hashCode2 = m.hashCode();
                if (hashCode2 != 97) {
                    if (hashCode2 != 105) {
                        if (hashCode2 != 110) {
                            if (hashCode2 == 115 && m.equals("s")) {
                                c2 = 1;
                            }
                        } else if (m.equals("n")) {
                            c2 = 2;
                        }
                    } else if (m.equals("i")) {
                        c2 = 3;
                    }
                } else if (m.equals("a")) {
                    c2 = 0;
                }
                if (c2 != 0) {
                    if (c2 == 1) {
                        aVar = c7.a.MASK_MODE_SUBTRACT;
                    } else if (c2 == 2) {
                        aVar = c7.a.MASK_MODE_NONE;
                    } else if (c2 != 3) {
                        q9.b("Unknown mask mode " + l + ". Defaulting to Add.");
                    } else {
                        dVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                        aVar = c7.a.MASK_MODE_INTERSECT;
                    }
                }
                aVar = c7.a.MASK_MODE_ADD;
            } else if (c == 1) {
                p6Var = b8.g(k9Var, dVar);
            } else if (c == 2) {
                l6Var = b8.d(k9Var, dVar);
            } else if (c != 3) {
                k9Var.o();
            } else {
                z = k9Var.i();
            }
        }
        k9Var.e();
        return new c7(aVar, p6Var, l6Var, z);
    }
}
