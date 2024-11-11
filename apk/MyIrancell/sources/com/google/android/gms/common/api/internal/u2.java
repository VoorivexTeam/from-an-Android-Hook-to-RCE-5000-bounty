package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u2 implements Runnable {
    private final /* synthetic */ r2 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u2(r2 r2Var) {
        this.b = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.b.m;
        lock.lock();
        try {
            this.b.h();
        } finally {
            lock2 = this.b.m;
            lock2.unlock();
        }
    }
}
