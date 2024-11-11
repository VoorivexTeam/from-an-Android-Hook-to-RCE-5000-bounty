package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z6 */
/* loaded from: classes.dex */
public final class RunnableC1956z6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f8208b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f8209c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1956z6(C1846p6 c1846p6, AtomicReference atomicReference) {
        this.f8209c = c1846p6;
        this.f8208b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8208b) {
            try {
                this.f8208b.set(this.f8209c.m9326m().m9490g(this.f8209c.m9198q().m9100B()));
            } finally {
                this.f8208b.notify();
            }
        }
    }
}
