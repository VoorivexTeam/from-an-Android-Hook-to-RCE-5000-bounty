package defpackage;

import java.util.List;

/* loaded from: classes.dex */
final class g10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static gz a(List<h10> list) {
        int size = (list.size() * 2) - 1;
        if (list.get(list.size() - 1).c() == null) {
            size--;
        }
        gz gzVar = new gz(size * 12);
        int i = 0;
        int b = list.get(0).c().b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                gzVar.d(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            h10 h10Var = list.get(i3);
            int b2 = h10Var.b().b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    gzVar.d(i);
                }
                i++;
            }
            if (h10Var.c() != null) {
                int b3 = h10Var.c().b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        gzVar.d(i);
                    }
                    i++;
                }
            }
        }
        return gzVar;
    }
}
