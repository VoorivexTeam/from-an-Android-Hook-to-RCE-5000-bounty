package ir.metrix.sdk.network;

import defpackage.fb0;
import defpackage.pa0;

/* loaded from: classes.dex */
public abstract class d<R, E> extends a<R, E> {
    @Override // ir.metrix.sdk.network.a
    public void a(pa0<R> pa0Var, fb0<R> fb0Var) {
        b((pa0<pa0<R>>) pa0Var, (pa0<R>) fb0Var.a());
    }

    public abstract void a(pa0<R> pa0Var, E e);

    @Override // ir.metrix.sdk.network.a
    public void b(pa0<R> pa0Var, fb0<E> fb0Var) {
        a(pa0Var, (pa0<R>) fb0Var.a());
    }

    public abstract void b(pa0<R> pa0Var, R r);
}
