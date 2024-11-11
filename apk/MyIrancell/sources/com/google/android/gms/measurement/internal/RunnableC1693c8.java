package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1428pc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c8 */
/* loaded from: classes.dex */
public final class RunnableC1693c8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzan f7431b;

    /* renamed from: c */
    private final /* synthetic */ String f7432c;

    /* renamed from: d */
    private final /* synthetic */ InterfaceC1428pc f7433d;

    /* renamed from: e */
    private final /* synthetic */ C1924w7 f7434e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1693c8(C1924w7 c1924w7, zzan zzanVar, String str, InterfaceC1428pc interfaceC1428pc) {
        this.f7434e = c1924w7;
        this.f7431b = zzanVar;
        this.f7432c = str;
        this.f7433d = interfaceC1428pc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        byte[] bArr = null;
        try {
            try {
                interfaceC1920w3 = this.f7434e.f8140d;
                if (interfaceC1920w3 == null) {
                    this.f7434e.mo9324k().m9309t().m9365a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = interfaceC1920w3.mo9628a(this.f7431b, this.f7432c);
                    this.f7434e.m9842J();
                }
            } catch (RemoteException e) {
                this.f7434e.mo9324k().m9309t().m9366a("Failed to send event to the service to bundle", e);
            }
        } finally {
            this.f7434e.m9322i().m9948a(this.f7433d, bArr);
        }
    }
}
