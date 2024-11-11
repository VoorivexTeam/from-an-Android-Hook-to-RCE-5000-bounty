package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e8 */
/* loaded from: classes.dex */
public final class RunnableC1717e8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1880s7 f7519b;

    /* renamed from: c */
    private final /* synthetic */ C1924w7 f7520c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1717e8(C1924w7 c1924w7, C1880s7 c1880s7) {
        this.f7520c = c1924w7;
        this.f7519b = c1880s7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        long j;
        String str;
        String str2;
        String packageName;
        interfaceC1920w3 = this.f7520c.f8140d;
        if (interfaceC1920w3 == null) {
            this.f7520c.mo9324k().m9309t().m9365a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f7519b == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f7520c.mo9325l().getPackageName();
            } else {
                j = this.f7519b.f8056c;
                str = this.f7519b.f8054a;
                str2 = this.f7519b.f8055b;
                packageName = this.f7520c.mo9325l().getPackageName();
            }
            interfaceC1920w3.mo9621a(j, str, str2, packageName);
            this.f7520c.m9842J();
        } catch (RemoteException e) {
            this.f7520c.mo9324k().m9309t().m9366a("Failed to send current screen to the service", e);
        }
    }
}
