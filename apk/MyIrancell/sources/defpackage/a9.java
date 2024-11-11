package defpackage;

import defpackage.k9;

/* loaded from: classes.dex */
public class a9 implements h9<y9> {
    public static final a9 a = new a9();

    private a9() {
    }

    @Override // defpackage.h9
    public y9 a(k9 k9Var, float f) {
        boolean z = k9Var.peek() == k9.b.BEGIN_ARRAY;
        if (z) {
            k9Var.a();
        }
        float j = (float) k9Var.j();
        float j2 = (float) k9Var.j();
        while (k9Var.h()) {
            k9Var.o();
        }
        if (z) {
            k9Var.d();
        }
        return new y9((j / 100.0f) * f, (j2 / 100.0f) * f);
    }
}
