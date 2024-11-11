package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* loaded from: classes.dex */
final class RunnableC1690c5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1774j5 f7422b;

    /* renamed from: c */
    private final /* synthetic */ C1725f4 f7423c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1690c5(C1954z4 c1954z4, C1774j5 c1774j5, C1725f4 c1725f4) {
        this.f7422b = c1774j5;
        this.f7423c = c1725f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7422b.m9423t() == null) {
            this.f7423c.m9309t().m9365a("Install Referrer Reporter is null");
        } else {
            this.f7422b.m9423t().m9889a();
        }
    }
}
