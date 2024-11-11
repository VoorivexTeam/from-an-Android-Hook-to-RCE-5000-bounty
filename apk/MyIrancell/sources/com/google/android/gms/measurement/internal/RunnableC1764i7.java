package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* loaded from: classes.dex */
public final class RunnableC1764i7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ long f7629b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f7630c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1764i7(C1846p6 c1846p6, long j) {
        this.f7630c = c1846p6;
        this.f7629b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7630c.m9323j().f8035q.m9793a(this.f7629b);
        this.f7630c.mo9324k().m9303A().m9366a("Session timeout duration set", Long.valueOf(this.f7629b));
    }
}
