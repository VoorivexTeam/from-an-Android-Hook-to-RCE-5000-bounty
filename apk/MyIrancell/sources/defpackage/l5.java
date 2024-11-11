package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class l5 extends m5<Integer> {
    public l5(List<v9<Integer>> list) {
        super(list);
    }

    @Override // defpackage.h5
    Integer a(v9<Integer> v9Var, float f) {
        return Integer.valueOf(b(v9Var, f));
    }

    @Override // defpackage.h5
    /* bridge */ /* synthetic */ Object a(v9 v9Var, float f) {
        return a((v9<Integer>) v9Var, f);
    }

    int b(v9<Integer> v9Var, float f) {
        Integer num;
        if (v9Var.b == null || v9Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        x9<A> x9Var = this.e;
        return (x9Var == 0 || (num = (Integer) x9Var.a(v9Var.e, v9Var.f.floatValue(), v9Var.b, v9Var.c, f, d(), e())) == null) ? t9.a(v9Var.f(), v9Var.c(), f) : num.intValue();
    }

    public int i() {
        return b(a(), c());
    }
}
