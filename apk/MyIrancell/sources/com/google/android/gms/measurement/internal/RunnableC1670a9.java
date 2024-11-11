package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a9 */
/* loaded from: classes.dex */
public final class RunnableC1670a9 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ long f7372b;

    /* renamed from: c */
    private final /* synthetic */ C1936x8 f7373c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1670a9(C1936x8 c1936x8, long j) {
        this.f7373c = c1936x8;
        this.f7372b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7373c.m9879a(this.f7372b);
    }
}
