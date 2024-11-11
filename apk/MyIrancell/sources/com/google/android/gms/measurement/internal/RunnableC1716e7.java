package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e7 */
/* loaded from: classes.dex */
public final class RunnableC1716e7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f7517b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f7518c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1716e7(C1846p6 c1846p6, AtomicReference atomicReference) {
        this.f7518c = c1846p6;
        this.f7517b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7517b) {
            try {
                this.f7517b.set(Double.valueOf(this.f7518c.m9326m().m9483c(this.f7518c.m9198q().m9100B(), C1828o.f7820L)));
            } finally {
                this.f7517b.notify();
            }
        }
    }
}
