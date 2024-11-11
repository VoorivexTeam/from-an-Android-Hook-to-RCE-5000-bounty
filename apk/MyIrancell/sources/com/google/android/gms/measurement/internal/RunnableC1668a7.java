package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* loaded from: classes.dex */
public final class RunnableC1668a7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f7367b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f7368c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1668a7(C1846p6 c1846p6, AtomicReference atomicReference) {
        this.f7368c = c1846p6;
        this.f7367b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7367b) {
            try {
                this.f7367b.set(Integer.valueOf(this.f7368c.m9326m().m9481b(this.f7368c.m9198q().m9100B(), C1828o.f7818K)));
            } finally {
                this.f7367b.notify();
            }
        }
    }
}
