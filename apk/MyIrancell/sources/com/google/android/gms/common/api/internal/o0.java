package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
abstract class o0 implements Runnable {
    private final /* synthetic */ e0 b;

    private o0(e0 e0Var) {
        this.b = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o0(e0 e0Var, d0 d0Var) {
        this(e0Var);
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public void run() {
        Lock lock;
        Lock lock2;
        z0 z0Var;
        lock = this.b.b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                z0Var = this.b.a;
                z0Var.a(e);
            }
        } finally {
            lock2 = this.b.b;
            lock2.unlock();
        }
    }
}
