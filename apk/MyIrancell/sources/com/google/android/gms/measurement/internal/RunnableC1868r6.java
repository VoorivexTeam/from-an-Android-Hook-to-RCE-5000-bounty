package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r6 */
/* loaded from: classes.dex */
public final class RunnableC1868r6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f8004b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f8005c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1868r6(C1846p6 c1846p6, AtomicReference atomicReference) {
        this.f8005c = c1846p6;
        this.f8004b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8004b) {
            try {
                this.f8004b.set(Boolean.valueOf(this.f8005c.m9326m().m9489f(this.f8005c.m9198q().m9100B())));
            } finally {
                this.f8004b.notify();
            }
        }
    }
}
