package defpackage;

import com.airbnb.lottie.d;
import defpackage.k9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class p8 {
    static k9.a a = k9.a.a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<v9<T>> a(k9 k9Var, d dVar, float f, h9<T> h9Var) {
        ArrayList arrayList = new ArrayList();
        if (k9Var.peek() == k9.b.STRING) {
            dVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        k9Var.c();
        while (k9Var.h()) {
            if (k9Var.a(a) != 0) {
                k9Var.o();
            } else if (k9Var.peek() == k9.b.BEGIN_ARRAY) {
                k9Var.a();
                if (k9Var.peek() == k9.b.NUMBER) {
                    arrayList.add(o8.a(k9Var, dVar, f, h9Var, false));
                } else {
                    while (k9Var.h()) {
                        arrayList.add(o8.a(k9Var, dVar, f, h9Var, true));
                    }
                }
                k9Var.d();
            } else {
                arrayList.add(o8.a(k9Var, dVar, f, h9Var, false));
            }
        }
        k9Var.e();
        a(arrayList);
        return arrayList;
    }

    public static <T> void a(List<? extends v9<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            v9<T> v9Var = list.get(i2);
            i2++;
            v9<T> v9Var2 = list.get(i2);
            v9Var.f = Float.valueOf(v9Var2.e);
            if (v9Var.c == null && (t = v9Var2.b) != null) {
                v9Var.c = t;
                if (v9Var instanceof o5) {
                    ((o5) v9Var).h();
                }
            }
        }
        v9<T> v9Var3 = list.get(i);
        if ((v9Var3.b == null || v9Var3.c == null) && list.size() > 1) {
            list.remove(v9Var3);
        }
    }
}
