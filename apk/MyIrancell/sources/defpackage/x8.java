package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.d;
import defpackage.e7;
import defpackage.k9;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x8 {
    private static final k9.a a = k9.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e7 a(k9 k9Var, d dVar) {
        String str = null;
        e7.a aVar = null;
        j6 j6Var = null;
        u6<PointF, PointF> u6Var = null;
        j6 j6Var2 = null;
        j6 j6Var3 = null;
        j6 j6Var4 = null;
        j6 j6Var5 = null;
        j6 j6Var6 = null;
        boolean z = false;
        while (k9Var.h()) {
            switch (k9Var.a(a)) {
                case 0:
                    str = k9Var.m();
                    break;
                case 1:
                    aVar = e7.a.forValue(k9Var.k());
                    break;
                case 2:
                    j6Var = b8.a(k9Var, dVar, false);
                    break;
                case 3:
                    u6Var = y7.b(k9Var, dVar);
                    break;
                case 4:
                    j6Var2 = b8.a(k9Var, dVar, false);
                    break;
                case 5:
                    j6Var4 = b8.c(k9Var, dVar);
                    break;
                case 6:
                    j6Var6 = b8.a(k9Var, dVar, false);
                    break;
                case 7:
                    j6Var3 = b8.c(k9Var, dVar);
                    break;
                case 8:
                    j6Var5 = b8.a(k9Var, dVar, false);
                    break;
                case 9:
                    z = k9Var.i();
                    break;
                default:
                    k9Var.n();
                    k9Var.o();
                    break;
            }
        }
        return new e7(str, aVar, j6Var, u6Var, j6Var2, j6Var3, j6Var4, j6Var5, j6Var6, z);
    }
}
