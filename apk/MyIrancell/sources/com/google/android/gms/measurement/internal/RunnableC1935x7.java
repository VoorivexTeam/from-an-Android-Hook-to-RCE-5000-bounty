package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* loaded from: classes.dex */
public final class RunnableC1935x7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ boolean f8173b;

    /* renamed from: c */
    private final /* synthetic */ zzkq f8174c;

    /* renamed from: d */
    private final /* synthetic */ zzm f8175d;

    /* renamed from: e */
    private final /* synthetic */ C1924w7 f8176e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1935x7(C1924w7 c1924w7, boolean z, zzkq zzkqVar, zzm zzmVar) {
        this.f8176e = c1924w7;
        this.f8173b = z;
        this.f8174c = zzkqVar;
        this.f8175d = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        interfaceC1920w3 = this.f8176e.f8140d;
        if (interfaceC1920w3 == null) {
            this.f8176e.mo9324k().m9309t().m9365a("Discarding data. Failed to set user property");
        } else {
            this.f8176e.m9868a(interfaceC1920w3, this.f8173b ? null : this.f8174c, this.f8175d);
            this.f8176e.m9842J();
        }
    }
}
