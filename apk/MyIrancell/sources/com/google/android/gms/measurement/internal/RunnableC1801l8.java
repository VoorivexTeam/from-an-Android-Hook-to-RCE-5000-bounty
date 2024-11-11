package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1428pc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l8 */
/* loaded from: classes.dex */
public final class RunnableC1801l8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f7742b;

    /* renamed from: c */
    private final /* synthetic */ String f7743c;

    /* renamed from: d */
    private final /* synthetic */ boolean f7744d;

    /* renamed from: e */
    private final /* synthetic */ zzm f7745e;

    /* renamed from: f */
    private final /* synthetic */ InterfaceC1428pc f7746f;

    /* renamed from: g */
    private final /* synthetic */ C1924w7 f7747g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1801l8(C1924w7 c1924w7, String str, String str2, boolean z, zzm zzmVar, InterfaceC1428pc interfaceC1428pc) {
        this.f7747g = c1924w7;
        this.f7742b = str;
        this.f7743c = str2;
        this.f7744d = z;
        this.f7745e = zzmVar;
        this.f7746f = interfaceC1428pc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        Bundle bundle = new Bundle();
        try {
            try {
                interfaceC1920w3 = this.f7747g.f8140d;
                if (interfaceC1920w3 == null) {
                    this.f7747g.mo9324k().m9309t().m9367a("Failed to get user properties; not connected to service", this.f7742b, this.f7743c);
                } else {
                    bundle = C1959z9.m9907a(interfaceC1920w3.mo9620a(this.f7742b, this.f7743c, this.f7744d, this.f7745e));
                    this.f7747g.m9842J();
                }
            } catch (RemoteException e) {
                this.f7747g.mo9324k().m9309t().m9367a("Failed to get user properties; remote exception", this.f7742b, e);
            }
        } finally {
            this.f7747g.m9322i().m9944a(this.f7746f, bundle);
        }
    }
}
