package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
/* loaded from: classes.dex */
abstract class AbstractRunnableC0932o0 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C0891e0 f5904b;

    private AbstractRunnableC0932o0(C0891e0 c0891e0) {
        this.f5904b = c0891e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractRunnableC0932o0(C0891e0 c0891e0, RunnableC0886d0 runnableC0886d0) {
        this(c0891e0);
    }

    /* renamed from: a */
    protected abstract void mo6690a();

    @Override // java.lang.Runnable
    public void run() {
        Lock lock;
        Lock lock2;
        C0976z0 c0976z0;
        lock = this.f5904b.f5775b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    mo6690a();
                }
            } catch (RuntimeException e) {
                c0976z0 = this.f5904b.f5774a;
                c0976z0.m6934a(e);
            }
        } finally {
            lock2 = this.f5904b.f5775b;
            lock2.unlock();
        }
    }
}
