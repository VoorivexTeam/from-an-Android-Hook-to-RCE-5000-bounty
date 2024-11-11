package ir.metrix.sdk.network;

import p000.fb0;
import p000.pa0;
import p000.ra0;

/* renamed from: ir.metrix.sdk.network.a */
/* loaded from: classes.dex */
public abstract class AbstractC2632a<R, E> implements ra0<R> {
    /* renamed from: a */
    public abstract void mo12511a(pa0<R> pa0Var, fb0<R> fb0Var);

    /* renamed from: a */
    public abstract void mo12512a(pa0<R> pa0Var, Throwable th);

    /* renamed from: b */
    public abstract void mo12513b(pa0<R> pa0Var, fb0<E> fb0Var);

    @Override // p000.ra0
    public final void onFailure(pa0<R> pa0Var, Throwable th) {
        mo12512a(pa0Var, th);
    }

    @Override // p000.ra0
    public void onResponse(pa0<R> pa0Var, fb0<R> fb0Var) {
        try {
            if (fb0Var.m11752b() >= 200 && fb0Var.m11752b() < 400) {
                mo12511a(pa0Var, fb0Var);
            } else if (fb0Var.m11752b() >= 400) {
                mo12513b(pa0Var, fb0.m11749a(fb0Var.m11753c(), fb0Var.m11757g()));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            mo12512a(pa0Var, th);
        }
    }
}
