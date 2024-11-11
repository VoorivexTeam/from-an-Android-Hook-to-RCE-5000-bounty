package ir.metrix.sdk.network;

import p000.fb0;
import p000.pa0;

/* renamed from: ir.metrix.sdk.network.d */
/* loaded from: classes.dex */
public abstract class AbstractC2635d<R, E> extends AbstractC2632a<R, E> {
    @Override // ir.metrix.sdk.network.AbstractC2632a
    /* renamed from: a */
    public void mo12511a(pa0<R> pa0Var, fb0<R> fb0Var) {
        mo12671b((pa0<pa0<R>>) pa0Var, (pa0<R>) fb0Var.m11751a());
    }

    /* renamed from: a */
    public abstract void mo12670a(pa0<R> pa0Var, E e);

    @Override // ir.metrix.sdk.network.AbstractC2632a
    /* renamed from: b */
    public void mo12513b(pa0<R> pa0Var, fb0<E> fb0Var) {
        mo12670a(pa0Var, (pa0<R>) fb0Var.m11751a());
    }

    /* renamed from: b */
    public abstract void mo12671b(pa0<R> pa0Var, R r);
}
