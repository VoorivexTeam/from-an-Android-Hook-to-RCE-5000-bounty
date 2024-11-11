package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.d;
import defpackage.k9;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class y7 {
    private static k9.a a = k9.a.a("k", "x", "y");

    public static m6 a(k9 k9Var, d dVar) {
        ArrayList arrayList = new ArrayList();
        if (k9Var.peek() == k9.b.BEGIN_ARRAY) {
            k9Var.a();
            while (k9Var.h()) {
                arrayList.add(u8.a(k9Var, dVar));
            }
            k9Var.d();
            p8.a(arrayList);
        } else {
            arrayList.add(new v9(n8.d(k9Var, u9.a())));
        }
        return new m6(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u6<PointF, PointF> b(k9 k9Var, d dVar) {
        k9Var.c();
        m6 m6Var = null;
        j6 j6Var = null;
        j6 j6Var2 = null;
        boolean z = false;
        while (k9Var.peek() != k9.b.END_OBJECT) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                m6Var = a(k9Var, dVar);
            } else if (a2 != 1) {
                if (a2 != 2) {
                    k9Var.n();
                    k9Var.o();
                } else if (k9Var.peek() == k9.b.STRING) {
                    k9Var.o();
                    z = true;
                } else {
                    j6Var2 = b8.c(k9Var, dVar);
                }
            } else if (k9Var.peek() == k9.b.STRING) {
                k9Var.o();
                z = true;
            } else {
                j6Var = b8.c(k9Var, dVar);
            }
        }
        k9Var.e();
        if (z) {
            dVar.a("Lottie doesn't support expressions.");
        }
        return m6Var != null ? m6Var : new q6(j6Var, j6Var2);
    }
}
