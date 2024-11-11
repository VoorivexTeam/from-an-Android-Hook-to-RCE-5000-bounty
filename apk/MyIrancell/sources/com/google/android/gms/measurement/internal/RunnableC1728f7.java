package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* loaded from: classes.dex */
public final class RunnableC1728f7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ long f7551b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f7552c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1728f7(C1846p6 c1846p6, long j) {
        this.f7552c = c1846p6;
        this.f7551b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7552c.m9323j().f8034p.m9793a(this.f7551b);
        this.f7552c.mo9324k().m9303A().m9366a("Minimum session duration set", Long.valueOf(this.f7551b));
    }
}
