package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a8 */
/* loaded from: classes.dex */
public final class RunnableC1669a8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzm f7369b;

    /* renamed from: c */
    private final /* synthetic */ boolean f7370c;

    /* renamed from: d */
    private final /* synthetic */ C1924w7 f7371d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1669a8(C1924w7 c1924w7, zzm zzmVar, boolean z) {
        this.f7371d = c1924w7;
        this.f7369b = zzmVar;
        this.f7370c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        interfaceC1920w3 = this.f7371d.f8140d;
        if (interfaceC1920w3 == null) {
            this.f7371d.mo9324k().m9309t().m9365a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            interfaceC1920w3.mo9632d(this.f7369b);
            if (this.f7370c) {
                this.f7371d.m9201t().m9093D();
            }
            this.f7371d.m9868a(interfaceC1920w3, (AbstractSafeParcelable) null, this.f7369b);
            this.f7371d.m9842J();
        } catch (RemoteException e) {
            this.f7371d.mo9324k().m9309t().m9366a("Failed to send app launch to the service", e);
        }
    }
}
