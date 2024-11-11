package p000;

import java.util.List;

/* loaded from: classes.dex */
final class g10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2531gz m11865a(List<h10> list) {
        int size = (list.size() * 2) - 1;
        if (list.get(list.size() - 1).m12083c() == null) {
            size--;
        }
        C2531gz c2531gz = new C2531gz(size * 12);
        int i = 0;
        int m3269b = list.get(0).m12083c().m3269b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & m3269b) != 0) {
                c2531gz.m12054d(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            h10 h10Var = list.get(i3);
            int m3269b2 = h10Var.m12082b().m3269b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & m3269b2) != 0) {
                    c2531gz.m12054d(i);
                }
                i++;
            }
            if (h10Var.m12083c() != null) {
                int m3269b3 = h10Var.m12083c().m3269b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & m3269b3) != 0) {
                        c2531gz.m12054d(i);
                    }
                    i++;
                }
            }
        }
        return c2531gz;
    }
}
