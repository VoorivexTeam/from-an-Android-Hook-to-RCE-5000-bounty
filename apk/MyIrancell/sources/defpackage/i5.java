package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class i5 extends m5<Integer> {
    public i5(List<v9<Integer>> list) {
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

    public int b(v9<Integer> v9Var, float f) {
        Integer num;
        Integer num2 = v9Var.b;
        if (num2 == null || v9Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = num2.intValue();
        int intValue2 = v9Var.c.intValue();
        x9<A> x9Var = this.e;
        return (x9Var == 0 || (num = (Integer) x9Var.a(v9Var.e, v9Var.f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, d(), e())) == null) ? o9.a(t9.a(f, 0.0f, 1.0f), intValue, intValue2) : num.intValue();
    }

    public int i() {
        return b(a(), c());
    }
}
