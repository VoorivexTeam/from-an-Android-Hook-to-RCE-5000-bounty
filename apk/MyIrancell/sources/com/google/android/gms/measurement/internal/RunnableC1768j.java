package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j */
/* loaded from: classes.dex */
public final class RunnableC1768j implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1751h6 f7640b;

    /* renamed from: c */
    private final /* synthetic */ AbstractC1732g f7641c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1768j(AbstractC1732g abstractC1732g, InterfaceC1751h6 interfaceC1751h6) {
        this.f7641c = abstractC1732g;
        this.f7640b = interfaceC1751h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7640b.mo9317d();
        if (C1791ka.m9464a()) {
            this.f7640b.mo9320g().m9344a(this);
            return;
        }
        boolean m9331b = this.f7641c.m9331b();
        AbstractC1732g.m9327a(this.f7641c, 0L);
        if (m9331b) {
            this.f7641c.mo9329a();
        }
    }
}
