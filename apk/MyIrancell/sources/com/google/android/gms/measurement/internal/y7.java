package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y7 implements Runnable {
    private final /* synthetic */ AtomicReference b;
    private final /* synthetic */ zzm c;
    private final /* synthetic */ w7 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y7(w7 w7Var, AtomicReference atomicReference, zzm zzmVar) {
        this.d = w7Var;
        this.b = atomicReference;
        this.c = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        w3 w3Var;
        synchronized (this.b) {
            try {
                try {
                    w3Var = this.d.d;
                } catch (RemoteException e) {
                    this.d.k().t().a("Failed to get app instance id", e);
                    atomicReference = this.b;
                }
                if (w3Var == null) {
                    this.d.k().t().a("Failed to get app instance id");
                    return;
                }
                this.b.set(w3Var.b(this.c));
                String str = (String) this.b.get();
                if (str != null) {
                    this.d.p().a(str);
                    this.d.j().l.a(str);
                }
                this.d.J();
                atomicReference = this.b;
                atomicReference.notify();
            } finally {
                this.b.notify();
            }
        }
    }
}
