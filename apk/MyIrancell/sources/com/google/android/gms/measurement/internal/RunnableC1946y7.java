package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* loaded from: classes.dex */
public final class RunnableC1946y7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f8195b;

    /* renamed from: c */
    private final /* synthetic */ zzm f8196c;

    /* renamed from: d */
    private final /* synthetic */ C1924w7 f8197d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1946y7(C1924w7 c1924w7, AtomicReference atomicReference, zzm zzmVar) {
        this.f8197d = c1924w7;
        this.f8195b = atomicReference;
        this.f8196c = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC1920w3 interfaceC1920w3;
        synchronized (this.f8195b) {
            try {
                try {
                    interfaceC1920w3 = this.f8197d.f8140d;
                } catch (RemoteException e) {
                    this.f8197d.mo9324k().m9309t().m9366a("Failed to get app instance id", e);
                    atomicReference = this.f8195b;
                }
                if (interfaceC1920w3 == null) {
                    this.f8197d.mo9324k().m9309t().m9365a("Failed to get app instance id");
                    return;
                }
                this.f8195b.set(interfaceC1920w3.mo9630b(this.f8196c));
                String str = (String) this.f8195b.get();
                if (str != null) {
                    this.f8197d.m9197p().m9735a(str);
                    this.f8197d.m9323j().f8030l.m9808a(str);
                }
                this.f8197d.m9842J();
                atomicReference = this.f8195b;
                atomicReference.notify();
            } finally {
                this.f8195b.notify();
            }
        }
    }
}
