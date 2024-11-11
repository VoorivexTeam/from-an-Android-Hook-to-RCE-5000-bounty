package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b7 */
/* loaded from: classes.dex */
public final class RunnableC1680b7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f7402b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f7403c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1680b7(C1846p6 c1846p6, AtomicReference atomicReference) {
        this.f7403c = c1846p6;
        this.f7402b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7402b) {
            try {
                this.f7402b.set(Long.valueOf(this.f7403c.m9326m().m9477a(this.f7403c.m9198q().m9100B(), C1828o.f7816J)));
            } finally {
                this.f7402b.notify();
            }
        }
    }
}
