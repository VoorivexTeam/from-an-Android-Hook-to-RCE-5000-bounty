package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class r5 extends m5<y9> {
    private final y9 i;

    public r5(List<v9<y9>> list) {
        super(list);
        this.i = new y9();
    }

    @Override // defpackage.h5
    public /* bridge */ /* synthetic */ Object a(v9 v9Var, float f) {
        return a((v9<y9>) v9Var, f);
    }

    @Override // defpackage.h5
    public y9 a(v9<y9> v9Var, float f) {
        y9 y9Var;
        y9 y9Var2;
        y9 y9Var3 = v9Var.b;
        if (y9Var3 == null || (y9Var = v9Var.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        y9 y9Var4 = y9Var3;
        y9 y9Var5 = y9Var;
        x9<A> x9Var = this.e;
        if (x9Var != 0 && (y9Var2 = (y9) x9Var.a(v9Var.e, v9Var.f.floatValue(), y9Var4, y9Var5, f, d(), e())) != null) {
            return y9Var2;
        }
        this.i.b(t9.c(y9Var4.a(), y9Var5.a(), f), t9.c(y9Var4.b(), y9Var5.b(), f));
        return this.i;
    }
}
