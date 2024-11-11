package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p8 */
/* loaded from: classes.dex */
final class RunnableC1848p8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1920w3 f7969b;

    /* renamed from: c */
    private final /* synthetic */ ServiceConnectionC1837o8 f7970c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1848p8(ServiceConnectionC1837o8 serviceConnectionC1837o8, InterfaceC1920w3 interfaceC1920w3) {
        this.f7970c = serviceConnectionC1837o8;
        this.f7969b = interfaceC1920w3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7970c) {
            ServiceConnectionC1837o8.m9635a(this.f7970c, false);
            if (!this.f7970c.f7923c.m9855B()) {
                this.f7970c.f7923c.mo9324k().m9303A().m9365a("Connected to remote service");
                this.f7970c.f7923c.m9867a(this.f7969b);
            }
        }
    }
}
