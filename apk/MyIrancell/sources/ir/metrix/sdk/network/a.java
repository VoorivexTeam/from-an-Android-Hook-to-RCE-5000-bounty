package ir.metrix.sdk.network;

import defpackage.fb0;
import defpackage.pa0;
import defpackage.ra0;

/* loaded from: classes.dex */
public abstract class a<R, E> implements ra0<R> {
    public abstract void a(pa0<R> pa0Var, fb0<R> fb0Var);

    public abstract void a(pa0<R> pa0Var, Throwable th);

    public abstract void b(pa0<R> pa0Var, fb0<E> fb0Var);

    @Override // defpackage.ra0
    public final void onFailure(pa0<R> pa0Var, Throwable th) {
        a(pa0Var, th);
    }

    @Override // defpackage.ra0
    public void onResponse(pa0<R> pa0Var, fb0<R> fb0Var) {
        try {
            if (fb0Var.b() >= 200 && fb0Var.b() < 400) {
                a(pa0Var, fb0Var);
            } else if (fb0Var.b() >= 400) {
                b(pa0Var, fb0.a(fb0Var.c(), fb0Var.g()));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a(pa0Var, th);
        }
    }
}
