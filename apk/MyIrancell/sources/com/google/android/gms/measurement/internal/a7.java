package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a7 implements Runnable {
    private final /* synthetic */ AtomicReference b;
    private final /* synthetic */ p6 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a7(p6 p6Var, AtomicReference atomicReference) {
        this.c = p6Var;
        this.b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                this.b.set(Integer.valueOf(this.c.m().b(this.c.q().B(), o.K)));
            } finally {
                this.b.notify();
            }
        }
    }
}
