package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
/* loaded from: classes.dex */
final class RunnableC1912v6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1787k6 f8117b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f8118c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1912v6(C1846p6 c1846p6, InterfaceC1787k6 interfaceC1787k6) {
        this.f8118c = c1846p6;
        this.f8117b = interfaceC1787k6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8118c.m9733a(this.f8117b);
    }
}
