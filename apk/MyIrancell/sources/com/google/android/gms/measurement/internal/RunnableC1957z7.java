package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* loaded from: classes.dex */
public final class RunnableC1957z7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzm f8210b;

    /* renamed from: c */
    private final /* synthetic */ C1924w7 f8211c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1957z7(C1924w7 c1924w7, zzm zzmVar) {
        this.f8211c = c1924w7;
        this.f8210b = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        interfaceC1920w3 = this.f8211c.f8140d;
        if (interfaceC1920w3 == null) {
            this.f8211c.mo9324k().m9309t().m9365a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            interfaceC1920w3.mo9631c(this.f8210b);
        } catch (RemoteException e) {
            this.f8211c.mo9324k().m9309t().m9366a("Failed to reset data on the service: remote exception", e);
        }
        this.f8211c.m9842J();
    }
}
