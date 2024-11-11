package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
/* loaded from: classes.dex */
final class RunnableC1825n8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1920w3 f7794b;

    /* renamed from: c */
    private final /* synthetic */ ServiceConnectionC1837o8 f7795c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1825n8(ServiceConnectionC1837o8 serviceConnectionC1837o8, InterfaceC1920w3 interfaceC1920w3) {
        this.f7795c = serviceConnectionC1837o8;
        this.f7794b = interfaceC1920w3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7795c) {
            ServiceConnectionC1837o8.m9635a(this.f7795c, false);
            if (!this.f7795c.f7923c.m9855B()) {
                this.f7795c.f7923c.mo9324k().m9304B().m9365a("Connected to service");
                this.f7795c.f7923c.m9867a(this.f7794b);
            }
        }
    }
}
