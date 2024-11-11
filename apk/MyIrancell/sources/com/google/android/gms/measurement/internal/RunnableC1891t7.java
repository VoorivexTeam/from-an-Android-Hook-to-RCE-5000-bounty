package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* loaded from: classes.dex */
public final class RunnableC1891t7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1880s7 f8075b;

    /* renamed from: c */
    private final /* synthetic */ long f8076c;

    /* renamed from: d */
    private final /* synthetic */ C1869r7 f8077d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1891t7(C1869r7 c1869r7, C1880s7 c1880s7, long j) {
        this.f8077d = c1869r7;
        this.f8075b = c1880s7;
        this.f8076c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8077d.m9765a(this.f8075b, false, this.f8076c);
        C1869r7 c1869r7 = this.f8077d;
        c1869r7.f8006c = null;
        c1869r7.m9199r().m9866a((C1880s7) null);
    }
}
