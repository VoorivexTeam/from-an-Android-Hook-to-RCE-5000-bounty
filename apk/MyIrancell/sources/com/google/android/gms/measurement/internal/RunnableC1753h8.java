package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h8 */
/* loaded from: classes.dex */
public final class RunnableC1753h8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ boolean f7598b;

    /* renamed from: c */
    private final /* synthetic */ boolean f7599c;

    /* renamed from: d */
    private final /* synthetic */ zzv f7600d;

    /* renamed from: e */
    private final /* synthetic */ zzm f7601e;

    /* renamed from: f */
    private final /* synthetic */ zzv f7602f;

    /* renamed from: g */
    private final /* synthetic */ C1924w7 f7603g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1753h8(C1924w7 c1924w7, boolean z, boolean z2, zzv zzvVar, zzm zzmVar, zzv zzvVar2) {
        this.f7603g = c1924w7;
        this.f7598b = z;
        this.f7599c = z2;
        this.f7600d = zzvVar;
        this.f7601e = zzmVar;
        this.f7602f = zzvVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        interfaceC1920w3 = this.f7603g.f8140d;
        if (interfaceC1920w3 == null) {
            this.f7603g.mo9324k().m9309t().m9365a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f7598b) {
            this.f7603g.m9868a(interfaceC1920w3, this.f7599c ? null : this.f7600d, this.f7601e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f7602f.f8253b)) {
                    interfaceC1920w3.mo9627a(this.f7600d, this.f7601e);
                } else {
                    interfaceC1920w3.mo9626a(this.f7600d);
                }
            } catch (RemoteException e) {
                this.f7603g.mo9324k().m9309t().m9366a("Failed to send conditional user property to the service", e);
            }
        }
        this.f7603g.m9842J();
    }
}
