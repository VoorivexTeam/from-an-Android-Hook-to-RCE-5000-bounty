package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class y0 {
    private final w0 a;

    /* JADX INFO: Access modifiers changed from: protected */
    public y0(w0 w0Var) {
        this.a = w0Var;
    }

    protected abstract void a();

    public final void a(z0 z0Var) {
        Lock lock;
        Lock lock2;
        w0 w0Var;
        lock = z0Var.a;
        lock.lock();
        try {
            w0Var = z0Var.k;
            if (w0Var == this.a) {
                a();
            }
        } finally {
            lock2 = z0Var.a;
            lock2.unlock();
        }
    }
}
