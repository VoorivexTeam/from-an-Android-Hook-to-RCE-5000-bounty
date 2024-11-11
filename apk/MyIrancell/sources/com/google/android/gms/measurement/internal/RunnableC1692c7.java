package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* loaded from: classes.dex */
public final class RunnableC1692c7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ boolean f7429b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f7430c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1692c7(C1846p6 c1846p6, boolean z) {
        this.f7430c = c1846p6;
        this.f7429b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7430c.m9713c(this.f7429b);
    }
}
