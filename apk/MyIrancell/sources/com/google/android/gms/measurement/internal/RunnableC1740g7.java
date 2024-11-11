package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* loaded from: classes.dex */
public final class RunnableC1740g7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ boolean f7576b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f7577c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1740g7(C1846p6 c1846p6, boolean z) {
        this.f7577c = c1846p6;
        this.f7576b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m9411c = this.f7577c.f7550a.m9411c();
        boolean m9410b = this.f7577c.f7550a.m9410b();
        this.f7577c.f7550a.m9409a(this.f7576b);
        if (m9410b == this.f7576b) {
            this.f7577c.f7550a.mo9324k().m9304B().m9366a("Default data collection state already set to", Boolean.valueOf(this.f7576b));
        }
        if (this.f7577c.f7550a.m9411c() == m9411c || this.f7577c.f7550a.m9411c() != this.f7577c.f7550a.m9410b()) {
            this.f7577c.f7550a.mo9324k().m9314y().m9367a("Default data collection is different than actual status", Boolean.valueOf(this.f7576b), Boolean.valueOf(m9411c));
        }
        this.f7577c.m9701M();
    }
}
