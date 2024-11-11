package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public class w5<K, A> extends h5<K, A> {
    private final A i;

    public w5(x9<A> x9Var) {
        this(x9Var, null);
    }

    public w5(x9<A> x9Var, A a) {
        super(Collections.emptyList());
        new w9();
        a(x9Var);
        this.i = a;
    }

    @Override // defpackage.h5
    A a(v9<K> v9Var, float f) {
        return f();
    }

    @Override // defpackage.h5
    float b() {
        return 1.0f;
    }

    @Override // defpackage.h5
    public A f() {
        x9<A> x9Var = this.e;
        A a = this.i;
        return x9Var.a(0.0f, 0.0f, a, a, e(), e(), e());
    }

    @Override // defpackage.h5
    public void g() {
        if (this.e != null) {
            super.g();
        }
    }
}
