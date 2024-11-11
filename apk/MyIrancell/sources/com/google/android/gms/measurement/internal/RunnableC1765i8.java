package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i8 */
/* loaded from: classes.dex */
public final class RunnableC1765i8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ boolean f7631b;

    /* renamed from: c */
    private final /* synthetic */ boolean f7632c;

    /* renamed from: d */
    private final /* synthetic */ zzan f7633d;

    /* renamed from: e */
    private final /* synthetic */ zzm f7634e;

    /* renamed from: f */
    private final /* synthetic */ String f7635f;

    /* renamed from: g */
    private final /* synthetic */ C1924w7 f7636g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1765i8(C1924w7 c1924w7, boolean z, boolean z2, zzan zzanVar, zzm zzmVar, String str) {
        this.f7636g = c1924w7;
        this.f7631b = z;
        this.f7632c = z2;
        this.f7633d = zzanVar;
        this.f7634e = zzmVar;
        this.f7635f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        interfaceC1920w3 = this.f7636g.f8140d;
        if (interfaceC1920w3 == null) {
            this.f7636g.mo9324k().m9309t().m9365a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f7631b) {
            this.f7636g.m9868a(interfaceC1920w3, this.f7632c ? null : this.f7633d, this.f7634e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f7635f)) {
                    interfaceC1920w3.mo9622a(this.f7633d, this.f7634e);
                } else {
                    interfaceC1920w3.mo9623a(this.f7633d, this.f7635f, this.f7636g.mo9324k().m9305C());
                }
            } catch (RemoteException e) {
                this.f7636g.mo9324k().m9309t().m9366a("Failed to send event to the service", e);
            }
        }
        this.f7636g.m9842J();
    }
}
