package defpackage;

import defpackage.a6;
import defpackage.k9;

/* loaded from: classes.dex */
public class f8 implements h9<a6> {
    public static final f8 a = new f8();
    private static final k9.a b = k9.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private f8() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.h9
    public a6 a(k9 k9Var, float f) {
        a6.a aVar = a6.a.CENTER;
        k9Var.c();
        a6.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (k9Var.h()) {
            switch (k9Var.a(b)) {
                case 0:
                    str = k9Var.m();
                    break;
                case 1:
                    str2 = k9Var.m();
                    break;
                case 2:
                    f2 = (float) k9Var.j();
                    break;
                case 3:
                    int k = k9Var.k();
                    if (k <= a6.a.CENTER.ordinal() && k >= 0) {
                        aVar2 = a6.a.values()[k];
                        break;
                    } else {
                        aVar2 = a6.a.CENTER;
                        break;
                    }
                case 4:
                    i = k9Var.k();
                    break;
                case 5:
                    f3 = (float) k9Var.j();
                    break;
                case 6:
                    f4 = (float) k9Var.j();
                    break;
                case 7:
                    i2 = n8.a(k9Var);
                    break;
                case 8:
                    i3 = n8.a(k9Var);
                    break;
                case 9:
                    f5 = (float) k9Var.j();
                    break;
                case 10:
                    z = k9Var.i();
                    break;
                default:
                    k9Var.n();
                    k9Var.o();
                    break;
            }
        }
        k9Var.e();
        return new a6(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}
