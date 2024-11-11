package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f8 */
/* loaded from: classes.dex */
public final class RunnableC1729f8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzm f7553b;

    /* renamed from: c */
    private final /* synthetic */ C1924w7 f7554c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1729f8(C1924w7 c1924w7, zzm zzmVar) {
        this.f7554c = c1924w7;
        this.f7553b = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        interfaceC1920w3 = this.f7554c.f8140d;
        if (interfaceC1920w3 == null) {
            this.f7554c.mo9324k().m9309t().m9365a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            interfaceC1920w3.mo9625a(this.f7553b);
            this.f7554c.m9842J();
        } catch (RemoteException e) {
            this.f7554c.mo9324k().m9309t().m9366a("Failed to send measurementEnabled to the service", e);
        }
    }
}
