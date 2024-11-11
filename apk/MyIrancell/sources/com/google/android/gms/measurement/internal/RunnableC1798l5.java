package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l5 */
/* loaded from: classes.dex */
public final class RunnableC1798l5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1811m6 f7738b;

    /* renamed from: c */
    private final /* synthetic */ C1774j5 f7739c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1798l5(C1774j5 c1774j5, C1811m6 c1811m6) {
        this.f7739c = c1774j5;
        this.f7738b = c1811m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7739c.m9393a(this.f7738b);
        this.f7739c.m9405a();
    }
}
