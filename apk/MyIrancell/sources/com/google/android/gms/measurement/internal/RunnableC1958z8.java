package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z8 */
/* loaded from: classes.dex */
final class RunnableC1958z8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ long f8212b;

    /* renamed from: c */
    private final /* synthetic */ C1936x8 f8213c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1958z8(C1936x8 c1936x8, long j) {
        this.f8213c = c1936x8;
        this.f8212b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8213c.m9883b(this.f8212b);
    }
}
