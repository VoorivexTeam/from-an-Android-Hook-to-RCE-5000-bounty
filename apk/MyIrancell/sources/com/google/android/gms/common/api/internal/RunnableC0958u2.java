package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.u2 */
/* loaded from: classes.dex */
public final class RunnableC0958u2 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C0946r2 f5976b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0958u2(C0946r2 c0946r2) {
        this.f5976b = c0946r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.f5976b.f5957m;
        lock.lock();
        try {
            this.f5976b.m6869h();
        } finally {
            lock2 = this.f5976b.f5957m;
            lock2.unlock();
        }
    }
}
