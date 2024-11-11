package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class j5 extends m5<Float> {
    public j5(List<v9<Float>> list) {
        super(list);
    }

    @Override // defpackage.h5
    Float a(v9<Float> v9Var, float f) {
        return Float.valueOf(b(v9Var, f));
    }

    @Override // defpackage.h5
    /* bridge */ /* synthetic */ Object a(v9 v9Var, float f) {
        return a((v9<Float>) v9Var, f);
    }

    float b(v9<Float> v9Var, float f) {
        Float f2;
        if (v9Var.b == null || v9Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        x9<A> x9Var = this.e;
        return (x9Var == 0 || (f2 = (Float) x9Var.a(v9Var.e, v9Var.f.floatValue(), v9Var.b, v9Var.c, f, d(), e())) == null) ? t9.c(v9Var.e(), v9Var.b(), f) : f2.floatValue();
    }

    public float i() {
        return b(a(), c());
    }
}
